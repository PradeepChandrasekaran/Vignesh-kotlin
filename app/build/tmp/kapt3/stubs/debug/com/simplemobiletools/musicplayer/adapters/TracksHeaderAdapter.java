package com.simplemobiletools.musicplayer.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\b\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0002J\b\u0010#\u001a\u00020\u0010H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0010H\u0016J\b\u0010\'\u001a\u00020\u0010H\u0016J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0010H\u0016J\u0017\u0010*\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016J\b\u0010-\u001a\u00020\u0010H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\b\u00101\u001a\u00020\rH\u0016J\b\u00102\u001a\u00020\rH\u0016J\u001c\u00103\u001a\u00020\r2\n\u00104\u001a\u000605R\u00020\u00012\u0006\u0010&\u001a\u00020\u0010H\u0016J\u0010\u00106\u001a\u0002072\u0006\u0010&\u001a\u00020\u0010H\u0016J\u001c\u00108\u001a\u000605R\u00020\u00012\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0010H\u0016J\u0010\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020>H\u0016J\u0018\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0018\u0010D\u001a\u00020\r2\u0006\u0010@\u001a\u00020A2\u0006\u0010E\u001a\u000200H\u0002J\b\u0010F\u001a\u00020\rH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006G"}, d2 = {"Lcom/simplemobiletools/musicplayer/adapters/TracksHeaderAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "Lcom/qtalk/recyclerviewfastscroller/RecyclerViewFastScroller$OnPopupTextUpdate;", "activity", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "items", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/models/ListItem;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "ITEM_HEADER", "", "ITEM_TRACK", "cornerRadius", "getItems", "()Ljava/util/ArrayList;", "placeholder", "Landroid/graphics/drawable/Drawable;", "tagHelper", "Lcom/simplemobiletools/musicplayer/helpers/TagHelper;", "getTagHelper", "()Lcom/simplemobiletools/musicplayer/helpers/TagHelper;", "tagHelper$delegate", "Lkotlin/Lazy;", "actionItemPressed", "id", "addToPlaylist", "addToQueue", "askConfirmDelete", "displayEditDialog", "getActionMenuId", "getIsItemSelectable", "", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getItemViewType", "getSelectableItemCount", "getSelectedTracks", "", "Lcom/simplemobiletools/musicplayer/models/Track;", "onActionModeCreated", "onActionModeDestroyed", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onChange", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "setupHeader", "view", "Landroid/view/View;", "header", "Lcom/simplemobiletools/musicplayer/models/AlbumHeader;", "setupTrack", "track", "showProperties", "music-player_debug"})
public final class TracksHeaderAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter implements com.qtalk.recyclerviewfastscroller.RecyclerViewFastScroller.OnPopupTextUpdate {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.simplemobiletools.musicplayer.models.ListItem> items = null;
    private final int ITEM_HEADER = 0;
    private final int ITEM_TRACK = 1;
    private final android.graphics.drawable.Drawable placeholder = null;
    private final int cornerRadius = 0;
    private final kotlin.Lazy tagHelper$delegate = null;
    
    public TracksHeaderAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.ListItem> items, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.musicplayer.models.ListItem> getItems() {
        return null;
    }
    
    private final com.simplemobiletools.musicplayer.helpers.TagHelper getTagHelper() {
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
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
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
    
    private final void showProperties() {
    }
    
    private final void askConfirmDelete() {
    }
    
    private final java.util.List<com.simplemobiletools.musicplayer.models.Track> getSelectedTracks() {
        return null;
    }
    
    private final void setupTrack(android.view.View view, com.simplemobiletools.musicplayer.models.Track track) {
    }
    
    private final void setupHeader(android.view.View view, com.simplemobiletools.musicplayer.models.AlbumHeader header) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence onChange(int position) {
        return null;
    }
    
    private final void displayEditDialog() {
    }
}