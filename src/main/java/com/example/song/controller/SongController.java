package com.example.song.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.song.model.Song;
import com.example.song.service.SongJpaService;

import java.util.*;

@RestController
public class SongController {

    @Autowired
    private SongJpaService songService;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songService.getSongs();
    }

}
