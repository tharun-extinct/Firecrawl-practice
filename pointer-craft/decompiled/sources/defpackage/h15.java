package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h15 extends zz4 implements bz1 {
    public final /* synthetic */ i15 b;
    public final /* synthetic */ qg c;
    public final /* synthetic */ float i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h15(qg qgVar, float f, i15 i15Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = qgVar;
        this.i = f;
        this.b = i15Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new h15(this.c, this.i, this.b, mu0Var, (byte) 0);
            default:
                return new h15(this.c, this.i, this.b, mu0Var, (byte) 1);
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
        return ((h15) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        i15 i15Var = this.b;
        float f = this.i;
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
                vb1 vb1Var = new vb1(f);
                zu4 zu4Var = i15Var.k;
                this.w = true;
                return qg.g(this.c, vb1Var, zu4Var, null, this, 12) == px0Var ? px0Var : og5Var;
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
                vb1 vb1Var2 = new vb1(f);
                zu4 zu4Var2 = i15Var.k;
                this.w = true;
                return qg.g(this.c, vb1Var2, zu4Var2, null, this, 12) == px0Var ? px0Var : og5Var;
        }
    }
}
