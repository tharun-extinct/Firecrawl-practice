package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nc5 {
    public final st4 a;
    public final g90 g;
    public final st4 m;
    public final tp3 n;
    public final tp3 q;
    public final String r;
    public final tp3 t;
    public final z51 w;
    public final tp3 x;
    public final nc5 y;
    public final tp3 v = kq2.M(null);
    public final rp3 l = new rp3(0);
    public final rp3 j = new rp3(Long.MIN_VALUE);

    public nc5(g90 g90Var, nc5 nc5Var, String str) {
        this.g = g90Var;
        this.y = nc5Var;
        this.r = str;
        this.n = kq2.M(g90Var.n());
        this.x = kq2.M(new gc5(g90Var.n(), g90Var.n()));
        Boolean bool = Boolean.FALSE;
        this.t = kq2.M(bool);
        this.a = new st4();
        this.m = new st4();
        this.q = kq2.M(bool);
        this.w = pt4.y(new zb5(this, (byte) 1));
        g90Var.s(this);
    }

    public final void a(float f) {
        st4 st4Var = this.a;
        int size = st4Var.size();
        for (int i = 0; i < size; i++) {
            hc5 hc5Var = (hc5) st4Var.get(i);
            hc5Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                t25 t25Var = hc5Var.w;
                if (t25Var != null) {
                    hc5Var.g().j(t25Var.r);
                    hc5Var.q = null;
                    hc5Var.w = null;
                }
                Object obj = f == -4.0f ? hc5Var.g().n : hc5Var.g().r;
                hc5Var.g().j(obj);
                hc5Var.g().t(obj);
                hc5Var.n(obj);
                hc5Var.u.e(hc5Var.g().r());
            } else {
                hc5Var.i.e(f);
            }
        }
        st4 st4Var2 = this.m;
        int size2 = st4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((nc5) st4Var2.get(i2)).a(f);
        }
    }

    public final void b() {
        t25 t25Var;
        st4 st4Var = this.a;
        int size = st4Var.size();
        for (int i = 0; i < size; i++) {
            hc5 hc5Var = (hc5) st4Var.get(i);
            eh4 eh4Var = hc5Var.q;
            if (eh4Var != null && (t25Var = hc5Var.w) != null) {
                long jA0 = k33.a0(eh4Var.l * ((double) eh4Var.n));
                Object objY = t25Var.y(jA0);
                if (hc5Var.b) {
                    hc5Var.g().t(objY);
                }
                hc5Var.g().j(objY);
                hc5Var.u.e(hc5Var.g().r());
                if (hc5Var.i.d() == -2.0f || hc5Var.b) {
                    hc5Var.n(objY);
                } else {
                    hc5Var.y(hc5Var.o.v());
                }
                if (jA0 >= eh4Var.l) {
                    hc5Var.q = null;
                    hc5Var.w = null;
                } else {
                    eh4Var.r = false;
                }
            }
        }
        st4 st4Var2 = this.m;
        int size2 = st4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((nc5) st4Var2.get(i2)).b();
        }
    }

    public final void c(long j) {
        if (this.y == null) {
            this.l.e(j);
        }
    }

    public final void g(Object obj, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? h02Var.x(obj) : h02Var.j(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(this) ? 32 : 16;
        }
        byte b = 0;
        if (!h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            h02Var.Q();
        } else if (l()) {
            h02Var.X(467722849);
            h02Var.b(false);
        } else {
            h02Var.X(466062241);
            s(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (z || objK == l76Var) {
                objK = pt4.y(new zb5(this, b));
                h02Var.i0(objK);
            }
            if (((Boolean) ((bw4) objK).getValue()).booleanValue()) {
                h02Var.X(466470356);
                Object objK2 = h02Var.K();
                if (objK2 == l76Var) {
                    objK2 = k33.E(h02Var);
                    h02Var.i0(objK2);
                }
                ox0 ox0Var = (ox0) objK2;
                boolean zJ = h02Var.j(ox0Var) | (i3 == 32);
                Object objK3 = h02Var.K();
                if (zJ || objK3 == l76Var) {
                    objK3 = new xf(ox0Var, this, (byte) 27);
                    h02Var.i0(objK3);
                }
                k33.t(ox0Var, this, (xy1) objK3, h02Var);
                h02Var.b(false);
            } else {
                h02Var.X(467712929);
                h02Var.b(false);
            }
            h02Var.b(false);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tk((byte) 10, i, this, obj);
        }
    }

    public final void i(boolean z) {
        this.t.setValue(Boolean.valueOf(z));
    }

    public final void j(long j, boolean z) {
        rp3 rp3Var = this.j;
        long jD = rp3Var.d();
        g90 g90Var = this.g;
        if (jD == Long.MIN_VALUE) {
            rp3Var.e(j);
            ((tp3) g90Var.g).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((tp3) g90Var.g).getValue()).booleanValue()) {
            ((tp3) g90Var.g).setValue(Boolean.TRUE);
        }
        i(false);
        st4 st4Var = this.a;
        int size = st4Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            hc5 hc5Var = (hc5) st4Var.get(i);
            tp3 tp3Var = hc5Var.c;
            tp3 tp3Var2 = hc5Var.c;
            if (!((Boolean) tp3Var.getValue()).booleanValue()) {
                long jR = z ? hc5Var.g().r() : j;
                hc5Var.n(hc5Var.g().y(jR));
                hc5Var.p = hc5Var.g().x(jR);
                if (hc5Var.g().l(jR)) {
                    tp3Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) tp3Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        st4 st4Var2 = this.m;
        int size2 = st4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            nc5 nc5Var = (nc5) st4Var2.get(i2);
            tp3 tp3Var3 = nc5Var.n;
            g90 g90Var2 = nc5Var.g;
            if (!yf2.p(tp3Var3.getValue(), g90Var2.n())) {
                nc5Var.j(j, z);
            }
            if (!yf2.p(nc5Var.n.getValue(), g90Var2.n())) {
                z2 = false;
            }
        }
        if (z2) {
            t();
        }
    }

    public final boolean l() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    public final void m(Object obj, Object obj2) {
        this.j.e(Long.MIN_VALUE);
        g90 g90Var = this.g;
        ((tp3) g90Var.g).setValue(Boolean.FALSE);
        boolean zL = l();
        tp3 tp3Var = this.n;
        if (!zL || !yf2.p(g90Var.n(), obj) || !yf2.p(tp3Var.getValue(), obj2)) {
            if (!yf2.p(g90Var.n(), obj) && (g90Var instanceof pb3)) {
                g90Var.i(obj);
            }
            tp3Var.setValue(obj2);
            this.q.setValue(Boolean.TRUE);
            this.x.setValue(new gc5(obj, obj2));
        }
        st4 st4Var = this.m;
        int size = st4Var.size();
        for (int i = 0; i < size; i++) {
            nc5 nc5Var = (nc5) st4Var.get(i);
            nc5Var.getClass();
            if (nc5Var.l()) {
                nc5Var.m(nc5Var.g.n(), nc5Var.n.getValue());
            }
        }
        st4 st4Var2 = this.a;
        int size2 = st4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((hc5) st4Var2.get(i2)).y(0L);
        }
    }

    public final boolean n() {
        st4 st4Var = this.a;
        int size = st4Var.size();
        for (int i = 0; i < size; i++) {
            if (((hc5) st4Var.get(i)).q != null) {
                return true;
            }
        }
        st4 st4Var2 = this.m;
        int size2 = st4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((nc5) st4Var2.get(i2)).n()) {
                return true;
            }
        }
        return false;
    }

    public final void q(long j) {
        rp3 rp3Var = this.j;
        if (rp3Var.d() == Long.MIN_VALUE) {
            rp3Var.e(j);
        }
        c(j);
        i(false);
        st4 st4Var = this.a;
        int size = st4Var.size();
        for (int i = 0; i < size; i++) {
            ((hc5) st4Var.get(i)).y(j);
        }
        st4 st4Var2 = this.m;
        int size2 = st4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            nc5 nc5Var = (nc5) st4Var2.get(i2);
            if (!yf2.p(nc5Var.n.getValue(), nc5Var.g.n())) {
                nc5Var.q(j);
            }
        }
    }

    public final void r() {
        st4 st4Var = this.a;
        int size = st4Var.size();
        for (int i = 0; i < size; i++) {
            hc5 hc5Var = (hc5) st4Var.get(i);
            hc5Var.w = null;
            hc5Var.q = null;
            hc5Var.b = false;
        }
        st4 st4Var2 = this.m;
        int size2 = st4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((nc5) st4Var2.get(i2)).r();
        }
    }

    public final void s(Object obj) {
        tp3 tp3Var = this.n;
        if (yf2.p(tp3Var.getValue(), obj)) {
            return;
        }
        this.x.setValue(new gc5(tp3Var.getValue(), obj));
        g90 g90Var = this.g;
        if (!yf2.p(g90Var.n(), tp3Var.getValue())) {
            g90Var.i(tp3Var.getValue());
        }
        tp3Var.setValue(obj);
        if (this.j.d() == Long.MIN_VALUE) {
            i(true);
        }
        st4 st4Var = this.a;
        int size = st4Var.size();
        for (int i = 0; i < size; i++) {
            ((hc5) st4Var.get(i)).i.e(-2.0f);
        }
    }

    public final void t() {
        this.j.e(Long.MIN_VALUE);
        g90 g90Var = this.g;
        if (g90Var instanceof pb3) {
            g90Var.i(this.n.getValue());
        }
        c(0L);
        ((tp3) g90Var.g).setValue(Boolean.FALSE);
        st4 st4Var = this.m;
        int size = st4Var.size();
        for (int i = 0; i < size; i++) {
            ((nc5) st4Var.get(i)).t();
        }
    }

    public final String toString() {
        st4 st4Var = this.a;
        int size = st4Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((hc5) st4Var.get(i)) + ", ";
        }
        return str;
    }

    public final long v() {
        nc5 nc5Var = this.y;
        return nc5Var != null ? nc5Var.v() : this.l.d();
    }

    public final void w(eh4 eh4Var) {
        st4 st4Var = this.a;
        int size = st4Var.size();
        for (int i = 0; i < size; i++) {
            hc5 hc5Var = (hc5) st4Var.get(i);
            tp3 tp3Var = hc5Var.s;
            if (!yf2.p(hc5Var.g().r, hc5Var.g().n)) {
                hc5Var.w = hc5Var.g();
                hc5Var.q = eh4Var;
            }
            hc5Var.m.setValue(new t25(hc5Var.h, hc5Var.j, tp3Var.getValue(), tp3Var.getValue(), hc5Var.p.r()));
            hc5Var.u.e(hc5Var.g().r());
            hc5Var.b = true;
        }
        st4 st4Var2 = this.m;
        int size2 = st4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((nc5) st4Var2.get(i2)).w(eh4Var);
        }
    }

    public final fc5 x() {
        return (fc5) this.x.getValue();
    }

    public final long y() {
        st4 st4Var = this.a;
        int size = st4Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((hc5) st4Var.get(i)).u.d());
        }
        st4 st4Var2 = this.m;
        int size2 = st4Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((nc5) st4Var2.get(i2)).y());
        }
        return jMax;
    }
}
