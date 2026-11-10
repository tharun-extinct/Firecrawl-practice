package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tj2 {
    public final wi2 g;
    public final LinkedHashMap y;

    public tj2(wi2 wi2Var, LinkedHashMap linkedHashMap) {
        this.g = wi2Var;
        this.y = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj2)) {
            return false;
        }
        tj2 tj2Var = (tj2) obj;
        return this.g.equals(tj2Var.g) && this.y.equals(tj2Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "KeyboardLayoutState(currentLayout=" + this.g + ", charLookupTable=" + this.y + ")";
    }
}
