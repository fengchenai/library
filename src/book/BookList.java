package book;

public class BookList {
    private Book[] books=new Book[100];
    private int uesdsize=0;
    public BookList(){
        books[0]=new Book("《西游记》","吴承恩",10,"四大名著");
        books[1]=new Book("《水浒传》","施耐庵",25,"四大名著");
        books[2]=new Book("《三国演义》","罗贯中",30,"四大名著");
        this.uesdsize=3;
    }
    public void setBook(int pos,Book book){
        this.books[pos]=book;
    }
    public Book getBook(int pos){
        return this.books[pos];
    }

    public int getUesdsize() {
        return uesdsize;
    }

    public void setUesdsize(int uesdsize) {
        this.uesdsize = uesdsize;
    }
}

