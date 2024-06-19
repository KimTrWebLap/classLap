package com.classLap.demo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classLap.demo.vo.BBSVO;
@Repository
public class BBSDAOImpl implements IF_BBSDAO{
	@Autowired
	SqlSession sqlsession;
	
	public static String MapperQuery="com.classLap.demo.dao.IF_BBSDAO";
	@Override
	public void insert(BBSVO bbsvo) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.insert(MapperQuery+".insertone",bbsvo);
	}
	@Override
	public List<BBSVO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectList(MapperQuery+".selectall");
	}

}
