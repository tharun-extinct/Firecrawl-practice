package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dr0 implements er1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ dr0(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    @Override // defpackage.er1
    public final Object r(gr1 gr1Var, mu0 mu0Var) throws Throwable {
        ar0 ar0Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        Object obj = this.a;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                if (mu0Var instanceof ar0) {
                    ar0Var = (ar0) mu0Var;
                    int i = ar0Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ar0Var.q = i - Integer.MIN_VALUE;
                    } else {
                        ar0Var = new ar0(this, mu0Var);
                    }
                } else {
                    ar0Var = new ar0(this, mu0Var);
                }
                Object obj3 = ar0Var.m;
                int i2 = ar0Var.q;
                if (i2 == 0) {
                    js2.o(obj3);
                    cr0 cr0Var = new cr0(gr1Var, (qr0) obj, (byte) 0);
                    ar0Var.q = 1;
                    return ((er1) obj2).r(cr0Var, ar0Var) == px0Var ? px0Var : og5Var;
                }
                if (i2 == 1) {
                    js2.o(obj3);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                Object objJ = a11.j(mu0Var, gr1Var, new es1(null, (gr0) obj), (er1[]) obj2);
                return objJ == px0Var ? objJ : og5Var;
        }
    }
}
