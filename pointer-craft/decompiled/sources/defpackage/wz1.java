package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wz1 implements my1 {
    public final /* synthetic */ ox0 a;
    public final /* synthetic */ ob3 b;
    public final /* synthetic */ ss2 c;
    public final /* synthetic */ ik1 i;
    public final /* synthetic */ xy1 j;
    public final /* synthetic */ ft0 m;
    public final /* synthetic */ bz1 q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ ob3 w;

    public wz1(xy1 xy1Var, boolean z, ox0 ox0Var, ft0 ft0Var, bz1 bz1Var, ob3 ob3Var, ss2 ss2Var, ik1 ik1Var, ob3 ob3Var2) {
        this.j = xy1Var;
        this.t = z;
        this.a = ox0Var;
        this.m = ft0Var;
        this.q = bz1Var;
        this.w = ob3Var;
        this.c = ss2Var;
        this.i = ik1Var;
        this.b = ob3Var2;
    }

    @Override // defpackage.my1
    public final Object g() {
        this.w.setValue("");
        this.j.a(Boolean.FALSE);
        boolean z = this.t;
        ft0 ft0Var = this.m;
        if (z) {
            m50.T(this.a, null, new rz(this.c, this.i, ft0Var, null, (byte) 3), 3);
        } else {
            this.b.setValue(ft0Var);
            this.q.l(ft0Var.t, Integer.valueOf(ft0Var.j));
        }
        return og5.g;
    }
}
