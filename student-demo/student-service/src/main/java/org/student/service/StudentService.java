package org.student.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.student.api.dto.StudentVO;
import org.student.bean.Student;

@Service
public interface StudentService {

	List<Student> listStudent();
	
	String login(String username, String password);
	
	void register(StudentVO student);
	
}
