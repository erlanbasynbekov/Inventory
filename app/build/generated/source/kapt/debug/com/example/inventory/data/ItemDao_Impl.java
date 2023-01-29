package com.example.inventory.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ItemDao_Impl implements ItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Item> __insertionAdapterOfItem;

  private final EntityDeletionOrUpdateAdapter<Item> __deletionAdapterOfItem;

  private final EntityDeletionOrUpdateAdapter<Item> __updateAdapterOfItem;

  public ItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItem = new EntityInsertionAdapter<Item>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Item` (`id`,`name`,`price`,`quantity`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Item value) {
        stmt.bindLong(1, value.getId());
        if (value.getItemName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getItemName());
        }
        stmt.bindDouble(3, value.getItemPrice());
        stmt.bindLong(4, value.getQuantityInStock());
      }
    };
    this.__deletionAdapterOfItem = new EntityDeletionOrUpdateAdapter<Item>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Item` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Item value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfItem = new EntityDeletionOrUpdateAdapter<Item>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Item` SET `id` = ?,`name` = ?,`price` = ?,`quantity` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Item value) {
        stmt.bindLong(1, value.getId());
        if (value.getItemName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getItemName());
        }
        stmt.bindDouble(3, value.getItemPrice());
        stmt.bindLong(4, value.getQuantityInStock());
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Item item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItem.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Item item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Item item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Item>> getItems() {
    final String _sql = "SELECT * from item ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"item"}, new Callable<List<Item>>() {
      @Override
      public List<Item> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfItemPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfQuantityInStock = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final List<Item> _result = new ArrayList<Item>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Item _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpItemName;
            if (_cursor.isNull(_cursorIndexOfItemName)) {
              _tmpItemName = null;
            } else {
              _tmpItemName = _cursor.getString(_cursorIndexOfItemName);
            }
            final double _tmpItemPrice;
            _tmpItemPrice = _cursor.getDouble(_cursorIndexOfItemPrice);
            final int _tmpQuantityInStock;
            _tmpQuantityInStock = _cursor.getInt(_cursorIndexOfQuantityInStock);
            _item = new Item(_tmpId,_tmpItemName,_tmpItemPrice,_tmpQuantityInStock);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Item> getItem(final int id) {
    final String _sql = "SELECT * from item WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"item"}, new Callable<Item>() {
      @Override
      public Item call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfItemPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfQuantityInStock = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final Item _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpItemName;
            if (_cursor.isNull(_cursorIndexOfItemName)) {
              _tmpItemName = null;
            } else {
              _tmpItemName = _cursor.getString(_cursorIndexOfItemName);
            }
            final double _tmpItemPrice;
            _tmpItemPrice = _cursor.getDouble(_cursorIndexOfItemPrice);
            final int _tmpQuantityInStock;
            _tmpQuantityInStock = _cursor.getInt(_cursorIndexOfQuantityInStock);
            _result = new Item(_tmpId,_tmpItemName,_tmpItemPrice,_tmpQuantityInStock);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
