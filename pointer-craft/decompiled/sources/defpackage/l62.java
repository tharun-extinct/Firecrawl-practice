package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import io.appground.blehid.BleHidService;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes.dex */
public final class l62 {
    public final Context g;
    public volatile int j;
    public final h62 l;
    public final boolean n;
    public final ua2 r;
    public volatile boolean t;
    public final o05 v;
    public final rv x;
    public final rk4 y;

    public l62(Context context, boolean z) {
        gc0 gc0Var = new gc0((Object) context, (byte) 4);
        m62 m62Var = m62.i;
        m62Var.getClass();
        rk4 rk4Var = new rk4((Object) context, (Object) m62Var, (byte) 15);
        ua2 ua2Var = new ua2();
        String str = Build.MANUFACTURER;
        str.getClass();
        boolean z2 = Build.VERSION.SDK_INT >= 36 && str.equalsIgnoreCase("motorola");
        this.g = context;
        this.y = rk4Var;
        this.r = ua2Var;
        this.n = z2;
        this.v = new o05(new gf((Object) gc0Var, (byte) 11));
        rv rvVar = new rv((byte) 1);
        this.x = rvVar;
        this.l = new h62(context, z, rvVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(boolean z, ou0 ou0Var) throws Throwable {
        j62 j62Var;
        if (ou0Var instanceof j62) {
            j62Var = (j62) ou0Var;
            int i = j62Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                j62Var.w = i - Integer.MIN_VALUE;
            } else {
                j62Var = new j62(this, ou0Var);
            }
        } else {
            j62Var = new j62(this, ou0Var);
        }
        Object objK = j62Var.m;
        Object obj = px0.j;
        int i2 = j62Var.w;
        if (i2 == 0) {
            js2.o(objK);
            if (z) {
                return Boolean.FALSE;
            }
            if (!v(false)) {
                return Boolean.FALSE;
            }
            if (!this.n || this.t) {
                return Boolean.FALSE;
            }
            rk4 rk4Var = this.y;
            j62Var.w = 1;
            objK = rk4Var.K(j62Var);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objK);
        }
        int iOrdinal = ((v52) objK).ordinal();
        if (iOrdinal == 0) {
            this.r.r();
            this.t = true;
            return Boolean.TRUE;
        }
        if (iOrdinal == 1) {
            this.t = true;
        } else if (iOrdinal == 2) {
            this.j++;
            if (this.j >= 2) {
                this.t = true;
            }
        } else if (iOrdinal != 3) {
            uo1.g();
            return null;
        }
        return Boolean.FALSE;
    }

    public final void n(boolean z) {
        h62 h62Var = this.l;
        Context context = this.g;
        boolean zV = v(z);
        h62.y("startService");
        dq0 dq0Var = zV ? dq0.t : dq0.j;
        if (h62Var.v && h62Var.j.getValue() != dq0Var) {
            h62Var.n();
        }
        h62Var.j.m(null, dq0Var);
        Class cls = (zV || Build.VERSION.SDK_INT < 28) ? BleHidService.class : ClassicHidService.class;
        h62Var.l = cls;
        if (h62Var.v) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("app_in_foreground", h62Var.t);
        intent.putExtra("input_type", 0);
        h62Var.v = true;
        try {
            context.bindService(intent, h62Var.a, 65);
        } catch (SecurityException e) {
            h62Var.v = false;
            throw e;
        }
    }

    public final void r(boolean z) {
        h62 h62Var = this.l;
        h62Var.t = z;
        if (h62Var.n) {
            e62 e62Var = h62Var.r;
            if (yf2.p(e62Var != null ? Boolean.valueOf(e62Var.F) : null, Boolean.valueOf(z))) {
                return;
            }
            e62 e62Var2 = h62Var.r;
            if (z) {
                if (e62Var2 != null) {
                    e62Var2.F = true;
                    e62Var2.z.y("foreground", "app");
                    e62Var2.o();
                    return;
                }
                return;
            }
            if (e62Var2 != null) {
                e62Var2.F = false;
                e62Var2.z.y("background", "app");
                e62Var2.h();
            }
        }
    }

    public final boolean v(boolean z) {
        if (z) {
            return true;
        }
        return (((Boolean) this.v.getValue()).booleanValue() || this.r.y()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(ou0 ou0Var) throws Throwable {
        k62 k62Var;
        boolean z;
        if (ou0Var instanceof k62) {
            k62Var = (k62) ou0Var;
            int i = k62Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                k62Var.w = i - Integer.MIN_VALUE;
            } else {
                k62Var = new k62(this, ou0Var);
            }
        } else {
            k62Var = new k62(this, ou0Var);
        }
        Object objK = k62Var.m;
        int i2 = k62Var.w;
        if (i2 == 0) {
            js2.o(objK);
            if (((Boolean) this.v.getValue()).booleanValue() || !this.n) {
                return Boolean.FALSE;
            }
            k62Var.w = 1;
            objK = this.y.K(k62Var);
            Object obj = px0.j;
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objK);
        }
        int iOrdinal = ((v52) objK).ordinal();
        if (iOrdinal == 0) {
            z = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2 || iOrdinal == 3) {
                    return Boolean.FALSE;
                }
                uo1.g();
                return null;
            }
            z = false;
        }
        ua2 ua2Var = this.r;
        boolean z2 = z != ua2Var.y();
        if (z) {
            ua2Var.r();
        } else {
            ua2Var.g();
        }
        return Boolean.valueOf(z2);
    }
}
