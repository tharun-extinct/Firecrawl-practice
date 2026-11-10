package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class u93 implements gr1 {
    public final Object a;
    public final /* synthetic */ byte j = 1;
    public final Object m;
    public final Object t;

    public u93(gr1 gr1Var, fx0 fx0Var) {
        this.t = fx0Var;
        this.a = pw5.Q(fx0Var);
        this.m = new s12(gr1Var, null, (byte) 20);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) throws Throwable {
        t93 t93Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        Object obj2 = this.m;
        Object obj3 = this.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                if (mu0Var instanceof t93) {
                    t93Var = (t93) mu0Var;
                    int i = t93Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        t93Var.q = i - Integer.MIN_VALUE;
                    } else {
                        t93Var = new t93(this, mu0Var);
                    }
                } else {
                    t93Var = new t93(this, mu0Var);
                }
                Object obj5 = t93Var.m;
                int i2 = t93Var.q;
                if (i2 != 0) {
                    if (i2 == 1) {
                        js2.o(obj5);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj5);
                gr1 gr1Var = (gr1) obj4;
                db3 db3Var = (db3) obj;
                String str = (String) db3Var.r((rw3) obj3);
                x93 x93Var = new x93(str, str != null ? jr2.E((String) db3Var.r(jr2.i(str))) : null, z93.l((SharedPreferences) obj2, str));
                t93Var.q = 1;
                return gr1Var.c(x93Var, t93Var) == px0Var ? px0Var : og5Var;
            default:
                Object objV = jb6.v((fx0) obj4, obj, obj3, (s12) obj2, mu0Var);
                return objV == px0Var ? objV : og5Var;
        }
    }

    public u93(gr1 gr1Var, rw3 rw3Var, SharedPreferences sharedPreferences) {
        this.t = gr1Var;
        this.a = rw3Var;
        this.m = sharedPreferences;
    }
}
