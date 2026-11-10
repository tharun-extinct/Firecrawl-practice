package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cg extends zz4 implements bz1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg(Object obj, long j, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.c = j;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return new cg((dg) obj2, this.c, mu0Var, (byte) 0);
            case 1:
                return new cg((ol1) obj2, this.c, mu0Var, (byte) 1);
            default:
                return new cg((qg) obj2, this.c, mu0Var, (byte) 2);
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
                return ((cg) b(mu0Var, ox0Var)).u(og5Var);
            case 1:
                ((cg) b(mu0Var, ox0Var)).u(og5Var);
                return px0.j;
            default:
                return ((cg) b(mu0Var, ox0Var)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        long j = this.c;
        Object obj2 = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    ag3 ag3Var = ((dg) obj2).j;
                    this.w = true;
                    return ag3Var.y(j, this) == px0Var ? px0Var : og5Var;
                }
                if (z) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.w;
                if (z2 && !z2) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                do {
                    ((ol1) obj2).n.e(System.currentTimeMillis() - j);
                    this.w = true;
                } while (yf2.e(100L, this) != px0Var);
                return px0Var;
            default:
                boolean z3 = this.w;
                if (z3) {
                    if (z3) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                qg qgVar = (qg) obj2;
                wi3 wi3Var = new wi3(j);
                zu4 zu4Var = ti4.n;
                this.w = true;
                return qg.g(qgVar, wi3Var, zu4Var, null, this, 12) == px0Var ? px0Var : og5Var;
        }
    }
}
