package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.b33;
import defpackage.fa4;
import defpackage.l0;
import defpackage.n54;
import defpackage.p44;
import defpackage.qa0;
import defpackage.u73;
import defpackage.v73;
import defpackage.v92;
import defpackage.y44;
import defpackage.zh5;
import io.appground.blek.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends p44 {
    public int j = 0;
    public u73 l;
    public final v92 n;
    public final qa0 r;
    public final fa4 v;
    public final int x;

    public v(ContextThemeWrapper contextThemeWrapper, qa0 qa0Var, v92 v92Var, fa4 fa4Var) {
        u73 u73Var = qa0Var.j;
        u73 u73Var2 = qa0Var.t;
        u73 u73Var3 = qa0Var.m;
        if (u73Var.j.compareTo(u73Var3.j) > 0) {
            l0.u("firstPage cannot be after currentPage");
            throw null;
        }
        if (u73Var3.j.compareTo(u73Var2.j) > 0) {
            l0.u("currentPage cannot be after lastPage");
            throw null;
        }
        this.x = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * v73.n) + (b33.U(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.r = qa0Var;
        this.n = v92Var;
        this.v = fa4Var;
        this.l = u73Var3;
        if (this.g.g()) {
            l0.z("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.y = true;
    }

    @Override // defpackage.p44
    public final int g() {
        return this.r.c;
    }

    public final int l(u73 u73Var) {
        return this.r.j.t(u73Var);
    }

    @Override // defpackage.p44
    public final void n(n54 n54Var, int i) {
        n nVar = (n) n54Var;
        qa0 qa0Var = this.r;
        Calendar calendarG = zh5.g(qa0Var.j.j);
        calendarG.add(2, i);
        u73 u73Var = new u73(calendarG);
        nVar.h.setText(u73Var.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) nVar.o.findViewById(R.id.month_grid);
        if (materialCalendarGridView.y() == null || !u73Var.equals(materialCalendarGridView.y().g)) {
            new v73(u73Var, qa0Var);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.y().getClass();
        throw null;
    }

    @Override // defpackage.p44
    public final n54 v(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!b33.U(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new n(linearLayout, false);
        }
        linearLayout.setLayoutParams(new y44(-1, this.x));
        return new n(linearLayout, true);
    }

    public final u73 x(int i) {
        Calendar calendarG = zh5.g(this.r.j.j);
        calendarG.add(2, i);
        return new u73(calendarG);
    }

    @Override // defpackage.p44
    public final long y(int i) {
        Calendar calendarG = zh5.g(this.r.j.j);
        calendarG.add(2, i);
        calendarG.set(5, 1);
        Calendar calendarG2 = zh5.g(calendarG);
        calendarG2.get(2);
        calendarG2.get(1);
        calendarG2.getMaximum(7);
        calendarG2.getActualMaximum(5);
        calendarG2.getTimeInMillis();
        return calendarG2.getTimeInMillis();
    }
}
