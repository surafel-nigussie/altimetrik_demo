package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tracks"
})
public class TopTracksData {
    @JsonProperty("tracks")
    private TopTracks tracks;

    @JsonProperty("tracks")
    public TopTracks getTracks() {
        return tracks;
    }

    @JsonProperty("tracks")
    public void setTracks(TopTracks tracks) {
        this.tracks = tracks;
    }
}