package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class p5 {
    public int g;
    public Serializable n;
    public Object r;
    public Object v;
    public Object x;
    public final Object y;

    public p5(o44 o44Var) {
        this.y = new c6(30);
        this.r = new ArrayList();
        this.n = new ArrayList();
        this.g = 0;
        this.v = o44Var;
        this.x = new v92((Object) this, (byte) 22);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:104:0x019c  */
    /* JADX WARN: Code duplicated, block: B:188:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0169  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x017f  */
    public void a() {
        boolean z;
        byte b;
        o5 o5VarJ;
        int i;
        int i2;
        int i3;
        o5 o5VarJ2;
        boolean z2;
        boolean z3;
        Object obj;
        o5 o5Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        c6 c6Var = (c6) this.y;
        o44 o44Var = (o44) this.v;
        v92 v92Var = (v92) this.x;
        ArrayList arrayList = (ArrayList) this.r;
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((o5) arrayList.get(size)).g == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            p5 p5Var = (p5) v92Var.t;
            c6 c6Var2 = (c6) p5Var.y;
            o5 o5Var2 = (o5) arrayList.get(size);
            o5 o5Var3 = (o5) arrayList.get(i12);
            byte b2 = o5Var3.g;
            if (b2 == 1) {
                int i13 = o5Var2.n;
                int i14 = o5Var3.y;
                int i15 = i13 < i14 ? -1 : 0;
                int i16 = o5Var2.y;
                if (i16 < i14) {
                    i15++;
                }
                if (i14 <= i16) {
                    o5Var2.y = i16 + o5Var3.n;
                }
                int i17 = o5Var3.y;
                if (i17 <= i13) {
                    o5Var2.n = i13 + o5Var3.n;
                }
                o5Var3.y = i17 + i15;
                arrayList.set(size, o5Var3);
                arrayList.set(i12, o5Var2);
            } else if (b2 == 2) {
                int i18 = o5Var2.y;
                int i19 = o5Var2.n;
                int i20 = o5Var3.y;
                if (i18 < i19) {
                    if (i20 == i18 && o5Var3.n == i19 - i18) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i20 == i19 + 1 && o5Var3.n == i18 - i19) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i19 < i20) {
                    i20--;
                    o5Var3.y = i20;
                } else {
                    int i21 = o5Var3.n;
                    if (i19 < i20 + i21) {
                        o5Var3.n = i21 - 1;
                        o5Var2.g = (byte) 2;
                        o5Var2.n = 1;
                        if (o5Var3.n == 0) {
                            arrayList.remove(i12);
                            o5Var3.r = null;
                            c6Var2.a(o5Var3);
                        }
                    }
                }
                int i22 = o5Var2.y;
                if (i22 <= i20) {
                    o5Var3.y = i20 + 1;
                } else {
                    int i23 = i20 + o5Var3.n;
                    if (i22 < i23) {
                        obj = null;
                        o5 o5VarJ3 = p5Var.j(null, 2, i22 + 1, i23 - i22);
                        o5Var3.n = o5Var2.y - o5Var3.y;
                        o5Var = o5VarJ3;
                    }
                    if (z3) {
                        arrayList.set(size, o5Var3);
                        arrayList.remove(i12);
                        o5Var2.r = obj;
                        c6Var2.a(o5Var2);
                    } else {
                        if (z2) {
                            if (o5Var != null) {
                                i10 = o5Var2.y;
                                if (i10 > o5Var.y) {
                                    o5Var2.y = i10 - o5Var.n;
                                }
                                i11 = o5Var2.n;
                                if (i11 > o5Var.y) {
                                    o5Var2.n = i11 - o5Var.n;
                                }
                            }
                            i8 = o5Var2.y;
                            if (i8 > o5Var3.y) {
                                o5Var2.y = i8 - o5Var3.n;
                            }
                            i9 = o5Var2.n;
                            if (i9 > o5Var3.y) {
                                o5Var2.n = i9 - o5Var3.n;
                            }
                        } else {
                            if (o5Var != null) {
                                i6 = o5Var2.y;
                                if (i6 >= o5Var.y) {
                                    o5Var2.y = i6 - o5Var.n;
                                }
                                i7 = o5Var2.n;
                                if (i7 >= o5Var.y) {
                                    o5Var2.n = i7 - o5Var.n;
                                }
                            }
                            i4 = o5Var2.y;
                            if (i4 >= o5Var3.y) {
                                o5Var2.y = i4 - o5Var3.n;
                            }
                            i5 = o5Var2.n;
                            if (i5 >= o5Var3.y) {
                                o5Var2.n = i5 - o5Var3.n;
                            }
                        }
                        arrayList.set(size, o5Var3);
                        if (o5Var2.y != o5Var2.n) {
                            arrayList.set(i12, o5Var2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (o5Var != null) {
                            arrayList.add(size, o5Var);
                        }
                    }
                }
                obj = null;
                o5Var = null;
                if (z3) {
                    arrayList.set(size, o5Var3);
                    arrayList.remove(i12);
                    o5Var2.r = obj;
                    c6Var2.a(o5Var2);
                } else {
                    if (z2) {
                        if (o5Var != null) {
                            i10 = o5Var2.y;
                            if (i10 > o5Var.y) {
                                o5Var2.y = i10 - o5Var.n;
                            }
                            i11 = o5Var2.n;
                            if (i11 > o5Var.y) {
                                o5Var2.n = i11 - o5Var.n;
                            }
                        }
                        i8 = o5Var2.y;
                        if (i8 > o5Var3.y) {
                            o5Var2.y = i8 - o5Var3.n;
                        }
                        i9 = o5Var2.n;
                        if (i9 > o5Var3.y) {
                            o5Var2.n = i9 - o5Var3.n;
                        }
                    } else {
                        if (o5Var != null) {
                            i6 = o5Var2.y;
                            if (i6 >= o5Var.y) {
                                o5Var2.y = i6 - o5Var.n;
                            }
                            i7 = o5Var2.n;
                            if (i7 >= o5Var.y) {
                                o5Var2.n = i7 - o5Var.n;
                            }
                        }
                        i4 = o5Var2.y;
                        if (i4 >= o5Var3.y) {
                            o5Var2.y = i4 - o5Var3.n;
                        }
                        i5 = o5Var2.n;
                        if (i5 >= o5Var3.y) {
                            o5Var2.n = i5 - o5Var3.n;
                        }
                    }
                    arrayList.set(size, o5Var3);
                    if (o5Var2.y != o5Var2.n) {
                        arrayList.set(i12, o5Var2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (o5Var != null) {
                        arrayList.add(size, o5Var);
                    }
                }
            } else if (b2 == 4) {
                int i24 = o5Var2.n;
                int i25 = o5Var3.y;
                if (i24 < i25) {
                    o5Var3.y = i25 - 1;
                } else {
                    int i26 = o5Var3.n;
                    if (i24 < i25 + i26) {
                        o5Var3.n = i26 - 1;
                        o5VarJ = p5Var.j(o5Var3.r, 4, o5Var2.y, 1);
                    }
                    i = o5Var2.y;
                    i2 = o5Var3.y;
                    if (i <= i2) {
                        o5Var3.y = i2 + 1;
                    } else {
                        i3 = i2 + o5Var3.n;
                        if (i < i3) {
                            int i27 = i3 - i;
                            o5VarJ2 = p5Var.j(o5Var3.r, 4, i + 1, i27);
                            o5Var3.n -= i27;
                        }
                        arrayList.set(i12, o5Var2);
                        if (o5Var3.n > 0) {
                            arrayList.set(size, o5Var3);
                        } else {
                            arrayList.remove(size);
                            o5Var3.r = null;
                            c6Var2.a(o5Var3);
                        }
                        if (o5VarJ != null) {
                            arrayList.add(size, o5VarJ);
                        }
                        if (o5VarJ2 != null) {
                            arrayList.add(size, o5VarJ2);
                        }
                    }
                    o5VarJ2 = null;
                    arrayList.set(i12, o5Var2);
                    if (o5Var3.n > 0) {
                        arrayList.set(size, o5Var3);
                    } else {
                        arrayList.remove(size);
                        o5Var3.r = null;
                        c6Var2.a(o5Var3);
                    }
                    if (o5VarJ != null) {
                        arrayList.add(size, o5VarJ);
                    }
                    if (o5VarJ2 != null) {
                        arrayList.add(size, o5VarJ2);
                    }
                }
                o5VarJ = null;
                i = o5Var2.y;
                i2 = o5Var3.y;
                if (i <= i2) {
                    o5Var3.y = i2 + 1;
                } else {
                    i3 = i2 + o5Var3.n;
                    if (i < i3) {
                        int i28 = i3 - i;
                        o5VarJ2 = p5Var.j(o5Var3.r, 4, i + 1, i28);
                        o5Var3.n -= i28;
                    }
                    arrayList.set(i12, o5Var2);
                    if (o5Var3.n > 0) {
                        arrayList.set(size, o5Var3);
                    } else {
                        arrayList.remove(size);
                        o5Var3.r = null;
                        c6Var2.a(o5Var3);
                    }
                    if (o5VarJ != null) {
                        arrayList.add(size, o5VarJ);
                    }
                    if (o5VarJ2 != null) {
                        arrayList.add(size, o5VarJ2);
                    }
                }
                o5VarJ2 = null;
                arrayList.set(i12, o5Var2);
                if (o5Var3.n > 0) {
                    arrayList.set(size, o5Var3);
                } else {
                    arrayList.remove(size);
                    o5Var3.r = null;
                    c6Var2.a(o5Var3);
                }
                if (o5VarJ != null) {
                    arrayList.add(size, o5VarJ);
                }
                if (o5VarJ2 != null) {
                    arrayList.add(size, o5VarJ2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i29 = 0; i29 < size2; i29++) {
            o5 o5VarJ4 = (o5) arrayList.get(i29);
            byte b3 = o5VarJ4.g;
            if (b3 == 1) {
                t(o5VarJ4);
            } else if (b3 == 2) {
                int i30 = o5VarJ4.y;
                int i31 = o5VarJ4.n + i30;
                int i32 = i30;
                int i33 = 0;
                byte b4 = -1;
                while (i32 < i31) {
                    if (o44Var.y(i32) != null || g(i32)) {
                        if (b4 == 0) {
                            n(j(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b4 == 1) {
                            t(j(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i32 -= i33;
                        i31 -= i33;
                        i33 = 1;
                    } else {
                        i33++;
                    }
                    i32++;
                    b4 = b;
                }
                if (i33 != o5VarJ4.n) {
                    o5VarJ4.r = null;
                    c6Var.a(o5VarJ4);
                    o5VarJ4 = j(null, 2, i30, i33);
                }
                if (b4 == 0) {
                    n(o5VarJ4);
                } else {
                    t(o5VarJ4);
                }
            } else if (b3 == 4) {
                int i34 = o5VarJ4.y;
                int i35 = o5VarJ4.n + i34;
                int i36 = i34;
                int i37 = 0;
                byte b5 = -1;
                while (i34 < i35) {
                    if (o44Var.y(i34) != null || g(i34)) {
                        if (b5 == 0) {
                            n(j(o5VarJ4.r, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 1;
                    } else {
                        if (b5 == 1) {
                            t(j(o5VarJ4.r, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 0;
                    }
                    i37++;
                    i34++;
                }
                if (i37 != o5VarJ4.n) {
                    Object obj2 = o5VarJ4.r;
                    o5VarJ4.r = null;
                    c6Var.a(o5VarJ4);
                    o5VarJ4 = j(obj2, 4, i36, i37);
                }
                if (b5 == 0) {
                    n(o5VarJ4);
                } else {
                    t(o5VarJ4);
                }
            } else if (b3 == 8) {
                t(o5VarJ4);
            }
        }
        arrayList.clear();
    }

    public boolean g(int i) {
        ArrayList arrayList = (ArrayList) this.n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o5 o5Var = (o5) arrayList.get(i2);
            byte b = o5Var.g;
            if (b != 8) {
                if (b == 1) {
                    int i3 = o5Var.y;
                    int i4 = o5Var.n + i3;
                    while (i3 < i4) {
                        if (x(i3, i2 + 1) == i) {
                            return true;
                        }
                        i3++;
                    }
                } else {
                    continue;
                }
            } else {
                if (x(o5Var.n, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o5 j(Object obj, int i, int i2, int i3) {
        o5 o5Var = (o5) ((c6) this.y).g();
        if (o5Var != null) {
            o5Var.g = i;
            o5Var.y = i2;
            o5Var.n = i3;
            o5Var.r = obj;
            return o5Var;
        }
        o5 o5Var2 = new o5();
        o5Var2.g = i;
        o5Var2.y = i2;
        o5Var2.n = i3;
        o5Var2.r = obj;
        return o5Var2;
    }

    public boolean l() {
        return ((ArrayList) this.r).size() > 0;
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o5 o5Var = (o5) arrayList.get(i);
            o5Var.r = null;
            ((c6) this.y).a(o5Var);
        }
        arrayList.clear();
    }

    public void n(o5 o5Var) {
        int i;
        c6 c6Var = (c6) this.y;
        byte b = o5Var.g;
        if (b == 1 || b == 8) {
            l0.u("should not dispatch add or move for pre layout");
            return;
        }
        int iQ = q(o5Var.y, b);
        int i2 = o5Var.y;
        byte b2 = o5Var.g;
        if (b2 == 2) {
            i = 0;
        } else {
            if (b2 != 4) {
                l0.m(o5Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i3 = 1;
        for (int i4 = 1; i4 < o5Var.n; i4++) {
            int iQ2 = q((i * i4) + o5Var.y, o5Var.g);
            byte b3 = o5Var.g;
            if (b3 == 2 ? iQ2 != iQ : !(b3 == 4 && iQ2 == iQ + 1)) {
                o5 o5VarJ = j(o5Var.r, b3, iQ, i3);
                v(o5VarJ, i2);
                o5VarJ.r = null;
                c6Var.a(o5VarJ);
                if (o5Var.g == 4) {
                    i2 += i3;
                }
                i3 = 1;
                iQ = iQ2;
            } else {
                i3++;
            }
        }
        Object obj = o5Var.r;
        o5Var.r = null;
        c6Var.a(o5Var);
        if (i3 > 0) {
            o5 o5VarJ2 = j(obj, o5Var.g, iQ, i3);
            v(o5VarJ2, i2);
            o5VarJ2.r = null;
            c6Var.a(o5VarJ2);
        }
    }

    public int q(int i, int i2) {
        int i3;
        int i4;
        c6 c6Var = (c6) this.y;
        ArrayList arrayList = (ArrayList) this.n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o5 o5Var = (o5) arrayList.get(size);
            byte b = o5Var.g;
            int i5 = o5Var.y;
            if (b == 8) {
                int i6 = o5Var.n;
                if (i5 < i6) {
                    i4 = i6;
                    i3 = i5;
                } else {
                    i3 = i6;
                    i4 = i5;
                }
                if (i < i3 || i > i4) {
                    if (i < i5) {
                        if (i2 == 1) {
                            o5Var.y = i5 + 1;
                            o5Var.n = i6 + 1;
                        } else if (i2 == 2) {
                            o5Var.y = i5 - 1;
                            o5Var.n = i6 - 1;
                        }
                    }
                } else if (i3 == i5) {
                    if (i2 == 1) {
                        o5Var.n = i6 + 1;
                    } else if (i2 == 2) {
                        o5Var.n = i6 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        o5Var.y = i5 + 1;
                    } else if (i2 == 2) {
                        o5Var.y = i5 - 1;
                    }
                    i--;
                }
            } else if (i5 <= i) {
                if (b == 1) {
                    i -= o5Var.n;
                } else if (b == 2) {
                    i += o5Var.n;
                }
            } else if (i2 == 1) {
                o5Var.y = i5 + 1;
            } else if (i2 == 2) {
                o5Var.y = i5 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            o5 o5Var2 = (o5) arrayList.get(size2);
            byte b2 = o5Var2.g;
            int i7 = o5Var2.n;
            if (b2 == 8) {
                if (i7 == o5Var2.y || i7 < 0) {
                    arrayList.remove(size2);
                    o5Var2.r = null;
                    c6Var.a(o5Var2);
                }
            } else if (i7 <= 0) {
                arrayList.remove(size2);
                o5Var2.r = null;
                c6Var.a(o5Var2);
            }
        }
        return i;
    }

    public void r() {
        o44 o44Var = (o44) this.v;
        y();
        ArrayList arrayList = (ArrayList) this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o5 o5Var = (o5) arrayList.get(i);
            byte b = o5Var.g;
            if (b == 1) {
                o44Var.g(o5Var);
                o44Var.n(o5Var.y, o5Var.n);
            } else if (b == 2) {
                o44Var.g(o5Var);
                int i2 = o5Var.y;
                int i3 = o5Var.n;
                RecyclerView recyclerView = o44Var.j;
                recyclerView.V(i2, i3, true);
                recyclerView.r0 = true;
                recyclerView.o0.r += i3;
            } else if (b == 4) {
                o44Var.g(o5Var);
                o44Var.r(o5Var.y, o5Var.n, o5Var.r);
            } else if (b == 8) {
                o44Var.g(o5Var);
                o44Var.v(o5Var.y, o5Var.n);
            }
        }
        m(arrayList);
        this.g = 0;
    }

    public void t(o5 o5Var) {
        o44 o44Var = (o44) this.v;
        ((ArrayList) this.n).add(o5Var);
        byte b = o5Var.g;
        if (b == 1) {
            o44Var.n(o5Var.y, o5Var.n);
            return;
        }
        if (b == 2) {
            int i = o5Var.y;
            int i2 = o5Var.n;
            RecyclerView recyclerView = o44Var.j;
            recyclerView.V(i, i2, false);
            recyclerView.r0 = true;
            return;
        }
        if (b == 4) {
            o44Var.r(o5Var.y, o5Var.n, o5Var.r);
        } else if (b == 8) {
            o44Var.v(o5Var.y, o5Var.n);
        } else {
            l0.m(o5Var, "Unknown update op type for ");
        }
    }

    public void v(o5 o5Var, int i) {
        o44 o44Var = (o44) this.v;
        o44Var.g(o5Var);
        byte b = o5Var.g;
        if (b != 2) {
            if (b == 4) {
                o44Var.r(i, o5Var.n, o5Var.r);
                return;
            } else {
                l0.u("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i2 = o5Var.n;
        RecyclerView recyclerView = o44Var.j;
        recyclerView.V(i, i2, true);
        recyclerView.r0 = true;
        recyclerView.o0.r += i2;
    }

    public int x(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.n;
        int size = arrayList.size();
        while (i2 < size) {
            o5 o5Var = (o5) arrayList.get(i2);
            byte b = o5Var.g;
            int i3 = o5Var.y;
            if (b == 8) {
                if (i3 == i) {
                    i = o5Var.n;
                } else {
                    if (i3 < i) {
                        i--;
                    }
                    if (o5Var.n <= i) {
                        i++;
                    }
                }
            } else if (i3 > i) {
                continue;
            } else if (b == 2) {
                int i4 = o5Var.n;
                if (i < i3 + i4) {
                    return -1;
                }
                i -= i4;
            } else if (b == 1) {
                i += o5Var.n;
            }
            i2++;
        }
        return i;
    }

    public void y() {
        ArrayList arrayList = (ArrayList) this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o44) this.v).g((o5) arrayList.get(i));
        }
        m(arrayList);
        this.g = 0;
    }

    public p5(b35 b35Var) {
        b35Var.getClass();
        this.y = b35Var;
        this.v = m82.g;
        this.x = hr1.g;
    }
}
