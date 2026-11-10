package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class fy1 implements jz4 {
    public final SQLiteProgram j;

    public fy1(SQLiteProgram sQLiteProgram) {
        this.j = sQLiteProgram;
    }

    @Override // defpackage.jz4
    public final void G(String str, int i) {
        str.getClass();
        this.j.bindString(i, str);
    }

    @Override // defpackage.jz4
    public final void c(int i, double d) {
        this.j.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    @Override // defpackage.jz4
    public final void g(int i) {
        this.j.bindNull(i);
    }

    @Override // defpackage.jz4
    public final void l(int i, byte[] bArr) {
        bArr.getClass();
        this.j.bindBlob(i, bArr);
    }

    @Override // defpackage.jz4
    public final void n(int i, long j) {
        this.j.bindLong(i, j);
    }

    @Override // defpackage.jz4
    public final void v() {
        this.j.clearBindings();
    }
}
