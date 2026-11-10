package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class oz4 extends pz4 {
    public Cursor b;
    public String[] c;
    public byte[][] i;
    public int[] m;
    public long[] q;
    public double[] w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz4(zx1 zx1Var, String str) {
        super(zx1Var, str);
        zx1Var.getClass();
        str.getClass();
        this.m = new int[0];
        this.q = new long[0];
        this.w = new double[0];
        this.c = new String[0];
        this.i = new byte[0][];
    }

    public static void a(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            zq2.B("column index out of range", 25);
            throw null;
        }
    }

    @Override // defpackage.cc4
    public final boolean H() {
        y();
        t();
        Cursor cursor = this.b;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        l0.z("Required value was null.");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.a) {
            v();
            reset();
        }
        this.a = true;
    }

    @Override // defpackage.cc4
    public final void g(int i) {
        y();
        x(5, i);
        this.m[i] = 5;
    }

    @Override // defpackage.cc4
    public final byte[] getBlob(int i) {
        y();
        Cursor cursorW = w();
        a(cursorW, i);
        byte[] blob = cursorW.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.cc4
    public final int getColumnCount() {
        y();
        t();
        Cursor cursor = this.b;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.cc4
    public final String getColumnName(int i) {
        y();
        t();
        Cursor cursor = this.b;
        if (cursor == null) {
            l0.z("Required value was null.");
            return null;
        }
        a(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.cc4
    public final long getLong(int i) {
        y();
        Cursor cursorW = w();
        a(cursorW, i);
        return cursorW.getLong(i);
    }

    @Override // defpackage.cc4
    public final boolean isNull(int i) {
        y();
        Cursor cursorW = w();
        a(cursorW, i);
        return cursorW.isNull(i);
    }

    @Override // defpackage.cc4
    public final void l(int i, byte[] bArr) {
        bArr.getClass();
        y();
        x(4, i);
        this.m[i] = 4;
        this.i[i] = bArr;
    }

    @Override // defpackage.cc4
    public final void m(String str, int i) {
        str.getClass();
        y();
        x(3, i);
        this.m[i] = 3;
        this.c[i] = str;
    }

    @Override // defpackage.cc4
    public final void n(int i, long j) {
        y();
        x(1, i);
        this.m[i] = 1;
        this.q[i] = j;
    }

    @Override // defpackage.cc4
    public final String q(int i) {
        y();
        Cursor cursorW = w();
        a(cursorW, i);
        String string = cursorW.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.pz4, defpackage.cc4
    public final void reset() {
        y();
        Cursor cursor = this.b;
        if (cursor != null) {
            cursor.close();
        }
        this.b = null;
    }

    public final void t() {
        if (this.b == null) {
            this.b = this.j.b(new et4(this, (byte) 3));
        }
    }

    @Override // defpackage.pz4, defpackage.cc4
    public final void v() {
        y();
        this.m = new int[0];
        this.q = new long[0];
        this.w = new double[0];
        this.c = new String[0];
        this.i = new byte[0][];
    }

    public final Cursor w() {
        Cursor cursor = this.b;
        if (cursor != null) {
            return cursor;
        }
        zq2.B("no row", 21);
        throw null;
    }

    public final void x(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.m;
        if (iArr.length < i3) {
            this.m = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.q;
            if (jArr.length < i3) {
                this.q = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.w;
            if (dArr.length < i3) {
                this.w = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.c;
            if (strArr.length < i3) {
                this.c = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.i;
        if (bArr.length < i3) {
            this.i = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }
}
