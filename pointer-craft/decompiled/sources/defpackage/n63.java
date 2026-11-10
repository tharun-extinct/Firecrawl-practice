package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n63 extends zz4 implements bz1 {
    public final /* synthetic */ o63 c;
    public final /* synthetic */ sv i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n63(o63 o63Var, sv svVar, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = o63Var;
        this.i = svVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        sv svVar = this.i;
        o63 o63Var = this.c;
        switch (b) {
            case 0:
                return new n63(o63Var, svVar, mu0Var, (byte) 0);
            default:
                return new n63(o63Var, svVar, mu0Var, (byte) 1);
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
        return ((n63) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        sv svVar = this.i;
        o63 o63Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                qg qgVar = o63Var.v;
                Float f = new Float(cw.g.g(svVar.r));
                this.w = true;
                return qgVar.v(this, f) == px0Var ? px0Var : og5Var;
            default:
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                qg qgVar2 = o63Var.v;
                Float f2 = new Float(cw.g.g(svVar.r));
                this.w = true;
                return qgVar2.v(this, f2) == px0Var ? px0Var : og5Var;
        }
    }
}
