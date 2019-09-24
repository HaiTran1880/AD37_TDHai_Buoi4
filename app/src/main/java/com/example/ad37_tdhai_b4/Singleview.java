package com.example.ad37_tdhai_b4;

public class Singleview {
    String phone,date;
    boolean icon;

    public Singleview(String phone, String date, boolean icon) {
        this.phone = phone;
        this.date = date;
        this.icon = icon;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isIcon() {
        return icon;
    }

    public void setIcon(boolean icon) {
        this.icon = icon;
    }
}
