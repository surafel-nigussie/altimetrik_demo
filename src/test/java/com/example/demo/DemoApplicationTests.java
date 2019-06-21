package com.example.demo;

import com.example.demo.domain.dto.TrackDTO;
import com.example.demo.service.ITrackService;
import org.junit.Assert;
import org.junit.Test;
import com.example.demo.domain.Track;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    ITrackService trackService;

    @Test
    public void contextLoads() {
        assertThrows(NoSuchElementException.class, () -> {
            trackService.getTopTrack("SPSSPSSS");
        });
    }

}
