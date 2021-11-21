package com.simplemobiletools.musicplayer.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0011H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0&H\u0002J\b\u0010\'\u001a\u00020\u000eH\u0016J\b\u0010(\u001a\u00020\u000eH\u0016J\u001c\u0010)\u001a\u00020\u000e2\n\u0010*\u001a\u00060+R\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u001c\u0010.\u001a\u00060+R\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0011H\u0016J\u0016\u00102\u001a\u00020\u000e2\f\u00103\u001a\b\u0018\u00010+R\u00020\u0001H\u0016J\u0018\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0011H\u0016J\u0016\u00107\u001a\u00020\u000e2\f\u00103\u001a\b\u0018\u00010+R\u00020\u0001H\u0016J\u0010\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u000eH\u0002J$\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\b2\n\u0010*\u001a\u00060+R\u00020\u0001H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/simplemobiletools/musicplayer/adapters/QueueAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "Lcom/simplemobiletools/commons/interfaces/ItemTouchHelperContract;", "Lcom/qtalk/recyclerviewfastscroller/RecyclerViewFastScroller$OnPopupTextUpdate;", "activity", "Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;", "items", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/musicplayer/models/Track;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/musicplayer/activities/SimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "cornerRadius", "", "getItems", "()Ljava/util/ArrayList;", "placeholder", "Landroid/graphics/drawable/Drawable;", "startReorderDragListener", "Lcom/simplemobiletools/commons/interfaces/StartReorderDragListener;", "actionItemPressed", "id", "addToPlaylist", "getActionMenuId", "getIsItemSelectable", "", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getSelectableItemCount", "getSelectedTracks", "", "onActionModeCreated", "onActionModeDestroyed", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onChange", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onRowClear", "myViewHolder", "onRowMoved", "fromPosition", "toPosition", "onRowSelected", "prepareActionMode", "menu", "Landroid/view/Menu;", "removeFromQueue", "setupView", "view", "Landroid/view/View;", "track", "music-player_debug"})
public final class QueueAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter implements com.simplemobiletools.commons.interfaces.ItemTouchHelperContract, com.qtalk.recyclerviewfastscroller.RecyclerViewFastScroller.OnPopupTextUpdate {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> items = null;
    private final android.graphics.drawable.Drawable placeholder = null;
    private com.simplemobiletools.commons.interfaces.StartReorderDragListener startReorderDragListener;
    private final int cornerRadius = 0;
    
    public QueueAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> items, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.musicplayer.models.Track> getItems() {
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
    
    private final void removeFromQueue() {
    }
    
    private final void addToPlaylist() {
    }
    
    private final java.util.List<com.simplemobiletools.musicplayer.models.Track> getSelectedTracks() {
        return null;
    }
    
    private final void setupView(android.view.View view, com.simplemobiletools.musicplayer.models.Track track, com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public void onRowMoved(int fromPosition, int toPosition) {
    }
    
    @java.lang.Override()
    public void onRowClear(@org.jetbrains.annotations.Nullable()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder myViewHolder) {
    }
    
    @java.lang.Override()
    public void onRowSelected(@org.jetbrains.annotations.Nullable()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder myViewHolder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String onChange(int position) {
        return null;
    }
}