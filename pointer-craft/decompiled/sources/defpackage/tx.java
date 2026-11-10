package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tx extends zz4 implements bz1 {
    public final /* synthetic */ gy c;
    public final /* synthetic */ String i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx(gy gyVar, String str, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = gyVar;
        this.i = str;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        String str = this.i;
        gy gyVar = this.c;
        switch (b) {
            case 0:
                return new tx(gyVar, str, mu0Var, (byte) 0);
            default:
                return new tx(gyVar, str, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((tx) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        gy gyVar = this.c;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                boolean z = this.w;
                boolean z2 = true;
                if (!z) {
                    js2.o(obj);
                    vl vlVar = gyVar.k0;
                    mu0 mu0Var = null;
                    if (vlVar == null) {
                        yf2.Y("popupWindowManager");
                        throw null;
                    }
                    this.w = true;
                    x21 x21Var = na1.g;
                    Object objF0 = m50.f0(c21.a, new yx((Object) vlVar, z2, (Object) this.i, mu0Var, (byte) 3), this);
                    if (objF0 != px0Var) {
                        objF0 = og5Var;
                    }
                    if (objF0 == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            default:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    vl vlVar2 = gyVar.k0;
                    mu0 mu0Var2 = null;
                    if (vlVar2 == null) {
                        yf2.Y("popupWindowManager");
                        throw null;
                    }
                    this.w = true;
                    x21 x21Var2 = na1.g;
                    Object objF1 = m50.f0(c21.a, new yx((Object) vlVar2, false, (Object) this.i, mu0Var2, (byte) 3), this);
                    if (objF1 != px0Var) {
                        objF1 = og5Var;
                    }
                    if (objF1 == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
        }
    }
}
