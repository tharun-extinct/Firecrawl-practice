package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class vc2 extends InputConnectionWrapper {
    public final /* synthetic */ gc0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc2(InputConnection inputConnection, gc0 gc0Var) {
        super(inputConnection, false);
        this.g = gc0Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        fa4 fa4Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            fa4Var = new fa4(new xc2(inputContentInfo), (byte) 16);
        }
        if (this.g.n(fa4Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
