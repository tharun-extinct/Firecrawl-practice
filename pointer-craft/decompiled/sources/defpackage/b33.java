package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import io.appground.blek.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class b33<S> extends f91 {
    public ps3 A0;
    public qa0 B0;
    public u23 C0;
    public int D0;
    public CharSequence E0;
    public boolean F0;
    public int G0;
    public int H0;
    public CharSequence I0;
    public int J0;
    public CharSequence K0;
    public int L0;
    public CharSequence M0;
    public int N0;
    public CharSequence O0;
    public TextView P0;
    public CheckableImageButton Q0;
    public g33 R0;
    public boolean S0;
    public CharSequence T0;
    public CharSequence U0;
    public final LinkedHashSet x0;
    public final LinkedHashSet y0;
    public int z0;

    public b33() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.x0 = new LinkedHashSet();
        this.y0 = new LinkedHashSet();
    }

    public static int T(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarY = zh5.y();
        calendarY.set(5, 1);
        Calendar calendarG = zh5.g(calendarY);
        calendarG.get(2);
        calendarG.get(1);
        int maximum = calendarG.getMaximum(7);
        calendarG.getActualMaximum(5);
        calendarG.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean U(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(mq2.o(R.attr.materialCalendarStyle, context, u23.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // defpackage.pw1
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.F0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.F0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(T(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(T(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.Q0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.P0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.Q0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.Q0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, k33.J(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], k33.J(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.Q0.setChecked(this.G0 != 0);
        xk5.q(this.Q0, null);
        CheckableImageButton checkableImageButton2 = this.Q0;
        this.Q0.setContentDescription(this.G0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.Q0;
        zy5.y(this.Q0, this.G0 == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.Q0.setOnClickListener(new nh0(this, (byte) 2));
        S();
        throw null;
    }

    @Override // defpackage.f91, defpackage.pw1
    public final void F(Bundle bundle) {
        super.F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        qa0 qa0Var = this.B0;
        pa0 pa0Var = new pa0();
        long j = qa0Var.j.w;
        long j2 = qa0Var.t.w;
        pa0Var.g = Long.valueOf(qa0Var.m.w);
        int i = qa0Var.q;
        v01 v01Var = qa0Var.a;
        u23 u23Var = this.C0;
        u73 u73Var = u23Var == null ? null : u23Var.m0;
        if (u73Var != null) {
            pa0Var.g = Long.valueOf(u73Var.w);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", v01Var);
        u73 u73VarN = u73.n(j);
        u73 u73VarN2 = u73.n(j2);
        v01 v01Var2 = (v01) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = pa0Var.g;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new qa0(u73VarN, u73VarN2, v01Var2, l == null ? null : u73.n(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.D0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.E0);
        bundle.putInt("INPUT_MODE_KEY", this.G0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.H0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.I0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.J0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.K0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.L0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.M0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.N0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.O0);
    }

    @Override // defpackage.f91, defpackage.pw1
    public final void G() {
        ps3 ps3Var;
        ps3 ps3Var2;
        ps3 ps3Var3;
        aq2 vp5Var;
        aq2 vp5Var2;
        super.G();
        Dialog dialog = this.s0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.F0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.R0);
            if (!this.S0) {
                View viewFindViewById = O().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListB = y94.B(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListB != null ? Integer.valueOf(colorStateListB.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int i = xq2.i(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(i);
                }
                xs2.F(window, false);
                window.getContext();
                Context context = window.getContext();
                int i2 = Build.VERSION.SDK_INT;
                int iN = i2 < 27 ? zj0.n(xq2.i(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                if (i2 < 35) {
                    window.setStatusBarColor(0);
                }
                if (i2 < 35) {
                    window.setNavigationBarColor(iN);
                }
                boolean z3 = xq2.u(0) || xq2.u(numValueOf.intValue());
                jy3 jy3Var = new jy3(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 35) {
                    vp5Var = new xp5(window, jy3Var);
                } else if (i3 >= 30) {
                    vp5Var = new wp5(window, jy3Var);
                } else {
                    vp5Var = i3 >= 26 ? new vp5(window, jy3Var) : new up5(window, jy3Var);
                }
                vp5Var.F(z3);
                boolean zU = xq2.u(i);
                if (xq2.u(iN) || (iN == 0 && zU)) {
                    z = true;
                }
                jy3 jy3Var2 = new jy3(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 35) {
                    vp5Var2 = new xp5(window, jy3Var2);
                } else if (i4 >= 30) {
                    vp5Var2 = new wp5(window, jy3Var2);
                } else {
                    vp5Var2 = i4 >= 26 ? new vp5(window, jy3Var2) : new up5(window, jy3Var2);
                }
                vp5Var2.E(z);
                vg1 vg1Var = new vg1(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = xk5.g;
                pk5.r(viewFindViewById, vg1Var);
                this.S0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = c().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.R0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.s0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ld2(dialog2, rect));
        }
        N();
        int i5 = this.z0;
        if (i5 == 0) {
            S();
            throw null;
        }
        pw1 pw1VarE = j().E(this.G0 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        if (pw1VarE instanceof ps3) {
            ps3Var3 = (ps3) pw1VarE;
        } else {
            ps3Var = null;
        }
        if (ps3Var == null) {
            if (this.G0 == 1) {
                ps3Var = ps3Var3;
                S();
                qa0 qa0Var = this.B0;
                h33 h33Var = new h33();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i5);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", qa0Var);
                h33Var.Q(bundle);
                ps3Var2 = h33Var;
            } else {
                ps3Var = ps3Var3;
                S();
                qa0 qa0Var2 = this.B0;
                u23 u23Var = new u23();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i5);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", qa0Var2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", qa0Var2.m);
                u23Var.Q(bundle2);
                this.C0 = u23Var;
                ps3Var2 = u23Var;
            }
            ps3Var = ps3Var2;
        }
        ps3Var = ps3Var3;
        this.A0 = ps3Var;
        ps3Var.R(new bi6((byte) 23));
        this.P0.setText((this.G0 == 1 && c().getConfiguration().orientation == 2) ? this.U0 : this.T0);
        S();
        throw null;
    }

    @Override // defpackage.f91, defpackage.pw1
    public final void H() {
        this.A0.j0.clear();
        super.H();
    }

    @Override // defpackage.f91
    public final Dialog R() {
        Context contextN = N();
        N();
        int i = this.z0;
        if (i == 0) {
            S();
            throw null;
        }
        Dialog dialog = new Dialog(contextN, i);
        Context context = dialog.getContext();
        this.F0 = U(context, android.R.attr.windowFullscreen);
        this.R0 = new g33(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p24.p, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.R0.c(context);
        this.R0.p(ColorStateList.valueOf(color));
        this.R0.s(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void S() {
        if (this.w.getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        uo1.B();
    }

    @Override // defpackage.f91, defpackage.pw1
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle == null) {
            bundle = this.w;
        }
        this.z0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            uo1.B();
            return;
        }
        this.B0 = (qa0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            uo1.B();
            return;
        }
        this.D0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.G0 = bundle.getInt("INPUT_MODE_KEY");
        this.H0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.J0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.L0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.N0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.O0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.E0;
        if (text == null) {
            text = N().getResources().getText(this.D0);
        }
        this.T0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.U0 = text;
    }

    @Override // defpackage.f91, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.f91, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.O;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
