package models;

import java.util.ArrayList;

public class Cds {
    private String content;
    private static ArrayList<Cds> instances = new ArrayList<>();

    public Cds (String content) {
        this.content = content;
        instances.add(this);

    }

    public String getContent() {
        return content;
    }

    public static ArrayList<Cds> getAll() {
        return null;
    }

    public static void clearAllCds() {
        instances.clear();
    }
}
