package Task2;

public class KidsBook implements Book{
    String title;
    String author;

    BookType type;

    KidsBook(){
        type = BookType.KidsBook;
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
