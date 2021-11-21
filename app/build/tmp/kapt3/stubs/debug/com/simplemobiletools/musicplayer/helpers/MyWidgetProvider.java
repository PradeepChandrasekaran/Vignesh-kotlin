package com.simplemobiletools.musicplayer.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\bH\u0002J(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\bH\u0002J \u0010#\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0002J\u001a\u0010&\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0002\u00a8\u0006)"}, d2 = {"Lcom/simplemobiletools/musicplayer/helpers/MyWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "getComponentName", "Landroid/content/ComponentName;", "context", "Landroid/content/Context;", "getRemoteViews", "Landroid/widget/RemoteViews;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "widgetId", "", "onAppWidgetOptionsChanged", "", "newOptions", "Landroid/os/Bundle;", "onEnabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetIds", "", "performUpdate", "setupAppOpenIntent", "views", "id", "setupButtons", "setupIntent", "action", "", "songChanged", "songStateChanged", "updateColors", "updatePlayPauseButton", "isPlaying", "", "updateSongInfo", "currSong", "Lcom/simplemobiletools/musicplayer/models/Track;", "music-player_debug"})
public final class MyWidgetProvider extends android.appwidget.AppWidgetProvider {
    
    public MyWidgetProvider() {
        super();
    }
    
    @java.lang.Override()
    public void onUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds) {
    }
    
    private final void performUpdate(android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onAppWidgetOptionsChanged(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, int widgetId, @org.jetbrains.annotations.NotNull()
    android.os.Bundle newOptions) {
    }
    
    private final void setupIntent(android.content.Context context, android.widget.RemoteViews views, java.lang.String action, int id) {
    }
    
    private final void setupAppOpenIntent(android.content.Context context, android.widget.RemoteViews views, int id) {
    }
    
    private final void songChanged(android.content.Context context, android.content.Intent intent) {
    }
    
    private final void updateSongInfo(android.widget.RemoteViews views, com.simplemobiletools.musicplayer.models.Track currSong) {
    }
    
    private final void songStateChanged(android.content.Context context, android.content.Intent intent) {
    }
    
    private final void updatePlayPauseButton(android.content.Context context, android.widget.RemoteViews views, boolean isPlaying) {
    }
    
    private final void updateColors(android.content.Context context, android.widget.RemoteViews views) {
    }
    
    private final void setupButtons(android.content.Context context, android.widget.RemoteViews views) {
    }
    
    private final android.widget.RemoteViews getRemoteViews(android.appwidget.AppWidgetManager appWidgetManager, android.content.Context context, int widgetId) {
        return null;
    }
    
    private final android.content.ComponentName getComponentName(android.content.Context context) {
        return null;
    }
}