package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import defpackage.gp4;
import defpackage.hw4;
import defpackage.k2;
import defpackage.l;
import defpackage.l23;
import defpackage.m2;
import defpackage.n23;
import defpackage.p24;
import defpackage.qd0;
import defpackage.ue5;
import defpackage.xk5;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends l23 {
    public static final /* synthetic */ int e = 0;
    public HashSet d;
    public boolean f;
    public boolean h;
    public final int k;
    public boolean o;
    public final LinkedHashSet z;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(gp4.X(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.z = new LinkedHashSet();
        this.h = false;
        this.d = new HashSet();
        TypedArray typedArrayY = ue5.Y(getContext(), attributeSet, p24.s, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayY.getBoolean(7, false));
        this.k = typedArrayY.getResourceId(2, -1);
        this.f = typedArrayY.getBoolean(4, false);
        if (this.w == null) {
            this.w = hw4.y(new l(0.0f));
        }
        setEnabled(typedArrayY.getBoolean(0, true));
        typedArrayY.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.o ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // defpackage.l23, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        q(materialButton.getId(), materialButton.C);
        xk5.q(materialButton, new qd0(this, (byte) 1));
    }

    public int getCheckedButtonId() {
        if (!this.o || this.d.isEmpty()) {
            return -1;
        }
        return ((Integer) this.d.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.d.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.k;
        if (i != -1) {
            w(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m2.p0(accessibilityNodeInfo).A(k2.n(1, getVisibleButtonCount(), this.o ? 1 : 2));
    }

    public final void q(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.d);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.o && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        w(hashSet);
    }

    public void setSelectionRequired(boolean z) {
        this.f = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.o != z) {
            this.o = z;
            w(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public final void w(Set set) {
        HashSet hashSet = this.d;
        this.d = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.h = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.h = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean zContains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.z.iterator();
                while (it.hasNext()) {
                    ((n23) it.next()).g(id, zContains2);
                }
            }
        }
        invalidate();
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
