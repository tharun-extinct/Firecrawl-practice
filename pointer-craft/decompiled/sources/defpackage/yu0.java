package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yu0 extends zz4 implements bz1 {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(k40 k40Var, boolean z, byte b, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 2;
        this.c = k40Var;
        this.b = z;
        this.i = b;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new yu0((av0) obj2, this.i, this.b, mu0Var, (byte) 0);
            case 1:
                return new yu0((av0) obj2, this.i, this.b, mu0Var, (byte) 1);
            default:
                return new yu0((k40) obj2, this.b, this.i, mu0Var);
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
            case 1:
                break;
        }
        return ((yu0) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b;
        byte b2 = this.q;
        og5 og5Var = og5.g;
        boolean z = this.b;
        px0 px0Var = px0.j;
        byte b3 = this.i;
        Object obj2 = this.c;
        switch (b2) {
            case 0:
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
                k40 k40VarV = ((av0) obj2).V();
                if (k40VarV == null) {
                    return og5Var;
                }
                this.w = true;
                return k40VarV.v(b3, z, this) == px0Var ? px0Var : og5Var;
            case 1:
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
                k40 k40VarV2 = ((av0) obj2).V();
                if (k40VarV2 == null) {
                    return og5Var;
                }
                this.w = true;
                return k40VarV2.x(b3, z, this) == px0Var ? px0Var : og5Var;
            default:
                k40 k40Var = (k40) obj2;
                boolean z4 = this.w;
                if (z4) {
                    if (z4) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                k40Var.n = System.currentTimeMillis();
                byte b4 = k40Var.r;
                if (z) {
                    b = (byte) (b4 | b3);
                    k40Var.r = b;
                } else {
                    b = (byte) (((byte) (~b3)) & b4);
                    k40Var.r = b;
                }
                byte b5 = b;
                this.w = true;
                return k40Var.n(0, 0, 0, 0, b5, this) == px0Var ? px0Var : og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu0(av0 av0Var, byte b, boolean z, mu0 mu0Var, byte b2) {
        super(2, mu0Var);
        this.q = b2;
        this.c = av0Var;
        this.i = b;
        this.b = z;
    }
}
