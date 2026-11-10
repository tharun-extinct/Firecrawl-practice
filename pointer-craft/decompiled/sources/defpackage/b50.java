package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class b50 implements Runnable {
    public final /* synthetic */ BottomSheetBehavior a;
    public final /* synthetic */ View j;
    public final /* synthetic */ byte t;

    /* JADX WARN: Multi-variable type inference failed */
    public b50(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = bottomSheetBehavior;
        this.j = view;
        this.t = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.H(this.j, this.t, false);
    }
}
