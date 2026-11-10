package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@rf3("navigation")
public class id3 extends sf3 {
    public final tf3 r;

    public id3(tf3 tf3Var) {
        tf3Var.getClass();
        this.r = tf3Var;
    }

    @Override // defpackage.sf3
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public dd3 g() {
        return new dd3(this);
    }

    @Override // defpackage.sf3
    public final void n(List list, wd3 wd3Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mc3 mc3Var = (mc3) it.next();
            ad3 ad3Var = mc3Var.t;
            ad3Var.getClass();
            dd3 dd3Var = (dd3) ad3Var;
            al alVar = dd3Var.t;
            u54 u54Var = new u54();
            u54Var.j = mc3Var.g();
            gd3 gd3Var = dd3Var.w;
            int i = gd3Var.r;
            String str = gd3Var.v;
            if (i == 0 && str == null) {
                alVar.getClass();
                String strValueOf = String.valueOf(alVar.g);
                strValueOf.getClass();
                if (gd3Var.g.t.g == 0) {
                    strValueOf = "the root navigation";
                }
                uo1.x("no start destination defined via app:startDestination for ".concat(strValueOf));
                return;
            }
            byte b = 0;
            ad3 ad3VarY = str != null ? gd3Var.y(str, false) : (ad3) c93.o(gd3Var.y, i);
            if (ad3VarY == null) {
                String strValueOf2 = gd3Var.n;
                if (strValueOf2 == null) {
                    strValueOf2 = gd3Var.v;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(gd3Var.r);
                    }
                    gd3Var.n = strValueOf2;
                }
                strValueOf2.getClass();
                l0.u(du4.i("navigation destination ", strValueOf2, " is not a direct child of this NavGraph"));
                return;
            }
            al alVar2 = ad3VarY.t;
            if (str != null) {
                if (!str.equals((String) alVar2.v)) {
                    zc3 zc3VarV = alVar2.v(str);
                    Bundle bundle = zc3VarV != null ? zc3VarV.t : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                        bundleN.putAll(bundle);
                        Bundle bundle2 = (Bundle) u54Var.j;
                        if (bundle2 != null) {
                            bundleN.putAll(bundle2);
                        }
                        u54Var.j = bundleN;
                    }
                }
                if (v13.J((LinkedHashMap) alVar2.n).isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListF = v13.f(v13.J((LinkedHashMap) alVar2.n), new hd3(u54Var, b));
                    if (!arrayListF.isEmpty()) {
                        uo1.o("Cannot navigate to startDestination ", ad3VarY, ". Missing required arguments [", arrayListF, "]");
                        return;
                    }
                }
            }
            this.r.y(ad3VarY.j).n(pw5.k(y().y(ad3VarY, ad3VarY.g((Bundle) u54Var.j))), wd3Var);
        }
    }
}
