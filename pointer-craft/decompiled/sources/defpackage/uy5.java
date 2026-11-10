package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class uy5 implements Map, Serializable {
    public static final uy5 c = new uy5(0, null, new Object[0]);
    public transient sy5 a;
    public transient jy5 j;
    public final transient Object m;
    public final transient Object[] q;
    public transient qy5 t;
    public final transient int w;

    public uy5(int i, Object obj, Object[] objArr) {
        this.m = obj;
        this.q = objArr;
        this.w = i;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static uy5 g(int i, Object[] objArr, ld1 ld1Var) {
        int iHighestOneBit;
        boolean z;
        int i2;
        char c2;
        ?? r3;
        char c3;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        rx5 rx5Var;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return c;
        }
        rx5 rx5Var2 = null;
        ?? r5 = 0;
        rx5 rx5Var3 = null;
        rx5 rx5Var4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            objArrCopyOf[0].getClass();
            objArrCopyOf[1].getClass();
            return new uy5(1, null, objArrCopyOf);
        }
        zq2.H(i4, objArrCopyOf.length >> 1);
        char c4 = 2;
        int iMax = Math.max(i4, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                l0.u("collection too large");
                return null;
            }
        }
        if (i4 != 1) {
            int i6 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj = objArrCopyOf[i10];
                    obj.getClass();
                    Object obj2 = objArrCopyOf[i10 ^ i5];
                    obj2.getClass();
                    int iX = kc6.x(obj.hashCode());
                    while (true) {
                        int i11 = iX & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = obj;
                                objArrCopyOf[i9 ^ 1] = obj2;
                            }
                            i8++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
                            obj3.getClass();
                            rx5 rx5Var5 = new rx5(obj, obj2, obj3);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                            rx5Var3 = rx5Var5;
                            break;
                        }
                        iX = i11 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    c2 = 2;
                    r3 = bArr;
                    r16 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = rx5Var3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj4 = objArrCopyOf[i17];
                        obj4.getClass();
                        Object obj5 = objArrCopyOf[i17 ^ 1];
                        obj5.getClass();
                        int iX2 = kc6.x(obj4.hashCode());
                        while (true) {
                            int i18 = iX2 & i6;
                            char c5 = (char) sArr[i18];
                            if (c5 == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArrCopyOf[i16] = obj4;
                                    objArrCopyOf[i16 ^ 1] = obj5;
                                }
                                i14++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c5])) {
                                int i19 = c5 ^ 1;
                                Object obj6 = objArrCopyOf[i19 == true ? 1 : 0];
                                obj6.getClass();
                                rx5 rx5Var6 = new rx5(obj4, obj5, obj6);
                                objArrCopyOf[i19 == true ? 1 : 0] = obj5;
                                rx5Var4 = rx5Var6;
                                break;
                            }
                            iX2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), rx5Var4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj7 = objArrCopyOf[i23];
                        obj7.getClass();
                        Object obj8 = objArrCopyOf[i23 ^ 1];
                        obj8.getClass();
                        int iX3 = kc6.x(obj7.hashCode());
                        while (true) {
                            int i24 = iX3 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArrCopyOf[i22] = obj7;
                                    objArrCopyOf[i22 ^ 1] = obj8;
                                }
                                i21++;
                                c3 = c4;
                                break;
                            }
                            c3 = c4;
                            if (obj7.equals(objArrCopyOf[i25])) {
                                int i26 = i25 ^ 1;
                                Object obj9 = objArrCopyOf[i26];
                                obj9.getClass();
                                rx5 rx5Var7 = new rx5(obj7, obj8, obj9);
                                objArrCopyOf[i26] = obj8;
                                rx5Var2 = rx5Var7;
                                break;
                            }
                            iX3 = i24 + 1;
                            c4 = c3;
                        }
                        i20++;
                        c4 = c3;
                    }
                    c2 = c4;
                    if (i21 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i21);
                        objArr3[c2] = rx5Var2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                rx5Var = (rx5) objArr2[c2];
                if (ld1Var != null) {
                    throw rx5Var.g();
                }
                ld1Var.n = rx5Var;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new uy5(i4, r4, objArrCopyOf);
        }
        objArrCopyOf[0].getClass();
        objArrCopyOf[1].getClass();
        z4 = false;
        i2 = 1;
        c2 = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            rx5Var = (rx5) objArr2[c2];
            if (ld1Var != null) {
                throw rx5Var.g();
            }
            ld1Var.n = rx5Var;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new uy5(i4, r4, objArrCopyOf);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        sy5 sy5Var = this.a;
        if (sy5Var == null) {
            sy5Var = new sy5(this.q, 1, this.w);
            this.a = sy5Var;
        }
        return sy5Var.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        jy5 jy5Var = this.j;
        if (jy5Var != null) {
            return jy5Var;
        }
        jy5 jy5Var2 = new jy5(this, this.q, this.w);
        this.j = jy5Var2;
        return jy5Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.q;
            if (this.w == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.m;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iX = kc6.x(obj.hashCode());
                    while (true) {
                        int i = iX & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iX = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iX2 = kc6.x(obj.hashCode());
                    while (true) {
                        int i3 = iX2 & length2;
                        char c2 = (char) sArr[i3];
                        if (c2 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c2])) {
                            obj2 = objArr[c2 ^ 1];
                        } else {
                            iX2 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iX3 = kc6.x(obj.hashCode());
                    while (true) {
                        int i4 = iX3 & length3;
                        int i5 = iArr[i4];
                        if (i5 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            obj2 = objArr[i5 ^ 1];
                        } else {
                            iX3 = i4 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        jy5 jy5Var = this.j;
        if (jy5Var == null) {
            jy5Var = new jy5(this, this.q, this.w);
            this.j = jy5Var;
        }
        Iterator it = jy5Var.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        qy5 qy5Var = this.t;
        if (qy5Var != null) {
            return qy5Var;
        }
        qy5 qy5Var2 = new qy5(this, new sy5(this.q, 0, this.w));
        this.t = qy5Var2;
        return qy5Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.w;
    }

    public final String toString() {
        int i = this.w;
        if (i < 0) {
            l0.u(xi3.j("size cannot be negative but was: ", i));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : (jy5) entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        sy5 sy5Var = this.a;
        if (sy5Var != null) {
            return sy5Var;
        }
        sy5 sy5Var2 = new sy5(this.q, 1, this.w);
        this.a = sy5Var2;
        return sy5Var2;
    }
}
