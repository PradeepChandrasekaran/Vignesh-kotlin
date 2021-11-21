package com.simplemobiletools.musicplayer.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002DEBQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020\u0014H\u0016J\b\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020\u0014H\u0016J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0016J\u0017\u0010/\u001a\u0004\u0018\u00010\u00142\u0006\u0010+\u001a\u00020\u0014H\u0016\u00a2\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0014H\u0016J\u0012\u00102\u001a\u0004\u0018\u00010\u00062\u0006\u0010.\u001a\u00020\u0014H\u0002J\f\u00103\u001a\u00060\u001aR\u00020\u0000H\u0002J\b\u00104\u001a\u00020\u0014H\u0016J\u0018\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0002J\f\u00106\u001a\u00060\"R\u00020\u0000H\u0002J\b\u00107\u001a\u00020\u0011H\u0016J\b\u00108\u001a\u00020\u0011H\u0016J\u001c\u00109\u001a\u00020\u00112\n\u0010:\u001a\u00060;R\u00020\u00012\u0006\u0010+\u001a\u00020\u0014H\u0016J\u001c\u0010<\u001a\u00060;R\u00020\u00012\u0006\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u0014H\u0016J\u0010\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\u0011H\u0002J\b\u0010C\u001a\u00020\u0011H\u0002R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0018\u00010\u001aR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0018\u00010\"R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/simplemobiletools/musicplayer/adapters/OldSongAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "songs", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/models/Track;", "Lkotlin/collections/ArrayList;", "transparentView", "Landroid/view/View;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "fastScroller", "Lcom/simplemobiletools/commons/views/FastScroller;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;Ljava/util/ArrayList;Landroid/view/View;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lcom/simplemobiletools/commons/views/FastScroller;Lkotlin/jvm/functions/Function1;)V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_NAVIGATION", "VIEW_TYPE_TRANSPARENT", "navigationView", "Landroid/view/ViewGroup;", "navigationViewHolder", "Lcom/simplemobiletools/musicplayer/adapters/OldSongAdapter$NavigationViewHolder;", "getSongs", "()Ljava/util/ArrayList;", "setSongs", "(Ljava/util/ArrayList;)V", "getTransparentView", "()Landroid/view/View;", "transparentViewHolder", "Lcom/simplemobiletools/musicplayer/adapters/OldSongAdapter$TransparentViewHolder;", "actionItemPressed", "id", "displayEditDialog", "getActionMenuId", "getFirstSelectedItemPath", "", "getIsItemSelectable", "", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getItemViewType", "getItemWithKey", "getNavigationViewHolder", "getSelectableItemCount", "getSelectedSongs", "getTransparentViewHolder", "onActionModeCreated", "onActionModeDestroyed", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onCreateViewHolder", "parent", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "shareItems", "showProperties", "NavigationViewHolder", "TransparentViewHolder", "music-player_debug"})
public final class OldSongAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> songs;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View transparentView = null;
    private final int VIEW_TYPE_TRANSPARENT = 0;
    private final int VIEW_TYPE_NAVIGATION = 1;
    private final int VIEW_TYPE_ITEM = 2;
    private com.simplemobiletools.musicplayer.adapters.OldSongAdapter.TransparentViewHolder transparentViewHolder;
    private android.view.ViewGroup navigationView;
    private com.simplemobiletools.musicplayer.adapters.OldSongAdapter.NavigationViewHolder navigationViewHolder;
    
    public OldSongAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> songs, @org.jetbrains.annotations.NotNull()
    android.view.View transparentView, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.FastScroller fastScroller, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getSongs() {
        return null;
    }
    
    public final void setSongs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getTransparentView() {
        return null;
    }
    
    @java.lang.Override()
    public int getActionMenuId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final com.simplemobiletools.musicplayer.models.Track getItemWithKey(int key) {
        return null;
    }
    
    @java.lang.Override()
    public void prepareActionMode(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void actionItemPressed(int id) {
    }
    
    @java.lang.Override()
    public int getSelectableItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean getIsItemSelectable(int position) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getItemSelectionKey(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemKeyPosition(int key) {
        return 0;
    }
    
    @java.lang.Override()
    public void onActionModeCreated() {
    }
    
    @java.lang.Override()
    public void onActionModeDestroyed() {
    }
    
    private final com.simplemobiletools.musicplayer.adapters.OldSongAdapter.TransparentViewHolder getTransparentViewHolder() {
        return null;
    }
    
    private final com.simplemobiletools.musicplayer.adapters.OldSongAdapter.NavigationViewHolder getNavigationViewHolder() {
        return null;
    }
    
    private final void showProperties() {
    }
    
    private final void displayEditDialog() {
    }
    
    private final void shareItems() {
    }
    
    private final java.lang.String getFirstSelectedItemPath() {
        return null;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getSelectedSongs() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/simplemobiletools/musicplayer/adapters/OldSongAdapter$TransparentViewHolder;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "view", "Landroid/view/View;", "(Lcom/simplemobiletools/musicplayer/adapters/OldSongAdapter;Landroid/view/View;)V", "music-player_debug"})
    public final class TransparentViewHolder extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder {
        
        public TransparentViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/simplemobiletools/musicplayer/adapters/OldSongAdapter$NavigationViewHolder;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "view", "Landroid/view/View;", "(Lcom/simplemobiletools/musicplayer/adapters/OldSongAdapter;Landroid/view/View;)V", "music-player_debug"})
    public final class NavigationViewHolder extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder {
        
        public NavigationViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}