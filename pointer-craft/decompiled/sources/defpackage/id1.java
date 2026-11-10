package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class id1 extends i73 implements lm2 {
    public boolean d;
    public bz1 f;
    public um3 k;
    public p8 o;

    @Override // defpackage.i73
    public final void J0() {
        this.d = false;
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        us3 us3VarV = p33Var.v(j);
        if (!v33Var.u() || !this.d) {
            fp3 fp3Var = (fp3) this.f.l(new qe2((((long) us3VarV.t) & 4294967295L) | (((long) us3VarV.j) << 32)), new ws0(j));
            p8 p8Var = this.o;
            i13 i13Var = (i13) fp3Var.j;
            Object obj = fp3Var.t;
            if (!yf2.p(p8Var.n(), i13Var)) {
                ((tp3) p8Var.t).setValue(i13Var);
                ec3 ec3Var = ((kf2) p8Var.v).y;
                boolean zV = ec3Var.v();
                if (zV) {
                    try {
                        l8 l8Var = (l8) p8Var.c;
                        float fN = p8Var.n().n(obj);
                        if (!Float.isNaN(fN)) {
                            l8.g(l8Var, fN);
                            p8Var.j(null);
                        }
                        p8Var.l(obj);
                        ec3Var.x(null);
                    } catch (Throwable th) {
                        ec3Var.x(null);
                        throw th;
                    }
                }
                if (!zV) {
                    p8Var.j(obj);
                }
            }
        }
        this.d = v33Var.u() || this.d;
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new q2(v33Var, this, us3VarV, (byte) 11));
    }
}
