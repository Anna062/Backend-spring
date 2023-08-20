package com.mywebsite.backend.controller;

import com.mywebsite.backend.model.Todo;
import com.mywebsite.backend.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return service.getTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable Long id){
        return service.getTodo(id);
    }

    @PostMapping(value = "/todos")
    public void addTodo(@RequestBody Todo todo){
        service.addTodo(todo);
    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable Long id){
        service.deleteTodo(id);
    }
}
