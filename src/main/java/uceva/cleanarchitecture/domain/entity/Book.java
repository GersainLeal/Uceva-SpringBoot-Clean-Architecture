package uceva.cleanarchitecture.domain.entity;

public class Book {
    public Integer id;
    public String title;
    public String author;
    public String genre;
    public Integer year;
    public Float price;

    public Book(Integer id, String title, String author, String genre, Integer year, Float price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }
}
