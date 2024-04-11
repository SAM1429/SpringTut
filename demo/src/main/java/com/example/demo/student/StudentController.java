package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {


    //reference to StudentService
    private final StudentService studentService;

    //annotation to show dependency injection
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //makes this function an endpoint
    @GetMapping
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
         studentService.addNewStudent(student);
    }
    @DeleteMapping(path = "{studentId}")
    public  void deleteStudent(@PathVariable("studentId")Long studentId)
    {
        studentService.deleteStudent(studentId);
    }

}
