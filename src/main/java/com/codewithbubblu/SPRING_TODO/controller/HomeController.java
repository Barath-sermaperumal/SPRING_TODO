package com.codewithbubblu.SPRING_TODO.controller;

import com.codewithbubblu.SPRING_TODO.model.TodoModel;
import com.codewithbubblu.SPRING_TODO.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/todos")
    public List<TodoModel> showTodos(){
        return todoRepository.showAll();
    }

    @GetMapping("/todos/{id}")
    public List<TodoModel> showTodo(@PathVariable int id){
        return todoRepository.showParticular(id);
    }

    @PostMapping("/todos")
    public List<TodoModel> addTodos(@RequestBody TodoModel todo){
        return todoRepository.addTodo(todo);
    }

    @PutMapping("/todos")
    public List<TodoModel> updateTodo(@RequestBody TodoModel todo){
        return todoRepository.updateTodo(todo);
    }

    @DeleteMapping("/todos/{id}")
    public List<TodoModel> deleteTodos(@PathVariable int id){
        return todoRepository.deleteTodo(id);
    }
}
