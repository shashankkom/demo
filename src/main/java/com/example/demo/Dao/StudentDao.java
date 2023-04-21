package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentEntity;

public interface StudentDao extends JpaRepository<StudentEntity , Integer> {

}
