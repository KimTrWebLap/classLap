package com.classLap.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.classLap.demo.dao.IF_FileEntityDAO;
import com.classLap.demo.service.FileService;
import com.classLap.demo.vo.FileEntity;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class FileTest {

	private final FileService fileService;

	@Value("${file.dir}")
    private String fileDir;

	@Autowired
	public FileTest(FileService fileService) {
		this.fileService = fileService;
	}
	@Autowired
	private IF_FileEntityDAO fileEntitydao;

	@GetMapping("/upload")
	public String bbs() {
		System.out.println("bbb");
		return "filewr";
	}

	@PostMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("files") List<MultipartFile> files)
			throws Exception {
		fileService.saveFile(file);
		System.out.println("aaa");
		for (MultipartFile multipartFile : files) {
			fileService.saveFile(multipartFile);
		}

		return "redirect:/";
	}

	@GetMapping("/fileview")
	public String view(Model model) throws Exception {

		List<FileEntity> files = fileEntitydao.selectAll(14L);
		model.addAttribute("all",files);
		return "fileview";
	}

	// 이미지 출력
	@GetMapping("/images/{fileId}")  //cors에러??
	@ResponseBody
	public FileSystemResource downloadImage(@PathVariable("fileId") Long id, Model model, HttpServletResponse response) throws IOException {

		// FileEntity file = fileRepository.findById(id).orElse(null);
		System.out.println(id);
		File file = new File(fileDir + "/" + id);
		response.setContentType("application/download; utf-8");
		response.setHeader("Content-Disposition", "attachment; filename=" + id);
		return new FileSystemResource(file);
	//	return new UrlResource("file:" + id);
	//	return null;
	}


	// 첨부 파일 다운로드
	@GetMapping("/attach/{id}")
	public ResponseEntity<Resource> downloadAttach(@PathVariable Long id) throws Exception {

		// FileEntity file = fileRepository.findById(id).orElse(null);
	//	FileEntity file = fileEntitydao.selectAll(id);

	//	UrlResource resource = new UrlResource("file:" + file.getSavedPath());

	//	String encodedFileName = UriUtils.encode(file.getOrgNm(), StandardCharsets.UTF_8);

		// 파일 다운로드 대화상자가 뜨도록 하는 헤더를 설정해주는 것
		// Content-Disposition 헤더에 attachment; filename="업로드 파일명" 값을 준다.
	//	String contentDisposition = "attachment; filename=\"" + encodedFileName + "\"";

	//	return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition).body(resource);
		return null;
	}

}
