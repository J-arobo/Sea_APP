package com.example.seaapp;

public class SearchRVModal {

    private String title;
    private String link;
    private String display_link;
    private String snippet;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDisplay_link() {
        return display_link;
    }

    public void setDisplay_link(String display_link) {
        this.display_link = display_link;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public SearchRVModal(String title, String link, String display_link, String snippet) {
        this.title = title;
        this.link = link;
        this.display_link = display_link;
        this.snippet = snippet;
    }
}
