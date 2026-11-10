package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i70 extends nz1 implements cz1 {
    public static final i70 i = new i70(3, m70.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        md0 md0Var;
        m70 m70Var = (m70) obj;
        zh4 zh4Var = (zh4) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m70.t;
        m70Var.getClass();
        md0 md0Var2 = (md0) qr.g.getObjectVolatile(m70Var, m70.h);
        while (!m70Var.k()) {
            long andIncrement = m70.a.getAndIncrement(m70Var);
            long j = o70.y;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (md0Var2.m != j2) {
                md0 md0VarA = m70Var.a(j2, md0Var2);
                if (md0VarA == null) {
                    continue;
                } else {
                    md0Var = md0VarA;
                }
            } else {
                md0Var = md0Var2;
            }
            Object objK = m70Var.K(md0Var, i2, andIncrement, zh4Var);
            md0 md0Var3 = md0Var;
            if (objK == o70.w) {
                zh4 zh4Var2 = zh4Var instanceof an5 ? zh4Var : null;
                if (zh4Var2 != null) {
                    zh4Var2.g(md0Var3, i2);
                }
            } else if (objK == o70.i) {
                if (andIncrement < m70Var.u()) {
                    md0Var3.g();
                }
                md0Var2 = md0Var3;
            } else {
                if (objK == o70.c) {
                    l0.z("unexpected");
                    return null;
                }
                md0Var3.g();
                zh4Var.q = objK;
            }
            return og5.g;
        }
        zh4Var.q = o70.q;
        return og5.g;
    }
}
