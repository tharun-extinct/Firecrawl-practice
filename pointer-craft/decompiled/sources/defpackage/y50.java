package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y50 implements t33 {
    public final /* synthetic */ byte g;
    public static final y50 y = new y50(0);
    public static final y50 r = new y50(1);
    public static final q21 n = new q21((byte) 8);
    public static final y50 v = new y50(2);
    public static final y50 x = new y50(3);

    public /* synthetic */ y50(byte b) {
        this.g = b;
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        byte b = this.g;
        qi1 qi1Var = qi1.j;
        switch (b) {
            case 0:
                return v33Var.k0(ws0.m(j), ws0.a(j), qi1Var, new l1((byte) 20));
            case 1:
                return v33Var.k0(ws0.t(j), ws0.j(j), qi1Var, n);
            case 2:
                return v33Var.k0(ws0.m(j), ws0.a(j), qi1Var, new q21((byte) 20));
            default:
                return v33Var.k0(ws0.l(j) ? ws0.t(j) : 0, ws0.x(j) ? ws0.j(j) : 0, qi1Var, new nd4((byte) 23));
        }
    }
}
