package com.example.firebasev2;

import com.google.firebase.firestore.Exclude;

public class Note {

    private String documentId;
    private String title;
    private String description;
    public Note() {
        //public no-arg constructor needed
    }

//wont be saved in notes...
    @Exclude
    public String getDocumentId() {
        return documentId;
    }
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
}
