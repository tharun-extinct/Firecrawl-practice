package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class m13 extends LinkedHashMap {
    public static final m13 t;
    public boolean j = true;

    static {
        m13 m13Var = new m13();
        t = m13Var;
        m13Var.j = false;
    }

    public static int g(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof bf2)) {
                return obj.hashCode();
            }
            uo1.f();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = ff2.g;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public static m13 y() {
        return t;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        r();
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
        int iG = 0;
        for (Map.Entry entry : entrySet()) {
            iG += g(entry.getValue()) ^ g(entry.getKey());
        }
        return iG;
    }

    public final m13 l() {
        if (isEmpty()) {
            return new m13();
        }
        m13 m13Var = new m13(this);
        m13Var.j = true;
        return m13Var;
    }

    public final boolean n() {
        return this.j;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        r();
        Charset charset = ff2.g;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        r();
        for (Object obj : map.keySet()) {
            Charset charset = ff2.g;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    public final void r() {
        if (this.j) {
            return;
        }
        uo1.f();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        r();
        return super.remove(obj);
    }

    public final void v() {
        this.j = false;
    }

    public final void x(m13 m13Var) {
        r();
        if (m13Var.isEmpty()) {
            return;
        }
        putAll(m13Var);
    }
}
