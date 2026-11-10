package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dl4 extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ eq i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl4(eq eqVar, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = eqVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        eq eqVar = this.i;
        switch (b) {
            case 0:
                dl4 dl4Var = new dl4(eqVar, mu0Var, (byte) 0);
                dl4Var.c = obj;
                return dl4Var;
            default:
                dl4 dl4Var2 = new dl4(eqVar, mu0Var, (byte) 1);
                dl4Var2.c = obj;
                return dl4Var2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        yk4 yk4Var = (yk4) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((dl4) b(mu0Var, yk4Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        eq eqVar = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                yk4 yk4Var = (yk4) this.c;
                this.w = true;
                Object objY = yk4Var.y(eqVar, this);
                return objY == px0Var ? px0Var : objY;
            default:
                boolean z2 = this.w;
                og5 og5Var = og5.g;
                if (!z2) {
                    js2.o(obj);
                    yk4 yk4Var2 = (yk4) this.c;
                    String str = eqVar.g;
                    this.w = true;
                    eq eqVar2 = (eq) yk4Var2.g.remove(str);
                    if (eqVar2 != null) {
                        eqVar2.n.g(null);
                        eqVar2.y.set(false);
                        eqVar2.m.x(null);
                    }
                    if (og5Var == px0Var) {
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
