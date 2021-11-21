package com.simplemobiletools.musicplayer.interfaces;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.simplemobiletools.musicplayer.models.Track;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SongsDao_Impl implements SongsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Track> __insertionAdapterOfTrack;

  private final EntityDeletionOrUpdateAdapter<Track> __deletionAdapterOfTrack;

  private final SharedSQLiteStatement __preparedStmtOfRemoveTrack;

  private final SharedSQLiteStatement __preparedStmtOfRemovePlaylistSongs;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSongInfo;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCoverArt;

  public SongsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrack = new EntityInsertionAdapter<Track>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tracks` (`id`,`media_store_id`,`title`,`artist`,`path`,`duration`,`album`,`cover_art`,`playlist_id`,`track_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Track value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getMediaStoreId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getArtist() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getArtist());
        }
        if (value.getPath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPath());
        }
        stmt.bindLong(6, value.getDuration());
        if (value.getAlbum() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAlbum());
        }
        if (value.getCoverArt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCoverArt());
        }
        stmt.bindLong(9, value.getPlayListId());
        stmt.bindLong(10, value.getTrackId());
      }
    };
    this.__deletionAdapterOfTrack = new EntityDeletionOrUpdateAdapter<Track>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `tracks` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Track value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfRemoveTrack = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tracks WHERE media_store_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfRemovePlaylistSongs = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tracks WHERE playlist_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSongInfo = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE tracks SET path = ?, artist = ?, title = ? WHERE path = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCoverArt = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE tracks SET cover_art = ? WHERE media_store_id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Track track) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTrack.insert(track);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<Track> tracks) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTrack.insert(tracks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void removeSongsFromPlaylists(final List<Track> songs) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTrack.handleMultiple(songs);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void removeTrack(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveTrack.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemoveTrack.release(_stmt);
    }
  }

  @Override
  public void removePlaylistSongs(final int playlistId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemovePlaylistSongs.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, playlistId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemovePlaylistSongs.release(_stmt);
    }
  }

  @Override
  public void updateSongInfo(final String newPath, final String artist, final String title,
      final String oldPath) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSongInfo.acquire();
    int _argIndex = 1;
    if (newPath == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, newPath);
    }
    _argIndex = 2;
    if (artist == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, artist);
    }
    _argIndex = 3;
    if (title == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, title);
    }
    _argIndex = 4;
    if (oldPath == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, oldPath);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateSongInfo.release(_stmt);
    }
  }

  @Override
  public void updateCoverArt(final String coverArt, final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCoverArt.acquire();
    int _argIndex = 1;
    if (coverArt == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, coverArt);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateCoverArt.release(_stmt);
    }
  }

  @Override
  public List<Track> getAll() {
    final String _sql = "SELECT * FROM tracks";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMediaStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "media_store_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "artist");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final int _cursorIndexOfAlbum = CursorUtil.getColumnIndexOrThrow(_cursor, "album");
      final int _cursorIndexOfCoverArt = CursorUtil.getColumnIndexOrThrow(_cursor, "cover_art");
      final int _cursorIndexOfPlayListId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_id");
      final int _cursorIndexOfTrackId = CursorUtil.getColumnIndexOrThrow(_cursor, "track_id");
      final List<Track> _result = new ArrayList<Track>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Track _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMediaStoreId;
        _tmpMediaStoreId = _cursor.getLong(_cursorIndexOfMediaStoreId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpArtist;
        if (_cursor.isNull(_cursorIndexOfArtist)) {
          _tmpArtist = null;
        } else {
          _tmpArtist = _cursor.getString(_cursorIndexOfArtist);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final int _tmpDuration;
        _tmpDuration = _cursor.getInt(_cursorIndexOfDuration);
        final String _tmpAlbum;
        if (_cursor.isNull(_cursorIndexOfAlbum)) {
          _tmpAlbum = null;
        } else {
          _tmpAlbum = _cursor.getString(_cursorIndexOfAlbum);
        }
        final String _tmpCoverArt;
        if (_cursor.isNull(_cursorIndexOfCoverArt)) {
          _tmpCoverArt = null;
        } else {
          _tmpCoverArt = _cursor.getString(_cursorIndexOfCoverArt);
        }
        final int _tmpPlayListId;
        _tmpPlayListId = _cursor.getInt(_cursorIndexOfPlayListId);
        final int _tmpTrackId;
        _tmpTrackId = _cursor.getInt(_cursorIndexOfTrackId);
        _item = new Track(_tmpId,_tmpMediaStoreId,_tmpTitle,_tmpArtist,_tmpPath,_tmpDuration,_tmpAlbum,_tmpCoverArt,_tmpPlayListId,_tmpTrackId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Track> getTracksFromPlaylist(final int playlistId) {
    final String _sql = "SELECT * FROM tracks WHERE playlist_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, playlistId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMediaStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "media_store_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "artist");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final int _cursorIndexOfAlbum = CursorUtil.getColumnIndexOrThrow(_cursor, "album");
      final int _cursorIndexOfCoverArt = CursorUtil.getColumnIndexOrThrow(_cursor, "cover_art");
      final int _cursorIndexOfPlayListId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_id");
      final int _cursorIndexOfTrackId = CursorUtil.getColumnIndexOrThrow(_cursor, "track_id");
      final List<Track> _result = new ArrayList<Track>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Track _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMediaStoreId;
        _tmpMediaStoreId = _cursor.getLong(_cursorIndexOfMediaStoreId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpArtist;
        if (_cursor.isNull(_cursorIndexOfArtist)) {
          _tmpArtist = null;
        } else {
          _tmpArtist = _cursor.getString(_cursorIndexOfArtist);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final int _tmpDuration;
        _tmpDuration = _cursor.getInt(_cursorIndexOfDuration);
        final String _tmpAlbum;
        if (_cursor.isNull(_cursorIndexOfAlbum)) {
          _tmpAlbum = null;
        } else {
          _tmpAlbum = _cursor.getString(_cursorIndexOfAlbum);
        }
        final String _tmpCoverArt;
        if (_cursor.isNull(_cursorIndexOfCoverArt)) {
          _tmpCoverArt = null;
        } else {
          _tmpCoverArt = _cursor.getString(_cursorIndexOfCoverArt);
        }
        final int _tmpPlayListId;
        _tmpPlayListId = _cursor.getInt(_cursorIndexOfPlayListId);
        final int _tmpTrackId;
        _tmpTrackId = _cursor.getInt(_cursorIndexOfTrackId);
        _item = new Track(_tmpId,_tmpMediaStoreId,_tmpTitle,_tmpArtist,_tmpPath,_tmpDuration,_tmpAlbum,_tmpCoverArt,_tmpPlayListId,_tmpTrackId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getTracksCountFromPlaylist(final int playlistId) {
    final String _sql = "SELECT COUNT(*) FROM tracks WHERE playlist_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, playlistId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Track getTrackWithMediaStoreId(final long mediaStoreId) {
    final String _sql = "SELECT * FROM tracks WHERE media_store_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, mediaStoreId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMediaStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "media_store_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "artist");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final int _cursorIndexOfAlbum = CursorUtil.getColumnIndexOrThrow(_cursor, "album");
      final int _cursorIndexOfCoverArt = CursorUtil.getColumnIndexOrThrow(_cursor, "cover_art");
      final int _cursorIndexOfPlayListId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_id");
      final int _cursorIndexOfTrackId = CursorUtil.getColumnIndexOrThrow(_cursor, "track_id");
      final Track _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMediaStoreId;
        _tmpMediaStoreId = _cursor.getLong(_cursorIndexOfMediaStoreId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpArtist;
        if (_cursor.isNull(_cursorIndexOfArtist)) {
          _tmpArtist = null;
        } else {
          _tmpArtist = _cursor.getString(_cursorIndexOfArtist);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final int _tmpDuration;
        _tmpDuration = _cursor.getInt(_cursorIndexOfDuration);
        final String _tmpAlbum;
        if (_cursor.isNull(_cursorIndexOfAlbum)) {
          _tmpAlbum = null;
        } else {
          _tmpAlbum = _cursor.getString(_cursorIndexOfAlbum);
        }
        final String _tmpCoverArt;
        if (_cursor.isNull(_cursorIndexOfCoverArt)) {
          _tmpCoverArt = null;
        } else {
          _tmpCoverArt = _cursor.getString(_cursorIndexOfCoverArt);
        }
        final int _tmpPlayListId;
        _tmpPlayListId = _cursor.getInt(_cursorIndexOfPlayListId);
        final int _tmpTrackId;
        _tmpTrackId = _cursor.getInt(_cursorIndexOfTrackId);
        _result = new Track(_tmpId,_tmpMediaStoreId,_tmpTitle,_tmpArtist,_tmpPath,_tmpDuration,_tmpAlbum,_tmpCoverArt,_tmpPlayListId,_tmpTrackId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
