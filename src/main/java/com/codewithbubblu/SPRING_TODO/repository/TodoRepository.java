package com.codewithbubblu.SPRING_TODO.repository;

import com.codewithbubblu.SPRING_TODO.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TodoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    class TodoRowMapper implements RowMapper<TodoModel> {
        @Override
        public TodoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new TodoModel(rs.getInt("id"), rs.getString("todo"));
        }
    }

    public List<TodoModel> showAll() {
        return jdbcTemplate.query("SELECT * FROM todos", new TodoRowMapper());
    }

    public List<TodoModel> showParticular(int id) {
        return jdbcTemplate.query("select * from todos where id=?;",new Object[]{id},new BeanPropertyRowMapper<>(TodoModel.class));
    }

    public List<TodoModel> deleteTodo(int id) {
        jdbcTemplate.update("delete from todos where id=?;",new Object[]{id});
        return showAll();
    }

    public List<TodoModel> addTodo(TodoModel todo) {
        jdbcTemplate.update("insert into todos (todo) values (?);",new Object[]{todo.getTodo()});
        return showAll();
    }

    public List<TodoModel> updateTodo(TodoModel todo) {
        jdbcTemplate.update("update todos set todo=? where id=?;",new Object[]{todo.getTodo(),todo.getId()});
        return showAll();
    }

}
