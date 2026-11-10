package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tt4 {
    public boolean a;
    public final xy1 g;
    public int m;
    public ta3 r;
    public Object y;
    public int n = -1;
    public final hb3 v = xq2.a();
    public final hb3 x = new hb3();
    public final ib3 l = new ib3();
    public final rb3 j = new rb3(new z51[16]);
    public final g02 t = new g02(this, (byte) 1);
    public final hb3 q = xq2.a();
    public final HashMap w = new HashMap();

    public tt4(xy1 xy1Var) {
        this.g = xy1Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean g(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt4.g(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
    public final void n(rn3 rn3Var) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        hb3 hb3Var = this.x;
        long[] jArr3 = hb3Var.g;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = hb3Var.y[i6];
                        j2 = j4;
                        ta3 ta3Var = (ta3) hb3Var.r[i6];
                        Boolean bool = (Boolean) rn3Var.a(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = ta3Var.y;
                            int[] iArr = ta3Var.r;
                            long[] jArr4 = ta3Var.g;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                r(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else if (i8 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                        }
                        if (bool.booleanValue()) {
                            hb3Var.w(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }

    public final void r(Object obj, Object obj2) {
        hb3 hb3Var = this.v;
        xq2.e(hb3Var, obj2, obj);
        if (!(obj2 instanceof z51) || hb3Var.r(obj2)) {
            return;
        }
        xq2.A(this.q, obj2);
        this.w.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void y(Object obj, int i, Object obj2, ta3 ta3Var) {
        int i2;
        if (this.m > 0) {
            return;
        }
        int iR = ta3Var.r(obj);
        if (iR < 0) {
            iR = ~iR;
            i2 = -1;
        } else {
            i2 = ta3Var.r[iR];
        }
        ta3Var.y[iR] = obj;
        ta3Var.r[iR] = i;
        if ((obj instanceof z51) && i2 != i) {
            y51 y51VarE = ((z51) obj).e();
            this.w.put(obj, y51VarE.x);
            ta3 ta3Var2 = y51VarE.v;
            hb3 hb3Var = this.q;
            xq2.A(hb3Var, obj);
            Object[] objArr = ta3Var2.y;
            long[] jArr = ta3Var2.g;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                ww4 ww4Var = (ww4) objArr[(i3 << 3) + i5];
                                if (ww4Var instanceof xw4) {
                                    ((xw4) ww4Var).k(2);
                                }
                                xq2.v(hb3Var, ww4Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof xw4) {
                ((xw4) obj).k(2);
            }
            xq2.v(this.v, obj, obj2);
        }
    }
}
