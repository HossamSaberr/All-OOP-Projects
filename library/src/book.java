public class book {
    private int id;
    private int libraryId;
    private String title;
    private String author;
    private String publisher;
    private int productionYear;
    private String status;
    private static int copies;
    public book(int id, int libraryId, String title, String author, String publisher, int productionYear, String status, int copies) {
        this.id = id;
        this.libraryId = libraryId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.productionYear = productionYear;
        this.status = status;
        this.copies = copies;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}