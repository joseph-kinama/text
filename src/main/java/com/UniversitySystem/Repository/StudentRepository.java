package com.UniversitySystem.Repository;
import com.UniversitySystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
