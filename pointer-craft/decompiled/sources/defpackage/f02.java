package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f02 extends to0 {
    public final long g;
    public final /* synthetic */ h02 l;
    public HashSet n;
    public final boolean r;
    public final ib3 v;
    public final tp3 x;
    public final boolean y;

    public f02(h02 h02Var, long j, boolean z, boolean z2, y22 y22Var) {
        this.l = h02Var;
        this.g = j;
        this.y = z;
        this.r = z2;
        ib3 ib3Var = fe4.g;
        this.v = new ib3();
        this.x = new tp3(tr3.m, l76.q);
    }

    @Override // defpackage.to0
    public final fx0 a() {
        return this.l.y.a();
    }

    @Override // defpackage.to0
    public final void b(h02 h02Var) {
        this.v.g(h02Var);
    }

    @Override // defpackage.to0
    public final ib3 c(yo0 yo0Var, lp4 lp4Var, ib3 ib3Var) {
        return this.l.y.c(yo0Var, lp4Var, ib3Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void f() {
        ib3 ib3Var = this.v;
        if (ib3Var.j()) {
            HashSet hashSet = this.n;
            if (hashSet != null) {
                Object[] objArr = ib3Var.y;
                long[] jArr = ib3Var.g;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    h02 h02Var = (h02) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(h02Var.o());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            ib3Var.y();
        }
    }

    @Override // defpackage.to0
    public final void g(yo0 yo0Var, bz1 bz1Var) {
        this.l.y.g(yo0Var, bz1Var);
    }

    @Override // defpackage.to0
    public final void h(h02 h02Var) {
        HashSet<Set> hashSet = this.n;
        if (hashSet != null) {
            for (Set set : hashSet) {
                h02Var.getClass();
                set.remove(h02Var.o());
            }
        }
        if (h02Var != null) {
            this.v.q(h02Var);
        }
    }

    @Override // defpackage.to0
    public final void i(Set set) {
        HashSet hashSet = this.n;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.n = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.to0
    public final so0 j() {
        return this.l.j;
    }

    @Override // defpackage.to0
    public final long l() {
        return this.g;
    }

    @Override // defpackage.to0
    public final boolean m() {
        return this.l.y.m();
    }

    @Override // defpackage.to0
    public final boolean n() {
        return this.l.y.n();
    }

    @Override // defpackage.to0
    public final void o(yo0 yo0Var) {
        this.l.y.o(yo0Var);
    }

    @Override // defpackage.to0
    public final void p(yo0 yo0Var) {
        this.l.y.p(yo0Var);
    }

    @Override // defpackage.to0
    public final void q(yo0 yo0Var) {
        h02 h02Var = this.l;
        to0 to0Var = h02Var.y;
        to0Var.q(h02Var.j);
        to0Var.q(yo0Var);
    }

    @Override // defpackage.to0
    public final void r() {
        this.l.A--;
    }

    @Override // defpackage.to0
    public final void s(u34 u34Var) {
        this.l.y.s(u34Var);
    }

    @Override // defpackage.to0
    public final tr3 t() {
        return (tr3) this.x.getValue();
    }

    @Override // defpackage.to0
    public final jb0 u(gf gfVar) {
        return this.l.y.u(gfVar);
    }

    @Override // defpackage.to0
    public final boolean v() {
        return this.y;
    }

    @Override // defpackage.to0
    public final v83 w(w83 w83Var) {
        return this.l.y.w(w83Var);
    }

    @Override // defpackage.to0
    public final boolean x() {
        return this.r;
    }

    @Override // defpackage.to0
    public final ib3 y(yo0 yo0Var, lp4 lp4Var, bz1 bz1Var) {
        return this.l.y.y(yo0Var, lp4Var, bz1Var);
    }

    @Override // defpackage.to0
    public final void z() {
        this.l.A++;
    }
}
