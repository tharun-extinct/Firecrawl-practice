package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class ng extends zz4 implements xy1 {
    public final /* synthetic */ Object b;
    public boolean c;
    public final /* synthetic */ qg i;
    public final /* synthetic */ long p;
    public pi q;
    public final /* synthetic */ t25 s;
    public final /* synthetic */ xy1 u;
    public q54 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(qg qgVar, Object obj, t25 t25Var, long j, xy1 xy1Var, mu0 mu0Var) {
        super(1, mu0Var);
        this.i = qgVar;
        this.b = obj;
        this.s = t25Var;
        this.p = j;
        this.u = xy1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        long j = this.p;
        xy1 xy1Var = this.u;
        return new ng(this.i, this.b, this.s, j, xy1Var, (mu0) obj).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        qg qgVar;
        pi piVar;
        q54 q54Var;
        CancellationException cancellationException;
        t25 t25Var = this.s;
        boolean z = this.c;
        qg qgVar2 = this.i;
        if (!z) {
            js2.o(obj);
            try {
                qgVar2.r.a = (vi) qgVar2.g.g.a(this.b);
                qgVar2.v.setValue(t25Var.r);
                qgVar2.n.setValue(Boolean.TRUE);
                pi piVar2 = qgVar2.r;
                pi piVar3 = new pi(piVar2.j, piVar2.t.getValue(), og0.u(piVar2.a), piVar2.m, Long.MIN_VALUE, piVar2.w);
                q54 q54Var2 = new q54();
                long j = this.p;
                mg mgVar = new mg(qgVar2, piVar3, this.u, q54Var2, (byte) 0);
                qgVar = qgVar2;
                try {
                    this.q = piVar3;
                    this.w = q54Var2;
                    this.c = true;
                    Object objA = kq2.a(piVar3, t25Var, j, mgVar, this);
                    px0 px0Var = px0.j;
                    if (objA == px0Var) {
                        return px0Var;
                    }
                    piVar = piVar3;
                    q54Var = q54Var2;
                } catch (CancellationException e) {
                    e = e;
                    cancellationException = e;
                    qgVar.r();
                    throw cancellationException;
                }
            } catch (CancellationException e2) {
                e = e2;
                qgVar = qgVar2;
                cancellationException = e;
                qgVar.r();
                throw cancellationException;
            }
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q54Var = this.w;
            piVar = this.q;
            try {
                js2.o(obj);
                qgVar = qgVar2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                qgVar = qgVar2;
                qgVar.r();
                throw cancellationException;
            }
        }
        gi giVar = q54Var.j ? gi.j : gi.t;
        qgVar.r();
        return new mi(piVar, giVar);
    }
}
