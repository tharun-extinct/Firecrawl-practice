package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fh1 extends jh1 {
    public int n;
    public o22 r;
    public int v;

    public fh1() {
        super(3);
        this.r = m22.g;
        this.n = 0;
        this.v = 0;
    }

    @Override // defpackage.ah1
    public final ah1 g() {
        fh1 fh1Var = new fh1();
        fh1Var.r = this.r;
        fh1Var.n = this.n;
        fh1Var.v = this.v;
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ah1) obj).g());
        }
        fh1Var.y.addAll(arrayList2);
        return fh1Var;
    }

    @Override // defpackage.ah1
    public final void r(o22 o22Var) {
        this.r = o22Var;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.r + ", horizontalAlignment=" + ((Object) q6.y(this.n)) + ", verticalAlignment=" + ((Object) s6.y(this.v)) + ", children=[\n" + n() + "\n])";
    }

    @Override // defpackage.ah1
    public final o22 y() {
        return this.r;
    }
}
