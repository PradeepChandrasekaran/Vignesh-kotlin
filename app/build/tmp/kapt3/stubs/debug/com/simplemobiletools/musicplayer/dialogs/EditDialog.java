package com.simplemobiletools.musicplayer.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ \u0010\u0016\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J6\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/simplemobiletools/musicplayer/dialogs/EditDialog;", "", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "track", "Lcom/simplemobiletools/musicplayer/models/Track;", "callback", "Lkotlin/Function1;", "", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;Lcom/simplemobiletools/musicplayer/models/Track;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "tagHelper", "Lcom/simplemobiletools/musicplayer/helpers/TagHelper;", "getTagHelper", "()Lcom/simplemobiletools/musicplayer/helpers/TagHelper;", "tagHelper$delegate", "Lkotlin/Lazy;", "getTrack", "()Lcom/simplemobiletools/musicplayer/models/Track;", "storeEditedSong", "oldPath", "", "newPath", "updateContentResolver", "newArtist", "newTitle", "newAlbum", "onUpdateMediaStore", "Lkotlin/Function0;", "music-player_debug"})
public final class EditDialog {
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.commons.activities.BaseSimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.musicplayer.models.Track track = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.simplemobiletools.musicplayer.models.Track, kotlin.Unit> callback = null;
    private final kotlin.Lazy tagHelper$delegate = null;
    
    public EditDialog(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Track track, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.simplemobiletools.musicplayer.models.Track, kotlin.Unit> callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.commons.activities.BaseSimpleActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.musicplayer.models.Track getTrack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.simplemobiletools.musicplayer.models.Track, kotlin.Unit> getCallback() {
        return null;
    }
    
    private final com.simplemobiletools.musicplayer.helpers.TagHelper getTagHelper() {
        return null;
    }
    
    private final void storeEditedSong(com.simplemobiletools.musicplayer.models.Track track, java.lang.String oldPath, java.lang.String newPath) {
    }
    
    private final void updateContentResolver(com.simplemobiletools.musicplayer.models.Track track, java.lang.String newArtist, java.lang.String newTitle, java.lang.String newAlbum, kotlin.jvm.functions.Function0<kotlin.Unit> onUpdateMediaStore) {
    }
}