package com.houarizegai.webscraping.imdb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Film {
    private String title;
    private String year;
    private String[] category;
    private String description;
    private String rate;
}
