package defpackage;

import android.R;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 {
    public static final f2 a;
    public static final f2 b;
    public static final f2 c;
    public static final f2 i;
    public static final f2 j;
    public static final f2 l;
    public static final f2 m;
    public static final f2 q;
    public static final f2 s;
    public static final f2 t;
    public static final f2 v;
    public static final f2 w;
    public static final f2 x;
    public final Object g;
    public final e3 n;
    public final Class r;
    public final int y;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new f2((String) null, 1);
        new f2((String) null, 2);
        new f2((String) null, 4);
        new f2((String) null, 8);
        v = new f2((String) null, 16);
        new f2((String) null, 32);
        x = new f2((String) null, 64);
        l = new f2((String) null, 128);
        new f2(256, x2.class);
        new f2(512, x2.class);
        new f2(1024, y2.class);
        new f2(2048, y2.class);
        j = new f2((String) null, 4096);
        t = new f2((String) null, 8192);
        new f2((String) null, 16384);
        new f2((String) null, 32768);
        new f2((String) null, 65536);
        new f2(131072, c3.class);
        a = new f2((String) null, 262144);
        new f2((String) null, 524288);
        m = new f2((String) null, 1048576);
        new f2(2097152, d3.class);
        new f2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        q = new f2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, a3.class);
        w = new f2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        c = new f2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        i = new f2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        b = new f2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        new f2(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new f2(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new f2(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new f2(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new f2(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new f2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, b3.class);
        new f2(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, z2.class);
        new f2(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new f2(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new f2(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new f2(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new f2(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new f2(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new f2(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new f2(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        s = new f2(i2 >= 34 ? t1.g() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i3 = u70.g;
        if (i2 >= 36) {
            if ((i2 < 36 ? i2 * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new f2(accessibilityAction, R.id.ALT, null, null, null);
    }

    public f2(Object obj, int i2, CharSequence charSequence, e3 e3Var, Class cls) {
        this.y = i2;
        this.n = e3Var;
        if (obj == null) {
            this.g = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.g = obj;
        }
        this.r = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f2)) {
            return false;
        }
        Object obj2 = ((f2) obj).g;
        Object obj3 = this.g;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final f2 g(e3 e3Var) {
        return new f2(null, this.y, null, e3Var, this.r);
    }

    public final int hashCode() {
        Object obj = this.g;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean n(View view) {
        e3 e3Var = this.n;
        if (e3Var == null) {
            return false;
        }
        Class cls = this.r;
        if (cls != null) {
            try {
                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (Exception e) {
                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
            }
        }
        return e3Var.r(view);
    }

    public final CharSequence r() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.g).getLabel();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strL = m2.l(this.y);
        if (strL.equals("ACTION_UNKNOWN") && r() != null) {
            strL = r().toString();
        }
        sb.append(strL);
        return sb.toString();
    }

    public final int y() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.g).getId();
    }

    public f2(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public f2(String str, int i2) {
        this(null, i2, str, null, null);
    }
}
