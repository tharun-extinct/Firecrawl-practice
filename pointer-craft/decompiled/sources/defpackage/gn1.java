package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import io.appground.blek.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gn1 extends lc5 {
    public static final String[] K = {"android:visibility:visibility", "android:visibility:parent"};
    public final byte J;

    public gn1() {
        this.J = (byte) 3;
    }

    public static void L(zc5 zc5Var) {
        View view = zc5Var.y;
        int visibility = view.getVisibility();
        HashMap map = zc5Var.g;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float N(zc5 zc5Var, float f) {
        Float f2;
        return (zc5Var == null || (f2 = (Float) zc5Var.g.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static wm5 O(zc5 zc5Var, zc5 zc5Var2) {
        wm5 wm5Var = new wm5();
        wm5Var.g = false;
        wm5Var.y = false;
        if (zc5Var != null) {
            HashMap map = zc5Var.g;
            if (map.containsKey("android:visibility:visibility")) {
                wm5Var.r = ((Integer) map.get("android:visibility:visibility")).intValue();
                wm5Var.v = (ViewGroup) map.get("android:visibility:parent");
            } else {
                wm5Var.r = -1;
                wm5Var.v = null;
            }
        } else {
            wm5Var.r = -1;
            wm5Var.v = null;
        }
        if (zc5Var2 != null) {
            HashMap map2 = zc5Var2.g;
            if (map2.containsKey("android:visibility:visibility")) {
                wm5Var.n = ((Integer) map2.get("android:visibility:visibility")).intValue();
                wm5Var.x = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                wm5Var.n = -1;
                wm5Var.x = null;
            }
        } else {
            wm5Var.n = -1;
            wm5Var.x = null;
        }
        if (zc5Var != null && zc5Var2 != null) {
            int i = wm5Var.r;
            int i2 = wm5Var.n;
            if (i != i2 || wm5Var.v != wm5Var.x) {
                if (i != i2) {
                    if (i == 0) {
                        wm5Var.y = false;
                        wm5Var.g = true;
                        return wm5Var;
                    }
                    if (i2 == 0) {
                        wm5Var.y = true;
                        wm5Var.g = true;
                        return wm5Var;
                    }
                } else {
                    if (wm5Var.x == null) {
                        wm5Var.y = false;
                        wm5Var.g = true;
                        return wm5Var;
                    }
                    if (wm5Var.v == null) {
                        wm5Var.y = true;
                        wm5Var.g = true;
                        return wm5Var;
                    }
                }
            }
        } else {
            if (zc5Var == null && wm5Var.n == 0) {
                wm5Var.y = true;
                wm5Var.g = true;
                return wm5Var;
            }
            if (zc5Var2 == null && wm5Var.r == 0) {
                wm5Var.y = false;
                wm5Var.g = true;
            }
        }
        return wm5Var;
    }

    public final ObjectAnimator M(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        jm5.n(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, jm5.y, f2);
        fn1 fn1Var = new fn1(view);
        objectAnimatorOfFloat.addListener(fn1Var);
        i().g(fn1Var);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.lc5
    public final void l(zc5 zc5Var) {
        L(zc5Var);
        View view = zc5Var.y;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(jm5.g(view)) : Float.valueOf(0.0f);
        }
        zc5Var.g.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (O(c(r3, false), p(r3, false)).g != false) goto L9;
     */
    @Override // defpackage.lc5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator m(android.view.ViewGroup r19, defpackage.zc5 r20, defpackage.zc5 r21) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn1.m(android.view.ViewGroup, zc5, zc5):android.animation.Animator");
    }

    @Override // defpackage.lc5
    public final void n(zc5 zc5Var) {
        L(zc5Var);
    }

    @Override // defpackage.lc5
    public final String[] s() {
        return K;
    }

    @Override // defpackage.lc5
    public final boolean z(zc5 zc5Var, zc5 zc5Var2) {
        if (zc5Var == null && zc5Var2 == null) {
            return false;
        }
        if (zc5Var != null && zc5Var2 != null && zc5Var2.g.containsKey("android:visibility:visibility") != zc5Var.g.containsKey("android:visibility:visibility")) {
            return false;
        }
        wm5 wm5VarO = O(zc5Var, zc5Var2);
        if (wm5VarO.g) {
            return wm5VarO.r == 0 || wm5VarO.n == 0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gn1(int i) {
        this();
        this.J = i;
    }
}
