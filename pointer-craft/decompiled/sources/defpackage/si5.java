package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class si5 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ti5 t;

    public /* synthetic */ si5(ti5 ti5Var, byte b) {
        this.j = b;
        this.t = ti5Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        ti5 ti5Var = this.t;
        switch (b) {
            case 0:
                ti5Var.n = true;
                ti5Var.x.g();
                return og5Var;
            default:
                xd1 xd1Var = (xd1) obj;
                j42 j42Var = ti5Var.y;
                float f = ti5Var.m;
                float f2 = ti5Var.q;
                ro roVarE = xd1Var.E();
                long jG = roVarE.G();
                roVarE.b().q();
                try {
                    ((y22) roVarE.t).A(f, f2, 0L);
                    j42Var.g(xd1Var);
                    return og5Var;
                } finally {
                    du4.d(roVarE, jG);
                }
        }
    }
}
