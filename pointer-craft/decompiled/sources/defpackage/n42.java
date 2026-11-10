package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n42 extends eo5 {
    public n42(m42 m42Var) {
        super(m42Var);
        m42Var.n.x();
        m42Var.v.x();
        this.x = m42Var.u0;
    }

    @Override // defpackage.q51
    public final void g(q51 q51Var) {
        u51 u51Var = this.j;
        if (u51Var.r && !u51Var.a) {
            u51Var.n((int) ((((u51) u51Var.q.get(0)).l * ((m42) this.y).q0) + 0.5f));
        }
    }

    @Override // defpackage.eo5
    public final void n() {
        ts0 ts0Var = this.y;
        m42 m42Var = (m42) ts0Var;
        int i = m42Var.r0;
        int i2 = m42Var.s0;
        int i3 = m42Var.u0;
        u51 u51Var = this.j;
        if (i3 == 1) {
            if (i != -1) {
                u51Var.q.add(ts0Var.T.n.j);
                this.y.T.n.j.m.add(u51Var);
                u51Var.x = i;
            } else if (i2 != -1) {
                u51Var.q.add(ts0Var.T.n.t);
                this.y.T.n.t.m.add(u51Var);
                u51Var.x = -i2;
            } else {
                u51Var.y = true;
                u51Var.q.add(ts0Var.T.n.t);
                this.y.T.n.t.m.add(u51Var);
            }
            w(this.y.n.j);
            w(this.y.n.t);
            return;
        }
        if (i != -1) {
            u51Var.q.add(ts0Var.T.v.j);
            this.y.T.v.j.m.add(u51Var);
            u51Var.x = i;
        } else if (i2 != -1) {
            u51Var.q.add(ts0Var.T.v.t);
            this.y.T.v.t.m.add(u51Var);
            u51Var.x = -i2;
        } else {
            u51Var.y = true;
            u51Var.q.add(ts0Var.T.v.t);
            this.y.T.v.t.m.add(u51Var);
        }
        w(this.y.v.j);
        w(this.y.v.t);
    }

    public final void w(u51 u51Var) {
        u51 u51Var2 = this.j;
        u51Var2.m.add(u51Var);
        u51Var.q.add(u51Var2);
    }
}
