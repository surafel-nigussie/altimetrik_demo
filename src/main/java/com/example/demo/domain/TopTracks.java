package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "track",
        "@attr"
})
public class TopTracks {
    @JsonProperty("track")
    private List<Track> track;
    @JsonProperty("@attr")
    private Page page;

    @JsonProperty("track")
    public List<Track> getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(List<Track> track) {
        this.track = track;
    }

    @JsonProperty("@attr")
    public Page getPage() {
        return page;
    }

    @JsonProperty("@attr")
    public void setPage(Page page) {
        this.page = page;
    }
}