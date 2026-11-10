package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;

/* JADX INFO: loaded from: classes.dex */
public final class q9 implements bz1 {
    public final /* synthetic */ byte j;
    public final Object t;

    public /* synthetic */ q9(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                int i = ((bt1) obj).g;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Integer numR = it1.r(i);
                if (numR != null) {
                    int iIntValue = numR.intValue();
                    ((ba) obj3).playSoundEffect(Build.VERSION.SDK_INT >= 31 ? vj.g.g(iIntValue, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue));
                }
                break;
            default:
                h02 h02Var = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!h02Var.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var.Q();
                } else {
                    wq wqVar = v70.r;
                    j00 j00Var = hi0.u;
                    cz1 cz1Var = ((yp4) obj3).x;
                    kb4 kb4VarG = jb4.g(wqVar, j00Var, h02Var, 54);
                    int iS = pw5.s(h02Var);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, g73.g);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, kb4VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    on0 on0Var = tg1.c;
                    if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                        du4.f(iS, h02Var, iS, on0Var);
                    }
                    xs2.E(tg1.m, h02Var, j73VarW);
                    cz1Var.x(nb4.g, h02Var, 6);
                    h02Var.b(true);
                }
                break;
        }
        return og5Var;
    }
}
