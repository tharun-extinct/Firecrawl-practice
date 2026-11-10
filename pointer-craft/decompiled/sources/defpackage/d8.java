package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d8 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ p8 t;

    public /* synthetic */ d8(p8 p8Var, byte b) {
        this.j = b;
        this.t = p8Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        float f = 0.0f;
        p8 p8Var = this.t;
        switch (b) {
            case 0:
                Object value = ((tp3) p8Var.j).getValue();
                if (value != null) {
                    return value;
                }
                float fD = ((pp3) p8Var.q).d();
                boolean zIsNaN = Float.isNaN(fD);
                tp3 tp3Var = (tp3) p8Var.l;
                return !zIsNaN ? p8Var.r(fD, 0.0f, tp3Var.getValue()) : tp3Var.getValue();
            case 1:
                Object value2 = ((tp3) p8Var.j).getValue();
                if (value2 != null) {
                    return value2;
                }
                float fD2 = ((pp3) p8Var.q).d();
                boolean zIsNaN2 = Float.isNaN(fD2);
                tp3 tp3Var2 = (tp3) p8Var.l;
                if (zIsNaN2) {
                    return tp3Var2.getValue();
                }
                Object value3 = tp3Var2.getValue();
                i13 i13VarN = p8Var.n();
                float fN = i13VarN.n(value3);
                if (fN != fD2 && !Float.isNaN(fN)) {
                    if (fN < fD2) {
                        Object objY = i13VarN.y(fD2, true);
                        if (objY != null) {
                            return objY;
                        }
                    } else {
                        Object objY2 = i13VarN.y(fD2, false);
                        if (objY2 != null) {
                            return objY2;
                        }
                    }
                }
                return value3;
            case 2:
                float fN2 = p8Var.n().n(((tp3) p8Var.l).getValue());
                float fN3 = p8Var.n().n(((z51) p8Var.m).getValue()) - fN2;
                float fAbs = Math.abs(fN3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    f = 1.0f;
                } else {
                    float fX = (p8Var.x() - fN2) / fN3;
                    if (fX >= 1.0E-6f) {
                        if (fX > 0.999999f) {
                            f = 1.0f;
                        } else {
                            f = fX;
                        }
                    }
                }
                return Float.valueOf(f);
            case 3:
                return p8Var.n();
            default:
                return new fp3(p8Var.n(), ((z51) p8Var.a).getValue());
        }
    }
}
