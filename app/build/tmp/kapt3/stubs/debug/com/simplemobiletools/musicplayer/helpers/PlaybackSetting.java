package com.simplemobiletools.musicplayer.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00038G\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/simplemobiletools/musicplayer/helpers/PlaybackSetting;", "", "iconRes", "", "descriptionStringRes", "(Ljava/lang/String;III)V", "contentDescriptionStringRes", "getContentDescriptionStringRes", "()I", "getDescriptionStringRes", "getIconRes", "nextPlaybackOption", "getNextPlaybackOption", "()Lcom/simplemobiletools/musicplayer/helpers/PlaybackSetting;", "REPEAT_OFF", "REPEAT_PLAYLIST", "REPEAT_TRACK", "STOP_AFTER_CURRENT_TRACK", "music-player_debug"})
public enum PlaybackSetting {
    /*public static final*/ REPEAT_OFF /* = new REPEAT_OFF(0, 0) */,
    /*public static final*/ REPEAT_PLAYLIST /* = new REPEAT_PLAYLIST(0, 0) */,
    /*public static final*/ REPEAT_TRACK /* = new REPEAT_TRACK(0, 0) */,
    /*public static final*/ STOP_AFTER_CURRENT_TRACK /* = new STOP_AFTER_CURRENT_TRACK(0, 0) */;
    private final int iconRes = 0;
    private final int descriptionStringRes = 0;
    
    PlaybackSetting(@androidx.annotation.DrawableRes()
    int iconRes, @androidx.annotation.StringRes()
    int descriptionStringRes) {
    }
    
    public final int getIconRes() {
        return 0;
    }
    
    public final int getDescriptionStringRes() {
        return 0;
    }
    
    @androidx.annotation.StringRes()
    public final int getContentDescriptionStringRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.musicplayer.helpers.PlaybackSetting getNextPlaybackOption() {
        return null;
    }
}