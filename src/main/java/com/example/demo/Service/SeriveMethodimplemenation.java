package com.example.demo.Service;

import java.util.List;




import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.entity.StudentEntity;




@Service
public class SeriveMethodimplemenation implements Servicemethod{
	@Autowired
	private StudentDao studentdao;
	
	@Override
	public String saveStudent(StudentEntity student) {
		studentdao.save(student);
		return "StudentCreated";
	}

	
	

	
	

	@Override
	public List<StudentEntity> getUserList() {
		return studentdao.findAll();
	}

}
