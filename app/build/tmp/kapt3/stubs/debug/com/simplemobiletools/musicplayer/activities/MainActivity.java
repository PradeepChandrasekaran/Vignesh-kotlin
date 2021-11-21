package com.simplemobiletools.musicplayer.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\u0016\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0012\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\nH\u0014J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\bH\u0016J\u0010\u0010\'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010(\u001a\u00020\nH\u0014J\u0010\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020-H\u0007J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010/\u001a\u00020\nH\u0002J\b\u00100\u001a\u00020\nH\u0002J\u0010\u00101\u001a\u00020\n2\u0006\u0010\u001c\u001a\u000202H\u0007J\b\u00103\u001a\u00020\nH\u0002J\b\u00104\u001a\u00020\nH\u0002J\u0010\u00105\u001a\u00020\n2\u0006\u0010\u001c\u001a\u000206H\u0007J\u0010\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u000208H\u0007J\u0010\u00109\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020:H\u0007J\u0010\u0010;\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020<H\u0007J\b\u0010=\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/simplemobiletools/musicplayer/activities/MainActivity;", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "()V", "bus", "Lorg/greenrobot/eventbus/EventBus;", "isSearchOpen", "", "searchMenuItem", "Landroid/view/MenuItem;", "checkSleepTimerPosition", "", "checkWhatsNewDialog", "createNewPlaylist", "createPlaylistFrom", "path", "", "createPlaylistFromFolder", "getAllFragments", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/fragments/MyViewPagerFragment;", "kotlin.jvm.PlatformType", "getCurrentFragment", "initActivity", "initFragments", "launchAbout", "launchEqualizer", "launchSettings", "noStoragePermission", "event", "Lcom/simplemobiletools/musicplayer/models/Events$NoStoragePermission;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "onPrepareOptionsMenu", "onResume", "pickedSleepTimer", "seconds", "", "playlistsUpdated", "Lcom/simplemobiletools/musicplayer/models/Events$PlaylistsUpdated;", "setupSearch", "showSleepTimer", "showSortingDialog", "sleepTimerChanged", "Lcom/simplemobiletools/musicplayer/models/Events$SleepTimerChanged;", "startSleepTimer", "stopSleepTimer", "trackChangedEvent", "Lcom/simplemobiletools/musicplayer/models/Events$TrackChanged;", "trackDeleted", "Lcom/simplemobiletools/musicplayer/models/Events$TrackDeleted;", "trackStateChanged", "Lcom/simplemobiletools/musicplayer/models/Events$TrackStateChanged;", "tracksUpdated", "Lcom/simplemobiletools/musicplayer/models/Events$RefreshTracks;", "updateCurrentTrackBar", "music-player_debug"})
public final class MainActivity extends com.simplemobiletools.musicplayer.activities.SimpleActivity {
    private boolean isSearchOpen = false;
    private android.view.MenuItem searchMenuItem;
    private org.greenrobot.eventbus.EventBus bus;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
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
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setupSearch(android.view.Menu menu) {
    }
    
    private final void initActivity() {
    }
    
    private final void initFragments() {
    }
    
    private final com.simplemobiletools.musicplayer.fragments.MyViewPagerFragment getCurrentFragment() {
        return null;
    }
    
    private final void showSortingDialog() {
    }
    
    private final void updateCurrentTrackBar() {
    }
    
    private final void createNewPlaylist() {
    }
    
    private final void createPlaylistFromFolder() {
    }
    
    private final void createPlaylistFrom(java.lang.String path) {
    }
    
    private final void showSleepTimer() {
    }
    
    private final void pickedSleepTimer(int seconds) {
    }
    
    private final void startSleepTimer() {
    }
    
    private final void stopSleepTimer() {
    }
    
    private final void checkSleepTimerPosition() {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.musicplayer.fragments.MyViewPagerFragment> getAllFragments() {
        return null;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void trackChangedEvent(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.TrackChanged event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void trackStateChanged(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.TrackStateChanged event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void noStoragePermission(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.NoStoragePermission event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void sleepTimerChanged(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.SleepTimerChanged event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void playlistsUpdated(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.PlaylistsUpdated event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void tracksUpdated(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.RefreshTracks event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void trackDeleted(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Events.TrackDeleted event) {
    }
    
    private final void launchEqualizer() {
    }
    
    private final void launchSettings() {
    }
    
    private final void launchAbout() {
    }
    
    private final void checkWhatsNewDialog() {
    }
}