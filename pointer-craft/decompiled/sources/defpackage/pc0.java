package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pc0 {
    public final pc0 g;
    public final tp3 y;

    public pc0(ad2 ad2Var, pc0 pc0Var) {
        this.g = pc0Var;
        this.y = kq2.M(ad2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void g(pn3 pn3Var, bz1 bz1Var, ou0 ou0Var) {
        mc0 mc0Var;
        if (ou0Var instanceof mc0) {
            mc0Var = (mc0) ou0Var;
            int i = mc0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                mc0Var.w = i - Integer.MIN_VALUE;
            } else {
                mc0Var = new mc0(this, ou0Var);
            }
        } else {
            mc0Var = new mc0(this, ou0Var);
        }
        Object obj = mc0Var.m;
        int i2 = mc0Var.w;
        if (i2 == 0) {
            js2.o(obj);
            c cVar = new c(bz1Var, this, null, (byte) 13);
            mc0Var.w = 1;
            wt3.r(pn3Var, this.g, cVar, mc0Var);
            return;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
        } else {
            js2.o(obj);
            up.q();
        }
    }
}
