package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kp4 {
    public static final vf1 g = new vf1(new yj2((byte) 11), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:74:0x0151  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void g(j73 j73Var, final String str, final k85 k85Var, int i, long j, h02 h02Var, final int i2, final int i3) {
        j73 j73Var2;
        int i4;
        int i5;
        long j2;
        int i6;
        boolean z;
        final j73 j73Var3;
        final long j3;
        final int i7;
        u34 u34VarP;
        j73 j73Var4;
        Object objK;
        l76 l76Var;
        ob3 ob3Var;
        Object objK2;
        ob3 ob3Var2;
        Object objK3;
        Object objK4;
        k85Var.getClass();
        h02Var.Z(-1375102131);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            j73Var2 = j73Var;
        } else {
            j73Var2 = j73Var;
            i4 = i2 | (h02Var.x(j73Var2) ? 4 : 2);
        }
        int i9 = i4 | (h02Var.x(str) ? 32 : 16) | (h02Var.x(k85Var) ? 256 : 128);
        if ((i3 & 8) == 0) {
            i5 = i;
            int i10 = h02Var.n(i5) ? 2048 : 1024;
            int i11 = i9 | i10;
            if ((i3 & 16) == 0) {
                j2 = j;
                int i12 = h02Var.v(j2) ? 16384 : 8192;
                i6 = i11 | i12;
                if ((i6 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i6 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0 || h02Var.k()) {
                        if (i8 != 0) {
                            j73Var4 = g73.g;
                        } else {
                            j73Var4 = j73Var2;
                        }
                        if ((i3 & 8) != 0) {
                            i6 &= -7169;
                            i5 = 3;
                        }
                        if ((i3 & 16) != 0) {
                            j2 = ((jj0) h02Var.a(mt0.g)).g;
                            i6 &= -57345;
                        }
                    } else {
                        h02Var.Q();
                        if ((i3 & 8) != 0) {
                            i6 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i6 &= -57345;
                        }
                        j73Var4 = j73Var2;
                    }
                    int i13 = i5;
                    h02Var.s();
                    objK = h02Var.K();
                    l76Var = oo0.g;
                    if (objK == l76Var) {
                        objK = kq2.M(k85Var);
                        h02Var.i0(objK);
                    }
                    ob3Var = (ob3) objK;
                    objK2 = h02Var.K();
                    if (objK2 == l76Var) {
                        objK2 = kq2.M(Boolean.FALSE);
                        h02Var.i0(objK2);
                    }
                    ob3Var2 = (ob3) objK2;
                    objK3 = h02Var.K();
                    if (objK3 == l76Var) {
                        objK3 = new ff(ob3Var2, (byte) 20);
                        h02Var.i0(objK3);
                    }
                    j73 j73VarI = a11.i(j73Var4, (xy1) objK3);
                    k85 k85Var2 = (k85) ob3Var.getValue();
                    g35 g35Var = new g35(i13);
                    objK4 = h02Var.K();
                    if (objK4 == l76Var) {
                        objK4 = new kn2(ob3Var, ob3Var2, (byte) 16);
                        h02Var.i0(objK4);
                    }
                    long j4 = j2;
                    g75.y(str, j73VarI, j4, 0L, null, null, 0L, g35Var, 0L, 0, false, 0, 0, (xy1) objK4, k85Var2, h02Var, ((i6 >> 3) & 14) | ((i6 >> 6) & 896), ((i6 >> 9) & 14) | 1575936, 56312);
                    j3 = j4;
                    j73Var3 = j73Var4;
                    i7 = i13;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    j3 = j2;
                    i7 = i5;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1(str, k85Var, i7, j3, i2, i3) { // from class: ip4
                        public final /* synthetic */ k85 a;
                        public final /* synthetic */ int m;
                        public final /* synthetic */ long q;
                        public final /* synthetic */ String t;
                        public final /* synthetic */ byte w;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.w = i3;
                        }

                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iJ = aq2.J(1);
                            kp4.g(this.j, this.t, this.a, this.m, this.q, (h02) obj, iJ, this.w);
                            return og5.g;
                        }
                    };
                }
            }
            j2 = j;
            i6 = i11 | i12;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i6 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 8) != 0) {
                        i6 &= -7169;
                        i5 = 3;
                    }
                    if ((i3 & 16) != 0) {
                        j2 = ((jj0) h02Var.a(mt0.g)).g;
                        i6 &= -57345;
                    }
                } else {
                    if (i8 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 8) != 0) {
                        i6 &= -7169;
                        i5 = 3;
                    }
                    if ((i3 & 16) != 0) {
                        j2 = ((jj0) h02Var.a(mt0.g)).g;
                        i6 &= -57345;
                    }
                }
                int i14 = i5;
                h02Var.s();
                objK = h02Var.K();
                l76Var = oo0.g;
                if (objK == l76Var) {
                    objK = kq2.M(k85Var);
                    h02Var.i0(objK);
                }
                ob3Var = (ob3) objK;
                objK2 = h02Var.K();
                if (objK2 == l76Var) {
                    objK2 = kq2.M(Boolean.FALSE);
                    h02Var.i0(objK2);
                }
                ob3Var2 = (ob3) objK2;
                objK3 = h02Var.K();
                if (objK3 == l76Var) {
                    objK3 = new ff(ob3Var2, (byte) 20);
                    h02Var.i0(objK3);
                }
                j73 j73VarI2 = a11.i(j73Var4, (xy1) objK3);
                k85 k85Var3 = (k85) ob3Var.getValue();
                g35 g35Var2 = new g35(i14);
                objK4 = h02Var.K();
                if (objK4 == l76Var) {
                    objK4 = new kn2(ob3Var, ob3Var2, (byte) 16);
                    h02Var.i0(objK4);
                }
                long j5 = j2;
                g75.y(str, j73VarI2, j5, 0L, null, null, 0L, g35Var2, 0L, 0, false, 0, 0, (xy1) objK4, k85Var3, h02Var, ((i6 >> 3) & 14) | ((i6 >> 6) & 896), ((i6 >> 9) & 14) | 1575936, 56312);
                j3 = j5;
                j73Var3 = j73Var4;
                i7 = i14;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                j3 = j2;
                i7 = i5;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1(str, k85Var, i7, j3, i2, i3) { // from class: ip4
                    public final /* synthetic */ k85 a;
                    public final /* synthetic */ int m;
                    public final /* synthetic */ long q;
                    public final /* synthetic */ String t;
                    public final /* synthetic */ byte w;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.w = i3;
                    }

                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(1);
                        kp4.g(this.j, this.t, this.a, this.m, this.q, (h02) obj, iJ, this.w);
                        return og5.g;
                    }
                };
            }
        }
        i5 = i;
        int i15 = i9 | i10;
        if ((i3 & 16) == 0) {
            j2 = j;
            if (h02Var.v(j2)) {
            }
            i6 = i15 | i12;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i6 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 8) != 0) {
                        i6 &= -7169;
                        i5 = 3;
                    }
                    if ((i3 & 16) != 0) {
                        j2 = ((jj0) h02Var.a(mt0.g)).g;
                        i6 &= -57345;
                    }
                } else {
                    if (i8 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 8) != 0) {
                        i6 &= -7169;
                        i5 = 3;
                    }
                    if ((i3 & 16) != 0) {
                        j2 = ((jj0) h02Var.a(mt0.g)).g;
                        i6 &= -57345;
                    }
                }
                int i16 = i5;
                h02Var.s();
                objK = h02Var.K();
                l76Var = oo0.g;
                if (objK == l76Var) {
                    objK = kq2.M(k85Var);
                    h02Var.i0(objK);
                }
                ob3Var = (ob3) objK;
                objK2 = h02Var.K();
                if (objK2 == l76Var) {
                    objK2 = kq2.M(Boolean.FALSE);
                    h02Var.i0(objK2);
                }
                ob3Var2 = (ob3) objK2;
                objK3 = h02Var.K();
                if (objK3 == l76Var) {
                    objK3 = new ff(ob3Var2, (byte) 20);
                    h02Var.i0(objK3);
                }
                j73 j73VarI3 = a11.i(j73Var4, (xy1) objK3);
                k85 k85Var4 = (k85) ob3Var.getValue();
                g35 g35Var3 = new g35(i16);
                objK4 = h02Var.K();
                if (objK4 == l76Var) {
                    objK4 = new kn2(ob3Var, ob3Var2, (byte) 16);
                    h02Var.i0(objK4);
                }
                long j6 = j2;
                g75.y(str, j73VarI3, j6, 0L, null, null, 0L, g35Var3, 0L, 0, false, 0, 0, (xy1) objK4, k85Var4, h02Var, ((i6 >> 3) & 14) | ((i6 >> 6) & 896), ((i6 >> 9) & 14) | 1575936, 56312);
                j3 = j6;
                j73Var3 = j73Var4;
                i7 = i16;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                j3 = j2;
                i7 = i5;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1(str, k85Var, i7, j3, i2, i3) { // from class: ip4
                    public final /* synthetic */ k85 a;
                    public final /* synthetic */ int m;
                    public final /* synthetic */ long q;
                    public final /* synthetic */ String t;
                    public final /* synthetic */ byte w;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.w = i3;
                    }

                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(1);
                        kp4.g(this.j, this.t, this.a, this.m, this.q, (h02) obj, iJ, this.w);
                        return og5.g;
                    }
                };
            }
        }
        j2 = j;
        i6 = i15 | i12;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i6 & 1, z)) {
            h02Var.S();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i3 & 8) != 0) {
                    i6 &= -7169;
                    i5 = 3;
                }
                if ((i3 & 16) != 0) {
                    j2 = ((jj0) h02Var.a(mt0.g)).g;
                    i6 &= -57345;
                }
            } else {
                if (i8 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i3 & 8) != 0) {
                    i6 &= -7169;
                    i5 = 3;
                }
                if ((i3 & 16) != 0) {
                    j2 = ((jj0) h02Var.a(mt0.g)).g;
                    i6 &= -57345;
                }
            }
            int i17 = i5;
            h02Var.s();
            objK = h02Var.K();
            l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(k85Var);
                h02Var.i0(objK);
            }
            ob3Var = (ob3) objK;
            objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK2);
            }
            ob3Var2 = (ob3) objK2;
            objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = new ff(ob3Var2, (byte) 20);
                h02Var.i0(objK3);
            }
            j73 j73VarI4 = a11.i(j73Var4, (xy1) objK3);
            k85 k85Var5 = (k85) ob3Var.getValue();
            g35 g35Var4 = new g35(i17);
            objK4 = h02Var.K();
            if (objK4 == l76Var) {
                objK4 = new kn2(ob3Var, ob3Var2, (byte) 16);
                h02Var.i0(objK4);
            }
            long j7 = j2;
            g75.y(str, j73VarI4, j7, 0L, null, null, 0L, g35Var4, 0L, 0, false, 0, 0, (xy1) objK4, k85Var5, h02Var, ((i6 >> 3) & 14) | ((i6 >> 6) & 896), ((i6 >> 9) & 14) | 1575936, 56312);
            j3 = j7;
            j73Var3 = j73Var4;
            i7 = i17;
        } else {
            h02Var.Q();
            j73Var3 = j73Var2;
            j3 = j2;
            i7 = i5;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(str, k85Var, i7, j3, i2, i3) { // from class: ip4
                public final /* synthetic */ k85 a;
                public final /* synthetic */ int m;
                public final /* synthetic */ long q;
                public final /* synthetic */ String t;
                public final /* synthetic */ byte w;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.w = i3;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1);
                    kp4.g(this.j, this.t, this.a, this.m, this.q, (h02) obj, iJ, this.w);
                    return og5.g;
                }
            };
        }
    }

    public static final void n(hp2[] hp2VarArr, int[] iArr, xy1 xy1Var, h02 h02Var, int i) {
        Object obj;
        iArr.getClass();
        xy1Var.getClass();
        h02Var.Z(-1685717275);
        int i2 = i | (h02Var.j(hp2VarArr) ? 4 : 2) | (h02Var.j(iArr) ? 32 : 16) | (h02Var.j(xy1Var) ? 256 : 128);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zX = h02Var.x(iArr) | h02Var.x(hp2VarArr);
            Object objK = h02Var.K();
            Object obj2 = oo0.g;
            if (zX || objK == obj2) {
                ArrayList arrayList = new ArrayList();
                int length = iArr.length;
                int length2 = hp2VarArr.length;
                int i3 = 0;
                loop0: while (true) {
                    if (i3 >= length2) {
                        obj = (zf5[]) arrayList.toArray(new zf5[0]);
                        break;
                    }
                    for (zf5[] zf5VarArr : hp2VarArr[i3].y) {
                        for (zf5 zf5Var : zf5VarArr) {
                            int i4 = length;
                            if (pr.I(iArr, zf5Var.l)) {
                                arrayList.add(zf5Var);
                                length = i4 - 1;
                                if (length == 0) {
                                    obj = (zf5[]) arrayList.toArray(new zf5[0]);
                                    break loop0;
                                }
                            } else {
                                length = i4;
                            }
                        }
                    }
                    i3++;
                }
                objK = obj;
                h02Var.i0(objK);
            }
            zf5[] zf5VarArr2 = (zf5[]) objK;
            boolean zX2 = h02Var.x(zf5VarArr2);
            Object objK2 = h02Var.K();
            Object obj3 = objK2;
            if (zX2 || objK2 == obj2) {
                Object[] objArrCopyOf = Arrays.copyOf(zf5VarArr2, zf5VarArr2.length);
                st4 st4Var = new st4();
                st4Var.addAll(pr.j0(objArrCopyOf));
                h02Var.i0(st4Var);
                obj3 = st4Var;
            }
            st4 st4Var2 = (st4) obj3;
            og0.y(g.g(nf6.n(st4Var2)), ue5.m0(149611045, new mm4(hp2VarArr, st4Var2, xy1Var, (byte) 1), h02Var), h02Var, 56);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mm4(hp2VarArr, iArr, xy1Var, i, (byte) 2);
        }
    }

    public static final void r(hp2[] hp2VarArr, xy1 xy1Var, h02 h02Var, int i) {
        byte b;
        sx1 sx1Var;
        hp2[] hp2VarArr2 = hp2VarArr;
        h02 h02Var2 = h02Var;
        on0 on0Var = tg1.m;
        on0 on0Var2 = tg1.c;
        on0 on0Var3 = tg1.q;
        on0 on0Var4 = tg1.w;
        xy1Var.getClass();
        h02Var2.Z(-228690515);
        char c = 2;
        int i2 = i | (h02Var2.j(hp2VarArr2) ? 4 : 2) | (h02Var2.j(xy1Var) ? 32 : 16);
        if (h02Var2.N(i2 & 1, (i2 & 19) != 18)) {
            ob3 ob3VarQ = kq2.Q(xy1Var, h02Var);
            float f = 4.0f;
            j73 j73VarE0 = ue5.e0(gp4.P(mq4.r, gp4.O(h02Var2), true), 4.0f);
            char c2 = 6;
            ek0 ek0VarG = ck0.g(new yq(8.0f, true, new l0((byte) 2)), hi0.h, h02Var2, 6);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarE0);
            jo0.n.getClass();
            h02Var2.b0();
            boolean z = h02Var2.S;
            ob3 ob3Var = ob3VarQ;
            sx1 sx1Var2 = um2.Z;
            if (z) {
                h02Var2.m(sx1Var2);
            } else {
                h02Var2.l0();
            }
            xs2.E(on0Var4, h02Var2, ek0VarG);
            xs2.E(on0Var3, h02Var2, tr3VarQ);
            xs2.E(on0Var2, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(on0Var, h02Var2, j73VarW);
            h02Var2.X(-1529058493);
            int length = hp2VarArr2.length;
            int i3 = 0;
            while (i3 < length) {
                hp2 hp2Var = hp2VarArr2[i3];
                String strI = xs2.I(hp2Var.g, h02Var2);
                k85 k85Var = ((mf5) h02Var2.a(of5.g)).t;
                g73 g73Var = g73.g;
                float f2 = f;
                int i4 = length;
                int i5 = i3;
                on0 on0Var5 = on0Var;
                on0 on0Var6 = on0Var3;
                on0 on0Var7 = on0Var2;
                on0 on0Var8 = on0Var4;
                ob3 ob3Var2 = ob3Var;
                g73 g73Var2 = g73Var;
                sx1 sx1Var3 = sx1Var2;
                g75.y(strI, ue5.i0(g73Var, f, 0.0f, 0.0f, f, 6), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, k85Var, h02Var, 0, 0, 131068);
                h02Var2 = h02Var;
                h02Var2.X(-1529050257);
                zf5[][] zf5VarArr = hp2Var.y;
                int length2 = zf5VarArr.length;
                int i6 = 0;
                while (i6 < length2) {
                    zf5[] zf5VarArr2 = zf5VarArr[i6];
                    j73 j73VarI = mq4.i(g73Var2, null, 3);
                    kb4 kb4VarG = jb4.g(new yq(1.0f, true, new l0((byte) 2)), hi0.p, h02Var2, 6);
                    int iHashCode2 = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, j73VarI);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        sx1Var = sx1Var3;
                        h02Var2.m(sx1Var);
                    } else {
                        sx1Var = sx1Var3;
                        h02Var2.l0();
                    }
                    on0 on0Var9 = on0Var8;
                    xs2.E(on0Var9, h02Var2, kb4VarG);
                    on0 on0Var10 = on0Var6;
                    xs2.E(on0Var10, h02Var2, tr3VarQ2);
                    on0 on0Var11 = on0Var7;
                    xs2.E(on0Var11, h02Var2, Integer.valueOf(iHashCode2));
                    xs2.D(h02Var2);
                    on0 on0Var12 = on0Var5;
                    xs2.E(on0Var12, h02Var2, j73VarW2);
                    h02Var2.X(-2092538263);
                    int length3 = zf5VarArr2.length;
                    int i7 = 0;
                    while (i7 < length3) {
                        int i8 = length3;
                        zf5 zf5Var = zf5VarArr2[i7];
                        boolean zContains = ((x0) h02Var2.a(g)).contains(zf5Var);
                        float f3 = zf5Var.v;
                        zf5[][] zf5VarArr3 = zf5VarArr;
                        g73 g73Var3 = g73Var2;
                        if (f3 <= 0.0d) {
                            kc2.g("invalid weight; must be greater than zero");
                        }
                        on0 on0Var13 = on0Var12;
                        if (f3 > Float.MAX_VALUE) {
                            f3 = Float.MAX_VALUE;
                        }
                        tp2 tp2Var = new tp2(f3, true);
                        ob3 ob3Var3 = ob3Var2;
                        boolean zX = h02Var2.x(ob3Var3) | h02Var2.j(zf5Var);
                        Object objK = h02Var2.K();
                        if (zX || objK == oo0.g) {
                            objK = new o82(zf5Var, ob3Var3, (byte) 15);
                            h02Var2.i0(objK);
                        }
                        y(zf5Var, zContains, tp2Var, (my1) objK, h02Var2, 0);
                        i7++;
                        ob3Var2 = ob3Var3;
                        length3 = i8;
                        zf5VarArr = zf5VarArr3;
                        on0Var12 = on0Var13;
                        on0Var10 = on0Var10;
                        g73Var2 = g73Var3;
                        on0Var11 = on0Var11;
                    }
                    on0Var6 = on0Var10;
                    on0Var5 = on0Var12;
                    on0Var7 = on0Var11;
                    h02Var2.b(false);
                    h02Var2.b(true);
                    i6++;
                    sx1Var3 = sx1Var;
                    on0Var8 = on0Var9;
                    zf5VarArr = zf5VarArr;
                    g73Var2 = g73Var2;
                }
                h02Var2.b(false);
                i3 = i5 + 1;
                ob3Var = ob3Var2;
                sx1Var2 = sx1Var3;
                on0Var4 = on0Var8;
                f = f2;
                length = i4;
                on0Var = on0Var5;
                on0Var3 = on0Var6;
                on0Var2 = on0Var7;
                c = 2;
                c2 = 6;
                hp2VarArr2 = hp2VarArr;
            }
            b = 0;
            h02Var2.b(false);
            h02Var2.b(true);
        } else {
            b = 0;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new jp4(b, i, hp2VarArr, xy1Var);
        }
    }

    public static final void y(zf5 zf5Var, boolean z, j73 j73Var, my1 my1Var, h02 h02Var, int i) {
        long j;
        long j2;
        h02Var.Z(-1616100617);
        int i2 = i | (h02Var.x(zf5Var) ? 4 : 2) | (h02Var.l(z) ? 32 : 16) | (h02Var.x(j73Var) ? 256 : 128) | (h02Var.j(my1Var) ? 2048 : 1024);
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                h02Var.X(1330093456);
                j = jr2.u(h02Var).x;
                h02Var.b(false);
            } else {
                h02Var.X(1330176691);
                int iOrdinal = zf5Var.j.ordinal();
                if (iOrdinal == 0) {
                    h02Var.X(1705479754);
                    j = jr2.u(h02Var).I;
                    h02Var.b(false);
                } else if (iOrdinal != 1) {
                    h02Var.X(1705476911);
                    h02Var.b(false);
                    up.y();
                    return;
                } else {
                    h02Var.X(1705482663);
                    j = jr2.u(h02Var).F;
                    h02Var.b(false);
                }
                h02Var.b(false);
            }
            bw4 bw4VarG = aq4.g(j, null, "ContainerColor", h02Var, 384, 10);
            if (z) {
                h02Var.X(1330503214);
                j2 = jr2.u(h02Var).l;
                h02Var.b(false);
            } else {
                h02Var.X(1330569833);
                j2 = jr2.u(h02Var).u;
                h02Var.b(false);
            }
            bw4 bw4VarG2 = aq4.g(j2, null, "ContentColor", h02Var, 384, 10);
            j73 j73VarY = mq4.y(j73Var, 0.0f, 64.0f, 1);
            ma4 ma4VarY = na4.y(4.0f);
            bo3 bo3Var = b80.g;
            long j3 = ((jj0) bw4VarG.getValue()).g;
            long j4 = ((jj0) bw4VarG2.getValue()).g;
            long j5 = jj0.j;
            rj0 rj0Var = (rj0) h02Var.a(tj0.g);
            a80 a80Var = rj0Var.X;
            if (a80Var == null) {
                a80Var = new a80(tj0.n(rj0Var, bb6.g), tj0.n(rj0Var, bb6.x), jj0.y(bb6.r, tj0.n(rj0Var, bb6.y)), jj0.y(bb6.v, tj0.n(rj0Var, bb6.n)));
                rj0Var.X = a80Var;
            }
            c93.t(my1Var, j73VarY, false, ma4VarY, a80Var.g(j3, j4, j5, j5), null, new bo3(4.0f, 4.0f, 4.0f, 4.0f), ue5.m0(-863071671, new tn(zf5Var, (byte) 15), h02Var), h02Var, ((i2 >> 9) & 14) | 817889280);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new yw(zf5Var, z, j73Var, my1Var, i, (byte) 6);
        }
    }
}
