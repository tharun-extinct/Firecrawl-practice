package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s7 extends zz4 implements bz1 {
    public final /* synthetic */ ox0 b;
    public final /* synthetic */ bz1 c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7(bz1 bz1Var, Object obj, ox0 ox0Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = bz1Var;
        this.i = obj;
        this.b = ox0Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new s7(this.c, this.i, this.b, mu0Var, (byte) 0);
            default:
                return new s7(this.c, this.i, this.b, mu0Var, (byte) 1);
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
        return ((s7) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = this.b;
        Object obj2 = this.i;
        bz1 bz1Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.w = true;
                    if (bz1Var.l(obj2, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                k33.d(ox0Var, new f7());
                return og5Var;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    if (bz1Var.l(obj2, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                k33.d(ox0Var, new g7());
                return og5Var;
        }
    }
}
