package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class as0 {
    public final ts0 n;
    public boolean r;
    public eu4 t;
    public final int v;
    public as0 x;
    public int y;
    public HashSet g = null;
    public int l = 0;
    public int j = Integer.MIN_VALUE;

    public as0(ts0 ts0Var, int i) {
        this.n = ts0Var;
        this.v = i;
    }

    public final void a() {
        HashSet hashSet;
        as0 as0Var = this.x;
        if (as0Var != null && (hashSet = as0Var.g) != null) {
            hashSet.remove(this);
            if (this.x.g.size() == 0) {
                this.x.g = null;
            }
        }
        this.g = null;
        this.x = null;
        this.l = 0;
        this.j = Integer.MIN_VALUE;
        this.r = false;
        this.y = 0;
    }

    public final void g(as0 as0Var, int i) {
        y(as0Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean j() {
        return this.x != null;
    }

    public final boolean l() {
        HashSet hashSet = this.g;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((as0) it.next()).x().j()) {
                return true;
            }
        }
        return false;
    }

    public final void m() {
        eu4 eu4Var = this.t;
        if (eu4Var == null) {
            this.t = new eu4(1);
        } else {
            eu4Var.r();
        }
    }

    public final int n() {
        if (this.r) {
            return this.y;
        }
        return 0;
    }

    public final void q(int i) {
        this.y = i;
        this.r = true;
    }

    public final void r(int i, zn5 zn5Var, ArrayList arrayList) {
        HashSet hashSet = this.g;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                kg6.g(((as0) it.next()).n, i, arrayList, zn5Var);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[RETURN] */
    public final boolean t(as0 as0Var) {
        if (as0Var != null) {
            ts0 ts0Var = as0Var.n;
            int i = as0Var.v;
            int i2 = this.v;
            if (i != i2) {
                switch (du4.D(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(ts0Var instanceof m42)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(ts0Var instanceof m42)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(du4.C(i2));
                }
            } else if (i2 != 6 || (ts0Var.E && this.n.E)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.n.h0 + ":" + du4.C(this.v);
    }

    public final int v() {
        as0 as0Var;
        if (this.n.g0 == 8) {
            return 0;
        }
        int i = this.j;
        return (i == Integer.MIN_VALUE || (as0Var = this.x) == null || as0Var.n.g0 != 8) ? this.l : i;
    }

    public final as0 x() {
        int i = this.v;
        int iD = du4.D(i);
        ts0 ts0Var = this.n;
        switch (iD) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return ts0Var.K;
            case 2:
                return ts0Var.L;
            case 3:
                return ts0Var.I;
            case 4:
                return ts0Var.J;
            default:
                throw new AssertionError(du4.C(i));
        }
    }

    public final boolean y(as0 as0Var, int i, int i2, boolean z) {
        if (as0Var == null) {
            a();
            return true;
        }
        if (!z && !t(as0Var)) {
            return false;
        }
        this.x = as0Var;
        if (as0Var.g == null) {
            as0Var.g = new HashSet();
        }
        HashSet hashSet = this.x.g;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.l = i;
        this.j = i2;
        return true;
    }
}
