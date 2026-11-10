package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zd implements t33 {
    public final /* synthetic */ byte g;
    public final Object r;
    public final Object y;

    public /* synthetic */ zd(Object obj, Object obj2, byte b) {
        this.g = b;
        this.y = obj;
        this.r = obj2;
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        ArrayList arrayList;
        fp3 fp3Var;
        byte b = this.g;
        qi1 qi1Var = qi1.j;
        Object obj = this.y;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                ((sv3) obj).setParentLayoutDirection((fl2) obj2);
                return v33Var.k0(0, 0, qi1Var, new m9((byte) 7));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (!(((p33) obj3).a() instanceof v75)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((my1) obj2).g();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int i2 = 0;
                    for (int size2 = list2.size(); i2 < size2; size2 = size2) {
                        k44 k44Var = (k44) list2.get(i2);
                        if (k44Var != null) {
                            float f = k44Var.y;
                            float f2 = k44Var.g;
                            fp3Var = new fp3(((p33) arrayList2.get(i2)).v(zs0.y(0, (int) Math.floor(k44Var.r - f2), 0, (int) Math.floor(k44Var.n - f), 5)), new je2((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                        } else {
                            fp3Var = null;
                        }
                        if (fp3Var != null) {
                            arrayList3.add(fp3Var);
                        }
                        i2++;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Object obj4 = list.get(i3);
                    if (((p33) obj4).a() instanceof v75) {
                        arrayList4.add(obj4);
                    }
                }
                return v33Var.k0(ws0.t(j), ws0.j(j), qi1Var, new kn2(arrayList, pw5.e(arrayList4, (my1) obj), (byte) 25));
        }
    }
}
