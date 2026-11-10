package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g22 implements xy1 {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ l22 t;

    public /* synthetic */ g22(l22 l22Var, int[] iArr, byte b) {
        this.j = b;
        this.t = l22Var;
        this.a = iArr;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int[] iArr = this.a;
        l22 l22Var = this.t;
        co2 co2Var = (co2) obj;
        switch (b) {
            case 0:
                do2 do2VarS = eo2.s();
                String canonicalName = l22Var.getClass().getCanonicalName();
                do2VarS.n();
                ((eo2) do2VarS.t).p(canonicalName);
                List listI0 = pr.i0(iArr);
                do2VarS.n();
                ((eo2) do2VarS.t).w(listI0);
                eo2 eo2Var = (eo2) do2VarS.y();
                co2Var.n();
                ((po2) co2Var.t).e(eo2Var);
                break;
            default:
                no2 no2VarS = oo2.s();
                String canonicalName2 = l22Var.getClass().getCanonicalName();
                no2VarS.n();
                ((oo2) no2VarS.t).p(canonicalName2);
                List listI1 = pr.i0(iArr);
                no2VarS.n();
                ((oo2) no2VarS.t).w(listI1);
                oo2 oo2Var = (oo2) no2VarS.y();
                co2Var.n();
                ((po2) co2Var.t).E(oo2Var);
                break;
        }
        return og5Var;
    }
}
