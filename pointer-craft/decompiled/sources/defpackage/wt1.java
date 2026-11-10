package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wt1 extends Drawable.ConstantState {
    public float a;
    public float b;
    public float c;
    public final Rect f;
    public Drawable.ConstantState g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public dn4 z;

    public wt1(wt1 wt1Var) {
        this.y = 0;
        this.r = false;
        this.n = Integer.MIN_VALUE;
        this.v = false;
        this.x = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.a = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.q = Float.NaN;
        this.w = Integer.MIN_VALUE;
        this.c = Float.NaN;
        this.i = Integer.MIN_VALUE;
        this.b = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.u = Integer.MIN_VALUE;
        this.z = null;
        this.h = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.f = null;
        this.k = FocusRingDrawable.k;
        if (wt1Var != null) {
            this.g = wt1Var.g;
            this.y = wt1Var.y;
            this.r = wt1Var.r;
            this.n = wt1Var.n;
            this.v = wt1Var.v;
            this.x = wt1Var.x;
            this.l = wt1Var.l;
            this.j = wt1Var.j;
            this.t = wt1Var.t;
            this.a = wt1Var.a;
            this.m = wt1Var.m;
            this.q = wt1Var.q;
            this.w = wt1Var.w;
            this.c = wt1Var.c;
            this.i = wt1Var.i;
            this.b = wt1Var.b;
            this.s = wt1Var.s;
            this.p = wt1Var.p;
            this.u = wt1Var.u;
            this.h = wt1Var.h;
            this.o = wt1Var.o;
            dn4 dn4Var = wt1Var.z;
            if (dn4Var instanceof fn4) {
                this.z = ((fn4) dn4Var).m().g();
            } else if (dn4Var instanceof iw4) {
                iw4 iw4Var = (iw4) dn4Var;
                iw4Var.getClass();
                this.z = new z82(iw4Var).m();
            } else {
                this.z = dn4Var;
            }
            if (wt1Var.f != null) {
                this.f = new Rect(wt1Var.f);
            }
            int[] iArr = wt1Var.k;
            this.k = Arrays.copyOf(iArr, iArr.length);
        }
    }

    public final boolean Q() {
        return this.g != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.g;
        return this.y | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, 0 == true ? 1 : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
