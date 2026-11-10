package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ds1 implements gr1 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ gr1 t;

    public ds1(gr1 gr1Var, bz1 bz1Var) {
        this.t = gr1Var;
        this.a = bz1Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        cs1 cs1Var;
        ps1 ps1Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        bz1 bz1Var = this.a;
        int i = 0;
        gr1 gr1Var = this.t;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                if (mu0Var instanceof cs1) {
                    cs1Var = (cs1) mu0Var;
                    int i2 = cs1Var.q;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        cs1Var.q = i2 - Integer.MIN_VALUE;
                    } else {
                        cs1Var = new cs1(this, mu0Var);
                    }
                } else {
                    cs1Var = new cs1(this, mu0Var);
                }
                Object objL = cs1Var.m;
                int i3 = cs1Var.q;
                if (i3 == 0) {
                    js2.o(objL);
                    cs1Var.c = obj;
                    cs1Var.i = 0;
                    cs1Var.q = 1;
                    objL = bz1Var.l(obj, cs1Var);
                    if (objL != px0Var) {
                    }
                    return px0Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        js2.o(objL);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = cs1Var.i;
                obj = cs1Var.c;
                js2.o(objL);
                if (!((Boolean) objL).booleanValue()) {
                    throw new r(this);
                }
                cs1Var.c = null;
                cs1Var.i = i;
                cs1Var.q = 2;
                if (gr1Var.c(obj, cs1Var) != px0Var) {
                    return og5Var;
                }
                return px0Var;
            default:
                if (mu0Var instanceof ps1) {
                    ps1Var = (ps1) mu0Var;
                    int i4 = ps1Var.q;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ps1Var.q = i4 - Integer.MIN_VALUE;
                    } else {
                        ps1Var = new ps1(this, mu0Var);
                    }
                } else {
                    ps1Var = new ps1(this, mu0Var);
                }
                Object obj2 = ps1Var.m;
                int i5 = ps1Var.q;
                if (i5 == 0) {
                    js2.o(obj2);
                    ps1Var.c = obj;
                    ps1Var.i = gr1Var;
                    ps1Var.b = 0;
                    ps1Var.q = 1;
                    if (bz1Var.l(obj, ps1Var) != px0Var) {
                    }
                    return px0Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        js2.o(obj2);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = ps1Var.b;
                gr1Var = ps1Var.i;
                obj = ps1Var.c;
                js2.o(obj2);
                ps1Var.c = null;
                ps1Var.i = null;
                ps1Var.b = i;
                ps1Var.q = 2;
                if (gr1Var.c(obj, ps1Var) != px0Var) {
                    return og5Var;
                }
                return px0Var;
        }
    }

    public ds1(bz1 bz1Var, gr1 gr1Var) {
        this.a = bz1Var;
        this.t = gr1Var;
    }
}
