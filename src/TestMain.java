import book.BookList;
import user.Admin;
import user.NomalUser;
import user.User;

import java.util.Scanner;

public class TestMain {
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的名字: ");
        String name=scanner.nextLine();
        System.out.println("请输入你的身份： 1-》管理员，2-》普通用户");
        int choice=scanner.nextInt();
        if (choice==1){
            return new Admin(name);
        }else {
            return new NomalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=login();
        while (true) {
            int choice = user.menu();
            user.doOperation(bookList, choice);
        }
    }
}
