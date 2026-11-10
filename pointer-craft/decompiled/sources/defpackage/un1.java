package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class un1 {
    public final String g;
    public final Map y;

    public un1(String str, Map map) {
        this.g = str;
        this.y = map;
    }

    public static un1 g(String str) {
        return new un1(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un1)) {
            return false;
        }
        un1 un1Var = (un1) obj;
        return this.g.equals(un1Var.g) && this.y.equals(un1Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.g + ", properties=" + this.y.values() + "}";
    }
}
