package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vc4 implements uc4 {
    public hb3 a;
    public final xy1 j;
    public final hb3 t;

    public vc4(Map map, xy1 xy1Var) {
        hb3 hb3Var;
        this.j = xy1Var;
        if (map == null || map.isEmpty()) {
            hb3Var = null;
        } else {
            hb3Var = new hb3(map.size());
            for (Map.Entry entry : map.entrySet()) {
                hb3Var.c(entry.getKey(), entry.getValue());
            }
        }
        this.t = hb3Var;
    }

    @Override // defpackage.uc4
    public final tc4 g(String str, my1 my1Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!a11.h(str.charAt(i))) {
                hb3 hb3Var = this.a;
                if (hb3Var == null) {
                    long[] jArr = ee4.g;
                    hb3Var = new hb3();
                    this.a = hb3Var;
                }
                Object objL = hb3Var.l(str);
                if (objL == null) {
                    objL = new ArrayList();
                    hb3Var.c(str, objL);
                }
                ((List) objL).add(my1Var);
                return new ro((Object) hb3Var, (Object) str, (Object) my1Var, (byte) 23);
            }
        }
        l0.u("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.uc4
    public final boolean n(Object obj) {
        return ((Boolean) this.j.a(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.uc4
    public final Map v() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        hb3 hb3Var = this.t;
        if (hb3Var == null && this.a == null) {
            return qi1.j;
        }
        int i3 = 0;
        int i4 = hb3Var != null ? hb3Var.v : 0;
        hb3 hb3Var2 = this.a;
        HashMap map = new HashMap(i4 + (hb3Var2 != null ? hb3Var2.v : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (hb3Var != null) {
            Object[] objArr = hb3Var.y;
            Object[] objArr2 = hb3Var.r;
            long[] jArr3 = hb3Var.g;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        hb3 hb3Var3 = this.a;
        if (hb3Var3 != null) {
            Object[] objArr3 = hb3Var3.y;
            Object[] objArr4 = hb3Var3.r;
            long[] jArr4 = hb3Var3.g;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objG = ((my1) list.get(i3)).g();
                                    if (objG != null) {
                                        if (!n(objG)) {
                                            uo1.x(xq2.c(objG));
                                            return null;
                                        }
                                        map.put(str, pw5.l(objG));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objG2 = ((my1) list.get(i3)).g();
                                        if (objG2 != null && !n(objG2)) {
                                            uo1.x(xq2.c(objG2));
                                            return null;
                                        }
                                        arrayList.add(objG2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.uc4
    public final Object x(String str) {
        hb3 hb3Var = this.t;
        List list = hb3Var != null ? (List) hb3Var.q(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && hb3Var != null) {
            List listSubList = list.subList(1, list.size());
            int iX = hb3Var.x(str);
            if (iX < 0) {
                iX = ~iX;
            }
            Object[] objArr = hb3Var.r;
            Object obj = objArr[iX];
            hb3Var.y[iX] = str;
            objArr[iX] = listSubList;
        }
        return list.get(0);
    }
}
