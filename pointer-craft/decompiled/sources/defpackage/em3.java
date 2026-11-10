package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class em3 extends zq2 {
    public int l;
    public int r;
    public int v;
    public bm3[] y = new bm3[16];
    public int[] n = new int[16];
    public Object[] x = new Object[16];

    public final void K() {
        this.r = 0;
        this.v = 0;
        Arrays.fill(this.x, 0, this.l, (Object) null);
        this.l = 0;
    }

    public final void L(mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        if (this.r != 0) {
            ti0 ti0Var = new ti0(this);
            em3 em3Var = (em3) ti0Var.n;
            while (true) {
                bm3 bm3Var = em3Var.y[ti0Var.g];
                c02 c02VarY = bm3Var.y(ti0Var);
                mq mqVar2 = mqVar;
                pr4 pr4Var2 = pr4Var;
                i64 i64Var2 = i64Var;
                cm3 cm3Var2 = cm3Var;
                try {
                    bm3Var.g(ti0Var, mqVar2, pr4Var2, i64Var2, cm3Var2);
                    int i = ti0Var.g;
                    int i2 = em3Var.r;
                    if (i < i2) {
                        bm3 bm3Var2 = em3Var.y[i];
                        ti0Var.y += bm3Var2.g;
                        ti0Var.r += bm3Var2.y;
                        int i3 = i + 1;
                        ti0Var.g = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        mqVar = mqVar2;
                        pr4Var = pr4Var2;
                        i64Var = i64Var2;
                        cm3Var = cm3Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    bc6.g(th, cm3Var2, pr4Var2, c02VarY);
                    throw th;
                }
            }
        }
        K();
    }

    public final boolean M() {
        return this.r == 0;
    }

    public final void N(bm3 bm3Var) {
        int i = this.r;
        bm3[] bm3VarArr = this.y;
        if (i == bm3VarArr.length) {
            bm3[] bm3VarArr2 = new bm3[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(bm3VarArr, 0, bm3VarArr2, 0, i);
            this.y = bm3VarArr2;
        }
        int i2 = this.v;
        int i3 = bm3Var.g;
        int i4 = bm3Var.y;
        int i5 = i2 + i3;
        int[] iArr = this.n;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            pr.M(0, 0, length, iArr, iArr2);
            this.n = iArr2;
        }
        int i7 = this.l + i4;
        Object[] objArr = this.x;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.x = objArr2;
        }
        bm3[] bm3VarArr3 = this.y;
        int i9 = this.r;
        this.r = i9 + 1;
        bm3VarArr3[i9] = bm3Var;
        this.v += bm3Var.g;
        this.l += i4;
    }
}
