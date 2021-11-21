package com.simplemobiletools.musicplayer.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\'\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0019\u0010E\u001a\n G*\u0004\u0018\u00010F0F\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010I\u00a8\u0006J"}, d2 = {"ACTIVITY_PLAYLIST", "", "ALBUM", "", "ALBUM_SORTING", "ALL_TRACKS_PLAYLIST_ID", "ARTIST", "ARTIST_SORTING", "AUTOPLAY", "BROADCAST_STATUS", "CURRENT_PLAYLIST", "EDIT", "EDITED_TRACK", "EQUALIZER_BANDS", "EQUALIZER_PRESET", "EQUALIZER_PRESET_CUSTOM", "FINISH", "FINISH_IF_NOT_PLAYING", "INIT", "INIT_PATH", "INIT_QUEUE", "IS_PLAYING", "LAST_SLEEP_TIMER_SECONDS", "NEW_TRACK", "NEXT", "NOTIFICATION_DISMISSED", "PATH", "PAUSE", "PLAYBACK_SETTING", "PLAYBACK_SPEED", "PLAYBACK_SPEED_PROGRESS", "PLAYER_SORT_BY_ALBUM_COUNT", "PLAYER_SORT_BY_ARTIST_TITLE", "PLAYER_SORT_BY_DURATION", "PLAYER_SORT_BY_TITLE", "PLAYER_SORT_BY_TRACK_COUNT", "PLAYER_SORT_BY_YEAR", "PLAYLIST", "PLAYLIST_SORTING", "PLAYLIST_TRACKS_SORTING", "PLAYPAUSE", "PLAY_TRACK", "PREVIOUS", "PROGRESS", "REFRESH_LIST", "RESTART_PLAYER", "SET_PLAYBACK_SPEED", "SET_PROGRESS", "SHOW_FILENAME", "SHOW_FILENAME_ALWAYS", "SHOW_FILENAME_IF_UNAVAILABLE", "SHOW_FILENAME_NEVER", "SHUFFLE", "SKIP_BACKWARD", "SKIP_FORWARD", "SLEEP_IN_TS", "START_SLEEP_TIMER", "STOP_SLEEP_TIMER", "SWAP_PREV_NEXT", "TAB_ALBUMS", "TAB_ARTISTS", "TAB_PLAYLISTS", "TAB_TRACKS", "TRACK", "TRACK_CHANGED", "TRACK_ID", "TRACK_SORTING", "TRACK_STATE_CHANGED", "UPDATE_NEXT_TRACK", "artworkUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getArtworkUri", "()Landroid/net/Uri;", "music-player_debug"})
public final class ConstantsKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROGRESS = "progress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDITED_TRACK = "edited_track";
    public static final int ALL_TRACKS_PLAYLIST_ID = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String START_SLEEP_TIMER = "start_sleep_timer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STOP_SLEEP_TIMER = "stop_sleep_timer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRACK_ID = "track_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESTART_PLAYER = "RESTART_PLAYER";
    public static final int EQUALIZER_PRESET_CUSTOM = -1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTIST = "artist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM = "album";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRACK = "track";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYLIST = "playlist";
    private static final java.lang.String PATH = "com.simplemobiletools.musicplayer.action.";
    private static final android.net.Uri artworkUri = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INIT = "com.simplemobiletools.musicplayer.action.INIT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INIT_PATH = "com.simplemobiletools.musicplayer.action.INIT_PATH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INIT_QUEUE = "com.simplemobiletools.musicplayer.action.INIT_QUEUE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FINISH = "com.simplemobiletools.musicplayer.action.FINISH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FINISH_IF_NOT_PLAYING = "com.simplemobiletools.musicplayer.action.FINISH_IF_NOT_PLAYING";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREVIOUS = "com.simplemobiletools.musicplayer.action.PREVIOUS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAUSE = "com.simplemobiletools.musicplayer.action.PAUSE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYPAUSE = "com.simplemobiletools.musicplayer.action.PLAYPAUSE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEXT = "com.simplemobiletools.musicplayer.action.NEXT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT = "com.simplemobiletools.musicplayer.action.EDIT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY_TRACK = "com.simplemobiletools.musicplayer.action.PLAY_TRACK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REFRESH_LIST = "com.simplemobiletools.musicplayer.action.REFRESH_LIST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_NEXT_TRACK = "com.simplemobiletools.musicplayer.action.UPDATE_NEXT_TRACK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SET_PROGRESS = "com.simplemobiletools.musicplayer.action.SET_PROGRESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKIP_BACKWARD = "com.simplemobiletools.musicplayer.action.SKIP_BACKWARD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKIP_FORWARD = "com.simplemobiletools.musicplayer.action.SKIP_FORWARD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_STATUS = "com.simplemobiletools.musicplayer.action.BROADCAST_STATUS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_DISMISSED = "com.simplemobiletools.musicplayer.action.NOTIFICATION_DISMISSED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SET_PLAYBACK_SPEED = "com.simplemobiletools.musicplayer.action.SET_PLAYBACK_SPEED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEW_TRACK = "NEW_TRACK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_PLAYING = "IS_PLAYING";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRACK_CHANGED = "TRACK_CHANGED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRACK_STATE_CHANGED = "TRACK_STATE_CHANGED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHUFFLE = "shuffle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYBACK_SETTING = "playback_setting";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTOPLAY = "autoplay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENT_PLAYLIST = "current_playlist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_FILENAME = "show_filename";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SWAP_PREV_NEXT = "swap_prev_next";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_SLEEP_TIMER_SECONDS = "last_sleep_timer_seconds";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SLEEP_IN_TS = "sleep_in_ts";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EQUALIZER_PRESET = "EQUALIZER_PRESET";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EQUALIZER_BANDS = "EQUALIZER_BANDS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYBACK_SPEED = "PLAYBACK_SPEED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYBACK_SPEED_PROGRESS = "PLAYBACK_SPEED_PROGRESS";
    public static final int SHOW_FILENAME_NEVER = 1;
    public static final int SHOW_FILENAME_IF_UNAVAILABLE = 2;
    public static final int SHOW_FILENAME_ALWAYS = 3;
    public static final int TAB_PLAYLISTS = 0;
    public static final int TAB_ARTISTS = 1;
    public static final int TAB_ALBUMS = 2;
    public static final int TAB_TRACKS = 3;
    public static final int ACTIVITY_PLAYLIST = 4;
    public static final int PLAYER_SORT_BY_TITLE = 1;
    public static final int PLAYER_SORT_BY_TRACK_COUNT = 2;
    public static final int PLAYER_SORT_BY_ALBUM_COUNT = 4;
    public static final int PLAYER_SORT_BY_YEAR = 8;
    public static final int PLAYER_SORT_BY_DURATION = 16;
    public static final int PLAYER_SORT_BY_ARTIST_TITLE = 32;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYLIST_SORTING = "playlist_sorting";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYLIST_TRACKS_SORTING = "playlist_tracks_sorting";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTIST_SORTING = "artist_sorting";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_SORTING = "album_sorting";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRACK_SORTING = "track_sorting";
    
    public static final android.net.Uri getArtworkUri() {
        return null;
    }
}