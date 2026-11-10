package defpackage;

import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class fm2 implements ik5 {
    public final MaterialCardView g;
    public final FlexboxLayout y;

    public fm2(MaterialCardView materialCardView, FlexboxLayout flexboxLayout) {
        this.g = materialCardView;
        this.y = flexboxLayout;
    }

    @Override // defpackage.ik5
    public final View getRoot() {
        return this.g;
    }
}
