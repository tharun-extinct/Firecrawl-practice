package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class db3 {
    public final LinkedHashMap g;
    public final y22 y;

    public db3(LinkedHashMap linkedHashMap, boolean z) {
        this.g = linkedHashMap;
        this.y = new y22(z);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zP;
        if (obj instanceof db3) {
            LinkedHashMap linkedHashMap = ((db3) obj).g;
            LinkedHashMap linkedHashMap2 = this.g;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zP = yf2.p(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zP = true;
                                } else {
                                    zP = false;
                                }
                            } else {
                                zP = false;
                            }
                            if (!zP) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final Map g() {
        fp3 fp3Var;
        Set<Map.Entry> setEntrySet = this.g.entrySet();
        int iH = v13.h(dj0.Y(setEntrySet, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                fp3Var = new fp3(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                fp3Var = new fp3(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(fp3Var.j, fp3Var.t);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final int hashCode() {
        Iterator it = this.g.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final db3 j() {
        return new db3(new LinkedHashMap(g()), true);
    }

    public final db3 l() {
        return new db3(new LinkedHashMap(g()), false);
    }

    public final void n(rw3 rw3Var) {
        rw3Var.getClass();
        y();
        this.g.remove(rw3Var);
    }

    public final Object r(rw3 rw3Var) {
        rw3Var.getClass();
        Object obj = this.g.get(rw3Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String toString() {
        return cj0.q0(this.g.entrySet(), ",\n", "{\n", "\n}", xj1.m, 24);
    }

    public final void v(rw3 rw3Var, Object obj) {
        rw3Var.getClass();
        x(rw3Var, obj);
    }

    public final void x(rw3 rw3Var, Object obj) {
        rw3Var.getClass();
        y();
        if (obj == null) {
            n(rw3Var);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.g;
        if (z) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(cj0.J0((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(rw3Var, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(rw3Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(rw3Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final void y() {
        if (((AtomicBoolean) this.y.t).get()) {
            l0.z("Do mutate preferences once returned to DataStore.");
        }
    }

    public /* synthetic */ db3(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
