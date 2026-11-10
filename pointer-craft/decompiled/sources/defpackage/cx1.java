package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cx1 implements s4 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ kx1 t;

    public /* synthetic */ cx1(kx1 kx1Var, byte b) {
        this.j = b;
        this.t = kx1Var;
    }

    @Override // defpackage.s4
    public final void r(Object obj) {
        byte b = this.j;
        kx1 kx1Var = this.t;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                gx1 gx1Var = (gx1) kx1Var.F.pollFirst();
                if (gx1Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = gx1Var.j;
                    if (kx1Var.r.b(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                r4 r4Var = (r4) obj;
                gx1 gx1Var2 = (gx1) kx1Var.F.pollFirst();
                if (gx1Var2 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str2 = gx1Var2.j;
                    int i2 = gx1Var2.t;
                    pw1 pw1VarB = kx1Var.r.b(str2);
                    if (pw1VarB == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    } else {
                        pw1VarB.f(i2, r4Var.j, r4Var.t);
                    }
                }
                break;
        }
    }
}
