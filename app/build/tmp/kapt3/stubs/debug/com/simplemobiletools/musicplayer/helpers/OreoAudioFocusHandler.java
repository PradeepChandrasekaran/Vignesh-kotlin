package com.simplemobiletools.musicplayer.helpers;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/simplemobiletools/musicplayer/helpers/OreoAudioFocusHandler;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "audioManager", "Landroid/media/AudioManager;", "getContext", "()Landroid/content/Context;", "abandonAudioFocus", "", "requestAudioFocus", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "music-player_debug"})
public final class OreoAudioFocusHandler {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private android.media.AudioFocusRequest audioFocusRequest;
    private android.media.AudioManager audioManager;
    
    public OreoAudioFocusHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void abandonAudioFocus() {
    }
    
    public final void requestAudioFocus(@org.jetbrains.annotations.NotNull()
    android.media.AudioManager.OnAudioFocusChangeListener audioFocusChangeListener) {
    }
}