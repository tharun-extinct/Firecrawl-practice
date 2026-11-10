package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qs1 implements er1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ jz1 m;
    public final /* synthetic */ er1 t;

    public /* synthetic */ qs1(er1 er1Var, Object obj, jz1 jz1Var, byte b) {
        this.j = b;
        this.t = er1Var;
        this.a = obj;
        this.m = jz1Var;
    }

    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) throws Throwable {
        byte b = this.j;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        jz1 jz1Var = this.m;
        Object obj = this.a;
        er1 er1Var = this.t;
        switch (b) {
            case 0:
                Object objJ = a11.j(mu0Var, gr1Var, new es1((cz1) jz1Var, null, (byte) 2), new er1[]{er1Var, (er1) obj});
                return objJ == px0Var ? objJ : og5Var;
            default:
                Object objR = er1Var.r(new yh(gr1Var, (x94) obj, (xy1) jz1Var, (byte) 4), mu0Var);
                return objR == px0Var ? objR : og5Var;
        }
    }
}
