package com.simplemobiletools.musicplayer.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010$\u001a\u00020\u000fH\u0002J\b\u0010%\u001a\u00020\u000fH\u0002J\b\u0010&\u001a\u00020\u000fH\u0002J\b\u0010\'\u001a\u00020\u000fH\u0002J\b\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0012H\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0016J\u0017\u0010.\u001a\u0004\u0018\u00010\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016\u00a2\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u0012H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u000702H\u0002J\b\u00103\u001a\u00020\u000fH\u0016J\b\u00104\u001a\u00020\u000fH\u0016J\u001c\u00105\u001a\u00020\u000f2\n\u00106\u001a\u000607R\u00020\u00012\u0006\u0010*\u001a\u00020\u0012H\u0016J\u0010\u00108\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0012H\u0016J\u001c\u00109\u001a\u000607R\u00020\u00012\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0012H\u0016J\u0010\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020\u000fH\u0002J\u0018\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0007H\u0002J\b\u0010E\u001a\u00020\u000fH\u0002J(\u0010F\u001a\u00020\u000f2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010H\u001a\u00020\u001d2\b\b\u0002\u0010I\u001a\u00020\tR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006J"}, d2 = {"Lcom/simplemobiletools/musicplayer/adapters/TracksAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "Lcom/qtalk/recyclerviewfastscroller/RecyclerViewFastScroller$OnPopupTextUpdate;", "activity", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "tracks", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/models/Track;", "isPlaylistContent", "", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;Ljava/util/ArrayList;ZLcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "cornerRadius", "", "()Z", "placeholder", "Landroid/graphics/drawable/Drawable;", "tagHelper", "Lcom/simplemobiletools/musicplayer/helpers/TagHelper;", "getTagHelper", "()Lcom/simplemobiletools/musicplayer/helpers/TagHelper;", "tagHelper$delegate", "Lkotlin/Lazy;", "textToHighlight", "", "getTracks", "()Ljava/util/ArrayList;", "setTracks", "(Ljava/util/ArrayList;)V", "actionItemPressed", "id", "addToPlaylist", "addToQueue", "askConfirmDelete", "displayEditDialog", "getActionMenuId", "getIsItemSelectable", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getSelectableItemCount", "getSelectedTracks", "", "onActionModeCreated", "onActionModeDestroyed", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onChange", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "removeFromPlaylist", "setupView", "view", "Landroid/view/View;", "track", "showProperties", "updateItems", "newItems", "highlightText", "forceUpdate", "music-player_debug"})
public final class TracksAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter implements com.qtalk.recyclerviewfastscroller.RecyclerViewFastScroller.OnPopupTextUpdate {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> tracks;
    private final boolean isPlaylistContent = false;
    private final kotlin.Lazy tagHelper$delegate = null;
    private java.lang.String textToHighlight = "";
    private final android.graphics.drawable.Drawable placeholder = null;
    private final int cornerRadius = 0;
    
    public TracksAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> tracks, boolean isPlaylistContent, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getTracks() {
        return null;
    }
    
    public final void setTracks(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> p0) {
    }
    
    public final boolean isPlaylistContent() {
        return false;
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
    
    private final void removeFromPlaylist() {
    }
    
    private final void askConfirmDelete() {
    }
    
    private final java.util.List<com.simplemobiletools.musicplayer.models.Track> getSelectedTracks() {
        return null;
    }
    
    public final void updateItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> newItems, @org.jetbrains.annotations.NotNull()
    java.lang.String highlightText, boolean forceUpdate) {
    }
    
    private final void setupView(android.view.View view, com.simplemobiletools.musicplayer.models.Track track) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String onChange(int position) {
        return null;
    }
    
    private final void displayEditDialog() {
    }
}