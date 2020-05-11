package user;

import operation.*;

import java.util.Scanner;

public class NomalUser extends User {
    public NomalUser(String name){
       super(name);
       this.operations=new IOperation[]{
               new FindOperation(),
               new BorrowOperation(),
               new ReturnOperation(),
               new ExitOperation()
       };
   }

    @Override
    public int  menu() {
        System.out.println("================");
        System.out.println("hello"+this.name+"欢迎来到图书馆系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("================");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }

    public void func(){

   }

}
