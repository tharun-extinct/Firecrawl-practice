package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class gq implements vt0 {
    public final /* synthetic */ AtomicReference j;
    public final /* synthetic */ ez3 t;

    public gq(AtomicReference atomicReference, ez3 ez3Var) {
        this.j = atomicReference;
        this.t = ez3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.vt0
    public final void C(bz1 bz1Var, ou0 ou0Var) {
        fq fqVar;
        if (ou0Var instanceof fq) {
            fqVar = (fq) ou0Var;
            int i = fqVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqVar.w = i - Integer.MIN_VALUE;
            } else {
                fqVar = new fq(this, ou0Var);
            }
        } else {
            fqVar = new fq(this, ou0Var);
        }
        Object obj = fqVar.m;
        int i2 = fqVar.w;
        if (i2 == 0) {
            js2.o(obj);
            fqVar.w = 1;
            ib0 ib0Var = new ib0(1, pw5.o(fqVar));
            ib0Var.o();
            ez3 ez3Var = this.t;
            ib0Var.k(new ce(ez3Var, (byte) 2));
            hb0 hb0Var = (hb0) this.j.getAndSet(ib0Var);
            if (hb0Var != null) {
                hb0Var.s(null);
            }
            ez3Var.z(bz1Var);
            if (ib0Var.z() == px0.j) {
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

    @Override // defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        return a11.f(this, ex0Var);
    }

    @Override // defpackage.fx0
    public final fx0 b(fx0 fx0Var) {
        return a11.k(this, fx0Var);
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    @Override // defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        return a11.p(this, ex0Var);
    }
}
