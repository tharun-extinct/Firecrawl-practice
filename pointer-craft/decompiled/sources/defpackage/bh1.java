package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bh1 extends jh1 {
    public t6 n;
    public o22 r;

    public bh1() {
        super(3);
        this.r = m22.g;
        this.n = t6.r;
    }

    @Override // defpackage.ah1
    public final ah1 g() {
        bh1 bh1Var = new bh1();
        bh1Var.r = this.r;
        bh1Var.n = this.n;
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ah1) obj).g());
        }
        bh1Var.y.addAll(arrayList2);
        return bh1Var;
    }

    @Override // defpackage.ah1
    public final void r(o22 o22Var) {
        this.r = o22Var;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.r + ", contentAlignment=" + this.n + "children=[\n" + n() + "\n])";
    }

    @Override // defpackage.ah1
    public final o22 y() {
        return this.r;
    }
}
