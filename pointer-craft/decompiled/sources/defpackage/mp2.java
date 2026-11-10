package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class mp2 implements x22 {
    public static final mp2 g = new mp2();

    @Override // defpackage.x22
    public final File g(Context context, String str) {
        return m50.H(context, str);
    }

    @Override // defpackage.x22
    public final Object y(Context context, String str) {
        cp2 cp2Var = cp2.j;
        lp2 lp2Var = new lp2(context, str, (byte) 0);
        x21 x21Var = na1.g;
        c21 c21Var = c21.a;
        yy4 yy4VarV = v13.v();
        c21Var.getClass();
        ku0 ku0VarX = k33.x(a11.k(c21Var, yy4VarV));
        return new p01(new ao1(cp2Var, lp2Var), pw5.k(new op((Object) pi1.j, (mu0) null, (byte) 5)), new f73((byte) 13), ku0VarX);
    }
}
