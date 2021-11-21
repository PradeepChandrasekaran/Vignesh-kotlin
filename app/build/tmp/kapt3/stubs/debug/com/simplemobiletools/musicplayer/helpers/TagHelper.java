package com.simplemobiletools.musicplayer.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/simplemobiletools/musicplayer/helpers/TagHelper;", "", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;)V", "createTag", "Lorg/jaudiotagger/tag/Tag;", "extension", "", "isEditTagSupported", "", "track", "Lcom/simplemobiletools/musicplayer/models/Track;", "updateContentResolver", "", "writeTag", "newArtist", "newTitle", "newAlbum", "Companion", "music-player_debug"})
public final class TagHelper {
    private final com.simplemobiletools.commons.activities.BaseSimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.simplemobiletools.musicplayer.helpers.TagHelper.Companion Companion = null;
    private static final java.lang.String TEMP_FOLDER = "music";
    private static final java.util.List<java.lang.String> EXCLUDED_EXTENSIONS = null;
    private static final java.util.List<java.lang.String> SUPPORTED_EXTENSIONS = null;
    
    public TagHelper(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity) {
        super();
    }
    
    public final boolean isEditTagSupported(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Track track) {
        return false;
    }
    
    public final void writeTag(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.musicplayer.models.Track track, @org.jetbrains.annotations.NotNull()
    java.lang.String newArtist, @org.jetbrains.annotations.NotNull()
    java.lang.String newTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String newAlbum) {
    }
    
    private final org.jaudiotagger.tag.Tag createTag(java.lang.String extension) {
        return null;
    }
    
    private final void updateContentResolver(com.simplemobiletools.musicplayer.models.Track track) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/simplemobiletools/musicplayer/helpers/TagHelper$Companion;", "", "()V", "EXCLUDED_EXTENSIONS", "", "", "SUPPORTED_EXTENSIONS", "kotlin.jvm.PlatformType", "TEMP_FOLDER", "music-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}