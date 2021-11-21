package com.simplemobiletools.musicplayer.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0014J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0003J\u0012\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010 \u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010\'\u001a\u00020\u0010H\u0002J\b\u0010(\u001a\u00020\u0010H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020+H\u0007J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020-H\u0007J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u000200H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/simplemobiletools/musicplayer/activities/TrackActivity;", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "Lcom/simplemobiletools/musicplayer/interfaces/PlaybackSpeedListener;", "()V", "SWIPE_DOWN_THRESHOLD", "", "bus", "Lorg/greenrobot/eventbus/EventBus;", "isThirdPartyIntent", "", "nextTrackPlaceholder", "Landroid/graphics/drawable/Drawable;", "getResizedDrawable", "drawable", "wantedHeight", "initThirdPartyIntent", "", "nextTrackChangedEvent", "event", "Lcom/simplemobiletools/musicplayer/models/Events$NextTrackChanged;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "progressUpdated", "Lcom/simplemobiletools/musicplayer/models/Events$ProgressUpdated;", "setupButtons", "setupFlingListener", "setupNextTrackInfo", "track", "Lcom/simplemobiletools/musicplayer/models/Track;", "setupPlaybackSettingButton", "setupSeekbar", "setupShuffleButton", "setupTopArt", "coverArt", "", "setupTrackInfo", "showPlaybackSpeedPicker", "togglePlaybackSetting", "toggleShuffle", "trackChangedEvent", "Lcom/simplemobiletools/musicplayer/models/Events$TrackChanged;", "trackStateChanged", "Lcom/simplemobiletools/musicplayer/models/Events$TrackStateChanged;", "updatePlaybackSpeed", "speed", "", "music-player_debug"})
public final class TrackActivity extends com.simplemobiletools.musicplayer.activities.SimpleActivity implements com.simplemobiletools.musicplayer.interfaces.PlaybackSpeedListener {
    private final int SWIPE_DOWN_THRESHOLD = 100;
    private boolean isThirdPartyIntent = false;
    private org.greenrobot.eventbus.EventBus bus;
    private android.graphics.drawable.Drawable nextTrackPlaceholder;
    private java.util.HashMap _$_findViewCache;
    
    public TrackActivity() {
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
    
    private final void setupTrackInfo(com.simplemobiletools.musicplayer.models.Track track) {
    }
    
    private final void initThirdPartyIntent() {
    }
    
    private final void setupButtons() {
    }
    
    private final void setupNextTrackInfo(com.simplemobiletools.musicplayer.models.Track track) {
    }
    
    private final void setupTopArt(java.lang.String coverArt) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setupFlingListener() {
    }
    
    private final void toggleShuffle() {
    }
    
    private final void setupShuffleButton() {
    }
    
    private final void togglePlaybackSetting() {
    }
    
    private final void setupPlaybackSettingButton() {
    }
    
    private final void setupSeekbar() {
    }
    
    private final void showPlaybackSpeedPicker() {
    }
    
    @java.lang.Override()
    public void updatePlaybackSpeed(float speed) {
    }
    
    private final android.graphics.drawable.Drawable getResizedDrawable(android.graphics.drawable.Drawable drawable, int wantedHeight) {
        return null;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void progressUpdated(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.ProgressUpdated event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void trackStateChanged(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.TrackStateChanged event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void trackChangedEvent(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.TrackChanged event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void nextTrackChangedEvent(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.NextTrackChanged event) {
    }
}