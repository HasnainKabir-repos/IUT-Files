package com.Printer;

public class BasicPrinter implements Printer{

    Document doc;

    BasicPrinter(Document doc){
        this.doc = doc;
    }

    public void print(Document d){
        System.out.println("Printed through " + d.getText());
    }
}
