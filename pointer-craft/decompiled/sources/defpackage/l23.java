package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import io.appground.blek.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l23 extends LinearLayout {
    public static final Object u = null;
    public final q64 a;
    public kw4 b;
    public iw4 c;
    public int i;
    public int j;
    public final dl0 m;
    public final ArrayList p;
    public Integer[] q;
    public boolean s;
    public final ArrayList t;
    public hw4 w;

    public l23(Context context, AttributeSet attributeSet) {
        hw4 hw4VarY;
        int next;
        super(gp4.X(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.j = 0;
        this.t = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.a = new q64(materialButtonToggleGroup, (byte) 24);
        this.m = new dl0(materialButtonToggleGroup, (byte) 1);
        this.s = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.p = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayY = ue5.Y(context2, attributeSet, p24.i, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayY.hasValue(2)) {
            this.b = kw4.g(context2, typedArrayY);
        }
        if (typedArrayY.hasValue(6)) {
            iw4 iw4VarL = iw4.l(context2, typedArrayY, 6);
            this.c = iw4VarL;
            if (iw4VarL == null) {
                int resourceId = typedArrayY.getResourceId(6, 0);
                int resourceId2 = typedArrayY.getResourceId(7, 0);
                l lVar = new l(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                this.c = new z82(fn4.j(contextThemeWrapper.obtainStyledAttributes(p24.E), lVar).g()).m();
            }
        }
        if (typedArrayY.hasValue(3)) {
            l lVar2 = new l(0.0f);
            int resourceId3 = typedArrayY.getResourceId(3, 0);
            if (resourceId3 != 0 && context2.getResources().getResourceTypeName(resourceId3).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId3);
                    try {
                        hw4 hw4Var = new hw4();
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            hw4Var.n(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        hw4VarY = hw4Var;
                    } catch (Throwable th) {
                        if (xml == null) {
                            throw th;
                        }
                        try {
                            xml.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    hw4VarY = hw4.y(lVar2);
                }
            } else {
                hw4VarY = hw4.y(fn4.t(typedArrayY, 3, lVar2));
            }
            this.w = hw4VarY;
        }
        this.i = typedArrayY.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayY.getBoolean(0, true));
        setOverflowMode(typedArrayY.getInt(5, 0));
        getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        typedArrayY.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (t(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (t(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    public static LinearLayout.LayoutParams n(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new k23(layoutParams.width, layoutParams.height);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public static k23 x(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new k23((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new k23((ViewGroup.MarginLayoutParams) layoutParams) : new k23(layoutParams);
    }

    public final void a() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.K;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.K = null;
                materialButton.H = -2.14748365E9f;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        a();
        this.s = true;
        int iIndexOfChild = indexOfChild(null);
        if (iIndexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.a);
        this.t.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k23;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.m);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.q = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void g() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            View childAt2 = getChildAt(i - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.i <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsN = n(childAt);
            if (getOrientation() == 0) {
                layoutParamsN.setMarginEnd(0);
                layoutParamsN.setMarginStart(this.i - iMin);
                layoutParamsN.topMargin = 0;
            } else {
                layoutParamsN.bottomMargin = 0;
                layoutParamsN.topMargin = this.i - iMin;
                layoutParamsN.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsN);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsN2 = n((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            layoutParamsN2.topMargin = 0;
            layoutParamsN2.bottomMargin = 0;
        } else {
            layoutParamsN2.setMarginEnd(0);
            layoutParamsN2.setMarginStart(0);
            layoutParamsN2.leftMargin = 0;
            layoutParamsN2.rightMargin = 0;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new k23(-2, -2);
    }

    public kw4 getButtonSizeChange() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.q;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public bx0 getInnerCornerSize() {
        return this.w.y;
    }

    public hw4 getInnerCornerSizeStateList() {
        return this.w;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.j;
    }

    public fn4 getShapeAppearance() {
        iw4 iw4Var = this.c;
        if (iw4Var == null) {
            return null;
        }
        return iw4Var.j();
    }

    public int getSpacing() {
        return this.i;
    }

    public iw4 getStateListShapeAppearance() {
        return this.c;
    }

    public final MaterialButton j(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (t(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                int iIntValue2 = i3 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i3 + 1)).intValue();
                if (i >= iIntValue && i < iIntValue2 && (i2 < iIntValue || i2 >= iIntValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    public final MaterialButton l(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (t(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                int iIntValue2 = i3 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i3 + 1)).intValue() - 1;
                if (i >= iIntValue && i <= iIntValue2 && (i2 < iIntValue || i2 > iIntValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    public final void m() {
        int i;
        if (!(this.w == null && this.c == null) && this.s) {
            this.s = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    Object obj = this.c;
                    ArrayList arrayList = this.t;
                    if (obj == null || (!z && !z2)) {
                        obj = (dn4) arrayList.get(i2);
                    }
                    z82 z82Var = !(obj instanceof iw4) ? new z82((fn4) arrayList.get(i2)) : new z82((iw4) obj);
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    z82Var.i(this.w, ~i);
                    iw4 iw4VarM = z82Var.m();
                    boolean zX = iw4VarM.x();
                    iw4 iw4VarJ = iw4VarM;
                    if (!zX) {
                        iw4VarJ = iw4VarM.j();
                    }
                    materialButton.setShapeAppearance(iw4VarJ);
                }
                i2++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a();
            y();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        g();
        if (this.j != 2) {
            paddingBottom = 0;
        } else {
            if (getOrientation() == 1) {
                l0.u("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                l0.u("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.p;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            int iMax = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (t(i5)) {
                    View view = (MaterialButton) getChildAt(i5);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams layoutParamsN = n(view);
                        if (i3 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.i) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i3));
                            }
                            i4 += iMax + (arrayList.isEmpty() ? 0 : this.i);
                            arrayList.add(Integer.valueOf(i5));
                            layoutParamsN.setMarginStart(-i3);
                            arrayList2.clear();
                            i3 = 0;
                            iMax = 0;
                        }
                        i3 += measuredWidth + (i3 == 0 ? 0 : this.i);
                        iMax = Math.max(iMax, measuredHeight);
                        arrayList2.add(Integer.valueOf(i5));
                        layoutParamsN.topMargin += i4;
                        view.setLayoutParams(layoutParamsN);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i3));
            int iIntValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i6 = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                int iIntValue2 = ((Integer) arrayList.get(i7)).intValue();
                int iIntValue3 = ((Integer) arrayList3.get(i7)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(iIntValue2);
                LinearLayout.LayoutParams layoutParamsN2 = n(materialButton);
                int i8 = layoutParamsN2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i8, getLayoutDirection());
                int i9 = iIntValue - iIntValue3;
                if (i8 != 8388611) {
                    if (absoluteGravity == 1) {
                        i9 /= 2;
                    }
                    layoutParamsN2.setMarginStart((layoutParamsN2.getMarginStart() + i9) - i6);
                    materialButton.setLayoutParams(layoutParamsN2);
                    i6 = i9;
                }
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + i4 + iMax;
        }
        m();
        super.onMeasure(i, i2);
        if (this.j != 2 || paddingBottom == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), paddingBottom);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.t.remove(iIndexOfChild);
        }
        this.s = true;
        m();
        a();
        g();
    }

    public final void r(int i, int i2) {
        j23 j23Var;
        if (i == i2) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(j23.j);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i3 = i;
        while (i3 <= i2) {
            if (t(i3)) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i3);
                if (i3 == i) {
                    j23Var = j23.a;
                } else {
                    j23Var = i3 == i2 ? j23.t : j23.m;
                }
                materialButton.setWidthChangeDirection(j23Var);
                int iMin2 = 0;
                if (t(i3) && this.b != null) {
                    int iMax = Math.max(0, this.b.y(((MaterialButton) getChildAt(i3)).getWidth()));
                    MaterialButton materialButtonJ = j(i3);
                    int allowedWidthDecrease = materialButtonJ == null ? 0 : materialButtonJ.getAllowedWidthDecrease();
                    MaterialButton materialButtonL = l(i3);
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButtonL != null ? materialButtonL.getAllowedWidthDecrease() : 0));
                }
                if (i3 != i && i3 != i2) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
            i3++;
        }
        while (i <= i2) {
            if (t(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.b);
                materialButton2.setWidthChangeMax(iMin * 2);
            }
            i++;
        }
    }

    public void setButtonSizeChange(kw4 kw4Var) {
        if (this.b != kw4Var) {
            this.b = kw4Var;
            y();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(bx0 bx0Var) {
        this.w = hw4.y(bx0Var);
        this.s = true;
        m();
        invalidate();
    }

    public void setInnerCornerSizeStateList(hw4 hw4Var) {
        this.w = hw4Var;
        this.s = true;
        m();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.s = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i) {
        throw null;
    }

    public void setOverflowMode(int i) {
        if (this.j != i) {
            this.j = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(fn4 fn4Var) {
        this.c = new z82(fn4Var).m();
        this.s = true;
        m();
        invalidate();
    }

    public void setSpacing(int i) {
        this.i = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(iw4 iw4Var) {
        this.c = iw4Var;
        this.s = true;
        m();
        invalidate();
    }

    public final boolean t(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final k23 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        k23 k23Var = new k23(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.b);
        typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
        return k23Var;
    }

    public final void y() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.b == null) {
            return;
        }
        if (this.j != 2) {
            r(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.p;
            if (i >= arrayList.size()) {
                return;
            }
            r(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return x(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new k23(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return x(layoutParams);
    }
}
