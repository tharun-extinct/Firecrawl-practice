package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t34 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ int t;

    public /* synthetic */ t34(byte b, int i, Object obj, Object obj2) {
        this.j = b;
        this.a = obj;
        this.t = i;
        this.m = obj2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        so0 so0Var;
        so0 so0Var2;
        int i;
        boolean z;
        byte b = this.j;
        int i2 = 0;
        Object obj2 = this.m;
        int i3 = this.t;
        Object obj3 = this.a;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                u34 u34Var = (u34) obj3;
                ta3 ta3Var = (ta3) obj2;
                so0 so0Var3 = (so0) obj;
                if (u34Var.v == i3 && yf2.p(ta3Var, u34Var.x) && (so0Var3 instanceof yo0)) {
                    long[] jArr = ta3Var.g;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8;
                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                int i7 = i2;
                                while (i7 < i6) {
                                    if ((255 & j) < 128) {
                                        int i8 = (i4 << 3) + i7;
                                        Object obj4 = ta3Var.y[i8];
                                        boolean z2 = ta3Var.r[i8] != i3;
                                        if (z2) {
                                            i = i5;
                                            yo0 yo0Var = (yo0) so0Var3;
                                            so0Var2 = so0Var3;
                                            hb3 hb3Var = yo0Var.c;
                                            xq2.e(hb3Var, obj4, u34Var);
                                            z = z2;
                                            if (obj4 instanceof z51) {
                                                z51 z51Var = (z51) obj4;
                                                if (!hb3Var.r(z51Var)) {
                                                    xq2.A(yo0Var.s, z51Var);
                                                }
                                                hb3 hb3Var2 = u34Var.l;
                                                if (hb3Var2 != null) {
                                                    hb3Var2.q(obj4);
                                                }
                                            }
                                        } else {
                                            so0Var2 = so0Var3;
                                            z = z2;
                                            i = i5;
                                        }
                                        if (z) {
                                            ta3Var.x(i8);
                                        }
                                    } else {
                                        so0Var2 = so0Var3;
                                        i = i5;
                                    }
                                    j >>= i;
                                    i7++;
                                    i5 = i;
                                    so0Var3 = so0Var2;
                                }
                                so0Var = so0Var3;
                                if (i6 != i5) {
                                    break;
                                }
                            } else {
                                so0Var = so0Var3;
                            }
                            if (i4 != length) {
                                i4++;
                                so0Var3 = so0Var;
                                i2 = 0;
                            }
                        }
                    }
                }
                break;
            default:
                nf4 nf4Var = (nf4) obj3;
                us3 us3Var = (us3) obj2;
                ts3 ts3Var = (ts3) obj;
                int iD = nf4Var.o.g.d();
                if (iD < 0) {
                    iD = 0;
                }
                if (iD <= i3) {
                    i3 = iD;
                }
                int i9 = -i3;
                boolean z3 = nf4Var.f;
                int i10 = z3 ? 0 : i9;
                if (!z3) {
                    i9 = 0;
                }
                ts3Var.j = true;
                ts3.q(ts3Var, us3Var, i10, i9);
                ts3Var.j = false;
                break;
        }
        return og5Var;
    }
}
