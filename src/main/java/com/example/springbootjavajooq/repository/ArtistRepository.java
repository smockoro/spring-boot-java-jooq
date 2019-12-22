package com.example.springbootjavajooq.repository;


import com.example.springbootjavajooq.model.Artist;

import java.util.List;

public interface ArtistRepository {
    public List<Artist> findAll();
    public Artist create(Artist artist);
    public int update(Artist artist);
}
