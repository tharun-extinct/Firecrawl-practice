package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ z w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(z zVar, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = zVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        z zVar = this.w;
        switch (b) {
            case 0:
                return new u(zVar, mu0Var, (byte) 0);
            default:
                return new u(zVar, mu0Var, (byte) 1);
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
                ((u) b(mu0Var, ox0Var)).u(og5Var);
                break;
            default:
                ((u) b(mu0Var, ox0Var)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        mu0 mu0Var = null;
        z zVar = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                if (zVar.K == null) {
                    p72 p72Var = new p72();
                    ja3 ja3Var = zVar.k;
                    if (ja3Var != null) {
                        m50.T(zVar.E0(), null, new q(ja3Var, p72Var, mu0Var, (byte) 0), 3);
                    }
                    zVar.K = p72Var;
                }
                break;
            default:
                js2.o(obj);
                p72 p72Var2 = zVar.K;
                if (p72Var2 != null) {
                    q72 q72Var = new q72(p72Var2);
                    ja3 ja3Var2 = zVar.k;
                    if (ja3Var2 != null) {
                        m50.T(zVar.E0(), null, new q(ja3Var2, q72Var, mu0Var, (byte) 1), 3);
                    }
                    zVar.K = null;
                }
                break;
        }
        return og5Var;
    }
}
