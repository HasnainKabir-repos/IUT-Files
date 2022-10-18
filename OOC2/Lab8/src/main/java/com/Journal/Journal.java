package com.Journal;

import java.util.List;

public class Journal {

    List<String> list;

    public void addEntries(List<String> list){
        this.list.addAll(list);
    }

    public void addEntry(String string){
        list.add(string);
    }

    public void removeEntry(String string){
        list.remove(string);
    }

    public String toString(){
        return list.toString();
    }
}
