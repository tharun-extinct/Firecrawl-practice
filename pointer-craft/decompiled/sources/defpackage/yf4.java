package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yf4 {
    public static final wf4 g = new wf4();
    public static final vf4 y = new vf4();
    public static final yo3 r = new yo3((byte) 1);

    public static j73 g(r55 r55Var, um3 um3Var, boolean z, boolean z2, ja3 ja3Var) {
        return new uf4(r55Var, um3Var, z, z2, ja3Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(ng4 ng4Var, long j, ou0 ou0Var) {
        xf4 xf4Var;
        r54 r54Var;
        ng4 ng4Var2;
        if (ou0Var instanceof xf4) {
            xf4Var = (xf4) ou0Var;
            int i = xf4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xf4Var.c = i - Integer.MIN_VALUE;
            } else {
                xf4Var = new xf4(ou0Var);
            }
        } else {
            xf4Var = new xf4(ou0Var);
        }
        Object obj = xf4Var.w;
        int i2 = xf4Var.c;
        if (i2 == 0) {
            js2.o(obj);
            r54Var = new r54();
            ot3 ot3Var = new ot3(ng4Var, j, r54Var, (mu0) null);
            xf4Var.m = ng4Var;
            xf4Var.q = r54Var;
            xf4Var.c = 1;
            Object objL = ng4Var.l(ub3.j, ot3Var, xf4Var);
            px0 px0Var = px0.j;
            if (objL == px0Var) {
                return px0Var;
            }
            ng4Var2 = ng4Var;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r54 r54Var2 = xf4Var.q;
            ng4 ng4Var3 = xf4Var.m;
            js2.o(obj);
            r54Var = r54Var2;
            ng4Var2 = ng4Var3;
        }
        return new wi3(ng4Var2.t(r54Var.j));
    }
}
