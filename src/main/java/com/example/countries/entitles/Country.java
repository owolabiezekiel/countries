package com.example.countries.entitles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by owoez on 10/12/2019
 *
 * @author : owoez
 * @date : 10/12/2019
 * @project : countries
 */

@Entity
public class Country {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String capital;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
