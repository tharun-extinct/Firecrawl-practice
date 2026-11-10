package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ci extends kk2 implements cz1 {
    public final /* synthetic */ nc5 a;
    public final /* synthetic */ xy1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(xy1 xy1Var, nc5 nc5Var) {
        super(3);
        this.t = xy1Var;
        this.a = nc5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        long j;
        v33 v33Var = (v33) obj;
        us3 us3VarV = ((p33) obj2).v(((ws0) obj3).g);
        if (v33Var.u()) {
            if (((Boolean) this.t.a(this.a.n.getValue())).booleanValue()) {
                j = (((long) us3VarV.j) << 32) | (((long) us3VarV.t) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) us3VarV.j) << 32) | (((long) us3VarV.t) & 4294967295L);
        }
        return v33Var.k0((int) (j >> 32), (int) (4294967295L & j), qi1.j, new zg(us3VarV, (byte) 2));
    }
}
