package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class x72 {
    public final c70 g;
    public int j;
    public int l;
    public boolean r;
    public int y = Integer.MAX_VALUE;
    public int n = 4096;
    public b52[] v = new b52[8];
    public int x = 7;

    public x72(c70 c70Var) {
        this.g = c70Var;
    }

    public final void g(int i) {
        int i2;
        if (i > 0) {
            int length = this.v.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.x;
                if (length < i2 || i <= 0) {
                    break;
                }
                b52 b52Var = this.v[length];
                b52Var.getClass();
                i -= b52Var.r;
                int i4 = this.j;
                b52 b52Var2 = this.v[length];
                b52Var2.getClass();
                this.j = i4 - b52Var2.r;
                this.l--;
                i3++;
                length--;
            }
            b52[] b52VarArr = this.v;
            int i5 = i2 + 1;
            System.arraycopy(b52VarArr, i5, b52VarArr, i5 + i3, this.l);
            b52[] b52VarArr2 = this.v;
            int i6 = this.x + 1;
            Arrays.fill(b52VarArr2, i6, i6 + i3, (Object) null);
            this.x += i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void n(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.r) {
            int i = this.y;
            if (i < this.n) {
                v(i, 31, 32);
            }
            this.r = false;
            this.y = Integer.MAX_VALUE;
            v(this.n, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b52 b52Var = (b52) arrayList.get(i2);
            fa0 fa0VarA = b52Var.g.a();
            fa0 fa0Var = b52Var.y;
            Integer num = (Integer) y72.y.get(fa0VarA);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    b52[] b52VarArr = y72.g;
                    if (yf2.p(b52VarArr[iIntValue].y, fa0Var)) {
                        length = length2;
                    } else if (yf2.p(b52VarArr[length2].y, fa0Var)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.v.length;
                for (int i3 = this.x + 1; i3 < length3; i3++) {
                    b52 b52Var2 = this.v[i3];
                    b52Var2.getClass();
                    if (yf2.p(b52Var2.g, fa0VarA)) {
                        b52 b52Var3 = this.v[i3];
                        b52Var3.getClass();
                        if (yf2.p(b52Var3.y, fa0Var)) {
                            length2 = y72.g.length + (i3 - this.x);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.x) + y72.g.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                v(length2, 127, 128);
            } else if (length == -1) {
                this.g.F(64);
                r(fa0VarA);
                r(fa0Var);
                y(b52Var);
            } else {
                fa0 fa0Var2 = b52.n;
                fa0VarA.getClass();
                fa0Var2.getClass();
                if (!fa0VarA.l(fa0Var2, fa0Var2.y()) || yf2.p(b52.t, fa0VarA)) {
                    v(length, 63, 64);
                    r(fa0Var);
                    y(b52Var);
                } else {
                    v(length, 15, 0);
                    r(fa0Var);
                }
            }
        }
    }

    public final void r(fa0 fa0Var) throws EOFException {
        fa0Var.getClass();
        int[] iArr = d92.g;
        int iY = fa0Var.y();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iY; i++) {
            byte bV = fa0Var.v(i);
            byte[] bArr = us5.g;
            j2 += (long) d92.y[bV & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iY2 = fa0Var.y();
        c70 c70Var = this.g;
        if (i2 >= iY2) {
            v(fa0Var.y(), 127, 0);
            c70Var.D(fa0Var);
            return;
        }
        c70 c70Var2 = new c70();
        int[] iArr2 = d92.g;
        int iY3 = fa0Var.y();
        int i3 = 0;
        for (int i4 = 0; i4 < iY3; i4++) {
            byte bV2 = fa0Var.v(i4);
            byte[] bArr2 = us5.g;
            int i5 = bV2 & 255;
            int i6 = d92.g[i5];
            byte b = d92.y[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                c70Var2.F((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            c70Var2.F((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        fa0 fa0VarI = c70Var2.i(c70Var2.t);
        v(fa0VarI.y(), 127, 128);
        c70Var.D(fa0VarI);
    }

    public final void v(int i, int i2, int i3) {
        c70 c70Var = this.g;
        if (i < i2) {
            c70Var.F(i | i3);
            return;
        }
        c70Var.F(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c70Var.F(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c70Var.F(i4);
    }

    public final void y(b52 b52Var) {
        int i = b52Var.r;
        int i2 = this.n;
        if (i > i2) {
            b52[] b52VarArr = this.v;
            pr.T(0, b52VarArr.length, null, b52VarArr);
            this.x = this.v.length - 1;
            this.l = 0;
            this.j = 0;
            return;
        }
        g((this.j + i) - i2);
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
}
