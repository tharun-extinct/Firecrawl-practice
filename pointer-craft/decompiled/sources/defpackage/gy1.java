package defpackage;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class gy1 extends fy1 implements jz4 {
    public final SQLiteStatement t;

    public gy1(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.t = sQLiteStatement;
    }

    public final int y() {
        return this.t.executeUpdateDelete();
    }
}
