package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a25 implements a93 {
    public final /* synthetic */ b25 g;

    public a25(b25 b25Var) {
        this.g = b25Var;
    }

    @Override // defpackage.a93
    public final u33 r(v33 v33Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int iT = ws0.t(j);
        int size = list2.size();
        s54 s54Var = new s54();
        if (size > 0) {
            s54Var.j = iT / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(((p33) list2.get(i)).x(s54Var.j), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            vb1 vb1Var = new vb1(v33Var.y0(Math.min(((p33) list2.get(i2)).Y(iIntValue), s54Var.j)) - (p15.y * 2.0f));
            vb1 vb1Var2 = new vb1(24.0f);
            if (vb1Var.compareTo(vb1Var2) < 0) {
                vb1Var = vb1Var2;
            }
            arrayList2.add(new q15(v33Var.y0(s54Var.j) * i2, v33Var.y0(s54Var.j), vb1Var.j));
        }
        this.g.g.setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            p33 p33Var = (p33) list2.get(i3);
            int i4 = s54Var.j;
            arrayList3.add(p33Var.v(ws0.g(i4, i4, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list3.size());
        int i5 = 0;
        for (int size4 = list3.size(); i5 < size4; size4 = size4) {
            arrayList4.add(((p33) list3.get(i5)).v(ws0.y(j, 0, 0, 0, 0, 11)));
            i5++;
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        for (int i6 = 0; i6 < size5; i6++) {
            p33 p33Var2 = (p33) list4.get(i6);
            int i7 = s54Var.j;
            arrayList5.add(p33Var2.v(ws0.g(i7, i7, 0, iIntValue)));
        }
        return v33Var.k0(iT, iIntValue, qi1.j, new lm1(arrayList3, arrayList4, arrayList5, s54Var, iIntValue));
    }
}
