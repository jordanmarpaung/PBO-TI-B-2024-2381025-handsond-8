package repositories;

import entities.TodoList;

public class TodoListRepositoryImp implements TodoListRepository {
    public static TodoList[] todos = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return todos;
    }

    @Override
    public void add(TodoList todoList) {
        resizeArrayIfFull();

        // add todo to array that has null element
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                todos[i] = todoList;
                break;
            }
        }
    }

    private static void resizeArrayIfFull() {
        // cek whether todos is full
        Boolean isFull = true;
        isFull = isArrayFull(isFull);

        // if full, resize current array two times bigger
        if (isFull) {
            resizeArrayToTwoTimesBigger();
        }
    }

    private static void resizeArrayToTwoTimesBigger() {
        TodoList[] temp = todos;
        todos = new TodoList[todos.length * 2];
        for (int i = 0; i < temp.length; i++) {
            todos[i] = temp[i];
        }
    }

    private static Boolean isArrayFull(Boolean isFull) {
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    @Override
    public Boolean remove(final Integer number) {

        // cek if the number is zero or less than zero
        if (number <= 0) {
            return true;
        }

        // check if the number is greater than the todos size/length
        if (number - 1 > todos.length - 1) {
            return true;
        }

        // check whether the element is already null
        if (todos[number - 1] == null) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean edit(Integer todolist) {
        return null;
    }
}