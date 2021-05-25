package com.example.demo.mem_db;


import java.util.ArrayList;
import java.util.List;

public class InMemDB {
    private static InMemDB single_instance = null;

    private List<String> _messages;

    private InMemDB()
    {
        _messages = new ArrayList<String>();
    }

    public static InMemDB getInstance()
    {
        if (single_instance == null)
            single_instance = new InMemDB();

        return single_instance;
    }

    public List<String> getMessages(){
        return _messages;
    }

    public void appendMessage(String message) {
        _messages.add(message);
    }

    @Override
    public String toString() {
        String listString = String.join(", ", _messages);
        return super.toString();
    }
}
