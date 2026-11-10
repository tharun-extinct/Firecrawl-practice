package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wn5 {
    public final Context g;
    public final l62 y;

    public wn5(Context context, l62 l62Var) {
        context.getClass();
        l62Var.getClass();
        this.g = context;
        this.y = l62Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Map map, mu0 mu0Var) {
        vn5 vn5Var;
        if (mu0Var instanceof vn5) {
            vn5Var = (vn5) mu0Var;
            int i = vn5Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                vn5Var.w = i - Integer.MIN_VALUE;
            } else {
                vn5Var = new vn5(this, mu0Var);
            }
        } else {
            vn5Var = new vn5(this, mu0Var);
        }
        Object objK = vn5Var.m;
        int i2 = vn5Var.w;
        og5 og5Var = og5.g;
        mu0 mu0Var2 = null;
        try {
            if (i2 == 0) {
                js2.o(objK);
                if (!map.isEmpty()) {
                    vz0 vz0VarY = q03.y(this.g);
                    ko koVar = new ko((Object) map, mu0Var2, (byte) 17);
                    vn5Var.w = 1;
                    objK = kq2.k(vz0VarY, koVar, vn5Var);
                    px0 px0Var = px0.j;
                    if (objK == px0Var) {
                        return px0Var;
                    }
                }
                return og5Var;
            }
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objK);
        } catch (Throwable unused) {
        }
        return og5Var;
    }
}
