package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class oc0 implements yt3 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ yt3 j;
    public final /* synthetic */ pc0 m;
    public final /* synthetic */ yt3 t;

    public oc0(yt3 yt3Var, AtomicReference atomicReference, pc0 pc0Var) {
        this.t = yt3Var;
        this.a = atomicReference;
        this.m = pc0Var;
        this.j = yt3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yt3
    public final void L(nt2 nt2Var, ou0 ou0Var) {
        nc0 nc0Var;
        if (ou0Var instanceof nc0) {
            nc0Var = (nc0) ou0Var;
            int i = nc0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                nc0Var.w = i - Integer.MIN_VALUE;
            } else {
                nc0Var = new nc0(this, ou0Var);
            }
        } else {
            nc0Var = new nc0(this, ou0Var);
        }
        Object obj = nc0Var.m;
        int i2 = nc0Var.w;
        if (i2 == 0) {
            js2.o(obj);
            m9 m9Var = new m9((byte) 19);
            mu0 mu0Var = null;
            c cVar = new c(this.m, nt2Var, this.t, mu0Var, (byte) 12);
            nc0Var.w = 1;
            if (k33.B(new n10(m9Var, this.a, cVar, mu0Var, (byte) 4), nc0Var) == px0.j) {
                return;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            js2.o(obj);
        }
        up.q();
    }

    @Override // defpackage.yt3
    public final View u() {
        return this.j.u();
    }

    @Override // defpackage.ox0
    public final fx0 w() {
        return this.j.w();
    }
}
