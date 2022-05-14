package aluno.aluno2;
public class Book {

    private String name;
    private Author author;
    private Double price;
    private int qty = 0;

    public Book(String name, Author author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, Double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book [author=" + author + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
    }

    
}
