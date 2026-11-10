package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ai6 {
    public static zh6 g;

    public static final w51 g(View view) {
        hq5 hq5Var;
        Context context = view.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof ContextWrapper) {
                if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            baseContext = null;
            break;
        }
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            n51 n51VarL = k33.l(context);
            long jM = k33.m(configuration.screenWidthDp, configuration.screenHeightDp);
            long jH0 = n51VarL.h0(jM);
            return new w51((((long) ((int) Float.intBitsToFloat((int) (jH0 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jH0 >> 32)))) << 32), jM);
        }
        fq5.g.getClass();
        eq5 eq5Var = eq5.g;
        gq5 gq5Var = eq5.y;
        gq5Var.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            hq5Var = l51.t;
        } else {
            hq5Var = i >= 30 ? s50.t : t32.p;
        }
        dq5 dq5VarG = hq5Var.g(contextWrapper2, gq5Var.y);
        long jHeight = (4294967295L & ((long) dq5VarG.g().height())) | (((long) dq5VarG.g().width()) << 32);
        return new w51(jHeight, k33.l(baseContext).d(y94.N(jHeight)));
    }

    public static final boolean n(int i, KeyEvent keyEvent) {
        return ((int) (mx5.r(keyEvent) >> 32)) == i;
    }

    public static final boolean r(ob2 ob2Var) {
        return ob2Var.j && !ob2Var.n;
    }

    public static final long v(ob2 ob2Var, um3 um3Var, nb2 nb2Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = ob2Var.l;
        if (um3Var != null) {
            int i = nb2Var.g;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (um3Var == um3.t) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jN = wi3.n(x(ob2Var, um3Var, nb2Var), j2);
        if (z || !ob2Var.t) {
            return jN;
        }
        return 0L;
    }

    public static final long x(ob2 ob2Var, um3 um3Var, nb2 nb2Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (um3Var == null) {
            return ob2Var.r;
        }
        int i = nb2Var.g;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (ob2Var.r >> 32));
        } else {
            if (i != 2) {
                return ob2Var.r;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (ob2Var.r & 4294967295L));
        }
        if (um3Var == um3.t) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final boolean y(ob2 ob2Var) {
        return !ob2Var.j && ob2Var.n;
    }
}
