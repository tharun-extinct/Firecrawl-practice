package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class zx1 implements Closeable {
    public static final wp2 a;
    public static final wp2 m;
    public static final String[] t = new String[0];
    public final SQLiteDatabase j;

    static {
        sx1 sx1Var = new sx1((byte) 1);
        bt2 bt2Var = bt2.j;
        a = v13.u(bt2Var, sx1Var);
        m = v13.u(bt2Var, new sx1((byte) 2));
    }

    public zx1(SQLiteDatabase sQLiteDatabase) {
        this.j = sQLiteDatabase;
    }

    public final void a() {
        this.j.endTransaction();
    }

    public final Cursor b(kz4 kz4Var) {
        final jd jdVar = new jd(kz4Var, (byte) 2);
        Cursor cursorRawQueryWithFactory = this.j.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: yx1
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) jdVar.i(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, kz4Var.y(), t, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    public final void i(Object[] objArr) {
        this.j.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean isOpen() {
        return this.j.isOpen();
    }

    public final boolean p() {
        return this.j.inTransaction();
    }

    public final gy1 t(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.j.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new gy1(sQLiteStatementCompileStatement);
    }

    public final void u() {
        this.j.setTransactionSuccessful();
    }

    public final void w(String str) {
        this.j.execSQL(str);
    }

    public final void x() {
        this.j.beginTransactionNonExclusive();
    }

    public final void y() {
        this.j.beginTransaction();
    }
}
