package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes2.dex */
public class di3 extends ci3 {
    @Override // defpackage.ci3, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        h44 h44Var = this.y;
        if (h44Var != null) {
            return h44Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
