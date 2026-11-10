package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nv extends i73 {
    public final /* synthetic */ ov f;
    public d95 o;

    public nv(ov ovVar) {
        this.f = ovVar;
    }

    @Override // defpackage.i73
    public final void I0() {
        ov ovVar = this.f;
        ovVar.g = this;
        if (ovVar.y != null) {
            this.o = qb6.n(this, new m(this, ovVar, (byte) 8));
        }
    }

    @Override // defpackage.i73
    public final void J0() {
        ov ovVar = this.f;
        if (ovVar.g == this) {
            ovVar.g = null;
        }
        d95 d95Var = this.o;
        if (d95Var != null) {
            d95Var.y();
        }
        this.o = null;
    }
}
