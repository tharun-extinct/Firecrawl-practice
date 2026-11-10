package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class wa3 implements List, wh2 {
    public final int a;
    public final /* synthetic */ byte j;
    public int m;
    public final List t;

    public /* synthetic */ wa3(List list, int i, int i2, byte b) {
        this.j = b;
        this.t = list;
        this.a = i;
        this.m = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.j;
        int i2 = this.a;
        List list = this.t;
        switch (b) {
            case 0:
                list.add(i + i2, obj);
                this.m++;
                break;
            default:
                list.add(i + i2, obj);
                this.m++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.j;
        int i2 = this.a;
        List list = this.t;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(i + i2, collection);
                this.m = collection.size() + this.m;
                return collection.size() > 0;
            default:
                list.addAll(i + i2, collection);
                int size = collection.size();
                this.m += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.j;
        List list = this.t;
        int i = this.a;
        switch (b) {
            case 0:
                int i2 = this.m - 1;
                if (i <= i2) {
                    while (true) {
                        list.remove(i2);
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
                this.m = i;
                break;
            default:
                int i3 = this.m - 1;
                if (i <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                this.m = i;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.j;
        List list = this.t;
        int i = this.a;
        switch (b) {
            case 0:
                int i2 = this.m;
                while (i < i2) {
                    if (yf2.p(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.m;
                while (i < i3) {
                    if (yf2.p(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.j) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.j;
        int i2 = this.a;
        List list = this.t;
        switch (b) {
            case 0:
                ni3.g(i, this);
                break;
            default:
                sb3.g(i, this);
                break;
        }
        return list.get(i + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.j;
        List list = this.t;
        int i = this.a;
        switch (b) {
            case 0:
                int i2 = this.m;
                for (int i3 = i; i3 < i2; i3++) {
                    if (yf2.p(list.get(i3), obj)) {
                        return i3 - i;
                    }
                }
                return -1;
            default:
                int i4 = this.m;
                for (int i5 = i; i5 < i4; i5++) {
                    if (yf2.p(list.get(i5), obj)) {
                        return i5 - i;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.j) {
            case 0:
                return this.m == this.a;
            default:
                return this.m == this.a;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.j) {
            case 0:
                return new ua3(this, 0, (byte) 0);
            default:
                return new ua3(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        byte b = this.j;
        List list = this.t;
        int i = this.a;
        switch (b) {
            case 0:
                int i2 = this.m - 1;
                if (i > i2) {
                    return -1;
                }
                while (!yf2.p(list.get(i2), obj)) {
                    if (i2 == i) {
                        return -1;
                    }
                    i2--;
                }
                return i2 - i;
            default:
                int i3 = this.m - 1;
                if (i > i3) {
                    return -1;
                }
                while (!yf2.p(list.get(i3), obj)) {
                    if (i3 == i) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.j) {
            case 0:
                return new ua3(this, 0, (byte) 0);
            default:
                return new ua3(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.j;
        int i = this.a;
        List list = this.t;
        switch (b) {
            case 0:
                int i2 = this.m;
                while (i < i2) {
                    if (yf2.p(list.get(i), obj)) {
                        list.remove(i);
                        this.m--;
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.m;
                while (i < i3) {
                    if (yf2.p(list.get(i), obj)) {
                        list.remove(i);
                        this.m--;
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.j) {
            case 0:
                collection.getClass();
                int i = this.m;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.m;
            default:
                int i2 = this.m;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.m;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.j;
        int i = this.a;
        List list = this.t;
        switch (b) {
            case 0:
                collection.getClass();
                int i2 = this.m;
                int i3 = i2 - 1;
                if (i <= i3) {
                    while (true) {
                        if (!collection.contains(list.get(i3))) {
                            list.remove(i3);
                            this.m--;
                        }
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                return i2 != this.m;
            default:
                int i4 = this.m;
                int i5 = i4 - 1;
                if (i <= i5) {
                    while (true) {
                        if (!collection.contains(list.get(i5))) {
                            list.remove(i5);
                            this.m--;
                        }
                        if (i5 != i) {
                            i5--;
                        }
                    }
                }
                return i4 != this.m;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.j;
        int i2 = this.a;
        List list = this.t;
        switch (b) {
            case 0:
                ni3.g(i, this);
                break;
            default:
                sb3.g(i, this);
                break;
        }
        return list.set(i + i2, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.j) {
            case 0:
                i = this.m;
                i2 = this.a;
                break;
            default:
                i = this.m;
                i2 = this.a;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.j) {
            case 0:
                ni3.y(this, i, i2);
                return new wa3(this, i, i2, (byte) 0);
            default:
                sb3.y(this, i, i2);
                return new wa3(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.j) {
            case 0:
                objArr.getClass();
                break;
        }
        return pw5.T(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.j) {
            case 0:
                break;
        }
        return pw5.S(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.j) {
            case 0:
                return new ua3(this, i, (byte) 0);
            default:
                return new ua3(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.j;
        List list = this.t;
        switch (b) {
            case 0:
                int i = this.m;
                this.m = i + 1;
                list.add(i, obj);
                break;
            default:
                int i2 = this.m;
                this.m = i2 + 1;
                list.add(i2, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.j;
        List list = this.t;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(this.m, collection);
                this.m = collection.size() + this.m;
                return collection.size() > 0;
            default:
                list.addAll(this.m, collection);
                int size = collection.size();
                this.m += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.j;
        int i2 = this.a;
        List list = this.t;
        switch (b) {
            case 0:
                ni3.g(i, this);
                Object objRemove = list.remove(i + i2);
                this.m--;
                return objRemove;
            default:
                sb3.g(i, this);
                Object objRemove2 = list.remove(i + i2);
                this.m--;
                return objRemove2;
        }
    }
}
