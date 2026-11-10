package com.google.android.material.datepicker;

import defpackage.v73;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ MaterialCalendarGridView j;
    public final /* synthetic */ int t;

    public /* synthetic */ y(v vVar, MaterialCalendarGridView materialCalendarGridView, int i) {
        this.j = materialCalendarGridView;
        this.t = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int iG;
        MaterialCalendarGridView materialCalendarGridView = this.j;
        if (!materialCalendarGridView.hasFocus() || (i = this.t) == 0) {
            return;
        }
        v73 v73VarY = materialCalendarGridView.y();
        if (i == 1) {
            iG = v73VarY.y(v73VarY.x() + 1);
            if (iG == -1) {
                iG = v73VarY.x();
            }
        } else {
            iG = v73VarY.g(v73VarY.r() - 1);
            if (iG == -1) {
                iG = v73VarY.r();
            }
        }
        materialCalendarGridView.setSelection(iG);
    }
}
