package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class pt0 extends zz4 implements bz1 {
    public final /* synthetic */ s60 b;
    public final /* synthetic */ qt0 c;
    public final /* synthetic */ oh5 i;
    public boolean q;
    public final /* synthetic */ long s;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(qt0 qt0Var, oh5 oh5Var, s60 s60Var, long j, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = qt0Var;
        this.i = oh5Var;
        this.b = s60Var;
        this.s = j;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        pt0 pt0Var = new pt0(this.c, this.i, this.b, this.s, mu0Var);
        pt0Var.w = obj;
        return pt0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((pt0) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        qt0 qt0Var = this.c;
        q64 q64Var = qt0Var.A;
        boolean z = this.q;
        try {
            try {
                if (!z) {
                    js2.o(obj);
                    dh2 dh2VarK = v70.k(((ox0) this.w).w());
                    qt0Var.D = true;
                    ng4 ng4Var = qt0Var.f;
                    ub3 ub3Var = ub3.j;
                    s10 s10Var = new s10(this.i, qt0Var, this.b, this.s, dh2VarK, null);
                    this.q = true;
                    Object objL = ng4Var.l(ub3Var, s10Var, this);
                    px0 px0Var = px0.j;
                    if (objL == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                q64Var.m();
                qt0Var.D = false;
                q64Var.n(null);
                qt0Var.B = false;
                return og5.g;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            qt0Var.D = false;
            q64Var.n(null);
            qt0Var.B = false;
            throw th;
        }
    }
}
