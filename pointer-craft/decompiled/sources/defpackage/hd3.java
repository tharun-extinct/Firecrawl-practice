package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd3 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ u54 t;

    public /* synthetic */ hd3(u54 u54Var, byte b) {
        this.j = b;
        this.t = u54Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        boolean z = true;
        u54 u54Var = this.t;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object obj2 = u54Var.j;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Object obj3 = (hd5) obj;
                if (((i73) obj3).j.h) {
                    u54Var.j = obj3;
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
