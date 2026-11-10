package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dz3 implements ob3, ox0 {
    public final /* synthetic */ ob3 j;
    public final fx0 t;

    public dz3(ob3 ob3Var, fx0 fx0Var) {
        this.j = ob3Var;
        this.t = fx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void g(p2 p2Var, ou0 ou0Var) {
        cz3 cz3Var;
        if (ou0Var instanceof cz3) {
            cz3Var = (cz3) ou0Var;
            int i = cz3Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cz3Var.c = i - Integer.MIN_VALUE;
            } else {
                cz3Var = new cz3(this, ou0Var);
            }
        } else {
            cz3Var = new cz3(this, ou0Var);
        }
        Object obj = cz3Var.q;
        int i2 = cz3Var.c;
        try {
            if (i2 == 0) {
                js2.o(obj);
                cz3Var.m = p2Var;
                cz3Var.c = 1;
                ib0 ib0Var = new ib0(1, pw5.o(cz3Var));
                ib0Var.o();
                if (ib0Var.z() == px0.j) {
                    return;
                }
            } else if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                p2Var = cz3Var.m;
                js2.o(obj);
            }
            throw new il0(false);
        } catch (Throwable th) {
            p2Var.g();
            throw th;
        }
    }

    @Override // defpackage.bw4
    public final Object getValue() {
        return this.j.getValue();
    }

    @Override // defpackage.ob3
    public final void setValue(Object obj) {
        this.j.setValue(obj);
    }

    @Override // defpackage.ox0
    public final fx0 w() {
        return this.t;
    }
}
