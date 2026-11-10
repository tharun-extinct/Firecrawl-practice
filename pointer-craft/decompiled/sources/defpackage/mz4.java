package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mz4 extends pz4 {
    public final oz4 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz4(zx1 zx1Var, String str, oz4 oz4Var) {
        super(zx1Var, str);
        zx1Var.getClass();
        str.getClass();
        this.m = oz4Var;
    }

    @Override // defpackage.cc4
    public final boolean H() {
        oz4 oz4Var = this.m;
        boolean zH = oz4Var.H();
        boolean zEqualsIgnoreCase = oz4Var.q(0).equalsIgnoreCase("wal");
        zx1 zx1Var = this.j;
        if (zEqualsIgnoreCase) {
            zx1Var.j.enableWriteAheadLogging();
            return zH;
        }
        zx1Var.j.disableWriteAheadLogging();
        return zH;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // defpackage.cc4
    public final boolean e() {
        return this.m.e();
    }

    @Override // defpackage.cc4
    public final void g(int i) {
        this.m.g(i);
    }

    @Override // defpackage.cc4
    public final byte[] getBlob(int i) {
        return this.m.getBlob(i);
    }

    @Override // defpackage.cc4
    public final int getColumnCount() {
        return this.m.getColumnCount();
    }

    @Override // defpackage.cc4
    public final String getColumnName(int i) {
        return this.m.getColumnName(i);
    }

    @Override // defpackage.cc4
    public final long getLong(int i) {
        return this.m.getLong(i);
    }

    @Override // defpackage.cc4
    public final boolean isNull(int i) {
        return this.m.isNull(i);
    }

    @Override // defpackage.cc4
    public final void l(int i, byte[] bArr) {
        bArr.getClass();
        this.m.l(i, bArr);
    }

    @Override // defpackage.cc4
    public final void m(String str, int i) {
        str.getClass();
        this.m.m(str, i);
    }

    @Override // defpackage.cc4
    public final void n(int i, long j) {
        this.m.n(i, j);
    }

    @Override // defpackage.cc4
    public final String q(int i) {
        return this.m.q(i);
    }

    @Override // defpackage.pz4, defpackage.cc4
    public final void reset() {
        this.m.reset();
    }

    @Override // defpackage.pz4, defpackage.cc4
    public final void v() {
        this.m.v();
    }
}
