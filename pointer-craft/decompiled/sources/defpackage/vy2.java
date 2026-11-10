package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class vy2 extends a7 {
    @Override // defpackage.a7
    public final int n(gh3 gh3Var, v6 v6Var) {
        bz2 bz2VarW0 = gh3Var.W0();
        bz2VarW0.getClass();
        return bz2VarW0.c0(v6Var);
    }

    @Override // defpackage.a7
    public final Map r(gh3 gh3Var) {
        bz2 bz2VarW0 = gh3Var.W0();
        bz2VarW0.getClass();
        return bz2VarW0.F0().r();
    }

    @Override // defpackage.a7
    public final long y(gh3 gh3Var, long j) {
        bz2 bz2VarW0 = gh3Var.W0();
        bz2VarW0.getClass();
        long j2 = bz2VarW0.C;
        return wi3.v((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
    }
}
