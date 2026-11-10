package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class gp5 {
    public final tp5 g;
    public final Rect[][] n;
    public final Rect[][] r;
    public nd2[] y;

    public gp5(tp5 tp5Var) {
        this.r = new Rect[10][];
        this.n = new Rect[10][];
        this.g = tp5Var;
        r(tp5Var);
    }

    public final void g() {
        nd2[] nd2VarArr = this.y;
        if (nd2VarArr != null) {
            nd2 nd2VarT = nd2VarArr[0];
            nd2 nd2VarT2 = nd2VarArr[1];
            tp5 tp5Var = this.g;
            if (nd2VarT2 == null) {
                nd2VarT2 = tp5Var.g.t(2);
            }
            if (nd2VarT == null) {
                nd2VarT = tp5Var.g.t(1);
            }
            j(nd2.g(nd2VarT, nd2VarT2));
            nd2 nd2Var = this.y[sp2.u(16)];
            if (nd2Var != null) {
                l(nd2Var);
            }
            nd2 nd2Var2 = this.y[sp2.u(32)];
            if (nd2Var2 != null) {
                v(nd2Var2);
            }
            nd2 nd2Var3 = this.y[sp2.u(64)];
            if (nd2Var3 != null) {
                t(nd2Var3);
            }
        }
    }

    public abstract void j(nd2 nd2Var);

    public void n(int i, nd2 nd2Var) {
        if (this.y == null) {
            this.y = new nd2[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.y[sp2.u(i2)] = nd2Var;
            }
        }
    }

    public void r(tp5 tp5Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listX = tp5Var.g.x(i);
            int iU = sp2.u(i);
            this.r[iU] = (Rect[]) listX.toArray(new Rect[listX.size()]);
            if (i != 8) {
                List<Rect> listL = tp5Var.g.l(i);
                this.n[iU] = (Rect[]) listL.toArray(new Rect[listL.size()]);
            }
        }
    }

    public abstract void x(nd2 nd2Var);

    public abstract tp5 y();

    public gp5() {
        this(new tp5((tp5) null));
    }

    public void l(nd2 nd2Var) {
    }

    public void t(nd2 nd2Var) {
    }

    public void v(nd2 nd2Var) {
    }
}
