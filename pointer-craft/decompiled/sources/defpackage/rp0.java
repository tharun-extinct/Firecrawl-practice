package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends m70 {
    public final f70 d;

    public rp0(int i, f70 f70Var) {
        super(i);
        this.d = f70Var;
        if (f70Var == f70.j) {
            uo1.C(v54.g(m70.class).r(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        l0.t(du4.w(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.m70
    public final boolean A() {
        return this.d == f70.t;
    }

    public final Object O(Object obj, boolean z) {
        f70 f70Var = this.d;
        f70 f70Var2 = f70.a;
        og5 og5Var = og5.g;
        if (f70Var == f70Var2) {
            Object objZ = super.z(obj);
            return (!(objZ instanceof kd0) || (objZ instanceof jd0)) ? objZ : og5Var;
        }
        Object obj2 = o70.n;
        md0 md0Var = (md0) m70.w.get(this);
        while (true) {
            long andIncrement = m70.t.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zF = f(andIncrement, false);
            int i = o70.y;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (md0Var.m != j3) {
                md0 md0VarM = m(j3, md0Var);
                if (md0VarM != null) {
                    md0Var = md0VarM;
                } else if (zF) {
                    return new jd0(s());
                }
            }
            int iL = L(md0Var, i2, obj, j, obj2, zF);
            if (iL == 0) {
                md0Var.g();
                return og5Var;
            }
            if (iL != 1) {
                if (iL != 2) {
                    if (iL == 3) {
                        l0.z("unexpected");
                        return null;
                    }
                    if (iL == 4) {
                        if (j < b()) {
                            md0Var.g();
                        }
                        return new jd0(s());
                    }
                    if (iL == 5) {
                        md0Var.g();
                    }
                } else {
                    if (zF) {
                        md0Var.t();
                        return new jd0(s());
                    }
                    an5 an5Var = obj2 instanceof an5 ? (an5) obj2 : null;
                    if (an5Var != null) {
                        an5Var.g(md0Var, i2 + i);
                    }
                    j((md0Var.m * j2) + ((long) i2));
                }
            }
            return og5Var;
        }
    }

    @Override // defpackage.m70, defpackage.wj4
    public final Object r(mu0 mu0Var, Object obj) throws Throwable {
        if (O(obj, true) instanceof jd0) {
            throw s();
        }
        return og5.g;
    }

    @Override // defpackage.m70, defpackage.wj4
    public final Object z(Object obj) {
        return O(obj, false);
    }
}
