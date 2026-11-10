package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ag4 implements xf3 {
    public final ng4 j;
    public boolean t;

    public ag4(ng4 ng4Var, boolean z) {
        this.j = ng4Var;
        this.t = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xf3
    public final Object P(long j, long j2, mu0 mu0Var) throws Throwable {
        zf4 zf4Var;
        long jX;
        if (mu0Var instanceof zf4) {
            zf4Var = (zf4) mu0Var;
            int i = zf4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zf4Var.c = i - Integer.MIN_VALUE;
            } else {
                zf4Var = new zf4(this, (ou0) mu0Var);
            }
        } else {
            zf4Var = new zf4(this, (ou0) mu0Var);
        }
        Object objG = zf4Var.q;
        int i2 = zf4Var.c;
        if (i2 == 0) {
            js2.o(objG);
            jX = 0;
            if (this.t) {
                ng4 ng4Var = this.j;
                if (!ng4Var.t) {
                    zf4Var.m = j2;
                    zf4Var.c = 1;
                    objG = ng4Var.g(j2, zf4Var);
                    px0 px0Var = px0.j;
                    if (objG == px0Var) {
                        return px0Var;
                    }
                }
                jX = vj5.x(j2, jX);
            }
            return vj5.g(jX);
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = zf4Var.m;
        js2.o(objG);
        jX = ((vj5) objG).a();
        jX = vj5.x(j2, jX);
        return vj5.g(jX);
    }

    @Override // defpackage.xf3
    public final long Q(int i, long j, long j2) {
        if (!this.t) {
            return 0L;
        }
        ng4 ng4Var = this.j;
        if (ng4Var.g.y()) {
            return 0L;
        }
        return ng4Var.t(ng4Var.v(ng4Var.g.v(ng4Var.v(ng4Var.j(j2)))));
    }
}
