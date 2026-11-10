package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ j4(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Application application;
        o4 o4Var;
        View viewFindFocus;
        byte b = this.j;
        Boolean bool = null;
        byte b2 = 3;
        byte b3 = 2;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = p4.l;
                Method method = p4.x;
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i != 26 && i != 27) || method != null) && (p4.v != null || p4.n != null)) {
                    try {
                        Object obj3 = p4.r.get(activity);
                        if (obj3 != null && (obj = p4.y.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            o4 o4Var2 = new o4(activity);
                            application2.registerActivityLifecycleCallbacks(o4Var2);
                            handler.post(new i26(o4Var2, obj3, b3));
                            try {
                                if (i == 26 || i == 27) {
                                    Boolean bool2 = Boolean.FALSE;
                                    application = application2;
                                    application2 = null;
                                    o4Var = o4Var2;
                                    o4Var2 = null;
                                    try {
                                        method.invoke(obj, obj3, null, null, 0, bool2, null, null, bool2, bool2);
                                    } catch (Throwable th) {
                                        th = th;
                                        handler.post(new i26(application, o4Var, b2));
                                        throw th;
                                    }
                                    break;
                                } else {
                                    activity.recreate();
                                    application = application2;
                                    o4Var = o4Var2;
                                }
                                handler.post(new i26(application, o4Var, b2));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                application = application2;
                                o4Var = o4Var2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                ActionMode actionMode = ((cf) obj2).j;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 2:
                ((CarouselLayoutManager) obj2).B0();
                return;
            case 3:
                ((rh0) obj2).z(true);
                return;
            case 4:
                ul0 ul0Var = (ul0) obj2;
                Runnable runnable = ul0Var.t;
                if (runnable != null) {
                    runnable.run();
                    ul0Var.t = null;
                    return;
                }
                return;
            case 5:
                em0.x((em0) obj2);
                return;
            case 6:
                jf1 jf1Var = (jf1) obj2;
                boolean zIsPopupShowing = jf1Var.j.isPopupShowing();
                jf1Var.z(zIsPopupShowing);
                jf1Var.w = zIsPopupShowing;
                return;
            case 7:
                Iterator it = ((kx1) obj2).c.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    uo1.B();
                    return;
                }
                return;
            case 8:
                ((s24) obj2).q();
                return;
            case 9:
                j94.setRippleState$lambda$1((j94) obj2);
                return;
            case 10:
                l12 l12Var = (l12) obj2;
                if (l12Var.v) {
                    return;
                }
                l12Var.v = true;
                m46 m46Var = l12Var.n;
                synchronized (m46Var.n) {
                    try {
                        int i2 = m46Var.g + 1;
                        m46Var.g = i2;
                        if (i2 == 1) {
                            m46Var.g();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((zk1) obj2).g = true;
                return;
            case 12:
                g50 g50Var = (g50) obj2;
                g50Var.y = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) g50Var.v;
                el5 el5Var = sideSheetBehavior.t;
                if (el5Var != null && el5Var.x()) {
                    g50Var.g(g50Var.r);
                    return;
                } else {
                    if (sideSheetBehavior.j == 2) {
                        sideSheetBehavior.p(g50Var.r);
                        return;
                    }
                    return;
                }
            case 13:
                s05 s05Var = ((u05) obj2).g;
                ViewParent parent = s05Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(s05Var);
                    return;
                }
                return;
            case 14:
                int[][] iArr = TextInputLayout.K0;
                ((TextInputLayout) obj2).q.requestLayout();
                return;
            default:
                x65 x65Var = (x65) obj2;
                ro roVar = x65Var.y;
                x65Var.c = null;
                rb3 rb3Var = x65Var.w;
                View view = x65Var.g;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    rb3Var.j();
                    return;
                }
                Object[] objArr = rb3Var.j;
                int i3 = rb3Var.a;
                Boolean boolValueOf = null;
                for (int i4 = 0; i4 < i3; i4++) {
                    w65 w65Var = (w65) objArr[i4];
                    int iOrdinal = w65Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            up.y();
                            return;
                        } else if (!yf2.p(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(w65Var == w65.a);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                rb3Var.j();
                if (yf2.p(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((wp2) roVar.a).getValue()).restartInput((View) roVar.t);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((et4) ((jy3) roVar.m).j).n();
                    } else {
                        ((et4) ((jy3) roVar.m).j).g();
                    }
                }
                if (yf2.p(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((wp2) roVar.a).getValue()).restartInput((View) roVar.t);
                    return;
                }
                return;
        }
    }
}
