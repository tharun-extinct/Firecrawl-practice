package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ch1 extends jh1 {
    public int n;
    public o22 r;
    public int v;

    public ch1() {
        super(3);
        this.r = m22.g;
        this.n = 0;
        this.v = 0;
    }

    @Override // defpackage.ah1
    public final ah1 g() {
        ch1 ch1Var = new ch1();
        ch1Var.r = this.r;
        ch1Var.n = this.n;
        ch1Var.v = this.v;
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ah1) obj).g());
        }
        ch1Var.y.addAll(arrayList2);
        return ch1Var;
    }

    @Override // defpackage.ah1
    public final void r(o22 o22Var) {
        this.r = o22Var;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.r + ", verticalAlignment=" + ((Object) s6.y(this.n)) + ", horizontalAlignment=" + ((Object) q6.y(this.v)) + ", children=[\n" + n() + "\n])";
    }

    @Override // defpackage.ah1
    public final o22 y() {
        return this.r;
    }
}
