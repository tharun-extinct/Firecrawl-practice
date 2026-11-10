package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes2.dex */
public final class oa5 implements d11 {
    public CharSequence a;
    public int c;
    public Toolbar g;
    public Drawable i;
    public CharSequence j;
    public boolean l;
    public Window.Callback m;
    public Drawable n;
    public boolean q;
    public View r;
    public CharSequence t;
    public Drawable v;
    public z3 w;
    public Drawable x;
    public int y;

    public final void g(int i) {
        View view;
        Toolbar toolbar = this.g;
        int i2 = this.y ^ i;
        this.y = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    y();
                }
                if ((this.y & 4) != 0) {
                    Drawable drawable = this.x;
                    if (drawable == null) {
                        drawable = this.i;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.j);
                    toolbar.setSubtitle(this.t);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.r) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void r() {
        Drawable drawable;
        int i = this.y;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.v) == null) {
            drawable = this.n;
        }
        this.g.setLogo(drawable);
    }

    public final void y() {
        if ((this.y & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.a);
            Toolbar toolbar = this.g;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.c);
            } else {
                toolbar.setNavigationContentDescription(this.a);
            }
        }
    }
}
