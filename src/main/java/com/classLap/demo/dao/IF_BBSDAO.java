package com.classLap.demo.dao;

import java.util.List;

import com.classLap.demo.vo.BBSVO;

public interface IF_BBSDAO {
	
	public void insert(BBSVO bbsvo) throws Exception;
	public List<BBSVO> selectAll() throws Exception;

}
