package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko3 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ArrayList t;

    public /* synthetic */ ko3(ArrayList arrayList, byte b) {
        this.j = b;
        this.t = arrayList;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = 0;
        ArrayList arrayList = this.t;
        switch (b) {
            case 0:
                ts3 ts3Var = (ts3) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    w33 w33Var = (w33) arrayList.get(i2);
                    List list = w33Var.y;
                    boolean z = w33Var.l;
                    if (w33Var.m == Integer.MIN_VALUE) {
                        pc2.g("position() should be called first");
                    }
                    int size2 = list.size();
                    int i3 = i;
                    while (i3 < size2) {
                        us3 us3Var = (us3) list.get(i3);
                        int[] iArr = w33Var.t;
                        int i4 = i3 * 2;
                        int i5 = size;
                        long jN = je2.n((((long) iArr[i4 + 1]) & 4294967295L) | (((long) iArr[i4]) << 32), w33Var.r);
                        if (z) {
                            ts3.b(ts3Var, us3Var, jN);
                        } else {
                            ts3.c(ts3Var, us3Var, jN);
                        }
                        i3++;
                        size = i5;
                    }
                    i2++;
                    i = 0;
                }
                break;
            default:
                ts3 ts3Var2 = (ts3) obj;
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    ts3.q(ts3Var2, (us3) arrayList.get(i6), 0, 0);
                }
                break;
        }
        return og5Var;
    }
}
