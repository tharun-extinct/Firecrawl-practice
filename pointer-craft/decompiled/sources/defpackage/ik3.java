package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik3 extends nz1 implements cz1 {
    public static final ik3 i = new ik3(3, jk3.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        jk3 jk3Var = (jk3) obj;
        zh4 zh4Var = (zh4) obj2;
        long j = jk3Var.g;
        og5 og5Var = og5.g;
        if (j <= 0) {
            zh4Var.q = og5Var;
            return og5Var;
        }
        nl0 nl0Var = new nl0(zh4Var, jk3Var, (byte) 6);
        zh4Var.getClass();
        fx0 fx0Var = zh4Var.j;
        zh4Var.a = yf2.G(fx0Var).u(j, nl0Var, fx0Var);
        return og5Var;
    }
}
