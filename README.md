# SPRING_TODO

<h2>Details of TodoSpringboot</h2>

1.I have created rest api called todospringboot

<ul>

  <li>First I have created model package,controller package,repository package.</li>

  <li>I have todo pojo(Plain Old Java Object) class.</li>

  <li>In Controller Class,I have created endpoints for GET,POST,PUT,DELETE.</li>

  <li>I have created Todorepository in which i have done dependency injection of Jdbc template for connecting to database and used that jdbcTemplate for querying purpose.</li>

  <li>All database related details i have kept in application.properties file.</li>

</ul>

<ul>

  <li>GET:-For getting all todos from database.</li>

  <li>POST:-For adding todos into database.</li>

  <li>PUT:-For updating the todos which are in the database.</li>

  <li>DELETE:-For Deleting the todods from the database.</li>

</ul>

<h2>-------------BELOW ARE MY API'S WHICH HAVE TODO'S---------------------</h2>

<ul>

  <li>GET:-http://localhost:8080/todo/api/all</li>

  <li>GET:-http://localhost:8080/todo/api/all/1</li>

  <li>POST:-http://localhost:8080/todo/api/createtodo</li>

  <li>PUT:-http://localhost:8080/todo/api/updatetodo</li>

  <li>DELETE:-http://localhost:8080/todo/api/delete/1</li>

</ul>
