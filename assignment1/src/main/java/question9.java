public class question9 {
    public static void main(String[] args) {
        Book book = new Book("java", 123, "computer", 10.0);
    }
}
class Book{
        String name ;
        int bookID;
        String genres;
        double price;
    public Book(String name, int bookID, String genres, double price){
        this.name = name;
        this.bookID = bookID;
        this.genres = genres;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
