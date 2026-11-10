package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zp4 extends g90 {
    public final d5 j;
    public final s94 l;
    public ib3 n;
    public Object r;
    public ib3 v;
    public wj4 x;
    public Object y;

    public zp4() {
        super((byte) 3);
        this.l = new s94(this, (byte) 8);
        f fVar = new f(this, (byte) 27);
        it4.y(it4.g);
        synchronized (it4.r) {
            it4.j = cj0.x0(it4.j, fVar);
        }
        this.j = new d5(fVar, (byte) 7);
    }

    @Override // defpackage.g90
    public final void g(wj4 wj4Var) {
        this.r = null;
        this.v = null;
    }

    @Override // defpackage.g90
    public final void j(yc0 yc0Var) {
        this.x = null;
        this.r = null;
        this.v = null;
        y();
    }

    @Override // defpackage.g90
    public final xy1 l(wj4 wj4Var) {
        wj4 wj4Var2 = this.x;
        if (wj4Var2 != null && !wj4Var2.equals(wj4Var)) {
            aw3.y("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.x = wj4Var;
        return this.l;
    }

    @Override // defpackage.g90
    public final void r() {
        this.j.y();
        this.r = null;
        this.v = null;
        synchronized (this.g) {
            this.x = null;
            this.y = null;
            this.n = null;
        }
    }

    @Override // defpackage.g90
    public final void y() {
        synchronized (this.g) {
            try {
                this.y = this.r;
                if (this.v == null) {
                    this.n = null;
                } else {
                    ib3 ib3Var = this.n;
                    if (ib3Var == null) {
                        ib3 ib3Var2 = fe4.g;
                        ib3Var = new ib3();
                        this.n = ib3Var;
                    }
                    this.n = this.v;
                    this.v = ib3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
