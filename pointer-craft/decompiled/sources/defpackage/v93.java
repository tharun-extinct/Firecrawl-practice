package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class v93 implements er1 {
    public final /* synthetic */ SharedPreferences a;
    public final /* synthetic */ er1 j;
    public final /* synthetic */ rw3 t;

    public v93(er1 er1Var, rw3 rw3Var, SharedPreferences sharedPreferences) {
        this.j = er1Var;
        this.t = rw3Var;
        this.a = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) {
        s93 s93Var;
        if (mu0Var instanceof s93) {
            s93Var = (s93) mu0Var;
            int i = s93Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                s93Var.q = i - Integer.MIN_VALUE;
            } else {
                s93Var = new s93(this, mu0Var);
            }
        } else {
            s93Var = new s93(this, mu0Var);
        }
        Object obj = s93Var.m;
        int i2 = s93Var.q;
        if (i2 == 0) {
            js2.o(obj);
            u93 u93Var = new u93(gr1Var, this.t, this.a);
            s93Var.q = 1;
            Object objR = this.j.r(u93Var, s93Var);
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
