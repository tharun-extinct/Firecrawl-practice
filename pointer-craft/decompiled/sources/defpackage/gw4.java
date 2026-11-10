package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gw4 {
    public boolean g;
    public Object n;
    public final Object r;
    public Object v;
    public final Object y;

    public gw4(boolean z, a51 a51Var) {
        this.g = z;
        this.y = a51Var;
        this.r = c93.y(0.0f);
        this.n = new ArrayList();
    }

    public void g(wm2 wm2Var, float f, long j) {
        pb0 pb0Var = wm2Var.j;
        float fFloatValue = ((Number) ((qg) this.r).n()).floatValue();
        if (fFloatValue > 0.0f) {
            long jY = jj0.y(fFloatValue, j);
            if (!this.g) {
                xd1.F(wm2Var, jY, f, 0L, null, 124);
                return;
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (pb0Var.n() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pb0Var.n() & 4294967295L));
            ro roVar = pb0Var.t;
            long jG = roVar.G();
            roVar.b().q();
            try {
                ((ro) ((y22) roVar.t).t).b().x(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                xd1.F(wm2Var, jY, f, 0L, null, 124);
            } finally {
                du4.d(roVar, jG);
            }
        }
    }

    public void r() {
        k12 k12Var = (k12) this.y;
        k12Var.g.removeCallbacks((ml) this.r);
        this.n = null;
        this.v = null;
        this.g = false;
    }

    public void y(ue2 ue2Var, ox0 ox0Var) {
        gw4 gw4Var;
        float f;
        ArrayList arrayList = (ArrayList) this.n;
        if (ue2Var instanceof p72) {
            arrayList.add(ue2Var);
        } else if (ue2Var instanceof q72) {
            arrayList.remove(((q72) ue2Var).g);
        } else if (ue2Var instanceof gt1) {
            arrayList.add(ue2Var);
        } else if (ue2Var instanceof ht1) {
            arrayList.remove(((ht1) ue2Var).g);
        } else if (ue2Var instanceof ed1) {
            arrayList.add(ue2Var);
        } else if (ue2Var instanceof fd1) {
            arrayList.remove(((fd1) ue2Var).g);
        } else if (!(ue2Var instanceof dd1)) {
            return;
        } else {
            arrayList.remove(((dd1) ue2Var).g);
        }
        ue2 ue2Var2 = (ue2) cj0.s0(arrayList);
        if (yf2.p((ue2) this.v, ue2Var2)) {
            return;
        }
        mu0 mu0Var = null;
        if (ue2Var2 != null) {
            ((a51) this.y).g();
            boolean z = ue2Var2 instanceof p72;
            if (z) {
                f = 0.08f;
            } else if (ue2Var2 instanceof gt1) {
                f = 0.1f;
            } else {
                f = ue2Var2 instanceof ed1 ? 0.16f : 0.0f;
            }
            float f2 = f;
            qe5 qe5Var = l94.g;
            if (!z && ((ue2Var2 instanceof gt1) || (ue2Var2 instanceof ed1))) {
                qe5Var = new qe5(45, dg1.r, 2);
            }
            qe5 qe5Var2 = qe5Var;
            gw4Var = this;
            m50.T(ox0Var, null, new sd3(gw4Var, f2, qe5Var2, mu0Var, (byte) 1), 3);
        } else {
            gw4Var = this;
            ue2 ue2Var3 = (ue2) gw4Var.v;
            qe5 qe5Var3 = l94.g;
            if (!(ue2Var3 instanceof p72) && !(ue2Var3 instanceof gt1) && (ue2Var3 instanceof ed1)) {
                qe5Var3 = new qe5(150, dg1.r, 2);
            }
            m50.T(ox0Var, null, new s12(gw4Var, qe5Var3, mu0Var, (byte) 19), 3);
        }
        gw4Var.v = ue2Var2;
    }

    public gw4(k12 k12Var) {
        this.y = k12Var;
        this.r = new ml((Object) this, (byte) 15);
    }
}
