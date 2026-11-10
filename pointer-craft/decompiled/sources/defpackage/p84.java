package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p84 implements ra4 {
    public final m34 g;

    public p84(m34 m34Var) {
        m34Var.getClass();
        this.g = m34Var;
    }

    @Override // defpackage.ra4
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.ra4
    public final ra4 g() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.ra4
    public final qa4 l() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.ra4
    public final m34 n() {
        return this.g;
    }

    @Override // defpackage.ra4
    public final qa4 r() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.ra4
    public final boolean v() {
        return true;
    }
}
