package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class qn0 extends ClickableSpan {
    public final ov2 j;

    public qn0(ov2 ov2Var) {
        this.j = ov2Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.j.getClass();
    }
}
