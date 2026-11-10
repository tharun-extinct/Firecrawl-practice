package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g31 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ g31(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, mi2] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [xa3] */
    /* JADX WARN: Type inference failed for: r9v2, types: [xa3] */
    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                bb5 bb5Var = ((yp4) obj).t;
                return new jj0(ra.H(bb5Var.g, bb5Var.y, dg1.y.g(0.0f)));
            default:
                ArrayList arrayList = ((k02) obj).g;
                hb3 hb3Var = new hb3(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ?? r4 = (mi2) arrayList.get(i);
                    Object obj2 = r4.y;
                    int i2 = r4.g;
                    Object oh2Var = obj2 != null ? new oh2(Integer.valueOf(i2), r4.y) : Integer.valueOf(i2);
                    int iX = hb3Var.x(oh2Var);
                    boolean z = iX < 0;
                    Object obj3 = z ? null : hb3Var.r[iX];
                    if (obj3 != null) {
                        if (obj3 instanceof xa3) {
                            ?? r8 = (xa3) obj3;
                            r8.g(r4);
                            r4 = r8;
                        } else {
                            Object[] objArr = ni3.g;
                            ?? xa3Var = new xa3(2);
                            xa3Var.g(obj3);
                            xa3Var.g(r4);
                            r4 = xa3Var;
                        }
                    }
                    if (z) {
                        int i3 = ~iX;
                        hb3Var.y[i3] = oh2Var;
                        hb3Var.r[i3] = r4;
                    } else {
                        hb3Var.r[iX] = r4;
                    }
                }
                return new o93(hb3Var);
        }
    }
}
