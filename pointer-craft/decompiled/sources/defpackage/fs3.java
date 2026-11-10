package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fs3 extends m1 implements Set, Collection, vh2 {
    public static final fs3 m;
    public final ur3 a;
    public final Object j;
    public final Object t;

    static {
        tg1 tg1Var = tg1.b;
        m = new fs3(tg1Var, tg1Var, ur3.a);
    }

    public fs3(Object obj, Object obj2, ur3 ur3Var) {
        this.j = obj;
        this.t = obj2;
        this.a = ur3Var;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.o
    public final int g() {
        return this.a.t;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ab3(this.j, this.a);
    }
}
