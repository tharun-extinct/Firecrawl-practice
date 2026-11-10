package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dc4 extends ou0 implements gr1 {
    public fx0 c;
    public mu0 i;
    public final gr1 m;
    public final fx0 q;
    public final int w;

    public dc4(gr1 gr1Var, fx0 fx0Var) {
        super(gl0.a, ni1.j);
        this.m = gr1Var;
        this.q = fx0Var;
        this.w = ((Number) fx0Var.d(new on0((byte) 29), 0)).intValue();
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        try {
            Object objH = h(mu0Var, obj);
            return objH == px0.j ? objH : og5.g;
        } catch (Throwable th) {
            this.c = new ub1(mu0Var.v(), th);
            throw th;
        }
    }

    public final Object h(mu0 mu0Var, Object obj) {
        fx0 fx0VarV = mu0Var.v();
        v70.s(fx0VarV);
        fx0 fx0Var = this.c;
        if (fx0Var != fx0VarV) {
            if (fx0Var instanceof ub1) {
                throw new IllegalStateException(ux4.H("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ub1) fx0Var).t + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) fx0VarV.d(new f(this, (byte) 26), 0)).intValue() != this.w) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.q + ",\n\t\tbut emission happened in " + fx0VarV + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.c = fx0VarV;
        }
        this.i = mu0Var;
        cz1 cz1Var = fc4.g;
        gr1 gr1Var = this.m;
        gr1Var.getClass();
        Object objX = cz1Var.x(gr1Var, obj, this);
        if (!yf2.p(objX, px0.j)) {
            this.i = null;
        }
        return objX;
    }

    @Override // defpackage.ix, defpackage.qx0
    public final qx0 n() {
        mu0 mu0Var = this.i;
        if (mu0Var instanceof qx0) {
            return (qx0) mu0Var;
        }
        return null;
    }

    @Override // defpackage.ix
    public final StackTraceElement p() {
        return null;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        Throwable thG = h84.g(obj);
        if (thG != null) {
            this.c = new ub1(v(), thG);
        }
        mu0 mu0Var = this.i;
        if (mu0Var != null) {
            mu0Var.j(obj);
        }
        return px0.j;
    }

    @Override // defpackage.ou0, defpackage.mu0
    public final fx0 v() {
        fx0 fx0Var = this.c;
        return fx0Var == null ? ni1.j : fx0Var;
    }
}
