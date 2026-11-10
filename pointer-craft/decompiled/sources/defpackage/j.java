package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j implements iq1 {
    public float j;
    public float t;

    public cq1 g(float f) {
        float[] fArr = yb.g;
        float f2 = this.j;
        float f3 = this.t;
        double dG = yb.g(f, f2 * f3);
        double d = dq1.g;
        double d2 = d - 1.0d;
        return new cq1(f, (float) (Math.exp((d / d2) * dG) * ((double) (f2 * f3))), (long) (Math.exp(dG / d2) * 1000.0d));
    }

    @Override // defpackage.iq1
    public float j(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.j;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.t;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }

    @Override // defpackage.iq1
    public float m(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.t));
    }

    @Override // defpackage.iq1
    public float q(float f, float f2, long j) {
        float f3 = this.t;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public void r(float f) {
        this.j = f;
        this.t = 0.0f;
    }

    @Override // defpackage.iq1
    public long v(float f) {
        return ((long) ((((float) Math.log(this.j / Math.abs(f))) * 1000.0f) / this.t)) * 1000000;
    }

    @Override // defpackage.iq1
    public float x() {
        return this.j;
    }

    public int y(float f, float f2) {
        float f3 = this.j;
        if (f == f3) {
            return 0;
        }
        float f4 = (f - f3) * f2;
        this.j = f;
        float f5 = this.t;
        if (f4 < 0.0f) {
            if (f5 < 0.0f) {
                f4 += f5;
            }
            this.t = f4 % (-1.0f);
        } else {
            if (f5 > 0.0f) {
                f4 += f5;
            }
            this.t = f4 % 1.0f;
        }
        return (int) f4;
    }
}
