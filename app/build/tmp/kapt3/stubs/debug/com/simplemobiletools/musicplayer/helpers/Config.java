package com.simplemobiletools.musicplayer.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 G2\u00020\u0001:\u0001GB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR$\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R$\u0010 \u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR$\u0010#\u001a\u00020$2\u0006\u0010#\u001a\u00020$8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R$\u0010)\u001a\u00020*2\u0006\u0010)\u001a\u00020*8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR$\u00102\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\nR$\u00105\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR$\u00108\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR$\u0010;\u001a\u00020<2\u0006\u0010;\u001a\u00020<8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010A\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010\u0013R$\u0010D\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010\b\"\u0004\bF\u0010\n\u00a8\u0006H"}, d2 = {"Lcom/simplemobiletools/musicplayer/helpers/Config;", "Lcom/simplemobiletools/commons/helpers/BaseConfig;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "albumSorting", "", "getAlbumSorting", "()I", "setAlbumSorting", "(I)V", "artistSorting", "getArtistSorting", "setArtistSorting", "autoplay", "", "getAutoplay", "()Z", "setAutoplay", "(Z)V", "equalizerBands", "", "getEqualizerBands", "()Ljava/lang/String;", "setEqualizerBands", "(Ljava/lang/String;)V", "equalizerPreset", "getEqualizerPreset", "setEqualizerPreset", "shuffle", "isShuffleEnabled", "setShuffleEnabled", "lastSleepTimerSeconds", "getLastSleepTimerSeconds", "setLastSleepTimerSeconds", "playbackSetting", "Lcom/simplemobiletools/musicplayer/helpers/PlaybackSetting;", "getPlaybackSetting", "()Lcom/simplemobiletools/musicplayer/helpers/PlaybackSetting;", "setPlaybackSetting", "(Lcom/simplemobiletools/musicplayer/helpers/PlaybackSetting;)V", "playbackSpeed", "", "getPlaybackSpeed", "()F", "setPlaybackSpeed", "(F)V", "playbackSpeedProgress", "getPlaybackSpeedProgress", "setPlaybackSpeedProgress", "playlistSorting", "getPlaylistSorting", "setPlaylistSorting", "playlistTracksSorting", "getPlaylistTracksSorting", "setPlaylistTracksSorting", "showFilename", "getShowFilename", "setShowFilename", "sleepInTS", "", "getSleepInTS", "()J", "setSleepInTS", "(J)V", "swapPrevNext", "getSwapPrevNext", "setSwapPrevNext", "trackSorting", "getTrackSorting", "setTrackSorting", "Companion", "music-player_debug"})
public final class Config extends com.simplemobiletools.commons.helpers.BaseConfig {
    @org.jetbrains.annotations.NotNull()
    public static final com.simplemobiletools.musicplayer.helpers.Config.Companion Companion = null;
    
    public Config(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final boolean isShuffleEnabled() {
        return false;
    }
    
    public final void setShuffleEnabled(boolean shuffle) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.musicplayer.helpers.PlaybackSetting getPlaybackSetting() {
        return null;
    }
    
    public final void setPlaybackSetting(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.helpers.PlaybackSetting playbackSetting) {
    }
    
    public final boolean getAutoplay() {
        return false;
    }
    
    public final void setAutoplay(boolean autoplay) {
    }
    
    public final int getShowFilename() {
        return 0;
    }
    
    public final void setShowFilename(int showFilename) {
    }
    
    public final boolean getSwapPrevNext() {
        return false;
    }
    
    public final void setSwapPrevNext(boolean swapPrevNext) {
    }
    
    public final int getLastSleepTimerSeconds() {
        return 0;
    }
    
    public final void setLastSleepTimerSeconds(int lastSleepTimerSeconds) {
    }
    
    public final long getSleepInTS() {
        return 0L;
    }
    
    public final void setSleepInTS(long sleepInTS) {
    }
    
    public final int getPlaylistSorting() {
        return 0;
    }
    
    public final void setPlaylistSorting(int playlistSorting) {
    }
    
    public final int getPlaylistTracksSorting() {
        return 0;
    }
    
    public final void setPlaylistTracksSorting(int playlistTracksSorting) {
    }
    
    public final int getArtistSorting() {
        return 0;
    }
    
    public final void setArtistSorting(int artistSorting) {
    }
    
    public final int getAlbumSorting() {
        return 0;
    }
    
    public final void setAlbumSorting(int albumSorting) {
    }
    
    public final int getTrackSorting() {
        return 0;
    }
    
    public final void setTrackSorting(int trackSorting) {
    }
    
    public final int getEqualizerPreset() {
        return 0;
    }
    
    public final void setEqualizerPreset(int equalizerPreset) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEqualizerBands() {
        return null;
    }
    
    public final void setEqualizerBands(@org.jetbrains.annotations.NotNull()
    java.lang.String equalizerBands) {
    }
    
    public final float getPlaybackSpeed() {
        return 0.0F;
    }
    
    public final void setPlaybackSpeed(float playbackSpeed) {
    }
    
    public final int getPlaybackSpeedProgress() {
        return 0;
    }
    
    public final void setPlaybackSpeedProgress(int playbackSpeedProgress) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/simplemobiletools/musicplayer/helpers/Config$Companion;", "", "()V", "newInstance", "Lcom/simplemobiletools/musicplayer/helpers/Config;", "context", "Landroid/content/Context;", "music-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.simplemobiletools.musicplayer.helpers.Config newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}