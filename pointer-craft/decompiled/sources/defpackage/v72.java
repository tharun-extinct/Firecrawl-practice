package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v72 extends i73 implements tu3 {
    public p72 f;
    public ja3 o;

    @Override // defpackage.i73
    public final void J0() {
        S0();
    }

    @Override // defpackage.tu3
    public final void L(ju3 ju3Var, ku3 ku3Var, long j) {
        if (ku3Var == ku3.t) {
            int i = ju3Var.x;
            mu0 mu0Var = null;
            if (i == 4) {
                m50.T(E0(), null, new u72(this, mu0Var, (byte) 0), 3);
            } else if (i == 5) {
                m50.T(E0(), null, new u72(this, mu0Var, (byte) 1), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(ou0 ou0Var) throws Throwable {
        s72 s72Var;
        p72 p72Var;
        if (ou0Var instanceof s72) {
            s72Var = (s72) ou0Var;
            int i = s72Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s72Var.c = i - Integer.MIN_VALUE;
            } else {
                s72Var = new s72(this, ou0Var);
            }
        } else {
            s72Var = new s72(this, ou0Var);
        }
        Object obj = s72Var.q;
        int i2 = s72Var.c;
        if (i2 == 0) {
            js2.o(obj);
            if (this.f == null) {
                p72 p72Var2 = new p72();
                ja3 ja3Var = this.o;
                s72Var.m = p72Var2;
                s72Var.c = 1;
                Object objY = ja3Var.y(p72Var2, s72Var);
                px0 px0Var = px0.j;
                if (objY == px0Var) {
                    return px0Var;
                }
                p72Var = p72Var2;
            }
            return og5.g;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p72Var = s72Var.m;
        js2.o(obj);
        this.f = p72Var;
        return og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R0(ou0 ou0Var) throws Throwable {
        t72 t72Var;
        if (ou0Var instanceof t72) {
            t72Var = (t72) ou0Var;
            int i = t72Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                t72Var.w = i - Integer.MIN_VALUE;
            } else {
                t72Var = new t72(this, ou0Var);
            }
        } else {
            t72Var = new t72(this, ou0Var);
        }
        Object obj = t72Var.m;
        int i2 = t72Var.w;
        if (i2 == 0) {
            js2.o(obj);
            p72 p72Var = this.f;
            if (p72Var != null) {
                q72 q72Var = new q72(p72Var);
                ja3 ja3Var = this.o;
                t72Var.w = 1;
                Object objY = ja3Var.y(q72Var, t72Var);
                px0 px0Var = px0.j;
                if (objY == px0Var) {
                    return px0Var;
                }
            }
            return og5.g;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        this.f = null;
        return og5.g;
    }

    public final void S0() {
        p72 p72Var = this.f;
        if (p72Var != null) {
            this.o.r(new q72(p72Var));
            this.f = null;
        }
    }

    @Override // defpackage.tu3
    public final void m0() {
        S0();
    }
}
