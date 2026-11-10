package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rq0 implements cc4 {
    public final cc4 j;

    public rq0(cc4 cc4Var) {
        this.j = cc4Var;
    }

    @Override // defpackage.cc4
    public final boolean H() {
        return this.j.H();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        cc4 cc4Var = this.j;
        cc4Var.reset();
        cc4Var.v();
    }

    @Override // defpackage.cc4
    public final boolean e() {
        return this.j.e();
    }

    @Override // defpackage.cc4
    public final void g(int i) {
        this.j.g(i);
    }

    @Override // defpackage.cc4
    public final byte[] getBlob(int i) {
        return this.j.getBlob(i);
    }

    @Override // defpackage.cc4
    public final int getColumnCount() {
        return this.j.getColumnCount();
    }

    @Override // defpackage.cc4
    public final String getColumnName(int i) {
        return this.j.getColumnName(i);
    }

    @Override // defpackage.cc4
    public final long getLong(int i) {
        return this.j.getLong(i);
    }

    @Override // defpackage.cc4
    public final boolean isNull(int i) {
        return this.j.isNull(i);
    }

    @Override // defpackage.cc4
    public final void l(int i, byte[] bArr) {
        bArr.getClass();
        this.j.l(i, bArr);
    }

    @Override // defpackage.cc4
    public final void m(String str, int i) {
        str.getClass();
        this.j.m(str, i);
    }

    @Override // defpackage.cc4
    public final void n(int i, long j) {
        this.j.n(i, j);
    }

    @Override // defpackage.cc4
    public final String q(int i) {
        return this.j.q(i);
    }

    @Override // defpackage.cc4
    public final void reset() {
        this.j.reset();
    }

    @Override // defpackage.cc4
    public final void v() {
        this.j.v();
    }
}
