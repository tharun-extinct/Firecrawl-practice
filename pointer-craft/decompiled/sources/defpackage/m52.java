package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m52 extends eo5 {
    public m52(ts0 ts0Var) {
        super(ts0Var);
    }

    @Override // defpackage.q51
    public final void g(q51 q51Var) {
        bx bxVar = (bx) this.y;
        int i = bxVar.s0;
        u51 u51Var = this.j;
        ArrayList arrayList = u51Var.q;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((u51) obj).l;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            u51Var.n(i3 + bxVar.u0);
        } else {
            u51Var.n(i2 + bxVar.u0);
        }
    }

    @Override // defpackage.eo5
    public final boolean m() {
        return false;
    }

    @Override // defpackage.eo5
    public final void n() {
        ts0 ts0Var = this.y;
        if (ts0Var instanceof bx) {
            u51 u51Var = this.j;
            u51Var.y = true;
            ArrayList arrayList = u51Var.q;
            bx bxVar = (bx) ts0Var;
            int i = bxVar.s0;
            boolean z = bxVar.t0;
            int i2 = 0;
            if (i == 0) {
                u51Var.v = 4;
                while (i2 < bxVar.r0) {
                    ts0 ts0Var2 = bxVar.q0[i2];
                    if (z || ts0Var2.g0 != 8) {
                        u51 u51Var2 = ts0Var2.n.j;
                        u51Var2.m.add(u51Var);
                        arrayList.add(u51Var2);
                    }
                    i2++;
                }
                w(this.y.n.j);
                w(this.y.n.t);
                return;
            }
            if (i == 1) {
                u51Var.v = 5;
                while (i2 < bxVar.r0) {
                    ts0 ts0Var3 = bxVar.q0[i2];
                    if (z || ts0Var3.g0 != 8) {
                        u51 u51Var3 = ts0Var3.n.t;
                        u51Var3.m.add(u51Var);
                        arrayList.add(u51Var3);
                    }
                    i2++;
                }
                w(this.y.n.j);
                w(this.y.n.t);
                return;
            }
            if (i == 2) {
                u51Var.v = 6;
                while (i2 < bxVar.r0) {
                    ts0 ts0Var4 = bxVar.q0[i2];
                    if (z || ts0Var4.g0 != 8) {
                        u51 u51Var4 = ts0Var4.v.j;
                        u51Var4.m.add(u51Var);
                        arrayList.add(u51Var4);
                    }
                    i2++;
                }
                w(this.y.v.j);
                w(this.y.v.t);
                return;
            }
            if (i != 3) {
                return;
            }
            u51Var.v = 7;
            while (i2 < bxVar.r0) {
                ts0 ts0Var5 = bxVar.q0[i2];
                if (z || ts0Var5.g0 != 8) {
                    u51 u51Var5 = ts0Var5.v.t;
                    u51Var5.m.add(u51Var);
                    arrayList.add(u51Var5);
                }
                i2++;
            }
            w(this.y.v.j);
            w(this.y.v.t);
        }
    }

    @Override // defpackage.eo5
    public final void v() {
        ts0 ts0Var = this.y;
        if (ts0Var instanceof bx) {
            int i = ((bx) ts0Var).s0;
            u51 u51Var = this.j;
            if (i == 0 || i == 1) {
                ts0Var.Y = u51Var.l;
            } else {
                ts0Var.Z = u51Var.l;
            }
        }
    }

    public final void w(u51 u51Var) {
        u51 u51Var2 = this.j;
        u51Var2.m.add(u51Var);
        u51Var.q.add(u51Var2);
    }

    @Override // defpackage.eo5
    public final void x() {
        this.r = null;
        this.j.r();
    }
}
