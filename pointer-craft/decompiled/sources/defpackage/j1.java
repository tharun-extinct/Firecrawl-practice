package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 extends zz4 implements bz1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ float i;
    public boolean q;
    public final /* synthetic */ fg4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(fg4 fg4Var, float f, float f2, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = fg4Var;
        this.c = f;
        this.i = f2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new j1(this.w, this.c, this.i, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((j1) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.c)) << 32) | (((long) Float.floatToRawIntBits(this.i)) & 4294967295L);
            this.q = true;
            Object objY = yf4.y(this.w.Y, jFloatToRawIntBits, this);
            px0 px0Var = px0.j;
            if (objY == px0Var) {
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
