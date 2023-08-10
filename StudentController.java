package com.poornesh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poornesh.been.Student;

@RestController
public class StudentController {

	public static List<Student> student=new ArrayList<Student>();
	public StudentController() {
		student.add(new Student("king","kochar"));
		student.add(new Student("keerthan","gowda"));
		student.add(new Student("dayanda","gouda"));
		student.add(new Student("jithin","R"));
		student.add(new Student("poornesh","kulal"));
	}
	@GetMapping("/student")
	public List<Student> getStudent(){
		return student;
	}
	@GetMapping("/student/{firstname}/{lastname}")
	public Student studentPathVariable(@PathVariable ("firstname") String firstname,@PathVariable("lastname") String lastname){
		return new Student(firstname,lastname);
	}
	@GetMapping("student/query")
	public Student studentQueryParam(@RequestParam(name="firstname") String firstname,@RequestParam(name="lastname") String lastname ) {
		return new Student(firstname,lastname);
	}
	@PostMapping("/student")
	public void addStudent(@RequestBody Student students) {
		student.add(students);
		
	}
	@PutMapping("/student/{firstname}")
	public void updateStudent(@PathVariable String firstname, @RequestBody Student students) {
	    for (Student stud : student) {
	        if (stud.getFirstname().equals(firstname)) {
	            stud.setFirstname(students.getFirstname());
	            stud.setLastname(students.getLastname());
	            break;
	        }
	    }
	}
	@DeleteMapping("/student/{firstname}")
	public void deleteStudent(@PathVariable String firstname) {
	    for (Student stud : student) {
	        if (stud.getFirstname().equals(firstname)) {
	            student.remove(stud);
	            break;
	        }
	    }
	}
}
		


