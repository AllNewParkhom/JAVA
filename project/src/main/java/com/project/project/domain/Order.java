package com.project.project.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Order {

    private UUID uid = UUID.randomUUID();

    private String customerName;
    private Integer phone;
    private String mail;

    private Set<Book> orderB = new HashSet<Book>();

    public Order(String customerName, Integer phone, String mail, Set<Book> orderB) {
        this.customerName = customerName;
        this.phone = phone;
        this.mail = mail;
        this.orderB = orderB;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString(){
        return this.uid+" name: "+this.customerName+" phone: "+this.phone+" page mail: "+this.mail;
    }
}
