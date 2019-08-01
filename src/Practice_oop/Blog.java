package Practice_oop;

public class Blog {
    private String author;
    private String content;
    private int viewCount;
    private boolean checkSpelling;


    // constructor//------------
    public Blog(String author, String content, int viewCount, boolean checkSpelling) {
        this.author = author;
        this.content = content;
        this.viewCount = viewCount;
        this.checkSpelling = checkSpelling;
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

    public boolean getCheckSpelling() {
        return checkSpelling;
    }


    //setter//-------


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
    public void setCheckSpelling(boolean checkSpelling) {
        this.checkSpelling = checkSpelling;
    }
    public static void main(String[] args) {

        Blog name1 = new Blog("susan", "I love dogs", 2,true);
        System.out.println(name1.getAuthor());
        name1.setAuthor("Dane Miller");
        name1.setAuthor("Mario");
        System.out.println(name1.getAuthor());
        System.out.println("Have you check your spelling? "+ name1.getCheckSpelling());

    }
}
