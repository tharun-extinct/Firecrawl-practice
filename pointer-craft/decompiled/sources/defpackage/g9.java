package defpackage;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g9 implements bi0 {
    public final h9 g;

    public g9(h9 h9Var) {
        this.g = h9Var;
    }

    public final void g(ai0 ai0Var) {
        h9 h9Var = this.g;
        if (ai0Var != null) {
            h9Var.g().setPrimaryClip(ai0Var.g());
        } else if (Build.VERSION.SDK_INT >= 28) {
            rs5.g(h9Var.g());
        } else {
            h9Var.g().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
