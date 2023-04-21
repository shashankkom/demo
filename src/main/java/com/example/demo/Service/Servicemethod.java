package com.example.demo.Service;

import java.util.List;



import org.springframework.stereotype.Component;

import com.example.demo.entity.StudentEntity;



@Component
public interface Servicemethod {
	 public String saveStudent(StudentEntity student);
		 public List<StudentEntity> getUserList();

}
