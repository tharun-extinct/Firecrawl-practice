package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class vg5 {
    public boolean g(CharSequence charSequence) {
        return false;
    }

    public ag1 y(Context context, zf1 zf1Var) {
        int iR;
        ag1 ag1Var = new ag1();
        int i = 0;
        ag1Var.g = 0;
        ag1Var.y = 0;
        ag1Var.r = 0;
        int iY = zf1Var.y(context);
        ag1Var.g = iY;
        if (iY != 0) {
            iR = zf1Var.r(context, false);
            ag1Var.y = iR;
        } else {
            iR = zf1Var.r(context, true);
            ag1Var.y = iR;
        }
        int i2 = ag1Var.g;
        if (i2 == 0) {
            if (iR != 0) {
            }
            ag1Var.r = i;
            return ag1Var;
        }
        i = i2;
        i = i >= iR ? -1 : 1;
        ag1Var.r = i;
        return ag1Var;
    }
}
