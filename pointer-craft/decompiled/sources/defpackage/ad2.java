package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ad2 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void g(nt2 nt2Var, yt3 yt3Var, ou0 ou0Var) {
        zc2 zc2Var;
        if (ou0Var instanceof zc2) {
            zc2Var = (zc2) ou0Var;
            int i = zc2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                zc2Var.w = i - Integer.MIN_VALUE;
            } else {
                zc2Var = new zc2(this, ou0Var);
            }
        } else {
            zc2Var = new zc2(this, ou0Var);
        }
        Object obj = zc2Var.m;
        int i2 = zc2Var.w;
        if (i2 == 0) {
            js2.o(obj);
            zc2Var.w = 2;
            yf2.z(zc2Var);
        } else if (i2 == 1) {
            js2.o(obj);
            up.q();
        } else if (i2 != 2) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
        } else {
            js2.o(obj);
            up.q();
        }
    }
}
