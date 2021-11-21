package com.simplemobiletools.musicplayer.interfaces;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\b\u0010\f\u001a\u00020\u0003H\'J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000fH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/simplemobiletools/musicplayer/interfaces/QueueItemsDao;", "", "deleteAllItems", "", "getAll", "", "Lcom/simplemobiletools/musicplayer/models/QueueItem;", "insertAll", "queueItems", "removeQueueItem", "trackId", "", "resetCurrent", "saveCurrentTrack", "lastPosition", "", "setOrder", "order", "music-player_debug"})
public abstract interface QueueItemsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.simplemobiletools.musicplayer.models.QueueItem> queueItems);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM queue_items ORDER BY track_order")
    public abstract java.util.List<com.simplemobiletools.musicplayer.models.QueueItem> getAll();
    
    @androidx.room.Query(value = "UPDATE queue_items SET is_current = 0")
    public abstract void resetCurrent();
    
    @androidx.room.Query(value = "UPDATE queue_items SET is_current = 1, last_position = :lastPosition WHERE track_id = :trackId")
    public abstract void saveCurrentTrack(long trackId, int lastPosition);
    
    @androidx.room.Query(value = "UPDATE queue_items SET track_order = :order WHERE track_id = :trackId")
    public abstract void setOrder(long trackId, int order);
    
    @androidx.room.Query(value = "DELETE FROM queue_items WHERE track_id = :trackId")
    public abstract void removeQueueItem(long trackId);
    
    @androidx.room.Query(value = "DELETE FROM queue_items")
    public abstract void deleteAllItems();
}