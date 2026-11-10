package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class pp5 {
    public static final tp5 y;
    public final tp5 g;

    static {
        gp5 ap5Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ap5Var = new fp5();
        } else if (i >= 35) {
            ap5Var = new ep5();
        } else if (i >= 34) {
            ap5Var = new dp5();
        } else if (i >= 31) {
            ap5Var = new cp5();
        } else if (i >= 30) {
            ap5Var = new bp5();
        } else {
            ap5Var = i >= 29 ? new ap5() : new zo5();
        }
        y = ap5Var.y().g.g().g.y().g.r();
    }

    public pp5(tp5 tp5Var) {
        this.g = tp5Var;
    }

    public nd2 a(int i) {
        if ((i & 8) == 0) {
            return nd2.v;
        }
        l0.u("Unable to query the maximum insets for IME");
        return null;
    }

    public nd2 c() {
        return nd2.v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp5)) {
            return false;
        }
        pp5 pp5Var = (pp5) obj;
        return z() == pp5Var.z() && u() == pp5Var.u() && Objects.equals(c(), pp5Var.c()) && Objects.equals(q(), pp5Var.q()) && Objects.equals(j(), pp5Var.j());
    }

    public tp5 g() {
        return this.g;
    }

    public boolean h(int i) {
        return true;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(z()), Boolean.valueOf(u()), c(), q(), j());
    }

    public nd2 i() {
        return c();
    }

    public pa1 j() {
        return null;
    }

    public List<Rect> l(int i) {
        return Collections.EMPTY_LIST;
    }

    public nd2 m() {
        return c();
    }

    public tp5 p(int i, int i2, int i3, int i4) {
        return y;
    }

    public nd2 q() {
        return nd2.v;
    }

    public tp5 r() {
        return this.g;
    }

    public nd2 t(int i) {
        return nd2.v;
    }

    public boolean u() {
        return false;
    }

    public nd2 w() {
        return c();
    }

    public List<Rect> x(int i) {
        return Collections.EMPTY_LIST;
    }

    public tp5 y() {
        return this.g;
    }

    public boolean z() {
        return false;
    }

    public void s() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void b(View view) {
    }

    public void d(tp5 tp5Var) {
    }

    public void e(nd2 nd2Var) {
    }

    public void f(nd2[] nd2VarArr) {
    }

    public void k(nd2 nd2Var) {
    }

    public void n(View view) {
    }

    public void o(ra1 ra1Var) {
    }

    public void v(tp5 tp5Var) {
    }
}
