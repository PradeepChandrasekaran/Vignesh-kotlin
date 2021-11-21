package com.simplemobiletools.musicplayer.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\r"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events;", "", "()V", "NextTrackChanged", "NoStoragePermission", "PlaylistsUpdated", "ProgressUpdated", "QueueUpdated", "RefreshTracks", "SleepTimerChanged", "TrackChanged", "TrackDeleted", "TrackStateChanged", "music-player_debug"})
public final class Events {
    
    public Events() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$TrackChanged;", "", "track", "Lcom/simplemobiletools/musicplayer/models/Track;", "(Lcom/simplemobiletools/musicplayer/models/Track;)V", "getTrack", "()Lcom/simplemobiletools/musicplayer/models/Track;", "music-player_debug"})
    public static final class TrackChanged {
        @org.jetbrains.annotations.Nullable()
        private final com.simplemobiletools.musicplayer.models.Track track = null;
        
        public TrackChanged(@org.jetbrains.annotations.Nullable()
        com.simplemobiletools.musicplayer.models.Track track) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.simplemobiletools.musicplayer.models.Track getTrack() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$NextTrackChanged;", "", "track", "Lcom/simplemobiletools/musicplayer/models/Track;", "(Lcom/simplemobiletools/musicplayer/models/Track;)V", "getTrack", "()Lcom/simplemobiletools/musicplayer/models/Track;", "music-player_debug"})
    public static final class NextTrackChanged {
        @org.jetbrains.annotations.Nullable()
        private final com.simplemobiletools.musicplayer.models.Track track = null;
        
        public NextTrackChanged(@org.jetbrains.annotations.Nullable()
        com.simplemobiletools.musicplayer.models.Track track) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.simplemobiletools.musicplayer.models.Track getTrack() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$TrackStateChanged;", "", "isPlaying", "", "(Z)V", "()Z", "music-player_debug"})
    public static final class TrackStateChanged {
        private final boolean isPlaying = false;
        
        public TrackStateChanged(boolean isPlaying) {
            super();
        }
        
        public final boolean isPlaying() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$QueueUpdated;", "", "tracks", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/models/Track;", "(Ljava/util/ArrayList;)V", "getTracks", "()Ljava/util/ArrayList;", "music-player_debug"})
    public static final class QueueUpdated {
        @org.jetbrains.annotations.NotNull()
        private final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> tracks = null;
        
        public QueueUpdated(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> tracks) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getTracks() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$ProgressUpdated;", "", "progress", "", "(I)V", "getProgress", "()I", "music-player_debug"})
    public static final class ProgressUpdated {
        private final int progress = 0;
        
        public ProgressUpdated(int progress) {
            super();
        }
        
        public final int getProgress() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$SleepTimerChanged;", "", "seconds", "", "(I)V", "getSeconds", "()I", "music-player_debug"})
    public static final class SleepTimerChanged {
        private final int seconds = 0;
        
        public SleepTimerChanged(int seconds) {
            super();
        }
        
        public final int getSeconds() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$PlaylistsUpdated;", "", "()V", "music-player_debug"})
    public static final class PlaylistsUpdated {
        
        public PlaylistsUpdated() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$TrackDeleted;", "", "()V", "music-player_debug"})
    public static final class TrackDeleted {
        
        public TrackDeleted() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$NoStoragePermission;", "", "()V", "music-player_debug"})
    public static final class NoStoragePermission {
        
        public NoStoragePermission() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/Events$RefreshTracks;", "", "()V", "music-player_debug"})
    public static final class RefreshTracks {
        
        public RefreshTracks() {
            super();
        }
    }
}