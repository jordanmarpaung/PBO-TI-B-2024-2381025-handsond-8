package entities;

public class TodoList {
    private String todo;
    private Integer id;

    public TodoList() {
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(final String todo) {
        this.todo = todo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void add(TodoList todoList) {
    }
}

