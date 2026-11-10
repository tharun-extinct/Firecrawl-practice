package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class s21 implements xf3 {
    public final u21 j;
    public final fl2 t;

    public s21(u21 u21Var, fl2 fl2Var) {
        this.j = u21Var;
        this.t = fl2Var;
    }

    @Override // defpackage.xf3
    public final Object P(long j, long j2, mu0 mu0Var) {
        return vj5.g(vj5.y(j2, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.xf3
    public final long Q(int i, long j, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.xf3
    public final long t0(int i, long j) {
        u21 u21Var = this.j;
        oo3 oo3Var = u21Var.n;
        if (i != 1 || Math.abs(((pp3) oo3Var.n).d()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        mo3 mo3VarQ = u21Var.q();
        float fD = ((pp3) oo3Var.n).d() * u21Var.c();
        float f = ((mo3VarQ.y + mo3VarQ.r) * (-Math.signum(((pp3) oo3Var.n).d()))) + fD;
        if (((pp3) oo3Var.n).d() > 0.0f) {
            fD = f;
            f = fD;
        }
        float fQ = xs2.q(Float.intBitsToFloat(i2), fD, f);
        boolean z = this.t == fl2.t;
        b31 b31Var = u21Var.m;
        return (((long) Float.floatToRawIntBits(z ? b31Var.v(fQ) : -b31Var.v(-fQ))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
    }
}
