package com.simplemobiletools.musicplayer.models;

import java.lang.System;

@androidx.room.Entity(tableName = "tracks", indices = {@androidx.room.Index(unique = true, value = {"media_store_id", "playlist_id"})})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 >2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u0003:\u0001>BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0000H\u0096\u0002J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\fH\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\t\u00100\u001a\u00020\bH\u00c6\u0003J\t\u00101\u001a\u00020\fH\u00c6\u0003J\t\u00102\u001a\u00020\bH\u00c6\u0003J\t\u00103\u001a\u00020\bH\u00c6\u0003J\t\u00104\u001a\u00020\fH\u00c6\u0003Jm\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u0010*\u001a\u0004\u0018\u000108H\u00d6\u0003J\u0006\u00109\u001a\u00020\bJ\u000e\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\fJ\t\u0010<\u001a\u00020\fH\u00d6\u0001J\t\u0010=\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001e\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a\u00a8\u0006?"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Track;", "Ljava/io/Serializable;", "", "Lcom/simplemobiletools/musicplayer/models/ListItem;", "id", "", "mediaStoreId", "title", "", "artist", "path", "duration", "", "album", "coverArt", "playListId", "trackId", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V", "getAlbum", "()Ljava/lang/String;", "setAlbum", "(Ljava/lang/String;)V", "getArtist", "setArtist", "getCoverArt", "getDuration", "()I", "setDuration", "(I)V", "getId", "()J", "setId", "(J)V", "getMediaStoreId", "getPath", "setPath", "getPlayListId", "setPlayListId", "getTitle", "setTitle", "getTrackId", "compareTo", "other", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "", "getBubbleText", "getProperTitle", "showFilename", "hashCode", "toString", "Companion", "music-player_debug"})
public final class Track extends com.simplemobiletools.musicplayer.models.ListItem implements java.io.Serializable, java.lang.Comparable<com.simplemobiletools.musicplayer.models.Track> {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @androidx.room.ColumnInfo(name = "media_store_id")
    private final long mediaStoreId = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "artist")
    private java.lang.String artist;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "path")
    private java.lang.String path;
    @androidx.room.ColumnInfo(name = "duration")
    private int duration;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "album")
    private java.lang.String album;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "cover_art")
    private final java.lang.String coverArt = null;
    @androidx.room.ColumnInfo(name = "playlist_id")
    private int playListId;
    @androidx.room.ColumnInfo(name = "track_id")
    private final int trackId = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.simplemobiletools.musicplayer.models.Track.Companion Companion = null;
    private static final long serialVersionUID = 6717978793256852245L;
    private static int sorting = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.musicplayer.models.Track copy(long id, long mediaStoreId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String path, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String album, @org.jetbrains.annotations.NotNull()
    java.lang.String coverArt, int playListId, int trackId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Track(long id, long mediaStoreId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String path, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String album, @org.jetbrains.annotations.NotNull()
    java.lang.String coverArt, int playListId, int trackId) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getMediaStoreId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArtist() {
        return null;
    }
    
    public final void setArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    public final void setPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    public final void setDuration(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlbum() {
        return null;
    }
    
    public final void setAlbum(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoverArt() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getPlayListId() {
        return 0;
    }
    
    public final void setPlayListId(int p0) {
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getTrackId() {
        return 0;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Track other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBubbleText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProperTitle(int showFilename) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Track$Companion;", "", "()V", "serialVersionUID", "", "sorting", "", "getSorting", "()I", "setSorting", "(I)V", "music-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getSorting() {
            return 0;
        }
        
        public final void setSorting(int p0) {
        }
    }
}