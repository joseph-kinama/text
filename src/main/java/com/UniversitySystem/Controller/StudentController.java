package com.UniversitySystem.Controller;
import java.util.List;
import com.UniversitySystem.Repository.StudentRepository;
import com.UniversitySystem.entity.Student;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody


public class StudentController {
    //to get all the students
@Autowired
    StudentRepository repo;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = repo.findAll();
        return students;
    }

    @GetMapping("/students/{id}")

    public Student getStudent(@PathVariable int id) {
        repo.findById(id).get();
        Student student = repo.findById(id).get();
        return student;
    }

    @PostMapping("student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student) {
        repo.save(student);
    }

    @PutMapping("/student/update/{id}")
    public Student updatestudents(@PathVariable int id) {

        Student student = repo.findById(id).get();
        student.setName("jane");
        student.setPercentage(92);
        student.setBranch("Uganda");

        repo.save(student);
        return student;
    }

    @DeleteMapping("/student/delete/{id}")
    public void removeStudent(@PathVariable int id){
        Student student = repo.findById(id).get();
        repo.delete(student);
    }
}