package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b5 extends v4 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ pw5 n;
    public final /* synthetic */ String r;
    public final /* synthetic */ wl0 y;

    public /* synthetic */ b5(wl0 wl0Var, String str, pw5 pw5Var, byte b) {
        this.g = b;
        this.y = wl0Var;
        this.r = str;
        this.n = pw5Var;
    }

    @Override // defpackage.v4
    public final void g(Object obj) throws Exception {
        byte b = this.g;
        pw5 pw5Var = this.n;
        String str = this.r;
        wl0 wl0Var = this.y;
        switch (b) {
            case 0:
                ArrayList arrayList = wl0Var.n;
                Object obj2 = wl0Var.y.get(str);
                if (obj2 == null) {
                    uo1.q("Attempting to launch an unregistered ActivityResultLauncher with contract ", pw5Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    wl0Var.y(iIntValue, pw5Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = wl0Var.n;
                Object obj3 = wl0Var.y.get(str);
                if (obj3 == null) {
                    uo1.q("Attempting to launch an unregistered ActivityResultLauncher with contract ", pw5Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    wl0Var.y(iIntValue2, pw5Var, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void y() {
        this.y.x(this.r);
    }
}
