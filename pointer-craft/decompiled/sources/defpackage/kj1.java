package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj1 {
    public final TextInputLayout g;
    public final CheckableImageButton n;
    public final Context r;
    public final jj1 y;

    public kj1(jj1 jj1Var) {
        this.g = jj1Var.j;
        this.y = jj1Var;
        this.r = jj1Var.getContext();
        this.n = jj1Var.c;
    }

    public boolean a() {
        return false;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener j() {
        return null;
    }

    public View.OnFocusChangeListener l() {
        return null;
    }

    public boolean m() {
        return this instanceof jf1;
    }

    public int n() {
        return 0;
    }

    public boolean q() {
        return false;
    }

    public int r() {
        return 0;
    }

    public final void s() {
        this.y.x(false);
    }

    public boolean t(int i) {
        return true;
    }

    public View.OnFocusChangeListener v() {
        return null;
    }

    public View.OnClickListener x() {
        return null;
    }

    public void g() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void b(boolean z) {
    }

    public void c(m2 m2Var) {
    }

    public void i(AccessibilityEvent accessibilityEvent) {
    }

    public void w(EditText editText) {
    }
}
