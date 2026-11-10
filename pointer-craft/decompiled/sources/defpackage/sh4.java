package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sh4 implements a93 {
    public final ox0 g;
    public Integer n;
    public qg r;
    public final zu4 y;

    public sh4(ox0 ox0Var, zu4 zu4Var) {
        this.g = ox0Var;
        this.y = zu4Var;
    }

    @Override // defpackage.a93
    public final u33 r(final v33 v33Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        final sh4 sh4Var;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i = 1;
        List list3 = (List) arrayList.get(1);
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((p33) list2.get(i2)).v(j));
        }
        if (!arrayList2.isEmpty()) {
            obj = arrayList2.get(0);
            int i3 = ((us3) obj).j;
            int size2 = arrayList2.size() - 1;
            if (1 <= size2) {
                int i4 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i4);
                    int i5 = ((us3) obj4).j;
                    if (i3 < i5) {
                        obj = obj4;
                        i3 = i5;
                    }
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            obj = null;
        }
        us3 us3Var = (us3) obj;
        int i6 = us3Var != null ? us3Var.j : 0;
        final ArrayList arrayList3 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i7 = 0; i7 < size3; i7++) {
            arrayList3.add(((p33) list3.get(i7)).v(j));
        }
        if (!arrayList3.isEmpty()) {
            obj2 = arrayList3.get(0);
            int i8 = ((us3) obj2).j;
            int size4 = arrayList3.size() - 1;
            if (1 <= size4) {
                int i9 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i9);
                    int i10 = ((us3) obj5).j;
                    if (i8 < i10) {
                        obj2 = obj5;
                        i8 = i10;
                    }
                    if (i9 == size4) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            obj2 = null;
        }
        us3 us3Var2 = (us3) obj2;
        Integer numValueOf = us3Var2 != null ? Integer.valueOf(us3Var2.j) : null;
        if (!arrayList3.isEmpty()) {
            obj3 = arrayList3.get(0);
            int i11 = ((us3) obj3).t;
            int size5 = arrayList3.size() - 1;
            if (1 <= size5) {
                while (true) {
                    Object obj6 = arrayList3.get(i);
                    int i12 = ((us3) obj6).t;
                    if (i11 < i12) {
                        obj3 = obj6;
                        i11 = i12;
                    }
                    if (i == size5) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            obj3 = null;
        }
        us3 us3Var3 = (us3) obj3;
        int i13 = us3Var3 != null ? us3Var3.t : 0;
        float f = th4.r;
        int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + v33Var.V(8.0f) + Math.max(v33Var.V(f), i6);
        final int i14 = i6 == 0 ? (-(v33Var.V(8.0f) + v33Var.V(f))) / 2 : 0;
        Integer num = this.n;
        if (num != null) {
            qg qgVar = this.r;
            if (qgVar == null) {
                qgVar = new qg(num, m50.c, null, 12);
                this.r = qgVar;
            }
            qg qgVar2 = qgVar;
            if (((Number) qgVar2.v.getValue()).intValue() != i14) {
                r10 r10Var = new r10(qgVar2, i14, this, null, (byte) 3);
                sh4Var = this;
                m50.T(sh4Var.g, null, r10Var, 3);
            }
            final int i15 = i13;
            return v33Var.k0(iIntValue, i15, qi1.j, new xy1() { // from class: rh4
                @Override // defpackage.xy1
                public final Object a(Object obj7) {
                    int i16;
                    ts3 ts3Var = (ts3) obj7;
                    ArrayList arrayList4 = arrayList2;
                    int size6 = arrayList4.size();
                    int i17 = 0;
                    while (true) {
                        i16 = i15;
                        if (i17 >= size6) {
                            break;
                        }
                        us3 us3Var4 = (us3) arrayList4.get(i17);
                        ts3Var.j(us3Var4, 0, (i16 - us3Var4.t) / 2, 0.0f);
                        i17++;
                    }
                    float f2 = th4.r;
                    v33 v33Var2 = v33Var;
                    int iV = v33Var2.V(8.0f) + v33Var2.V(f2);
                    qg qgVar3 = sh4Var.r;
                    int iIntValue2 = iV + (qgVar3 != null ? ((Number) qgVar3.n()).intValue() : i14);
                    ArrayList arrayList5 = arrayList3;
                    int size7 = arrayList5.size();
                    for (int i18 = 0; i18 < size7; i18++) {
                        us3 us3Var5 = (us3) arrayList5.get(i18);
                        ts3Var.j(us3Var5, iIntValue2, (i16 - us3Var5.t) / 2, 0.0f);
                    }
                    return og5.g;
                }
            });
        }
        this.n = Integer.valueOf(i14);
        sh4Var = this;
        final int i16 = i13;
        return v33Var.k0(iIntValue, i16, qi1.j, new xy1() { // from class: rh4
            @Override // defpackage.xy1
            public final Object a(Object obj7) {
                int i17;
                ts3 ts3Var = (ts3) obj7;
                ArrayList arrayList4 = arrayList2;
                int size6 = arrayList4.size();
                int i18 = 0;
                while (true) {
                    i17 = i16;
                    if (i18 >= size6) {
                        break;
                    }
                    us3 us3Var4 = (us3) arrayList4.get(i18);
                    ts3Var.j(us3Var4, 0, (i17 - us3Var4.t) / 2, 0.0f);
                    i18++;
                }
                float f2 = th4.r;
                v33 v33Var2 = v33Var;
                int iV = v33Var2.V(8.0f) + v33Var2.V(f2);
                qg qgVar3 = sh4Var.r;
                int iIntValue2 = iV + (qgVar3 != null ? ((Number) qgVar3.n()).intValue() : i14);
                ArrayList arrayList5 = arrayList3;
                int size7 = arrayList5.size();
                for (int i19 = 0; i19 < size7; i19++) {
                    us3 us3Var5 = (us3) arrayList5.get(i19);
                    ts3Var.j(us3Var5, iIntValue2, (i17 - us3Var5.t) / 2, 0.0f);
                }
                return og5.g;
            }
        });
    }
}
