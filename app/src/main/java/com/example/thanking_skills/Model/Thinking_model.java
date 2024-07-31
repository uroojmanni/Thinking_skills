package com.example.thanking_skills.Model;

public class Thinking_model {

    int img;
    String text1;
    int card1;

    public Thinking_model(int card1) {
        this.card1 = card1;
    }

    public int getCard1() {
        return card1;
    }

    public void setCard1(int card1) {
        this.card1 = card1;
    }

    public Thinking_model(int img, String text1) {
        this.img = img;
        this.text1 = text1;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }
}
