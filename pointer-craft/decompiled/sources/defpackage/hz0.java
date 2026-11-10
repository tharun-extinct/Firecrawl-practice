package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hz0 extends zz4 implements bz1 {
    public final /* synthetic */ xy1 c;
    public final /* synthetic */ byte q = 0;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(mu0 mu0Var, xy1 xy1Var) {
        super(2, mu0Var);
        this.c = xy1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        xy1 xy1Var = this.c;
        switch (b) {
            case 0:
                hz0 hz0Var = new hz0(mu0Var, xy1Var);
                hz0Var.w = obj;
                return hz0Var;
            default:
                hz0 hz0Var2 = new hz0(xy1Var, mu0Var);
                hz0Var2.w = obj;
                return hz0Var2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((hz0) b((mu0) obj2, (rb5) obj)).u(og5Var);
            default:
                ((hz0) b((mu0) obj2, (db3) obj)).u(og5Var);
                return og5Var;
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        xy1 xy1Var = this.c;
        switch (b) {
            case 0:
                js2.o(obj);
                rb5 rb5Var = (rb5) this.w;
                rb5Var.getClass();
                return xy1Var.a(((y24) rb5Var).r());
            default:
                js2.o(obj);
                xy1Var.a((db3) this.w);
                return og5.g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(xy1 xy1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = xy1Var;
    }
}
