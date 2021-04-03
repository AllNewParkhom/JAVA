package com.project.project.domain;

import java.util.UUID;

public class Book {

    private UUID uid = UUID.randomUUID();

    private String name;
    private Integer pageCount;
    private int yearOfPublishing;
    private int realiseDate;
    private Integer price;
    private Category category;

    public Book(String name, Integer pageCount, int yearOfPublishing, int realiseDate, Integer price, Category category) {
        this.name = name;
        this.pageCount = pageCount;
        this.yearOfPublishing = yearOfPublishing;
        this.realiseDate = realiseDate;
        this.price = price;
        this.category = category;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getRealiseDate() {
        return realiseDate;
    }

    public void setRealiseDate(int realiseDate) {
        this.realiseDate = realiseDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return this.uid+" name: "+this.name+" category: "+this.category+" page count: "+this.pageCount+" price: "+this.price;
    }
}
