package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ih4 extends zz4 implements xy1 {
    public final /* synthetic */ nc5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ lh4 i;
    public boolean q;
    public final /* synthetic */ float s;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih4(Object obj, Object obj2, lh4 lh4Var, nc5 nc5Var, float f, mu0 mu0Var) {
        super(1, mu0Var);
        this.w = obj;
        this.c = obj2;
        this.i = lh4Var;
        this.b = nc5Var;
        this.s = f;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        nc5 nc5Var = this.b;
        float f = this.s;
        return new ih4(this.w, this.c, this.i, nc5Var, f, (mu0) obj).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            hh4 hh4Var = new hh4(this.w, this.c, this.i, this.b, this.s, null);
            this.q = true;
            Object objB = k33.B(hh4Var, this);
            px0 px0Var = px0.j;
            if (objB == px0Var) {
                return px0Var;
            }
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        return og5.g;
    }
}
