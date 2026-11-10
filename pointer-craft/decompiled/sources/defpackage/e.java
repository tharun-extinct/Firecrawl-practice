package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends nh2 implements mu0, ox0 {
    public final fx0 m;

    public e(fx0 fx0Var, boolean z) {
        super(z);
        b0((dh2) fx0Var.h(d52.m));
        this.m = fx0Var.b(this);
    }

    @Override // defpackage.nh2
    public final String O() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.nh2
    public final void a0(il0 il0Var) {
        ae6.y(this.m, il0Var);
    }

    @Override // defpackage.nh2
    public String h0() {
        return super.h0();
    }

    @Override // defpackage.mu0
    public final void j(Object obj) {
        Throwable thG = h84.g(obj);
        if (thG != null) {
            obj = new hl0(thG, false);
        }
        Object objG0 = g0(obj);
        if (objG0 == gp4.u) {
            return;
        }
        G(objG0);
    }

    @Override // defpackage.nh2
    public final void k0(Object obj) {
        if (!(obj instanceof hl0)) {
            s0(obj);
        } else {
            hl0 hl0Var = (hl0) obj;
            r0(hl0Var.g, qr.g.getIntVolatile(hl0Var, hl0.y) == 1);
        }
    }

    public final void t0(rx0 rx0Var, e eVar, bz1 bz1Var) throws Throwable {
        Object objL;
        int iOrdinal = rx0Var.ordinal();
        og5 og5Var = og5.g;
        if (iOrdinal == 0) {
            try {
                pw5.K(pw5.o(pw5.q(eVar, this, bz1Var)), og5Var);
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof ha1) {
                    th = ((ha1) th).j;
                }
                j(new g84(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                bz1Var.getClass();
                pw5.o(pw5.q(eVar, this, bz1Var)).j(og5Var);
                return;
            }
            if (iOrdinal != 3) {
                uo1.g();
                return;
            }
            try {
                fx0 fx0Var = this.m;
                Object objW = pw5.W(fx0Var, null);
                try {
                    if (bz1Var instanceof ix) {
                        ue5.f(2, bz1Var);
                        objL = bz1Var.l(eVar, this);
                    } else {
                        objL = pw5.X(bz1Var, eVar, this);
                    }
                    pw5.J(fx0Var, objW);
                    if (objL != px0.j) {
                        j(objL);
                    }
                } catch (Throwable th2) {
                    pw5.J(fx0Var, objW);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof ha1) {
                    th = ((ha1) th).j;
                }
                j(new g84(th));
            }
        }
    }

    @Override // defpackage.mu0
    public final fx0 v() {
        return this.m;
    }

    @Override // defpackage.ox0
    public final fx0 w() {
        return this.m;
    }

    public void s0(Object obj) {
    }

    public void r0(Throwable th, boolean z) {
    }
}
