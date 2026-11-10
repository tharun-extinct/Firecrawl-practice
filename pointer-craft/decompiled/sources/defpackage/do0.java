package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class do0 extends zz4 implements bz1 {
    public /* synthetic */ float c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do0(Object obj, float f, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.c = f;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                do0 do0Var = new do0((eo0) obj2, mu0Var);
                do0Var.c = ((Number) obj).floatValue();
                return do0Var;
            case 1:
                return new do0((xo4) obj2, this.c, mu0Var, (byte) 1);
            default:
                return new do0((rf4) obj2, this.c, mu0Var, (byte) 2);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((do0) b((mu0) obj2, Float.valueOf(((Number) obj).floatValue()))).u(og5Var);
            case 1:
                return ((do0) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((do0) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object objY;
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                eo0 eo0Var = (eo0) obj2;
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return new Float(Float.intBitsToFloat((int) (((wi3) obj).g & 4294967295L)));
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                float f = this.c;
                Object objL = eo0Var.g.n.j.l(yi4.v);
                if (objL == null) {
                    objL = null;
                }
                bz1 bz1Var = (bz1) objL;
                if (bz1Var == null) {
                    mc2.r("Required value was null.");
                    up.q();
                    return null;
                }
                wi3 wi3Var = new wi3((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
                this.w = true;
                obj = bz1Var.l(wi3Var, this);
                if (obj == px0Var) {
                    return px0Var;
                }
                return new Float(Float.intBitsToFloat((int) (((wi3) obj).g & 4294967295L)));
            case 1:
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
                float f2 = this.c;
                this.w = true;
                p8 p8Var = ((xo4) obj2).n;
                Object value = ((tp3) p8Var.l).getValue();
                Object objR = p8Var.r(p8Var.x(), f2, value);
                boolean zBooleanValue = ((Boolean) ((xy1) p8Var.n).a(objR)).booleanValue();
                ub3 ub3Var = ub3.j;
                if (zBooleanValue) {
                    objY = p8Var.y(objR, ub3Var, new m7(p8Var, f2, null), this);
                    if (objY != px0Var) {
                        objY = og5Var;
                    }
                    if (objY != px0Var) {
                        objY = og5Var;
                    }
                } else {
                    objY = p8Var.y(value, ub3Var, new m7(p8Var, f2, null), this);
                    if (objY != px0Var) {
                        objY = og5Var;
                    }
                    if (objY != px0Var) {
                        objY = og5Var;
                    }
                }
                if (objY != px0Var) {
                    objY = og5Var;
                }
                return objY == px0Var ? px0Var : og5Var;
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
                rf4 rf4Var = (rf4) obj2;
                int iW = xs2.w((int) this.c, 0, rf4Var.x.d());
                this.w = true;
                return jf6.y(rf4Var, (float) (iW - rf4Var.g.d()), this) == px0Var ? px0Var : og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do0(eo0 eo0Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 0;
        this.i = eo0Var;
    }
}
