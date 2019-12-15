package com.example.springbootjavajooq.repository.impl;

import com.example.springbootjavajooq.model.Artist;
import com.example.springbootjavajooq.repository.ArtistRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static spring.java.jooq.generated.jooq.tables.Artist.ARTIST;

@Repository
public class ArtistRepositoryImpl implements ArtistRepository {

    private final DSLContext dslContext;

    @Autowired
    public ArtistRepositoryImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public List<Artist> findAll() {
        List<Artist> artists = dslContext.select()
                .from(ARTIST)
                .fetch()
                .into(Artist.class);
        return artists;
    }

    @Override
    public Artist create(Artist artist) {
        Artist result = dslContext.insertInto(ARTIST)
                .set(ARTIST.NAME, artist.getName())
                .returning()
                .fetchOne()
                .into(Artist.class);
        return result;
    }
}
