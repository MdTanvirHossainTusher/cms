package com.mainproject.collection_management;

import com.mainproject.collection_management.model.Student;
import com.mainproject.collection_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionManagementApplication implements CommandLineRunner {// DB te data insert na kore direct code diye insert korar jonno

	public static void main(String[] args) {
		SpringApplication.run(CollectionManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Md Tanvir", "Hossain", "tus@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Shohanur", "Rahman", "sohan@gmail.com");
//		studentRepository.save(student2);
//
		Student student3 = new Student("John", "Cena", "john@gmail.com");
		studentRepository.save(student3);
	}
}
