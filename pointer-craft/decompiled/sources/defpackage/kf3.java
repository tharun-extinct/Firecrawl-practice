package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kf3 {
    public final ya3 a;
    public boolean c;
    public final ew4 g = y94.w(lf3.y);
    public jf3 j;
    public int l;
    public final ya3 m;
    public final dr n;
    public boolean q;
    public final f34 r;
    public final ya3 t;
    public final dr v;
    public boolean w;
    public hf3 x;
    public final ew4 y;

    public kf3() {
        ew4 ew4VarW = y94.w(new if3());
        this.y = ew4VarW;
        this.r = pw5.j(ew4VarW);
        this.n = new dr();
        this.v = new dr();
        this.t = tm3.g();
        this.a = tm3.g();
        this.m = tm3.g();
    }

    public final void g(kb5 kb5Var, jf3 jf3Var, int i) {
        ya3 ya3Var;
        boolean z;
        kb5Var.getClass();
        if (jf3Var.g != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(jf3Var);
            kb5 kb5Var2 = jf3Var.g;
            sb.append("' is already added to dispatcher ");
            sb.append(kb5Var2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            ya3Var = i != 1 ? this.t : this.a;
        } else {
            ya3Var = this.m;
        }
        ya3Var.l(jf3Var);
        jf3Var.g = kb5Var;
        ((if3) this.r.j.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.c : this.q;
        } else {
            z = this.w;
        }
        jf3Var.y(z);
    }

    public final void n(hf3 hf3Var) {
        if3 if3Var;
        hf3 hf3VarR = this.x;
        if (hf3VarR == null) {
            hf3VarR = r(0);
        }
        if (yf2.p(hf3VarR, hf3Var)) {
            if (hf3VarR == null) {
                if3Var = new if3();
            } else {
                ArrayList arrayList = new ArrayList();
                for (hf3 hf3Var2 : this.n) {
                    if (hf3Var2.n && !hf3Var2.y.isEmpty()) {
                        arrayList.addAll(hf3Var2.y);
                    }
                }
                for (hf3 hf3Var3 : this.v) {
                    if (hf3Var3.n && !hf3Var3.y.isEmpty()) {
                        arrayList.addAll(hf3Var3.y);
                    }
                }
                lr2 lr2Var = hf3VarR.g;
                List list = hf3VarR.r;
                lr2Var.getClass();
                list.getClass();
                if3Var = new if3(lr2Var, arrayList, list, arrayList.size());
            }
            ew4 ew4Var = this.y;
            if (yf2.p((if3) ew4Var.getValue(), if3Var)) {
                return;
            }
            ew4Var.m(null, if3Var);
            ya3 ya3Var = this.m;
            Object[] objArr = ya3Var.y;
            long[] jArr = ya3Var.r;
            int i = ya3Var.v;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) (2147483647L & (jArr[i] >> 31));
                ((jf3) objArr[i]).getClass();
                i = i2;
            }
            ya3 ya3Var2 = this.a;
            Object[] objArr2 = ya3Var2.y;
            long[] jArr2 = ya3Var2.r;
            int i3 = ya3Var2.v;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((jf3) objArr2[i3]).getClass();
                i3 = i4;
            }
            ya3 ya3Var3 = this.t;
            Object[] objArr3 = ya3Var3.y;
            long[] jArr3 = ya3Var3.r;
            int i5 = ya3Var3.v;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((jf3) objArr3[i5]).getClass();
                i5 = i6;
            }
        }
    }

    public final hf3 r(int i) {
        Object next;
        Object next2;
        dr drVar = this.v;
        dr drVar2 = this.n;
        Object obj = null;
        if (i == -1) {
            Iterator it = drVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((hf3) next).n);
            hf3 hf3Var = (hf3) next;
            if (hf3Var != null) {
                return hf3Var;
            }
            for (Object obj2 : drVar) {
                if (((hf3) obj2).n) {
                    obj = obj2;
                    break;
                }
            }
            return (hf3) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = drVar2.iterator();
            while (it2.hasNext()) {
                ((hf3) it2.next()).getClass();
            }
            Iterator it3 = drVar.iterator();
            while (it3.hasNext()) {
                ((hf3) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = drVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((hf3) next2).n);
        hf3 hf3Var2 = (hf3) next2;
        if (hf3Var2 != null) {
            return hf3Var2;
        }
        for (Object obj3 : drVar) {
            if (((hf3) obj3).n) {
                obj = obj3;
                break;
            }
        }
        return (hf3) obj;
    }

    public final void y() {
        boolean z;
        boolean z2;
        dr drVar = this.n;
        if (!drVar.isEmpty()) {
            Iterator it = drVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((hf3) it.next()).n) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        dr drVar2 = this.v;
        if (!drVar2.isEmpty()) {
            Iterator it2 = drVar2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else if (((hf3) it2.next()).n) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = z || z2;
        boolean z4 = this.w != z;
        boolean z5 = this.q != z2;
        boolean z6 = this.c != z3;
        if (z4) {
            ya3 ya3Var = this.m;
            Object[] objArr = ya3Var.y;
            long[] jArr = ya3Var.r;
            int i = ya3Var.v;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((jf3) objArr[i]).y(z);
                i = i2;
            }
        }
        if (z5) {
            ya3 ya3Var2 = this.a;
            Object[] objArr2 = ya3Var2.y;
            long[] jArr2 = ya3Var2.r;
            int i3 = ya3Var2.v;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((jf3) objArr2[i3]).y(z2);
                i3 = i4;
            }
        }
        if (z6) {
            ya3 ya3Var3 = this.t;
            Object[] objArr3 = ya3Var3.y;
            long[] jArr3 = ya3Var3.r;
            int i5 = ya3Var3.v;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((jf3) objArr3[i5]).y(z3);
                i5 = i6;
            }
        }
        this.w = z;
        this.q = z2;
        this.c = z3;
        hf3 hf3VarR = this.x;
        if (hf3VarR == null) {
            hf3VarR = r(0);
        }
        n(hf3VarR);
    }
}
