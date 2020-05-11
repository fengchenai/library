package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查找图书");
        System.out.println("请输入图书的名字:");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUesdsize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println(book);
                System.out.println("查找成功！");
                return;
            }
            System.out.println("没有你想要查找的书!");
        }
    }
}
