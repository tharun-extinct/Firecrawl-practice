package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lv implements cb0 {
    public final kv[] j;

    public lv(kv[] kvVarArr) {
        this.j = kvVarArr;
    }

    public final void g() {
        for (kv kvVar : this.j) {
            ya1 ya1Var = kvVar.w;
            if (ya1Var == null) {
                yf2.Y("handle");
                throw null;
            }
            ya1Var.g();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.j + ']';
    }

    @Override // defpackage.cb0
    public final void y(Throwable th) {
        g();
    }
}
