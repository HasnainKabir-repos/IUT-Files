package com.Printer;

public abstract class Document {
    String text;

    public abstract Document scan();

    public String getText(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
