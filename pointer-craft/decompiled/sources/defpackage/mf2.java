package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class mf2 {
    public final /* synthetic */ byte g;
    public final Object n;
    public Object r;
    public boolean y;

    public mf2(boolean z, ii4 ii4Var, si0 si0Var) {
        this.g = (byte) 1;
        this.y = z;
        this.r = ii4Var;
        this.n = si0Var;
    }

    public boolean g(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((rk4) this.n).t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (zq2.a(((su3) obj).g, j)) {
                break;
            }
            i++;
        }
        su3 su3Var = (su3) obj;
        if (su3Var != null) {
            return su3Var.j;
        }
        return false;
    }

    public long j(k65 k65Var, long j, boolean z, up upVar) {
        b65 b65Var = (b65) this.n;
        long jO = b65Var.o(k65Var, j, z, false, upVar, false, null);
        if (!u75.g(jO, (u75) this.r)) {
            this.y = false;
        }
        b65Var.p(u75.r(jO) ? r42.a : r42.t);
        return jO;
    }

    public void l(boolean z) {
        this.y = z;
    }

    public MotionEvent n() {
        return (MotionEvent) ((rk4) this.n).a;
    }

    public cy0 r() {
        si0 si0Var = (si0) this.n;
        int i = si0Var.y;
        int i2 = si0Var.r;
        if (i < i2) {
            return cy0.t;
        }
        return i > i2 ? cy0.j : cy0.a;
    }

    public String toString() {
        switch (this.g) {
            case 1:
                return "SingleSelectionLayout(isStartHandle=" + this.y + ", crossed=" + r() + ", info=\n\t" + ((si0) this.n) + ")";
            default:
                return super.toString();
        }
    }

    public boolean v() {
        return this.y;
    }

    public void x() {
        if (this.y) {
            ((b65) this.n).c((u75) this.r);
        }
    }

    public uy2 y() {
        return (uy2) this.r;
    }

    public mf2(uy2 uy2Var, rk4 rk4Var) {
        this.g = (byte) 0;
        this.r = uy2Var;
        this.n = rk4Var;
    }

    public mf2(b65 b65Var) {
        this.g = (byte) 2;
        this.n = b65Var;
        this.y = true;
    }
}
