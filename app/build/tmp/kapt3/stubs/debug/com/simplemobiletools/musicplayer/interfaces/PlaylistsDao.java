package com.simplemobiletools.musicplayer.interfaces;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/simplemobiletools/musicplayer/interfaces/PlaylistsDao;", "", "deletePlaylists", "", "playlists", "", "Lcom/simplemobiletools/musicplayer/models/Playlist;", "getAll", "getPlaylistWithId", "id", "", "getPlaylistWithTitle", "title", "", "insert", "", "playlist", "update", "music-player_debug"})
public abstract interface PlaylistsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Playlist playlist);
    
    @androidx.room.Delete()
    public abstract void deletePlaylists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.simplemobiletools.musicplayer.models.Playlist> playlists);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM playlists")
    public abstract java.util.List<com.simplemobiletools.musicplayer.models.Playlist> getAll();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM playlists WHERE title = :title COLLATE NOCASE")
    public abstract com.simplemobiletools.musicplayer.models.Playlist getPlaylistWithTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM playlists WHERE id = :id")
    public abstract com.simplemobiletools.musicplayer.models.Playlist getPlaylistWithId(int id);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Playlist playlist);
}