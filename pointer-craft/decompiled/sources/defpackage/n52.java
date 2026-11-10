package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class n52 extends ts0 {
    public ts0[] q0 = new ts0[4];
    public int r0 = 0;

    public final void R(int i, zn5 zn5Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            zn5Var.g(this.q0[i2]);
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            kg6.g(this.q0[i3], i, arrayList, zn5Var);
        }
    }

    public void S() {
    }
}
