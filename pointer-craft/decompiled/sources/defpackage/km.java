package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class km implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ km(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                sm smVar = (sm) obj;
                if (!smVar.getInternalPopup().g()) {
                    smVar.w.q(smVar.getTextDirection(), smVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = smVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                pm pmVar = (pm) obj;
                sm smVar2 = pmVar.N;
                if (smVar2.isAttachedToWindow() && smVar2.getGlobalVisibleRect(pmVar.L)) {
                    pmVar.u();
                    pmVar.r();
                } else {
                    pmVar.dismiss();
                }
                break;
            case 2:
                fc0 fc0Var = (fc0) obj;
                ArrayList arrayList = fc0Var.b;
                if (fc0Var.g() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((ec0) arrayList.get(0)).g.F) {
                        View view = fc0Var.f;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                ((ec0) obj2).g.r();
                            }
                        } else {
                            fc0Var.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                kv4 kv4Var = (kv4) obj;
                b53 b53Var = kv4Var.b;
                if (kv4Var.g() && !b53Var.F) {
                    View view2 = kv4Var.h;
                    if (view2 != null && view2.isShown()) {
                        b53Var.r();
                    } else {
                        kv4Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
