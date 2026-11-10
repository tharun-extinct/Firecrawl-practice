package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import io.appground.blek.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class xk5 {
    public static WeakHashMap g = null;
    public static boolean r = false;
    public static Field y;
    public static final int[] n = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final mk5 v = new mk5();

    public static void a(View view, f2 f2Var, e3 e3Var) {
        s1 s1Var;
        f2 f2VarG = f2Var.g(e3Var);
        View.AccessibilityDelegate accessibilityDelegateR = r(view);
        if (accessibilityDelegateR == null) {
            s1Var = null;
        } else {
            s1Var = accessibilityDelegateR instanceof r1 ? ((r1) accessibilityDelegateR).g : new s1(accessibilityDelegateR);
        }
        if (s1Var == null) {
            s1Var = new s1();
        }
        q(view, s1Var);
        t(view, f2VarG.y());
        v(view).add(f2VarG);
        l(view, 0);
    }

    public static bm5 g(View view) {
        WeakHashMap weakHashMap = g;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            g = weakHashMap;
        }
        bm5 bm5Var = (bm5) weakHashMap.get(view);
        if (bm5Var != null) {
            return bm5Var;
        }
        bm5 bm5Var2 = new bm5(view);
        g.put(view, bm5Var2);
        return bm5Var2;
    }

    public static ut0 j(yl ylVar, ut0 ut0Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + ut0Var + ", view=" + ylVar.getClass().getSimpleName() + "[" + ylVar.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return vk5.y(ylVar, ut0Var);
        }
        if (((q85) ylVar.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return ylVar.n(ut0Var);
        }
        ut0 ut0VarG = q85.g(ylVar, ut0Var);
        if (ut0VarG == null) {
            return null;
        }
        return ylVar.n(ut0VarG);
    }

    public static void l(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = n(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(n(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(n(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            tk5.y(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static CharSequence n(View view) {
        return (CharSequence) new lk5((byte) 1).g(view);
    }

    public static void q(View view, s1 s1Var) {
        if (s1Var == null && (r(view) instanceof r1)) {
            s1Var = new s1();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(s1Var == null ? null : s1Var.t);
    }

    public static View.AccessibilityDelegate r(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return tk5.g(view);
        }
        if (r) {
            return null;
        }
        if (y == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                y = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                r = true;
                return null;
            }
        }
        try {
            Object obj = y.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            r = true;
            return null;
        }
    }

    public static void t(View view, int i) {
        ArrayList arrayListV = v(view);
        for (int i2 = 0; i2 < arrayListV.size(); i2++) {
            if (((f2) arrayListV.get(i2)).y() == i) {
                arrayListV.remove(i2);
                return;
            }
        }
    }

    public static ArrayList v(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void w(View view, CharSequence charSequence) {
        new lk5((byte) 1).y(view, charSequence);
        mk5 mk5Var = v;
        if (charSequence == null) {
            mk5Var.j.remove(view);
            view.removeOnAttachStateChangeListener(mk5Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(mk5Var);
        } else {
            mk5Var.j.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(mk5Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(mk5Var);
            }
        }
    }

    public static String[] x(yl ylVar) {
        return Build.VERSION.SDK_INT >= 31 ? vk5.g(ylVar) : (String[]) ylVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void y(View view, tp5 tp5Var) {
        WindowInsets windowInsetsX = tp5Var.x();
        if (windowInsetsX != null) {
            WindowInsets windowInsetsG = Build.VERSION.SDK_INT >= 30 ? uk5.g(view, windowInsetsX) : nk5.g(view, windowInsetsX);
            if (windowInsetsG.equals(windowInsetsX)) {
                return;
            }
            tp5.l(view, windowInsetsG);
        }
    }
}
