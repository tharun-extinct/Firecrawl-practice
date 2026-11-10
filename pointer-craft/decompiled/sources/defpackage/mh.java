package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mh extends kk2 implements xy1 {
    public final /* synthetic */ nh a;
    public final /* synthetic */ long m;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh(nh nhVar, long j, byte b) {
        super(1);
        this.t = b;
        this.a = nhVar;
        this.m = j;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        no1 no1Var;
        byte b = this.t;
        long j = 0;
        long j2 = this.m;
        nh nhVar = this.a;
        switch (b) {
            case 0:
                fc5 fc5Var = (fc5) obj;
                if (!yf2.p(fc5Var.g(), nhVar.k.g())) {
                    bw4 bw4Var = (bw4) nhVar.k.n.l(fc5Var.g());
                    j2 = bw4Var != null ? ((qe2) bw4Var.getValue()).g : 0L;
                } else if (!qe2.g(nhVar.E, -9223372034707292160L)) {
                    j2 = nhVar.E;
                }
                bw4 bw4Var2 = (bw4) nhVar.k.n.l(fc5Var.r());
                j = bw4Var2 != null ? ((qe2) bw4Var2.getValue()).g : 0L;
                sq4 sq4Var = (sq4) nhVar.f.getValue();
                return (sq4Var == null || (no1Var = (no1) sq4Var.g.l(new qe2(j2), new qe2(j))) == null) ? m50.b0(0.0f, 400.0f, null, 5) : no1Var;
            default:
                if (yf2.p(obj, nhVar.k.g())) {
                    j = qe2.g(nhVar.E, -9223372034707292160L) ? j2 : nhVar.E;
                } else {
                    bw4 bw4Var3 = (bw4) nhVar.k.n.l(obj);
                    if (bw4Var3 != null) {
                        j = ((qe2) bw4Var3.getValue()).g;
                    }
                }
                return new qe2(j);
        }
    }
}
