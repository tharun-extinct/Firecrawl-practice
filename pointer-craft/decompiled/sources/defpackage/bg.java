package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bg extends zz4 implements bz1 {
    public final /* synthetic */ dg c;
    public final /* synthetic */ long i;
    public byte q;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(boolean z, dg dgVar, long j, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = z;
        this.c = dgVar;
        this.i = j;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new bg(this.w, this.c, this.i, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((bg) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        if (b == 0) {
            js2.o(obj);
            ag3 ag3Var = this.c.j;
            px0 px0Var = px0.j;
            if (this.w) {
                this.q = (byte) 2;
                Object objG = ag3Var.g(this.i, 0L, this);
                if (objG != px0Var) {
                    obj = objG;
                    long j = ((vj5) obj).g;
                }
            } else {
                this.q = (byte) 1;
                Object objG2 = ag3Var.g(0L, this.i, this);
                if (objG2 != px0Var) {
                    obj = objG2;
                    long j2 = ((vj5) obj).g;
                }
            }
            return px0Var;
        }
        if (b == 1) {
            js2.o(obj);
            long j3 = ((vj5) obj).g;
        } else {
            if (b != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
            long j4 = ((vj5) obj).g;
        }
        return og5.g;
    }
}
