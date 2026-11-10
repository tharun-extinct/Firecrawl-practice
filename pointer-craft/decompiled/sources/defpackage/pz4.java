package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pz4 implements cc4 {
    public boolean a;
    public final zx1 j;
    public final String t;

    public pz4(zx1 zx1Var, String str) {
        this.j = zx1Var;
        this.t = str;
    }

    @Override // defpackage.cc4
    public void reset() {
        y();
    }

    @Override // defpackage.cc4
    public void v() {
        y();
    }

    public final void y() {
        if (this.a) {
            zq2.B("statement is closed", 21);
            throw null;
        }
    }
}
