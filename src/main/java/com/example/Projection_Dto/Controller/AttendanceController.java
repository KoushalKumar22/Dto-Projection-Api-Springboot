package com.example.Projection_Dto.Controller;

import com.example.Projection_Dto.DTO.AttenndanceDto;
import com.example.Projection_Dto.Entity.Attendance;
import com.example.Projection_Dto.Repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AttendanceController {

    @Autowired
    AttendanceRepository arepo;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @PostMapping("/save")
    public String save(@RequestBody Attendance attendance){
        arepo.save(attendance);
        return "DataBase Saved";
    }

    @GetMapping("/all")
    public List<Attendance> findAll(){
        return arepo.findAll();
    }

    @GetMapping("/id/{id}")
    public AttenndanceDto findById(@PathVariable int id){
        return arepo.getById(id);
    }

    @GetMapping("/name/{name}")
    public AttenndanceDto findByName(@PathVariable String name){
        return arepo.getByName(name);
    }


//    for searching by std
//    @GetMapping("/std/{std}")
//    public AttenndanceDto findByStd(@PathVariable int std){
//        return arepo.getByStd(std);
//    }
}
