package defpackage;

import android.content.Intent;
import android.os.Build;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class co5 implements bz1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object w;

    public /* synthetic */ co5(j73 j73Var, my1 my1Var, boolean z, cn4 cn4Var, k92 k92Var, bz1 bz1Var, int i) {
        this.j = (byte) 2;
        this.m = j73Var;
        this.q = my1Var;
        this.t = z;
        this.w = cn4Var;
        this.c = k92Var;
        this.i = bz1Var;
        this.a = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        o22 o22VarK;
        nm0 nm0VarM0;
        byte b = this.j;
        int i = this.a;
        og5 og5Var = og5.g;
        Object obj3 = this.i;
        Object obj4 = this.c;
        Object obj5 = this.w;
        Object obj6 = this.q;
        Object obj7 = this.m;
        switch (b) {
            case 0:
                String str = (String) obj7;
                Intent intent = (Intent) obj6;
                p04 p04Var = (p04) obj5;
                xy1 xy1Var = (xy1) obj4;
                Integer num = (Integer) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    m22 m22Var = m22.g;
                    if (i2 >= 31) {
                        h02Var.X(558418683);
                        o22VarK = new ax0(new s91(16.0f)).n(new mw(((wf1) h02Var.a(ep0.v)).s));
                        h02Var.b(false);
                    } else {
                        h02Var.X(558556850);
                        h02Var.b(false);
                        o22VarK = gp4.k(m22Var, new he(R.drawable.widget_background), null, 6);
                    }
                    ue5.n(xq2.q(m22Var).n(o22VarK), null, ue5.m0(1151155167, new co5(this.t, this.a, str, intent, p04Var, xy1Var, num, (byte) 1), h02Var), h02Var, 384, 2);
                }
                break;
            case 1:
                String str2 = (String) obj7;
                Intent intent2 = (Intent) obj6;
                p04 p04Var2 = (p04) obj5;
                xy1 xy1Var2 = (xy1) obj4;
                Integer num2 = (Integer) obj3;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    long j = jj0.l;
                    w01 w01Var = new w01(j, j);
                    if (this.t) {
                        h02Var2.X(-1250113355);
                        nm0VarM0 = ue5.m0(288888540, new tk(i, str2, intent2), h02Var2);
                        h02Var2.b(false);
                    } else {
                        h02Var2.X(-1249782616);
                        h02Var2.b(false);
                        nm0VarM0 = pw5.n;
                    }
                    v13.n(null, nm0VarM0, w01Var, 4.0f, ue5.m0(790725944, new nn(p04Var2, xy1Var2, num2, (byte) 7), h02Var2), h02Var2, 27648, 1);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                k33.c((j73) obj7, (my1) obj6, this.t, (cn4) obj5, (k92) obj4, (bz1) obj3, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ co5(boolean z, int i, String str, Intent intent, p04 p04Var, xy1 xy1Var, Integer num, byte b) {
        this.j = b;
        this.t = z;
        this.a = i;
        this.m = str;
        this.q = intent;
        this.w = p04Var;
        this.c = xy1Var;
        this.i = num;
    }
}
