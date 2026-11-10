package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class jf4 implements kf4 {
    public final ScrollFeedbackProvider j;

    public jf4(NestedScrollView nestedScrollView) {
        this.j = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.kf4
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.j.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.kf4
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.j.onScrollProgress(i, i2, i3, i4);
    }
}
