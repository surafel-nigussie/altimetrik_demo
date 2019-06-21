package com.example.demo.service;

import com.example.demo.domain.Track;
import com.example.demo.domain.dto.TrackDTO;

public interface ITrackService {
    TrackDTO getTopTrack(String country);
    Track getTopTrackData(String country);
}
