package defpackage;

import androidx.glance.session.SessionWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class zk4 implements tk4 {
    public final Class g;
    public final ec3 n;
    public final ug5 r;
    public final yk4 v;
    public final vq0 y;

    public zk4() {
        vq0 vq0Var = new vq0((byte) 20);
        this.g = SessionWorker.class;
        this.y = vq0Var;
        this.r = mr5.g;
        this.n = new ec3();
        this.v = new yk4(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object y(zk4 zk4Var, bz1 bz1Var, ou0 ou0Var) {
        uk4 uk4Var;
        ec3 ec3Var;
        bz1 bz1Var2;
        cc3 cc3Var;
        if (ou0Var instanceof uk4) {
            uk4Var = (uk4) ou0Var;
            int i = uk4Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                uk4Var.b = i - Integer.MIN_VALUE;
            } else {
                uk4Var = new uk4(zk4Var, ou0Var);
            }
        } else {
            uk4Var = new uk4(zk4Var, ou0Var);
        }
        Object obj = uk4Var.c;
        int i2 = uk4Var.b;
        Object obj2 = px0.j;
        try {
            if (i2 == 0) {
                js2.o(obj);
                ec3Var = zk4Var.n;
                uk4Var.m = zk4Var;
                uk4Var.q = (zz4) bz1Var;
                uk4Var.w = ec3Var;
                uk4Var.b = 1;
                if (ec3Var.y(uk4Var) != obj2) {
                }
                bz1Var2 = bz1Var;
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cc3Var = (cc3) uk4Var.m;
                try {
                    js2.o(obj);
                    cc3Var.x(null);
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    cc3Var.x(null);
                    throw th;
                }
            }
            ec3 ec3Var2 = uk4Var.w;
            bz1 bz1Var3 = (bz1) uk4Var.q;
            zk4 zk4Var2 = (zk4) uk4Var.m;
            js2.o(obj);
            ec3Var = ec3Var2;
            zk4Var = zk4Var2;
            bz1Var2 = bz1Var3;
            bz1Var2 = bz1Var;
            Object obj3 = zk4Var.v;
            uk4Var.m = ec3Var;
            uk4Var.q = null;
            uk4Var.w = null;
            uk4Var.b = 2;
            Object objL = bz1Var2.l(obj3, uk4Var);
            if (objL != obj2) {
                ec3 ec3Var3 = ec3Var;
                obj = objL;
                cc3Var = ec3Var3;
                cc3Var.x(null);
                return obj;
            }
            bz1Var2 = bz1Var;
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            cc3Var = ec3Var;
            cc3Var.x(null);
            throw th;
        }
    }

    public final Object g(bz1 bz1Var, ou0 ou0Var) {
        return y(this, bz1Var, ou0Var);
    }
}
