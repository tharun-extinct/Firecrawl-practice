package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cz2 implements bl2 {
    public final bz2 j;

    public cz2(bz2 bz2Var) {
        this.j = bz2Var;
    }

    @Override // defpackage.bl2
    public final long C(bl2 bl2Var, long j) {
        boolean z = bl2Var instanceof cz2;
        bz2 bz2Var = this.j;
        if (!z) {
            bz2 bz2VarN = qz5.n(bz2Var);
            long jC = C(bz2VarN.P0(), j);
            long jH0 = bz2VarN.H0();
            long jN = wi3.n(jC, (((long) Float.floatToRawIntBits((int) (jH0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jH0 >> 32)) << 32));
            gh3 gh3VarO0 = bz2VarN.O0();
            if (!gh3VarO0.Y0().h) {
                mc2.y("LayoutCoordinate operations are only valid when isAttached is true");
            }
            gh3VarO0.i1();
            gh3 gh3VarO1 = gh3VarO0.D;
            if (gh3VarO1 == null) {
                gh3VarO1 = bz2VarN.O0();
                gh3VarO1.getClass();
            }
            return wi3.v(jN, gh3VarO1.C(bl2Var, 0L));
        }
        bz2 bz2Var2 = ((cz2) bl2Var).j;
        bz2Var2.O0().i1();
        bz2 bz2VarW0 = bz2Var.O0().U0(bz2Var2.O0()).W0();
        if (bz2VarW0 != null) {
            long jR = je2.r(je2.n(bz2Var2.S0(bz2VarW0, false), k33.Y(j)), bz2Var.S0(bz2VarW0, false));
            return (((long) Float.floatToRawIntBits((int) (jR >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jR & 4294967295L))) & 4294967295L);
        }
        bz2 bz2VarN2 = qz5.n(bz2Var2);
        long jN2 = je2.n(je2.n(bz2Var2.S0(bz2VarN2, false), bz2VarN2.H0()), k33.Y(j));
        bz2 bz2VarN3 = qz5.n(bz2Var);
        long jR2 = je2.r(jN2, je2.n(bz2Var.S0(bz2VarN3, false), bz2VarN3.H0()));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jR2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jR2 & 4294967295L))) & 4294967295L;
        gh3 gh3Var = bz2VarN3.O0().D;
        gh3Var.getClass();
        gh3 gh3Var2 = bz2VarN2.O0().D;
        gh3Var2.getClass();
        return gh3Var.C(gh3Var2, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.bl2
    public final void D(bl2 bl2Var, float[] fArr) {
        this.j.O0().D(bl2Var, fArr);
    }

    @Override // defpackage.bl2
    public final k44 H(bl2 bl2Var, boolean z) {
        return this.j.O0().H(bl2Var, z);
    }

    @Override // defpackage.bl2
    public final long L() {
        bz2 bz2Var = this.j;
        return (((long) bz2Var.j) << 32) | (((long) bz2Var.t) & 4294967295L);
    }

    @Override // defpackage.bl2
    public final long N(long j) {
        return this.j.O0().N(wi3.v(j, y()));
    }

    @Override // defpackage.bl2
    public final boolean W() {
        return this.j.O0().Y0().h;
    }

    @Override // defpackage.bl2
    public final long g(long j) {
        return this.j.O0().g(wi3.v(j, y()));
    }

    @Override // defpackage.bl2
    public final long h(long j) {
        return wi3.v(this.j.O0().h(j), y());
    }

    @Override // defpackage.bl2
    public final long j(long j) {
        return wi3.v(this.j.O0().j(j), y());
    }

    @Override // defpackage.bl2
    public final bl2 m() {
        bz2 bz2VarW0;
        if (!W()) {
            mc2.y("LayoutCoordinate operations are only valid when isAttached is true");
        }
        gh3 gh3Var = this.j.O0().B.M.n.D;
        if (gh3Var == null || (bz2VarW0 = gh3Var.W0()) == null) {
            return null;
        }
        return bz2VarW0.z0();
    }

    @Override // defpackage.bl2
    public final void o(float[] fArr) {
        this.j.O0().o(fArr);
    }

    @Override // defpackage.bl2
    public final long p(bl2 bl2Var, long j) {
        return C(bl2Var, j);
    }

    @Override // defpackage.bl2
    public final long t(long j) {
        return this.j.O0().t(wi3.v(j, y()));
    }

    public final long y() {
        bz2 bz2Var = this.j;
        bz2 bz2VarN = qz5.n(bz2Var);
        return wi3.n(C(bz2VarN.z0(), 0L), bz2Var.O0().C(bz2VarN.O0(), 0L));
    }
}
