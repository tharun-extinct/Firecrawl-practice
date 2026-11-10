package defpackage;

import android.R;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qg6 {
    public static final boolean a(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final void g(m2 m2Var, gj4 gj4Var) {
        aj4 aj4VarM = gj4Var.m();
        if (aj4VarM.j.r(kj4.a)) {
            return;
        }
        aj4 aj4Var = gj4Var.n;
        Object objL = aj4Var.j.l(yi4.t);
        if (objL == null) {
            objL = null;
        }
        p1 p1Var = (p1) objL;
        if (p1Var != null) {
            m2Var.y(new f2(p1Var.g, R.id.accessibilityActionSetProgress));
        }
    }

    public static final boolean j(j75 j75Var, int i) {
        h93 h93Var = j75Var.y;
        int iN = h93Var.n(i);
        return i == j75Var.l(iN) || i == h93Var.r(iN, false) ? j75Var.j(i) != j75Var.g(i) : j75Var.g(i) != j75Var.g(i - 1);
    }

    public static final long l(mt2 mt2Var, k44 k44Var, k44 k44Var2, int i) {
        long jX = x(mt2Var, k44Var, i);
        if (u75.r(jX)) {
            return u75.y;
        }
        long jX2 = x(mt2Var, k44Var2, i);
        if (u75.r(jX2)) {
            return u75.y;
        }
        int i2 = (int) (jX >> 32);
        int i3 = (int) (jX2 & 4294967295L);
        return sp2.y(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean m(int i) {
        int type;
        return (!a(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final int n(h93 h93Var, long j, bl5 bl5Var) {
        float fX = bl5Var != null ? bl5Var.x() : 0.0f;
        int i = (int) (4294967295L & j);
        int iV = h93Var.v(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < h93Var.x(iV) - fX || Float.intBitsToFloat(i) > h93Var.y(iV) + fX) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fX) || Float.intBitsToFloat(i2) > h93Var.n + fX) {
            return -1;
        }
        return iV;
    }

    public static final long q(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final int r(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final boolean t(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final int v(mt2 mt2Var, long j, bl5 bl5Var) {
        long jH;
        int iN;
        k75 k75VarN = mt2Var.n();
        if (k75VarN != null) {
            h93 h93Var = k75VarN.g.y;
            bl2 bl2VarR = mt2Var.r();
            if (bl2VarR != null && (iN = n(h93Var, (jH = bl2VarR.h(j)), bl5Var)) != -1) {
                return h93Var.l(wi3.g(jH, (h93Var.y(iN) + h93Var.x(iN)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long x(mt2 mt2Var, k44 k44Var, int i) {
        up upVar = aj6.s;
        k75 k75VarN = mt2Var.n();
        h93 h93Var = k75VarN != null ? k75VarN.g.y : null;
        bl2 bl2VarR = mt2Var.r();
        return (h93Var == null || bl2VarR == null) ? u75.y : h93Var.j(k44Var.t(bl2VarR.h(0L)), i, upVar);
    }

    public static final int y(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }
}
