public class Note{
    //id getter and setter
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //getter and setter title
    private String Title;
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
    //getter and setter content
    private String Content;
    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    //constructor
    public Note(int id, String title, String content) {
        this.id = id;
        Title = title;
        Content = content;
    }
}
