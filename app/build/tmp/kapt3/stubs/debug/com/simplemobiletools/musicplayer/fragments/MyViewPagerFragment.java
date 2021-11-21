package com.simplemobiletools.musicplayer.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0016"}, d2 = {"Lcom/simplemobiletools/musicplayer/fragments/MyViewPagerFragment;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "finishActMode", "", "onSearchClosed", "onSearchOpened", "onSearchQueryChanged", "text", "", "onSortOpen", "activity", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "setupColors", "textColor", "", "adjustedPrimaryColor", "setupFragment", "music-player_debug"})
public abstract class MyViewPagerFragment extends android.widget.RelativeLayout {
    private java.util.HashMap _$_findViewCache;
    
    public MyViewPagerFragment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public abstract void setupFragment(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.activities.SimpleActivity activity);
    
    public abstract void finishActMode();
    
    public abstract void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    public abstract void onSearchOpened();
    
    public abstract void onSearchClosed();
    
    public abstract void onSortOpen(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.activities.SimpleActivity activity);
    
    public abstract void setupColors(int textColor, int adjustedPrimaryColor);
}