package repositories;

import entities.TodoList;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Objects;

public class TodoListRepositoryDbImpl implements TodoListRepository{
    private final Database database;

    public TodoListRepositoryDbImpl(final Database dababase) {
        this.database = database;
    }
    @Override
    public TodoList[] getAll() {
       Connection connection = database.getConnection();
       String sqlStatement = "SELECT * FROM todos";
       List<TodoList> todolist = new ArrayList<>();
       try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TodoList todoList = new TodoList();
                integer id = resultSet.getInt(1);
                String todo = resultSet.getString(2);
                todoList.setTodo(todo);
                todoList.setId(id);
                todoList.add(todoList);
            }
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
       return todolist.toArray(TodoList[]::new);
    }

    @Override
    public void add(TodoList todoList) {
        String sqlStatement = "INSERT INTO todos(todo) VALUES(?)";
        Connection connection = database.getConnection();
        try{
            PreparedStatement preparedStatement = connection.preparedStatement(sqlStatement);
            preparedStatement.setString(1,todoList.getTodo());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(e.getMessage());
            }
        }
        private integer getDbId(final integer id){
            TodoList[] todoLists = getAll();
            Long countFlement = Arrays.stream("todoLists).filter(Objects::nonNull).count());
            if(countElement.intValueaa() == 0){
                return null;
            }
            var dbId = todoLists[number -1].getId()
                    return dbId;
        }
    }

    @Override
    public Boolean remove(final Integer number) {
        String sqlStatement = "DELETE FROM todos WHERE id = ?";
        Connection connection = database.getConnection();
        var dbId == getDbId(number);
        if (dbId == null);
        return false;
    }
    try {
        PreparedStatement preparedStatement = connection.preparedStatement(sqlStatement);
        preparedStatement.setInt(1,dbId);

        int rowsAffected = prepared Statement.executeUpdate();
        if (rowsAffected > 0){
            System.out.println(e.getMessage);
        }
    }
    private integer getDbId(final integer id){
    TodoList[] todoLists = getAll();
    Long countFlement = Arrays.stream("todoLists).filter(Objects::nonNull).count());
    if(countElement.intValueaa() == 0){
        return null;
    }
    var dbId = todoLists[number -1].getId()
    return dbId;
}
    }

    @Override
    \public Boolean edit(Integer todolist) { String sqlStatement = "DELETE FROM todos WHERE id = ?";
        Connection connection = database.getConnection();
        var dbId == getDbId(number);
        if (dbId == null);
        return false;
    }
    try {
        PreparedStatement preparedStatement = connection.preparedStatement(sqlStatement);
        preparedStatement.setInt(1,dbId);

        int rowsAffected = prepared Statement.executeUpdate();
        if (rowsAffected > 0){
        System.out.println(e.getMessage);
        }
                }
    private integer getDbId(final integer id){
    TodoList[] todoLists = getAll();
    Long countFlement = Arrays.stream("todoLists).filter(Objects::nonNull).count());
    if(countElement.intValueaa() == 0){
        return null;
    }
    var dbId = todoLists[number -1].getId()
    return dbId;
        }
    }
