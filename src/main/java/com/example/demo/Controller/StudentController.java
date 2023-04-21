package com.example.demo.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Service.Servicemethod;
import com.example.demo.entity.StudentEntity;

@RestController
@CrossOrigin
@RequestMapping(path="/student")
public class StudentController {
	@Autowired
	private Servicemethod studentService;
	@PostMapping()
	public ResponseEntity<String> savestudent(@RequestBody StudentEntity student) {
		String message=studentService.saveStudent(student);
		System.out.println("Sucefully Saved");
		return new ResponseEntity<>(message,HttpStatus.CREATED);
		}	
			
	@GetMapping()
	public ResponseEntity<List<StudentEntity>> allStudentData(){
		List<StudentEntity> stud=studentService.getUserList();
		return new ResponseEntity<List<StudentEntity>>(stud,HttpStatus.OK);
		
	}
	
	 
	
}
