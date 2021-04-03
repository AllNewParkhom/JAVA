package com.project.project.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Publisher {


    private UUID uid = UUID.randomUUID();

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    private String pubName;
    private String pubAddress;
    private Integer pubPhone;

    private Set<Book> books = new HashSet<Book>();

    public Publisher(String pubName, String pubAddress, Integer pubPhone, Set<Book> books) {
        this.pubName = pubName;
        this.pubAddress = pubAddress;
        this.pubPhone = pubPhone;
        this.books = books;
    }


    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getPubAddress() {
        return pubAddress;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress;
    }

    public Integer getPubPhone() {
        return pubPhone;
    }

    public void setPubPhone(Integer pubPhone) {
        this.pubPhone = pubPhone;
    }

    @Override
    public String toString(){
        return this.uid+" name: "+this.pubName+" phone: "+this.pubPhone+" adress: "+this.pubAddress;
    }
}
