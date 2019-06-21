package com.example.demo.service.impl;

import com.example.demo.domain.TopTracksData;
import com.example.demo.domain.Track;
import com.example.demo.domain.baba.Result;
import com.example.demo.domain.dto.TrackDTO;
import com.example.demo.service.ITrackService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TrackService implements ITrackService {
    private final ObjectMapper mapper;
    private final RestTemplate restTemplate;

    public TrackService(ObjectMapper mapper, RestTemplate restTemplate) {
        this.mapper = mapper;
        this.restTemplate = restTemplate;
    }

    public TrackDTO getTopTrack(String country) {
        Track data = getTopTrackData(country);
        TrackDTO dto = new TrackDTO();
        dto.setTrackName(data.getName());
        dto.setArtistName(data.getArtist().getName());
        dto.setLink(data.getArtist().getUrl());
        return dto;
    }

    public Track getTopTrackData(String country) {
        TopTracksData data = restTemplate.getForObject("http://ws.audioscrobbler.com/2.0/?method=geo.gettoptracks&country=" + country + "&api_key=059487f87f5f36915eaa3579f6877b90&format=json", TopTracksData.class);
        if (data == null || data.getTracks() == null)
            throw new NoSuchElementException("The specified track is not found.");
        else {
            return data.getTracks().getTrack().get(0);
        }
    }

    private /*com.example.demo.domain.matcher.Track*/void getLyrics(String track, String artist) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//
//        HttpEntity<String> entity = new HttpEntity<String>(postBodyJson ,headers);

//        RestTemplate temp = new RestTemplateBuilder().build();
//        List<HttpMessageConverter<?>> messageConverter = new ArrayList<>();
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
//        messageConverter.add(converter);
//        temp.setMessageConverters(messageConverter);
//
//        LyricsTrack data = temp.getForObject("https://api.musixmatch.com/ws/1.1/matcher.track.get?apikey=c9c4b5460d223987362f8fa6c9a4f3b6&q_track=Love%20the%20Way%20You%20Lie%20(Eminem%20and%20Rihanna)&q_artist=Eminem", LyricsTrack.class);
//        if (data == null || data.getMessage() == null || data.getMessage().getBody() == null || data.getMessage().getBody().getTrack() == null)
//            throw new NoSuchElementException("The specified track is not found.");
//        else {
//            return data.getMessage().getBody().getTrack();
//        }

        RestTemplate temp = new RestTemplateBuilder().build();
        List<HttpMessageConverter<?>> messageConverter = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverter.add(converter);
        temp.setMessageConverters(messageConverter);

        ResponseEntity<Result> countries = temp.getForEntity("https://api.musixmatch.com/ws/1.1/matcher.track.get?apikey=c9c4b5460d223987362f8fa6c9a4f3b6&q_track=Love%20the%20Way%20You%20Lie%20(Eminem%20and%20Rihanna)&q_artist=Eminem", Result.class);
    }

}