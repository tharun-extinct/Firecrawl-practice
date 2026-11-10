package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a7 {
    public final b7 g;
    public b7 j;
    public boolean l;
    public boolean n;
    public boolean r;
    public boolean v;
    public boolean x;
    public boolean y = true;
    public final HashMap t = new HashMap();

    public a7(b7 b7Var) {
        this.g = b7Var;
    }

    public final void g(v6 v6Var, int i, gh3 gh3Var) {
        long jY;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jY = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jY = y(gh3Var, jY);
                gh3Var = gh3Var.D;
                gh3Var.getClass();
                if (gh3Var.equals(this.g.i())) {
                    break loop0;
                }
            } while (!r(gh3Var).containsKey(v6Var));
            float fN = n(gh3Var, v6Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fN);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fN);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(v6Var instanceof f72 ? Float.intBitsToFloat((int) (jY & 4294967295L)) : Float.intBitsToFloat((int) (jY >> 32)));
        HashMap map = this.t;
        if (map.containsKey(v6Var)) {
            int iIntValue = ((Number) v13.i(v6Var, map)).intValue();
            f72 f72Var = y6.g;
            iRound = ((Number) v6Var.g.l(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(v6Var, Integer.valueOf(iRound));
    }

    public final void j() {
        HashMap map = this.t;
        map.clear();
        z6 z6Var = new z6(this, (byte) 0);
        b7 b7Var = this.g;
        b7Var.c(z6Var);
        map.putAll(r(b7Var.i()));
        this.y = false;
    }

    public final void l() {
        this.y = true;
        b7 b7Var = this.g;
        b7 b7VarB = b7Var.b();
        if (b7VarB == null) {
            return;
        }
        if (this.r) {
            b7VarB.R();
        } else if (this.v || this.n) {
            b7VarB.requestLayout();
        }
        if (this.x) {
            b7Var.R();
        }
        if (this.l) {
            b7Var.requestLayout();
        }
        b7VarB.r().l();
    }

    public int n(gh3 gh3Var, v6 v6Var) {
        return gh3Var.c0(v6Var);
    }

    public Map r(gh3 gh3Var) {
        return gh3Var.F0().r();
    }

    public final void t() {
        a7 a7VarR;
        a7 a7VarR2;
        boolean zV = v();
        b7 b7Var = this.g;
        if (!zV) {
            b7 b7VarB = b7Var.b();
            if (b7VarB == null) {
                return;
            }
            b7Var = b7VarB.r().j;
            if (b7Var == null || !b7Var.r().v()) {
                b7 b7Var2 = this.j;
                if (b7Var2 == null || b7Var2.r().v()) {
                    return;
                }
                b7 b7VarB2 = b7Var2.b();
                if (b7VarB2 != null && (a7VarR2 = b7VarB2.r()) != null) {
                    a7VarR2.t();
                }
                b7 b7VarB3 = b7Var2.b();
                b7Var = (b7VarB3 == null || (a7VarR = b7VarB3.r()) == null) ? null : a7VarR.j;
            }
        }
        this.j = b7Var;
    }

    public final boolean v() {
        return this.r || this.v || this.x || this.l;
    }

    public final boolean x() {
        t();
        return this.j != null;
    }

    public long y(gh3 gh3Var, long j) {
        on3 on3Var = gh3Var.a0;
        if (on3Var != null) {
            a42 a42Var = (a42) on3Var;
            float[] fArrY = a42Var.y();
            if (!a42Var.e) {
                j = l33.y(j, fArrY);
            }
        }
        return k33.P(j, gh3Var.M);
    }
}
