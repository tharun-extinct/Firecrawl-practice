package defpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e40 implements y52, rb0 {
    public final fx0 g;
    public int j;
    public int l;
    public final m70 n;
    public final up1 r;
    public final byte[] t;
    public final ew4 v;
    public final f34 x;
    public final v30 y;

    public e40(am1 am1Var, v30 v30Var) {
        am1Var.getClass();
        this.g = am1Var;
        this.y = v30Var;
        up1 up1Var = new up1();
        List listSynchronizedList = Collections.synchronizedList(new LinkedList());
        listSynchronizedList.getClass();
        up1Var.g = listSynchronizedList;
        this.r = up1Var;
        this.n = v70.y(Integer.MAX_VALUE, 6, null);
        ew4 ew4VarW = y94.w(null);
        this.v = ew4VarW;
        this.x = pw5.j(ew4VarW);
        this.t = new byte[]{5, 1, 9, 6, -95, 1, -123, 1, 5, 7, 25, -32, 41, -25, 21, 0, 37, 1, 117, 1, -107, 8, -127, 2, 117, 8, -107, 1, -127, 1, 117, 8, -107, 5, 21, 0, 37, -1, 5, 7, 25, 0, 41, -1, -127, 0, -64, 5, 12, 9, 1, -95, 1, -123, 3, 25, 0, 42, -1, 3, 117, 12, -107, 1, 21, 0, 38, -1, 3, -127, 0, 117, 4, -107, 1, -127, 1, -64};
    }

    @Override // defpackage.rb0
    public final tf0 g() {
        return v54.g(e40.class);
    }

    public final Object n(int i, int i2, boolean z, ou0 ou0Var) {
        Object objF0 = m50.f0(this.g, new b40(z, this, i2, i, null), ou0Var);
        return objF0 == px0.j ? objF0 : og5.g;
    }

    public final Object r(zz4 zz4Var) {
        up1 up1Var = this.r;
        up1Var.g.clear();
        up1Var.y = 0;
        Object objR = this.n.r(zz4Var, new z30(up1Var.y()));
        return objR == px0.j ? objR : og5.g;
    }

    @Override // defpackage.y52
    public final byte[] y() {
        return this.t;
    }
}
