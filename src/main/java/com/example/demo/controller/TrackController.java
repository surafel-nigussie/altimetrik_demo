package com.example.demo.controller;

import com.example.demo.service.ITrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api/track")
@EnableSwagger2
public class TrackController {
    private final ITrackService trackService;

    @Autowired
    public TrackController(ITrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("/top")
    @CrossOrigin
    public ResponseEntity<?> getTopTrack(@RequestParam("country") String country) {
        try {
            return new ResponseEntity<>(trackService.getTopTrack(country), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
