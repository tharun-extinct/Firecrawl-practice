package defpackage;

import android.R;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class le0 extends s1 {
    public final Chip b;
    public final /* synthetic */ Chip h;
    public final AccessibilityManager i;
    public em1 s;
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final t32 f = new t32((byte) 19);
    public static final bi6 k = new bi6(19);
    public final Rect m = new Rect();
    public final Rect q = new Rect();
    public final Rect w = new Rect();
    public final int[] c = new int[2];
    public int p = Integer.MIN_VALUE;
    public int u = Integer.MIN_VALUE;
    public int z = Integer.MIN_VALUE;

    public le0(Chip chip, Chip chip2) {
        this.h = chip;
        this.b = chip2;
        this.i = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    public final boolean a(int i) {
        if (this.u != i) {
            return false;
        }
        this.u = Integer.MIN_VALUE;
        b(i, false);
        p(i, 8);
        return true;
    }

    public final void b(int i, boolean z) {
        Chip chip = this.h;
        if (i == 1) {
            chip.z = z;
        }
        oe0 oe0Var = chip.q;
        boolean z2 = chip.z;
        boolean zX = false;
        if (oe0Var.b0 != null) {
            zX = oe0Var.X(z2 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : oe0.V0);
        }
        if (zX) {
            chip.refreshDrawableState();
        }
    }

    public final m2 c(int i) {
        if (i != -1) {
            return m(i);
        }
        Chip chip = this.b;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        m2 m2Var = new m2(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = xk5.g;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        q(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            t94.v("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m2Var.n(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return m2Var;
    }

    public final void i(int i, m2 m2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = m2Var.g;
        if (i != 1) {
            m2Var.C("");
            accessibilityNodeInfo.setBoundsInParent(Chip.D);
            return;
        }
        Chip chip = this.h;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            m2Var.C(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            m2Var.C(chip.getContext().getString(io.appground.blek.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        m2Var.y(f2.v);
        m2Var.G(chip.isEnabled());
        m2Var.d(Button.class.getName());
    }

    public final m2 m(int i) {
        m2 m2VarS = m2.s();
        AccessibilityNodeInfo accessibilityNodeInfo = m2VarS.g;
        m2VarS.G(true);
        m2VarS.I(true);
        m2VarS.d("android.view.View");
        Rect rect = o;
        accessibilityNodeInfo.setBoundsInParent(rect);
        m2VarS.o(rect);
        Chip chip = this.b;
        m2VarS.U(chip);
        i(i, m2VarS);
        if (m2VarS.w() == null && accessibilityNodeInfo.getContentDescription() == null) {
            t94.v("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.q;
        accessibilityNodeInfo.getBoundsInParent(rect2);
        Rect rect3 = this.m;
        m2VarS.t(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            t94.v("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfo.getActions();
        if ((actions & 64) != 0) {
            t94.v("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            t94.v("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        m2VarS.S(chip.getContext().getPackageName());
        m2VarS.d0(chip, i);
        if (this.p == i) {
            m2VarS.u(true);
            m2VarS.g(128);
        } else {
            m2VarS.u(false);
            m2VarS.g(64);
        }
        boolean z = this.u == i;
        if (z) {
            m2VarS.g(2);
        } else if (accessibilityNodeInfo.isFocusable()) {
            m2VarS.g(1);
        }
        m2VarS.J(z);
        int[] iArr = this.c;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfo.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (m2VarS.y != -1) {
                m2 m2VarS2 = m2.s();
                AccessibilityNodeInfo accessibilityNodeInfo2 = m2VarS2.g;
                Rect rect5 = new Rect();
                for (int i2 = m2VarS.y; i2 != -1; i2 = m2VarS2.y) {
                    m2VarS2.V(chip, -1);
                    accessibilityNodeInfo2.setBoundsInParent(rect);
                    i(i2, m2VarS2);
                    accessibilityNodeInfo2.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            m2VarS.o(rect4);
            m2VarS.t(rect3);
        }
        Rect rect6 = this.w;
        if (chip.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect6)) {
                m2VarS.o(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        m2VarS.n0(true);
                    }
                }
            }
        }
        return m2VarS;
    }

    @Override // defpackage.s1
    public final void n(View view, m2 m2Var) {
        this.j.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
        Chip chip = this.h;
        oe0 oe0Var = chip.q;
        m2Var.f(oe0Var != null && oe0Var.g0);
        m2Var.e(chip.isClickable());
        m2Var.d(chip.getAccessibilityClassName());
        m2Var.f0(chip.getText());
    }

    public final void p(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.i.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            m2 m2VarC = c(i);
            accessibilityEventObtain.getText().add(m2VarC.w());
            AccessibilityNodeInfo accessibilityNodeInfo = m2VarC.g;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                t94.v("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                accessibilityEventObtain.setSource(view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    public final void q(ArrayList arrayList) {
        oe0 oe0Var;
        arrayList.add(0);
        Rect rect = Chip.D;
        Chip chip = this.h;
        if (!chip.r() || (oe0Var = chip.q) == null || !oe0Var.a0 || chip.i == null) {
            return;
        }
        arrayList.add(1);
    }

    public final boolean s(int i) {
        int i2;
        Chip chip = this.b;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.u) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            a(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.u = i;
        b(i, true);
        p(i, 8);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    public final boolean w(int i, Rect rect) {
        int i2;
        Object obj;
        m2 m2Var;
        ArrayList arrayList = new ArrayList();
        q(arrayList);
        nu4 nu4Var = new nu4(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            nu4Var.n(((Integer) arrayList.get(i3)).intValue(), m(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.u;
        int iR = Integer.MIN_VALUE;
        m2 m2Var2 = i4 == Integer.MIN_VALUE ? null : (m2) c93.o(nu4Var, i4);
        t32 t32Var = f;
        bi6 bi6Var = k;
        Chip chip = this.b;
        int i5 = -1;
        if (i == 1 || i == 2) {
            boolean z = chip.getLayoutDirection() == 1;
            bi6Var.getClass();
            int iV = nu4Var.v();
            ArrayList arrayList2 = new ArrayList(iV);
            for (int i6 = 0; i6 < iV; i6++) {
                arrayList2.add((m2) nu4Var.x(i6));
            }
            Collections.sort(arrayList2, new yt1(z, t32Var));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (m2Var2 != null) {
                    size = arrayList2.indexOf(m2Var2);
                }
                int i7 = size - 1;
                obj = i7 >= 0 ? arrayList2.get(i7) : null;
            } else {
                if (i != 2) {
                    l0.u("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (m2Var2 == null ? -1 : arrayList2.lastIndexOf(m2Var2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            m2Var = (m2) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                l0.u("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i8 = this.u;
            if (i8 != Integer.MIN_VALUE) {
                c(i8).t(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        l0.u("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    l0.u("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            bi6Var.getClass();
            int iV2 = nu4Var.v();
            Rect rect4 = new Rect();
            m2Var = null;
            for (int i9 = 0; i9 < iV2; i9++) {
                m2 m2Var3 = (m2) nu4Var.x(i9);
                if (m2Var3 != m2Var2) {
                    t32Var.getClass();
                    m2Var3.t(rect4);
                    if (zf6.n(i, rect2, rect4)) {
                        if (!zf6.n(i, rect2, rect3) || zf6.g(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            m2Var = m2Var3;
                        } else if (!zf6.g(i, rect2, rect3, rect4)) {
                            int iX = zf6.x(i, rect2, rect4);
                            int iL = zf6.l(i, rect2, rect4);
                            int i10 = (iL * iL) + (iX * 13 * iX);
                            int iX2 = zf6.x(i, rect2, rect3);
                            int iL2 = zf6.l(i, rect2, rect3);
                            if (i10 < (iL2 * iL2) + (iX2 * 13 * iX2)) {
                                rect3.set(rect4);
                                m2Var = m2Var3;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        m2 m2Var4 = m2Var;
        if (m2Var4 != null) {
            if (nu4Var.j) {
                c93.e(nu4Var);
            }
            int i11 = nu4Var.m;
            for (int i12 = i2; i12 < i11; i12++) {
                if (nu4Var.a[i12] == m2Var4) {
                    i5 = i12;
                    break;
                }
            }
            iR = nu4Var.r(i5);
        }
        return s(iR);
    }

    @Override // defpackage.s1
    public final y22 y(View view) {
        em1 em1Var = this.s;
        if (em1Var != null) {
            return em1Var;
        }
        em1 em1Var2 = new em1(this);
        this.s = em1Var2;
        return em1Var2;
    }
}
