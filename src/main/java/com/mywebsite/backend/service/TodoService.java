package com.mywebsite.backend.service;

import com.mywebsite.backend.model.Todo;
import com.mywebsite.backend.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> getTodos(){
        ArrayList<Todo> todos = new ArrayList<>();
        repository.findAll().forEach(todo -> {
            todos.add(todo);
        });
        return todos;
    }

    public Todo getTodo(Long id){
        return repository.findById(id).orElse(null);
    }

    public void addTodo(Todo todo){
        try {
            repository.save(todo);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteTodo(Long id){
        repository.deleteById(id);
    }

}
