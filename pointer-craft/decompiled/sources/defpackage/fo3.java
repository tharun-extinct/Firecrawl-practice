package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fo3 {
    public int a;
    public final pr2 c;
    public final q64 g;
    public final ro i;
    public int j;
    public int l;
    public int m;
    public final fa3 n;
    public boolean q;
    public final ia3 r;
    public int t;
    public final ha3 v;
    public int w;
    public float x;
    public final ha3 y;

    public fo3(q64 q64Var, pr2 pr2Var, to3 to3Var) {
        this.g = q64Var;
        ha3 ha3Var = ie2.g;
        this.y = new ha3();
        this.r = new ia3();
        int i = de2.g;
        this.n = new fa3();
        this.v = new ha3();
        this.l = -1;
        this.j = Integer.MAX_VALUE;
        this.t = Integer.MIN_VALUE;
        this.c = pr2Var;
        this.i = new ro(to3Var);
    }

    public final int g(ro roVar, int i, boolean z) {
        List list;
        List list2;
        ha3 ha3Var = this.v;
        if (ha3Var.g(i)) {
            Object objY = ha3Var.y(i);
            objY.getClass();
            return ((ma0) objY).y;
        }
        ha3 ha3Var2 = this.y;
        int i2 = 0;
        if (ha3Var2.g(i)) {
            if (!z || (list2 = (List) ha3Var2.y(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((or2) list2.get(i2)).g();
                i2++;
            }
            return -1;
        }
        la0 la0Var = new la0(this, roVar, (byte) 1);
        long j = roVar.D().h;
        pr2 pr2Var = (pr2) roVar.m;
        if (pr2Var == null) {
            yf2.Y("state");
            throw null;
        }
        ha3Var2.t(i, pw5.k(pr2Var.g(i, j, true, new kn2(la0Var, roVar, (byte) 8))));
        if (!z || (list = (List) ha3Var2.y(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((or2) list.get(i2)).g();
            i2++;
        }
        return -1;
    }

    public final void l() {
        pw5.V("prefetchWindowStartExtraSpace", this.a);
        pw5.V("prefetchWindowEndExtraSpace", this.m);
        pw5.V("prefetchWindowStartIndex", this.j);
        pw5.V("prefetchWindowEndIndex", this.t);
    }

    public final void n(float f, mo3 mo3Var) {
        fo3 fo3Var;
        boolean z;
        int i;
        int i2;
        int i3;
        ro roVar = this.i;
        roVar.a = mo3Var;
        roVar.m = this.c;
        float f2 = -f;
        l();
        if (roVar.e()) {
            gc6.g(roVar.D());
            roVar.D();
            this.w = roVar.I();
            int iF = roVar.f();
            int iB = roVar.B();
            int I = roVar.I();
            int iF2 = roVar.F();
            int iE = roVar.E();
            ha3 ha3Var = this.v;
            if (f2 <= 0.0f) {
                this.a = 0 - iF2;
                this.j = iF;
                while (this.a > 0 && (i3 = this.j) > 0 && ha3Var.g(i3 - 1)) {
                    Object objY = ha3Var.y(this.j - 1);
                    objY.getClass();
                    int i4 = ((ma0) objY).y;
                    this.j--;
                    this.a -= i4;
                }
                v(0, this.j - 1);
            } else {
                this.m = 0 - iE;
                this.t = iB;
                while (this.m > 0 && (i2 = this.t) < I - 1 && ha3Var.g(i2 + 1)) {
                    Object objY2 = ha3Var.y(this.t + 1);
                    objY2.getClass();
                    int i5 = ((ma0) objY2).y;
                    this.t++;
                    this.m -= i5;
                }
                v(this.t + 1, I - 1);
            }
        }
        if (roVar.e()) {
            gc6.g(roVar.D());
            if (roVar.D().z != null) {
                i = ((xo3) this.g.t).i;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            fo3Var = this;
            fo3Var.r(roVar, roVar.f(), roVar.B(), i, roVar.E(), roVar.F(), f2, f2 <= 0.0f ? true : z);
        } else {
            fo3Var = this;
        }
        fo3Var.x = f2;
        fo3Var.l();
    }

    public final void r(ro roVar, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.x);
        if (!z) {
            if (!z2 || this.q) {
                this.a = i3 - i5;
                this.j = i;
            } else {
                int iZ = k33.Z(Math.abs(f)) + this.a;
                int i8 = i3 - i5;
                if (iZ > i8) {
                    iZ = i8;
                }
                this.a = iZ;
            }
            while (this.a > 0 && (i6 = this.j) > 0) {
                int iG = g(roVar, this.j - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (iG == -1) {
                    return;
                }
                this.j--;
                this.a -= iG;
            }
            return;
        }
        if (!z2 || this.q) {
            this.m = i3 - i4;
            this.t = i2;
        } else {
            int iZ2 = k33.Z(Math.abs(f)) + this.m;
            int i9 = i3 - i4;
            if (iZ2 > i9) {
                iZ2 = i9;
            }
            this.m = iZ2;
        }
        while (this.m > 0 && (i7 = this.t) != -1 && i7 < this.w - 1) {
            int iG2 = g(roVar, this.t + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (iG2 == -1) {
                return;
            }
            this.t++;
            this.m -= iG2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EDGE_INSN: B:102:0x00f5->B:59:0x00f5 BREAK  A[LOOP:4: B:45:0x00c1->B:58:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[LOOP:4: B:45:0x00c1->B:58:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0063 A[EDGE_INSN: B:88:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    public final void v(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int i3;
        char c3;
        int i4;
        ia3 ia3Var = this.r;
        ia3Var.y();
        ha3 ha3Var = this.y;
        int[] iArr2 = ha3Var.y;
        long[] jArr2 = ha3Var.g;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr2[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr2[(i5 << 3) + i7]) && i4 <= i2) {
                            ia3Var.g(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 != length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        fa3 fa3Var = this.n;
        int[] iArr3 = fa3Var.y;
        long[] jArr3 = fa3Var.g;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr3[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                ia3Var.g(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        ha3 ha3Var2 = this.v;
        int[] iArr4 = ha3Var2.y;
        long[] jArr4 = ha3Var2.g;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << c2) & j6 & j3) == j3) {
                    if (i12 != length3) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr4[(i12 << 3) + i14]) && i3 <= i2) {
                            ia3Var.g(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        int[] iArr5 = ia3Var.y;
        long[] jArr5 = ia3Var.g;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr5[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr5[(i15 << 3) + i17];
                        List list = (List) ha3Var.l(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((or2) list.get(i19)).cancel();
                            }
                        }
                        int iR = fa3Var.r(i18);
                        if (iR >= 0) {
                            fa3Var.v--;
                            long[] jArr6 = fa3Var.g;
                            int i20 = fa3Var.n;
                            int i21 = iR >> 3;
                            int i22 = (iR & 7) << 3;
                            long j8 = (jArr6[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr6[i21] = j8;
                            jArr6[(((iR - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        }
                        ha3Var2.l(i18);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    public final void x() {
        this.j = Integer.MAX_VALUE;
        this.t = Integer.MIN_VALUE;
        this.a = 0;
        this.m = 0;
        this.q = false;
        this.n.g();
        this.v.r();
        ha3 ha3Var = this.y;
        long[] jArr = ha3Var.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = ha3Var.y[i4];
                        List list = (List) ha3Var.r[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((or2) list.get(i6)).cancel();
                        }
                        ha3Var.j(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void y(ro roVar, int i, int i2) {
        int i3;
        int i4;
        ha3 ha3Var = this.v;
        ma0 ma0Var = (ma0) ha3Var.y(i);
        hi0 hi0Var = ma0.r;
        if (ma0Var != null) {
            ma0Var.y = i2;
            ma0Var.g = hi0Var;
        } else {
            ma0Var = new ma0();
            ma0Var.g = hi0Var;
            ma0Var.y = i2;
        }
        ha3Var.t(i, ma0Var);
        if (i > this.t) {
            this.t = i;
            this.m -= i2;
        } else if (i < this.j) {
            this.j = i;
            this.a -= i2;
        }
        if (Math.signum(this.x) <= 0.0f) {
            if (this.m > 0) {
                i3 = this.t + 1;
                i4 = i3;
            } else {
                i4 = -1;
            }
        } else if (Math.signum(this.x) <= 0.0f || this.a <= 0) {
            i4 = -1;
        } else {
            i3 = this.j - 1;
            i4 = i3;
        }
        if (i4 > 0 && i4 != -1 && i4 < this.w) {
            la0 la0Var = new la0(this, roVar, (byte) 0);
            long j = roVar.D().h;
            pr2 pr2Var = (pr2) roVar.m;
            if (pr2Var == null) {
                yf2.Y("state");
                throw null;
            }
            this.y.t(i4, pw5.k(pr2Var.g(i4, j, true, new kn2(la0Var, roVar, (byte) 8))));
        }
        l();
    }
}
