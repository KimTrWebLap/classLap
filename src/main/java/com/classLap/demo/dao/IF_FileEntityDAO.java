package com.classLap.demo.dao;

import java.util.List;

import com.classLap.demo.vo.FileEntity;

public interface IF_FileEntityDAO {
	
	public void insert(FileEntity fileEntity) throws Exception;
	public List<FileEntity> selectAll(Long id) throws Exception; 

}
