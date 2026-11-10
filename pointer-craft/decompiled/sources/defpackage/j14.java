package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j14 {
    public final ct2 g;

    public j14(my1 my1Var) {
        this.g = new ct2(my1Var);
    }

    public m14 g(Object obj) {
        return new m14(this, obj, obj == null, null, null, true);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r4
  0x0034: PHI (r4v2 oi5) = (r4v6 oi5), (r4v7 oi5) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final oi5 n(m14 m14Var, oi5 oi5Var) {
        jp0 jp0Var;
        oi5 oi5Var2;
        bx4 bx4Var;
        xf1 xf1Var;
        oi5 oi5Var3 = null;
        oi5Var3 = null;
        oi5Var3 = null;
        oi5Var3 = null;
        oi5Var3 = null;
        oi5Var3 = null;
        if (oi5Var instanceof xf1) {
            if (m14Var.v) {
                xf1Var = (xf1) oi5Var;
                xf1Var.g.setValue(m14Var.g());
            }
        } else if (oi5Var instanceof bx4) {
            if ((m14Var.y || m14Var.x != null) && !m14Var.v) {
                bx4Var = (bx4) oi5Var;
                if (yf2.p(m14Var.g(), bx4Var.g)) {
                    oi5Var2 = jp0Var;
                    oi5Var2 = bx4Var;
                    oi5Var3 = oi5Var2;
                }
            }
        } else if (oi5Var instanceof jp0) {
            jp0Var = (jp0) oi5Var;
            if (m14Var.n == jp0Var.g) {
                oi5Var2 = jp0Var;
                oi5Var2 = bx4Var;
                oi5Var3 = oi5Var2;
            }
        }
        if (oi5Var3 != null) {
            oi5Var3 = xf1Var;
            return oi5Var3;
        }
        if (!m14Var.v) {
            xy1 xy1Var = m14Var.n;
            if (xy1Var != null) {
                oi5Var3 = xf1Var;
                return new jp0(xy1Var);
            }
            oi5Var3 = xf1Var;
            return new bx4(m14Var.g());
        }
        Object obj = m14Var.x;
        ot4 ot4Var = m14Var.r;
        if (ot4Var == null) {
            oi5Var3 = xf1Var;
            ot4Var = f73.w;
        }
        oi5Var3 = xf1Var;
        return new xf1(new tp3(obj, ot4Var));
    }

    public final m14 r(xy1 xy1Var) {
        return new m14(this, null, false, null, xy1Var, false);
    }

    public oi5 y() {
        return this.g;
    }
}
