package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fn2 extends rm2 {
    public final /* synthetic */ bz1 r;
    public final /* synthetic */ in2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn2(in2 in2Var, bz1 bz1Var, String str) {
        super(str);
        this.y = in2Var;
        this.r = bz1Var;
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        in2 in2Var = this.y;
        cn2 cn2Var = in2Var.i;
        cn2Var.j = v33Var.getLayoutDirection();
        cn2Var.t = v33Var.y();
        cn2Var.a = v33Var.w();
        boolean zU = v33Var.u();
        bz1 bz1Var = this.r;
        if (zU || in2Var.j.i == null) {
            in2Var.m = 0;
            u33 u33Var = (u33) bz1Var.l(cn2Var, new ws0(j));
            return new en2(u33Var, in2Var, in2Var.m, u33Var);
        }
        in2Var.q = 0;
        u33 u33Var2 = (u33) bz1Var.l(in2Var.b, new ws0(j));
        return new dn2(u33Var2, in2Var, in2Var.q, u33Var2);
    }
}
