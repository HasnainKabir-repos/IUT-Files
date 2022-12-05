package Task2;

public class NewBook implements Book{

    String title;
    String author;

    BookType type;

    NewBook(){
        type = BookType.NewBook;
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
