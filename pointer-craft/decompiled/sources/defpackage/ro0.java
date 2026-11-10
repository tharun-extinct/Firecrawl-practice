package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ro0 implements du2 {
    public final /* synthetic */ byte j;
    public final Object t;

    public /* synthetic */ ro0(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                new HashMap();
                p02[] p02VarArr = (p02[]) obj;
                if (p02VarArr.length > 0) {
                    p02 p02Var = p02VarArr[0];
                    throw null;
                }
                if (p02VarArr.length <= 0) {
                    return;
                }
                p02 p02Var2 = p02VarArr[0];
                throw null;
            default:
                if (vt2Var == vt2.ON_DESTROY) {
                    yk5 yk5Var = (yk5) obj;
                    yk5Var.g = null;
                    yk5Var.y = null;
                    return;
                }
                return;
        }
    }
}
