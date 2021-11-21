package com.simplemobiletools.musicplayer.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0002J\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0006H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0016J\b\u0010%\u001a\u00020\u0010H\u0016J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\u0010H\u0016J\u0017\u0010(\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020\u0010H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020!0\u0006H\u0002J\b\u00100\u001a\u00020\rH\u0016J\b\u00101\u001a\u00020\rH\u0016J\u001c\u00102\u001a\u00020\r2\n\u00103\u001a\u000604R\u00020\u00012\u0006\u0010$\u001a\u00020\u0010H\u0016J\u0010\u00105\u001a\u0002062\u0006\u0010$\u001a\u00020\u0010H\u0016J\u001c\u00107\u001a\u000604R\u00020\u00012\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0010H\u0016J\u0010\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020.H\u0002J\u0018\u0010B\u001a\u00020\r2\u0006\u0010?\u001a\u00020@2\u0006\u0010C\u001a\u00020DH\u0002J\u0018\u0010E\u001a\u00020\r2\u0006\u0010?\u001a\u00020@2\u0006\u0010F\u001a\u00020!H\u0002J\b\u0010G\u001a\u00020\rH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/simplemobiletools/musicplayer/adapters/AlbumsTracksAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "Lcom/qtalk/recyclerviewfastscroller/RecyclerViewFastScroller$OnPopupTextUpdate;", "activity", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "items", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/models/ListItem;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "ITEM_ALBUM", "", "ITEM_SECTION", "ITEM_TRACK", "cornerRadius", "getItems", "()Ljava/util/ArrayList;", "placeholder", "Landroid/graphics/drawable/Drawable;", "placeholderBig", "actionItemPressed", "id", "addToPlaylist", "addToQueue", "askConfirmDelete", "displayEditDialog", "getActionMenuId", "getAllSelectedTracks", "Lcom/simplemobiletools/musicplayer/models/Track;", "getIsItemSelectable", "", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getItemViewType", "getSelectableItemCount", "getSelectedAlbums", "", "Lcom/simplemobiletools/musicplayer/models/Album;", "getSelectedTracks", "onActionModeCreated", "onActionModeDestroyed", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onChange", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "setupAlbum", "view", "Landroid/view/View;", "album", "setupSection", "section", "Lcom/simplemobiletools/musicplayer/models/AlbumSection;", "setupTrack", "track", "showProperties", "music-player_debug"})
public final class AlbumsTracksAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter implements com.qtalk.recyclerviewfastscroller.RecyclerViewFastScroller.OnPopupTextUpdate {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.simplemobiletools.musicplayer.models.ListItem> items = null;
    private final int ITEM_SECTION = 0;
    private final int ITEM_ALBUM = 1;
    private final int ITEM_TRACK = 2;
    private final android.graphics.drawable.Drawable placeholder = null;
    private final android.graphics.drawable.Drawable placeholderBig = null;
    private final int cornerRadius = 0;
    
    public AlbumsTracksAdapter(@org.jetbrains.annotations.NotNull()
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
    
    private final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getAllSelectedTracks() {
        return null;
    }
    
    private final java.util.List<com.simplemobiletools.musicplayer.models.Album> getSelectedAlbums() {
        return null;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getSelectedTracks() {
        return null;
    }
    
    private final void setupAlbum(android.view.View view, com.simplemobiletools.musicplayer.models.Album album) {
    }
    
    private final void setupTrack(android.view.View view, com.simplemobiletools.musicplayer.models.Track track) {
    }
    
    private final void setupSection(android.view.View view, com.simplemobiletools.musicplayer.models.AlbumSection section) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence onChange(int position) {
        return null;
    }
    
    private final void displayEditDialog() {
    }
}