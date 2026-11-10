package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class p43 extends FrameLayout implements zi0 {
    public final CollapsibleActionView j;

    /* JADX WARN: Multi-variable type inference failed */
    public p43(View view) {
        super(view.getContext());
        this.j = (CollapsibleActionView) view;
        addView(view);
    }
}
