package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class e33 extends Drawable.ConstantState {
    public float a;
    public final Paint.Style b;
    public int c;
    public dn4 g;
    public int i;
    public final float j;
    public Rect l;
    public int m;
    public ColorStateList n;
    public float q;
    public ColorStateList r;
    public float t;
    public ColorStateList v;
    public float w;
    public PorterDuff.Mode x;
    public zg1 y;

    public e33(e33 e33Var) {
        this.r = null;
        this.n = null;
        this.v = null;
        this.x = PorterDuff.Mode.SRC_IN;
        this.l = null;
        this.j = 1.0f;
        this.t = 1.0f;
        this.m = 255;
        this.q = 0.0f;
        this.w = 0.0f;
        this.c = 0;
        this.i = 0;
        this.b = Paint.Style.FILL_AND_STROKE;
        this.g = e33Var.g;
        this.y = e33Var.y;
        this.a = e33Var.a;
        this.r = e33Var.r;
        this.n = e33Var.n;
        this.x = e33Var.x;
        this.v = e33Var.v;
        this.m = e33Var.m;
        this.j = e33Var.j;
        this.i = e33Var.i;
        this.t = e33Var.t;
        this.q = e33Var.q;
        this.w = e33Var.w;
        this.c = e33Var.c;
        this.b = e33Var.b;
        if (e33Var.l != null) {
            this.l = new Rect(e33Var.l);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g33 g33Var = new g33(this);
        g33Var.w = true;
        g33Var.c = true;
        return g33Var;
    }

    public e33(dn4 dn4Var) {
        this.r = null;
        this.n = null;
        this.v = null;
        this.x = PorterDuff.Mode.SRC_IN;
        this.l = null;
        this.j = 1.0f;
        this.t = 1.0f;
        this.m = 255;
        this.q = 0.0f;
        this.w = 0.0f;
        this.c = 0;
        this.i = 0;
        this.b = Paint.Style.FILL_AND_STROKE;
        this.g = dn4Var;
        this.y = null;
    }
}
