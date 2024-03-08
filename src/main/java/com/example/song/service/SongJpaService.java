package com.example.song.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.song.model.Song;
import com.example.song.repository.SongJpaRepository;
import com.example.song.repository.SongRepository;

import java.util.*;

@service
public class SongJpaService implements SongRepository {

    @Autowired
    private SongJpaRepository songJpaRepository;

    @Override
    public ArrayList<Song> getSongs() {
        List<Song> songList = songJpaRepository.findAll();
        ArrayList<Song> songs = new ArrayList<>(songList);
        return songs;
    }

    @Override
    public Song getSongById(int songId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSongById'");
    }

    @Override
    public Song addSong(Song song) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addSong'");
    }

    @Override
    public Song updateSong(int songId, Song song) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateSong'");
    }

    @Override
    public void deleteSong(int songId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteSong'");
    }

}
