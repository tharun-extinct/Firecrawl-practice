package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m9 implements xy1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ m9(byte b) {
        this.j = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        String strW;
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.valueOf(rf6.n((gj4) obj));
            case 2:
                return Boolean.valueOf(rf6.n((gj4) obj));
            case 3:
                ci2[] ci2VarArr = lj4.g;
                ((nj4) obj).g(kj4.d, og5Var);
                return og5Var;
            case 4:
                ((Long) obj).getClass();
                return og5Var;
            case 5:
                ci2[] ci2VarArr2 = lj4.g;
                ((nj4) obj).g(kj4.k, og5Var);
                return og5Var;
            case 6:
                ((Long) obj).getClass();
                return og5Var;
            case 7:
                return og5Var;
            case 8:
                return og5Var;
            case 9:
                xd3 xd3Var = (xd3) obj;
                xd3Var.getClass();
                xd3Var.y = true;
                return og5Var;
            case 10:
                return (ba3) obj;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                xy2 xy2Var = (xy2) obj;
                xy2Var.r(mx5.y, (int) (xy2Var.g().L() >> 32));
                xy2Var.r(mx5.g, 0.0f);
                return og5Var;
            case 12:
                return og5Var;
            case 13:
                y14 y14Var = (y14) obj;
                y14Var.getClass();
                String strQ0 = cj0.q0(y14Var.g, ",", null, null, null, 62);
                int i = y14Var.y;
                if (i == 0) {
                    strW = "UNSPECIFIED";
                } else if (i != 1) {
                    strW = i != 2 ? du4.w(i, "UNKNOWN(", ")") : "PENDING";
                } else {
                    strW = "PURCHASED";
                }
                return strQ0 + " state=" + strW + " acked=" + y14Var.r + " suspended=" + y14Var.n;
            case 14:
                return g61.r((g61) obj, null, 0, 0, 0, 0, true, 0, 0, 0L, 0L, false, false, false, 130943);
            case kq2.x /* 15 */:
                return g61.r((g61) obj, null, 0, 0, 0, 0, true, 0, 0, 0L, 0L, false, false, false, 130943);
            case 16:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case 17:
                ((wm2) obj).g();
                return og5Var;
            case 18:
                zf5 zf5Var = (zf5) obj;
                zf5Var.getClass();
                return zf5Var.a;
            case 19:
                return og5Var;
            case 20:
                lj4.t((nj4) obj, 1);
                return og5Var;
            case 21:
                lj4.t((nj4) obj, 0);
                return og5Var;
            case 22:
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                return g61.r(g61Var, null, 0, 0, 0, 0, false, 0, 0, 0L, 0L, true, false, false, 114687);
            case 23:
                return g61.t((g61) obj, 2, 0, 2);
            case 24:
                return g61.t((g61) obj, 0, 0, 2);
            case 25:
                return g61.t((g61) obj, 0, 0, 1);
            case 26:
                g61 g61Var2 = (g61) obj;
                g61Var2.getClass();
                return g61.r(g61Var2, null, 0, 0, 0, 0, false, 0, 0, 0L, 0L, false, true, false, 32767);
            case 27:
                g61 g61Var3 = (g61) obj;
                g61Var3.getClass();
                return g61.r(g61Var3, null, 0, 0, 0, 0, false, 0, 0, 0L, 0L, false, false, true, 32767);
            case 28:
                ((String) obj).getClass();
                return og5Var;
            default:
                ((g61) obj).getClass();
                return og5Var;
        }
    }
}
