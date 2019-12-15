/*
 * This file is generated by jOOQ.
 */
package spring.java.jooq.generated.jooq;


import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import spring.java.jooq.generated.jooq.tables.Artist;
import spring.java.jooq.generated.jooq.tables.Music;
import spring.java.jooq.generated.jooq.tables.records.ArtistRecord;
import spring.java.jooq.generated.jooq.tables.records.MusicRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ArtistRecord, Integer> IDENTITY_ARTIST = Identities0.IDENTITY_ARTIST;
    public static final Identity<MusicRecord, Integer> IDENTITY_MUSIC = Identities0.IDENTITY_MUSIC;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ArtistRecord> KEY_ARTIST_PRIMARY = UniqueKeys0.KEY_ARTIST_PRIMARY;
    public static final UniqueKey<MusicRecord> KEY_MUSIC_PRIMARY = UniqueKeys0.KEY_MUSIC_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ArtistRecord, Integer> IDENTITY_ARTIST = Internal.createIdentity(Artist.ARTIST, Artist.ARTIST.ID);
        public static Identity<MusicRecord, Integer> IDENTITY_MUSIC = Internal.createIdentity(Music.MUSIC, Music.MUSIC.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ArtistRecord> KEY_ARTIST_PRIMARY = Internal.createUniqueKey(Artist.ARTIST, "KEY_artist_PRIMARY", Artist.ARTIST.ID);
        public static final UniqueKey<MusicRecord> KEY_MUSIC_PRIMARY = Internal.createUniqueKey(Music.MUSIC, "KEY_music_PRIMARY", Music.MUSIC.ID);
    }
}
