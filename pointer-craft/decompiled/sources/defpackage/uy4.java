package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uy4 extends co4 implements cw4 {
    @Override // defpackage.cw4
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.i;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.b + ((long) ((int) ((b() + ((long) this.p)) - this.b)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void k(int i) {
        synchronized (this) {
            Object[] objArr = this.i;
            objArr.getClass();
            p(Integer.valueOf(((Number) objArr[((int) ((this.b + ((long) ((int) ((b() + ((long) this.p)) - this.b)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
