package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xw4 implements ww4 {
    public final bs j = new bs(0);

    public final void k(int i) {
        bs bsVar;
        int i2;
        do {
            bsVar = this.j;
            i2 = bsVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!bsVar.compareAndSet(i2, i2 | i));
    }

    public final boolean z(int i) {
        return (this.j.get() & i) != 0;
    }
}
