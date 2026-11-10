package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class sy0 implements er1 {
    public final /* synthetic */ rw3 a;
    public final /* synthetic */ er1 j;
    public final /* synthetic */ vy0 m;
    public final /* synthetic */ SharedPreferences q;
    public final /* synthetic */ rw3 t;

    public sy0(er1 er1Var, rw3 rw3Var, rw3 rw3Var2, vy0 vy0Var, SharedPreferences sharedPreferences) {
        this.j = er1Var;
        this.t = rw3Var;
        this.a = rw3Var2;
        this.m = vy0Var;
        this.q = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) {
        qy0 qy0Var;
        if (mu0Var instanceof qy0) {
            qy0Var = (qy0) mu0Var;
            int i = qy0Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy0Var.q = i - Integer.MIN_VALUE;
            } else {
                qy0Var = new qy0(this, mu0Var);
            }
        } else {
            qy0Var = new qy0(this, mu0Var);
        }
        Object obj = qy0Var.m;
        int i2 = qy0Var.q;
        if (i2 == 0) {
            js2.o(obj);
            qw0 qw0Var = new qw0(gr1Var, this.t, this.a, this.m, this.q);
            qy0Var.q = 1;
            Object objR = this.j.r(qw0Var, qy0Var);
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
