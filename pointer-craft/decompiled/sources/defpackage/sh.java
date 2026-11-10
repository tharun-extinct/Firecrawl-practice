package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sh extends zz4 implements bz1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ ob3 i;
    public boolean q;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(Object obj, long j, ob3 ob3Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = obj;
        this.c = j;
        this.i = ob3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new sh(this.w, this.c, this.i, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((sh) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        ob3 ob3Var = this.i;
        if (!z) {
            js2.o(obj);
            if (this.w == null) {
                ob3Var.setValue(Boolean.FALSE);
            } else {
                this.q = true;
                Object objE = yf2.e(this.c, this);
                px0 px0Var = px0.j;
                if (objE == px0Var) {
                    return px0Var;
                }
            }
            return og5.g;
        }
        if (!z) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        ob3Var.setValue(Boolean.TRUE);
        return og5.g;
    }
}
