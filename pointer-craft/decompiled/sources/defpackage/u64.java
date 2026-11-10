package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u64 extends jh1 {
    public o22 r;

    public u64() {
        super(2);
        this.r = m22.g;
    }

    @Override // defpackage.ah1
    public final ah1 g() {
        u64 u64Var = new u64();
        u64Var.r = this.r;
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ah1) obj).g());
        }
        u64Var.y.addAll(arrayList2);
        return u64Var;
    }

    @Override // defpackage.ah1
    public final void r(o22 o22Var) {
        this.r = o22Var;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.r + ", children=[\n" + n() + "\n])";
    }

    @Override // defpackage.ah1
    public final o22 y() {
        return this.r;
    }
}
