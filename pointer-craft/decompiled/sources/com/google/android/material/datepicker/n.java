package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.lk5;
import defpackage.n54;
import defpackage.xk5;
import io.appground.blek.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends n54 {
    public final TextView h;
    public final MaterialCalendarGridView o;

    public n(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.h = textView;
        WeakHashMap weakHashMap = xk5.g;
        new lk5((byte) 3).y(textView, Boolean.TRUE);
        this.o = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
