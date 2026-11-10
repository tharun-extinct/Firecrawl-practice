package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class z85 {
    public static final /* synthetic */ long y = qr.g.objectFieldOffset(z85.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public hl1[] g;

    public final void g(hl1 hl1Var) {
        hl1Var.n((il1) this);
        hl1[] hl1VarArr = this.g;
        if (hl1VarArr == null) {
            hl1VarArr = new hl1[4];
            this.g = hl1VarArr;
        } else if (y() >= hl1VarArr.length) {
            hl1VarArr = (hl1[]) Arrays.copyOf(hl1VarArr, y() * 2);
            this.g = hl1VarArr;
        }
        int iY = y();
        qr.g.putIntVolatile(this, y, iY + 1);
        hl1VarArr[iY] = hl1Var;
        hl1Var.t = iY;
        n(iY);
    }

    public final void n(int i) {
        while (i > 0) {
            hl1[] hl1VarArr = this.g;
            hl1VarArr.getClass();
            int i2 = (i - 1) / 2;
            hl1 hl1Var = hl1VarArr[i2];
            hl1Var.getClass();
            hl1 hl1Var2 = hl1VarArr[i];
            hl1Var2.getClass();
            if (hl1Var.compareTo(hl1Var2) <= 0) {
                return;
            }
            v(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[LOOP:0: B:9:0x003c->B:21:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[EDGE_INSN: B:24:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[EDGE_INSN: B:25:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final hl1 r(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.g;
        objArr2.getClass();
        qr.g.putIntVolatile(this, y, y() - 1);
        if (i < y()) {
            v(i, y());
            int i5 = (i - 1) / 2;
            if (i > 0) {
                hl1 hl1Var = objArr2[i];
                hl1Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (hl1Var.compareTo(obj2) < 0) {
                    v(i, i5);
                    n(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= y()) {
                            break;
                        }
                        objArr = this.g;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < y()) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        v(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= y()) {
                        break;
                        break;
                    }
                    objArr = this.g;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < y()) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    v(i, i4);
                    i = i4;
                }
            }
        }
        hl1 hl1Var2 = objArr2[y()];
        hl1Var2.getClass();
        hl1Var2.n(null);
        hl1Var2.t = -1;
        objArr2[y()] = null;
        return hl1Var2;
    }

    public final void v(int i, int i2) {
        hl1[] hl1VarArr = this.g;
        hl1VarArr.getClass();
        hl1 hl1Var = hl1VarArr[i2];
        hl1Var.getClass();
        hl1 hl1Var2 = hl1VarArr[i];
        hl1Var2.getClass();
        hl1VarArr[i] = hl1Var;
        hl1VarArr[i2] = hl1Var2;
        hl1Var.t = i;
        hl1Var2.t = i2;
    }

    public final int y() {
        return qr.g.getIntVolatile(this, y);
    }
}
