package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xc1 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ float t;

    public /* synthetic */ xc1(float f, Object obj, byte b) {
        this.j = b;
        this.t = f;
        this.a = obj;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        boolean zG;
        byte b = this.j;
        Object obj2 = this.a;
        float f = this.t;
        switch (b) {
            case 0:
                q54 q54Var = (q54) obj2;
                kd1 kd1Var = (kd1) obj;
                boolean zP = yf2.p(kd1Var.x0(), "waiting");
                boolean z = false;
                if (kd1Var.m() == null) {
                    zG = false;
                } else {
                    um3 um3VarM = kd1Var.m();
                    um3VarM.getClass();
                    zG = nd1.g(um3VarM, f);
                }
                if (q54Var.j || (zP && zG)) {
                    z = true;
                }
                q54Var.j = z;
                return Boolean.valueOf(!z);
            default:
                ki0 ki0Var = (ki0) obj2;
                lj4.j((nj4) obj, new rz3(((Number) xs2.i(Float.valueOf(f), ki0Var)).floatValue(), ki0Var));
                return og5.g;
        }
    }
}
