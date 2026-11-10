package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class y44 extends ViewGroup.MarginLayoutParams {
    public boolean a;
    public n54 j;
    public boolean m;
    public final Rect t;

    public y44(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = new Rect();
        this.a = true;
        this.m = false;
    }

    public y44(int i, int i2) {
        super(i, i2);
        this.t = new Rect();
        this.a = true;
        this.m = false;
    }

    public y44(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.t = new Rect();
        this.a = true;
        this.m = false;
    }

    public y44(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.t = new Rect();
        this.a = true;
        this.m = false;
    }

    public y44(y44 y44Var) {
        super((ViewGroup.LayoutParams) y44Var);
        this.t = new Rect();
        this.a = true;
        this.m = false;
    }
}
