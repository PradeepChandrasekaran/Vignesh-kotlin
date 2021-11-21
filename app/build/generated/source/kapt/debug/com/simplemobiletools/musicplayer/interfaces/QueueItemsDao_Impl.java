package com.simplemobiletools.musicplayer.interfaces;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.simplemobiletools.musicplayer.models.QueueItem;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QueueItemsDao_Impl implements QueueItemsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<QueueItem> __insertionAdapterOfQueueItem;

  private final SharedSQLiteStatement __preparedStmtOfResetCurrent;

  private final SharedSQLiteStatement __preparedStmtOfSaveCurrentTrack;

  private final SharedSQLiteStatement __preparedStmtOfSetOrder;

  private final SharedSQLiteStatement __preparedStmtOfRemoveQueueItem;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllItems;

  public QueueItemsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQueueItem = new EntityInsertionAdapter<QueueItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `queue_items` (`track_id`,`track_order`,`is_current`,`last_position`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, QueueItem value) {
        stmt.bindLong(1, value.getTrackId());
        stmt.bindLong(2, value.getTrackOrder());
        final int _tmp;
        _tmp = value.isCurrent() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getLastPosition());
      }
    };
    this.__preparedStmtOfResetCurrent = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE queue_items SET is_current = 0";
        return _query;
      }
    };
    this.__preparedStmtOfSaveCurrentTrack = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE queue_items SET is_current = 1, last_position = ? WHERE track_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetOrder = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE queue_items SET track_order = ? WHERE track_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfRemoveQueueItem = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM queue_items WHERE track_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllItems = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM queue_items";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<QueueItem> queueItems) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfQueueItem.insert(queueItems);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void resetCurrent() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfResetCurrent.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfResetCurrent.release(_stmt);
    }
  }

  @Override
  public void saveCurrentTrack(final long trackId, final int lastPosition) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSaveCurrentTrack.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, lastPosition);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, trackId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSaveCurrentTrack.release(_stmt);
    }
  }

  @Override
  public void setOrder(final long trackId, final int order) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetOrder.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, order);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, trackId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetOrder.release(_stmt);
    }
  }

  @Override
  public void removeQueueItem(final long trackId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveQueueItem.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, trackId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemoveQueueItem.release(_stmt);
    }
  }

  @Override
  public void deleteAllItems() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllItems.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllItems.release(_stmt);
    }
  }

  @Override
  public List<QueueItem> getAll() {
    final String _sql = "SELECT * FROM queue_items ORDER BY track_order";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTrackId = CursorUtil.getColumnIndexOrThrow(_cursor, "track_id");
      final int _cursorIndexOfTrackOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "track_order");
      final int _cursorIndexOfIsCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "is_current");
      final int _cursorIndexOfLastPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "last_position");
      final List<QueueItem> _result = new ArrayList<QueueItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final QueueItem _item;
        final long _tmpTrackId;
        _tmpTrackId = _cursor.getLong(_cursorIndexOfTrackId);
        final int _tmpTrackOrder;
        _tmpTrackOrder = _cursor.getInt(_cursorIndexOfTrackOrder);
        final boolean _tmpIsCurrent;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsCurrent);
        _tmpIsCurrent = _tmp != 0;
        final int _tmpLastPosition;
        _tmpLastPosition = _cursor.getInt(_cursorIndexOfLastPosition);
        _item = new QueueItem(_tmpTrackId,_tmpTrackOrder,_tmpIsCurrent,_tmpLastPosition);
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
