package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zf extends ri0 {
    public final /* synthetic */ fl5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(fl5 fl5Var) {
        super(1);
        this.a = fl5Var;
    }

    @Override // defpackage.ri0
    public final cd2 a(yo5 yo5Var, cd2 cd2Var) {
        sc2 sc2Var = this.a.G.M.r;
        if (sc2Var.j0.h) {
            long jY = k33.Y(sc2Var.N(0L));
            int i = (int) (jY >> 32);
            if (i < 0) {
                i = 0;
            }
            int i2 = (int) (jY & 4294967295L);
            if (i2 < 0) {
                i2 = 0;
            }
            long jL = m50.K(sc2Var).L();
            int i3 = (int) (jL >> 32);
            int i4 = (int) (jL & 4294967295L);
            long j = sc2Var.a;
            long jY2 = k33.Y(sc2Var.N((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
            int i5 = i3 - ((int) (jY2 >> 32));
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = i4 - ((int) (jY2 & 4294967295L));
            if (i6 < 0) {
                i6 = 0;
            }
            if (i != 0 || i2 != 0 || i5 != 0 || i6 != 0) {
                return new cd2((byte) 23, dg.m(cd2Var.b(), i, i2, i5, i6), dg.m(cd2Var.z(), i, i2, i5, i6), false);
            }
        }
        return cd2Var;
    }

    @Override // defpackage.ri0
    public final tp5 j(tp5 tp5Var, List list) {
        return this.a.q(tp5Var);
    }
}
