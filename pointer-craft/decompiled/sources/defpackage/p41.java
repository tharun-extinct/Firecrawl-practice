package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class p41 extends i73 {
    public i73 f;
    public final int o = hh3.v(this);

    @Override // defpackage.i73
    public final void G0() {
        super.G0();
        for (i73 i73Var = this.f; i73Var != null; i73Var = i73Var.w) {
            i73Var.P0(this.i);
            if (!i73Var.h) {
                i73Var.G0();
            }
        }
    }

    @Override // defpackage.i73
    public final void H0() {
        for (i73 i73Var = this.f; i73Var != null; i73Var = i73Var.w) {
            i73Var.H0();
        }
        super.H0();
    }

    @Override // defpackage.i73
    public final void L0() {
        super.L0();
        for (i73 i73Var = this.f; i73Var != null; i73Var = i73Var.w) {
            i73Var.L0();
        }
    }

    @Override // defpackage.i73
    public final void M0() {
        for (i73 i73Var = this.f; i73Var != null; i73Var = i73Var.w) {
            i73Var.M0();
        }
        super.M0();
    }

    @Override // defpackage.i73
    public final void N0() {
        super.N0();
        for (i73 i73Var = this.f; i73Var != null; i73Var = i73Var.w) {
            i73Var.N0();
        }
    }

    @Override // defpackage.i73
    public final void O0(i73 i73Var) {
        this.j = i73Var;
        for (i73 i73Var2 = this.f; i73Var2 != null; i73Var2 = i73Var2.w) {
            i73Var2.O0(i73Var);
        }
    }

    @Override // defpackage.i73
    public final void P0(gh3 gh3Var) {
        this.i = gh3Var;
        for (i73 i73Var = this.f; i73Var != null; i73Var = i73Var.w) {
            i73Var.P0(gh3Var);
        }
    }

    public final o41 Q0(o41 o41Var) {
        i73 i73Var = ((i73) o41Var).j;
        if (i73Var != o41Var) {
            i73 i73Var2 = o41Var instanceof i73 ? (i73) o41Var : null;
            i73 i73Var3 = i73Var2 != null ? i73Var2.q : null;
            if (i73Var != this.j || !yf2.p(i73Var3, this)) {
                l0.z("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (i73Var.h) {
                mc2.y("Cannot delegate to an already attached node");
            }
            i73Var.O0(this.j);
            int i = this.a;
            int iX = hh3.x(i73Var);
            i73Var.a = iX;
            int i2 = this.a;
            int i3 = iX & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof lm2)) {
                mc2.y("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + i73Var);
            }
            i73Var.w = this.f;
            this.f = i73Var;
            i73Var.q = this;
            S0(iX | this.a, false);
            if (this.h) {
                if (i3 == 0 || (i & 2) != 0) {
                    P0(this.i);
                } else {
                    ah3 ah3Var = k33.V(this).M;
                    this.j.P0(null);
                    ah3Var.l();
                }
                i73Var.G0();
                i73Var.M0();
                if (!i73Var.h) {
                    mc2.y("autoInvalidateInsertedNode called on unattached node");
                }
                hh3.g(i73Var, -1, 1);
            }
        }
        return o41Var;
    }

    public final void R0(o41 o41Var) {
        i73 i73Var = null;
        for (i73 i73Var2 = this.f; i73Var2 != null; i73Var2 = i73Var2.w) {
            if (i73Var2 == o41Var) {
                boolean z = i73Var2.h;
                if (z) {
                    ta3 ta3Var = hh3.g;
                    if (!z) {
                        mc2.y("autoInvalidateRemovedNode called on unattached node");
                    }
                    hh3.g(i73Var2, -1, 2);
                    i73Var2.N0();
                    i73Var2.H0();
                }
                i73Var2.O0(i73Var2);
                i73Var2.m = 0;
                i73 i73Var3 = i73Var2.w;
                if (i73Var == null) {
                    this.f = i73Var3;
                } else {
                    i73Var.w = i73Var3;
                }
                i73Var2.w = null;
                i73Var2.q = null;
                int i = this.a;
                int iX = hh3.x(this);
                S0(iX, true);
                if (this.h && (i & 2) != 0 && (iX & 2) == 0) {
                    ah3 ah3Var = k33.V(this).M;
                    this.j.P0(null);
                    ah3Var.l();
                    return;
                }
                return;
            }
            i73Var = i73Var2;
        }
        l0.b(o41Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r2v2, types: [i73] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void S0(int i, boolean z) {
        i73 i73Var;
        int i2 = this.a;
        this.a = i;
        if (i2 != i) {
            i73 i73Var2 = this.j;
            if (i73Var2 == this) {
                this.m = i;
            }
            boolean z2 = this.h;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.a;
                    r2.a = i;
                    if (r2 == i73Var2) {
                        break;
                    } else {
                        r2 = r2.q;
                    }
                }
                if (z && r2 == i73Var2) {
                    i = hh3.x(i73Var2);
                    i73Var2.a = i;
                }
                int i3 = i | ((r2 == 0 || (i73Var = r2.w) == null) ? 0 : i73Var.m);
                for (?? r3 = r2; r3 != 0; r3 = r3.q) {
                    i3 |= r3.a;
                    r3.m = i3;
                }
            }
        }
    }
}
