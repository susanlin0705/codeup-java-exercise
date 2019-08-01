package Practice_oop;

public class Blog {
    private String author;
    private String content;
    private int viewCount;


    // constructor//------------
    public Blog(String author, String content, int viewCount) {
        this.author = author;
        this.content = content;
        this.viewCount = viewCount;
    }
    //getter//---------
    public String getAuthor(){
        return author;
    }
    public String getContent(){
        return content;
    }
    public int getViewCount(){
        return viewCount;
    }
    //setter//-------

    public static void main(String[] args) {

        Blog name1 = new Blog("susan", "I love dogs", 2);


    }
}
