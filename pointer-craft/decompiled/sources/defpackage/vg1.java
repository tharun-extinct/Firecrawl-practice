package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class vg1 implements jj3 {
    public int a;
    public final /* synthetic */ byte j = 1;
    public int m;
    public int q;
    public int t;
    public final Object w;

    public vg1(cj cjVar, long j) {
        String str = cjVar.t;
        aq3 aq3Var = new aq3();
        aq3Var.n = str;
        aq3Var.y = -1;
        aq3Var.r = -1;
        this.w = aq3Var;
        this.t = u75.x(j);
        this.a = u75.v(j);
        this.m = -1;
        this.q = -1;
        int iX = u75.x(j);
        int iV = u75.v(j);
        if (iX < 0 || iX > str.length()) {
            l0.p(du4.m(iX, str.length(), "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iV < 0 || iV > str.length()) {
            l0.p(du4.m(iV, str.length(), "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iX <= iV) {
            return;
        }
        l0.u(du4.m(iX, iV, "Do not set reversed range: ", " > "));
        throw null;
    }

    public void g(int i, int i2) {
        long jY = sp2.y(i, i2);
        ((aq3) this.w).q(i, i2, "");
        long jR = ff6.r(sp2.y(this.t, this.a), jY);
        j(u75.x(jR));
        l(u75.v(jR));
        int i3 = this.m;
        if (i3 != -1) {
            long jR2 = ff6.r(sp2.y(i3, this.q), jY);
            if (u75.r(jR2)) {
                this.m = -1;
                this.q = -1;
            } else {
                this.m = u75.x(jR2);
                this.q = u75.v(jR2);
            }
        }
    }

    public void j(int i) {
        if (!(i >= 0)) {
            nc2.g("Cannot set selectionStart to a negative value: " + i);
        }
        this.t = i;
    }

    public void l(int i) {
        if (!(i >= 0)) {
            nc2.g("Cannot set selectionEnd to a negative value: " + i);
        }
        this.a = i;
    }

    public void n(int i, int i2, String str) {
        aq3 aq3Var = (aq3) this.w;
        if (i < 0 || i > aq3Var.r()) {
            l0.p(du4.m(i, aq3Var.r(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > aq3Var.r()) {
            l0.p(du4.m(i2, aq3Var.r(), "end (", ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            l0.u(du4.m(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        aq3Var.q(i, i2, str);
        j(str.length() + i);
        l(str.length() + i);
        this.m = -1;
        this.q = -1;
    }

    public u75 r() {
        int i = this.m;
        if (i != -1) {
            return new u75(sp2.y(i, this.q));
        }
        return null;
    }

    @Override // defpackage.jj3
    public tp5 t(View view, tp5 tp5Var) {
        View view2 = (View) this.w;
        nd2 nd2VarT = tp5Var.g.t(519);
        int i = this.t;
        if (i >= 0) {
            view2.getLayoutParams().height = i + nd2VarT.y;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.a + nd2VarT.g, this.m + nd2VarT.y, this.q + nd2VarT.r, view2.getPaddingBottom());
        return tp5Var;
    }

    public String toString() {
        switch (this.j) {
            case 0:
                return ((aq3) this.w).toString();
            default:
                return super.toString();
        }
    }

    public void v(int i, int i2) {
        aq3 aq3Var = (aq3) this.w;
        if (i < 0 || i > aq3Var.r()) {
            l0.p(du4.m(i, aq3Var.r(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > aq3Var.r()) {
            l0.p(du4.m(i2, aq3Var.r(), "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            l0.u(du4.m(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.m = i;
            this.q = i2;
        }
    }

    public void x(int i, int i2) {
        aq3 aq3Var = (aq3) this.w;
        if (i < 0 || i > aq3Var.r()) {
            l0.p(du4.m(i, aq3Var.r(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > aq3Var.r()) {
            l0.p(du4.m(i2, aq3Var.r(), "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            l0.u(du4.m(i, i2, "Do not set reversed range: ", " > "));
        } else {
            j(i);
            l(i2);
        }
    }

    public char y(int i) {
        aq3 aq3Var = (aq3) this.w;
        si0 si0Var = (si0) aq3Var.v;
        if (si0Var == null) {
            return ((String) aq3Var.n).charAt(i);
        }
        if (i < aq3Var.y) {
            return ((String) aq3Var.n).charAt(i);
        }
        int iN = si0Var.y - si0Var.n();
        int i2 = aq3Var.y;
        if (i >= iN + i2) {
            return ((String) aq3Var.n).charAt(i - ((iN - aq3Var.r) + i2));
        }
        int i3 = i - i2;
        int i4 = si0Var.r;
        char[] cArr = (char[]) si0Var.v;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + si0Var.n];
    }

    public vg1(View view, int i, int i2, int i3, int i4) {
        this.t = i;
        this.w = view;
        this.a = i2;
        this.m = i3;
        this.q = i4;
    }
}
