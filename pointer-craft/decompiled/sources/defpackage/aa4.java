package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class aa4 extends gz4 {
    public final jy3 n;
    public final List r;
    public q01 y;

    public aa4(q01 q01Var, jy3 jy3Var) {
        super(12);
        this.r = q01Var.v;
        this.y = q01Var;
        this.n = jy3Var;
    }

    @Override // defpackage.gz4
    public final void n(zx1 zx1Var, int i, int i2) throws IOException {
        x(zx1Var, i, i2);
    }

    @Override // defpackage.gz4
    public final void r(zx1 zx1Var) throws IOException {
        Cursor cursorB = zx1Var.b(new ky2("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'", (byte) 1));
        try {
            boolean z = cursorB.moveToFirst() && cursorB.getInt(0) == 0;
            cursorB.close();
            jy3.i(zx1Var);
            if (!z) {
                b20 b20VarB = jy3.b(zx1Var);
                if (!b20VarB.y) {
                    t94.n((String) b20VarB.g, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = zx1Var.j;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            List list = this.r;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((v94) it.next()).g(zx1Var);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                gp4.C(cursorB, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.gz4
    public final void v(zx1 zx1Var) throws IOException {
        SQLiteDatabase sQLiteDatabase = zx1Var.j;
        Cursor cursorB = zx1Var.b(new ky2("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'", (byte) 1));
        try {
            boolean z = cursorB.moveToFirst() && cursorB.getInt(0) != 0;
            cursorB.close();
            if (z) {
                Cursor cursorB2 = zx1Var.b(new ky2("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (byte) 1));
                try {
                    String string = cursorB2.moveToFirst() ? cursorB2.getString(0) : null;
                    cursorB2.close();
                    if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                        l0.z(xi3.t("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: c103703e120ae8cc73c9248622f3cd1e, found: ", string));
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        gp4.C(cursorB2, th);
                        throw th2;
                    }
                }
            } else {
                b20 b20VarB = jy3.b(zx1Var);
                if (!b20VarB.y) {
                    t94.n((String) b20VarB.g, "Pre-packaged database has an invalid schema: ");
                    return;
                } else {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                }
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.n.j;
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            workDatabase_Impl.i(new fz4(zx1Var));
            List list = this.r;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((v94) it.next()).y(zx1Var);
                }
            }
            this.y = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                gp4.C(cursorB, th3);
                throw th4;
            }
        }
    }

    @Override // defpackage.gz4
    public final void x(zx1 zx1Var, int i, int i2) throws IOException {
        List listW;
        SQLiteDatabase sQLiteDatabase = zx1Var.j;
        q01 q01Var = this.y;
        if (q01Var != null && (listW = xq2.w(q01Var.n, i, i2)) != null) {
            ee6.g(new fz4(zx1Var));
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                ((z53) it.next()).y(new fz4(zx1Var));
            }
            b20 b20VarB = jy3.b(zx1Var);
            if (!b20VarB.y) {
                t94.n((String) b20VarB.g, "Migration didn't properly handle: ");
                return;
            } else {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                return;
            }
        }
        q01 q01Var2 = this.y;
        if (q01Var2 == null || xq2.z(q01Var2, i, i2)) {
            l0.z(du4.q(i, i2, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (q01Var2.u) {
            Cursor cursorB = zx1Var.b(new ky2("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'", (byte) 1));
            try {
                uv2 uv2VarC = pw5.c();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    string.getClass();
                    if (!ay4.P(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        uv2VarC.add(new fp3(string, Boolean.valueOf(yf2.p(cursorB.getString(1), "view"))));
                    }
                }
                uv2 uv2VarA = pw5.a(uv2VarC);
                cursorB.close();
                ListIterator listIterator = uv2VarA.listIterator(0);
                while (true) {
                    tv2 tv2Var = (tv2) listIterator;
                    if (!tv2Var.hasNext()) {
                        break;
                    }
                    fp3 fp3Var = (fp3) tv2Var.next();
                    String str = (String) fp3Var.j;
                    if (((Boolean) fp3Var.t).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    gp4.C(cursorB, th);
                    throw th2;
                }
            }
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
        }
        List list = this.r;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((v94) it2.next()).getClass();
            }
        }
        jy3.i(zx1Var);
    }

    @Override // defpackage.gz4
    public final void y(zx1 zx1Var) {
    }
}
