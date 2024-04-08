package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        String name = "Oleksandr";
        String lastName = "Davydenko";

        Gson gson = new Gson();
        String json = gson.toJson(new MyName(name, lastName));

        System.out.println(json);
    }
    static class MyName {
        String name;
        String lastName;

        public MyName(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
    }
}