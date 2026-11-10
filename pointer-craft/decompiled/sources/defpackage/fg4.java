package defpackage;

import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fg4 extends cd1 implements oi2, ej4 {
    public final ag3 Q;
    public f R;
    public k1 S;
    public boolean T;
    public boolean U;
    public u83 V;
    public nb5 W;
    public final t11 X;
    public final ng4 Y;
    public final ag4 Z;
    public final cu1 a0;
    public final qt0 b0;

    public fg4(tb tbVar, s60 s60Var, bq1 bq1Var, ja3 ja3Var, um3 um3Var, gg4 gg4Var, boolean z, boolean z2) {
        super(ra.g, z, ja3Var, um3Var);
        this.Q = new ag3();
        t11 t11Var = new t11(new c11(new et4(yf4.r)));
        this.X = t11Var;
        ng4 ng4Var = new ng4(gg4Var, tbVar, bq1Var == null ? t11Var : bq1Var, um3Var, z2, this.Q, this, new bg4(this, (byte) 0));
        this.Y = ng4Var;
        ag4 ag4Var = new ag4(ng4Var, z);
        this.Z = ag4Var;
        cu1 cu1Var = new cu1(2, null, 10);
        Q0(cu1Var);
        this.a0 = cu1Var;
        qt0 qt0Var = new qt0(um3Var, ng4Var, z2, s60Var, new bg4(this, (byte) 1));
        Q0(qt0Var);
        this.b0 = qt0Var;
        Q0(new eg3(ag4Var, this.Q));
        p60 p60Var = new p60();
        p60Var.o = qt0Var;
        Q0(p60Var);
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.i73
    public final void I0() {
        u83 u83Var = this.V;
        if (u83Var != null) {
            u83Var.y(k33.V(this).F);
        }
        nb5 nb5Var = this.W;
        if (nb5Var != null) {
            nb5Var.y(k33.V(this).F);
        }
        if (this.h) {
            j51 j51Var = k33.V(this).F;
            t11 t11Var = this.X;
            t11Var.getClass();
            t11Var.g = new c11(new et4(j51Var));
        }
    }

    @Override // defpackage.cd1, defpackage.tu3
    public final void L(ju3 ju3Var, ku3 ku3Var, long j) {
        int i;
        List list = ju3Var.g;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Boolean) this.d.a(bv3.g(((qu3) list.get(i2)).a()))).booleanValue()) {
                super.L(ju3Var, ku3Var, j);
                break;
            }
        }
        if (this.e) {
            if (this.H == null) {
                i12 i12VarY = dg6.y(this);
                Q0(i12VarY);
                this.H = i12VarY;
            }
            ku3 ku3Var2 = ku3.j;
            if (ku3Var == ku3Var2 && ju3Var.x == 6) {
                if (!this.T) {
                    this.V = new u83(this.Y, fh6.n(this), new cg4(this, (byte) 0), k33.V(this).F);
                    this.T = true;
                }
                u83 u83Var = this.V;
                if (u83Var != null) {
                    u83Var.t(E0());
                }
            }
            u83 u83Var2 = this.V;
            if (u83Var2 != null) {
                u83Var2.j(ju3Var, ku3Var, j);
            }
            if (ku3Var == ku3Var2 && ((i = ju3Var.x) == 10 || i == 11 || i == 12)) {
                if (!this.U) {
                    this.W = new nb5(this.Y, new cg4(this, (byte) 1), k33.V(this).F);
                    this.U = true;
                }
                nb5 nb5Var = this.W;
                if (nb5Var != null) {
                    nb5Var.l(E0());
                }
            }
            nb5 nb5Var2 = this.W;
            if (nb5Var2 != null) {
                nb5Var2.x(ju3Var, ku3Var, j);
            }
        }
    }

    @Override // defpackage.cd1
    public final Object U0(s3 s3Var, n10 n10Var) {
        ng4 ng4Var = this.Y;
        Object objL = ng4Var.l(ub3.t, new u03(s3Var, ng4Var, null, (byte) 3), n10Var);
        return objL == px0.j ? objL : og5.g;
    }

    @Override // defpackage.oi2
    public final boolean Z(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (this.e) {
            long jR = mx5.r(keyEvent);
            int i = fi2.Q;
            if ((fi2.g(jR, dt5.c()) || fi2.g(mx5.r(keyEvent), dt5.i())) && lx5.y(mx5.n(keyEvent), 2) && !mx5.v(keyEvent)) {
                boolean z = this.Y.n == um3.j;
                qt0 qt0Var = this.b0;
                if (z) {
                    int iR0 = (int) (qt0Var.R0() & 4294967295L);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fi2.g(mx5.r(keyEvent), dt5.i()) ? iR0 : -iR0)));
                } else {
                    int iR1 = (int) (qt0Var.R0() >> 32);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fi2.g(mx5.r(keyEvent), dt5.i()) ? iR1 : -iR1)) << 32);
                }
                m50.T(E0(), null, new eg4(this, jFloatToRawIntBits, null, (byte) 0), 3);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cd1
    public final void a1(nc1 nc1Var) {
        if (this.h) {
            m50.T(this.Q.r(), null, new s12(nc1Var, this, null, (byte) 12), 3);
        }
    }

    @Override // defpackage.o41, defpackage.tu3
    public final void g() {
        m0();
        u83 u83Var = this.V;
        if (u83Var != null) {
            u83Var.y(k33.V(this).F);
        }
        nb5 nb5Var = this.W;
        if (nb5Var != null) {
            nb5Var.y(k33.V(this).F);
        }
        m0();
        if (this.h) {
            j51 j51Var = k33.V(this).F;
            t11 t11Var = this.X;
            t11Var.getClass();
            t11Var.g = new c11(new et4(j51Var));
        }
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        if (this.e && (this.R == null || this.S == null)) {
            this.R = new f(this, (byte) 1);
            this.S = new k1(this, null);
        }
        f fVar = this.R;
        if (fVar != null) {
            ci2[] ci2VarArr = lj4.g;
            nj4Var.g(yi4.n, new p1(null, fVar));
        }
        k1 k1Var = this.S;
        if (k1Var != null) {
            ci2[] ci2VarArr2 = lj4.g;
            nj4Var.g(yi4.v, k1Var);
        }
    }

    public final void l1(tb tbVar, s60 s60Var, bq1 bq1Var, ja3 ja3Var, um3 um3Var, gg4 gg4Var, boolean z, boolean z2) {
        boolean z3;
        if (this.e != z) {
            this.Z.t = z;
            this.R = null;
            this.S = null;
            br2.d(this);
        }
        if (bq1Var == null) {
            bq1Var = this.X;
        }
        ng4 ng4Var = this.Y;
        boolean z4 = true;
        if (yf2.p(ng4Var.g, gg4Var)) {
            z3 = false;
        } else {
            ng4Var.g = gg4Var;
            z3 = true;
        }
        ng4Var.y = tbVar;
        um3 um3Var2 = ng4Var.n;
        if (um3Var2 != um3Var) {
            ng4Var.n = um3Var;
            um3Var2 = um3Var;
            z3 = true;
        }
        if (ng4Var.v != z2) {
            ng4Var.v = z2;
        } else {
            z4 = z3;
        }
        ng4Var.r = bq1Var;
        ng4Var.x = this.Q;
        qt0 qt0Var = this.b0;
        qt0Var.o = um3Var;
        qt0Var.k = z2;
        qt0Var.d = s60Var;
        l1 l1Var = ra.g;
        um3 um3Var3 = um3.j;
        if (um3Var2 != um3Var3) {
            um3Var3 = um3.t;
        }
        k1(l1Var, z, ja3Var, um3Var3, z4);
    }

    @Override // defpackage.oi2
    public final boolean q(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.cd1
    public final void Z0(long j) {
    }
}
