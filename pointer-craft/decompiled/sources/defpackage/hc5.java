package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hc5 implements bw4 {
    public final tp3 a;
    public boolean b;
    public final tp3 c;
    public final zu4 h;
    public final pp3 i;
    public final te5 j;
    public final tp3 m;
    public final /* synthetic */ nc5 o;
    public vi p;
    public eh4 q;
    public final tp3 s;
    public final tp3 t;
    public final rp3 u;
    public t25 w;
    public boolean z;

    public hc5(nc5 nc5Var, Object obj, vi viVar, te5 te5Var) {
        this.o = nc5Var;
        this.j = te5Var;
        tp3 tp3VarM = kq2.M(obj);
        this.t = tp3VarM;
        Object objA = null;
        tp3 tp3VarM2 = kq2.M(m50.b0(0.0f, 0.0f, null, 7));
        this.a = tp3VarM2;
        this.m = kq2.M(new t25((no1) tp3VarM2.getValue(), te5Var, obj, tp3VarM.getValue(), viVar));
        this.c = kq2.M(Boolean.TRUE);
        this.i = new pp3(-1.0f);
        this.s = kq2.M(obj);
        this.p = viVar;
        this.u = new rp3(g().r());
        Float f = (Float) ym5.g.get(te5Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            vi viVar2 = (vi) te5Var.g.a(obj);
            int iY = viVar2.y();
            for (int i = 0; i < iY; i++) {
                viVar2.v(i, fFloatValue);
            }
            objA = this.j.y.a(viVar2);
        }
        this.h = m50.b0(0.0f, 0.0f, objA, 3);
    }

    public final t25 g() {
        return (t25) this.m.getValue();
    }

    @Override // defpackage.bw4
    public final Object getValue() {
        return this.s.getValue();
    }

    public final void l(Object obj, no1 no1Var, Object obj2, vi viVar) {
        Object value;
        if (this.b) {
            t25 t25Var = this.w;
            if (yf2.p(obj, t25Var != null ? t25Var.r : null)) {
                return;
            }
        }
        tp3 tp3Var = this.t;
        boolean zP = yf2.p(tp3Var.getValue(), obj);
        pp3 pp3Var = this.i;
        if (zP && pp3Var.d() == -1.0f && (obj2 == null || obj2.equals(g().n))) {
            return;
        }
        tp3Var.setValue(obj);
        this.a.setValue(no1Var);
        if (obj2 == null) {
            value = pp3Var.d() == -3.0f ? obj : this.s.getValue();
        } else {
            value = obj2;
        }
        if (obj2 != null) {
            n(value);
            if (viVar != null) {
                this.p = viVar;
            }
        }
        tp3 tp3Var2 = this.c;
        v(value, !((Boolean) tp3Var2.getValue()).booleanValue());
        tp3Var2.setValue(Boolean.valueOf(pp3Var.d() == -3.0f));
        if (pp3Var.d() >= 0.0f) {
            n(g().y((long) (pp3Var.d() * g().r())));
        } else if (pp3Var.d() == -3.0f) {
            n(obj);
        }
        this.b = false;
        pp3Var.e(-1.0f);
    }

    public final void n(Object obj) {
        this.s.setValue(obj);
    }

    public final String toString() {
        return "current value: " + this.s.getValue() + ", target: " + this.t.getValue() + ", spec: " + ((no1) this.a.getValue());
    }

    public final void v(Object obj, boolean z) {
        t25 t25Var = this.w;
        Object obj2 = t25Var != null ? t25Var.r : null;
        tp3 tp3Var = this.t;
        boolean zP = yf2.p(obj2, tp3Var.getValue());
        rp3 rp3Var = this.u;
        tp3 tp3Var2 = this.m;
        no1 no1Var = this.h;
        if (zP) {
            tp3Var2.setValue(new t25(no1Var, this.j, obj, obj, this.p.r()));
            this.b = true;
            rp3Var.e(g().r());
            return;
        }
        tp3 tp3Var3 = this.a;
        if (!z || this.z || (((no1) tp3Var3.getValue()) instanceof zu4)) {
            no1Var = (no1) tp3Var3.getValue();
        }
        nc5 nc5Var = this.o;
        tp3Var2.setValue(new t25(nc5Var.v() <= 0 ? no1Var : new nv4(no1Var, nc5Var.v()), this.j, obj, tp3Var.getValue(), this.p));
        rp3Var.e(g().r());
        this.b = false;
        nc5Var.i(true);
        if (nc5Var.l()) {
            st4 st4Var = nc5Var.a;
            int size = st4Var.size();
            for (int i = 0; i < size; i++) {
                hc5 hc5Var = (hc5) st4Var.get(i);
                hc5Var.u.d();
                hc5Var.y(0L);
            }
            nc5Var.i(false);
        }
    }

    public final void x(Object obj, Object obj2, no1 no1Var) {
        this.t.setValue(obj2);
        this.a.setValue(no1Var);
        if (yf2.p(g().n, obj) && yf2.p(g().r, obj2)) {
            return;
        }
        v(obj, false);
    }

    public final void y(long j) {
        if (this.i.d() == -1.0f) {
            this.z = true;
            if (yf2.p(g().r, g().n)) {
                n(g().r);
            } else {
                n(g().y(j));
                this.p = g().x(j);
            }
        }
    }
}
