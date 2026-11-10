package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mr4 implements vo0, Iterable, vh2 {
    public boolean c;
    public int i;
    public int m;
    public ha3 p;
    public int q;
    public HashMap s;
    public int t;
    public int[] j = new int[0];
    public Object[] a = new Object[0];
    public final Object w = new Object();
    public ArrayList b = new ArrayList();

    public final int g(c02 c02Var) {
        if (this.c) {
            qo0.g("Use active SlotWriter to determine anchor location instead");
        }
        if (!c02Var.g()) {
            aw3.g("Anchor refers to a group that was removed");
        }
        return c02Var.g;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l42(this, 0, this.t);
    }

    public final j02 l(int i) {
        int i2;
        ArrayList arrayList;
        int iR;
        HashMap map = this.s;
        if (map != null) {
            if (this.c) {
                qo0.g("use active SlotWriter to crate an anchor for location instead");
            }
            c02 c02Var = (i < 0 || i >= (i2 = this.t) || (iR = or4.r((arrayList = this.b), i, i2)) < 0) ? null : (c02) arrayList.get(iR);
            if (c02Var != null) {
                return (j02) map.get(c02Var);
            }
        }
        return null;
    }

    public final lr4 n() {
        if (this.c) {
            l0.z("Cannot read while a writer is pending");
            return null;
        }
        this.q++;
        return new lr4(this);
    }

    public final pr4 v() {
        if (this.c) {
            qo0.g("Cannot start a writer when another writer is pending");
        }
        if (this.q > 0) {
            qo0.g("Cannot start a writer when a reader is pending");
        }
        this.c = true;
        this.i++;
        return new pr4(this);
    }

    public final boolean x(c02 c02Var) {
        int iR;
        return c02Var.g() && (iR = or4.r(this.b, c02Var.g, this.t)) >= 0 && yf2.p(this.b.get(iR), c02Var);
    }

    public final void y() {
        this.s = new HashMap();
    }
}
