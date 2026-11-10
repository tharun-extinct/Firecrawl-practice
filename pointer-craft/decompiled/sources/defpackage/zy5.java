package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zy5 {
    public static final nm0 g = new nm0(223120545, false, new at(9));

    public static final void g(final String str, final xy1 xy1Var, j73 j73Var, k85 k85Var, boolean z, t45 t45Var, h02 h02Var, final int i) {
        final j73 j73Var2;
        final k85 k85Var2;
        final boolean z2;
        final t45 t45Var2;
        k85 k85Var3;
        int i2;
        j73 j73Var3;
        t45 t45Var3;
        boolean z3;
        str.getClass();
        xy1Var.getClass();
        h02Var.Z(1674281570);
        int i3 = i | (h02Var.x(str) ? 4 : 2) | 91520;
        if (h02Var.N(i3 & 1, (74899 & i3) != 74898)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                k85Var3 = (k85) h02Var.a(g75.g);
                t45 t45VarC = bi6.c(h02Var);
                i2 = i3 & (-465921);
                j73Var3 = g73.g;
                t45Var3 = t45VarC;
                z3 = true;
            } else {
                h02Var.Q();
                k85Var3 = k85Var;
                z3 = z;
                t45Var3 = t45Var;
                i2 = i3 & (-465921);
                j73Var3 = j73Var;
            }
            h02Var.s();
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = du4.n(h02Var);
            }
            ja3 ja3Var = (ja3) objK;
            h02Var.X(-1628134476);
            long jY = k85Var3.y();
            if (jY == 16) {
                jY = ((Boolean) xf6.g(ja3Var, h02Var, 6).getValue()).booleanValue() ? t45Var3.g : t45Var3.y;
            }
            long j = jY;
            h02Var.b(false);
            k85 k85VarN = k85Var3.n(new k85(j, 0L, null, null, null, null, 0L, null, 0, 0L, 16777214));
            t45 t45Var4 = t45Var3;
            k85 k85Var4 = k85Var3;
            boolean z4 = z3;
            bz.g(str, xy1Var, mq4.q(j73Var3.n(new ib2(z3, false, ja3Var, t45Var3, null)), 280.0f), z4, false, k85VarN, null, null, true, 0, 0, null, null, ja3Var, new cu4(((rj0) h02Var.a(tj0.g)).g), ue5.m0(-1881048187, new gx(str, z3, ja3Var, t45Var4), h02Var), h02Var, (i2 & 14) | 100666416, 199680, 7888);
            z2 = z4;
            k85Var2 = k85Var4;
            t45Var2 = t45Var4;
            j73Var2 = j73Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            k85Var2 = k85Var;
            z2 = z;
            t45Var2 = t45Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(str, xy1Var, j73Var2, k85Var2, z2, t45Var2, i) { // from class: hx
                public final /* synthetic */ j73 a;
                public final /* synthetic */ String j;
                public final /* synthetic */ k85 m;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ xy1 t;
                public final /* synthetic */ t45 w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(49);
                    zy5.g(this.j, this.t, this.a, this.m, this.q, this.w, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final int r(ls2 ls2Var) {
        List list = ls2Var.q;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((ms2) list.get(i2)).b;
        }
        return (i / list.size()) + ls2Var.p;
    }

    public static void y(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            tm.f(view, charSequence);
            return;
        }
        qa5 qa5Var = qa5.p;
        if (qa5Var != null && qa5Var.j == view) {
            qa5.y(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new qa5(view, charSequence);
            return;
        }
        qa5 qa5Var2 = qa5.u;
        if (qa5Var2 != null && qa5Var2.j == view) {
            qa5Var2.g();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
