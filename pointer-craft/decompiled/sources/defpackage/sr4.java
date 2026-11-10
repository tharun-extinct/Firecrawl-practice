package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class sr4 extends AbstractMap {
    public static final /* synthetic */ int w = 0;
    public boolean a;
    public List j;
    public volatile vr4 m;
    public Map q;
    public Map t;

    public static sr4 x() {
        sr4 sr4Var = new sr4();
        sr4Var.j = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        sr4Var.t = map;
        sr4Var.q = map;
        return sr4Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        y();
        if (!this.j.isEmpty()) {
            this.j.clear();
        }
        if (this.t.isEmpty()) {
            return;
        }
        this.t.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.t.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.m == null) {
            this.m = new vr4(this, 0);
        }
        return this.m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr4)) {
            return super.equals(obj);
        }
        sr4 sr4Var = (sr4) obj;
        int size = size();
        if (size == sr4Var.size()) {
            int size2 = this.j.size();
            if (size2 != sr4Var.j.size()) {
                return ((AbstractSet) entrySet()).equals(sr4Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (r(i).equals(sr4Var.r(i))) {
                }
            }
            if (size2 != size) {
                return this.t.equals(sr4Var.t);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int g(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.j.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((tr4) this.j.get(i3)).g());
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((tr4) this.j.get(i4)).g());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((tr4) this.j.get(i3)).g());
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((tr4) this.j.get(iG)).getValue() : this.t.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.j.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((tr4) this.j.get(i)).hashCode();
        }
        return this.t.size() > 0 ? this.t.hashCode() + iHashCode : iHashCode;
    }

    public final Object j(int i) {
        y();
        Object value = ((tr4) this.j.remove(i)).getValue();
        if (!this.t.isEmpty()) {
            Iterator it = v().entrySet().iterator();
            this.j.add(new tr4(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        y();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((tr4) this.j.get(iG)).setValue(obj);
        }
        y();
        if (this.j.isEmpty() && !(this.j instanceof ArrayList)) {
            this.j = new ArrayList(16);
        }
        int i = -(iG + 1);
        if (i >= 16) {
            return v().put(comparable, obj);
        }
        if (this.j.size() == 16) {
            tr4 tr4Var = (tr4) this.j.remove(15);
            v().put(tr4Var.g(), tr4Var.getValue());
        }
        this.j.add(i, new tr4(this, comparable, obj));
        return null;
    }

    public final Set n() {
        return this.t.isEmpty() ? Collections.EMPTY_SET : this.t.entrySet();
    }

    public final Map.Entry r(int i) {
        return (Map.Entry) this.j.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        y();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return j(iG);
        }
        if (this.t.isEmpty()) {
            return null;
        }
        return this.t.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.t.size() + this.j.size();
    }

    public final SortedMap v() {
        y();
        if (this.t.isEmpty() && !(this.t instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.t = treeMap;
            this.q = treeMap.descendingMap();
        }
        return (SortedMap) this.t;
    }

    public final void y() {
        if (this.a) {
            uo1.f();
        }
    }
}
