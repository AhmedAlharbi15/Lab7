package com.example.laab7.Controllr;

import com.example.laab7.Api.Api;
import com.example.laab7.Model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/student")
public class StudentControllr {
    ArrayList<Student> students=new ArrayList<>();

    @GetMapping("/get")
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    @PostMapping("/add")
    public Api addStudent(@RequestBody Student student){
        students.add(student);
        return new Api("added");
    }
    @DeleteMapping("delete")
    public Api deleteSt(Student student){
        students.remove(student);
        return new Api("Delete");
    }

}
