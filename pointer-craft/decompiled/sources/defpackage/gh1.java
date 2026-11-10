package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gh1 extends jh1 {
    public pq4 n;
    public long r;

    public gh1() {
        super(3);
        this.r = 9205357640488583168L;
        this.n = oq4.g;
    }

    @Override // defpackage.ah1
    public final ah1 g() {
        gh1 gh1Var = new gh1();
        gh1Var.r = this.r;
        gh1Var.n = this.n;
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ah1) obj).g());
        }
        gh1Var.y.addAll(arrayList2);
        return gh1Var;
    }

    @Override // defpackage.ah1
    public final void r(o22 o22Var) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) yb1.r(this.r)) + ", sizeMode=" + this.n + ", children=[\n" + n() + "\n])";
    }

    @Override // defpackage.ah1
    public final o22 y() {
        o22 o22VarY;
        ArrayList arrayList = this.y;
        ah1 ah1Var = (ah1) (arrayList.size() == 1 ? arrayList.get(0) : null);
        return (ah1Var == null || (o22VarY = ah1Var.y()) == null) ? xq2.q(m22.g) : o22VarY;
    }
}
