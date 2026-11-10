package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class yq0 extends zz4 implements bz1 {
    public final /* synthetic */ qr0 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yq0(qr0 qr0Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = qr0Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        qr0 qr0Var = this.c;
        switch (b) {
            case 0:
                return new yq0(qr0Var, mu0Var, (byte) 0);
            case 1:
                return new yq0(qr0Var, mu0Var, (byte) 1);
            case 2:
                return new yq0(qr0Var, mu0Var, (byte) 2);
            default:
                return new yq0(qr0Var, mu0Var, (byte) 3);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                return ((yq0) b(mu0Var, ox0Var)).u(og5Var);
            case 1:
                ((yq0) b(mu0Var, ox0Var)).u(og5Var);
                return px0.j;
            case 2:
                return ((yq0) b(mu0Var, ox0Var)).u(og5Var);
            default:
                return ((yq0) b(mu0Var, ox0Var)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        qr0 qr0Var = this.c;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                f34 f34Var = qr0Var.m;
                xq0 xq0Var = new xq0(qr0Var, (byte) 0);
                this.w = true;
                Object objR = f34Var.j.r(new v00(xq0Var, (byte) 5), this);
                if (objR != px0Var) {
                    objR = og5Var;
                }
                return objR == px0Var ? px0Var : og5Var;
            case 1:
                boolean z2 = this.w;
                if (z2) {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj);
                    }
                    return null;
                }
                js2.o(obj);
                f34 f34Var2 = qr0Var.c;
                xq0 xq0Var2 = new xq0(qr0Var, (byte) 1);
                this.w = true;
                if (f34Var2.j.r(xq0Var2, this) == px0Var) {
                    return px0Var;
                }
                l0.x();
                return null;
            case 2:
                Context context = qr0Var.y;
                boolean z3 = this.w;
                if (z3) {
                    if (z3) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null && installerPackageName.length() == 19) {
                    return og5Var;
                }
                SharedPreferences sharedPreferences = qr0Var.x;
                boolean z4 = sharedPreferences.getBoolean("is_active", false);
                if (!z4) {
                    sharedPreferences.edit().putBoolean("is_active", true).apply();
                }
                if (z4) {
                    return og5Var;
                }
                this.w = true;
                x21 x21Var = na1.g;
                return m50.f0(c21.a, new o40("https://anleitung-backend.appspot.com/api/report?active=true", mu0Var, (byte) 3), this) == px0Var ? px0Var : og5Var;
            default:
                boolean z5 = this.w;
                if (z5) {
                    if (z5) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                dr0 dr0Var = new dr0(((ow3) q03.g(qr0Var.y)).g.y(), qr0Var, (byte) 0);
                xq0 xq0Var3 = new xq0(qr0Var, (byte) 2);
                this.w = true;
                return dr0Var.r(xq0Var3, this) == px0Var ? px0Var : og5Var;
        }
    }
}
