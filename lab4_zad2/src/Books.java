public class Books extends Stocks{
    private String author;
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Books(double price, int number, String author, String title){
        super(price,number);
        this.author=author;
        this.title=title;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.85;
    }
}
