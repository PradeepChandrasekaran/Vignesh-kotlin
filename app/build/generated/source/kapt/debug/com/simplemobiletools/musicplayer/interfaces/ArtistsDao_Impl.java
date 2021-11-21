package com.simplemobiletools.musicplayer.interfaces;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.simplemobiletools.musicplayer.models.Artist;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ArtistsDao_Impl implements ArtistsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Artist> __insertionAdapterOfArtist;

  private final SharedSQLiteStatement __preparedStmtOfDeleteArtist;

  public ArtistsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArtist = new EntityInsertionAdapter<Artist>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `artists` (`id`,`title`,`album_cnt`,`track_cnt`,`album_art_id`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Artist value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getAlbumCnt());
        stmt.bindLong(4, value.getTrackCnt());
        stmt.bindLong(5, value.getAlbumArtId());
      }
    };
    this.__preparedStmtOfDeleteArtist = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM artists WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final Artist artist) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfArtist.insertAndReturnId(artist);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteArtist(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteArtist.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteArtist.release(_stmt);
    }
  }

  @Override
  public List<Artist> getAll() {
    final String _sql = "SELECT * FROM artists";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfAlbumCnt = CursorUtil.getColumnIndexOrThrow(_cursor, "album_cnt");
      final int _cursorIndexOfTrackCnt = CursorUtil.getColumnIndexOrThrow(_cursor, "track_cnt");
      final int _cursorIndexOfAlbumArtId = CursorUtil.getColumnIndexOrThrow(_cursor, "album_art_id");
      final List<Artist> _result = new ArrayList<Artist>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Artist _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final int _tmpAlbumCnt;
        _tmpAlbumCnt = _cursor.getInt(_cursorIndexOfAlbumCnt);
        final int _tmpTrackCnt;
        _tmpTrackCnt = _cursor.getInt(_cursorIndexOfTrackCnt);
        final long _tmpAlbumArtId;
        _tmpAlbumArtId = _cursor.getLong(_cursorIndexOfAlbumArtId);
        _item = new Artist(_tmpId,_tmpTitle,_tmpAlbumCnt,_tmpTrackCnt,_tmpAlbumArtId);
        _result.add(_item);
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
