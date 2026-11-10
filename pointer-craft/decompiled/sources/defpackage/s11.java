package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class s11 extends zz4 implements bz1 {
    public final /* synthetic */ t11 b;
    public boolean c;
    public final /* synthetic */ float i;
    public r54 q;
    public final /* synthetic */ pf4 s;
    public pi w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(float f, t11 t11Var, pf4 pf4Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = f;
        this.b = t11Var;
        this.s = pf4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new s11(this.i, this.b, this.s, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((s11) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        float f;
        r54 r54Var;
        pi piVar;
        boolean z = this.c;
        if (!z) {
            js2.o(obj);
            f = this.i;
            if (Math.abs(f) > 1.0f) {
                r54 r54Var2 = new r54();
                r54Var2.j = f;
                r54 r54Var3 = new r54();
                pi piVarG = v70.g(0.0f, f, 28);
                try {
                    t11 t11Var = this.b;
                    c11 c11Var = t11Var.g;
                    q2 q2Var = new q2(r54Var3, this.s, r54Var2, t11Var);
                    this.q = r54Var2;
                    this.w = piVarG;
                    this.c = true;
                    Object objQ = kq2.q(piVarG, c11Var, false, q2Var, this);
                    px0 px0Var = px0.j;
                    if (objQ == px0Var) {
                        return px0Var;
                    }
                    r54Var = r54Var2;
                    f = r54Var.j;
                } catch (CancellationException unused) {
                    r54Var = r54Var2;
                    piVar = piVarG;
                    r54Var.j = ((Number) piVar.g()).floatValue();
                }
            }
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            piVar = this.w;
            r54Var = this.q;
            try {
                js2.o(obj);
            } catch (CancellationException unused2) {
                r54Var.j = ((Number) piVar.g()).floatValue();
            }
            f = r54Var.j;
        }
        return new Float(f);
    }
}
