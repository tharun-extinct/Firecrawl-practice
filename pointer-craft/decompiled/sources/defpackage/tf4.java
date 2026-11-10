package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tf4 extends p41 implements zo0, ti3 {
    public bq1 A;
    public ja3 B;
    public s60 C;
    public boolean D;
    public tb E;
    public fg4 F;
    public o41 G;
    public ub H;
    public tb I;
    public boolean J;
    public um3 d;
    public boolean e;
    public gg4 k;

    @Override // defpackage.o41
    public final void A0() {
        boolean zU0 = U0();
        if (this.J != zU0) {
            this.J = zU0;
            gg4 gg4Var = this.k;
            um3 um3Var = this.d;
            boolean z = this.D;
            tb tbVar = z ? this.I : this.E;
            V0(tbVar, this.C, this.A, this.B, um3Var, gg4Var, z, this.e);
        }
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.i73
    public final void I0() {
        this.J = U0();
        T0();
        if (this.F == null) {
            gg4 gg4Var = this.k;
            tb tbVar = this.D ? this.I : this.E;
            fg4 fg4Var = new fg4(tbVar, this.C, this.A, this.B, this.d, gg4Var, this.e, this.J);
            Q0(fg4Var);
            this.F = fg4Var;
        }
    }

    @Override // defpackage.i73
    public final void J0() {
        o41 o41Var = this.G;
        if (o41Var != null) {
            R0(o41Var);
        }
    }

    @Override // defpackage.ti3
    public final void N() {
        ub ubVar = (ub) v70.b(this, ln3.g);
        if (yf2.p(ubVar, this.H)) {
            return;
        }
        this.H = ubVar;
        this.I = null;
        o41 o41Var = this.G;
        if (o41Var != null) {
            R0(o41Var);
        }
        this.G = null;
        T0();
        fg4 fg4Var = this.F;
        if (fg4Var != null) {
            gg4 gg4Var = this.k;
            um3 um3Var = this.d;
            tb tbVar = this.D ? this.I : this.E;
            fg4Var.l1(tbVar, this.C, this.A, this.B, um3Var, gg4Var, this.e, this.J);
        }
    }

    public final void T0() {
        o41 o41Var = this.G;
        if (o41Var != null) {
            if (((i73) o41Var).j.h) {
                return;
            }
            Q0(o41Var);
            return;
        }
        if (this.D) {
            mq2.b(this, new gd4(this, (byte) 1));
        }
        tb tbVar = this.D ? this.I : this.E;
        if (tbVar != null) {
            p41 p41Var = tbVar.t;
            if (p41Var.j.h) {
                return;
            }
            Q0(p41Var);
            this.G = p41Var;
        }
    }

    public final boolean U0() {
        return (this.h ? k33.V(this).G : fl2.j) != fl2.t || this.d == um3.j;
    }

    public final void V0(tb tbVar, s60 s60Var, bq1 bq1Var, ja3 ja3Var, um3 um3Var, gg4 gg4Var, boolean z, boolean z2) {
        boolean z3;
        this.k = gg4Var;
        this.d = um3Var;
        boolean z4 = true;
        if (this.D != z) {
            this.D = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (yf2.p(this.E, tbVar)) {
            z4 = false;
        } else {
            this.E = tbVar;
        }
        if (z3 || (z4 && !z)) {
            o41 o41Var = this.G;
            if (o41Var != null) {
                R0(o41Var);
            }
            this.G = null;
            T0();
        }
        this.e = z2;
        this.A = bq1Var;
        this.B = ja3Var;
        this.C = s60Var;
        boolean zU0 = U0();
        this.J = zU0;
        fg4 fg4Var = this.F;
        if (fg4Var != null) {
            fg4Var.l1(this.D ? this.I : this.E, s60Var, bq1Var, ja3Var, um3Var, gg4Var, z2, zU0);
        }
    }
}
