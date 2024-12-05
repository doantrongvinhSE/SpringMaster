package com.doanvinh.SpringFramework.SpringRESTful.Controller;

import com.doanvinh.SpringFramework.SpringRESTful.Entity.Todo;
import com.doanvinh.SpringFramework.SpringRESTful.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://localhost:3000") // Chỉ định origin được phép
public class ToDoController {
    private ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return toDoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        return ResponseEntity.ok(toDoService.getTodoById(id));
    }


    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        toDoService.deleteTodoById(id);
    }

    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        return ResponseEntity.ok(toDoService.createTodos(todo));
    }
}
