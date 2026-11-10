package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lk5 {
    public final int g;
    public final byte n;
    public final byte r;
    public final /* synthetic */ byte v;
    public final Class y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lk5(byte b) {
        this(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
        this.v = b;
        switch (b) {
            case 1:
                this(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
                break;
            case 2:
                this(R.id.tag_state_description, CharSequence.class, 64, 30);
                break;
            case 3:
                this(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
                break;
            default:
                break;
        }
    }

    public final Object g(View view) {
        if (Build.VERSION.SDK_INT < this.r) {
            Object tag = view.getTag(this.g);
            if (this.y.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        switch (this.v) {
            case 0:
                return Boolean.valueOf(sk5.r(view));
            case 1:
                return sk5.g(view);
            case 2:
                return uk5.y(view);
            default:
                return Boolean.valueOf(sk5.y(view));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0031. Please report as an issue. */
    public final void y(View view, Object obj) {
        boolean zEquals;
        boolean z;
        s1 s1Var;
        int i = Build.VERSION.SDK_INT;
        byte b = this.r;
        byte b2 = this.v;
        if (i >= b) {
            switch (b2) {
                case 0:
                    sk5.x(view, ((Boolean) obj).booleanValue());
                    break;
                case 1:
                    sk5.v(view, (CharSequence) obj);
                    break;
                case 2:
                    uk5.r(view, (CharSequence) obj);
                    break;
                default:
                    sk5.n(view, ((Boolean) obj).booleanValue());
                    break;
            }
            return;
        }
        Object objG = g(view);
        boolean z2 = false;
        switch (b2) {
            case 0:
                Boolean bool = (Boolean) objG;
                Boolean bool2 = (Boolean) obj;
                if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                    z2 = true;
                }
                z = !z2;
                break;
            case 1:
                zEquals = TextUtils.equals((CharSequence) objG, (CharSequence) obj);
                z = !zEquals;
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) objG, (CharSequence) obj);
                z = !zEquals;
                break;
            default:
                Boolean bool3 = (Boolean) objG;
                Boolean bool4 = (Boolean) obj;
                if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                    z2 = true;
                }
                z = !z2;
                break;
        }
        if (z) {
            View.AccessibilityDelegate accessibilityDelegateR = xk5.r(view);
            if (accessibilityDelegateR == null) {
                s1Var = null;
            } else {
                s1Var = accessibilityDelegateR instanceof r1 ? ((r1) accessibilityDelegateR).g : new s1(accessibilityDelegateR);
            }
            if (s1Var == null) {
                s1Var = new s1();
            }
            xk5.q(view, s1Var);
            view.setTag(this.g, obj);
            xk5.l(view, this.n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lk5(int i, Class cls, int i2, int i3) {
        this.g = i;
        this.y = cls;
        this.n = i2;
        this.r = i3;
    }
}
