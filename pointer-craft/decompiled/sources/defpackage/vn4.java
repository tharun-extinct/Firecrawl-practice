package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vn4 {
    public static final vf1 g = new vf1(new lc3((byte) 12), (byte) 1);

    public static final cn4 g(un4 un4Var, in4 in4Var) {
        switch (in4Var.ordinal()) {
            case 0:
                return un4Var.j;
            case 1:
                return un4Var.v;
            case 2:
                return un4Var.l;
            case 3:
                return r(un4Var.v);
            case 4:
                return un4Var.g;
            case 5:
                return r(un4Var.g);
            case 6:
                return na4.g;
            case 7:
                return un4Var.n;
            case 8:
                zw0 zw0Var = un4Var.n;
                wb1 wb1Var = hn4.t;
                return zw0.r(zw0Var, wb1Var, null, null, wb1Var, 6);
            case 9:
                return un4Var.x;
            case 10:
                zw0 zw0Var2 = un4Var.n;
                wb1 wb1Var2 = hn4.t;
                return zw0.r(zw0Var2, null, wb1Var2, wb1Var2, null, 9);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return r(un4Var.n);
            case 12:
                return un4Var.r;
            case 13:
                return yf2.b;
            case 14:
                return un4Var.y;
            default:
                uo1.g();
                return null;
        }
    }

    public static zw0 r(zw0 zw0Var) {
        wb1 wb1Var = hn4.t;
        return zw0.r(zw0Var, null, null, wb1Var, wb1Var, 3);
    }

    public static final cn4 y(in4 in4Var, h02 h02Var) {
        return g((un4) h02Var.a(g), in4Var);
    }
}
