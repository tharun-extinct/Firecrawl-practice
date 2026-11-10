package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements em5 {
    public boolean g = false;
    public final /* synthetic */ ActionBarContextView r;
    public byte y;

    public n(ActionBarContextView actionBarContextView) {
        this.r = actionBarContextView;
    }

    @Override // defpackage.em5
    public final void g() {
        if (this.g) {
            return;
        }
        ActionBarContextView actionBarContextView = this.r;
        actionBarContextView.w = null;
        super/*android.view.View*/.setVisibility(this.y);
    }

    @Override // defpackage.em5
    public final void r() {
        super/*android.view.View*/.setVisibility(0);
        this.g = false;
    }

    @Override // defpackage.em5
    public final void y() {
        this.g = true;
    }
}
