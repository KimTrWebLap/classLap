package com.classLap.demo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classLap.demo.vo.FileEntity;

@Repository
public class FileEntityDAOImpl implements IF_FileEntityDAO{
	
	@Autowired
	SqlSession sqlsession;
	
	public static String MapperQuery="com.classLap.demo.dao.IF_FileEntityDAO";

	@Override
	public void insert(FileEntity fileEntity) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.insert(MapperQuery+".insert", fileEntity);
	}

	@Override
	public List<FileEntity> selectAll(Long id) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectList(MapperQuery+".selectall", id);
	}

}
