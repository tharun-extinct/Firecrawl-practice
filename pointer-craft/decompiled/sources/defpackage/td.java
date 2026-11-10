package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class td implements yt3, ox0 {
    public final ox0 a;
    public final View j;
    public final AtomicReference m = new AtomicReference(null);
    public final v65 t;

    public td(View view, v65 v65Var, ox0 ox0Var) {
        this.j = view;
        this.t = v65Var;
        this.a = ox0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yt3
    public final void L(nt2 nt2Var, ou0 ou0Var) {
        rd rdVar;
        if (ou0Var instanceof rd) {
            rdVar = (rd) ou0Var;
            int i = rdVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                rdVar.w = i - Integer.MIN_VALUE;
            } else {
                rdVar = new rd(this, ou0Var);
            }
        } else {
            rdVar = new rd(this, ou0Var);
        }
        Object obj = rdVar.m;
        int i2 = rdVar.w;
        if (i2 == 0) {
            js2.o(obj);
            m mVar = new m(nt2Var, this, (byte) 3);
            mu0 mu0Var = null;
            q qVar = new q(this, mu0Var, (byte) 2);
            rdVar.w = 1;
            if (k33.B(new n10(mVar, this.m, qVar, mu0Var, (byte) 4), rdVar) == px0.j) {
                return;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            js2.o(obj);
        }
        l0.x();
    }

    @Override // defpackage.yt3
    public final View u() {
        return this.j;
    }

    @Override // defpackage.ox0
    public final fx0 w() {
        return this.a.w();
    }
}
