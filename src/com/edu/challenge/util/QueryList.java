package com.edu.challenge.util;

import com.edu.challenge.model.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends Student & QueryItem> extends ArrayList<T> {
//    private List<T> items;

    public QueryList() {

    }

    public QueryList(List<T> items) {
//        this.items = items;
        super(items);
    }

    public QueryList<T> getMatches(String field, String value) {
        QueryList<T> matches = new QueryList<>();

        for (var item : this) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
