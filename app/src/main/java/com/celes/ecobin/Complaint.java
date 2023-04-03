package com.celes.ecobin;

public class Complaint {
    public String userUid, subject, query, address;

    public Complaint(String userUid, String subject, String query, String address) {
        this.userUid = userUid;
        this.subject = subject;
        this.query = query;
        this.address = address;
    }
}
