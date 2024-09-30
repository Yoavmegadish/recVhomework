package com.example.recvhomework;

public class CardItem {
    private String text1;          // טקסט ראשון להציג בכרטיס
    private String text2;          // טקסט שני להציג בכרטיס
    private int imageResourceId;   // משאב התמונה (ID) להציג בכרטיס

    public CardItem(String text1, String text2, int imageResourceId) {
        this.text1 = text1;
        this.text2 = text2;
        this.imageResourceId = imageResourceId;
    }

    public String getText1() {
        return text1;  // מחזיר את הטקסט הראשון
    }

    public String getText2() {
        return text2;  // מחזיר את הטקסט השני
    }

    public int getImageResourceId() {
        return imageResourceId;  // מחזיר את ID של התמונה
    }

    // פונקציות set
    public void setText1(String text1) {
        this.text1 = text1;  // קובע את הטקסט הראשון
    }

    public void setText2(String text2) {
        this.text2 = text2;  // קובע את הטקסט השני
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;  // קובע את ID של התמונה
    }
}


