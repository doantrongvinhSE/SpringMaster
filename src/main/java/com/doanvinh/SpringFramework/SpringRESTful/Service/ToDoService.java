package com.doanvinh.SpringFramework.SpringRESTful.Service;

import com.doanvinh.SpringFramework.SpringRESTful.Exception.ToDoNotFoundException;
import com.doanvinh.SpringFramework.SpringRESTful.Entity.Todo;
import com.doanvinh.SpringFramework.SpringRESTful.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private final ToDoRepository toDoRepository;


    @Autowired
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<Todo> getAllTodos() {
         List<Todo> todos = toDoRepository.findAll();

        System.out.println(todos);
        return todos;
    }

    public Todo getTodoById(Long id) {
        return toDoRepository.findById(id).orElseThrow(() -> new ToDoNotFoundException("Not found!"));
    }

    public Todo createTodos(Todo toDo) {
        return toDoRepository.save(toDo);
    }

    public void deleteTodoById(Long id){
        Todo todo = getTodoById(id);
        toDoRepository.delete(todo);
    }

    //update to do
}
