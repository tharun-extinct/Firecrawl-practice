package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bc4 implements Closeable {
    public static final dj1 w = new dj1("proto");
    public final di0 a;
    public final oe4 j;
    public final ku m;
    public final p14 q;
    public final di0 t;

    public bc4(di0 di0Var, di0 di0Var2, ku kuVar, oe4 oe4Var, p14 p14Var) {
        this.j = oe4Var;
        this.t = di0Var;
        this.a = di0Var2;
        this.m = kuVar;
        this.q = p14Var;
    }

    public static String b(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((uu) it.next()).g);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object u(Cursor cursor, zb4 zb4Var) {
        try {
            return zb4Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long x(SQLiteDatabase sQLiteDatabase, cv cvVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(cvVar.g, String.valueOf(zx3.g(cvVar.r))));
        byte[] bArr = cvVar.y;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final ArrayList a(SQLiteDatabase sQLiteDatabase, cv cvVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lX = x(sQLiteDatabase, cvVar);
        if (lX == null) {
            return arrayList;
        }
        u(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lX.toString()}, null, null, null, String.valueOf(i)), new w21(this, arrayList, cvVar));
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    public final Object i(n05 n05Var) {
        SQLiteDatabase sQLiteDatabaseY = y();
        di0 di0Var = this.a;
        long jN = di0Var.n();
        while (true) {
            try {
                sQLiteDatabaseY.beginTransaction();
                try {
                    Object objY = n05Var.y();
                    sQLiteDatabaseY.setTransactionSuccessful();
                    return objY;
                } finally {
                    sQLiteDatabaseY.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (di0Var.n() >= ((long) this.m.r) + jN) {
                    throw new m05("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object t(zb4 zb4Var) {
        SQLiteDatabase sQLiteDatabaseY = y();
        sQLiteDatabaseY.beginTransaction();
        try {
            Object objApply = zb4Var.apply(sQLiteDatabaseY);
            sQLiteDatabaseY.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseY.endTransaction();
        }
    }

    public final void w(long j, dy2 dy2Var, String str) {
        t(new wb4(j, str, dy2Var));
    }

    public final SQLiteDatabase y() {
        oe4 oe4Var = this.j;
        Objects.requireNonNull(oe4Var);
        di0 di0Var = this.a;
        long jN = di0Var.n();
        while (true) {
            try {
                return oe4Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (di0Var.n() >= ((long) this.m.r) + jN) {
                    throw new m05("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
