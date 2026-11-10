package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j40 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j40(Object obj, int i, int i2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.b = obj;
        this.c = i;
        this.i = i2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new j40((k40) obj2, this.c, this.i, mu0Var, (byte) 0);
            default:
                return new j40((av0) obj2, this.c, this.i, mu0Var, (byte) 1);
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
        return ((j40) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.b;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                k40 k40Var = (k40) obj2;
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
                k40Var.n = System.currentTimeMillis();
                byte b2 = k40Var.r;
                this.w = true;
                return k40Var.n(0, 0, this.c, this.i, b2, this) == px0Var ? px0Var : og5Var;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    qr0 qr0VarT = ((av0) obj2).T();
                    this.w = true;
                    return qr0VarT.i(this.c, this.i, this) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
