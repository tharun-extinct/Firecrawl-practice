package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c80 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ b90 t;

    public /* synthetic */ c80(b90 b90Var, byte b) {
        this.j = b;
        this.t = b90Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        uz5 q90Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        b90 b90Var = this.t;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                b90Var.getClass();
                List listB0 = cj0.B0(list, new h90(pr.l0(new Integer[]{224, 225, 226, 227, 228, 229, 230, 231}), (byte) 0));
                String strQ0 = cj0.q0(listB0, " + ", null, null, new m9((byte) 18), 30);
                int i = b90Var.v().r;
                ArrayList arrayList = new ArrayList(b90Var.v().y);
                gx4 gx4Var = (gx4) arrayList.get(i);
                gx4Var.getClass();
                ArrayList arrayList2 = new ArrayList(dj0.Y(listB0, 10));
                Iterator it = listB0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((zf5) it.next()).l));
                }
                arrayList.set(i, gx4.g(gx4Var, strQ0, new p90(arrayList2), 0, 4));
                b90Var.x(bg5.g(b90Var.v(), null, arrayList, 0, 5));
                return og5Var;
            case 1:
                String str = (String) obj;
                str.getClass();
                b90Var.getClass();
                int i2 = b90Var.v().r;
                ArrayList arrayList3 = new ArrayList(b90Var.v().y);
                gx4 gx4Var2 = (gx4) arrayList3.get(i2);
                gx4Var2.getClass();
                arrayList3.set(i2, gx4.g(gx4Var2, str, new q90(str), 0, 4));
                b90Var.x(bg5.g(b90Var.v(), null, arrayList3, 0, 5));
                return og5Var;
            case 2:
                b90Var.x(bg5.g(b90Var.v(), null, null, ((Integer) obj).intValue(), 3));
                return og5Var;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                if (b90Var.v().y.size() != 1) {
                    ArrayList arrayList4 = new ArrayList(b90Var.v().y);
                    arrayList4.remove(iIntValue);
                    b90Var.x(bg5.g(b90Var.v(), null, arrayList4, Math.max(iIntValue - 1, 0), 1));
                }
                return og5Var;
            case 4:
                int iIntValue2 = ((Integer) obj).intValue();
                ArrayList arrayList5 = new ArrayList(b90Var.v().y);
                uz5 uz5Var = ((gx4) b90Var.v().y.get(b90Var.v().r)).y;
                if (uz5Var instanceof o90) {
                    q90Var = new o90(0);
                } else if (uz5Var instanceof p90) {
                    q90Var = new p90(pi1.j);
                } else {
                    if (!(uz5Var instanceof q90)) {
                        up.y();
                        return null;
                    }
                    q90Var = new q90("");
                }
                arrayList5.add(iIntValue2, new gx4("", q90Var, 0));
                b90Var.x(bg5.g(b90Var.v(), null, arrayList5, iIntValue2, 1));
                return og5Var;
            default:
                String str2 = (String) obj;
                str2.getClass();
                b90Var.getClass();
                b90Var.x(bg5.g(b90Var.v(), str2, null, 0, 6));
                return og5Var;
        }
    }
}
