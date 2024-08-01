package com.mainproject.collection_management.controller;

import com.mainproject.collection_management.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService; // constrcutor-based dependency injection

//    @Autowired annotation omit kora jay jokhn spring `bean` e ekta matro constructor thke
//    spring will use this constructor and inject all necessary dependencies
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model) {// `view` ta string tai return type string disi
        model.addAttribute("students", studentService.getAllStudents());
        return "students"; // view-> ei view ta `templates` folder e HTML file hisebe declare korbo
    }

//    @GetMapping("/students/new")
//    public String createStudentForm(Model model) {
//        // create student object to hold student form data
//        Student student = new Student();
//        model.addAttribute("student", student);
//        return "create_student";
//
//    }
//
//    @PostMapping("/students")
//    public String saveStudent(@ModelAttribute("student") Student student) {
//        studentService.saveStudent(student);
//        return "redirect:/students";
//    }
//
//    @GetMapping("/students/edit/{id}")
//    public String editStudentForm(@PathVariable long id, Model model) {
//        model.addAttribute("student", studentService.getStudentById(id));
//        return "edit_student";
//    }
//
//    @PostMapping("/students/{id}")
//    public String updateStudent(@PathVariable Long id,
//                                @ModelAttribute("student") Student student,
//                                Model model) {
//
//        // get student from database by id
//        Student existingStudent = studentService.getStudentById(id);
//        existingStudent.setId(id);
//        existingStudent.setFirstName(student.getFirstName());
//        existingStudent.setLastName(student.getLastName());
//        existingStudent.setEmail(student.getEmail());
//
//        // save updated student object
//        studentService.updateStudent(existingStudent);
//        return "redirect:/students";
//    }
//
//    @GetMapping("/students/{id}")
//    public String deleteStudent(@PathVariable long id) {
//        studentService.deleteStudent(id);
//        return "redirect:/students";
//    }
}
