package com.simplemobiletools.musicplayer.models;

import java.lang.System;

@androidx.room.Entity(tableName = "playlists", indices = {@androidx.room.Index(unique = true, value = {"id"})})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\u0006\u0010\u001c\u001a\u00020\u0006J\t\u0010\u001d\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Playlist;", "", "()V", "id", "", "title", "", "trackCnt", "(ILjava/lang/String;I)V", "getId", "()I", "setId", "(I)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getTrackCnt", "setTrackCnt", "compareTo", "other", "component1", "component2", "component3", "copy", "equals", "", "", "getBubbleText", "hashCode", "toString", "Companion", "music-player_debug"})
public final class Playlist implements java.lang.Comparable<com.simplemobiletools.musicplayer.models.Playlist> {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private java.lang.String title;
    @androidx.room.Ignore()
    private int trackCnt;
    @org.jetbrains.annotations.NotNull()
    public static final com.simplemobiletools.musicplayer.models.Playlist.Companion Companion = null;
    private static int sorting = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.musicplayer.models.Playlist copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int trackCnt) {
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
    
    public Playlist(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int trackCnt) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTrackCnt() {
        return 0;
    }
    
    public final void setTrackCnt(int p0) {
    }
    
    public Playlist() {
        super();
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Playlist other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBubbleText() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Playlist$Companion;", "", "()V", "sorting", "", "getSorting", "()I", "setSorting", "(I)V", "music-player_debug"})
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