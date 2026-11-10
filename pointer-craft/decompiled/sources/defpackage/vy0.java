package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class vy0 extends w12 {
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
        uy0 uy0Var;
        if (ou0Var instanceof uy0) {
            uy0Var = (uy0) ou0Var;
            int i2 = uy0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uy0Var.w = i2 - Integer.MIN_VALUE;
            } else {
                uy0Var = new uy0(this, ou0Var);
            }
        } else {
            uy0Var = new uy0(this, ou0Var);
        }
        Object obj = uy0Var.m;
        int i3 = uy0Var.w;
        byte b = 1;
        if (i3 == 0) {
            js2.o(obj);
            nm0 nm0Var = new nm0(-207686622, true, new zp0(context, b));
            uy0Var.w = 1;
            og0.F(nm0Var, uy0Var);
            return;
        }
        if (i3 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
        } else {
            js2.o(obj);
            l0.x();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.w12
    public final void r(Context context, tp tpVar, ou0 ou0Var) {
        ty0 ty0Var;
        vy0 vy0Var;
        Context applicationContext;
        yi2 yi2Var;
        l62 l62Var;
        boolean zG;
        rw3 rw3Var;
        rw3 rw3Var2;
        String string;
        SharedPreferences sharedPreferences;
        Context context2;
        int i;
        Object g84Var;
        p04 p04Var;
        if (ou0Var instanceof ty0) {
            ty0Var = (ty0) ou0Var;
            int i2 = ty0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ty0Var.f = i2 - Integer.MIN_VALUE;
                vy0Var = this;
            } else {
                vy0Var = this;
                ty0Var = new ty0(vy0Var, ou0Var);
            }
        } else {
            vy0Var = this;
            ty0Var = new ty0(vy0Var, ou0Var);
        }
        Object obj = ty0Var.h;
        int i3 = ty0Var.f;
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
            rw3Var = new rw3(xi3.j("widget_", iG));
            rw3Var2 = new rw3(xi3.j("widget_device_", iG));
            string = context.getString(R.string.widget_custom_label);
            string.getClass();
            sharedPreferences = applicationContext.getSharedPreferences("device_names", 0);
            er1 er1VarY = ((ow3) q03.y(applicationContext)).g.y();
            ty0Var.m = context;
            ty0Var.q = applicationContext;
            ty0Var.w = yi2Var;
            ty0Var.c = l62Var;
            ty0Var.i = rw3Var;
            ty0Var.b = rw3Var2;
            ty0Var.s = string;
            ty0Var.p = sharedPreferences;
            ty0Var.u = zG;
            ty0Var.z = iG;
            ty0Var.f = 1;
            Object objM = ue5.M(er1VarY, ty0Var);
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
            int i4 = ty0Var.z;
            zG = ty0Var.u;
            sharedPreferences = ty0Var.p;
            string = ty0Var.s;
            rw3Var2 = ty0Var.b;
            rw3Var = ty0Var.i;
            l62Var = ty0Var.c;
            yi2Var = ty0Var.w;
            applicationContext = ty0Var.q;
            Context context3 = ty0Var.m;
            js2.o(obj);
            i = i4;
            context2 = context3;
        }
        boolean z = zG;
        String str = string;
        rw3 rw3Var3 = rw3Var;
        l62 l62Var2 = l62Var;
        yi2 yi2Var2 = yi2Var;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        db3 db3Var = (db3) obj;
        String str2 = (String) db3Var.r(rw3Var3);
        if (str2 != null) {
            try {
                byte[] bArrG = ex.g(ex.v, str2);
                p04 p04Var2 = new p04();
                np3.l(p04Var2, bArrG);
                g84Var = p04Var2;
            } catch (Throwable th) {
                g84Var = new g84(th);
            }
            boolean z2 = g84Var instanceof g84;
            Object obj2 = g84Var;
            if (z2) {
                obj2 = null;
            }
            p04Var = (p04) obj2;
            if (p04Var != null) {
                r04[] r04VarArr = p04Var.a;
                r04VarArr.getClass();
                if (r04VarArr.length == 0) {
                    p04Var = null;
                }
            } else {
                p04Var = null;
            }
        } else {
            p04Var = null;
        }
        String str3 = (String) db3Var.r(rw3Var2);
        nm0 nm0Var = new nm0(1610651728, true, new mz(new sy0(((ow3) q03.y(applicationContext)).g.y(), rw3Var3, rw3Var2, vy0Var, sharedPreferences2), new yy0(p04Var, str3, str3 != null ? jr2.E((String) db3Var.r(jr2.i(str3))) : null, l(sharedPreferences2, str3)), z, str, i, context2, yi2Var2, l62Var2));
        ty0Var.m = null;
        ty0Var.q = null;
        ty0Var.w = null;
        ty0Var.c = null;
        ty0Var.i = null;
        ty0Var.b = null;
        ty0Var.s = null;
        ty0Var.p = null;
        ty0Var.u = z;
        ty0Var.z = i;
        ty0Var.f = 2;
        og0.F(nm0Var, ty0Var);
    }
}
