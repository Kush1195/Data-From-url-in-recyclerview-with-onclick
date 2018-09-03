package com.example.kushal.volleyclick;

public class List_Data
{
    private String name;
    private String image_url;

    public List_Data(String name, String image_url)
    {
        this.name = name;
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
