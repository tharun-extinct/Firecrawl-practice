package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cj implements CharSequence {
    public final ArrayList a;
    public final List j;
    public final ArrayList m;
    public final String t;

    static {
        ji jiVar = qd4.g;
    }

    public cj(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.j = list;
        this.t = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                bj bjVar = (bj) list.get(i);
                Object obj = bjVar.g;
                if (obj instanceof ju4) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(bjVar);
                } else if (obj instanceof lp3) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(bjVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.a = arrayList;
        this.m = arrayList2;
        List listB0 = arrayList2 != null ? cj0.B0(arrayList2, new fu1((byte) 4)) : null;
        if (listB0 == null || listB0.isEmpty()) {
            return;
        }
        int i2 = ((bj) cj0.j0(listB0)).r;
        ga3 ga3Var = ge2.g;
        ga3 ga3Var2 = new ga3(1);
        ga3Var2.g(i2);
        int size2 = listB0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            bj bjVar2 = (bj) listB0.get(i3);
            while (ga3Var2.y != 0) {
                int iN = ga3Var2.n();
                if (bjVar2.y < iN) {
                    int i4 = bjVar2.r;
                    if (i4 > iN) {
                        nc2.g("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iN);
                        break;
                    }
                    break;
                }
                ga3Var2.v(ga3Var2.y - 1);
            }
            ga3Var2.g(bjVar2.r);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.t.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj;
        return yf2.p(this.t, cjVar.t) && yf2.p(this.j, cjVar.j);
    }

    public final List g(int i) {
        List list = this.j;
        if (list == null) {
            return pi1.j;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            bj bjVar = (bj) obj;
            if ((bjVar.g instanceof ov2) && dj.y(0, i, bjVar.y, bjVar.r)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        int iHashCode = this.t.hashCode() * 31;
        List list = this.j;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.t.length();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final cj subSequence(int i, int i2) {
        if (!(i <= i2)) {
            nc2.g("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.t;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        cj cjVar = dj.g;
        if (i > i2) {
            nc2.g("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.j;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                bj bjVar = (bj) list.get(i3);
                int i4 = bjVar.y;
                int i5 = bjVar.r;
                if (dj.y(i, i2, i4, i5)) {
                    arrayList2.add(new bj(Math.max(i, bjVar.y) - i, Math.min(i2, i5) - i, bjVar.g, bjVar.n));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new cj(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.t;
    }

    public final cj y(xy1 xy1Var) {
        aj ajVar = new aj(this);
        ArrayList arrayList = ajVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, be2.r((bj) xy1Var.a(((zi) arrayList.get(i)).y(Integer.MIN_VALUE))));
        }
        return ajVar.v();
    }

    public /* synthetic */ cj(String str) {
        this(str, pi1.j);
    }

    public cj(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
