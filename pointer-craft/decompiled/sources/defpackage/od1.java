package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class od1 extends zz4 implements bz1 {
    public final /* synthetic */ i73 b;
    public final /* synthetic */ long c;
    public /* synthetic */ Object i;
    public final /* synthetic */ byte q = 1;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(eq4 eq4Var, long j, gq4 gq4Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = eq4Var;
        this.c = j;
        this.b = gq4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        i73 i73Var = this.b;
        switch (b) {
            case 0:
                od1 od1Var = new od1((pd1) i73Var, this.c, mu0Var);
                od1Var.i = obj;
                return od1Var;
            default:
                return new od1((eq4) this.i, this.c, (gq4) i73Var, mu0Var);
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
        return ((od1) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object objG;
        byte b = this.q;
        og5 og5Var = og5.g;
        long j = this.c;
        px0 px0Var = px0.j;
        i73 i73Var = this.b;
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
                ox0 ox0Var = (ox0) this.i;
                cz1 cz1Var = ((pd1) i73Var).S;
                wi3 wi3Var = new wi3(j);
                this.w = true;
                return cz1Var.x(ox0Var, wi3Var, this) == px0Var ? px0Var : og5Var;
            default:
                gq4 gq4Var = (gq4) i73Var;
                eq4 eq4Var = (eq4) this.i;
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    qg qgVar = eq4Var.g;
                    qe2 qe2Var = new qe2(j);
                    zu4 zu4Var = gq4Var.o;
                    this.w = true;
                    objG = qg.g(qgVar, qe2Var, zu4Var, null, this, 12);
                    if (objG == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    objG = obj;
                }
                gi giVar = ((mi) objG).y;
                return og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(pd1 pd1Var, long j, mu0 mu0Var) {
        super(2, mu0Var);
        this.b = pd1Var;
        this.c = j;
    }
}
