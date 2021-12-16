package com.musaem.ToDoList.repo;

import com.musaem.ToDoList.pojo.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository<ToDo, Long> {
}
