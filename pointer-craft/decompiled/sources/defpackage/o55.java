package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o55 extends zz4 implements cz1 {
    public final /* synthetic */ ob3 b;
    public /* synthetic */ long c;
    public final /* synthetic */ ox0 i;
    public boolean q;
    public final /* synthetic */ ja3 s;
    public /* synthetic */ kx3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o55(ox0 ox0Var, ob3 ob3Var, ja3 ja3Var, mu0 mu0Var) {
        super(3, mu0Var);
        this.i = ox0Var;
        this.b = ob3Var;
        this.s = ja3Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        ox0 ox0Var = this.i;
        if (!z) {
            js2.o(obj);
            kx3 kx3Var = this.w;
            m50.T(ox0Var, null, new i((Object) this.b, this.c, this.s, (mu0) null, (byte) 4), 3);
            this.q = true;
            obj = kx3Var.x(this);
            px0 px0Var = px0.j;
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
        m50.T(ox0Var, null, new n81(this.b, ((Boolean) obj).booleanValue(), this.s, null), 3);
        return og5.g;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        long j = ((wi3) obj2).g;
        ob3 ob3Var = this.b;
        ja3 ja3Var = this.s;
        o55 o55Var = new o55(this.i, ob3Var, ja3Var, (mu0) obj3);
        o55Var.w = (kx3) obj;
        o55Var.c = j;
        return o55Var.u(og5.g);
    }
}
