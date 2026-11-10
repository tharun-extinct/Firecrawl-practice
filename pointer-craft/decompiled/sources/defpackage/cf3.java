package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cf3 implements t33 {
    public final /* synthetic */ we1 g;
    public final /* synthetic */ pp3 r;
    public final /* synthetic */ ob3 y;

    public cf3(we1 we1Var, ob3 ob3Var, pp3 pp3Var) {
        this.g = we1Var;
        this.y = ob3Var;
        this.r = pp3Var;
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        Integer numValueOf;
        long jY = ws0.y(j, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((p33) list.get(i)).v(jY));
        }
        Integer num = null;
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            numValueOf = Integer.valueOf(((us3) arrayList.get(0)).j);
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((us3) arrayList.get(i3)).j);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (!arrayList.isEmpty()) {
            Integer numValueOf3 = Integer.valueOf(((us3) arrayList.get(0)).t);
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((us3) arrayList.get(i2)).t);
                    if (numValueOf4.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf4;
                    }
                    if (i2 == size3) {
                        break;
                    }
                    i2++;
                }
            }
            num = numValueOf3;
        }
        return v33Var.k0(iIntValue, num != null ? num.intValue() : 0, qi1.j, new dk0(this.g, iIntValue, arrayList, this.y, this.r));
    }
}
