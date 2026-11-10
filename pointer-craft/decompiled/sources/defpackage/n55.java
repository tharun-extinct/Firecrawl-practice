package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n55 {
    public final cj g;
    public final k65 j;
    public final cj l;
    public final aj3 n;
    public final j75 r;
    public final k75 t;
    public final t75 v;
    public long x;
    public final long y;

    public n55(k65 k65Var, aj3 aj3Var, k75 k75Var, t75 t75Var) {
        cj cjVar = k65Var.g;
        long j = k65Var.y;
        j75 j75Var = k75Var != null ? k75Var.g : null;
        this.g = cjVar;
        this.y = j;
        this.r = j75Var;
        this.n = aj3Var;
        this.v = t75Var;
        this.x = j;
        this.l = cjVar;
        this.j = k65Var;
        this.t = k75Var;
    }

    public final void a() {
        this.v.g = null;
        cj cjVar = this.l;
        String str = cjVar.t;
        String str2 = cjVar.t;
        if (str.length() > 0) {
            int iY = qg6.y(str2, u75.v(this.x));
            if (iY == u75.v(this.x) && iY != str2.length()) {
                iY = qg6.y(str2, iY + 1);
            }
            s(iY, iY);
        }
    }

    public final void b() {
        if (this.l.t.length() > 0) {
            int i = u75.r;
            this.x = sp2.y((int) (this.y >> 32), (int) (this.x & 4294967295L));
        }
    }

    public final void c() {
        Integer numY;
        this.v.g = null;
        if (this.l.t.length() <= 0 || (numY = y()) == null) {
            return;
        }
        int iIntValue = numY.intValue();
        s(iIntValue, iIntValue);
    }

    public final List g(xy1 xy1Var) {
        if (!u75.r(this.x)) {
            return pw5.d(new rk0("", 0), new ml4(u75.x(this.x), u75.x(this.x)));
        }
        ug1 ug1Var = (ug1) xy1Var.a(this);
        if (ug1Var != null) {
            return pw5.k(ug1Var);
        }
        return null;
    }

    public final void i() {
        Integer numR;
        this.v.g = null;
        if (this.l.t.length() <= 0 || (numR = r()) == null) {
            return;
        }
        int iIntValue = numR.intValue();
        s(iIntValue, iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int j(k75 k75Var, int i) {
        k44 k44VarH;
        bl2 bl2Var = k75Var.y;
        j75 j75Var = k75Var.g;
        if (bl2Var == null) {
            k44VarH = k44.v;
        } else {
            bl2 bl2Var2 = k75Var.r;
            k44VarH = bl2Var2 != null ? bl2Var2.H(bl2Var, true) : null;
            if (k44VarH == null) {
                k44VarH = k44.v;
            }
        }
        long j = this.j.y;
        int i2 = u75.r;
        aj3 aj3Var = this.n;
        k44 k44VarR = j75Var.r(aj3Var.j((int) (j & 4294967295L)));
        float f = k44VarR.g;
        return aj3Var.n(j75Var.y.l((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (k44VarH.r() & 4294967295L)) * i) + k44VarR.y)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final int l(j75 j75Var, int i) {
        int iP = p();
        t75 t75Var = this.v;
        if (t75Var.g == null) {
            t75Var.g = Float.valueOf(j75Var.r(iP).g);
        }
        h93 h93Var = j75Var.y;
        int iN = h93Var.n(iP) + i;
        if (iN < 0) {
            return 0;
        }
        if (iN >= h93Var.x) {
            return this.l.t.length();
        }
        float fY = h93Var.y(iN) - 1.0f;
        Float f = t75Var.g;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((x() && fFloatValue >= j75Var.x(iN)) || (!x() && fFloatValue <= j75Var.v(iN))) {
            return h93Var.r(iN, true);
        }
        return this.n.n(h93Var.l((((long) Float.floatToRawIntBits(fY)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    public final void m() {
        this.v.g = null;
        cj cjVar = this.l;
        if (cjVar.t.length() > 0) {
            String str = cjVar.t;
            long j = this.x;
            int i = u75.r;
            int iR = rg6.r(str, (int) (j & 4294967295L));
            if (iR != -1) {
                s(iR, iR);
            }
        }
    }

    public final Integer n() {
        int length;
        j75 j75Var = this.r;
        if (j75Var == null) {
            return null;
        }
        int iP = p();
        while (true) {
            cj cjVar = this.g;
            if (iP < cjVar.t.length()) {
                int length2 = this.l.t.length() - 1;
                if (iP <= length2) {
                    length2 = iP;
                }
                long jA = j75Var.a(length2);
                int i = u75.r;
                int i2 = (int) (jA & 4294967295L);
                if (i2 > iP) {
                    length = this.n.n(i2);
                    break;
                }
                iP++;
            } else {
                length = cjVar.t.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final int p() {
        long j = this.x;
        int i = u75.r;
        return this.n.j((int) (j & 4294967295L));
    }

    public final void q() {
        this.v.g = null;
        cj cjVar = this.l;
        String str = cjVar.t;
        String str2 = cjVar.t;
        if (str.length() > 0) {
            int iR = qg6.r(str2, u75.x(this.x));
            if (iR == u75.x(this.x) && iR != 0) {
                iR = qg6.r(str2, iR - 1);
            }
            s(iR, iR);
        }
    }

    public final Integer r() {
        j75 j75Var = this.r;
        if (j75Var == null) {
            return null;
        }
        int iX = u75.x(this.x);
        aj3 aj3Var = this.n;
        return Integer.valueOf(aj3Var.n(j75Var.l(j75Var.y.n(aj3Var.j(iX)))));
    }

    public final void s(int i, int i2) {
        this.x = sp2.y(i, i2);
    }

    public final void t() {
        t75 t75Var = this.v;
        t75Var.g = null;
        cj cjVar = this.l;
        if (cjVar.t.length() > 0) {
            if (x()) {
                m();
                return;
            }
            t75Var.g = null;
            if (cjVar.t.length() > 0) {
                String str = cjVar.t;
                long j = this.x;
                int i = u75.r;
                int iY = rg6.y(str, (int) (j & 4294967295L));
                if (iY != -1) {
                    s(iY, iY);
                }
            }
        }
    }

    public final Integer v() {
        int iN;
        j75 j75Var = this.r;
        if (j75Var == null) {
            return null;
        }
        for (int iP = p(); iP > 0; iP--) {
            int length = this.l.t.length() - 1;
            if (iP <= length) {
                length = iP;
            }
            long jA = j75Var.a(length);
            int i = u75.r;
            int i2 = (int) (jA >> 32);
            if (i2 < iP) {
                iN = this.n.n(i2);
                return Integer.valueOf(iN);
            }
        }
        iN = 0;
        return Integer.valueOf(iN);
    }

    public final void w() {
        t75 t75Var = this.v;
        t75Var.g = null;
        cj cjVar = this.l;
        if (cjVar.t.length() > 0) {
            if (!x()) {
                m();
                return;
            }
            t75Var.g = null;
            if (cjVar.t.length() > 0) {
                String str = cjVar.t;
                long j = this.x;
                int i = u75.r;
                int iY = rg6.y(str, (int) (j & 4294967295L));
                if (iY != -1) {
                    s(iY, iY);
                }
            }
        }
    }

    public final boolean x() {
        j75 j75Var = this.r;
        return (j75Var != null ? j75Var.j(p()) : null) != n74.t;
    }

    public final Integer y() {
        j75 j75Var = this.r;
        if (j75Var == null) {
            return null;
        }
        h93 h93Var = j75Var.y;
        int iV = u75.v(this.x);
        aj3 aj3Var = this.n;
        return Integer.valueOf(aj3Var.n(h93Var.r(h93Var.n(aj3Var.j(iV)), true)));
    }
}
