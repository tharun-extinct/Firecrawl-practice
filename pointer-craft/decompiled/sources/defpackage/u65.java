package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes.dex */
public final class u65 implements ik5 {
    public final MaterialCardView g;
    public final TextView y;

    public u65(MaterialCardView materialCardView, TextView textView) {
        this.g = materialCardView;
        this.y = textView;
    }

    @Override // defpackage.ik5
    public final View getRoot() {
        return this.g;
    }
}
