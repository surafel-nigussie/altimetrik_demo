package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "artist",
        "@attr"
})
public class Track {
    @JsonProperty("name")
    private String name;
    @JsonProperty("artist")
    private Artist artist;
    @JsonProperty("@attr")
    private Rank attr;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("artist")
    public Artist getArtist() {
        return artist;
    }

    @JsonProperty("artist")
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @JsonProperty("@attr")
    public Rank getAttr() {
        return attr;
    }

    @JsonProperty("@attr")
    public void setAttr(Rank attr) {
        this.attr = attr;
    }
}