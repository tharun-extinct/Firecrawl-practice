package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m6 implements xy1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ v33 t;

    public /* synthetic */ m6(j72 j72Var, v33 v33Var, us3 us3Var, int i) {
        this.m = j72Var;
        this.t = v33Var;
        this.q = us3Var;
        this.a = i;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = 1;
        int i2 = this.a;
        Object obj2 = this.q;
        v33 v33Var = this.t;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ts3 ts3Var = (ts3) obj;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    List list = (List) arrayList.get(i3);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i4 = 0;
                    while (i4 < size2) {
                        iArr[i4] = ((us3) list.get(i4)).j + (i4 < list.size() - i ? v33Var.V(8.0f) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size2];
                    if (v33Var.getLayoutDirection() == fl2.j) {
                        int i5 = 0;
                        for (int i6 = 0; i6 < size2; i6++) {
                            i5 += iArr[i6];
                        }
                        int i7 = i2 - i5;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < size2) {
                            int i10 = iArr[i8];
                            iArr2[i9] = i7;
                            i7 += i10;
                            i8++;
                            i9++;
                        }
                    } else {
                        int i11 = 0;
                        for (int i12 = size2 - 1; -1 < i12; i12--) {
                            int i13 = iArr[i12];
                            iArr2[i12] = i11;
                            i11 += i13;
                        }
                    }
                    int size3 = list.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        ts3Var.j((us3) list.get(i14), iArr2[i14], ((Number) arrayList2.get(i3)).intValue(), 0.0f);
                    }
                    i3++;
                    i = 1;
                }
                break;
            default:
                j72 j72Var = (j72) obj3;
                us3 us3Var = (us3) obj2;
                ts3 ts3Var2 = (ts3) obj;
                int i15 = j72Var.y;
                s55 s55Var = j72Var.g;
                wb5 wb5Var = j72Var.r;
                k75 k75Var = (k75) j72Var.n.g();
                s55Var.g(um3.t, x52.g(ts3Var2, i15, wb5Var, k75Var != null ? k75Var.g : null, v33Var.getLayoutDirection() == fl2.t, us3Var.j), i2, us3Var.j);
                ts3.m(ts3Var2, us3Var, Math.round(-s55Var.g.d()), 0);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ m6(ArrayList arrayList, v33 v33Var, int i, ArrayList arrayList2) {
        this.m = arrayList;
        this.t = v33Var;
        this.a = i;
        this.q = arrayList2;
    }
}
