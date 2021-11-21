package com.simplemobiletools.musicplayer.interfaces;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\tH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\'J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\'J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\'J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0007H\'J(\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\'\u00a8\u0006\u001e"}, d2 = {"Lcom/simplemobiletools/musicplayer/interfaces/SongsDao;", "", "getAll", "", "Lcom/simplemobiletools/musicplayer/models/Track;", "getTrackWithMediaStoreId", "mediaStoreId", "", "getTracksCountFromPlaylist", "", "playlistId", "getTracksFromPlaylist", "insert", "", "track", "insertAll", "tracks", "removePlaylistSongs", "removeSongsFromPlaylists", "songs", "removeTrack", "id", "updateCoverArt", "coverArt", "", "updateSongInfo", "newPath", "artist", "title", "oldPath", "music-player_debug"})
public abstract interface SongsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Track track);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.simplemobiletools.musicplayer.models.Track> tracks);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tracks")
    public abstract java.util.List<com.simplemobiletools.musicplayer.models.Track> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tracks WHERE playlist_id = :playlistId")
    public abstract java.util.List<com.simplemobiletools.musicplayer.models.Track> getTracksFromPlaylist(int playlistId);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM tracks WHERE playlist_id = :playlistId")
    public abstract int getTracksCountFromPlaylist(int playlistId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM tracks WHERE media_store_id = :mediaStoreId")
    public abstract com.simplemobiletools.musicplayer.models.Track getTrackWithMediaStoreId(long mediaStoreId);
    
    @androidx.room.Delete()
    public abstract void removeSongsFromPlaylists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.simplemobiletools.musicplayer.models.Track> songs);
    
    @androidx.room.Query(value = "DELETE FROM tracks WHERE media_store_id = :id")
    public abstract void removeTrack(long id);
    
    @androidx.room.Query(value = "DELETE FROM tracks WHERE playlist_id = :playlistId")
    public abstract void removePlaylistSongs(int playlistId);
    
    @androidx.room.Query(value = "UPDATE tracks SET path = :newPath, artist = :artist, title = :title WHERE path = :oldPath")
    public abstract void updateSongInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String newPath, @org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String oldPath);
    
    @androidx.room.Query(value = "UPDATE tracks SET cover_art = :coverArt WHERE media_store_id = :id")
    public abstract void updateCoverArt(@org.jetbrains.annotations.NotNull()
    java.lang.String coverArt, long id);
}