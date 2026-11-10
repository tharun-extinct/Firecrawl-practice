package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f13 implements Map, Serializable, yh2 {
    public static final f13 h;
    public int[] a;
    public int b;
    public int c;
    public int i;
    public Object[] j;
    public int[] m;
    public h13 p;
    public int q;
    public xr3 s;
    public Object[] t;
    public g13 u;
    public int w;
    public boolean z;

    static {
        f13 f13Var = new f13(0);
        f13Var.z = true;
        h = f13Var;
    }

    public f13(int i) {
        if (i < 0) {
            l0.u("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.j = objArr;
        this.t = null;
        this.a = iArr;
        this.m = new int[iHighestOneBit];
        this.q = 2;
        this.w = 0;
        this.c = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final void a(int i) {
        int[] iArr;
        this.i++;
        int i2 = 0;
        if (this.w > this.b) {
            n(false);
        }
        this.m = new int[i];
        this.c = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.w) {
            int i3 = i2 + 1;
            int iT = t(this.j[i2]);
            int i4 = this.q;
            while (true) {
                iArr = this.m;
                if (iArr[iT] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    l0.z("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iT = iT == 0 ? iArr.length - 1 : iT - 1;
            }
            iArr[iT] = i3;
            this.a[i2] = iT;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        r();
        int i = this.w - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.a;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.m[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        zq2.d(this.j, 0, this.w);
        Object[] objArr = this.t;
        if (objArr != null) {
            zq2.d(objArr, 0, this.w);
        }
        this.b = 0;
        this.w = 0;
        this.i++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return l(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g13 g13Var = this.u;
        if (g13Var != null) {
            return g13Var;
        }
        g13 g13Var2 = new g13(this);
        this.u = g13Var2;
        return g13Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.b == map.size() && v(map.entrySet());
    }

    public final int g(Object obj) {
        r();
        while (true) {
            int iT = t(obj);
            int i = this.q * 2;
            int length = this.m.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.m;
                int i3 = iArr[iT];
                if (i3 == 0) {
                    int i4 = this.w;
                    Object[] objArr = this.j;
                    if (i4 >= objArr.length) {
                        x(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.w = i5;
                    objArr[i4] = obj;
                    this.a[i4] = iT;
                    iArr[iT] = i5;
                    this.b++;
                    this.i++;
                    if (i2 > this.q) {
                        this.q = i2;
                    }
                    return i4;
                }
                if (yf2.p(this.j[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    a(this.m.length * 2);
                    break;
                }
                iT = iT == 0 ? this.m.length - 1 : iT - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iL = l(obj);
        if (iL < 0) {
            return null;
        }
        Object[] objArr = this.t;
        objArr.getClass();
        return objArr[iL];
    }

    @Override // java.util.Map
    public final int hashCode() {
        b13 b13Var = new b13(this, (byte) 0);
        int i = 0;
        while (b13Var.hasNext()) {
            int i2 = b13Var.j;
            f13 f13Var = (f13) b13Var.m;
            if (i2 >= f13Var.w) {
                uo1.b();
                return 0;
            }
            b13Var.j = i2 + 1;
            b13Var.t = i2;
            Object obj = f13Var.j[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = f13Var.t;
            objArr.getClass();
            Object obj2 = objArr[b13Var.t];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            b13Var.r();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    public final int j(Object obj) {
        int i = this.w;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.a[i] >= 0) {
                Object[] objArr = this.t;
                objArr.getClass();
                if (yf2.p(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        xr3 xr3Var = this.s;
        if (xr3Var != null) {
            return xr3Var;
        }
        xr3 xr3Var2 = new xr3(this, (byte) 2);
        this.s = xr3Var2;
        return xr3Var2;
    }

    public final int l(Object obj) {
        int iT = t(obj);
        int i = this.q;
        while (true) {
            int i2 = this.m[iT];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (yf2.p(this.j[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iT = iT == 0 ? this.m.length - 1 : iT - 1;
        }
    }

    public final void m(int i) {
        int i2;
        int i3;
        int iT;
        int[] iArr;
        Object[] objArr = this.j;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.t;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.a[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.m.length - 1 : length - 1;
                int[] iArr2 = this.m;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.q) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iT = t(this.j[i3]) - length;
                    iArr = this.m;
                }
            } while ((iT & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.a[i3] = i4;
        }
        this.a[i] = -1;
        this.b--;
        this.i++;
    }

    public final void n(boolean z) {
        int i;
        Object[] objArr = this.t;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.w;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.a;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.j;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.m[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        zq2.d(this.j, i3, i);
        if (objArr != null) {
            zq2.d(objArr, i3, this.w);
        }
        this.w = i3;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        r();
        int iG = g(obj);
        Object[] objArr = this.t;
        if (objArr == null) {
            int length = this.j.length;
            if (length < 0) {
                l0.u("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.t = objArr;
        }
        if (iG >= 0) {
            objArr[iG] = obj2;
            return null;
        }
        int i = (-iG) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        r();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        x(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iG = g(entry.getKey());
            Object[] objArr = this.t;
            if (objArr == null) {
                int length = this.j.length;
                if (length < 0) {
                    l0.u("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.t = objArr;
                }
            }
            if (iG >= 0) {
                objArr[iG] = entry.getValue();
            } else {
                int i = (-iG) - 1;
                if (!yf2.p(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    public final void r() {
        if (this.z) {
            uo1.f();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        r();
        int iL = l(obj);
        if (iL < 0) {
            return null;
        }
        Object[] objArr = this.t;
        objArr.getClass();
        Object obj2 = objArr[iL];
        m(iL);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.b;
    }

    public final int t(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.b * 3) + 2);
        sb.append("{");
        int i = 0;
        b13 b13Var = new b13(this, 0 == true ? 1 : 0);
        while (b13Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = b13Var.j;
            f13 f13Var = (f13) b13Var.m;
            if (i2 >= f13Var.w) {
                uo1.b();
                return null;
            }
            b13Var.j = i2 + 1;
            b13Var.t = i2;
            Object obj = f13Var.j[i2];
            if (obj == f13Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = f13Var.t;
            objArr.getClass();
            Object obj2 = objArr[b13Var.t];
            if (obj2 == f13Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            b13Var.r();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean v(Collection collection) {
        boolean zP;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iL = l(entry.getKey());
                    if (iL < 0) {
                        zP = false;
                    } else {
                        Object[] objArr = this.t;
                        objArr.getClass();
                        zP = yf2.p(objArr[iL], entry.getValue());
                    }
                    if (!zP) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Collection values() {
        h13 h13Var = this.p;
        if (h13Var != null) {
            return h13Var;
        }
        h13 h13Var2 = new h13(this, (byte) 0);
        this.p = h13Var2;
        return h13Var2;
    }

    public final void x(int i) {
        Object[] objArr = this.j;
        int length = objArr.length;
        int i2 = this.w;
        int i3 = length - i2;
        int i4 = i2 - this.b;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            n(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.j = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.t;
            this.t = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.a = Arrays.copyOf(this.a, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.m.length) {
                a(iHighestOneBit);
            }
        }
    }

    public final f13 y() {
        r();
        this.z = true;
        if (this.b > 0) {
            return this;
        }
        f13 f13Var = h;
        f13Var.getClass();
        return f13Var;
    }

    public f13() {
        this(8);
    }
}
