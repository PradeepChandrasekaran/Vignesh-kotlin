package com.simplemobiletools.musicplayer.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR,\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/simplemobiletools/musicplayer/dialogs/NewPlaylistDialog;", "", "activity", "Landroid/app/Activity;", "playlist", "Lcom/simplemobiletools/musicplayer/models/Playlist;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "playlistId", "", "(Landroid/app/Activity;Lcom/simplemobiletools/musicplayer/models/Playlist;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "isNewPlaylist", "", "()Z", "setNewPlaylist", "(Z)V", "getPlaylist", "()Lcom/simplemobiletools/musicplayer/models/Playlist;", "setPlaylist", "(Lcom/simplemobiletools/musicplayer/models/Playlist;)V", "music-player_debug"})
public final class NewPlaylistDialog {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.Nullable()
    private com.simplemobiletools.musicplayer.models.Playlist playlist;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> callback = null;
    private boolean isNewPlaylist;
    
    public NewPlaylistDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.musicplayer.models.Playlist playlist, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.musicplayer.models.Playlist getPlaylist() {
        return null;
    }
    
    public final void setPlaylist(@org.jetbrains.annotations.Nullable()
    com.simplemobiletools.musicplayer.models.Playlist p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getCallback() {
        return null;
    }
    
    public final boolean isNewPlaylist() {
        return false;
    }
    
    public final void setNewPlaylist(boolean p0) {
    }
}