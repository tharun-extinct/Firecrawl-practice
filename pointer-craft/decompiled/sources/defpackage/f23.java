package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import io.appground.blek.R;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class f23 extends zk {
    public final int b;
    public final int[] c;
    public final Rect i;
    public ColorStateList p;
    public final sw2 q;
    public final float s;
    public int u;
    public final AccessibilityManager w;
    public ColorStateList z;

    public f23(Context context, AttributeSet attributeSet) {
        super(gp4.X(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.c = new int[]{android.R.attr.state_selected};
        this.i = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayY = ue5.Y(context2, attributeSet, p24.w, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayY.hasValue(0) && typedArrayY.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.b = typedArrayY.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        byte b = 1;
        this.s = typedArrayY.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayY.hasValue(2)) {
            this.p = ColorStateList.valueOf(typedArrayY.getColor(2, 0));
        }
        this.u = typedArrayY.getColor(4, 0);
        this.z = zq2.b(context2, typedArrayY, 5);
        this.w = (AccessibilityManager) context2.getSystemService("accessibility");
        sw2 sw2Var = new sw2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.q = sw2Var;
        sw2Var.F = true;
        em emVar = sw2Var.G;
        emVar.setFocusable(true);
        sw2Var.o = this;
        emVar.setInputMethodMode(2);
        sw2Var.b(getAdapter());
        sw2Var.f = new nm(this, b);
        if (typedArrayY.hasValue(6)) {
            setSimpleItems(typedArrayY.getResourceId(6, 0));
        }
        typedArrayY.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (r()) {
            this.q.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.p;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutY = y();
        return (textInputLayoutY == null || !textInputLayoutY.M) ? super.getHint() : textInputLayoutY.getHint();
    }

    public float getPopupElevation() {
        return this.s;
    }

    public int getSimpleItemSelectedColor() {
        return this.u;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.z;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        sw2 sw2Var = this.q;
        if (sw2Var == null || !sw2Var.G.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutY = y();
        if (textInputLayoutY != null && textInputLayoutY.M && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = i == 66 || i == 23;
        boolean z2 = i == 62;
        if (getKeyListener() == null ? !(z || z2) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        TextInputLayout textInputLayoutY = y();
        if (textInputLayoutY != null) {
            textInputLayoutY.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutY = y();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutY != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                sw2 sw2Var = this.q;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !sw2Var.G.isShowing() ? -1 : sw2Var.a.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutY);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = sw2Var.G.getBackground();
                if (background != null) {
                    Rect rect = this.i;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutY.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (r()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    public final boolean r() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.w;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.q.b(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        sw2 sw2Var = this.q;
        if (sw2Var != null) {
            sw2Var.x(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.p = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g33) {
            ((g33) dropDownBackground).p(this.p);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.q.k = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutY = y();
        if (textInputLayoutY != null) {
            textInputLayoutY.h();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.u = i;
        if (getAdapter() instanceof e23) {
            ((e23) getAdapter()).g();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        if (getAdapter() instanceof e23) {
            ((e23) getAdapter()).g();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new e23(this, getContext(), this.b, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (r()) {
            this.q.r();
        } else {
            super.showDropDown();
        }
    }

    public final TextInputLayout y() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
