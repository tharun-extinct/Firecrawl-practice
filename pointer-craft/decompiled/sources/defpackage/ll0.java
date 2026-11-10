package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ll0 {
    public final String g;
    public final Set l;
    public final boolean n;
    public final Set r;
    public final boolean v;
    public final gm0 x;
    public final Set y;

    /* JADX WARN: Multi-variable type inference failed */
    public ll0(String str, Set set, Set set2, int i, int i2, gm0 gm0Var, Set set3) {
        this.g = str;
        this.y = Collections.unmodifiableSet(set);
        this.r = Collections.unmodifiableSet(set2);
        this.n = i;
        this.v = i2;
        this.x = gm0Var;
        this.l = Collections.unmodifiableSet(set3);
    }

    public static kl0 g(Class cls) {
        return new kl0(cls, new Class[0]);
    }

    public static ll0 y(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e24.g(cls));
        for (Class cls2 : clsArr) {
            lr2.b(cls2, "Null interface");
            hashSet.add(e24.g(cls2));
        }
        return new ll0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new jl0(obj, (byte) 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.y.toArray()) + ">{" + (this.n ? 1 : 0) + ", type=" + (this.v ? 1 : 0) + ", deps=" + Arrays.toString(this.r.toArray()) + "}";
    }
}
