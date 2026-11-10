package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jb2 extends zz4 implements bz1 {
    public final /* synthetic */ kb2 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb2(kb2 kb2Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = kb2Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        kb2 kb2Var = this.c;
        switch (b) {
            case 0:
                return new jb2(kb2Var, mu0Var, (byte) 0);
            case 1:
                return new jb2(kb2Var, mu0Var, (byte) 1);
            case 2:
                return new jb2(kb2Var, mu0Var, (byte) 2);
            default:
                return new jb2(kb2Var, mu0Var, (byte) 3);
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
            case 1:
                break;
            case 2:
                break;
        }
        return ((jb2) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        kb2 kb2Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    qg qgVar = kb2Var.F;
                    if (qgVar == null) {
                        return og5Var;
                    }
                    t45 t45VarU = kb2Var.E;
                    if (t45VarU == null) {
                        t45VarU = bi6.u((rj0) v70.b(kb2Var, tj0.g), (x75) v70.b(kb2Var, y75.g));
                    }
                    jj0 jj0Var = new jj0(t45VarU.n(kb2Var.k, kb2Var.d, kb2Var.C));
                    oi oiVarS = kb2Var.k ? jr2.s((e83) v70.b(kb2Var, j33.g), f83.m) : m50.a0();
                    this.w = true;
                    obj = qg.g(qgVar, jj0Var, oiVarS, null, this, 12);
                    if (obj == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 1:
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                qg qgVar2 = kb2Var.H;
                vb1 vb1Var = new vb1((kb2Var.C && kb2Var.k) ? kb2Var.A : kb2Var.B);
                oi oiVarS2 = kb2Var.k ? jr2.s((e83) v70.b(kb2Var, j33.g), f83.t) : m50.a0();
                this.w = true;
                return qg.g(qgVar2, vb1Var, oiVarS2, null, this, 12) == px0Var ? px0Var : og5Var;
            case 2:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    this.w = true;
                    return kb2Var.U0(this) == px0Var ? px0Var : og5Var;
                }
                if (z3) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    this.w = true;
                    return kb2Var.U0(this) == px0Var ? px0Var : og5Var;
                }
                if (z4) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
