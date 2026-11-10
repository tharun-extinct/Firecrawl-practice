package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kn1 implements ra4 {
    public final qa4 g;

    public kn1(Throwable th) {
        this.g = new qa4(this, th, 2);
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
        return this.g;
    }

    @Override // defpackage.ra4
    public final m34 n() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.ra4
    public final qa4 r() {
        return this.g;
    }

    @Override // defpackage.ra4
    public final boolean v() {
        return false;
    }
}
