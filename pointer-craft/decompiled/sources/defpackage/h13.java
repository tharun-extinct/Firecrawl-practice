package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h13 extends AbstractCollection implements Collection, wh2 {
    public final /* synthetic */ byte j;
    public final Object t;

    public /* synthetic */ h13(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.j) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.j) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                ((f13) obj).clear();
                break;
            default:
                ((sr3) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.j;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                return ((f13) obj2).containsValue(obj);
            default:
                return ((sr3) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.j) {
            case 0:
                return ((f13) this.t).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                return new e13((f13) obj);
            default:
                sr3 sr3Var = (sr3) obj;
                pd5[] pd5VarArr = new pd5[8];
                for (int i = 0; i < 8; i++) {
                    pd5VarArr[i] = new rd5((byte) 1);
                }
                return new zr3(sr3Var, pd5VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.j) {
            case 0:
                f13 f13Var = (f13) this.t;
                f13Var.r();
                int iJ = f13Var.j(obj);
                if (iJ < 0) {
                    return false;
                }
                f13Var.m(iJ);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.j) {
            case 0:
                collection.getClass();
                ((f13) this.t).r();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.j) {
            case 0:
                collection.getClass();
                ((f13) this.t).r();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                return ((f13) obj).b;
            default:
                return ((sr3) obj).q;
        }
    }
}
