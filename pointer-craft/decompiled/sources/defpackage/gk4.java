package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gk4 implements Iterable, vh2 {
    public final /* synthetic */ h51 j;

    public gk4(h51 h51Var) {
        this.j = h51Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g51(this.j);
    }
}
