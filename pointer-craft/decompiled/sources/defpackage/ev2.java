package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ev2 extends ViewGroup {
    public int a;
    public int[] b;
    public float c;
    public int h;
    public boolean i;
    public boolean j;
    public int m;
    public int o;
    public Drawable p;
    public int q;
    public int[] s;
    public int t;
    public int u;
    public int w;
    public int z;

    public ev2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.j = true;
        this.t = -1;
        this.a = 0;
        this.q = 8388659;
        int[] iArr = r24.c;
        ro roVarP = ro.P(0, 0, context, attributeSet, iArr);
        xk5.m(this, context, iArr, attributeSet, (TypedArray) roVarP.t, 0);
        TypedArray typedArray = (TypedArray) roVarP.t;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.c = typedArray.getFloat(4, -1.0f);
        this.t = typedArray.getInt(3, -1);
        this.i = typedArray.getBoolean(7, false);
        setDividerDrawable(roVarP.h(5));
        this.h = typedArray.getInt(8, 0);
        this.o = typedArray.getDimensionPixelSize(6, 0);
        roVarP.S();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dv2;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.t < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.t;
        if (childCount <= i2) {
            t94.v("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.t == 0) {
                return -1;
            }
            t94.v("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int bottom = this.a;
        if (this.m == 1 && (i = this.q & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.w) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.w;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((dv2) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.t;
    }

    public Drawable getDividerDrawable() {
        return this.p;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.u;
    }

    public int getGravity() {
        return this.q;
    }

    public int getOrientation() {
        return this.m;
    }

    public int getShowDividers() {
        return this.h;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public dv2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof dv2) {
            return new dv2((dv2) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new dv2((ViewGroup.MarginLayoutParams) layoutParams) : new dv2(layoutParams);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public dv2 generateLayoutParams(AttributeSet attributeSet) {
        return new dv2(getContext(), attributeSet);
    }

    public final void n(Canvas canvas, int i) {
        this.p.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.z + i);
        this.p.draw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.p == null) {
            return;
        }
        int i2 = 0;
        if (this.m == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && t(i2)) {
                    n(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((dv2) childAt.getLayoutParams())).topMargin) - this.z);
                }
                i2++;
            }
            if (t(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.z;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((dv2) childAt2.getLayoutParams())).bottomMargin;
                }
                n(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = km5.g;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && t(i2)) {
                dv2 dv2Var = (dv2) childAt3.getLayoutParams();
                v(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) dv2Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) dv2Var).leftMargin) - this.u);
            }
            i2++;
        }
        if (t(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                dv2 dv2Var2 = (dv2) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) dv2Var2).leftMargin;
                    i = this.u;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) dv2Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.u;
                right = left - i;
            }
            v(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0183  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        char c = 2;
        if (this.m == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i17 = i3 - i;
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i18 = this.q;
            int i19 = i18 & 112;
            int i20 = 8388615 & i18;
            if (i19 != 16) {
                paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.w;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.w) / 2);
            }
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View childAt = getChildAt(i21);
                if (childAt != null && childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    dv2 dv2Var = (dv2) childAt.getLayoutParams();
                    int i22 = ((LinearLayout.LayoutParams) dv2Var).gravity;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i15 = ((LinearLayout.LayoutParams) dv2Var).leftMargin + paddingLeft2;
                        } else {
                            i13 = paddingRight - measuredWidth;
                            i14 = ((LinearLayout.LayoutParams) dv2Var).rightMargin;
                        }
                        if (t(i21)) {
                            paddingTop += this.z;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) dv2Var).topMargin;
                        childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) dv2Var).bottomMargin + i23;
                    } else {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) dv2Var).leftMargin;
                        i14 = ((LinearLayout.LayoutParams) dv2Var).rightMargin;
                    }
                    i15 = i13 - i14;
                    if (t(i21)) {
                        paddingTop += this.z;
                    }
                    int i24 = paddingTop + ((LinearLayout.LayoutParams) dv2Var).topMargin;
                    childAt.layout(i15, i24, measuredWidth + i15, i24 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) dv2Var).bottomMargin + i24;
                }
                i21++;
                c = c;
                i16 = 8;
            }
            return;
        }
        boolean z2 = km5.g;
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.q;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z4 = this.j;
        int[] iArr = this.b;
        int[] iArr2 = this.s;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.w;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.w) / 2);
        }
        if (z3) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i5 * i29) + i6;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    dv2 dv2Var2 = (dv2) childAt2.getLayoutParams();
                    int i31 = paddingLeft;
                    if (z4) {
                        i8 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) dv2Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) dv2Var2).gravity;
                        if (i9 < 0) {
                            i9 = i28;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i11 = i8 + ((LinearLayout.LayoutParams) dv2Var2).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) dv2Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (t(i30)) {
                                i12 = i31 + this.u;
                            } else {
                                i12 = i31;
                            }
                            int i32 = i12 + ((LinearLayout.LayoutParams) dv2Var2).leftMargin;
                            childAt2.layout(i32, i11, i32 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) dv2Var2).rightMargin + i32;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) dv2Var2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) dv2Var2).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        if (t(i30)) {
                            i12 = i31 + this.u;
                        } else {
                            i12 = i31;
                        }
                        int i33 = i12 + ((LinearLayout.LayoutParams) dv2Var2).leftMargin;
                        childAt2.layout(i33, i11, i33 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) dv2Var2).rightMargin + i33;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = ((LinearLayout.LayoutParams) dv2Var2).gravity;
                    if (i9 < 0) {
                        i9 = i28;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i11 = i8 + ((LinearLayout.LayoutParams) dv2Var2).topMargin;
                            if (baseline != -1) {
                                i11 = (iArr[1] - baseline) + i11;
                            }
                        } else if (i10 != 80) {
                            i11 = i8;
                        } else {
                            i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) dv2Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (t(i30)) {
                            i12 = i31 + this.u;
                        } else {
                            i12 = i31;
                        }
                        int i34 = i12 + ((LinearLayout.LayoutParams) dv2Var2).leftMargin;
                        childAt2.layout(i34, i11, i34 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) dv2Var2).rightMargin + i34;
                    } else {
                        i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) dv2Var2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) dv2Var2).bottomMargin;
                    }
                    i11 -= measuredHeight;
                    if (t(i30)) {
                        i12 = i31 + this.u;
                    } else {
                        i12 = i31;
                    }
                    int i35 = i12 + ((LinearLayout.LayoutParams) dv2Var2).leftMargin;
                    childAt2.layout(i35, i11, i35 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) dv2Var2).rightMargin + i35;
                }
                i29++;
                i6 = i7;
                paddingTop2 = i8;
            }
            i8 = paddingTop2;
            i29++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:231:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:234:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:236:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:238:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:240:0x0520  */
    /* JADX WARN: Code duplicated, block: B:246:0x0530  */
    /* JADX WARN: Code duplicated, block: B:249:0x0537 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x053a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0541 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x0544  */
    /* JADX WARN: Code duplicated, block: B:370:0x0792  */
    /* JADX WARN: Code duplicated, block: B:64:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int baseline;
        int i7;
        int i8;
        int[] iArr2;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        dv2 dv2Var;
        View view;
        int i11;
        int[] iArr3;
        int i12;
        int i13;
        boolean z3;
        int i14;
        int measuredHeight;
        boolean z4;
        boolean z5;
        int iMax2;
        int i15;
        int baseline2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        int i21;
        int i22;
        int i23;
        View view2;
        boolean z7;
        ev2 ev2Var = this;
        int i24 = -2;
        int iMax3 = 0;
        int i25 = 1073741824;
        int i26 = 8;
        if (ev2Var.m == 1) {
            ev2Var.w = 0;
            int virtualChildCount = ev2Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i27 = ev2Var.t;
            boolean z8 = ev2Var.i;
            int i28 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z9 = false;
            int i29 = 0;
            boolean z10 = false;
            boolean z11 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i28 < virtualChildCount) {
                int i30 = mode;
                View childAt = ev2Var.getChildAt(i28);
                if (childAt == null) {
                    ev2Var.w = ev2Var.w;
                } else {
                    if (childAt.getVisibility() != i26) {
                        if (ev2Var.t(i28)) {
                            ev2Var.w += ev2Var.z;
                        }
                        dv2 dv2Var2 = (dv2) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) dv2Var2).weight;
                        f += f2;
                        if (mode2 == i25 && ((LinearLayout.LayoutParams) dv2Var2).height == 0 && f2 > 0.0f) {
                            int i31 = ev2Var.w;
                            ev2Var.w = Math.max(i31, ((LinearLayout.LayoutParams) dv2Var2).topMargin + i31 + ((LinearLayout.LayoutParams) dv2Var2).bottomMargin);
                            view2 = childAt;
                            i20 = mode2;
                            i21 = i27;
                            z6 = z8;
                            i22 = i28;
                            z9 = true;
                            i23 = i30;
                        } else {
                            if (((LinearLayout.LayoutParams) dv2Var2).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) dv2Var2).height = i24;
                                i19 = 0;
                            }
                            i20 = mode2;
                            z6 = z8;
                            i21 = i27;
                            i22 = i28;
                            i23 = i30;
                            ev2Var.measureChildWithMargins(childAt, i, 0, i2, f == 0.0f ? ev2Var.w : 0);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) dv2Var2).height = i19;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i32 = ev2Var.w;
                            view2 = childAt;
                            ev2Var.w = Math.max(i32, i32 + measuredHeight2 + ((LinearLayout.LayoutParams) dv2Var2).topMargin + ((LinearLayout.LayoutParams) dv2Var2).bottomMargin);
                            if (z6) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i21 >= 0 && i21 == i22 + 1) {
                            ev2Var.a = ev2Var.w;
                        }
                        if (i22 < i21 && ((LinearLayout.LayoutParams) dv2Var2).weight > 0.0f) {
                            t94.v("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                            return;
                        }
                        if (i23 == 1073741824 || ((LinearLayout.LayoutParams) dv2Var2).width != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                            z10 = true;
                        }
                        int i33 = ((LinearLayout.LayoutParams) dv2Var2).leftMargin + ((LinearLayout.LayoutParams) dv2Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i33;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z12 = z7;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i29, measuredState);
                        if (z11) {
                            i29 = iCombineMeasuredStates;
                            boolean z13 = ((LinearLayout.LayoutParams) dv2Var2).width == -1;
                            if (((LinearLayout.LayoutParams) dv2Var2).weight > 0.0f) {
                                if (!z12) {
                                    i33 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i33);
                            } else {
                                if (!z12) {
                                    i33 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i33);
                            }
                            z11 = z13;
                        } else {
                            i29 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) dv2Var2).weight > 0.0f) {
                            if (!z12) {
                                i33 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i33);
                        } else {
                            if (!z12) {
                                i33 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i33);
                        }
                        z11 = z13;
                    }
                    i28 = i22 + 1;
                    i27 = i21;
                    mode = i23;
                    z8 = z6;
                    mode2 = i20;
                    i24 = -2;
                    i25 = 1073741824;
                    i26 = 8;
                }
                i20 = mode2;
                i21 = i27;
                z6 = z8;
                i22 = i28;
                i23 = i30;
                i28 = i22 + 1;
                i27 = i21;
                mode = i23;
                z8 = z6;
                mode2 = i20;
                i24 = -2;
                i25 = 1073741824;
                i26 = 8;
            }
            int i34 = mode;
            int i35 = mode2;
            boolean z14 = z8;
            int i36 = i29;
            int i37 = i2;
            if (ev2Var.w > 0 && ev2Var.t(virtualChildCount)) {
                ev2Var.w += ev2Var.z;
            }
            if (z14 && (i35 == Integer.MIN_VALUE || i35 == 0)) {
                ev2Var.w = 0;
                for (int i38 = 0; i38 < virtualChildCount; i38++) {
                    View childAt2 = ev2Var.getChildAt(i38);
                    if (childAt2 == null) {
                        ev2Var.w = ev2Var.w;
                    } else if (childAt2.getVisibility() != 8) {
                        dv2 dv2Var3 = (dv2) childAt2.getLayoutParams();
                        int i39 = ev2Var.w;
                        ev2Var.w = Math.max(i39, i39 + iMax6 + ((LinearLayout.LayoutParams) dv2Var3).topMargin + ((LinearLayout.LayoutParams) dv2Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = ev2Var.getPaddingBottom() + ev2Var.getPaddingTop() + ev2Var.w;
            ev2Var.w = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, ev2Var.getSuggestedMinimumHeight()), i37, 0);
            int i40 = (iResolveSizeAndState & 16777215) - ev2Var.w;
            if (z9 || (i40 != 0 && f > 0.0f)) {
                float f3 = ev2Var.c;
                if (f3 > 0.0f) {
                    f = f3;
                }
                ev2Var.w = 0;
                int iCombineMeasuredStates2 = i36;
                int i41 = 0;
                while (i41 < virtualChildCount) {
                    View childAt3 = ev2Var.getChildAt(i41);
                    if (childAt3.getVisibility() == 8) {
                        i41 = i41;
                    } else {
                        dv2 dv2Var4 = (dv2) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) dv2Var4).weight;
                        if (f4 > 0.0f) {
                            int i42 = (int) ((i40 * f4) / f);
                            f -= f4;
                            i40 -= i42;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, ev2Var.getPaddingRight() + ev2Var.getPaddingLeft() + ((LinearLayout.LayoutParams) dv2Var4).leftMargin + ((LinearLayout.LayoutParams) dv2Var4).rightMargin, ((LinearLayout.LayoutParams) dv2Var4).width);
                            if (((LinearLayout.LayoutParams) dv2Var4).height == 0) {
                                i18 = 1073741824;
                                if (i35 == 1073741824) {
                                    if (i42 <= 0) {
                                        i42 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i18 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i42;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i18));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i43 = ((LinearLayout.LayoutParams) dv2Var4).leftMargin + ((LinearLayout.LayoutParams) dv2Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i43;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i34 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) dv2Var4).width == -1) {
                                measuredWidth2 = i43;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z15 = z11 && ((LinearLayout.LayoutParams) dv2Var4).width == i17;
                        int i44 = ev2Var.w;
                        ev2Var.w = Math.max(i44, childAt3.getMeasuredHeight() + i44 + ((LinearLayout.LayoutParams) dv2Var4).topMargin + ((LinearLayout.LayoutParams) dv2Var4).bottomMargin);
                        z11 = z15;
                    }
                    i41++;
                }
                ev2Var.w = ev2Var.getPaddingBottom() + ev2Var.getPaddingTop() + ev2Var.w;
                i36 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z14 && i35 != 1073741824) {
                    for (int i45 = 0; i45 < virtualChildCount; i45++) {
                        View childAt4 = ev2Var.getChildAt(i45);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((dv2) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z11 || i34 == 1073741824) {
                iMax4 = iMax3;
            }
            ev2Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(ev2Var.getPaddingRight() + ev2Var.getPaddingLeft() + iMax4, ev2Var.getSuggestedMinimumWidth()), i, i36), iResolveSizeAndState);
            if (z10) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(ev2Var.getMeasuredWidth(), 1073741824);
                int i46 = 0;
                while (i46 < virtualChildCount) {
                    View childAt5 = ev2Var.getChildAt(i46);
                    if (childAt5.getVisibility() != 8) {
                        dv2 dv2Var5 = (dv2) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) dv2Var5).width == -1) {
                            int i47 = ((LinearLayout.LayoutParams) dv2Var5).height;
                            ((LinearLayout.LayoutParams) dv2Var5).height = childAt5.getMeasuredHeight();
                            ev2Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i37, 0);
                            ((LinearLayout.LayoutParams) dv2Var5).height = i47;
                        }
                    }
                    i46++;
                    i37 = i2;
                }
                return;
            }
            return;
        }
        int i48 = i;
        ev2Var.w = 0;
        int virtualChildCount2 = ev2Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i48);
        int mode4 = View.MeasureSpec.getMode(i2);
        int[] iArr4 = ev2Var.b;
        if (iArr4 == null || (iArr = ev2Var.s) == null) {
            iArr4 = new int[4];
            ev2Var.b = iArr4;
            iArr = new int[4];
            ev2Var.s = iArr;
        }
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr;
        iArr5[3] = -1;
        char c = 2;
        iArr5[2] = -1;
        iArr5[1] = -1;
        iArr5[0] = -1;
        iArr6[3] = -1;
        iArr6[2] = -1;
        iArr6[1] = -1;
        iArr6[0] = -1;
        boolean z16 = ev2Var.j;
        boolean z17 = ev2Var.i;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i49 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = ev2Var.getChildAt(i49);
            if (childAt6 == null) {
                ev2Var.w = ev2Var.w;
                i10 = i49;
                i15 = i51;
                iArr3 = iArr5;
                iArr2 = iArr6;
                z = z16;
                z2 = z17;
            } else {
                int i52 = i50;
                if (childAt6.getVisibility() == 8) {
                    i48 = i;
                    i10 = i49;
                    i15 = i51;
                    iArr2 = iArr6;
                    z = z16;
                    z2 = z17;
                    i50 = i52;
                    iArr3 = iArr5;
                } else {
                    if (ev2Var.t(i49)) {
                        ev2Var.w += ev2Var.u;
                    }
                    dv2 dv2Var6 = (dv2) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) dv2Var6).weight;
                    f5 += f6;
                    int i53 = i49;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) dv2Var6).width == 0 && f6 > 0.0f) {
                        int i54 = ev2Var.w;
                        int i55 = ((LinearLayout.LayoutParams) dv2Var6).leftMargin;
                        if (z18) {
                            ev2Var.w = i55 + ((LinearLayout.LayoutParams) dv2Var6).rightMargin + i54;
                        } else {
                            ev2Var.w = Math.max(i54, i54 + i55 + ((LinearLayout.LayoutParams) dv2Var6).rightMargin);
                        }
                        if (z16) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            i11 = i52;
                            i10 = i53;
                            dv2Var = dv2Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i48 = i;
                            i12 = i51;
                            i9 = iMax7;
                        } else {
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            z21 = true;
                            i11 = i52;
                            i10 = i53;
                            i13 = 1073741824;
                            dv2Var = dv2Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i48 = i;
                            i12 = i51;
                            i9 = iMax7;
                        }
                        if (mode4 == i13 && ((LinearLayout.LayoutParams) dv2Var).height == -1) {
                            z3 = true;
                            z20 = true;
                        } else {
                            z3 = false;
                        }
                        i14 = ((LinearLayout.LayoutParams) dv2Var).topMargin + ((LinearLayout.LayoutParams) dv2Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i14;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                            baseline2 = view.getBaseline();
                            z4 = z3;
                            if (baseline2 != -1) {
                                i16 = ((LinearLayout.LayoutParams) dv2Var).gravity;
                                if (i16 < 0) {
                                    i16 = ev2Var.q;
                                }
                                int i56 = (((i16 & 112) >> 4) & (-2)) >> 1;
                                iArr3[i56] = Math.max(iArr3[i56], baseline2);
                                iArr2[i56] = Math.max(iArr2[i56], measuredHeight - baseline2);
                            }
                        } else {
                            z4 = z3;
                        }
                        int iMax9 = Math.max(i11, measuredHeight);
                        if (z19 || ((LinearLayout.LayoutParams) dv2Var).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) dv2Var).weight > 0.0f) {
                            if (!z4) {
                                i14 = measuredHeight;
                            }
                            iMax7 = Math.max(i9, i14);
                            iMax2 = i12;
                        } else {
                            if (!z4) {
                                i14 = measuredHeight;
                            }
                            iMax2 = Math.max(i12, i14);
                            iMax7 = i9;
                        }
                        int i57 = iMax2;
                        i50 = iMax9;
                        i15 = i57;
                        z19 = z5;
                    } else {
                        if (((LinearLayout.LayoutParams) dv2Var6).width != 0 || f6 <= 0.0f) {
                            i8 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) dv2Var6).width = -2;
                            i8 = 0;
                        }
                        iArr2 = iArr6;
                        i9 = iMax7;
                        i10 = i53;
                        z = z16;
                        z2 = z17;
                        int i58 = i8;
                        dv2Var = dv2Var6;
                        view = childAt6;
                        i11 = i52;
                        i48 = i;
                        iArr3 = iArr5;
                        i12 = i51;
                        ev2Var.measureChildWithMargins(view, i48, f5 == 0.0f ? ev2Var.w : 0, i2, 0);
                        if (i58 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) dv2Var).width = i58;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        int i59 = ev2Var.w;
                        int i60 = ((LinearLayout.LayoutParams) dv2Var).leftMargin;
                        if (z18) {
                            ev2Var.w = i60 + measuredWidth3 + ((LinearLayout.LayoutParams) dv2Var).rightMargin + i59;
                        } else {
                            ev2Var.w = Math.max(i59, i59 + measuredWidth3 + i60 + ((LinearLayout.LayoutParams) dv2Var).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i13 = 1073741824;
                    if (mode4 == i13) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i14 = ((LinearLayout.LayoutParams) dv2Var).topMargin + ((LinearLayout.LayoutParams) dv2Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i14;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z) {
                        baseline2 = view.getBaseline();
                        z4 = z3;
                        if (baseline2 != -1) {
                            i16 = ((LinearLayout.LayoutParams) dv2Var).gravity;
                            if (i16 < 0) {
                                i16 = ev2Var.q;
                            }
                            int i510 = (((i16 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i510] = Math.max(iArr3[i510], baseline2);
                            iArr2[i510] = Math.max(iArr2[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z4 = z3;
                    }
                    int iMax10 = Math.max(i11, measuredHeight);
                    if (z19) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) dv2Var).weight > 0.0f) {
                        if (!z4) {
                            i14 = measuredHeight;
                        }
                        iMax7 = Math.max(i9, i14);
                        iMax2 = i12;
                    } else {
                        if (!z4) {
                            i14 = measuredHeight;
                        }
                        iMax2 = Math.max(i12, i14);
                        iMax7 = i9;
                    }
                    int i511 = iMax2;
                    i50 = iMax10;
                    i15 = i511;
                    z19 = z5;
                }
            }
            i51 = i15;
            i49 = i10 + 1;
            c = c2;
            iArr5 = iArr3;
            iArr6 = iArr2;
            z16 = z;
            z17 = z2;
        }
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr6;
        char c3 = c;
        boolean z22 = z16;
        boolean z23 = z17;
        int i61 = i50;
        int i62 = i51;
        int i63 = iMax7;
        if (ev2Var.w > 0 && ev2Var.t(virtualChildCount2)) {
            ev2Var.w += ev2Var.u;
        }
        int i64 = iArr7[1];
        int iMax11 = (i64 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) ? i61 : Math.max(i61, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i64, iArr7[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            ev2Var.w = 0;
            for (int i65 = 0; i65 < virtualChildCount2; i65++) {
                View childAt7 = ev2Var.getChildAt(i65);
                if (childAt7 == null) {
                    ev2Var.w = ev2Var.w;
                } else if (childAt7.getVisibility() != 8) {
                    dv2 dv2Var7 = (dv2) childAt7.getLayoutParams();
                    int i66 = ev2Var.w;
                    if (z18) {
                        ev2Var.w = ((LinearLayout.LayoutParams) dv2Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) dv2Var7).rightMargin + i66;
                    } else {
                        ev2Var.w = Math.max(i66, i66 + iMax8 + ((LinearLayout.LayoutParams) dv2Var7).leftMargin + ((LinearLayout.LayoutParams) dv2Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = ev2Var.getPaddingRight() + ev2Var.getPaddingLeft() + ev2Var.w;
        ev2Var.w = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, ev2Var.getSuggestedMinimumWidth()), i48, 0);
        int i67 = (iResolveSizeAndState2 & 16777215) - ev2Var.w;
        if (z21 || (i67 != 0 && f5 > 0.0f)) {
            float f7 = ev2Var.c;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr7[3] = -1;
            iArr7[c3] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[c3] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            ev2Var.w = 0;
            iMax11 = -1;
            int i68 = 0;
            while (i68 < virtualChildCount2) {
                View childAt8 = ev2Var.getChildAt(i68);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    dv2 dv2Var8 = (dv2) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) dv2Var8).weight;
                    if (f8 > 0.0f) {
                        int i69 = (int) ((i67 * f8) / f5);
                        f5 -= f8;
                        i67 -= i69;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, ev2Var.getPaddingBottom() + ev2Var.getPaddingTop() + ((LinearLayout.LayoutParams) dv2Var8).topMargin + ((LinearLayout.LayoutParams) dv2Var8).bottomMargin, ((LinearLayout.LayoutParams) dv2Var8).height);
                        if (((LinearLayout.LayoutParams) dv2Var8).width == 0) {
                            i7 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i69 <= 0) {
                                    i69 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i69, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i7 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i69;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i7), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    int i70 = ev2Var.w;
                    if (z18) {
                        ev2Var.w = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) dv2Var8).leftMargin + ((LinearLayout.LayoutParams) dv2Var8).rightMargin + i70;
                    } else {
                        ev2Var.w = Math.max(i70, childAt8.getMeasuredWidth() + i70 + ((LinearLayout.LayoutParams) dv2Var8).leftMargin + ((LinearLayout.LayoutParams) dv2Var8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) dv2Var8).height == -1;
                    int i71 = ((LinearLayout.LayoutParams) dv2Var8).topMargin + ((LinearLayout.LayoutParams) dv2Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i71;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z24) {
                        i71 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i62, i71);
                    if (z19) {
                        i6 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) dv2Var8).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i6) {
                            int i72 = ((LinearLayout.LayoutParams) dv2Var8).gravity;
                            if (i72 < 0) {
                                i72 = ev2Var.q;
                            }
                            int i73 = (((i72 & 112) >> 4) & (-2)) >> 1;
                            iArr7[i73] = Math.max(iArr7[i73], baseline);
                            iArr8[i73] = Math.max(iArr8[i73], measuredHeight4 - baseline);
                        }
                        z19 = z25;
                        i62 = iMax12;
                    } else {
                        i6 = -1;
                    }
                    if (!z22) {
                    }
                    z19 = z25;
                    i62 = iMax12;
                }
                i68++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            ev2Var.w = ev2Var.getPaddingRight() + ev2Var.getPaddingLeft() + ev2Var.w;
            int i74 = iArr7[1];
            if (i74 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i74, iArr7[c3]))));
            }
            iMax = i62;
        } else {
            iMax = Math.max(i62, i63);
            if (z23 && mode3 != 1073741824) {
                for (int i75 = 0; i75 < virtualChildCount2; i75++) {
                    View childAt9 = ev2Var.getChildAt(i75);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((dv2) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        ev2Var.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(ev2Var.getPaddingBottom() + ev2Var.getPaddingTop() + iMax11, ev2Var.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z20) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(ev2Var.getMeasuredHeight(), 1073741824);
            int i76 = i5;
            while (i76 < virtualChildCount2) {
                View childAt10 = ev2Var.getChildAt(i76);
                if (childAt10.getVisibility() != 8) {
                    dv2 dv2Var9 = (dv2) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) dv2Var9).height == -1) {
                        int i77 = ((LinearLayout.LayoutParams) dv2Var9).width;
                        ((LinearLayout.LayoutParams) dv2Var9).width = childAt10.getMeasuredWidth();
                        ev2Var.measureChildWithMargins(childAt10, i48, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) dv2Var9).width = i77;
                    }
                }
                i76++;
                ev2Var = this;
                i48 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.j = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.t = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.p) {
            return;
        }
        this.p = drawable;
        if (drawable != null) {
            this.u = drawable.getIntrinsicWidth();
            this.z = drawable.getIntrinsicHeight();
        } else {
            this.u = 0;
            this.z = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public void setGravity(int i) {
        if (this.q != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.q = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.q;
        if ((8388615 & i3) != i2) {
            this.q = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.i = z;
    }

    public void setOrientation(int i) {
        if (this.m != i) {
            this.m = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.h) {
            requestLayout();
        }
        this.h = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.q;
        if ((i3 & 112) != i2) {
            this.q = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.c = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(int i) {
        if (i == 0) {
            return (this.h & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.h;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void v(Canvas canvas, int i) {
        this.p.setBounds(i, getPaddingTop() + this.o, this.u + i, (getHeight() - getPaddingBottom()) - this.o);
        this.p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public dv2 generateDefaultLayoutParams() {
        int i = this.m;
        if (i == 0) {
            return new dv2(-2, -2);
        }
        if (i == 1) {
            return new dv2(-1, -2);
        }
        return null;
    }
}
