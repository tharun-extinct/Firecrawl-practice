package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gh5 extends hh5 {
    @Override // defpackage.hh5
    public final boolean a() {
        return false;
    }

    @Override // defpackage.hh5
    public final boolean g(long j, Object obj) {
        if (jh5.l) {
            return jh5.v(j, obj);
        }
        return ((byte) ((jh5.x((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    @Override // defpackage.hh5
    public final void j(Object obj, long j, float f) {
        this.y.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.hh5
    public final void l(Object obj, long j, double d) {
        this.y.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.hh5
    public final float n(long j, Object obj) {
        return Float.intBitsToFloat(this.y.getInt(obj, j));
    }

    @Override // defpackage.hh5
    public final double r(long j, Object obj) {
        return Double.longBitsToDouble(this.y.getLong(obj, j));
    }

    @Override // defpackage.hh5
    public final void v(Object obj, long j, boolean z) {
        if (jh5.l) {
            jh5.m(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            jh5.q(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.hh5
    public final void x(Object obj, long j, byte b) {
        if (jh5.l) {
            jh5.m(obj, j, b);
        } else {
            jh5.q(obj, j, b);
        }
    }
}
