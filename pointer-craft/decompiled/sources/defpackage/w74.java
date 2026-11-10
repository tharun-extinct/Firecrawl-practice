package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w74 implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ byte t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w74(Object obj, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        byte b2 = this.t;
        Object obj = this.a;
        switch (b) {
            case 0:
                ((jr2) obj).C(b2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.b;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.z(view, b2, false);
                }
                break;
        }
    }
}
