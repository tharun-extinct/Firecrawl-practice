package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n93 extends g90 {
    public final hb3 n;
    public final ArrayList r;
    public final d5 v;
    public final hb3 y;

    public n93() {
        super((byte) 3);
        this.y = xq2.a();
        this.r = new ArrayList();
        this.n = new hb3();
        ed edVar = new ed(this, (byte) 20);
        it4.y(it4.g);
        synchronized (it4.r) {
            it4.j = cj0.x0(it4.j, edVar);
        }
        this.v = new d5(edVar, (byte) 7);
    }

    @Override // defpackage.g90
    public final void g(wj4 wj4Var) {
        this.r.add(new l93(wj4Var));
    }

    @Override // defpackage.g90
    public final void j(yc0 yc0Var) {
        this.n.q(yc0Var);
        g(yc0Var);
        y();
    }

    @Override // defpackage.g90
    public final xy1 l(wj4 wj4Var) {
        hb3 hb3Var = this.n;
        xy1 kn2Var = (xy1) hb3Var.l(wj4Var);
        if (kn2Var == null) {
            kn2Var = new kn2(this, wj4Var, (byte) 5);
            int iX = hb3Var.x(wj4Var);
            if (iX < 0) {
                iX = ~iX;
            }
            Object[] objArr = hb3Var.r;
            Object obj = objArr[iX];
            hb3Var.y[iX] = wj4Var;
            objArr[iX] = kn2Var;
        }
        return kn2Var;
    }

    @Override // defpackage.g90
    public final void r() {
        this.v.y();
        this.r.clear();
        this.n.g();
        synchronized (this.g) {
            this.y.g();
        }
    }

    public final void u(wj4 wj4Var, Object obj) {
        this.r.add(new k93(wj4Var, obj));
    }

    @Override // defpackage.g90
    public final void y() {
        synchronized (this.g) {
            try {
                ArrayList arrayList = this.r;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m93 m93Var = (m93) arrayList.get(i);
                    if (m93Var instanceof k93) {
                        xq2.v(this.y, ((k93) m93Var).g, ((k93) m93Var).y);
                    } else {
                        if (!(m93Var instanceof l93)) {
                            throw new il0();
                        }
                        xq2.A(this.y, ((l93) m93Var).g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.r.clear();
    }
}
