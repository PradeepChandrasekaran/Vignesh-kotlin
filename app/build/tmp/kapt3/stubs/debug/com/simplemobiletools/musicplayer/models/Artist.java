package com.simplemobiletools.musicplayer.models;

import java.lang.System;

@androidx.room.Entity(tableName = "artists", indices = {@androidx.room.Index(unique = true, value = {"id"})})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\u0006\u0010#\u001a\u00020\u0005J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Artist;", "", "id", "", "title", "", "albumCnt", "", "trackCnt", "albumArtId", "(JLjava/lang/String;IIJ)V", "getAlbumArtId", "()J", "setAlbumArtId", "(J)V", "getAlbumCnt", "()I", "setAlbumCnt", "(I)V", "getId", "getTitle", "()Ljava/lang/String;", "getTrackCnt", "setTrackCnt", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "", "getBubbleText", "hashCode", "toString", "Companion", "music-player_debug"})
public final class Artist implements java.lang.Comparable<com.simplemobiletools.musicplayer.models.Artist> {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String title = null;
    @androidx.room.ColumnInfo(name = "album_cnt")
    private int albumCnt;
    @androidx.room.ColumnInfo(name = "track_cnt")
    private int trackCnt;
    @androidx.room.ColumnInfo(name = "album_art_id")
    private long albumArtId;
    @org.jetbrains.annotations.NotNull()
    public static final com.simplemobiletools.musicplayer.models.Artist.Companion Companion = null;
    private static int sorting = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.musicplayer.models.Artist copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int albumCnt, int trackCnt, long albumArtId) {
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
    
    public Artist(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int albumCnt, int trackCnt, long albumArtId) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getAlbumCnt() {
        return 0;
    }
    
    public final void setAlbumCnt(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTrackCnt() {
        return 0;
    }
    
    public final void setTrackCnt(int p0) {
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getAlbumArtId() {
        return 0L;
    }
    
    public final void setAlbumArtId(long p0) {
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Artist other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBubbleText() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Artist$Companion;", "", "()V", "sorting", "", "getSorting", "()I", "setSorting", "(I)V", "music-player_debug"})
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