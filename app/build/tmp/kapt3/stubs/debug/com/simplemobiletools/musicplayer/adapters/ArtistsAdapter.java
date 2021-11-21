package com.simplemobiletools.musicplayer.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0006H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0014H\u0016J\b\u0010$\u001a\u00020\u0014H\u0016J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0014H\u0016J\u0017\u0010\'\u001a\u0004\u0018\u00010\u00142\u0006\u0010#\u001a\u00020\u0014H\u0016\u00a2\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0014H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070+H\u0002J\b\u0010,\u001a\u00020\rH\u0016J\b\u0010-\u001a\u00020\rH\u0016J\u001c\u0010.\u001a\u00020\r2\n\u0010/\u001a\u000600R\u00020\u00012\u0006\u0010#\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0014H\u0016J\u001c\u00102\u001a\u000600R\u00020\u00012\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0014H\u0016J\u0010\u00106\u001a\u00020\r2\u0006\u00107\u001a\u000208H\u0016J\u0018\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0007H\u0002J(\u0010=\u001a\u00020\r2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010?\u001a\u00020\u00182\b\b\u0002\u0010@\u001a\u00020\"R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/simplemobiletools/musicplayer/adapters/ArtistsAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "Lcom/qtalk/recyclerviewfastscroller/RecyclerViewFastScroller$OnPopupTextUpdate;", "activity", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "artists", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/models/Artist;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "getArtists", "()Ljava/util/ArrayList;", "setArtists", "(Ljava/util/ArrayList;)V", "cornerRadius", "", "placeholder", "Landroid/graphics/drawable/Drawable;", "textToHighlight", "", "actionItemPressed", "id", "addToPlaylist", "addToQueue", "askConfirmDelete", "getActionMenuId", "getAllSelectedTracks", "Lcom/simplemobiletools/musicplayer/models/Track;", "getIsItemSelectable", "", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getSelectableItemCount", "getSelectedArtists", "", "onActionModeCreated", "onActionModeDestroyed", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onChange", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "setupView", "view", "Landroid/view/View;", "artist", "updateItems", "newItems", "highlightText", "forceUpdate", "music-player_debug"})
public final class ArtistsAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter implements com.qtalk.recyclerviewfastscroller.RecyclerViewFastScroller.OnPopupTextUpdate {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.musicplayer.models.Artist> artists;
    private java.lang.String textToHighlight = "";
    private final android.graphics.drawable.Drawable placeholder = null;
    private final int cornerRadius = 0;
    
    public ArtistsAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.Artist> artists, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Artist> getArtists() {
        return null;
    }
    
    public final void setArtists(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.Artist> p0) {
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
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
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
    
    private final void addToPlaylist() {
    }
    
    private final void addToQueue() {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getAllSelectedTracks() {
        return null;
    }
    
    private final void askConfirmDelete() {
    }
    
    private final java.util.List<com.simplemobiletools.musicplayer.models.Artist> getSelectedArtists() {
        return null;
    }
    
    public final void updateItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.Artist> newItems, @org.jetbrains.annotations.NotNull()
    java.lang.String highlightText, boolean forceUpdate) {
    }
    
    private final void setupView(android.view.View view, com.simplemobiletools.musicplayer.models.Artist artist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String onChange(int position) {
        return null;
    }
}