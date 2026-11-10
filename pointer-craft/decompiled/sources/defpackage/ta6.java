package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ta6 extends hh5 {
    @Override // defpackage.hh5
    public final void b(Object obj, long j, float f) {
        this.y.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.hh5
    public final void c(Object obj, long j, byte b) {
        if (va6.l) {
            va6.r(obj, j, b);
        } else {
            va6.n(obj, j, b);
        }
    }

    @Override // defpackage.hh5
    public final void i(Object obj, long j, double d) {
        this.y.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.hh5
    public final double m(long j, Object obj) {
        return Double.longBitsToDouble(this.y.getLong(obj, j));
    }

    @Override // defpackage.hh5
    public final float q(long j, Object obj) {
        return Float.intBitsToFloat(this.y.getInt(obj, j));
    }

    @Override // defpackage.hh5
    public final boolean s(long j, Object obj) {
        return va6.l ? va6.m(j, obj) : va6.q(j, obj);
    }

    @Override // defpackage.hh5
    public final void w(Object obj, long j, boolean z) {
        if (va6.l) {
            va6.r(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            va6.n(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }
}
