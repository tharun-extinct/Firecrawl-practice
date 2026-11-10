package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class x73 implements w73 {
    public final pp3 a = new pp3(1.0f);
    public final Context j;
    public iv4 m;
    public ku0 t;

    public x73(Context context) {
        this.j = context;
    }

    @Override // defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        return a11.f(this, ex0Var);
    }

    @Override // defpackage.w73
    public final float F() {
        mu0 mu0Var;
        cw4 cw4Var;
        if (this.m == null) {
            Context context = this.j;
            hb3 hb3Var = pq5.g;
            synchronized (hb3Var) {
                try {
                    Object objL = hb3Var.l(context);
                    mu0Var = null;
                    if (objL == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        m70 m70VarY = v70.y(-1, 6, null);
                        w00 w00Var = new w00(new nq5(contentResolver, uriFor, new oq5(m70VarY, k33.D(Looper.getMainLooper())), m70VarY, context, null), (byte) 4);
                        yy4 yy4VarV = v13.v();
                        x21 x21Var = na1.g;
                        objL = pw5.N(w00Var, new ku0(a11.k(yy4VarV, p03.g)), new sv4(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        hb3Var.c(context, objL);
                    }
                    cw4Var = (cw4) objL;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a.e(((Number) cw4Var.getValue()).floatValue());
            ku0 ku0Var = this.t;
            if (ku0Var == null) {
                l0.z("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.m = m50.T(ku0Var, null, new op(cw4Var, this, mu0Var, (byte) 11), 3);
        }
        return this.a.d();
    }

    @Override // defpackage.fx0
    public final fx0 b(fx0 fx0Var) {
        return a11.k(this, fx0Var);
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    @Override // defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        return a11.p(this, ex0Var);
    }
}
