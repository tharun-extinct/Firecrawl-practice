package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class um0 implements hz1 {
    @Override // defpackage.hz1
    public final Object y(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, h02 h02Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        gu0 gu0Var = (gu0) obj2;
        cz1 cz1Var = (cz1) obj3;
        my1 my1Var = (my1) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        g73 g73Var = g73.g;
        if (i2 == 0) {
            i = (h02Var.x(g73Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= h02Var.x(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= h02Var.l(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= h02Var.x(gu0Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= h02Var.j(cz1Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= h02Var.j(my1Var) ? 131072 : 65536;
        }
        if (h02Var.N(i & 1, (599187 & i) != 599186)) {
            ju0.r(str, zBooleanValue, gu0Var, g73Var, cz1Var, my1Var, h02Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
