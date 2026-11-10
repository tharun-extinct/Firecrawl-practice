package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
public final class ke0 extends ViewOutlineProvider {
    public final /* synthetic */ Chip g;

    public ke0(Chip chip) {
        this.g = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        oe0 oe0Var = this.g.q;
        if (oe0Var != null) {
            oe0Var.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
