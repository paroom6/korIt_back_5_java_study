package com.study.ch08;

public class Phone {
    String company;
    String medelName;
    public Phone(String company, String medelName) {
        this.company = company;
        this.medelName = medelName;
    }

    @Override
    public String toString() {
        return "PhoneMain{" +
                "company='" + company + '\'' +
                ", medelName='" + medelName + '\'' +
                '}';
    }
}
