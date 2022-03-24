public class Comic {

    //testing 
    public static void main(String[] args){

        Comic cute = new Comic("On a Sunbeam", "Tillie Walden", 2018);
        cute.bookDetails();
    }

private String title;
private String author;
private int yearPublished;

public Comic(){

}
public Comic(String title, String author) {
    title = this.title;
    author = this.author;
}
public Comic(String title, String author, int yearPublished){
    title = this.title;
    author = this.author;
    yearPublished = this.yearPublished;
}

public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}
public int getYearPublished() {
    return yearPublished;
}

public void setTitle(String title) {
    this.title = title;
}

public void setAuthor(String author) {
    this.author = author;
}

public void setYearPublished(int yearPublished) {
    this.yearPublished = yearPublished;
}

// A method that returns a Boolean 
// A method that returns a String (For example, if I created a Santa Custom Class, my code would look something like the attached Santa.java file. 
public boolean recentRelease(){
    return this.yearPublished > 2021;
}

public String bookDetails(){
    return "This comic is " + this.title + " by " + this.author + " published in " + this.yearPublished;
}

}
