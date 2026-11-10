package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class vb2 implements kd1 {
    public tb2 a;
    public final c6 b;
    public s25 c;
    public de0 i;
    public final cd1 j;
    public sb2 m;
    public rb2 q;
    public final c6 s;
    public qb2 t;
    public lh6 w;

    public vb2(cd1 cd1Var) {
        this.j = cd1Var;
        c6 c6Var = new c6();
        c6Var.y = new xa3();
        this.b = c6Var;
        c6 c6Var2 = new c6();
        c6Var2.y = new la3();
        this.s = c6Var2;
    }

    public static void r(vb2 vb2Var, ob2 ob2Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        cd1 cd1Var = vb2Var.j;
        sb2 sb2Var = vb2Var.m;
        if (sb2Var == null) {
            sb2Var = new sb2();
            sb2Var.g = null;
            sb2Var.y = Long.MAX_VALUE;
            sb2Var.r = false;
            vb2Var.m = sb2Var;
        }
        sb2Var.g = ob2Var;
        sb2Var.y = j;
        de0 de0Var = vb2Var.i;
        um3 um3Var = cd1Var.k;
        if (de0Var == null) {
            vb2Var.i = new de0(um3Var);
        } else {
            de0Var.a = um3Var;
            de0Var.t = j2;
        }
        sb2Var.r = false;
        vb2Var.w = sb2Var;
    }

    public final void g() {
        qb2 qb2Var = this.t;
        pb2 pb2Var = pb2.a;
        if (qb2Var == null) {
            qb2Var = new qb2();
            qb2Var.g = pb2Var;
            qb2Var.y = false;
            qb2Var.r = false;
            this.t = qb2Var;
        }
        qb2Var.g = pb2Var;
        qb2Var.y = false;
        qb2Var.r = false;
        this.w = qb2Var;
    }

    public final void j(ob2 ob2Var, ob2 ob2Var2, nb2 nb2Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.c == null) {
            this.c = new s25((byte) 4);
        }
        s25 s25VarV = v();
        cd1 cd1Var = this.j;
        um3 um3Var = cd1Var.k;
        c6 c6Var = this.b;
        xa3 xa3Var = (xa3) c6Var.y;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ob2Var.r >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (ob2Var.r & 4294967295L));
        if (ai6.y(ob2Var)) {
            c6Var.g = 0;
            xa3Var.n();
        }
        if (ai6.r(ob2Var) || ai6.y(ob2Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (xa3Var.y == 3) {
                int i = c6Var.g;
                c6Var.g = i + 1;
                xa3Var.i(i, ob2Var);
            } else {
                xa3Var.g(ob2Var);
            }
            if (c6Var.g == 3) {
                c6Var.g = 0;
            }
            Object[] objArr = xa3Var.g;
            int i2 = xa3Var.y;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((ob2) objArr[i3]).r >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = xa3Var.y;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = xa3Var.g;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((ob2) objArr2[i5]).r & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / xa3Var.y;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (um3Var != null) {
            int i6 = nb2Var.g;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = um3Var == um3.t ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        ((lz2) s25VarV.j).g(ob2Var.y, jFloatToRawIntBits);
        long jN = wi3.n(ai6.x(ob2Var2, cd1Var.k, nb2Var), j);
        if (((Boolean) cd1Var.d.a(new bv3(1))).booleanValue()) {
            cd1Var.Y0(new mc1(jN));
        }
        c6 c6Var2 = this.s;
        c6Var2.g = 0;
        ((la3) c6Var2.y).y = 0;
    }

    public final void l(ob2 ob2Var, nb2 nb2Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = ob2Var.r;
        cd1 cd1Var = this.j;
        um3 um3Var = cd1Var.k;
        um3Var.getClass();
        md1 md1Var = nd1.g;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (um3Var == um3.j ? j & 4294967295L : j >> 32))) > 2.0f) {
            s25 s25VarV = v();
            um3 um3Var2 = cd1Var.k;
            c6 c6Var = this.b;
            xa3 xa3Var = (xa3) c6Var.y;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (ai6.y(ob2Var)) {
                c6Var.g = 0;
                xa3Var.n();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (ai6.r(ob2Var) || ai6.y(ob2Var)) {
                j2 = 4294967295L;
            } else {
                if (xa3Var.y == 3) {
                    int i = c6Var.g;
                    c6Var.g = i + 1;
                    xa3Var.i(i, ob2Var);
                } else {
                    xa3Var.g(ob2Var);
                }
                if (c6Var.g == 3) {
                    c6Var.g = 0;
                }
                Object[] objArr = xa3Var.g;
                int i2 = xa3Var.y;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((ob2) objArr[i3]).r >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = xa3Var.y;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = xa3Var.g;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((ob2) objArr2[i5]).r & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / xa3Var.y;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (um3Var2 != null) {
                int i6 = nb2Var.g;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = um3Var2 == um3.t ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            ((lz2) s25VarV.j).g(ob2Var.y, jFloatToRawIntBits);
            c6 c6Var2 = this.s;
            la3 la3Var = (la3) c6Var2.y;
            int i7 = la3Var.y;
            if (i7 == 3) {
                int i8 = c6Var2.g;
                c6Var2.g = i8 + 1;
                if (i8 < 0 || i8 >= i7) {
                    l0.p("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = la3Var.g;
                    long j5 = jArr[i8];
                    jArr[i8] = j;
                }
            } else {
                la3Var.g(j);
            }
            if (c6Var2.g == 3) {
                c6Var2.g = 0;
            }
            long[] jArr2 = la3Var.g;
            int i9 = la3Var.y;
            float fIntBitsToFloat7 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i10] >> 32));
            }
            int i11 = la3Var.y;
            float f = fIntBitsToFloat7 / i11;
            long[] jArr3 = la3Var.g;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i12] & j2)) + fIntBitsToFloat4;
            }
            cd1Var.Y0(new lc1((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / la3Var.y)) & j2), true));
        }
    }

    @Override // defpackage.kd1
    public final um3 m() {
        return this.j.k;
    }

    public final void n(ld1 ld1Var, ku3 ku3Var) {
        Object obj;
        Object obj2;
        char c;
        long j;
        float f;
        float fIntBitsToFloat;
        boolean z;
        ku3 ku3Var2;
        Object obj3;
        Object obj4;
        Object obj5;
        qb2 qb2Var;
        int i = ld1Var.y;
        ArrayList arrayList = (ArrayList) ld1Var.r;
        lh6 lh6Var = this.w;
        Object obj6 = lh6Var;
        if (lh6Var == null) {
            qb2 qb2Var2 = this.t;
            if (qb2Var2 == null) {
                qb2Var = qb2Var2;
                qb2 qb2Var3 = new qb2();
                qb2Var3.g = pb2.a;
                qb2Var3.y = false;
                qb2Var3.r = false;
                this.t = qb2Var3;
                qb2Var = qb2Var3;
            }
            qb2Var = qb2Var2;
            this.w = qb2Var;
            obj6 = qb2Var;
        }
        boolean z2 = obj6 instanceof qb2;
        ku3 ku3Var3 = ku3.j;
        ku3 ku3Var4 = ku3.t;
        cd1 cd1Var = this.j;
        if (z2) {
            qb2 qb2Var4 = (qb2) obj6;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!ai6.y((ob2) arrayList.get(i2))) {
                    return;
                }
            }
            ob2 ob2Var = (ob2) cj0.j0(arrayList);
            int i3 = ub2.g[qb2Var4.g.ordinal()];
            pb2 pb2Var = pb2.t;
            pb2 pb2Var2 = pb2.j;
            pb2 pb2Var3 = i3 == 1 ? !cd1Var.i1() ? pb2Var2 : pb2Var : qb2Var4.g;
            qb2Var4.g = pb2Var3;
            if (ku3Var == ku3Var3) {
                if (pb2Var3 == pb2Var) {
                    ob2Var.t = true;
                    qb2Var4.y = true;
                }
                qb2Var4.r = true;
            }
            if (ku3Var == ku3Var4) {
                if (pb2Var3 == pb2Var2) {
                    r(this, ob2Var, ob2Var.g, 0L, 12);
                    return;
                }
                if (qb2Var4.y) {
                    j(ob2Var, ob2Var, new nb2(i), 0L);
                    l(ob2Var, new nb2(i), 0L);
                    long j2 = ob2Var.g;
                    tb2 tb2Var = this.a;
                    if (tb2Var == null) {
                        tb2Var = new tb2();
                        tb2Var.g = Long.MAX_VALUE;
                        this.a = tb2Var;
                    }
                    tb2Var.g = j2;
                    this.w = tb2Var;
                    return;
                }
                return;
            }
            return;
        }
        boolean z3 = obj6 instanceof sb2;
        ku3 ku3Var5 = ku3.a;
        if (z3) {
            sb2 sb2Var = (sb2) obj6;
            if (ku3Var == ku3Var3) {
                return;
            }
            int size2 = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    ku3Var2 = ku3Var5;
                    obj3 = null;
                    break;
                }
                obj3 = arrayList.get(i4);
                ku3Var2 = ku3Var5;
                if (zq2.a(((ob2) obj3).g, sb2Var.y)) {
                    break;
                }
                i4++;
                ku3Var5 = ku3Var2;
            }
            ob2 ob2Var2 = (ob2) obj3;
            if (ob2Var2 == null) {
                int size3 = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        obj5 = null;
                        break;
                    }
                    obj5 = arrayList.get(i5);
                    if (((ob2) obj5).n) {
                        break;
                    } else {
                        i5++;
                    }
                }
                ob2Var2 = (ob2) obj5;
                if (ob2Var2 == null) {
                    g();
                    return;
                }
                sb2Var.y = ob2Var2.g;
            }
            ob2 ob2Var3 = ob2Var2;
            if (ku3Var == ku3Var4) {
                if (ob2Var3.t) {
                    ob2 ob2Var4 = sb2Var.g;
                    if (ob2Var4 == null) {
                        l0.u("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j3 = sb2Var.y;
                    de0 de0Var = this.i;
                    if (de0Var == null) {
                        l0.u("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    y(ob2Var4, j3, de0Var);
                } else if (ai6.r(ob2Var3)) {
                    int size4 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            obj4 = null;
                            break;
                        }
                        obj4 = arrayList.get(i6);
                        if (((ob2) obj4).n) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    ob2 ob2Var5 = (ob2) obj4;
                    if (ob2Var5 == null) {
                        g();
                    } else {
                        sb2Var.y = ob2Var5.g;
                    }
                } else {
                    bl5 bl5Var = (bl5) v70.b(cd1Var, hp0.z);
                    float f2 = wc1.g;
                    float fN = bl5Var.n();
                    de0 de0Var2 = this.i;
                    if (de0Var2 == null) {
                        l0.u("Touch slop detector not initialized.");
                        return;
                    }
                    long jV = de0.v(de0Var2, ai6.v(ob2Var3, cd1Var.k, new nb2(i), true), fN);
                    if ((9223372034707292159L & jV) != 9205357640488583168L) {
                        ob2Var3.t = true;
                        ob2 ob2Var6 = sb2Var.g;
                        ob2Var6.getClass();
                        j(ob2Var6, ob2Var3, new nb2(i), jV);
                        l(ob2Var3, new nb2(i), jV);
                        long j4 = ob2Var3.g;
                        tb2 tb2Var2 = this.a;
                        if (tb2Var2 == null) {
                            tb2Var2 = new tb2();
                            tb2Var2.g = Long.MAX_VALUE;
                            this.a = tb2Var2;
                        }
                        tb2Var2.g = j4;
                        this.w = tb2Var2;
                    } else {
                        sb2Var.r = true;
                    }
                }
            }
            if (ku3Var == ku3Var2 && sb2Var.r) {
                if (!ob2Var3.t) {
                    sb2Var.r = false;
                    return;
                }
                ob2 ob2Var7 = sb2Var.g;
                if (ob2Var7 == null) {
                    l0.u("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j5 = sb2Var.y;
                de0 de0Var3 = this.i;
                if (de0Var3 != null) {
                    y(ob2Var7, j5, de0Var3);
                    return;
                } else {
                    l0.u("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
            }
            return;
        }
        if (obj6 instanceof rb2) {
            rb2 rb2Var = (rb2) obj6;
            if (ku3Var != ku3Var5) {
                return;
            }
            int size5 = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size5) {
                    z = true;
                    break;
                } else {
                    if (((ob2) arrayList.get(i7)).t) {
                        z = false;
                        break;
                    }
                    i7++;
                }
            }
            int size6 = arrayList.size();
            for (int i8 = 0; i8 < size6; i8++) {
                if (((ob2) arrayList.get(i8)).n) {
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    if (z) {
                        long jX = ai6.x((ob2) cj0.j0(arrayList), cd1Var.k, new nb2(i));
                        ob2 ob2Var8 = rb2Var.g;
                        ob2Var8.getClass();
                        long jN = wi3.n(jX, ai6.x(ob2Var8, cd1Var.k, new nb2(i)));
                        ob2 ob2Var9 = rb2Var.g;
                        if (ob2Var9 != null) {
                            r(this, ob2Var9, rb2Var.y, jN, 8);
                            return;
                        } else {
                            l0.u("AwaitGesturePickup.initialDown was not initialized.");
                            return;
                        }
                    }
                    return;
                }
            }
            g();
            return;
        }
        if (!(obj6 instanceof tb2)) {
            up.y();
            return;
        }
        tb2 tb2Var3 = (tb2) obj6;
        if (ku3Var != ku3Var4) {
            return;
        }
        long j6 = tb2Var3.g;
        int size7 = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size7) {
                obj = null;
                break;
            }
            obj = arrayList.get(i9);
            if (zq2.a(((ob2) obj).g, j6)) {
                break;
            } else {
                i9++;
            }
        }
        ob2 ob2Var10 = (ob2) obj;
        if (ob2Var10 == null) {
            return;
        }
        long j7 = ob2Var10.r;
        boolean zR = ai6.r(ob2Var10);
        kc1 kc1Var = kc1.g;
        if (!zR) {
            if (ob2Var10.t) {
                cd1Var.Y0(kc1Var);
                return;
            } else {
                if (wi3.r(ai6.v(ob2Var10, cd1Var.k, new nb2(i), true)) == 0.0f) {
                    return;
                }
                l(ob2Var10, new nb2(i), ai6.v(ob2Var10, cd1Var.k, new nb2(i), false));
                ob2Var10.t = true;
                return;
            }
        }
        int size8 = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size8) {
                obj2 = null;
                break;
            }
            Object obj7 = arrayList.get(i10);
            if (((ob2) obj7).n) {
                obj2 = obj7;
                break;
            }
            i10++;
        }
        ob2 ob2Var11 = (ob2) obj2;
        if (ob2Var11 != null) {
            tb2Var3.g = ob2Var11.g;
            return;
        }
        if (ob2Var10.t || !ai6.r(ob2Var10)) {
            cd1Var.Y0(kc1Var);
        } else {
            s25 s25VarV = v();
            um3 um3Var = cd1Var.k;
            c6 c6Var = this.b;
            xa3 xa3Var = (xa3) c6Var.y;
            char c2 = ' ';
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
            long j8 = 4294967295L;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
            if (ai6.y(ob2Var10)) {
                c6Var.g = 0;
                xa3Var.n();
            }
            if (ai6.r(ob2Var10) || ai6.y(ob2Var10)) {
                c = ' ';
                j = 4294967295L;
                f = 0.0f;
            } else {
                if (xa3Var.y == 3) {
                    int i11 = c6Var.g;
                    c6Var.g = i11 + 1;
                    xa3Var.i(i11, ob2Var10);
                } else {
                    xa3Var.g(ob2Var10);
                }
                if (c6Var.g == 3) {
                    c6Var.g = 0;
                }
                Object[] objArr = xa3Var.g;
                int i12 = xa3Var.y;
                int i13 = 0;
                float fIntBitsToFloat4 = 0.0f;
                while (i13 < i12) {
                    char c3 = c2;
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (((ob2) objArr[i13]).r >> c3)) + fIntBitsToFloat4;
                    i13++;
                    c2 = c3;
                }
                c = c2;
                f = 0.0f;
                int i14 = xa3Var.y;
                fIntBitsToFloat2 = fIntBitsToFloat4 / i14;
                Object[] objArr2 = xa3Var.g;
                float fIntBitsToFloat5 = 0.0f;
                int i15 = 0;
                while (i15 < i14) {
                    long j9 = j8;
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((ob2) objArr2[i15]).r & j9));
                    i15++;
                    j8 = j9;
                }
                j = j8;
                fIntBitsToFloat3 = fIntBitsToFloat5 / xa3Var.y;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j);
            if (um3Var != null) {
                if (i == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                } else if (i == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                }
                jFloatToRawIntBits = um3Var == um3.t ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(f)) & j) : (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j);
            }
            ((lz2) s25VarV.j).g(ob2Var10.y, jFloatToRawIntBits);
            float fG = ((bl5) v70.b(cd1Var, hp0.z)).g();
            long jY = v().y(d06.g(fG, fG));
            v().x();
            cd1Var.Y0(new nc1(nd1.r(jY), true));
        }
        g();
    }

    public final s25 v() {
        s25 s25Var = this.c;
        if (s25Var != null) {
            return s25Var;
        }
        l0.u("Velocity Tracker not initialized.");
        return null;
    }

    public final void x() {
        g();
        cd1 cd1Var = this.j;
        if (cd1Var.D) {
            cd1Var.Y0(kc1.g);
        }
        this.c = null;
        c6 c6Var = this.s;
        c6Var.g = 0;
        ((la3) c6Var.y).y = 0;
    }

    @Override // defpackage.h12
    public final String x0() {
        lh6 lh6Var = this.w;
        if (lh6Var instanceof qb2) {
            return ((qb2) lh6Var).r ? "waiting" : "idle";
        }
        if ((lh6Var instanceof sb2) || (lh6Var instanceof rb2)) {
            return "waiting";
        }
        return lh6Var instanceof tb2 ? "recognized" : "idle";
    }

    public final void y(ob2 ob2Var, long j, de0 de0Var) {
        rb2 rb2Var = this.q;
        if (rb2Var == null) {
            rb2Var = new rb2();
            rb2Var.g = null;
            rb2Var.y = Long.MAX_VALUE;
            this.q = rb2Var;
        }
        rb2Var.g = ob2Var;
        rb2Var.y = j;
        de0Var.t = 0L;
        this.w = rb2Var;
    }
}
