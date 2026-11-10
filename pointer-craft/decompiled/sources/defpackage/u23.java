package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.v;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class u23<S> extends ps3 {
    public int k0;
    public qa0 l0;
    public u73 m0;
    public int n0;
    public q70 o0;
    public RecyclerView p0;
    public RecyclerView q0;
    public View r0;
    public View s0;
    public View t0;
    public View u0;
    public MaterialButton v0;
    public AccessibilityManager w0;
    public ro3 x0;
    public boolean y0;

    @Override // defpackage.pw1
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.k0);
        this.o0 = new q70((Context) contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.w0 = (AccessibilityManager) N().getSystemService("accessibility");
        u73 u73Var = this.l0.j;
        boolean zU = b33.U(contextThemeWrapper, R.attr.windowFullscreen);
        this.y0 = zU;
        byte b = 0;
        byte b2 = 1;
        if (zU) {
            i = io.appground.blek.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = io.appground.blek.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = N().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(io.appground.blek.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(io.appground.blek.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(io.appground.blek.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(io.appground.blek.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = v73.n;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(io.appground.blek.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(io.appground.blek.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(io.appground.blek.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(io.appground.blek.R.id.mtrl_calendar_days_of_week);
        xk5.q(gridView, new p23(b));
        int i4 = this.l0.q;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new x01(i4) : new x01()));
        gridView.setNumColumns(u73Var.m);
        gridView.setEnabled(false);
        this.q0 = (RecyclerView) viewInflate.findViewById(io.appground.blek.R.id.mtrl_calendar_months);
        this.q0.setLayoutManager(new q23(this, i2, i2));
        this.q0.setTag("MONTHS_VIEW_GROUP_TAG");
        byte b3 = 20;
        v vVar = new v(contextThemeWrapper, this.l0, new v92(this, b3), new fa4(this, b3));
        this.q0.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(io.appground.blek.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(io.appground.blek.R.id.mtrl_calendar_year_selector_frame);
        this.p0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.p0.setLayoutManager(new GridLayoutManager(integer));
            this.p0.setAdapter(new ls5(this));
            RecyclerView recyclerView2 = this.p0;
            r23 r23Var = new r23();
            zh5.r(null);
            zh5.r(null);
            recyclerView2.t(r23Var);
        }
        if (!this.y0) {
            ro3 ro3Var = new ro3();
            this.x0 = ro3Var;
            RecyclerView recyclerView3 = this.q0;
            RecyclerView recyclerView4 = ro3Var.g;
            if (recyclerView4 != recyclerView3) {
                xs4 xs4Var = ro3Var.y;
                if (recyclerView4 != null) {
                    ArrayList arrayList = recyclerView4.q0;
                    if (arrayList != null) {
                        arrayList.remove(xs4Var);
                    }
                    ro3Var.g.setOnFlingListener(null);
                }
                ro3Var.g = recyclerView3;
                if (recyclerView3 != null) {
                    if (recyclerView3.getOnFlingListener() != null) {
                        l0.z("An instance of OnFlingListener already set.");
                        return null;
                    }
                    ro3Var.g.a(xs4Var);
                    ro3Var.g.setOnFlingListener(ro3Var);
                    new Scroller(ro3Var.g.getContext(), new DecelerateInterpolator());
                    ro3Var.x();
                }
            }
        }
        if (viewInflate.findViewById(io.appground.blek.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(io.appground.blek.R.id.month_navigation_fragment_toggle);
            this.v0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            xk5.q(this.v0, new s23(this, b));
            View viewFindViewById = viewInflate.findViewById(io.appground.blek.R.id.month_navigation_previous);
            this.r0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            zy5.y(this.r0, i(io.appground.blek.R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(io.appground.blek.R.id.month_navigation_next);
            this.s0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            zy5.y(this.s0, i(io.appground.blek.R.string.mtrl_picker_next_month_tooltip));
            this.t0 = viewInflate.findViewById(io.appground.blek.R.id.mtrl_calendar_year_selector_frame);
            this.u0 = viewInflate.findViewById(io.appground.blek.R.id.mtrl_calendar_day_selector_frame);
            U(1);
            this.v0.setText(this.m0.l());
            this.q0.a(new t23(this, vVar));
            this.v0.setOnClickListener(new l3(this, (byte) 2));
            this.s0.setOnClickListener(new o23(this, vVar, b));
            this.r0.setOnClickListener(new o23(this, vVar, b2));
            X(vVar.l(this.m0));
        }
        this.q0.k0(vVar.l(this.m0));
        xk5.q(this.q0, new p23(b2));
        V(viewInflate);
        return viewInflate;
    }

    @Override // defpackage.pw1
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.k0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.l0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.m0);
    }

    @Override // defpackage.ps3
    public final void R(bi6 bi6Var) {
        this.j0.add(bi6Var);
    }

    public final boolean S(boolean z) {
        u73 u73Var;
        if (this.y0) {
            return false;
        }
        if (this.q0.getScrollState() != 0) {
            return true;
        }
        v vVar = (v) this.q0.getAdapter();
        if (vVar == null || (u73Var = this.m0) == null) {
            return false;
        }
        int iL = vVar.l(u73Var) + (z ? 1 : -1);
        if (iL < 0 || iL >= vVar.r.c) {
            return false;
        }
        vVar.j = z ? 2 : 1;
        T(vVar.x(iL));
        return true;
    }

    public final void T(u73 u73Var) {
        v vVar = (v) this.q0.getAdapter();
        int iL = vVar.l(u73Var);
        AccessibilityManager accessibilityManager = this.w0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iL2 = iL - vVar.l(this.m0);
            boolean z = Math.abs(iL2) > 3;
            boolean z2 = iL2 > 0;
            this.m0 = u73Var;
            byte b = 2;
            if (z && z2) {
                this.q0.k0(iL - 3);
                this.q0.post(new xa0(this, iL, b));
            } else {
                RecyclerView recyclerView = this.q0;
                if (z) {
                    recyclerView.k0(iL + 3);
                    this.q0.post(new xa0(this, iL, b));
                } else {
                    recyclerView.post(new xa0(this, iL, b));
                }
            }
        } else {
            this.m0 = u73Var;
            this.q0.k0(iL);
        }
        W();
        X(iL);
    }

    public final void U(int i) {
        this.n0 = i;
        if (i == 2) {
            this.p0.getLayoutManager().D0(this.m0.a - ((ls5) this.p0.getAdapter()).r.l0.j.a);
            this.t0.setVisibility(0);
            this.u0.setVisibility(8);
            this.r0.setVisibility(8);
            this.s0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.t0.setVisibility(8);
            this.u0.setVisibility(0);
            this.r0.setVisibility(0);
            this.s0.setVisibility(0);
            T(this.m0);
        }
    }

    public final void V(View view) {
        if (view == null) {
            return;
        }
        int i = this.n0;
        if (i == 2) {
            xk5.w(view, i(io.appground.blek.R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            xk5.w(view, i(io.appground.blek.R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void W() {
        u73 u73Var;
        v vVar = (v) this.q0.getAdapter();
        if (vVar != null) {
            q44 q44Var = vVar.g;
            if (this.y0 || (u73Var = this.m0) == null || u73Var.equals(vVar.l)) {
                return;
            }
            int iL = vVar.l(vVar.l);
            vVar.l = u73Var;
            int iL2 = vVar.l(u73Var);
            q44Var.n(null, iL);
            q44Var.n(null, iL2);
        }
    }

    public final void X(int i) {
        View view = this.s0;
        if (view != null) {
            view.setEnabled(i + 1 < this.q0.getAdapter().g());
        }
        View view2 = this.r0;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // defpackage.pw1
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle == null) {
            bundle = this.w;
        }
        this.k0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            uo1.B();
            return;
        }
        this.l0 = (qa0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.m0 = (u73) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            uo1.B();
        }
    }
}
