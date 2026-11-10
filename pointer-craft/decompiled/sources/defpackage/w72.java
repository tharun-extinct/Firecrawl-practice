package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class w72 {
    public int j;
    public int l;
    public final h34 n;
    public long r;
    public int g = 4096;
    public final ArrayList y = new ArrayList();
    public b52[] v = new b52[8];
    public int x = 7;

    public w72(r82 r82Var) {
        this.n = new h34(r82Var);
    }

    public final void g(b52 b52Var) throws IOException {
        this.y.add(b52Var);
        long jY = this.r + ((long) (b52Var.y.y() + b52Var.g.y()));
        this.r = jY;
        if (jY <= 262144) {
            return;
        }
        uo1.t("header byte count limit of 262144 exceeded");
    }

    public final void n(b52 b52Var) throws IOException {
        g(b52Var);
        int i = b52Var.r;
        int i2 = this.g;
        if (i > i2) {
            b52[] b52VarArr = this.v;
            pr.T(0, b52VarArr.length, null, b52VarArr);
            this.x = this.v.length - 1;
            this.l = 0;
            this.j = 0;
            return;
        }
        y((this.j + i) - i2);
        int i3 = this.l + 1;
        b52[] b52VarArr2 = this.v;
        if (i3 > b52VarArr2.length) {
            b52[] b52VarArr3 = new b52[b52VarArr2.length * 2];
            System.arraycopy(b52VarArr2, 0, b52VarArr3, b52VarArr2.length, b52VarArr2.length);
            this.x = this.v.length - 1;
            this.v = b52VarArr3;
            b52VarArr2 = b52VarArr3;
        }
        int i4 = this.x;
        this.x = i4 - 1;
        b52VarArr2[i4] = b52Var;
        this.l++;
        this.j += i;
    }

    public final fa0 r(int i) throws IOException {
        if (i >= 0) {
            b52[] b52VarArr = y72.g;
            if (i <= b52VarArr.length - 1) {
                return b52VarArr[i].g;
            }
        }
        int length = this.x + 1 + (i - y72.g.length);
        if (length >= 0) {
            b52[] b52VarArr2 = this.v;
            if (length < b52VarArr2.length) {
                b52 b52Var = b52VarArr2[length];
                b52Var.getClass();
                return b52Var.g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final fa0 v() throws IOException {
        h34 h34Var = this.n;
        byte bT = h34Var.t();
        byte[] bArr = us5.g;
        int i = bT & 255;
        int i2 = 0;
        boolean z = (bT & 128) == 128;
        long jX = x(i, 127);
        if (this.r + jX > 262144) {
            uo1.t("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return h34Var.a(jX);
        }
        c70 c70Var = new c70();
        hs0 hs0Var = d92.r;
        hs0 hs0Var2 = hs0Var;
        int i3 = 0;
        for (long j = 0; j < jX; j++) {
            byte bT2 = h34Var.t();
            byte[] bArr2 = us5.g;
            i2 = (i2 << 8) | (bT2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                hs0[] hs0VarArr = (hs0[]) hs0Var2.m;
                hs0VarArr.getClass();
                hs0Var2 = hs0VarArr[(i2 >>> (i3 - 8)) & 255];
                hs0Var2.getClass();
                if (((hs0[]) hs0Var2.m) == null) {
                    c70Var.F(hs0Var2.t);
                    i3 -= hs0Var2.a;
                    hs0Var2 = hs0Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            hs0[] hs0VarArr2 = (hs0[]) hs0Var2.m;
            hs0VarArr2.getClass();
            hs0 hs0Var3 = hs0VarArr2[(i2 << (8 - i3)) & 255];
            hs0Var3.getClass();
            int i4 = hs0Var3.a;
            if (((hs0[]) hs0Var3.m) != null || i4 > i3) {
                break;
            }
            c70Var.F(hs0Var3.t);
            i3 -= i4;
            hs0Var2 = hs0Var;
        }
        return c70Var.i(c70Var.t);
    }

    public final int x(int i, int i2) throws IOException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte bT = this.n.t();
            byte[] bArr = us5.g;
            i4++;
            long j2 = ((long) (bT & 127)) << i5;
            if (j2 > 2147483647L - j) {
                uo1.t("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((bT & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        uo1.t("HPACK integer overflow");
        return 0;
    }

    public final int y(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.v.length;
            while (true) {
                length--;
                i2 = this.x;
                if (length < i2 || i <= 0) {
                    break;
                }
                b52 b52Var = this.v[length];
                b52Var.getClass();
                int i4 = b52Var.r;
                i -= i4;
                this.j -= i4;
                this.l--;
                i3++;
            }
            b52[] b52VarArr = this.v;
            int i5 = i2 + 1;
            System.arraycopy(b52VarArr, i5, b52VarArr, i5 + i3, this.l);
            this.x += i3;
        }
        return i3;
    }
}
