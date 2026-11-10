package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class hu3 implements jk4, na0 {
    public final wp2 a;
    public final String g;
    public Map j;
    public final boolean[] l;
    public final wp2 m;
    public int n = -1;
    public final int r;
    public final wp2 t;
    public final String[] v;
    public final List[] x;
    public final d12 y;

    public hu3(String str, d12 d12Var, int i) {
        this.g = str;
        this.y = d12Var;
        this.r = i;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.v = strArr;
        int i3 = this.r;
        this.x = new List[i3];
        this.l = new boolean[i3];
        this.j = qi1.j;
        my1 my1Var = new my1(this) { // from class: gu3
            public final /* synthetic */ hu3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                jk4[] jk4VarArr;
                byte b2 = b;
                hu3 hu3Var = this.t;
                switch (b2) {
                    case 0:
                        d12 d12Var2 = hu3Var.y;
                        return d12Var2 != null ? d12Var2.g() : hd6.g;
                    case 1:
                        ArrayList arrayList = null;
                        ArrayList arrayList2 = hu3Var.y != null ? new ArrayList(0) : null;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            arrayList = arrayList2;
                        }
                        return (arrayList == null || (jk4VarArr = (jk4[]) arrayList.toArray(new jk4[0])) == null) ? fd6.g : jk4VarArr;
                    default:
                        jk4[] jk4VarArr2 = (jk4[]) hu3Var.a.getValue();
                        jk4VarArr2.getClass();
                        int iHashCode = (hu3Var.g().hashCode() * 31) + Arrays.hashCode(jk4VarArr2);
                        int iR = hu3Var.r();
                        int iHashCode2 = 1;
                        while (true) {
                            if (iR > 0) {
                                int i4 = iR - 1;
                                int i5 = iHashCode2 * 31;
                                String strG = hu3Var.x(hu3Var.r() - iR).g();
                                iHashCode2 = i5 + (strG != null ? strG.hashCode() : 0);
                                iR = i4;
                            } else {
                                int iR2 = hu3Var.r();
                                int iHashCode3 = 1;
                                while (true) {
                                    if (!(iR2 > 0)) {
                                        return Integer.valueOf((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3);
                                    }
                                    int i6 = iR2 - 1;
                                    int i7 = iHashCode3 * 31;
                                    tx3 tx3VarY = hu3Var.x(hu3Var.r() - iR2).y();
                                    iHashCode3 = i7 + (tx3VarY != null ? tx3VarY.hashCode() : 0);
                                    iR2 = i6;
                                }
                            }
                        }
                        break;
                }
            }
        };
        bt2 bt2Var = bt2.j;
        this.t = v13.u(bt2Var, my1Var);
        final byte b2 = 1;
        this.a = v13.u(bt2Var, new my1(this) { // from class: gu3
            public final /* synthetic */ hu3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                jk4[] jk4VarArr;
                byte b3 = b2;
                hu3 hu3Var = this.t;
                switch (b3) {
                    case 0:
                        d12 d12Var2 = hu3Var.y;
                        return d12Var2 != null ? d12Var2.g() : hd6.g;
                    case 1:
                        ArrayList arrayList = null;
                        ArrayList arrayList2 = hu3Var.y != null ? new ArrayList(0) : null;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            arrayList = arrayList2;
                        }
                        return (arrayList == null || (jk4VarArr = (jk4[]) arrayList.toArray(new jk4[0])) == null) ? fd6.g : jk4VarArr;
                    default:
                        jk4[] jk4VarArr2 = (jk4[]) hu3Var.a.getValue();
                        jk4VarArr2.getClass();
                        int iHashCode = (hu3Var.g().hashCode() * 31) + Arrays.hashCode(jk4VarArr2);
                        int iR = hu3Var.r();
                        int iHashCode2 = 1;
                        while (true) {
                            if (iR > 0) {
                                int i4 = iR - 1;
                                int i5 = iHashCode2 * 31;
                                String strG = hu3Var.x(hu3Var.r() - iR).g();
                                iHashCode2 = i5 + (strG != null ? strG.hashCode() : 0);
                                iR = i4;
                            } else {
                                int iR2 = hu3Var.r();
                                int iHashCode3 = 1;
                                while (true) {
                                    if (!(iR2 > 0)) {
                                        return Integer.valueOf((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3);
                                    }
                                    int i6 = iR2 - 1;
                                    int i7 = iHashCode3 * 31;
                                    tx3 tx3VarY = hu3Var.x(hu3Var.r() - iR2).y();
                                    iHashCode3 = i7 + (tx3VarY != null ? tx3VarY.hashCode() : 0);
                                    iR2 = i6;
                                }
                            }
                        }
                        break;
                }
            }
        });
        final byte b3 = 2;
        this.m = v13.u(bt2Var, new my1(this) { // from class: gu3
            public final /* synthetic */ hu3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                jk4[] jk4VarArr;
                byte b4 = b3;
                hu3 hu3Var = this.t;
                switch (b4) {
                    case 0:
                        d12 d12Var2 = hu3Var.y;
                        return d12Var2 != null ? d12Var2.g() : hd6.g;
                    case 1:
                        ArrayList arrayList = null;
                        ArrayList arrayList2 = hu3Var.y != null ? new ArrayList(0) : null;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            arrayList = arrayList2;
                        }
                        return (arrayList == null || (jk4VarArr = (jk4[]) arrayList.toArray(new jk4[0])) == null) ? fd6.g : jk4VarArr;
                    default:
                        jk4[] jk4VarArr2 = (jk4[]) hu3Var.a.getValue();
                        jk4VarArr2.getClass();
                        int iHashCode = (hu3Var.g().hashCode() * 31) + Arrays.hashCode(jk4VarArr2);
                        int iR = hu3Var.r();
                        int iHashCode2 = 1;
                        while (true) {
                            if (iR > 0) {
                                int i4 = iR - 1;
                                int i5 = iHashCode2 * 31;
                                String strG = hu3Var.x(hu3Var.r() - iR).g();
                                iHashCode2 = i5 + (strG != null ? strG.hashCode() : 0);
                                iR = i4;
                            } else {
                                int iR2 = hu3Var.r();
                                int iHashCode3 = 1;
                                while (true) {
                                    if (!(iR2 > 0)) {
                                        return Integer.valueOf((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3);
                                    }
                                    int i6 = iR2 - 1;
                                    int i7 = iHashCode3 * 31;
                                    tx3 tx3VarY = hu3Var.x(hu3Var.r() - iR2).y();
                                    iHashCode3 = i7 + (tx3VarY != null ? tx3VarY.hashCode() : 0);
                                    iR2 = i6;
                                }
                            }
                        }
                        break;
                }
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hu3) {
            jk4 jk4Var = (jk4) obj;
            if (this.g.equals(jk4Var.g()) && Arrays.equals((jk4[]) this.a.getValue(), (jk4[]) ((hu3) obj).a.getValue())) {
                int iR = jk4Var.r();
                int i = this.r;
                if (i == iR) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (yf2.p(x(i2).g(), jk4Var.x(i2).g()) && yf2.p(x(i2).y(), jk4Var.x(i2).y())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jk4
    public final String g() {
        return this.g;
    }

    public int hashCode() {
        return ((Number) this.m.getValue()).intValue();
    }

    public final void l(String str, boolean z) {
        str.getClass();
        int i = this.n + 1;
        this.n = i;
        String[] strArr = this.v;
        strArr[i] = str;
        this.l[i] = z;
        this.x[i] = null;
        if (i == this.r - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.j = map;
        }
    }

    @Override // defpackage.jk4
    public final String n(int i) {
        return this.v[i];
    }

    @Override // defpackage.jk4
    public final int r() {
        return this.r;
    }

    public String toString() {
        return cj0.q0(xs2.K(0, r()), ", ", g() + '(', ")", new ll2(this, (byte) 10), 24);
    }

    @Override // defpackage.na0
    public final Set v() {
        return this.j.keySet();
    }

    @Override // defpackage.jk4
    public jk4 x(int i) {
        return ((di2[]) this.t.getValue())[i].r();
    }

    @Override // defpackage.jk4
    public tx3 y() {
        return cy4.y;
    }
}
