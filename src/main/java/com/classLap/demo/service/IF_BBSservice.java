package com.classLap.demo.service;

import java.util.List;

import com.classLap.demo.vo.BBSVO;

public interface IF_BBSservice {
	public void insert(BBSVO bbsvo) throws Exception;
	public List<BBSVO> selectAll() throws Exception;

}
