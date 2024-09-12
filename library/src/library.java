public class library {
    private int library_id;
    private String name;
    public library () {

    }
    public library (int id) {
        this.library_id = id;
    }
    public library (int id , String name) {
        this.library_id = id;
        this.name = name;
    }
    public void setLibrary_id(int library_id) {
        this.library_id = library_id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLibrary_id() {
        return library_id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
