package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zt4 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ View t;

    public /* synthetic */ zt4(View view, byte b) {
        this.j = b;
        this.t = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        View view = this.t;
        switch (b) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
