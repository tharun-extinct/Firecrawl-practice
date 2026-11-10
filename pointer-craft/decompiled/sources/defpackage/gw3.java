package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gw3 extends zz4 implements bz1 {
    public final /* synthetic */ kw3 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw3(kw3 kw3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = kw3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new gw3(this.c, mu0Var, (byte) 0);
            default:
                return new gw3(this.c, mu0Var, (byte) 1);
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
        return ((gw3) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        final kw3 kw3Var = this.c;
        final byte b2 = 1;
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
                float fD = kw3Var.y.d();
                final byte b3 = 0;
                bz1 bz1Var = new bz1() { // from class: fw3
                    @Override // defpackage.bz1
                    public final Object l(Object obj2, Object obj3) {
                        byte b4 = b3;
                        og5 og5Var2 = og5.g;
                        kw3 kw3Var2 = kw3Var;
                        float fFloatValue = ((Float) obj2).floatValue();
                        ((Float) obj3).getClass();
                        switch (b4) {
                            case 0:
                                kw3Var2.y.e(fFloatValue);
                                break;
                            default:
                                kw3Var2.r.e(fFloatValue);
                                break;
                        }
                        return og5Var2;
                    }
                };
                this.w = true;
                return kq2.m(fD, 1.0f, null, bz1Var, this, 12) == px0Var ? px0Var : og5Var;
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
                float fD2 = kw3Var.r.d();
                bz1 bz1Var2 = new bz1() { // from class: fw3
                    @Override // defpackage.bz1
                    public final Object l(Object obj2, Object obj3) {
                        byte b4 = b2;
                        og5 og5Var2 = og5.g;
                        kw3 kw3Var2 = kw3Var;
                        float fFloatValue = ((Float) obj2).floatValue();
                        ((Float) obj3).getClass();
                        switch (b4) {
                            case 0:
                                kw3Var2.y.e(fFloatValue);
                                break;
                            default:
                                kw3Var2.r.e(fFloatValue);
                                break;
                        }
                        return og5Var2;
                    }
                };
                this.w = true;
                return kq2.m(fD2, 0.0f, null, bz1Var2, this, 12) == px0Var ? px0Var : og5Var;
        }
    }
}
