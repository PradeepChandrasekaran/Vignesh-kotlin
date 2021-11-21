package com.simplemobiletools.musicplayer.databases;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.simplemobiletools.musicplayer.interfaces.AlbumsDao;
import com.simplemobiletools.musicplayer.interfaces.AlbumsDao_Impl;
import com.simplemobiletools.musicplayer.interfaces.ArtistsDao;
import com.simplemobiletools.musicplayer.interfaces.ArtistsDao_Impl;
import com.simplemobiletools.musicplayer.interfaces.PlaylistsDao;
import com.simplemobiletools.musicplayer.interfaces.PlaylistsDao_Impl;
import com.simplemobiletools.musicplayer.interfaces.QueueItemsDao;
import com.simplemobiletools.musicplayer.interfaces.QueueItemsDao_Impl;
import com.simplemobiletools.musicplayer.interfaces.SongsDao;
import com.simplemobiletools.musicplayer.interfaces.SongsDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SongsDatabase_Impl extends SongsDatabase {
  private volatile SongsDao _songsDao;

  private volatile PlaylistsDao _playlistsDao;

  private volatile QueueItemsDao _queueItemsDao;

  private volatile ArtistsDao _artistsDao;

  private volatile AlbumsDao _albumsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(7) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tracks` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `media_store_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `artist` TEXT NOT NULL, `path` TEXT NOT NULL, `duration` INTEGER NOT NULL, `album` TEXT NOT NULL, `cover_art` TEXT NOT NULL, `playlist_id` INTEGER NOT NULL, `track_id` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_tracks_media_store_id_playlist_id` ON `tracks` (`media_store_id`, `playlist_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `playlists` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_playlists_id` ON `playlists` (`id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `queue_items` (`track_id` INTEGER NOT NULL, `track_order` INTEGER NOT NULL, `is_current` INTEGER NOT NULL, `last_position` INTEGER NOT NULL, PRIMARY KEY(`track_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `artists` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `album_cnt` INTEGER NOT NULL, `track_cnt` INTEGER NOT NULL, `album_art_id` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_artists_id` ON `artists` (`id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `albums` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `artist` TEXT NOT NULL, `title` TEXT NOT NULL, `cover_art` TEXT NOT NULL, `year` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_albums_id` ON `albums` (`id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ef62a8b0962019dbd3cd1d8bc325f386')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `tracks`");
        _db.execSQL("DROP TABLE IF EXISTS `playlists`");
        _db.execSQL("DROP TABLE IF EXISTS `queue_items`");
        _db.execSQL("DROP TABLE IF EXISTS `artists`");
        _db.execSQL("DROP TABLE IF EXISTS `albums`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTracks = new HashMap<String, TableInfo.Column>(10);
        _columnsTracks.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("media_store_id", new TableInfo.Column("media_store_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("artist", new TableInfo.Column("artist", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("path", new TableInfo.Column("path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("album", new TableInfo.Column("album", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("cover_art", new TableInfo.Column("cover_art", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("playlist_id", new TableInfo.Column("playlist_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTracks.put("track_id", new TableInfo.Column("track_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTracks = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTracks = new HashSet<TableInfo.Index>(1);
        _indicesTracks.add(new TableInfo.Index("index_tracks_media_store_id_playlist_id", true, Arrays.asList("media_store_id","playlist_id")));
        final TableInfo _infoTracks = new TableInfo("tracks", _columnsTracks, _foreignKeysTracks, _indicesTracks);
        final TableInfo _existingTracks = TableInfo.read(_db, "tracks");
        if (! _infoTracks.equals(_existingTracks)) {
          return new RoomOpenHelper.ValidationResult(false, "tracks(com.simplemobiletools.musicplayer.models.Track).\n"
                  + " Expected:\n" + _infoTracks + "\n"
                  + " Found:\n" + _existingTracks);
        }
        final HashMap<String, TableInfo.Column> _columnsPlaylists = new HashMap<String, TableInfo.Column>(2);
        _columnsPlaylists.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylists.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlaylists = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlaylists = new HashSet<TableInfo.Index>(1);
        _indicesPlaylists.add(new TableInfo.Index("index_playlists_id", true, Arrays.asList("id")));
        final TableInfo _infoPlaylists = new TableInfo("playlists", _columnsPlaylists, _foreignKeysPlaylists, _indicesPlaylists);
        final TableInfo _existingPlaylists = TableInfo.read(_db, "playlists");
        if (! _infoPlaylists.equals(_existingPlaylists)) {
          return new RoomOpenHelper.ValidationResult(false, "playlists(com.simplemobiletools.musicplayer.models.Playlist).\n"
                  + " Expected:\n" + _infoPlaylists + "\n"
                  + " Found:\n" + _existingPlaylists);
        }
        final HashMap<String, TableInfo.Column> _columnsQueueItems = new HashMap<String, TableInfo.Column>(4);
        _columnsQueueItems.put("track_id", new TableInfo.Column("track_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQueueItems.put("track_order", new TableInfo.Column("track_order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQueueItems.put("is_current", new TableInfo.Column("is_current", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQueueItems.put("last_position", new TableInfo.Column("last_position", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysQueueItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesQueueItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoQueueItems = new TableInfo("queue_items", _columnsQueueItems, _foreignKeysQueueItems, _indicesQueueItems);
        final TableInfo _existingQueueItems = TableInfo.read(_db, "queue_items");
        if (! _infoQueueItems.equals(_existingQueueItems)) {
          return new RoomOpenHelper.ValidationResult(false, "queue_items(com.simplemobiletools.musicplayer.models.QueueItem).\n"
                  + " Expected:\n" + _infoQueueItems + "\n"
                  + " Found:\n" + _existingQueueItems);
        }
        final HashMap<String, TableInfo.Column> _columnsArtists = new HashMap<String, TableInfo.Column>(5);
        _columnsArtists.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtists.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtists.put("album_cnt", new TableInfo.Column("album_cnt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtists.put("track_cnt", new TableInfo.Column("track_cnt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtists.put("album_art_id", new TableInfo.Column("album_art_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArtists = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArtists = new HashSet<TableInfo.Index>(1);
        _indicesArtists.add(new TableInfo.Index("index_artists_id", true, Arrays.asList("id")));
        final TableInfo _infoArtists = new TableInfo("artists", _columnsArtists, _foreignKeysArtists, _indicesArtists);
        final TableInfo _existingArtists = TableInfo.read(_db, "artists");
        if (! _infoArtists.equals(_existingArtists)) {
          return new RoomOpenHelper.ValidationResult(false, "artists(com.simplemobiletools.musicplayer.models.Artist).\n"
                  + " Expected:\n" + _infoArtists + "\n"
                  + " Found:\n" + _existingArtists);
        }
        final HashMap<String, TableInfo.Column> _columnsAlbums = new HashMap<String, TableInfo.Column>(5);
        _columnsAlbums.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbums.put("artist", new TableInfo.Column("artist", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbums.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbums.put("cover_art", new TableInfo.Column("cover_art", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbums.put("year", new TableInfo.Column("year", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAlbums = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAlbums = new HashSet<TableInfo.Index>(1);
        _indicesAlbums.add(new TableInfo.Index("index_albums_id", true, Arrays.asList("id")));
        final TableInfo _infoAlbums = new TableInfo("albums", _columnsAlbums, _foreignKeysAlbums, _indicesAlbums);
        final TableInfo _existingAlbums = TableInfo.read(_db, "albums");
        if (! _infoAlbums.equals(_existingAlbums)) {
          return new RoomOpenHelper.ValidationResult(false, "albums(com.simplemobiletools.musicplayer.models.Album).\n"
                  + " Expected:\n" + _infoAlbums + "\n"
                  + " Found:\n" + _existingAlbums);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ef62a8b0962019dbd3cd1d8bc325f386", "dd26c98bc097b349e9e60c01cc6ac29c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tracks","playlists","queue_items","artists","albums");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tracks`");
      _db.execSQL("DELETE FROM `playlists`");
      _db.execSQL("DELETE FROM `queue_items`");
      _db.execSQL("DELETE FROM `artists`");
      _db.execSQL("DELETE FROM `albums`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SongsDao.class, SongsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PlaylistsDao.class, PlaylistsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(QueueItemsDao.class, QueueItemsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ArtistsDao.class, ArtistsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AlbumsDao.class, AlbumsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public SongsDao SongsDao() {
    if (_songsDao != null) {
      return _songsDao;
    } else {
      synchronized(this) {
        if(_songsDao == null) {
          _songsDao = new SongsDao_Impl(this);
        }
        return _songsDao;
      }
    }
  }

  @Override
  public PlaylistsDao PlaylistsDao() {
    if (_playlistsDao != null) {
      return _playlistsDao;
    } else {
      synchronized(this) {
        if(_playlistsDao == null) {
          _playlistsDao = new PlaylistsDao_Impl(this);
        }
        return _playlistsDao;
      }
    }
  }

  @Override
  public QueueItemsDao QueueItemsDao() {
    if (_queueItemsDao != null) {
      return _queueItemsDao;
    } else {
      synchronized(this) {
        if(_queueItemsDao == null) {
          _queueItemsDao = new QueueItemsDao_Impl(this);
        }
        return _queueItemsDao;
      }
    }
  }

  @Override
  public ArtistsDao ArtistsDao() {
    if (_artistsDao != null) {
      return _artistsDao;
    } else {
      synchronized(this) {
        if(_artistsDao == null) {
          _artistsDao = new ArtistsDao_Impl(this);
        }
        return _artistsDao;
      }
    }
  }

  @Override
  public AlbumsDao AlbumsDao() {
    if (_albumsDao != null) {
      return _albumsDao;
    } else {
      synchronized(this) {
        if(_albumsDao == null) {
          _albumsDao = new AlbumsDao_Impl(this);
        }
        return _albumsDao;
      }
    }
  }
}
