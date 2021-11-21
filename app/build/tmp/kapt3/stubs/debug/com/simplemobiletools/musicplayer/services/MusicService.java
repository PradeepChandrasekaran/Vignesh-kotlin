package com.simplemobiletools.musicplayer.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001fB\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180\u001eH\u0003J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0002J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u000eH\u0002J\b\u0010.\u001a\u00020\u000eH\u0002J\u0014\u0010/\u001a\u00020\u000e2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u00100\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0002J\b\u00101\u001a\u00020\u000eH\u0002J\u0010\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020,H\u0002J\b\u00104\u001a\u00020\u000eH\u0002J\b\u00105\u001a\u00020\u000eH\u0002J\b\u00106\u001a\u00020\u000eH\u0002J\u0010\u00107\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u00108\u001a\u00020\u000eH\u0002J\u0010\u00109\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010:\u001a\u00020\u000eH\u0002J\u0012\u0010;\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\b\u0010<\u001a\u00020\u000eH\u0002J\b\u0010=\u001a\u00020\u0018H\u0002J\b\u0010>\u001a\u00020\u000eH\u0002J\u0010\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\bH\u0016J\u0012\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010C\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020\u000eH\u0016J\b\u0010G\u001a\u00020\u000eH\u0016J \u0010H\u001a\u00020\u00182\u0006\u0010D\u001a\u00020E2\u0006\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\bH\u0016J\u0010\u0010K\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020EH\u0016J \u0010L\u001a\u00020\b2\u0006\u0010+\u001a\u00020,2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0016J\b\u0010O\u001a\u00020\u000eH\u0002J\b\u0010P\u001a\u00020\u000eH\u0002J\u0010\u0010Q\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010R\u001a\u00020\u000eH\u0002J\b\u0010S\u001a\u00020\u000eH\u0002J\b\u0010T\u001a\u00020\u000eH\u0002J\b\u0010U\u001a\u00020\u000eH\u0003J\u0010\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020&H\u0002J\b\u0010X\u001a\u00020\u000eH\u0002J\b\u0010Y\u001a\u00020\u000eH\u0003J\b\u0010Z\u001a\u00020\u000eH\u0002J\b\u0010[\u001a\u00020\u000eH\u0003J\b\u0010\\\u001a\u00020\u000eH\u0002J\u0010\u0010]\u001a\u00020\u000e2\u0006\u0010^\u001a\u00020\u0018H\u0002J\b\u0010_\u001a\u00020\u000eH\u0002J\b\u0010`\u001a\u00020\u000eH\u0002J\b\u0010a\u001a\u00020\u000eH\u0002J\u0010\u0010b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010c\u001a\u00020\u000eH\u0002J\u0010\u0010d\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010e\u001a\u00020\u000eH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006g"}, d2 = {"Lcom/simplemobiletools/musicplayer/services/MusicService;", "Landroid/app/Service;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Landroid/media/MediaPlayer$OnErrorListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "()V", "mClicksCnt", "", "mRemoteControlHandler", "Landroid/os/Handler;", "mRunnable", "Ljava/lang/Runnable;", "abandonAudioFocus", "", "audioFocusGained", "audioFocusLost", "broadcastNextTrackChange", "broadcastPlayerStatus", "broadcastTrackChange", "broadcastTrackProgress", "progress", "broadcastTrackStateChange", "isPlaying", "", "checkTrackOrder", "destroyPlayer", "duckAudio", "finishIfNotPlaying", "getAlbumImage", "Lkotlin/Pair;", "Landroid/graphics/Bitmap;", "getContentIntent", "Landroid/app/PendingIntent;", "getIntent", "action", "", "getNewTrackId", "", "getQueuedTracks", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/models/Track;", "handleEdit", "intent", "Landroid/content/Intent;", "handleEmptyPlaylist", "handleFinish", "handleInit", "handleInitPath", "handleInitQueue", "handleMediaButton", "mediaButtonEvent", "handleNext", "handlePlayPause", "handlePrevious", "handleProgressHandler", "handleRefreshList", "handleSetProgress", "initMediaPlayerIfNeeded", "initService", "initTracks", "isEndOfPlaylist", "notifyFocusGained", "onAudioFocusChange", "focusChange", "onBind", "", "onCompletion", "mp", "Landroid/media/MediaPlayer;", "onCreate", "onDestroy", "onError", "what", "extra", "onPrepared", "onStartCommand", "flags", "startId", "pauseTrack", "playPreviousTrack", "playTrack", "requestAudioFocus", "restartTrack", "resumeTrack", "setPlaybackSpeed", "setTrack", "wantedTrackId", "setupEqualizer", "setupFakeNotification", "setupNextTrack", "setupNotification", "setupTrack", "skip", "forward", "startSleepTimer", "stopSleepTimer", "trackChanged", "trackStateChanged", "unduckAudio", "updateProgress", "updateUI", "Companion", "music-player_debug"})
public final class MusicService extends android.app.Service implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnCompletionListener, android.media.AudioManager.OnAudioFocusChangeListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.simplemobiletools.musicplayer.services.MusicService.Companion Companion = null;
    private static final long PROGRESS_UPDATE_INTERVAL = 1000L;
    private static final long MAX_CLICK_DURATION = 700L;
    private static final int FAST_FORWARD_SKIP_MS = 10000;
    private static final java.lang.String NOTIFICATION_CHANNEL = "music_player_channel";
    private static final int NOTIFICATION_ID = 78;
    @org.jetbrains.annotations.Nullable()
    private static com.simplemobiletools.musicplayer.models.Track mCurrTrack;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> mTracks;
    @org.jetbrains.annotations.Nullable()
    private static android.media.MediaPlayer mPlayer;
    @org.jetbrains.annotations.Nullable()
    private static android.media.audiofx.Equalizer mEqualizer;
    private static android.graphics.Bitmap mCurrTrackCover;
    private static android.graphics.Bitmap mHeadsetPlaceholder;
    private static com.simplemobiletools.musicplayer.receivers.HeadsetPlugReceiver mHeadsetPlugReceiver;
    private static android.os.Handler mProgressHandler;
    private static android.os.CountDownTimer mSleepTimer;
    private static android.media.AudioManager mAudioManager;
    private static int mCoverArtHeight = 0;
    private static int mRetriedTrackCount = 0;
    private static float mPlaybackSpeed = 1.0F;
    private static com.simplemobiletools.musicplayer.helpers.OreoAudioFocusHandler mOreoFocusHandler;
    private static boolean mWasPlayingAtFocusLost = false;
    private static boolean mPlayOnPrepare = true;
    private static boolean mIsThirdPartyIntent = false;
    private static android.net.Uri mIntentUri;
    private static android.support.v4.media.session.MediaSessionCompat mMediaSession;
    private static boolean mIsServiceInitialized = false;
    private static int mPrevAudioFocusState = 0;
    private static int mSetProgressOnPrepare = 0;
    private int mClicksCnt = 0;
    private final android.os.Handler mRemoteControlHandler = null;
    private final java.lang.Runnable mRunnable = null;
    
    public MusicService() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void notifyFocusGained() {
    }
    
    private final void initService(android.content.Intent intent) {
    }
    
    private final void handleInit(android.content.Intent intent) {
    }
    
    private final void handleInitPath(android.content.Intent intent) {
    }
    
    private final void handleInitQueue() {
    }
    
    private final void handlePrevious() {
    }
    
    private final void handlePlayPause() {
    }
    
    private final void handleNext() {
    }
    
    private final void handleEdit(android.content.Intent intent) {
    }
    
    private final void finishIfNotPlaying() {
    }
    
    private final void handleFinish() {
    }
    
    private final void handleRefreshList() {
    }
    
    private final void handleSetProgress(android.content.Intent intent) {
    }
    
    private final void setupTrack() {
    }
    
    private final void initTracks() {
    }
    
    private final void updateUI() {
    }
    
    private final void initMediaPlayerIfNeeded() {
    }
    
    private final void setupEqualizer() {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getQueuedTracks() {
        return null;
    }
    
    private final void checkTrackOrder() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void setupNotification() {
    }
    
    private final android.app.PendingIntent getContentIntent() {
        return null;
    }
    
    private final android.app.PendingIntent getIntent(java.lang.String action) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void setupFakeNotification() {
    }
    
    private final long getNewTrackId() {
        return 0L;
    }
    
    private final boolean isEndOfPlaylist() {
        return false;
    }
    
    private final void playPreviousTrack() {
    }
    
    private final void pauseTrack() {
    }
    
    private final void resumeTrack() {
    }
    
    private final void setupNextTrack() {
    }
    
    private final void restartTrack() {
    }
    
    private final void playTrack(android.content.Intent intent) {
    }
    
    private final void setTrack(long wantedTrackId) {
    }
    
    private final void handleEmptyPlaylist() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onCompletion(@org.jetbrains.annotations.NotNull()
    android.media.MediaPlayer mp) {
    }
    
    @java.lang.Override()
    public boolean onError(@org.jetbrains.annotations.NotNull()
    android.media.MediaPlayer mp, int what, int extra) {
        return false;
    }
    
    @java.lang.Override()
    public void onPrepared(@org.jetbrains.annotations.NotNull()
    android.media.MediaPlayer mp) {
    }
    
    private final void trackChanged() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void setPlaybackSpeed() {
    }
    
    private final void broadcastTrackChange() {
    }
    
    private final void broadcastTrackStateChange(boolean isPlaying) {
    }
    
    private final void broadcastNextTrackChange() {
    }
    
    private final void broadcastTrackProgress(int progress) {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final kotlin.Pair<android.graphics.Bitmap, java.lang.Boolean> getAlbumImage() {
        return null;
    }
    
    private final void destroyPlayer() {
    }
    
    private final void requestAudioFocus() {
    }
    
    private final void abandonAudioFocus() {
    }
    
    @java.lang.Override()
    public void onAudioFocusChange(int focusChange) {
    }
    
    private final void audioFocusLost() {
    }
    
    private final void audioFocusGained() {
    }
    
    private final void duckAudio() {
    }
    
    private final void unduckAudio() {
    }
    
    private final void updateProgress(int progress) {
    }
    
    private final void trackStateChanged(boolean isPlaying) {
    }
    
    private final void handleProgressHandler(boolean isPlaying) {
    }
    
    private final void skip(boolean forward) {
    }
    
    private final void startSleepTimer() {
    }
    
    private final void stopSleepTimer() {
    }
    
    private final void broadcastPlayerStatus() {
    }
    
    private final void handleMediaButton(android.content.Intent mediaButtonEvent) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010?\u001a\u00020\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u00108\u001a\b\u0012\u0004\u0012\u00020\u000f09X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/simplemobiletools/musicplayer/services/MusicService$Companion;", "", "()V", "FAST_FORWARD_SKIP_MS", "", "MAX_CLICK_DURATION", "", "NOTIFICATION_CHANNEL", "", "NOTIFICATION_ID", "PROGRESS_UPDATE_INTERVAL", "mAudioManager", "Landroid/media/AudioManager;", "mCoverArtHeight", "mCurrTrack", "Lcom/simplemobiletools/musicplayer/models/Track;", "getMCurrTrack", "()Lcom/simplemobiletools/musicplayer/models/Track;", "setMCurrTrack", "(Lcom/simplemobiletools/musicplayer/models/Track;)V", "mCurrTrackCover", "Landroid/graphics/Bitmap;", "mEqualizer", "Landroid/media/audiofx/Equalizer;", "getMEqualizer", "()Landroid/media/audiofx/Equalizer;", "setMEqualizer", "(Landroid/media/audiofx/Equalizer;)V", "mHeadsetPlaceholder", "mHeadsetPlugReceiver", "Lcom/simplemobiletools/musicplayer/receivers/HeadsetPlugReceiver;", "mIntentUri", "Landroid/net/Uri;", "mIsServiceInitialized", "", "mIsThirdPartyIntent", "mMediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "mOreoFocusHandler", "Lcom/simplemobiletools/musicplayer/helpers/OreoAudioFocusHandler;", "mPlayOnPrepare", "mPlaybackSpeed", "", "mPlayer", "Landroid/media/MediaPlayer;", "getMPlayer", "()Landroid/media/MediaPlayer;", "setMPlayer", "(Landroid/media/MediaPlayer;)V", "mPrevAudioFocusState", "mProgressHandler", "Landroid/os/Handler;", "mRetriedTrackCount", "mSetProgressOnPrepare", "mSleepTimer", "Landroid/os/CountDownTimer;", "mTracks", "Ljava/util/ArrayList;", "getMTracks", "()Ljava/util/ArrayList;", "setMTracks", "(Ljava/util/ArrayList;)V", "mWasPlayingAtFocusLost", "getIsPlaying", "music-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.simplemobiletools.musicplayer.models.Track getMCurrTrack() {
            return null;
        }
        
        public final void setMCurrTrack(@org.jetbrains.annotations.Nullable()
        com.simplemobiletools.musicplayer.models.Track p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getMTracks() {
            return null;
        }
        
        public final void setMTracks(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.media.MediaPlayer getMPlayer() {
            return null;
        }
        
        public final void setMPlayer(@org.jetbrains.annotations.Nullable()
        android.media.MediaPlayer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.media.audiofx.Equalizer getMEqualizer() {
            return null;
        }
        
        public final void setMEqualizer(@org.jetbrains.annotations.Nullable()
        android.media.audiofx.Equalizer p0) {
        }
        
        public final boolean getIsPlaying() {
            return false;
        }
    }
}