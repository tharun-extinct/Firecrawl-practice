package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qt0 extends i73 implements zo0, x33 {
    public boolean B;
    public boolean D;
    public s60 d;
    public final bg4 e;
    public final ng4 f;
    public boolean k;
    public um3 o;
    public final q64 A = new q64((byte) 10);
    public long C = -1;

    public qt0(um3 um3Var, ng4 ng4Var, boolean z, s60 s60Var, bg4 bg4Var) {
        this.o = um3Var;
        this.f = ng4Var;
        this.k = z;
        this.d = s60Var;
        this.e = bg4Var;
    }

    public static boolean S0(qt0 qt0Var, k44 k44Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = qt0Var.R0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jU0 = qt0Var.U0(k44Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jU0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jU0 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    public final float Q0(s60 s60Var, long j) {
        float f;
        k44 k44Var;
        int iCompare;
        long j2 = this.C;
        rb3 rb3Var = (rb3) this.A.t;
        int i = rb3Var.a - 1;
        Object[] objArr = rb3Var.j;
        if (i < objArr.length) {
            k44Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                k44 k44Var2 = (k44) ((ot0) objArr[i]).g.g();
                if (k44Var2 != null) {
                    long jR = k44Var2.r();
                    long jN = y94.N(R0());
                    f = 0.0f;
                    int iOrdinal = this.o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jR & 4294967295L)), Float.intBitsToFloat((int) (jN & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            uo1.g();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jR >> 32)), Float.intBitsToFloat((int) (jN >> 32)));
                    }
                    if (iCompare > 0) {
                        if (k44Var != null) {
                            break;
                        }
                        k44Var = k44Var2;
                        break;
                    }
                    k44Var = k44Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            k44Var = null;
        }
        if (k44Var == null) {
            k44 k44Var3 = this.B ? (k44) this.e.g() : null;
            if (k44Var3 == null) {
                return f;
            }
            k44Var = k44Var3;
        }
        long jN2 = y94.N(j2);
        int iOrdinal2 = this.o.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = k44Var.y;
            return s60Var.g(f2 - ((int) (j & 4294967295L)), k44Var.n - f2, Float.intBitsToFloat((int) (jN2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = k44Var.g;
            return s60Var.g(f3 - ((int) (j >> 32)), k44Var.r - f3, Float.intBitsToFloat((int) (jN2 >> 32)));
        }
        uo1.g();
        return f;
    }

    public final long R0() {
        long j = this.C;
        if (qe2.g(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void T0(long j) {
        s60 s60Var = this.d;
        if (s60Var == null) {
            s60Var = (s60) v70.b(this, u60.g);
        }
        s60 s60Var2 = s60Var;
        if (this.D) {
            pc2.r("launchAnimation called when previous animation was running");
        }
        s60 s60Var3 = this.d;
        if (s60Var3 == null) {
            s60Var3 = (s60) v70.b(this, u60.g);
        }
        s60Var3.getClass();
        s60.g.getClass();
        m50.T(E0(), null, new pt0(this, new oh5(r60.y), s60Var2, j, null), 1);
    }

    public final long U0(k44 k44Var, long j, long j2) {
        long jN = y94.N(j);
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            s60 s60Var = this.d;
            if (s60Var == null) {
                s60Var = (s60) v70.b(this, u60.g);
            }
            float f = k44Var.y;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(s60Var.g(f - ((int) (j2 & 4294967295L)), k44Var.n - f, Float.intBitsToFloat((int) (jN & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            uo1.g();
            return 0L;
        }
        s60 s60Var2 = this.d;
        if (s60Var2 == null) {
            s60Var2 = (s60) v70.b(this, u60.g);
        }
        float f2 = k44Var.g;
        return (((long) Float.floatToRawIntBits(s60Var2.g(f2 - ((int) (j2 >> 32)), k44Var.r - f2, Float.intBitsToFloat((int) (jN >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // defpackage.x33
    public final void r(long j) {
        int iF;
        long j2;
        long jR0 = R0();
        this.C = j;
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            iF = yf2.f((int) (j & 4294967295L), (int) (jR0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                uo1.g();
                return;
            }
            iF = yf2.f((int) (j >> 32), (int) (jR0 >> 32));
        }
        if (iF >= 0) {
            return;
        }
        if (this.k) {
            j2 = 0;
        } else {
            j2 = this.o == um3.j ? ((long) (((int) (jR0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jR0 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        k44 k44Var = (k44) this.e.g();
        if (k44Var == null || this.D || this.B || !S0(this, k44Var, jR0, 0L, 2) || S0(this, k44Var, 0L, j3, 1)) {
            return;
        }
        this.B = true;
        T0(j3);
    }
}
