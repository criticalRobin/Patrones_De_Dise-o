package com.factory;

import java.util.ArrayList;
import java.util.List;

public class Form implements Clone<Form> {
    private String title;
    private List<String> fields;
    private boolean isPublic;

    public Form(String title, boolean isPublic) {
        this.title = title;
        this.isPublic = isPublic;
        this.fields = new ArrayList<>();
    }

    public void addTitle(String title) {
        this.title = title;
    }

    public void addFields(String field) {
        this.fields.add(field);
    }

    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    @Override
    public Form clone() {
        Form clone = new Form(title, isPublic);

        for (String field : fields) {
            clone.addFields(field);
        }

        return clone;
    }

    @Override
    public String toString() {
        return "Form{" +
                "title='" + title + '\'' +
                ", fields=" + fields +
                ", isPublic=" + isPublic +
                '}';
    }

}
