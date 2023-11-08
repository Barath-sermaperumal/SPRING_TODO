package com.codewithbubblu.SPRING_TODO.model;

public class TodoModel {
    public  int id;
    public  String todo;

    public TodoModel(int id, String todo) {
        this.id =id;
        this.todo =todo;
    }

    public TodoModel(){}

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public  String getTodo() {
        return todo;
    }

    public  void setTodo(String todo) {
        this.todo = todo;
    }
}
