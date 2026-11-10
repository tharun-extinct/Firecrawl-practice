package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mr extends sp4 implements Map {
    public gr m;
    public ir q;
    public kr w;

    public final boolean a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        gr grVar = this.m;
        if (grVar != null) {
            return grVar;
        }
        gr grVar2 = new gr(this);
        this.m = grVar2;
        return grVar2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ir irVar = this.q;
        if (irVar != null) {
            return irVar;
        }
        ir irVar2 = new ir(this);
        this.q = irVar2;
        return irVar2;
    }

    public final boolean m(Collection collection) {
        int i = this.a;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.a;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        y(map.size() + this.a);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        kr krVar = this.w;
        if (krVar != null) {
            return krVar;
        }
        kr krVar2 = new kr(this);
        this.w = krVar2;
        return krVar2;
    }
}
