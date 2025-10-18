package com.placement.placementstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.placement.placementstudent.entity.StudentEntity;
import com.placement.placementstudent.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Add Student
    @PostMapping("/add")
    public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity student) {
        StudentEntity savedStudent = studentService.addStudent(student);
        return ResponseEntity.ok(savedStudent);
    }

    //Update Student
    @PutMapping("/update")
    public ResponseEntity<StudentEntity> updateStudent(@RequestBody StudentEntity student) {
        StudentEntity updatedStudent = studentService.updateStudent(student);
        return ResponseEntity.ok(updatedStudent);
    }

    //Search Student by ID
    @GetMapping("/id/{id}")
    public ResponseEntity<StudentEntity> searchStudentById(@PathVariable long id) {
        StudentEntity student = studentService.searchStudentById(id);
        return ResponseEntity.ok(student);
    }
    
    //Search Student by Hall Ticket Number
    @GetMapping("/hallticket/{ticketNo}")
    public ResponseEntity<StudentEntity> searchStudentByHallTicket(@PathVariable long ticketNo) {
        StudentEntity student = studentService.searchStudentByHallTicket(ticketNo);
        return ResponseEntity.ok(student);
    }
    
    //Delete Student
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable long id) {
        boolean deleted = studentService.deleteStudent(id);
        if (deleted) {
            return ResponseEntity.ok("Student deleted successfully.");
        } else {
            return ResponseEntity.badRequest().body("Student not found.");
        }
    }
}
