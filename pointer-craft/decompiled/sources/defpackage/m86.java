package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class m86 extends LinkedHashMap {
    public static final m86 t;
    public boolean j = true;

    static {
        m86 m86Var = new m86();
        t = m86Var;
        m86Var.j = false;
    }

    public static m86 g() {
        return t;
    }

    public static int x(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof mc6)) {
                return obj.hashCode();
            }
            uo1.f();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iG = m76.g(length, bArr, 0, length);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iX = 0;
        for (Map.Entry entry : entrySet()) {
            iX += x(entry.getValue()) ^ x(entry.getKey());
        }
        return iX;
    }

    public final void l() {
        if (this.j) {
            return;
        }
        uo1.f();
    }

    public final void n(m86 m86Var) {
        l();
        if (m86Var.isEmpty()) {
            return;
        }
        putAll(m86Var);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l();
        Charset charset = m76.g;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            Charset charset = m76.g;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    public final void r() {
        this.j = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l();
        return super.remove(obj);
    }

    public final boolean v() {
        return this.j;
    }

    public final m86 y() {
        if (isEmpty()) {
            return new m86();
        }
        m86 m86Var = new m86(this);
        m86Var.j = true;
        return m86Var;
    }
}
