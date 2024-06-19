package com.classLap.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classLap.demo.dao.IF_BBSDAO;
import com.classLap.demo.vo.BBSVO;

@Service
public class BBSserviceImpl implements IF_BBSservice{

	@Autowired
	IF_BBSDAO bbsdao;
	
	@Override
	public void insert(BBSVO bbsvo) throws Exception {
		// TODO Auto-generated method stub
		bbsdao.insert(bbsvo);
	}

	@Override
	public List<BBSVO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return bbsdao.selectAll();
	}

}
