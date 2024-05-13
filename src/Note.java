public class Note{
    //id getter and setter
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
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
    public Note(String id, String title, String content) {
        id = id;
        Title = title;
        Content = content;
    }
}
