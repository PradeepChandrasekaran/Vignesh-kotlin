package com.simplemobiletools.musicplayer.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0003J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/simplemobiletools/musicplayer/activities/EqualizerActivity;", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "()V", "bandSeekBars", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/commons/views/MySeekBar;", "bands", "Ljava/util/HashMap;", "", "", "draggingStarted", "", "equalizer", "Landroid/media/audiofx/Equalizer;", "formatFrequency", "", "value", "initMediaPlayer", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "presetChanged", "presetId", "setupBands", "setupPresets", "music-player_debug"})
public final class EqualizerActivity extends com.simplemobiletools.musicplayer.activities.SimpleActivity {
    private java.util.HashMap<java.lang.Short, java.lang.Integer> bands;
    private java.util.ArrayList<com.simplemobiletools.commons.views.MySeekBar> bandSeekBars;
    private java.util.HashMap _$_findViewCache;
    
    public EqualizerActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initMediaPlayer() {
    }
    
    private final void setupBands(android.media.audiofx.Equalizer equalizer) {
    }
    
    private final void draggingStarted(android.media.audiofx.Equalizer equalizer) {
    }
    
    private final void setupPresets(android.media.audiofx.Equalizer equalizer) {
    }
    
    private final void presetChanged(int presetId, android.media.audiofx.Equalizer equalizer) {
    }
    
    private final java.lang.String formatFrequency(int value) {
        return null;
    }
}