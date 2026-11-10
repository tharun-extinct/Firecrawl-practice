package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class hi4 implements Iterable {
    public final LinkedHashSet j = new LinkedHashSet();
    public final LinkedHashSet t = new LinkedHashSet();

    public final boolean contains(Object obj) {
        return this.j.contains(obj) || this.t.contains(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi4)) {
            return false;
        }
        hi4 hi4Var = (hi4) obj;
        return this.j.equals(hi4Var.j) && this.t.equals(hi4Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() ^ this.j.hashCode();
    }

    public final boolean isEmpty() {
        return this.j.isEmpty() && this.t.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.j.iterator();
    }

    public final String toString() {
        LinkedHashSet linkedHashSet = this.j;
        int size = linkedHashSet.size();
        LinkedHashSet linkedHashSet2 = this.t;
        if (linkedHashSet2.size() + size <= 0) {
            return "size=0, items=[]";
        }
        StringBuilder sb = new StringBuilder((linkedHashSet2.size() + linkedHashSet.size()) * 28);
        sb.append("Selection{");
        sb.append("primary{size=" + linkedHashSet.size());
        sb.append(", entries=" + linkedHashSet);
        sb.append("}, provisional{size=" + linkedHashSet2.size());
        sb.append(", entries=" + linkedHashSet2);
        sb.append("}}");
        return sb.toString();
    }
}
