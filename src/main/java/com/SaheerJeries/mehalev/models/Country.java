package com.SaheerJeries.mehalev.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Country {
    private Integer id;
    private String name;
    public Country(Integer id) {
    	this.id=id;
    }
    public Country(String name) {
    	this.name=name;
    }
}