package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class dm3 implements j74 {
    public final /* synthetic */ m46 g;

    public dm3(m46 m46Var) {
        this.g = m46Var;
    }

    @Override // defpackage.j74
    public final boolean r() {
        boolean z;
        m46 m46Var = this.g;
        synchronized (m46Var.n) {
            synchronized (m46Var.n) {
                z = m46Var.g > 0;
            }
        }
        return z;
    }

    @Override // defpackage.j74
    public final void reset() {
        m46 m46Var = this.g;
        synchronized (m46Var.n) {
            try {
                if (m46Var.g > 0) {
                    Log.w("OperationMonitor", "Resetting OperationMonitor with " + m46Var.g + " active operations.");
                }
                m46Var.g = 0;
                m46Var.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
