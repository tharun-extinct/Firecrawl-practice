package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jr implements Iterator, Map.Entry {
    public boolean a;
    public int j;
    public final /* synthetic */ mr m;
    public int t = -1;

    public jr(mr mrVar) {
        this.m = mrVar;
        this.j = mrVar.a - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.a) {
            l0.z("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.t;
            mr mrVar = this.m;
            if (yf2.p(key, mrVar.x(i)) && yf2.p(entry.getValue(), mrVar.t(this.t))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.a) {
            return this.m.x(this.t);
        }
        l0.z("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.a) {
            return this.m.t(this.t);
        }
        l0.z("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.j;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.a) {
            l0.z("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.t;
        mr mrVar = this.m;
        Object objX = mrVar.x(i);
        Object objT = mrVar.t(this.t);
        return (objX == null ? 0 : objX.hashCode()) ^ (objT != null ? objT.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        this.t++;
        this.a = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.a) {
            throw new IllegalStateException();
        }
        this.m.l(this.t);
        this.t--;
        this.j--;
        this.a = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.a) {
            return this.m.j(this.t, obj);
        }
        l0.z("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
