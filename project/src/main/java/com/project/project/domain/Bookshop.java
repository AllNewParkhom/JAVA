package com.project.project.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Bookshop {

    private UUID uid = UUID.randomUUID();

    private String shopName;
    private Integer shopPhone;

    Map<Book, Integer> booksIn = new HashMap<Book, Integer>();

    public Bookshop(String shopName, Integer shopPhone, Map<Book, Integer> books) {
        this.shopName = shopName;
        this.shopPhone = shopPhone;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(Integer shopPhone) {
        this.shopPhone = shopPhone;
    }

    @Override
    public String toString(){
        return this.uid+" name: "+this.shopName+" shop name: "+this.shopName;
    }

}
