package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sz5 {
    public static ha2 v;
    public static final nm0 g = new nm0(-1236708428, false, new bn0(8));
    public static final nm0 y = new nm0(804660926, false, new gn0((byte) 4));
    public static final nm0 r = new nm0(-1601423512, false, new bn0(9));
    public static final nm0 n = new nm0(-1536417601, false, new bn0(10));

    static {
        new nm0(923251597, false, new bn0((byte) 11));
    }

    public static int g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static final void r(o04 o04Var, String str, List list) {
        n04 n04Var;
        o04Var.m = str;
        o04Var.a = 1;
        ArrayList arrayList = new ArrayList(dj0.Y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gx4 gx4Var = (gx4) it.next();
            uz5 uz5Var = gx4Var.y;
            String str2 = gx4Var.g;
            if (uz5Var instanceof o90) {
                n04Var = new n04();
                n04Var.m = str2;
                k04 k04Var = new k04();
                k04Var.t = ((o90) uz5Var).y;
                n04Var.t = (byte) 1;
                n04Var.a = k04Var;
            } else if (uz5Var instanceof p90) {
                n04Var = new n04();
                n04Var.m = str2;
                l04 l04Var = new l04();
                l04Var.t = cj0.E0(((p90) uz5Var).y);
                l04Var.a = true;
                n04Var.t = (byte) 2;
                n04Var.a = l04Var;
            } else {
                if (!(uz5Var instanceof q90)) {
                    up.y();
                    return;
                }
                n04Var = new n04();
                n04Var.m = str2;
                m04 m04Var = new m04();
                m04Var.t = ((q90) uz5Var).y;
                n04Var.t = (byte) 3;
                n04Var.a = m04Var;
            }
            n04Var.q = gx4Var.r;
            arrayList.add(n04Var);
        }
        o04Var.t = (n04[]) arrayList.toArray(new n04[0]);
    }

    public static int y(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }
}
