package defpackage;

import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ bf(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        Object obj = this.m;
        Object obj2 = this.a;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                cf cfVar = (cf) obj3;
                af afVar = (af) obj;
                ActionMode actionModeStartActionMode = cfVar.g.startActionMode(new br1((ze) obj2), 1);
                cfVar.j = actionModeStartActionMode;
                if (actionModeStartActionMode == null) {
                    afVar.close();
                }
                break;
            default:
                m31 m31Var = (m31) obj;
                ((ViewGroup) obj3).endViewTransition((View) obj2);
                ((qu4) m31Var.r.g).r(m31Var);
                break;
        }
    }
}
