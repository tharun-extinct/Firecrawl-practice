package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kw0 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ mt2 t;

    public /* synthetic */ kw0(mt2 mt2Var, byte b) {
        this.j = b;
        this.t = mt2Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        mt2 mt2Var = this.t;
        switch (b) {
            case 0:
                bl2 bl2Var = (bl2) obj;
                k75 k75VarN = mt2Var.n();
                if (k75VarN != null) {
                    k75VarN.r = bl2Var;
                }
                return og5Var;
            case 1:
                tp3 tp3Var = mt2Var.z;
                k65 k65Var = (k65) obj;
                String str = k65Var.g.t;
                cj cjVar = mt2Var.a;
                if (!yf2.p(str, cjVar != null ? cjVar.t : null)) {
                    mt2Var.m.setValue(r42.j);
                    if (((Boolean) tp3Var.getValue()).booleanValue()) {
                        tp3Var.setValue(Boolean.FALSE);
                    } else {
                        mt2Var.u.setValue(Boolean.FALSE);
                    }
                }
                long j = u75.y;
                mt2Var.x(j);
                mt2Var.v(j);
                mt2Var.h.a(k65Var);
                u34 u34Var = mt2Var.y;
                yo0 yo0Var = u34Var.g;
                if (yo0Var != null) {
                    yo0Var.u(u34Var, null);
                }
                return og5Var;
            case 2:
                mt2Var.p.y(((la2) obj).g);
                return og5Var;
            case 3:
                return Boolean.valueOf(mt2Var.p.y(((la2) obj).g));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mt2Var.s.setValue(bool);
                return og5Var;
        }
    }
}
