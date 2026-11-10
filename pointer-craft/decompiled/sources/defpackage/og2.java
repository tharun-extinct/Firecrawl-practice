package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class og2 {
    public final x94 g;
    public final Object j;
    public final sx1 l;
    public final ReentrantLock n;
    public final LinkedHashMap r;
    public final AtomicInteger v;
    public final sx1 x;
    public final ae5 y;

    public og2(x94 x94Var, HashMap map, HashMap map2, String... strArr) {
        this.g = x94Var;
        ae5 ae5Var = new ae5(x94Var, map, map2, strArr, x94Var.m, new w(1, this, og2.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 1));
        this.y = ae5Var;
        this.r = new LinkedHashMap();
        this.n = new ReentrantLock();
        this.v = new AtomicInteger(0);
        this.x = new sx1(this, (byte) 7);
        this.l = new sx1(this, (byte) 8);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.j = new Object();
        ae5Var.m = new gf((Object) this, (byte) 14);
    }
}
