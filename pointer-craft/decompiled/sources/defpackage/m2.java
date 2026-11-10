package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m2 {
    public static int n;
    public final AccessibilityNodeInfo g;
    public int y = -1;
    public int r = -1;

    public m2(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.g = accessibilityNodeInfo;
    }

    public static ClickableSpan[] a(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static String l(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public static m2 p0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new m2(accessibilityNodeInfo);
    }

    public static m2 s() {
        return new m2(AccessibilityNodeInfo.obtain());
    }

    public final void A(k2 k2Var) {
        this.g.setCollectionInfo(k2Var == null ? null : (AccessibilityNodeInfo.CollectionInfo) k2Var.j);
    }

    public final void B(l2 l2Var) {
        this.g.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) l2Var.g);
    }

    public final void C(CharSequence charSequence) {
        this.g.setContentDescription(charSequence);
    }

    public final void D() {
        this.g.setContentInvalid(true);
    }

    public final void E(int i) {
        this.g.setDrawingOrder(i);
    }

    public final void F(boolean z) {
        this.g.setEditable(z);
    }

    public final void G(boolean z) {
        this.g.setEnabled(z);
    }

    public final void H(CharSequence charSequence) {
        this.g.setError(charSequence);
    }

    public final void I(boolean z) {
        this.g.setFocusable(z);
    }

    public final void J(boolean z) {
        this.g.setFocused(z);
    }

    public final void K(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.g.setHeading(z);
        } else {
            h(2, z);
        }
    }

    public final void L(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.g;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final void M(boolean z) {
        this.g.setImportantForAccessibility(z);
    }

    public final void N(en enVar) {
        this.g.setLabelFor(enVar);
    }

    public final void O(int i) {
        this.g.setLiveRegion(i);
    }

    public final void P(boolean z) {
        this.g.setLongClickable(z);
    }

    public final void Q(int i) {
        this.g.setMaxTextLength(i);
    }

    public final void R(int i) {
        this.g.setMovementGranularities(i);
    }

    public final void S(String str) {
        this.g.setPackageName(str);
    }

    public final void T(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.g;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final void U(View view) {
        this.y = -1;
        this.g.setParent(view);
    }

    public final void V(View view, int i) {
        this.y = i;
        this.g.setParent(view, i);
    }

    public final void W(boolean z) {
        this.g.setPassword(z);
    }

    public final void X(k2 k2Var) {
        this.g.setRangeInfo((AccessibilityNodeInfo.RangeInfo) k2Var.j);
    }

    public final void Y(String str) {
        this.g.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str);
    }

    public final void Z(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.g.setScreenReaderFocusable(z);
        } else {
            h(1, z);
        }
    }

    public final void a0(boolean z) {
        this.g.setScrollable(z);
    }

    public final boolean b() {
        return this.g.isFocused();
    }

    public final void b0(boolean z) {
        this.g.setSelected(z);
    }

    public final boolean c() {
        return this.g.isClickable();
    }

    public final void c0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.g.setShowingHintText(z);
        } else {
            h(4, z);
        }
    }

    public final void d(CharSequence charSequence) {
        this.g.setClassName(charSequence);
    }

    public final void d0(View view, int i) {
        this.r = i;
        this.g.setSource(view, i);
    }

    public final void e(boolean z) {
        this.g.setClickable(z);
    }

    public final void e0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.g;
        if (i >= 30) {
            g2.x(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = m2Var.g;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.g;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.r == m2Var.r && this.y == m2Var.y;
    }

    public final void f(boolean z) {
        this.g.setCheckable(z);
    }

    public final void f0(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    public final void g(int i) {
        this.g.addAction(i);
    }

    public final void g0() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.g.setTextEntryKey(true);
        } else {
            h(8, true);
        }
    }

    public final void h(int i, boolean z) {
        Bundle extras = this.g.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void h0(int i, int i2) {
        this.g.setTextSelection(i, i2);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.g;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean i() {
        return this.g.isFocusable();
    }

    public final void i0(View view) {
        this.g.setTraversalAfter(view);
    }

    public final boolean j(int i) {
        Bundle extras = this.g.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final void j0(View view, int i) {
        this.g.setTraversalAfter(view, i);
    }

    public final void k(boolean z) {
        this.g.setChecked(z);
    }

    public final void k0(dg dgVar) {
        this.g.setTraversalBefore(dgVar);
    }

    public final void l0(View view, int i) {
        this.g.setTraversalBefore(view, i);
    }

    public final Bundle m() {
        return this.g.getExtras();
    }

    public final void m0(String str) {
        this.g.setViewIdResourceName(str);
    }

    public final void n(View view, int i) {
        this.g.addChild(view, i);
    }

    public final void n0(boolean z) {
        this.g.setVisibleToUser(z);
    }

    public final void o(Rect rect) {
        this.g.setBoundsInScreen(rect);
    }

    public final AccessibilityNodeInfo o0() {
        return this.g;
    }

    public final void p(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            t1.m(this.g, z);
        } else {
            h(64, z);
        }
    }

    public final int q() {
        return this.g.getMovementGranularities();
    }

    public final void r(dg dgVar) {
        this.g.addChild(dgVar);
    }

    public final void t(Rect rect) {
        this.g.getBoundsInScreen(rect);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.g;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        t(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            t1.r(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(w());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? g2.r(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i >= 36 ? i2.r(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? h2.r(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int iG = i >= 36 ? i2.g(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(iG == 1 ? "TRUE" : iG == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i >= 36 ? i2.n(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        int iY = i >= 36 ? i2.y(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (iY == 0) {
            str = "UNDEFINED";
        } else if (iY == 1) {
            str = "COLLAPSED";
        } else if (iY != 2) {
            str = iY != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? t1.n(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(j(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? h2.x(accessibilityNodeInfo) : j(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? t1.j(accessibilityNodeInfo) : j(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new f2(actionList.get(i2), 0, null, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            f2 f2Var = (f2) arrayList.get(i3);
            String strL = l(f2Var.y());
            if (strL.equals("ACTION_UNKNOWN") && f2Var.r() != null) {
                strL = f2Var.r().toString();
            }
            sb.append(strL);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(boolean z) {
        this.g.setAccessibilityFocused(z);
    }

    public final void v(View view, CharSequence charSequence) {
        int iKeyAt;
        if (Build.VERSION.SDK_INT < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.g;
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(io.appground.blek.R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < sparseArray.size(); i++) {
                    if (((WeakReference) sparseArray.valueAt(i)).get() == null) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    sparseArray.remove(((Integer) arrayList.get(i2)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArrA = a(charSequence);
            if (clickableSpanArrA == null || clickableSpanArrA.length <= 0) {
                return;
            }
            accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", io.appground.blek.R.id.accessibility_action_clickable_span);
            SparseArray sparseArray2 = (SparseArray) view.getTag(io.appground.blek.R.id.tag_accessibility_clickable_spans);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                view.setTag(io.appground.blek.R.id.tag_accessibility_clickable_spans, sparseArray2);
            }
            for (int i3 = 0; i3 < clickableSpanArrA.length; i3++) {
                ClickableSpan clickableSpan = clickableSpanArrA[i3];
                int i4 = 0;
                while (true) {
                    if (i4 >= sparseArray2.size()) {
                        iKeyAt = n;
                        n = iKeyAt + 1;
                        break;
                    } else {
                        if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i4)).get())) {
                            iKeyAt = sparseArray2.keyAt(i4);
                            break;
                        }
                        i4++;
                    }
                }
                sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArrA[i3]));
                ClickableSpan clickableSpan2 = clickableSpanArrA[i3];
                Spanned spanned = (Spanned) charSequence;
                x("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                x("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                x("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                x("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
            }
        }
    }

    public final CharSequence w() {
        boolean zIsEmpty = x("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.g;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListX = x("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListX2 = x("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListX3 = x("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListX4 = x("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListX.size(); i++) {
            spannableString.setSpan(new q1(((Integer) arrayListX4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListX.get(i)).intValue(), ((Integer) arrayListX2.get(i)).intValue(), ((Integer) arrayListX3.get(i)).intValue());
        }
        return spannableString;
    }

    public final ArrayList x(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.g;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void y(f2 f2Var) {
        this.g.addAction((AccessibilityNodeInfo.AccessibilityAction) f2Var.g);
    }

    public final void z(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.g.setAvailableExtraData(arrayList);
        }
    }
}
