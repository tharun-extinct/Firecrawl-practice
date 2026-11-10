package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g40 extends zz4 implements bz1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int i;
    public final /* synthetic */ byte q;
    public final /* synthetic */ k40 s;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(byte b, int i, int i2, int i3, int i4, k40 k40Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = b;
        this.w = i;
        this.c = i2;
        this.i = i3;
        this.b = i4;
        this.s = k40Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new g40(this.q, this.w, this.c, this.i, this.b, this.s, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        g40 g40Var = (g40) b((mu0) obj2, (ox0) obj);
        og5 og5Var = og5.g;
        g40Var.u(og5Var);
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        this.s.y.l((byte) 2, new byte[]{this.q, (byte) this.w, (byte) this.c, (byte) this.i, (byte) this.b});
        return og5.g;
    }
}
