package com.simplemobiletools.musicplayer.databases;

import java.lang.System;

@androidx.room.Database(entities = {com.simplemobiletools.musicplayer.models.Track.class, com.simplemobiletools.musicplayer.models.Playlist.class, com.simplemobiletools.musicplayer.models.QueueItem.class, com.simplemobiletools.musicplayer.models.Artist.class, com.simplemobiletools.musicplayer.models.Album.class}, version = 7)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\u000e"}, d2 = {"Lcom/simplemobiletools/musicplayer/databases/SongsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "AlbumsDao", "Lcom/simplemobiletools/musicplayer/interfaces/AlbumsDao;", "ArtistsDao", "Lcom/simplemobiletools/musicplayer/interfaces/ArtistsDao;", "PlaylistsDao", "Lcom/simplemobiletools/musicplayer/interfaces/PlaylistsDao;", "QueueItemsDao", "Lcom/simplemobiletools/musicplayer/interfaces/QueueItemsDao;", "SongsDao", "Lcom/simplemobiletools/musicplayer/interfaces/SongsDao;", "Companion", "music-player_debug"})
public abstract class SongsDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.simplemobiletools.musicplayer.databases.SongsDatabase.Companion Companion = null;
    private static com.simplemobiletools.musicplayer.databases.SongsDatabase db;
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    private static final androidx.room.migration.Migration MIGRATION_3_4 = null;
    private static final androidx.room.migration.Migration MIGRATION_4_5 = null;
    private static final androidx.room.migration.Migration MIGRATION_5_6 = null;
    private static final androidx.room.migration.Migration MIGRATION_6_7 = null;
    
    public SongsDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.musicplayer.interfaces.SongsDao SongsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.musicplayer.interfaces.PlaylistsDao PlaylistsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.musicplayer.interfaces.QueueItemsDao QueueItemsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.musicplayer.interfaces.ArtistsDao ArtistsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.musicplayer.interfaces.AlbumsDao AlbumsDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/simplemobiletools/musicplayer/databases/SongsDatabase$Companion;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "MIGRATION_2_3", "MIGRATION_3_4", "MIGRATION_4_5", "MIGRATION_5_6", "MIGRATION_6_7", "db", "Lcom/simplemobiletools/musicplayer/databases/SongsDatabase;", "addInitialPlaylist", "", "context", "Landroid/content/Context;", "destroyInstance", "getInstance", "music-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.simplemobiletools.musicplayer.databases.SongsDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private final void addInitialPlaylist(android.content.Context context) {
        }
    }
}