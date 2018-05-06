package org.student.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.student.api.StudentApi;
import org.student.api.dto.StudentDTO;
import org.student.api.dto.StudentVO;
import org.student.api1.StudentRegister;



@RestController
@RequestMapping("/student")
public class StudentController {
	private static Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Resource
	private StudentApi studentApi;
	
	@Resource
	private StudentRegister studentRegister;
	
	@RequestMapping(path = "/listStudent", method = RequestMethod.GET)
	public List<StudentDTO> listStudent(){
		return studentApi.listStudents();
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login(@RequestParam String username, @RequestParam String password){
		return studentApi.login(username, password);
	}
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(@RequestBody StudentVO student) {
		studentRegister.register(student);
		return "200";
	}
}
