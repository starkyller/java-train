package com.example.demo.mem_db;


import java.util.ArrayList;
import java.util.List;

public class InMemDB {
        // static variable single_instance of type Singleton
        private static InMemDB single_instance = null;



    // variable of type String
        private List<String> _messages;

        // private constructor restricted to this class itself
        private InMemDB()
        {
            _messages = new ArrayList<String>();
        }

        // static method to create instance of Singleton class
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
