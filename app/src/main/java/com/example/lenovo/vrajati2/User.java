package com.example.lenovo.vrajati2;

public class User {
    private String fav,key;
    public User()
    {

    }
    public User(String fav,String key)
    {
this.fav=fav;
this.key=key;
    }

    public String getFav() {
        return fav;
    }

    public void setFav(String fav) {
        this.fav = fav;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
