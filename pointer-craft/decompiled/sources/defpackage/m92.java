package defpackage;

import androidx.glance.appwidget.MyPackageReplacedReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m92 implements xy1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ m92(n51 n51Var) {
        this.j = (byte) 28;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                lj4.t((nj4) obj, 1);
                return og5Var;
            case 1:
                ((Character) obj).getClass();
                return og5Var;
            case 2:
                hm2 hm2Var = (hm2) obj;
                hm2Var.getClass();
                return hm2Var.r;
            case 3:
                ((Integer) obj).getClass();
                return og5Var;
            case 4:
                ((String) obj).getClass();
                return og5Var;
            case 5:
                return og5Var;
            case 6:
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
                xd3 xd3Var2 = (xd3) obj;
                xd3Var2.getClass();
                xd3Var2.y = true;
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((Long) obj).getClass();
                return og5Var;
            case 12:
                return Boolean.TRUE;
            case 13:
                lj4.q((nj4) obj);
                return og5Var;
            case 14:
                ci2[] ci2VarArr = lj4.g;
                ((nj4) obj).g(kj4.d, og5Var);
                return og5Var;
            case kq2.x /* 15 */:
                hp3 hp3Var = (hp3) obj;
                return du4.q(hp3Var.y, hp3Var.r, "[", ", ", ")");
            case 16:
                co2 co2Var = (co2) obj;
                int i = MyPackageReplacedReceiver.g;
                io2 io2Var = (io2) io2.w().y();
                co2Var.n();
                ((po2) co2Var.t).B(io2Var);
                return og5Var;
            case 17:
                zx0 zx0Var = (zx0) obj;
                zx0Var.getClass();
                return new jd4(k33.F(zx0Var));
            case 18:
                ad3 ad3Var = (ad3) obj;
                ad3Var.getClass();
                return Integer.valueOf(ad3Var.t.g);
            case 19:
                xd3 xd3Var3 = (xd3) obj;
                xd3Var3.getClass();
                xd3Var3.r = true;
                return og5Var;
            case 20:
                ad3 ad3Var2 = (ad3) obj;
                ad3Var2.getClass();
                if (!(ad3Var2 instanceof dd3)) {
                    return null;
                }
                gd3 gd3Var = ((dd3) ad3Var2).w;
                return gd3Var.g(gd3Var.r);
            case 21:
                return og5Var;
            case 22:
                return Integer.valueOf((-((Integer) obj).intValue()) / 8);
            case 23:
                return Integer.valueOf(((Integer) obj).intValue() / 8);
            case 24:
                xd3 xd3Var4 = (xd3) obj;
                xd3Var4.getClass();
                xd3Var4.y = true;
                return og5Var;
            case 25:
                gf gfVar = ((wg3) obj).g;
                if (gfVar != null) {
                    gfVar.g();
                }
                return og5Var;
            case 26:
                ((Long) obj).getClass();
                return og5Var;
            case 27:
                return og5Var;
            case 28:
                throw du4.a(obj);
            default:
                sv3 sv3Var = (sv3) obj;
                if (sv3Var.isAttachedToWindow()) {
                    sv3Var.p();
                }
                return og5Var;
        }
    }

    public /* synthetic */ m92(int i, ls2 ls2Var) {
        this.j = (byte) 5;
    }

    public /* synthetic */ m92(byte b) {
        this.j = b;
    }
}
