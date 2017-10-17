package com.example.user.recycleviewmvp1;

/**
 * Created by user on 10/17/2017.
 */

public class Person {
    String id;
    String emri;
    String mbiemri;

    public Person() {
    }

    public Person(String id, String emri, String mbiemri){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }
}
