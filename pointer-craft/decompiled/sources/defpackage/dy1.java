package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class dy1 extends SQLiteOpenHelper {
    public static final /* synthetic */ int c = 0;
    public final gz4 a;
    public final Context j;
    public boolean m;
    public final ly3 q;
    public final q64 t;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy1(Context context, String str, final q64 q64Var, final gz4 gz4Var) {
        String string;
        super(context, str, null, gz4Var.g, new DatabaseErrorHandler() { // from class: ay1
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = dy1.c;
                sQLiteDatabase.getClass();
                q64 q64Var2 = q64Var;
                zx1 zx1Var = (zx1) q64Var2.t;
                if (zx1Var == null || !zx1Var.j.equals(sQLiteDatabase)) {
                    zx1Var = new zx1(sQLiteDatabase);
                    q64Var2.t = zx1Var;
                }
                SQLiteDatabase sQLiteDatabase2 = zx1Var.j;
                gz4Var.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + zx1Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        gz4.g(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                gz4.g((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                gz4.g(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    zx1Var.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        context.getClass();
        gz4Var.getClass();
        this.j = context;
        this.t = q64Var;
        this.a = gz4Var;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.q = new ly3(string, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        ly3 ly3Var = this.q;
        try {
            ly3Var.g(ly3Var.g);
            super.close();
            this.t.t = null;
            this.w = false;
        } finally {
            ly3Var.y();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.m;
        gz4 gz4Var = this.a;
        if (!z && gz4Var.g != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            gz4Var.y(x(sQLiteDatabase));
        } catch (Throwable th) {
            throw new by1(cy1.j, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.a.r(x(sQLiteDatabase));
        } catch (Throwable th) {
            throw new by1(cy1.t, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.m = true;
        try {
            this.a.n(x(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new by1(cy1.m, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.m) {
            try {
                this.a.v(x(sQLiteDatabase));
            } catch (Throwable th) {
                throw new by1(cy1.q, th);
            }
        }
        this.w = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.m = true;
        try {
            this.a.x(x(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new by1(cy1.a, th);
        }
    }

    public final SQLiteDatabase t(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.w;
        if (databaseName != null && !z2 && (parentFile = this.j.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            readableDatabase2.getClass();
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase = getWritableDatabase();
                    readableDatabase.getClass();
                } else {
                    readableDatabase = getReadableDatabase();
                    readableDatabase.getClass();
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof by1) {
                    by1 by1Var = (by1) th;
                    int iOrdinal = by1Var.j.ordinal();
                    th = by1Var.t;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        uo1.g();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public final zx1 x(SQLiteDatabase sQLiteDatabase) {
        q64 q64Var = this.t;
        zx1 zx1Var = (zx1) q64Var.t;
        if (zx1Var != null && zx1Var.j.equals(sQLiteDatabase)) {
            return zx1Var;
        }
        zx1 zx1Var2 = new zx1(sQLiteDatabase);
        q64Var.t = zx1Var2;
        return zx1Var2;
    }

    public final zx1 y(boolean z) {
        ly3 ly3Var = this.q;
        try {
            ly3Var.g((this.w || getDatabaseName() == null) ? false : true);
            this.m = false;
            SQLiteDatabase sQLiteDatabaseT = t(z);
            if (!this.m) {
                return x(sQLiteDatabaseT);
            }
            close();
            return y(z);
        } finally {
            ly3Var.y();
        }
    }
}
