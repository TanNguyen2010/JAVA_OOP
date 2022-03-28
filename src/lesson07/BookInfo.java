package lesson07;

public class BookInfo {

    String bookTitle;
    String bookAuthorName;
    String bookYear;
    public BookInfo(){

    }

    public BookInfo(String bookTitle, String bookAuthorName, String bookYear) {
        this.bookTitle = bookTitle;
        this.bookAuthorName = bookAuthorName;
        this.bookYear = bookYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookYear='" + bookYear + '\'' +
                '}';
    }
}
