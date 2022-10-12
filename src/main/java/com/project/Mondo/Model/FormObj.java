package com.project.Mondo.Model;

public class FormObj {
    private String search;

    public FormObj (){}

    public FormObj(String Search) {
        this.search = search;
    }

    // Create a getter for search

    public String getSearch() {
        return search;
    }

    // Create the setter for this search 
    public void setSearch(String search){
        this.search = search;
    }
}
