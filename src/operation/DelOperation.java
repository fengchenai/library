package operation;
import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("查找图书");
        System.out.println("请输入删除图书的名字:");
        String name = scanner.nextLine();
        int i = 0;
        for (; i < bookList.getUesdsize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i == bookList.getUesdsize()) {
            System.out.println("没有这本书！");
            return;
        }
        for (int pos = i; pos < bookList.getUesdsize() - 1; pos++) {
            Book book = bookList.getBook(pos + 1);
            bookList.setBook(pos, book);
        }
        bookList.setUesdsize(bookList.getUesdsize()-1);
        System.out.println("删除成功！");
    }
}