package com.example.laab7.Controllr;

import com.example.laab7.Api.Api;
import com.example.laab7.Model.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/Teacher")
public class TeacherControllr {
    ArrayList<Teacher> teachers=new ArrayList<>();

    @GetMapping("/get")
    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }
    @PostMapping("/add")
    public Api addTeacher(@RequestBody Teacher teacher){
        teachers.add(teacher);
        return new Api("added");
    }

    @DeleteMapping("delete")
    public Api deleteSt(Teacher teacher){
        teachers.remove(teacher);
        return new Api("Delete");
    }

}
