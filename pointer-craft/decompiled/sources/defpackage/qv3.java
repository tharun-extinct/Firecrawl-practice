package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qv3 extends c6 {
    public final Object r;

    public qv3() {
        super(12);
        this.r = new Object();
    }

    @Override // defpackage.c6
    public final boolean a(Object obj) {
        boolean zA;
        synchronized (this.r) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // defpackage.c6
    public final Object g() {
        Object objG;
        synchronized (this.r) {
            objG = super.g();
        }
        return objG;
    }
}
