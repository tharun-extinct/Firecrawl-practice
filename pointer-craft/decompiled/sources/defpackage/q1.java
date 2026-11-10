package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends ClickableSpan {
    public final int a;
    public final int j;
    public final m2 t;

    public q1(int i, m2 m2Var, int i2) {
        this.j = i;
        this.t = m2Var;
        this.a = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.j);
        this.t.g.performAction(this.a, bundle);
    }
}
