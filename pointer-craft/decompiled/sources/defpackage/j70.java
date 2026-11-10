package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j70 extends nz1 implements cz1 {
    public static final j70 i = new j70(3, m70.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        m70 m70Var = (m70) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m70.t;
        m70Var.getClass();
        if (obj3 == o70.q) {
            obj3 = new jd0(m70Var.w());
        }
        return new ld0(obj3);
    }
}
