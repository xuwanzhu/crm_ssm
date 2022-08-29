package com.qidi.crm_ssm.bean;

public class SourceStatistics {
    private int phone;
    private int internet;

    public SourceStatistics(int phone, int internet) {
        this.phone = phone;
        this.internet = internet;
    }

    public SourceStatistics() {
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    @Override
    public String toString() {
        return "SourceStatistics{" +
                "phone=" + phone +
                ", internet=" + internet +
                '}';
    }
}
