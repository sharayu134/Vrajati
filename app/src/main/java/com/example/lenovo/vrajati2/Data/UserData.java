package com.example.lenovo.vrajati2.Data;

public class UserData {
    private String name,  mail_id, Mobileno,password;

    public UserData() {

    }

    public UserData(String name,  String mail_id) {
        this.name = name;
        this.mail_id = mail_id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    public void setMobileno(String mobileno) {
        Mobileno = mobileno;
    }

    public String getMobileno() {
        return Mobileno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
