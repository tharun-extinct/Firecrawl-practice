package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c8 extends cd1 {
    public q8 Q;
    public Boolean R;
    public bq1 S;
    public j51 T;

    @Override // defpackage.i73
    public final void I0() {
        n1();
    }

    @Override // defpackage.cd1
    public final Object U0(s3 s3Var, n10 n10Var) {
        q8 q8Var = this.Q;
        mu0 mu0Var = null;
        x7 x7Var = new x7(s3Var, this, null);
        ac3 ac3Var = q8Var.x;
        h8 h8Var = new h8(q8Var, x7Var, mu0Var, (byte) 1);
        ac3Var.getClass();
        Object objB = k33.B(new jf2(ub3.j, ac3Var, h8Var, mu0Var, (byte) 1), n10Var);
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        if (objB != px0Var) {
            objB = og5Var;
        }
        return objB == px0Var ? objB : og5Var;
    }

    @Override // defpackage.o41, defpackage.tu3
    public final void g() {
        m0();
        if (this.h) {
            j51 j51Var = k33.V(this).F;
            j51 j51Var2 = this.T;
            if (j51Var2 == null || !j51Var2.equals(j51Var)) {
                this.T = j51Var;
                n1();
            }
        }
    }

    @Override // defpackage.cd1
    public final boolean i1() {
        return this.Q.q.getValue() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l1(float f, ou0 ou0Var) {
        y7 y7Var;
        r54 r54Var;
        if (ou0Var instanceof y7) {
            y7Var = (y7) ou0Var;
            int i = y7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y7Var.c = i - Integer.MIN_VALUE;
            } else {
                y7Var = new y7(this, ou0Var);
            }
        } else {
            y7Var = new y7(this, ou0Var);
        }
        Object obj = y7Var.q;
        int i2 = y7Var.c;
        byte b = 1;
        if (i2 == 0) {
            js2.o(obj);
            boolean zR = this.Q.r();
            mu0 mu0Var = null;
            Object obj2 = px0.j;
            if (zR) {
                q8 q8Var = this.Q;
                y7Var.c = 1;
                if (!q8Var.r()) {
                    pc2.g("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                }
                Object value = q8Var.l.getValue();
                l11 l11VarY = q8Var.y();
                float fV = q8Var.v();
                xy1 xy1Var = q8Var.y;
                if (xy1Var == null) {
                    yf2.Y("positionalThreshold");
                    throw null;
                }
                my1 my1Var = q8Var.r;
                if (my1Var == null) {
                    yf2.Y("velocityThreshold");
                    throw null;
                }
                Object objP = og0.p(l11VarY, fV, f, xy1Var, my1Var);
                Object objT = ((Boolean) q8Var.g.a(objP)).booleanValue() ? og0.t(q8Var, objP, f, y7Var) : og0.t(q8Var, value, f, y7Var);
                if (objT != obj2) {
                    return objT;
                }
            } else {
                r54 r54Var2 = new r54();
                r54Var2.j = f;
                q8 q8Var2 = this.Q;
                a8 a8Var = new a8(this, r54Var2, f, null);
                y7Var.m = r54Var2;
                y7Var.c = 2;
                ac3 ac3Var = q8Var2.x;
                h8 h8Var = new h8(q8Var2, a8Var, mu0Var, b);
                ac3Var.getClass();
                Object objB = k33.B(new jf2(ub3.j, ac3Var, h8Var, mu0Var, (byte) 1), y7Var);
                if (objB != obj2) {
                    objB = og5.g;
                }
                if (objB != obj2) {
                    r54Var = r54Var2;
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            js2.o(obj);
            return obj;
        }
        if (i2 != 2) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r54Var = y7Var.m;
        js2.o(obj);
        return new Float(r54Var.j);
    }

    public final boolean m1() {
        Boolean bool = this.R;
        if (bool == null) {
            return k33.V(this).G == fl2.t && this.k == um3.t;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final void n1() {
        qe5 qe5Var = h7.g;
        l1 l1Var = h7.y;
        j51 j51Var = k33.V(this).F;
        this.T = j51Var;
        q8 q8Var = this.Q;
        this.S = new ts4(new ro((Object) q8Var, (Object) l1Var, (Object) new j7(j51Var, (byte) 0), (byte) 1), og0.y, qe5Var);
    }
}
