package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class lf4 {
    public final kf4 g;

    public lf4(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.g = new jf4(nestedScrollView);
        } else {
            this.g = new aj6((byte) 26);
        }
    }
}
