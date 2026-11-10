package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ph3 {
    public final ng4 g;
    public boolean n;
    public j51 r;
    public final cd2 v = new cd2((byte) 9);
    public final bz1 y;

    public ph3(ng4 ng4Var, bz1 bz1Var, j51 j51Var) {
        this.g = ng4Var;
        this.y = bz1Var;
        this.r = j51Var;
    }

    public static void g(ju3 ju3Var) {
        List list = ju3Var.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((qu3) list.get(i)).g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(bz1 bz1Var, ou0 ou0Var) throws Throwable {
        oh3 oh3Var;
        if (ou0Var instanceof oh3) {
            oh3Var = (oh3) ou0Var;
            int i = oh3Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                oh3Var.w = i - Integer.MIN_VALUE;
            } else {
                oh3Var = new oh3(this, ou0Var);
            }
        } else {
            oh3Var = new oh3(this, ou0Var);
        }
        Object obj = oh3Var.m;
        int i2 = oh3Var.w;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(obj);
            this.n = true;
            s12 s12Var = new s12(this, bz1Var, mu0Var, (byte) 8);
            oh3Var.w = 1;
            fx0 fx0Var = oh3Var.t;
            fx0Var.getClass();
            xy4 xy4Var = new xy4(oh3Var, fx0Var);
            Object objG = lr2.G(xy4Var, true, xy4Var, s12Var);
            px0 px0Var = px0.j;
            if (objG == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        this.n = false;
        return og5.g;
    }

    public final void y(j51 j51Var) {
        this.r = j51Var;
    }
}
