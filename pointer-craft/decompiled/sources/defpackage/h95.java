package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h95 extends zz4 implements bz1 {
    public final /* synthetic */ i95 c;
    public final /* synthetic */ float i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h95(i95 i95Var, float f, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = i95Var;
        this.i = f;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        float f = this.i;
        i95 i95Var = this.c;
        switch (b) {
            case 0:
                return new h95(i95Var, f, mu0Var, (byte) 0);
            default:
                return new h95(i95Var, f, mu0Var, (byte) 1);
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
        return ((h95) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        float f = this.i;
        px0 px0Var = px0.j;
        i95 i95Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    qg qgVar = i95Var.A;
                    if (qgVar == null) {
                        return og5Var;
                    }
                    Float f2 = new Float(f);
                    oi oiVar = i95Var.d ? k05.x : i95Var.k;
                    this.w = true;
                    obj = qg.g(qgVar, f2, oiVar, null, this, 12);
                    if (obj == px0Var) {
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
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    qg qgVar2 = i95Var.e;
                    if (qgVar2 == null) {
                        return og5Var;
                    }
                    Float f3 = new Float(f);
                    oi oiVar2 = i95Var.d ? k05.x : i95Var.k;
                    this.w = true;
                    obj = qg.g(qgVar2, f3, oiVar2, null, this, 12);
                    if (obj == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
        }
    }
}
