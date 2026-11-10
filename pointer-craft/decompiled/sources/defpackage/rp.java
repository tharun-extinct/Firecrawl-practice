package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class rp implements vt0 {
    public final /* synthetic */ co4 j;

    public rp(co4 co4Var) {
        this.j = co4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.vt0
    public final void C(bz1 bz1Var, ou0 ou0Var) {
        qp qpVar;
        if (ou0Var instanceof qp) {
            qpVar = (qp) ou0Var;
            int i = qpVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                qpVar.w = i - Integer.MIN_VALUE;
            } else {
                qpVar = new qp(this, ou0Var);
            }
        } else {
            qpVar = new qp(this, ou0Var);
        }
        Object obj = qpVar.m;
        int i2 = qpVar.w;
        if (i2 == 0) {
            js2.o(obj);
            qpVar.w = 1;
            if (this.j.c(bz1Var, qpVar) == px0.j) {
                return;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            js2.o(obj);
        }
        throw new CancellationException();
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
