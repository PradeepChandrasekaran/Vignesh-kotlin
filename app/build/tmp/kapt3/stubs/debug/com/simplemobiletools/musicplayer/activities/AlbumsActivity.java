package com.simplemobiletools.musicplayer.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/simplemobiletools/musicplayer/activities/AlbumsActivity;", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "()V", "bus", "Lorg/greenrobot/eventbus/EventBus;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onResume", "trackChangedEvent", "event", "Lcom/simplemobiletools/musicplayer/models/Events$TrackChanged;", "trackStateChanged", "Lcom/simplemobiletools/musicplayer/models/Events$TrackStateChanged;", "updateCurrentTrackBar", "music-player_debug"})
public final class AlbumsActivity extends com.simplemobiletools.musicplayer.activities.SimpleActivity {
    private org.greenrobot.eventbus.EventBus bus;
    private java.util.HashMap _$_findViewCache;
    
    public AlbumsActivity() {
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
    
    private final void updateCurrentTrackBar() {
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