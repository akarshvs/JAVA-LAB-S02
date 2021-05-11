import mypack.myutil;
public class book {
    String name, author;
    float price;
    static myutil io = new myutil();
    book()
    {
        this.name = io.in("BOOK NAME: ");
        this.author = io.in("AUTHOR: ");
        this.price = io.f(io.in("PRICE: "));
    }
    public void display()
    {
        io.out("BOOK NAME: " + this.name);
        io.out("AUTHOR: " + this.author);
        io.out("PRICE: " + this.price);
    }
    public static void main(String[] args) 
    {
        int n = io.i(io.in("ENTER NO OF BOOKS: "));
        float sum = 0;
        book book_arr[] = new book[n];
        for(int i = 0; i < n; i++)
            book_arr[i] = new book();
        for(int i = 0; i < n; i++)
        {
            book_arr[i].display();
            sum += book_arr[i].price;
        }        
        io.out("SUM OF PRICE OF " + n + " BOOKS: " + sum);
    }
}
