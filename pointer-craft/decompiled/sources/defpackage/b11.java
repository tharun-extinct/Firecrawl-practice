package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b11 implements fi {
    public final nj5 g;
    public final long j;
    public final Object l;
    public final vi n;
    public final Object r;
    public final vi v;
    public final vi x;
    public final te5 y;

    public b11(c11 c11Var, te5 te5Var, Object obj, vi viVar) {
        nj5 nj5Var = new nj5(c11Var.g);
        this.g = nj5Var;
        this.y = te5Var;
        this.r = obj;
        vi viVar2 = (vi) te5Var.g.a(obj);
        this.n = viVar2;
        this.v = og0.u(viVar);
        this.l = te5Var.y.a(nj5Var.g(viVar2, viVar));
        vi viVarR = nj5Var.r;
        if (viVarR == null) {
            viVarR = viVar2.r();
            nj5Var.r = viVarR;
        }
        int iY = viVarR.y();
        long jMax = 0;
        for (int i = 0; i < iY; i++) {
            viVar2.getClass();
            jMax = Math.max(jMax, nj5Var.g.v(viVar.g(i)));
        }
        this.j = jMax;
        vi viVarU = og0.u(this.g.y(jMax, this.n, viVar));
        this.x = viVarU;
        int iY2 = viVarU.y();
        for (int i2 = 0; i2 < iY2; i2++) {
            vi viVar3 = this.x;
            float fG = viVar3.g(i2);
            float f = this.g.v;
            viVar3.v(i2, xs2.q(fG, -f, f));
        }
    }

    @Override // defpackage.fi
    public final boolean g() {
        return false;
    }

    @Override // defpackage.fi
    public final te5 n() {
        return this.y;
    }

    @Override // defpackage.fi
    public final long r() {
        return this.j;
    }

    @Override // defpackage.fi
    public final Object v() {
        return this.l;
    }

    @Override // defpackage.fi
    public final vi x(long j) {
        if (l(j)) {
            return this.x;
        }
        return this.g.y(j, this.n, this.v);
    }

    @Override // defpackage.fi
    public final Object y(long j) {
        if (l(j)) {
            return this.l;
        }
        xy1 xy1Var = this.y.y;
        nj5 nj5Var = this.g;
        vi viVarR = nj5Var.y;
        vi viVar = this.n;
        if (viVarR == null) {
            viVarR = viVar.r();
            nj5Var.y = viVarR;
        }
        int iY = viVarR.y();
        int i = 0;
        while (true) {
            vi viVar2 = nj5Var.y;
            if (i >= iY) {
                if (viVar2 != null) {
                    return xy1Var.a(viVar2);
                }
                yf2.Y("valueVector");
                throw null;
            }
            if (viVar2 == null) {
                yf2.Y("valueVector");
                throw null;
            }
            viVar2.v(i, nj5Var.g.q(viVar.g(i), this.v.g(i), j));
            i++;
        }
    }
}
