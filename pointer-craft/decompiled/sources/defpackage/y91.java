package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class y91 extends u51 {
    public int w;

    public y91(eo5 eo5Var) {
        super(eo5Var);
        if (eo5Var instanceof l72) {
            this.v = 2;
        } else {
            this.v = 3;
        }
    }

    @Override // defpackage.u51
    public final void n(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.l = i;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            q51 q51Var = (q51) obj;
            q51Var.g(q51Var);
        }
    }
}
