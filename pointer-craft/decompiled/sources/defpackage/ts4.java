package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ts4 implements bq1 {
    public final ys4 g;
    public final vf4 n = yf4.y;
    public final oi r;
    public final c11 y;

    public ts4(ys4 ys4Var, c11 c11Var, oi oiVar) {
        this.g = ys4Var;
        this.y = c11Var;
        this.r = oiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ts4)) {
            return false;
        }
        ts4 ts4Var = (ts4) obj;
        return yf2.p(ts4Var.r, this.r) && yf2.p(ts4Var.y, this.y) && ts4Var.g.equals(this.g);
    }

    @Override // defpackage.bq1
    public Object g(pf4 pf4Var, float f, mu0 mu0Var) {
        return r(pf4Var, f, xe6.g, (ou0) mu0Var);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.y.hashCode() + (this.r.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object n(pf4 pf4Var, float f, float f2, ps4 ps4Var, ou0 ou0Var) {
        ss4 ss4Var;
        if (ou0Var instanceof ss4) {
            ss4Var = (ss4) ou0Var;
            int i = ss4Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ss4Var.w = i - Integer.MIN_VALUE;
            } else {
                ss4Var = new ss4(this, ou0Var);
            }
        } else {
            ss4Var = new ss4(this, ou0Var);
        }
        ss4 ss4Var2 = ss4Var;
        Object objG = ss4Var2.m;
        int i2 = ss4Var2.w;
        if (i2 == 0) {
            js2.o(objG);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return v70.g(f, f2, 28);
            }
            ss4Var2.w = 1;
            c11 c11Var = this.y;
            objG = (Math.abs(og0.w(c11Var, 0.0f, f2)) >= Math.abs(f) ? new fa4((Object) c11Var, (byte) 11) : new s25(this.r)).g(pf4Var, new Float(f), new Float(f2), ps4Var, ss4Var2);
            px0 px0Var = px0.j;
            if (objG == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objG);
        }
        return ((li) objG).r();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(pf4 pf4Var, float f, xy1 xy1Var, ou0 ou0Var) {
        rs4 rs4Var;
        if (ou0Var instanceof rs4) {
            rs4Var = (rs4) ou0Var;
            int i = rs4Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                rs4Var.w = i - Integer.MIN_VALUE;
            } else {
                rs4Var = new rs4(this, ou0Var);
            }
        } else {
            rs4Var = new rs4(this, ou0Var);
        }
        Object objY = rs4Var.m;
        int i2 = rs4Var.w;
        if (i2 == 0) {
            js2.o(objY);
            rs4Var.w = 1;
            objY = y(pf4Var, f, xy1Var, rs4Var);
            Object obj = px0.j;
            if (objY == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objY);
        }
        li liVar = (li) objY;
        return new Float(((Number) liVar.g()).floatValue() != 0.0f ? ((Number) liVar.y().g()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(pf4 pf4Var, float f, xy1 xy1Var, ou0 ou0Var) {
        os4 os4Var;
        xy1 xy1Var2;
        if (ou0Var instanceof os4) {
            os4Var = (os4) ou0Var;
            int i = os4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                os4Var.c = i - Integer.MIN_VALUE;
            } else {
                os4Var = new os4(this, ou0Var);
            }
        } else {
            os4Var = new os4(this, ou0Var);
        }
        Object objF0 = os4Var.q;
        int i2 = os4Var.c;
        if (i2 == 0) {
            js2.o(objF0);
            qs4 qs4Var = new qs4(this, f, xy1Var, pf4Var, null);
            os4Var.m = xy1Var;
            os4Var.c = 1;
            objF0 = m50.f0(this.n, qs4Var, os4Var);
            px0 px0Var = px0.j;
            if (objF0 == px0Var) {
                return px0Var;
            }
            xy1Var2 = xy1Var;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xy1Var2 = os4Var.m;
            js2.o(objF0);
        }
        li liVar = (li) objF0;
        xy1Var2.a(new Float(0.0f));
        return liVar;
    }
}
