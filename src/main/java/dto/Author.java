package dto;

import java.util.Date;
import java.util.HashSet;
import java.util.UUID;

public class Author {



    private UUID uid = UUID.randomUUID();

    private String authorName;
    private Date dateOfBirth;

    private HashSet<Book> bookAu = new HashSet<Book>();

    public HashSet<Book> getBookAu() {
        return bookAu;
    }

    public void setBookAu(HashSet<Book> bookAu) {
        this.bookAu = bookAu;
    }

    public Author(String authorName, Date dateOfBirth, HashSet<Book> bookAu) {
        this.authorName = authorName;
        this.dateOfBirth = dateOfBirth;
        this.bookAu = bookAu;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString(){
        return this.uid+" name: "+this.authorName+" date of birth: "+this.dateOfBirth+" books count " +this.getBookAu().size();
    }
}
