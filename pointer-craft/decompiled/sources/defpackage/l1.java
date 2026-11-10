package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l1 implements xy1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ l1(byte b) {
        this.j = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                bv3 bv3Var = (bv3) obj;
                return Boolean.valueOf(!(bv3Var != null ? bv3.y(bv3Var.n(), 2) : false));
            case 1:
                return og5Var;
            case 2:
                return og5Var;
            case 3:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 4:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.TRUE;
            case 7:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 8:
                return (xt3) obj;
            case 9:
                tr3 tr3Var = (tr3) obj;
                vf1 vf1Var = sa.g;
                tr3Var.getClass();
                a11.e(tr3Var, vf1Var);
                return ((Context) a11.e(tr3Var, sa.y)).getResources();
            case 10:
                dg dgVar = (dg) obj;
                dgVar.getHandler().post(new xe(dgVar.d, (byte) 1));
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return og5Var;
            case 12:
                return og5Var;
            case 13:
                return og5Var;
            case 14:
                return Boolean.valueOf(!(((yi) obj) instanceof lp3));
            case kq2.x /* 15 */:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 16:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 17:
                ((ih) obj).getClass();
                return new zt0(yj1.v(m50.e0(220, 90, null, 4), 2), yj1.x(m50.e0(90, 0, null, 6), 2), (sq4) null, 12);
            case 18:
                rw rwVar = (rw) obj;
                rwVar.getClass();
                c93.A(rwVar);
                return og5Var;
            case 19:
                ((rw) obj).S0();
                return og5Var;
            case 20:
                return og5Var;
            case 21:
                return og5Var;
            case 22:
                tr3 tr3Var2 = (tr3) obj;
                vf1 vf1Var2 = sa.y;
                tr3Var2.getClass();
                if (((Context) a11.e(tr3Var2, vf1Var2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return u60.y;
                }
                s60.g.getClass();
                return r60.r;
            case 23:
                lj4.t((nj4) obj, 0);
                return og5Var;
            case 24:
                return og5Var;
            case 25:
                hd5 hd5Var = (hd5) obj;
                hd5Var.getClass();
                ((wp3) hd5Var).R0();
                return Boolean.FALSE;
            case 26:
                jo0 jo0Var = (jo0) obj;
                um2 um2Var = jo0Var instanceof um2 ? (um2) jo0Var : null;
                if (um2Var != null && um2Var.X) {
                    mc2.y("Apply is called on deactivated node " + jo0Var);
                }
                return og5Var;
            case 27:
                return Boolean.valueOf(!(((h73) obj) instanceof no0));
            case 28:
                dx0 dx0Var = (dx0) obj;
                if (dx0Var instanceof hx0) {
                    return (hx0) dx0Var;
                }
                return null;
            default:
                return yj1.v(m50.e0(700, 0, null, 6), 2);
        }
    }
}
