package com.simplemobiletools.musicplayer.interfaces;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/simplemobiletools/musicplayer/interfaces/AlbumsDao;", "", "deleteAlbum", "", "id", "", "getAll", "", "Lcom/simplemobiletools/musicplayer/models/Album;", "insert", "album", "music-player_debug"})
public abstract interface AlbumsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Album album);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM albums")
    public abstract java.util.List<com.simplemobiletools.musicplayer.models.Album> getAll();
    
    @androidx.room.Query(value = "DELETE FROM albums WHERE id = :id")
    public abstract void deleteAlbum(long id);
}