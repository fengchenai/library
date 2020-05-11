package user;

import book.BookList;
import operation.IOperation;

public abstract class User {
    public String name;
    protected IOperation[] operations;
    public User(String name){
       this.name=name;
    }
    public abstract int  menu();
    public void doOperation(BookList bookList,int choice){

        this.operations[choice].work(bookList);
    }
}
