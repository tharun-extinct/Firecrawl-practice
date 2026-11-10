package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mg4 extends zz4 implements bz1 {
    public /* synthetic */ long c;
    public final /* synthetic */ ng4 i;
    public long q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg4(ng4 ng4Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = ng4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        mg4 mg4Var = new mg4(this.i, mu0Var);
        mg4Var.c = ((vj5) obj).g;
        return mg4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        long j = ((vj5) obj).g;
        mg4 mg4Var = new mg4(this.i, (mu0) obj2);
        mg4Var.c = j;
        return mg4Var.u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        byte b = this.w;
        ng4 ng4Var = this.i;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            j = this.c;
            ag3 ag3Var = ng4Var.x;
            this.c = j;
            this.w = (byte) 1;
            obj = ag3Var.y(j, this);
            if (obj != px0Var) {
            }
            return px0Var;
        }
        if (b == 1) {
            j = this.c;
            js2.o(obj);
        } else {
            if (b == 2) {
                j2 = this.q;
                j = this.c;
                js2.o(obj);
                j3 = ((vj5) obj).g;
                ag3 ag3Var2 = ng4Var.x;
                long jX = vj5.x(j2, j3);
                this.c = j;
                this.q = j3;
                this.w = (byte) 3;
                obj = ag3Var2.g(jX, j3, this);
                if (obj != px0Var) {
                    j4 = j;
                    j5 = j3;
                }
                return px0Var;
            }
            if (b != 3) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.q;
            j4 = this.c;
            js2.o(obj);
        }
        return new vj5(vj5.x(j4, vj5.x(j5, ((vj5) obj).g)));
        long jX2 = vj5.x(j, ((vj5) obj).g);
        this.c = j;
        this.q = jX2;
        this.w = (byte) 2;
        obj = ng4Var.g(jX2, this);
        if (obj != px0Var) {
            j2 = jX2;
            j3 = ((vj5) obj).g;
            ag3 ag3Var3 = ng4Var.x;
            long jX3 = vj5.x(j2, j3);
            this.c = j;
            this.q = j3;
            this.w = (byte) 3;
            obj = ag3Var3.g(jX3, j3, this);
            if (obj != px0Var) {
                j4 = j;
                j5 = j3;
                return new vj5(vj5.x(j4, vj5.x(j5, ((vj5) obj).g)));
            }
        }
        return px0Var;
    }
}
