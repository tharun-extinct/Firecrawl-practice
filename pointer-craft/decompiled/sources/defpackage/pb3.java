package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pb3 extends g90 {
    public final tp3 r;
    public final tp3 y;

    public pb3(Object obj) {
        super((byte) 4);
        this.y = kq2.M(obj);
        this.r = kq2.M(obj);
    }

    @Override // defpackage.g90
    public final void i(Object obj) {
        this.y.setValue(obj);
    }

    @Override // defpackage.g90
    public final Object n() {
        return this.y.getValue();
    }

    @Override // defpackage.g90
    public final Object v() {
        return this.r.getValue();
    }
}
