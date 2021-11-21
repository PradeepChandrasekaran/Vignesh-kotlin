package com.simplemobiletools.musicplayer.interfaces;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.simplemobiletools.musicplayer.models.Album;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AlbumsDao_Impl implements AlbumsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Album> __insertionAdapterOfAlbum;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAlbum;

  public AlbumsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAlbum = new EntityInsertionAdapter<Album>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `albums` (`id`,`artist`,`title`,`cover_art`,`year`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Album value) {
        stmt.bindLong(1, value.getId());
        if (value.getArtist() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getArtist());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getCoverArt() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCoverArt());
        }
        stmt.bindLong(5, value.getYear());
      }
    };
    this.__preparedStmtOfDeleteAlbum = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM albums WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final Album album) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfAlbum.insertAndReturnId(album);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAlbum(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAlbum.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAlbum.release(_stmt);
    }
  }

  @Override
  public List<Album> getAll() {
    final String _sql = "SELECT * FROM albums";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "artist");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfCoverArt = CursorUtil.getColumnIndexOrThrow(_cursor, "cover_art");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final List<Album> _result = new ArrayList<Album>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Album _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpArtist;
        if (_cursor.isNull(_cursorIndexOfArtist)) {
          _tmpArtist = null;
        } else {
          _tmpArtist = _cursor.getString(_cursorIndexOfArtist);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpCoverArt;
        if (_cursor.isNull(_cursorIndexOfCoverArt)) {
          _tmpCoverArt = null;
        } else {
          _tmpCoverArt = _cursor.getString(_cursorIndexOfCoverArt);
        }
        final int _tmpYear;
        _tmpYear = _cursor.getInt(_cursorIndexOfYear);
        _item = new Album(_tmpId,_tmpArtist,_tmpTitle,_tmpCoverArt,_tmpYear);
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
