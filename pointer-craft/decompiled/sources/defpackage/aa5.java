package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aa5 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ nj4 t;

    public /* synthetic */ aa5(nj4 nj4Var, byte b) {
        this.j = b;
        this.t = nj4Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        Boolean boolValueOf;
        byte b = this.j;
        boolean z = false;
        ca5 ca5Var = ca5.t;
        ca5 ca5Var2 = ca5.j;
        nj4 nj4Var = this.t;
        jo1 jo1Var = (jo1) obj;
        switch (b) {
            case 0:
                wb wbVar = (wb) jo1Var;
                boolValueOf = wbVar.g.isToggle() ? Boolean.valueOf(wbVar.g.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ca5Var = ca5Var2;
                    }
                    lj4.m(nj4Var, ca5Var);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                wb wbVar2 = (wb) jo1Var;
                boolValueOf = wbVar2.g.isToggle() ? Boolean.valueOf(wbVar2.g.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ca5Var = ca5Var2;
                    }
                    lj4.m(nj4Var, ca5Var);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
