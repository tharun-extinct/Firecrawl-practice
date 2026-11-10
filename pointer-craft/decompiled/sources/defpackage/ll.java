package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ll extends eb6 {
    public final /* synthetic */ Object r;
    public final /* synthetic */ byte y;

    public /* synthetic */ ll(Object obj, byte b) {
        this.y = b;
        this.r = obj;
    }

    @Override // defpackage.em5
    public final void g() {
        byte b = this.y;
        Object obj = this.r;
        switch (b) {
            case 0:
                tl tlVar = (tl) ((ml) obj).t;
                tlVar.B.setAlpha(1.0f);
                tlVar.E.n(null);
                tlVar.E = null;
                break;
            case 1:
                tl tlVar2 = (tl) obj;
                tlVar2.B.setAlpha(1.0f);
                tlVar2.E.n(null);
                tlVar2.E = null;
                break;
            default:
                tl tlVar3 = (tl) ((cd2) obj).a;
                tlVar3.B.setVisibility(8);
                PopupWindow popupWindow = tlVar3.C;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (tlVar3.B.getParent() instanceof View) {
                    View view = (View) tlVar3.B.getParent();
                    WeakHashMap weakHashMap = xk5.g;
                    view.requestApplyInsets();
                }
                tlVar3.B.v();
                tlVar3.E.n(null);
                tlVar3.E = null;
                ViewGroup viewGroup = tlVar3.G;
                WeakHashMap weakHashMap2 = xk5.g;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.eb6, defpackage.em5
    public void r() {
        byte b = this.y;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((tl) ((ml) obj).t).B.setVisibility(0);
                break;
            case 1:
                tl tlVar = (tl) obj;
                tlVar.B.setVisibility(0);
                if (tlVar.B.getParent() instanceof View) {
                    View view = (View) tlVar.B.getParent();
                    WeakHashMap weakHashMap = xk5.g;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
