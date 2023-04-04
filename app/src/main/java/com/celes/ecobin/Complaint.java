package com.celes.ecobin;

public class Complaint {
    public String userUid, subject, query, address, status, compID;

    public Complaint(){

    }

    public Complaint(String userUid, String subject, String query, String address, String status, String compID) {
        this.userUid = userUid;
        this.subject = subject;
        this.query = query;
        this.address = address;
        this.status = status;
        this.compID = compID;
    }
}
