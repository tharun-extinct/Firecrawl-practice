package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class km4 implements er1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ er1 j;
    public final /* synthetic */ Context m;
    public final /* synthetic */ rw3 t;

    public km4(er1 er1Var, rw3 rw3Var, xy1 xy1Var, Context context) {
        this.j = er1Var;
        this.t = rw3Var;
        this.a = xy1Var;
        this.m = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) {
        im4 im4Var;
        if (mu0Var instanceof im4) {
            im4Var = (im4) mu0Var;
            int i = im4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                im4Var.q = i - Integer.MIN_VALUE;
            } else {
                im4Var = new im4(this, mu0Var);
            }
        } else {
            im4Var = new im4(this, mu0Var);
        }
        Object obj = im4Var.m;
        int i2 = im4Var.q;
        if (i2 == 0) {
            js2.o(obj);
            qw0 qw0Var = new qw0((Object) gr1Var, (Object) this.t, (Object) this.a, (Object) this.m, (byte) 3);
            im4Var.q = 1;
            Object objR = this.j.r(qw0Var, im4Var);
            px0 px0Var = px0.j;
            if (objR == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        return og5.g;
    }
}
