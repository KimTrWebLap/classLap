package com.classLap.demo.vo;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FileEntity {
	long id;
	String originName;
	String saveName;
	String savePath;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public FileEntity(String originName, String saveName, String savePath) {
		this.originName = originName;
		this.saveName = saveName;
		this.savePath = savePath;
	}
}
