package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ix1 implements hx1 {
    public final int g;
    public final /* synthetic */ kx1 y;

    public ix1(kx1 kx1Var, int i) {
        this.y = kx1Var;
        this.g = i;
    }

    @Override // defpackage.hx1
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        kx1 kx1Var = this.y;
        pw1 pw1Var = kx1Var.e;
        int i = this.g;
        if (pw1Var == null || i >= 0 || !pw1Var.j().X(-1, 0)) {
            return kx1Var.Y(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
