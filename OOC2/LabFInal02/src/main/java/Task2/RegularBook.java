package Task2;

public class RegularBook implements Book {

    BookType type;

    String title;
    String author;

    public RegularBook(){
        type = BookType.RegularBook;
    }

    public BookType getType(){
        return type;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }


}
