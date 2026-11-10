package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sg5 {
    public static qg5 g(Object obj) {
        c12 c12Var = (c12) obj;
        qg5 qg5Var = c12Var.unknownFields;
        if (qg5Var != qg5.x) {
            return qg5Var;
        }
        qg5 qg5Var2 = new qg5(0, new int[8], new Object[8], true);
        c12Var.unknownFields = qg5Var2;
        return qg5Var2;
    }

    public static boolean y(int i, ti0 ti0Var, Object obj) throws ig2 {
        int i2 = ti0Var.g;
        ri0 ri0Var = (ri0) ti0Var.n;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            ti0Var.d(0);
            ((qg5) obj).r(i3 << 3, Long.valueOf(ri0Var.o()));
            return true;
        }
        if (i4 == 1) {
            ti0Var.d(1);
            ((qg5) obj).r((i3 << 3) | 1, Long.valueOf(ri0Var.u()));
            return true;
        }
        if (i4 == 2) {
            ((qg5) obj).r((i3 << 3) | 2, ti0Var.l());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw ig2.y();
            }
            ti0Var.d(5);
            ((qg5) obj).r(5 | (i3 << 3), Integer.valueOf(ri0Var.p()));
            return true;
        }
        qg5 qg5Var = new qg5(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new ig2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (ti0Var.g() != Integer.MAX_VALUE && y(i7, ti0Var, qg5Var)) {
        }
        if (i6 != ti0Var.g) {
            throw new ig2("Protocol message end-group tag did not match expected tag.");
        }
        if (qg5Var.v) {
            qg5Var.v = false;
        }
        ((qg5) obj).r(i5 | 3, qg5Var);
        return true;
    }
}
