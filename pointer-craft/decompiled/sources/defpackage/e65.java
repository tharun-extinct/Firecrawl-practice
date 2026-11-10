package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e65 implements xy1 {
    public final /* synthetic */ ob3 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ j51 t;

    public /* synthetic */ e65(j51 j51Var, ob3 ob3Var, byte b) {
        this.j = b;
        this.t = j51Var;
        this.a = ob3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        ob3 ob3Var = this.a;
        j51 j51Var = this.t;
        switch (b) {
            case 0:
                tz2 tz2Var = new tz2((my1) obj, (byte) 7);
                e65 e65Var = new e65(j51Var, ob3Var, (byte) 1);
                if (e03.g()) {
                    return e03.g() ? new b03(tz2Var, e65Var, Build.VERSION.SDK_INT == 28 ? ft3.g : ht3.g) : g73.g;
                }
                uo1.u("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                yb1 yb1Var = (yb1) obj;
                ob3Var.setValue(new qe2((((long) j51Var.V(yb1.g(yb1Var.g))) & 4294967295L) | (((long) j51Var.V(yb1.y(yb1Var.g))) << 32)));
                return og5.g;
        }
    }
}
