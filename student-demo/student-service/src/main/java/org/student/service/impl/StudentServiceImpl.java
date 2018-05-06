package org.student.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.student.api.dto.StudentVO;
import org.student.bean.Student;
import org.student.service.StudentService;
import org.student.service.mapper.StudentMapper;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Resource
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> listStudent() {
		List<Student> listStudent = studentMapper.listStudent();
		return listStudent;
	}

	@Override
	public String login(String username, String password) {
		Student student = studentMapper.getStudent(username, password);
		if (student == null) {
			return "failed";
		} else {
			return "success";
		}
	}

	@Override
	public void register(StudentVO studentVO) {
		String id = UUID.randomUUID().toString();
		Student student = new Student();
		student.setId(id);
		student.setName(studentVO.getName());
		student.setAge(studentVO.getAge());
		student.setPassword(studentVO.getPassword());
		studentMapper.addStudent(student);
	}
}
