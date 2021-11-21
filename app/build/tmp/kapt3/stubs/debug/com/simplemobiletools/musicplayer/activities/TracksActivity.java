package com.simplemobiletools.musicplayer.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0014J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0014J\b\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/simplemobiletools/musicplayer/activities/TracksActivity;", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "()V", "bus", "Lorg/greenrobot/eventbus/EventBus;", "lastFilePickerPath", "", "playlist", "Lcom/simplemobiletools/musicplayer/models/Playlist;", "addFileToPlaylist", "", "addFolderToPlaylist", "addTrackFromPath", "path", "rescanWrongPath", "", "itemClicked", "track", "Lcom/simplemobiletools/musicplayer/models/Track;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "refreshPlaylist", "showSortingDialog", "trackChangedEvent", "event", "Lcom/simplemobiletools/musicplayer/models/Events$TrackChanged;", "trackStateChanged", "Lcom/simplemobiletools/musicplayer/models/Events$TrackStateChanged;", "updateCurrentTrackBar", "music-player_debug"})
public final class TracksActivity extends com.simplemobiletools.musicplayer.activities.SimpleActivity {
    private org.greenrobot.eventbus.EventBus bus;
    private com.simplemobiletools.musicplayer.models.Playlist playlist;
    private java.lang.String lastFilePickerPath = "";
    private java.util.HashMap _$_findViewCache;
    
    public TracksActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showSortingDialog() {
    }
    
    private final void addFileToPlaylist() {
    }
    
    private final void addTrackFromPath(java.lang.String path, boolean rescanWrongPath) {
    }
    
    private final void addFolderToPlaylist() {
    }
    
    private final void refreshPlaylist() {
    }
    
    private final void updateCurrentTrackBar() {
    }
    
    private final void itemClicked(com.simplemobiletools.musicplayer.models.Track track) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void trackChangedEvent(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.TrackChanged event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void trackStateChanged(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.TrackStateChanged event) {
    }
}