package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class iy0 {
    public k65 a;
    public k44 c;
    public final ba g;
    public k44 i;
    public boolean j;
    public boolean l;
    public j75 m;
    public boolean n;
    public aj3 q;
    public boolean t;
    public boolean v;
    public boolean x;
    public final ro y;
    public final Object r = new Object();
    public xy1 w = in0.a;
    public final CursorAnchorInfo.Builder b = new CursorAnchorInfo.Builder();
    public final float[] s = l33.g();
    public final Matrix p = new Matrix();

    public iy0(ba baVar, ro roVar) {
        this.g = baVar;
        this.y = roVar;
    }

    public final void g() {
        ro roVar = this.y;
        wp2 wp2Var = (wp2) roVar.a;
        InputMethodManager inputMethodManager = (InputMethodManager) wp2Var.getValue();
        View view = (View) roVar.t;
        if (inputMethodManager.isActive(view)) {
            xy1 xy1Var = this.w;
            float[] fArr = this.s;
            xy1Var.a(new l33(fArr));
            this.g.f(fArr);
            Matrix matrix = this.p;
            gp4.Q(matrix, fArr);
            k65 k65Var = this.a;
            k65Var.getClass();
            aj3 aj3Var = this.q;
            aj3Var.getClass();
            j75 j75Var = this.m;
            j75Var.getClass();
            k44 k44Var = this.c;
            k44Var.getClass();
            k44 k44Var2 = this.i;
            k44Var2.getClass();
            ((InputMethodManager) wp2Var.getValue()).updateCursorAnchorInfo(view, be6.g(this.b, k65Var, aj3Var, j75Var, matrix, k44Var, k44Var2, this.x, this.l, this.j, this.t));
            this.v = false;
        }
    }
}
