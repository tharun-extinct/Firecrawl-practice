package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ez implements xy1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ o75 t;

    public /* synthetic */ ez(o75 o75Var, xy1 xy1Var, byte b) {
        this.j = b;
        this.t = o75Var;
        this.a = xy1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        xy1 xy1Var = this.a;
        o75 o75Var = this.t;
        switch (b) {
            case 0:
                j75 j75Var = (j75) obj;
                if (o75Var != null) {
                    o75Var.g.setValue(j75Var);
                }
                if (xy1Var != null) {
                    xy1Var.a(j75Var);
                }
                return og5.g;
            default:
                o75Var.r.add(xy1Var);
                return new bw(o75Var, xy1Var, (byte) 4);
        }
    }
}
