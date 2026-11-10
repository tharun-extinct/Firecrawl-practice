package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nm4 implements my1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ nm3 j;
    public final /* synthetic */ my1 t;

    public nm4(nm3 nm3Var, my1 my1Var, xy1 xy1Var) {
        this.j = nm3Var;
        this.t = my1Var;
        this.a = xy1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        nm3 nm3Var = this.j;
        if (nm3Var instanceof fm3) {
            this.t.g();
        } else if (nm3Var instanceof mm3) {
            this.a.a(((mm3) nm3Var).y);
        }
        return og5.g;
    }
}
