package com.simplemobiletools.musicplayer.models;

import java.lang.System;

@androidx.room.Entity(tableName = "queue_items", primaryKeys = {"track_id"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/simplemobiletools/musicplayer/models/QueueItem;", "", "trackId", "", "trackOrder", "", "isCurrent", "", "lastPosition", "(JIZI)V", "()Z", "setCurrent", "(Z)V", "getLastPosition", "()I", "setLastPosition", "(I)V", "getTrackId", "()J", "setTrackId", "(J)V", "getTrackOrder", "setTrackOrder", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "music-player_debug"})
public final class QueueItem {
    @androidx.room.ColumnInfo(name = "track_id")
    private long trackId;
    @androidx.room.ColumnInfo(name = "track_order")
    private int trackOrder;
    @androidx.room.ColumnInfo(name = "is_current")
    private boolean isCurrent;
    @androidx.room.ColumnInfo(name = "last_position")
    private int lastPosition;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.musicplayer.models.QueueItem copy(long trackId, int trackOrder, boolean isCurrent, int lastPosition) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public QueueItem(long trackId, int trackOrder, boolean isCurrent, int lastPosition) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getTrackId() {
        return 0L;
    }
    
    public final void setTrackId(long p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTrackOrder() {
        return 0;
    }
    
    public final void setTrackOrder(int p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isCurrent() {
        return false;
    }
    
    public final void setCurrent(boolean p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getLastPosition() {
        return 0;
    }
    
    public final void setLastPosition(int p0) {
    }
}