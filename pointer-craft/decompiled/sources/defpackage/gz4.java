package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class gz4 {
    public final int g;

    public gz4(int i) {
        this.g = i;
    }

    public static void g(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = yf2.f(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public abstract void n(zx1 zx1Var, int i, int i2);

    public abstract void r(zx1 zx1Var);

    public abstract void v(zx1 zx1Var);

    public abstract void x(zx1 zx1Var, int i, int i2);

    public void y(zx1 zx1Var) {
    }
}
