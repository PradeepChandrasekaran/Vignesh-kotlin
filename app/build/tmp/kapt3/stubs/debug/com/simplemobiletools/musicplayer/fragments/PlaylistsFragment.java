package com.simplemobiletools.musicplayer.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/simplemobiletools/musicplayer/fragments/PlaylistsFragment;", "Lcom/simplemobiletools/musicplayer/fragments/MyViewPagerFragment;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "playlistsIgnoringSearch", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/models/Playlist;", "finishActMode", "", "onSearchClosed", "onSearchOpened", "onSearchQueryChanged", "text", "", "onSortOpen", "activity", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "setupColors", "textColor", "", "adjustedPrimaryColor", "setupFragment", "music-player_debug"})
public final class PlaylistsFragment extends com.simplemobiletools.musicplayer.fragments.MyViewPagerFragment {
    private java.util.ArrayList<com.simplemobiletools.musicplayer.models.Playlist> playlistsIgnoringSearch;
    private java.util.HashMap _$_findViewCache;
    
    public PlaylistsFragment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null, null);
    }
    
    @java.lang.Override()
    public void setupFragment(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.activities.SimpleActivity activity) {
    }
    
    @java.lang.Override()
    public void finishActMode() {
    }
    
    @java.lang.Override()
    public void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onSearchOpened() {
    }
    
    @java.lang.Override()
    public void onSearchClosed() {
    }
    
    @java.lang.Override()
    public void onSortOpen(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.activities.SimpleActivity activity) {
    }
    
    @java.lang.Override()
    public void setupColors(int textColor, int adjustedPrimaryColor) {
    }
}