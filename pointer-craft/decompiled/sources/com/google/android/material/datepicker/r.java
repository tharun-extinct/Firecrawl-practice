package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.u23;
import defpackage.v73;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView j;
    public final /* synthetic */ v t;

    public r(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.t = vVar;
        this.j = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.j;
        v73 v73VarY = materialCalendarGridView.y();
        if (i < v73VarY.r() || i > v73VarY.x()) {
            return;
        }
        if (materialCalendarGridView.y().getItem(i).longValue() >= ((u23) this.t.n.t).l0.a.j) {
            throw null;
        }
    }
}
