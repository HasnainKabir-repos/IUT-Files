package com.Journal;

import java.util.List;
import java.util.Map;

public class JournalDB {
    Map<String, List<String>> repo;

    public void save(String string, String entry){
        List<String> list = repo.get(string);

        list.add(entry);

        repo.replace(string, list);
    }

    public void save(String string, List<String> list){
        repo.put(string, list);
    }

    public List<String> load(String string){
        return repo.get(string);
    }

}
