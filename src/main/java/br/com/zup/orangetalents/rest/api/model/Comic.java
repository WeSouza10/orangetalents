package br.com.zup.orangetalents.rest.api.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Comic extends Object implements Serializable{


    private int id;
    private String title;
    private String isbn;
    private ArrayList prices;
    private ArrayList creators;
    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public ArrayList<String> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<String> prices) {
        this.prices = prices;
    }

    public ArrayList<String> getCreators() {
        return creators;
    }

    public void setCreators(ArrayList<String> creators) {
        this.creators = creators;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }






//    @Override
//    public String toString() {
//        return "Comic{" +
//                "id='" + id + '\'' +
//                ", title=" + title +
//                "isbn='" + isbn + '\'' +
//                ", prices=" + prices +
//                "creators='" + creators + '\'' +
//                ", description=" + description +
//                '}';
//
//
//
//    }
}
