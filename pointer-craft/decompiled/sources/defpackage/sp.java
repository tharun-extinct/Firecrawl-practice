package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class sp extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public /* synthetic */ Object i;
    public final /* synthetic */ byte q = 0;
    public final /* synthetic */ Object s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(er1[] er1VarArr, int i, AtomicInteger atomicInteger, m70 m70Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = er1VarArr;
        this.c = i;
        this.b = atomicInteger;
        this.s = m70Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.s;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                sp spVar = new sp((w12) obj3, (Context) obj2, this.c, mu0Var);
                spVar.i = obj;
                return spVar;
            default:
                return new sp((er1[]) this.i, this.c, (AtomicInteger) obj3, (m70) obj2, mu0Var);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((sp) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        px0 px0Var = px0.j;
        Object obj2 = this.s;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ox0 ox0Var = (ox0) this.i;
                co4 co4VarX = v70.x(0, 6, null);
                m50.T(ox0Var, new rp(co4VarX), new pp((w12) obj3, (Context) obj2, this.c, co4VarX, null), 2);
                this.w = true;
                Object objM = ue5.M(co4VarX, this);
                return objM == px0Var ? px0Var : objM;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                m70 m70Var = (m70) obj2;
                boolean z2 = this.w;
                try {
                    if (!z2) {
                        js2.o(obj);
                        er1[] er1VarArr = (er1[]) this.i;
                        int i = this.c;
                        er1 er1Var = er1VarArr[i];
                        ik0 ik0Var = new ik0(m70Var, i);
                        this.w = true;
                        if (er1Var.r(ik0Var, this) == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        m70Var.g(null);
                    }
                    return og5.g;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() != 0) {
                        throw th;
                    }
                    m70Var.g(null);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(w12 w12Var, Context context, int i, mu0 mu0Var) {
        super(2, mu0Var);
        this.b = w12Var;
        this.s = context;
        this.c = i;
    }
}
