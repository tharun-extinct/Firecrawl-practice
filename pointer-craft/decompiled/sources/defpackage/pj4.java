package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pj4 {
    public static final Comparator[] g;
    public static final vq0 y;

    static {
        byte b = 2;
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new h90(new h90(i == 0 ? fu1.n : fu1.r, (byte) 1), b);
            i++;
        }
        g = comparatorArr;
        y = new vq0((byte) 19);
    }

    public static final void g(gj4 gj4Var, ArrayList arrayList, h hVar, h hVar2, ha3 ha3Var) {
        aj4 aj4Var = gj4Var.n;
        Object objL = aj4Var.j.l(kj4.c);
        if (objL == null) {
            objL = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objL).booleanValue();
        if ((zBooleanValue || ((Boolean) hVar2.a(gj4Var)).booleanValue()) && ((Boolean) hVar.a(gj4Var)).booleanValue()) {
            arrayList.add(gj4Var);
        }
        if (zBooleanValue) {
            ha3Var.t(gj4Var.x, y(gj4Var, hVar, hVar2, gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0)));
            return;
        }
        List listT = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
        int size = listT.size();
        for (int i = 0; i < size; i++) {
            g((gj4) listT.get(i), arrayList, hVar, hVar2, ha3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    public static final ArrayList y(gj4 gj4Var, h hVar, h hVar2, List list) {
        int i;
        ha3 ha3Var = ie2.g;
        ha3 ha3Var2 = new ha3();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            g((gj4) list.get(i2), arrayList, hVar, hVar2, ha3Var2);
        }
        int i3 = 1;
        char c = gj4Var.r.G == fl2.t ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                gj4 gj4Var2 = (gj4) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new fp3(gj4Var2.j(), pw5.A(gj4Var2)));
                    break;
                }
                float f = gj4Var2.j().y;
                float f2 = gj4Var2.j().n;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        k44 k44Var = (k44) ((fp3) arrayList2.get(i6)).j;
                        float f3 = k44Var.y;
                        i = i3;
                        float f4 = k44Var.n;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new fp3(new k44(Math.max(k44Var.g, 0.0f), Math.max(k44Var.y, f), Math.min(k44Var.r, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((fp3) arrayList2.get(i6)).t));
                            ((List) ((fp3) arrayList2.get(i6)).t).add(gj4Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new fp3(gj4Var2.j(), pw5.A(gj4Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        gj0.Z(arrayList2, fu1.v);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = g[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            fp3 fp3Var = (fp3) arrayList2.get(i8);
            gj0.Z((List) fp3Var.t, comparator);
            arrayList3.addAll((Collection) fp3Var.t);
        }
        gj0.Z(arrayList3, new oj4());
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) ha3Var2.y(((gj4) arrayList3.get(size5)).x);
            if (list2 != null) {
                if (((Boolean) hVar2.a(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
