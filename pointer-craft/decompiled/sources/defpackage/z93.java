package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class z93 extends w12 {
    public static final String l(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            return null;
        }
        String string = sharedPreferences.getString(str, null);
        return string == null ? du4.i("Unnamed device (", tx4.o0(str, 5), ")") : string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.w12
    public final void n(Context context, int i, ou0 ou0Var) {
        y93 y93Var;
        if (ou0Var instanceof y93) {
            y93Var = (y93) ou0Var;
            int i2 = y93Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y93Var.w = i2 - Integer.MIN_VALUE;
            } else {
                y93Var = new y93(this, ou0Var);
            }
        } else {
            y93Var = new y93(this, ou0Var);
        }
        Object obj = y93Var.m;
        int i3 = y93Var.w;
        if (i3 == 0) {
            js2.o(obj);
            nm0 nm0Var = new nm0(1335391714, true, new f(context, (byte) 23));
            y93Var.w = 1;
            og0.F(nm0Var, y93Var);
            return;
        }
        if (i3 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
        } else {
            js2.o(obj);
            l0.x();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.w12
    public final void r(Context context, tp tpVar, ou0 ou0Var) {
        w93 w93Var;
        Context applicationContext;
        yi2 yi2Var;
        l62 l62Var;
        boolean zG;
        rw3 rw3Var;
        String string;
        SharedPreferences sharedPreferences;
        final Context context2;
        int i;
        if (ou0Var instanceof w93) {
            w93Var = (w93) ou0Var;
            int i2 = w93Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w93Var.o = i2 - Integer.MIN_VALUE;
            } else {
                w93Var = new w93(this, ou0Var);
            }
        } else {
            w93Var = new w93(this, ou0Var);
        }
        Object obj = w93Var.z;
        int i3 = w93Var.o;
        if (i3 == 0) {
            js2.o(obj);
            applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                throw new IllegalStateException();
            }
            nz0 nz0Var = (nz0) ((yn5) og0.f(applicationContext, yn5.class));
            yi2Var = (yi2) nz0Var.t.get();
            l62Var = (l62) nz0Var.r.get();
            zG = ((v20) nz0Var.x.get()).g();
            new f22(context);
            if (tpVar == null) {
                l0.u("This method only accepts App Widget Glance Id");
                return;
            }
            int iG = tpVar.g();
            rw3Var = new rw3(xi3.j("widget_device_", iG));
            string = context.getString(R.string.widget_media_remote_label);
            string.getClass();
            sharedPreferences = applicationContext.getSharedPreferences("device_names", 0);
            er1 er1VarY = ((ow3) q03.y(applicationContext)).g.y();
            w93Var.m = context;
            w93Var.q = applicationContext;
            w93Var.w = yi2Var;
            w93Var.c = l62Var;
            w93Var.i = rw3Var;
            w93Var.b = string;
            w93Var.s = sharedPreferences;
            w93Var.p = zG;
            w93Var.u = iG;
            w93Var.o = 1;
            Object objM = ue5.M(er1VarY, w93Var);
            if (objM == px0.j) {
                return;
            }
            context2 = context;
            i = iG;
            obj = objM;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    js2.o(obj);
                    l0.x();
                    return;
                }
            }
            i = w93Var.u;
            zG = w93Var.p;
            sharedPreferences = w93Var.s;
            string = w93Var.b;
            rw3Var = w93Var.i;
            l62Var = w93Var.c;
            yi2Var = w93Var.w;
            applicationContext = w93Var.q;
            Context context3 = w93Var.m;
            js2.o(obj);
            context2 = context3;
        }
        final boolean z = zG;
        final String str = string;
        final l62 l62Var2 = l62Var;
        final yi2 yi2Var2 = yi2Var;
        db3 db3Var = (db3) obj;
        final String str2 = (String) db3Var.r(rw3Var);
        final xn5 xn5VarE = str2 != null ? jr2.E((String) db3Var.r(jr2.i(str2))) : null;
        final String strL = l(sharedPreferences, str2);
        final v93 v93Var = new v93(((ow3) q03.y(applicationContext)).g.y(), rw3Var, sharedPreferences);
        nm0 nm0Var = new nm0(1180830736, true, new bz1() { // from class: r93
            @Override // defpackage.bz1
            public final Object l(Object obj2, Object obj3) {
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                boolean zN = h02Var.N(iIntValue & 1, (iIntValue & 3) != 2);
                og5 og5Var = og5.g;
                if (!zN) {
                    h02Var.Q();
                    return og5Var;
                }
                boolean z2 = z;
                String str3 = str;
                if (!z2) {
                    h02Var.X(-1948632219);
                    lr2.v(str3, h02Var, 0);
                    h02Var.b(false);
                    return og5Var;
                }
                h02Var.X(-1948527470);
                h02Var.b(false);
                ob3 ob3VarL = v13.l(v93Var, new x93(str2, xn5VarE, strL), h02Var, 0, 2);
                long j = ((yb1) h02Var.a(ep0.g)).g;
                int iW = xs2.w((int) (yb1.y(j) / 64.0f), 1, d43.n + 1);
                p04 p04VarG = d43.g(iW, xs2.w((int) ((yb1.g(j) - 48.0f) / 64.0f), 1, 3), yb1.g(j) >= 320.0f && iW >= 3);
                String str4 = ((x93) ob3VarL.getValue()).g;
                xn5 xn5Var = ((x93) ob3VarL.getValue()).y;
                String str5 = ((x93) ob3VarL.getValue()).r;
                if (str5 != null) {
                    str3 = str5;
                }
                Context context4 = context2;
                boolean zJ = h02Var.j(context4);
                yi2 yi2Var3 = yi2Var2;
                boolean zJ2 = zJ | h02Var.j(yi2Var3);
                l62 l62Var3 = l62Var2;
                boolean zJ3 = h02Var.j(l62Var3) | zJ2 | h02Var.x(ob3VarL);
                Object objK = h02Var.K();
                if (zJ3 || objK == oo0.g) {
                    mg mgVar = new mg(context4, yi2Var3, l62Var3, ob3VarL, (byte) 3);
                    h02Var.i0(mgVar);
                    objK = mgVar;
                }
                lr2.t(p04VarG, str4, xn5Var, str3, 1000, (xy1) objK, h02Var, 24576, 0);
                return og5Var;
            }
        });
        w93Var.m = null;
        w93Var.q = null;
        w93Var.w = null;
        w93Var.c = null;
        w93Var.i = null;
        w93Var.b = null;
        w93Var.s = null;
        w93Var.p = z;
        w93Var.u = i;
        w93Var.o = 2;
        og0.F(nm0Var, w93Var);
    }
}
