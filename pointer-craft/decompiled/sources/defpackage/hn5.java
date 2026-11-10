package defpackage;

import io.appground.blek.widget.WidgetConfigurationActivity;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hn5 implements bz1 {
    public final /* synthetic */ WidgetConfigurationActivity a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int m;
    public final /* synthetic */ fo5 t;

    public /* synthetic */ hn5(WidgetConfigurationActivity widgetConfigurationActivity, int i, fo5 fo5Var) {
        this.j = (byte) 2;
        this.a = widgetConfigurationActivity;
        this.m = i;
        this.t = fo5Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        int i = this.m;
        WidgetConfigurationActivity widgetConfigurationActivity = this.a;
        fo5 fo5Var = this.t;
        byte b2 = 1;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = WidgetConfigurationActivity.F;
                if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xq2.g(ue5.m0(278250093, new hn5(fo5Var, widgetConfigurationActivity, i, b2), h02Var), h02Var, 6);
                } else {
                    h02Var.Q();
                }
                return og5Var;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i3 = WidgetConfigurationActivity.F;
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                    return og5Var;
                }
                wl5 wl5VarG = rx2.g(h02Var2);
                if (wl5VarG != null) {
                    gp gpVar = (gp) js2.A(v54.g(gp.class), wl5VarG, gp4.N(xs2.d(wl5VarG), h02Var2), xs2.k(wl5VarG), h02Var2);
                    wl5 wl5VarG2 = rx2.g(h02Var2);
                    if (wl5VarG2 != null) {
                        b30 b30Var = (b30) js2.A(v54.g(b30.class), wl5VarG2, gp4.N(xs2.d(wl5VarG2), h02Var2), xs2.k(wl5VarG2), h02Var2);
                        boolean zBooleanValue = ((Boolean) og0.s(gpVar.r, h02Var2).getValue()).booleanValue();
                        l76 l76Var = oo0.g;
                        if (zBooleanValue) {
                            h02Var2.X(61921044);
                            boolean zJ = h02Var2.j(widgetConfigurationActivity) | h02Var2.n(i) | h02Var2.n(fo5Var.ordinal());
                            Object objK = h02Var2.K();
                            if (zJ || objK == l76Var) {
                                objK = new hn5(widgetConfigurationActivity, i, fo5Var);
                                h02Var2.i0(objK);
                            }
                            ib6.n(fo5Var, (bz1) objK, null, h02Var2, 0);
                            h02Var2.b(false);
                            return og5Var;
                        }
                        h02Var2.X(62189101);
                        boolean zJ2 = h02Var2.j(widgetConfigurationActivity);
                        Object objK2 = h02Var2.K();
                        if (zJ2 || objK2 == l76Var) {
                            objK2 = new m63(widgetConfigurationActivity, (byte) 11);
                            h02Var2.i0(objK2);
                        }
                        int i4 = b30.l;
                        ib6.v(b30Var, (my1) objK2, h02Var2, 8);
                        h02Var2.b(false);
                        return og5Var;
                    }
                    l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                return null;
            default:
                String str = (String) obj;
                int i5 = WidgetConfigurationActivity.F;
                str.getClass();
                WidgetConfigurationActivity widgetConfigurationActivity2 = this.a;
                m50.T(mq2.a(widgetConfigurationActivity2), null, new jn5(widgetConfigurationActivity2, this.t, this.m, (List) obj2, str, null), 3);
                return og5Var;
        }
    }

    public /* synthetic */ hn5(fo5 fo5Var, WidgetConfigurationActivity widgetConfigurationActivity, int i, byte b) {
        this.j = b;
        this.t = fo5Var;
        this.a = widgetConfigurationActivity;
        this.m = i;
    }
}
