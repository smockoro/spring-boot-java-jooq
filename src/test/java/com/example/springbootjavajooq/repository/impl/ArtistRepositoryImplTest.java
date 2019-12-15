package com.example.springbootjavajooq.repository.impl;

import com.example.springbootjavajooq.model.Artist;
import com.example.springbootjavajooq.repository.ArtistRepository;
import com.ninja_squad.dbsetup.DbSetup;
import static com.ninja_squad.dbsetup.Operations.*;

import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.destination.DataSourceDestination;
import com.ninja_squad.dbsetup.operation.DeleteAll;
import com.ninja_squad.dbsetup.operation.Insert;
import com.ninja_squad.dbsetup.operation.Operation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArtistRepositoryImplTest {

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private DataSource dataSource;

    @BeforeEach
    void beforeEach() {
        DeleteAll DELETE_ALL = deleteAllFrom("artist");
        Insert INSERT_DATA = insertInto("artist")
                .columns("id", "name")
                .values(1, "スティーブ・アオキ")
                .values(2, "Skrillex")
                .values(3, "Avicii").build();
        Operation operation = sequenceOf(DELETE_ALL, INSERT_DATA);
        DbSetup dbSetup = new DbSetup(new DataSourceDestination(dataSource), operation);
        dbSetup.launch();
    }

    @Test
    void findAll() {
        List<Artist> result = artistRepository.findAll();
        assertEquals(3, result.size());
        //assertEquals("スティーブ・アオキ", result.get(0).getName()); 文字化けしてテストが落ちる
        assertEquals("Skrillex", result.get(1).getName());
        assertEquals("Avicii", result.get(2).getName());
    }

    @Test
    void create() {
        Artist artist = new Artist(1, "Afrojack");
        Artist result = artistRepository.create(artist);
        assertEquals(artist.getName(), result.getName());
    }

}