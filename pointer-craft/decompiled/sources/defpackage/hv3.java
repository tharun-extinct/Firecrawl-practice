package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hv3 implements cc4 {
    public final /* synthetic */ ov3 a;
    public final cc4 j;
    public final long t;

    public hv3(ov3 ov3Var, cc4 cc4Var) {
        cc4Var.getClass();
        this.a = ov3Var;
        this.j = cc4Var;
        this.t = ey5.y();
    }

    @Override // defpackage.cc4
    public final boolean H() {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            return this.j.H();
        }
        zq2.B("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            this.j.close();
        } else {
            zq2.B("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.cc4
    public final void g(int i) {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            this.j.g(i);
        } else {
            zq2.B("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.cc4
    public final byte[] getBlob(int i) {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            return this.j.getBlob(i);
        }
        zq2.B("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.cc4
    public final int getColumnCount() {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            return this.j.getColumnCount();
        }
        zq2.B("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.cc4
    public final String getColumnName(int i) {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            return this.j.getColumnName(i);
        }
        zq2.B("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.cc4
    public final long getLong(int i) {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            return this.j.getLong(i);
        }
        zq2.B("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.cc4
    public final boolean isNull(int i) {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            return this.j.isNull(i);
        }
        zq2.B("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.cc4
    public final void l(int i, byte[] bArr) {
        bArr.getClass();
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            this.j.l(i, bArr);
        } else {
            zq2.B("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.cc4
    public final void m(String str, int i) {
        str.getClass();
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            this.j.m(str, i);
        } else {
            zq2.B("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.cc4
    public final void n(int i, long j) {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            this.j.n(i, j);
        } else {
            zq2.B("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.cc4
    public final String q(int i) {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            return this.j.q(i);
        }
        zq2.B("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.cc4
    public final void reset() {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            this.j.reset();
        } else {
            zq2.B("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.cc4
    public final void v() {
        if (this.a.v) {
            zq2.B("Statement is recycled", 21);
            throw null;
        }
        if (this.t == ey5.y()) {
            this.j.v();
        } else {
            zq2.B("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }
}
