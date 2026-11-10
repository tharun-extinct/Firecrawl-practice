package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h82 implements my1 {
    public final /* synthetic */ p82 j;
    public final /* synthetic */ long t;

    public /* synthetic */ h82(p82 p82Var, long j) {
        this.j = p82Var;
        this.t = j;
    }

    @Override // defpackage.my1
    public final Object g() {
        boolean z;
        p82 p82Var = this.j;
        long j = this.t;
        synchronized (p82Var) {
            long j2 = p82Var.z;
            long j3 = p82Var.u;
            if (j2 < j3) {
                z = true;
            } else {
                p82Var.u = j3 + 1;
                z = false;
            }
        }
        if (z) {
            kk1 kk1Var = kk1.m;
            p82Var.y(kk1Var, kk1Var, null);
            j = -1;
        } else {
            try {
                p82Var.E.i(1, 0, false);
            } catch (IOException e) {
                kk1 kk1Var2 = kk1.m;
                p82Var.y(kk1Var2, kk1Var2, e);
            }
        }
        return Long.valueOf(j);
    }
}
