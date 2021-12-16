package com.musaem.ToDoList.controller;

import com.musaem.ToDoList.pojo.ToDo;
import com.musaem.ToDoList.repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {

    @Autowired
    private ToDoRepo toDoRepo;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoRepo.findAll();
    }

    @PostMapping
    public ToDo saveToDo(@Valid @NotNull @RequestBody ToDo todo){
        return toDoRepo.save(todo);
    }

    @PutMapping
    public ToDo updateToDo(@Valid @NotNull @RequestBody ToDo todo){
        return toDoRepo.save(todo);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteToDo(@PathVariable Long id){
        toDoRepo.deleteById(id);
    }


}
