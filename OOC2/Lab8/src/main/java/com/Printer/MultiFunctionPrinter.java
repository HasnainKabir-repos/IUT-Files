package com.Printer;

public class MultiFunctionPrinter extends Document implements Fax {

    Document document;

    @Override
    public Document scan(){
        return document;
    }

    public void print(Document document){
        System.out.println("Printed through " + document.getText());
    }

    public void Fax(Document d){
        System.out.println("Document Faxed");
    }
}
