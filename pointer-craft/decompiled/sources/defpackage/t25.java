package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t25 implements fi {
    public final jj5 g;
    public long j;
    public final vi l;
    public Object n;
    public Object r;
    public vi t;
    public vi v;
    public vi x;
    public final te5 y;

    public t25(oi oiVar, te5 te5Var, Object obj, Object obj2, vi viVar) {
        this.g = oiVar.g(te5Var);
        this.y = te5Var;
        this.r = obj2;
        this.n = obj;
        this.v = (vi) te5Var.g.a(obj);
        xy1 xy1Var = te5Var.g;
        this.x = (vi) xy1Var.a(obj2);
        this.l = viVar != null ? og0.u(viVar) : ((vi) xy1Var.a(obj)).r();
        this.j = -1L;
    }

    @Override // defpackage.fi
    public final boolean g() {
        return this.g.g();
    }

    public final void j(Object obj) {
        if (yf2.p(obj, this.n)) {
            return;
        }
        this.n = obj;
        this.v = (vi) this.y.g.a(obj);
        this.t = null;
        this.j = -1L;
    }

    @Override // defpackage.fi
    public final te5 n() {
        return this.y;
    }

    @Override // defpackage.fi
    public final long r() {
        long j = this.j;
        if (j >= 0) {
            return j;
        }
        long jY = this.g.y(this.v, this.x, this.l);
        this.j = jY;
        return jY;
    }

    public final void t(Object obj) {
        if (yf2.p(this.r, obj)) {
            return;
        }
        this.r = obj;
        this.x = (vi) this.y.g.a(obj);
        this.t = null;
        this.j = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.n + " -> " + this.r + ",initial velocity: " + this.l + ", duration: " + zi6.x(this) + " ms,animationSpec: " + this.g;
    }

    @Override // defpackage.fi
    public final Object v() {
        return this.r;
    }

    @Override // defpackage.fi
    public final vi x(long j) {
        if (!l(j)) {
            return this.g.v(j, this.v, this.x, this.l);
        }
        vi viVar = this.t;
        if (viVar != null) {
            return viVar;
        }
        vi viVarJ = this.g.j(this.v, this.x, this.l);
        this.t = viVarJ;
        return viVarJ;
    }

    @Override // defpackage.fi
    public final Object y(long j) {
        if (l(j)) {
            return this.r;
        }
        vi viVarL = this.g.l(j, this.v, this.x, this.l);
        int iY = viVarL.y();
        for (int i = 0; i < iY; i++) {
            if (Float.isNaN(viVarL.g(i))) {
                cw3.y("AnimationVector cannot contain a NaN. " + viVarL + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.y.y.a(viVarL);
    }
}
