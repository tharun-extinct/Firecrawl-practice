package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xr3 extends v0 {
    public final /* synthetic */ byte j;
    public final Object t;

    public /* synthetic */ xr3(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.j) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.j) {
            case 2:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                ((sr3) obj).clear();
                break;
            case 1:
                ((sr3) obj).clear();
                break;
            default:
                ((f13) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.j;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    sr3 sr3Var = (sr3) this.t;
                    Object obj3 = sr3Var.get(entry.getKey());
                    if (obj3 != null) {
                        return obj3.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && sr3Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((sr3) obj2).containsKey(obj);
            default:
                return ((f13) obj2).containsKey(obj);
        }
    }

    @Override // defpackage.v0
    public final int g() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                return ((sr3) obj).q;
            case 1:
                return ((sr3) obj).q;
            default:
                return ((f13) obj).b;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.j) {
            case 2:
                return ((f13) this.t).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                return new yr3((sr3) obj);
            case 1:
                sr3 sr3Var = (sr3) obj;
                pd5[] pd5VarArr = new pd5[8];
                for (int i = 0; i < 8; i++) {
                    pd5VarArr[i] = new rd5((byte) 0);
                }
                return new zr3(sr3Var, pd5VarArr);
            default:
                return new b13((f13) obj, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.j;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((sr3) this.t).remove(entry.getKey(), entry.getValue());
            case 1:
                sr3 sr3Var = (sr3) obj2;
                if (!sr3Var.containsKey(obj)) {
                    return false;
                }
                sr3Var.remove(obj);
                return true;
            default:
                f13 f13Var = (f13) obj2;
                f13Var.r();
                int iL = f13Var.l(obj);
                if (iL < 0) {
                    return false;
                }
                f13Var.m(iL);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.j) {
            case 2:
                collection.getClass();
                ((f13) this.t).r();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.j) {
            case 2:
                collection.getClass();
                ((f13) this.t).r();
                break;
        }
        return super.retainAll(collection);
    }
}
