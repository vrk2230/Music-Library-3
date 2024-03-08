package com.example.song.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "playlist")
public class Song {

    @Column(name = "songId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int songId;

    @Column(name = "songName")
    private String songName;

    @Column(name = "lyricist")
    private String lyricist;

    @Column(name = "singer")
    private String singer;

    @Column(name = "musicDirector")
    private String musicDirector;

    public Song() {
    }

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector) {
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public int getSongId() {
        return this.songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return this.songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getLyricist() {
        return this.lyricist;
    }

    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    public String getSinger() {
        return this.singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusicDirector() {
        return this.musicDirector;
    }

    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }

}
