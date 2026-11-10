package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pw0 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ b65 t;

    public /* synthetic */ pw0(b65 b65Var, byte b) {
        this.j = b;
        this.t = b65Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        k44 k44Var;
        bl2 bl2VarR;
        char c;
        float fIntBitsToFloat;
        bl2 bl2VarR2;
        bl2 bl2VarR3;
        bl2 bl2VarR4;
        bl2 bl2VarR5;
        byte b = this.j;
        b65 b65Var = this.t;
        switch (b) {
            case 0:
                return new kb(b65Var, (byte) 6);
            case 1:
                b65Var.u();
                return og5.g;
            default:
                bl2 bl2Var = (bl2) obj;
                mt2 mt2Var = b65Var.n;
                k44 k44Var2 = k44.v;
                if (mt2Var == null) {
                    k44Var = k44Var2;
                } else {
                    if (mt2Var.b) {
                        mt2Var = null;
                    }
                    if (mt2Var != null) {
                        aj3 aj3Var = b65Var.y;
                        long j = b65Var.q().y;
                        int i = u75.r;
                        int iJ = aj3Var.j((int) (j >> 32));
                        int iJ2 = b65Var.y.j((int) (b65Var.q().y & 4294967295L));
                        mt2 mt2Var2 = b65Var.n;
                        long jN = 0;
                        long jN2 = (mt2Var2 == null || (bl2VarR5 = mt2Var2.r()) == null) ? 0L : bl2VarR5.N(b65Var.a(true));
                        mt2 mt2Var3 = b65Var.n;
                        if (mt2Var3 != null && (bl2VarR4 = mt2Var3.r()) != null) {
                            jN = bl2VarR4.N(b65Var.a(false));
                        }
                        mt2 mt2Var4 = b65Var.n;
                        float fIntBitsToFloat2 = 0.0f;
                        if (mt2Var4 == null || (bl2VarR3 = mt2Var4.r()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            k75 k75VarN = mt2Var.n();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (bl2VarR3.N((((long) Float.floatToRawIntBits(k75VarN != null ? k75VarN.g.r(iJ).y : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        mt2 mt2Var5 = b65Var.n;
                        if (mt2Var5 != null && (bl2VarR2 = mt2Var5.r()) != null) {
                            k75 k75VarN2 = mt2Var.n();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (bl2VarR2.N((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(k75VarN2 != null ? k75VarN2.g.r(iJ2).y : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i2 = (int) (jN2 >> c);
                        int i3 = (int) (jN >> c);
                        k44Var = new k44(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), (mt2Var.g.l.y() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jN2 & 4294967295L)), Float.intBitsToFloat((int) (jN & 4294967295L))));
                    } else {
                        k44Var = k44Var2;
                    }
                }
                mt2 mt2Var6 = b65Var.n;
                if (mt2Var6 == null || (bl2VarR = mt2Var6.r()) == null) {
                    return null;
                }
                return (bl2VarR.W() && bl2Var.W()) ? kq2.r(bl2Var.h(m50.K(bl2VarR).g(k44Var.n())), k44Var.r()) : k44Var2;
        }
    }
}
