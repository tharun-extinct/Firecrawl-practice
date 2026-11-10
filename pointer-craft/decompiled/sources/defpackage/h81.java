package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h81 implements cz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ boolean t;

    public /* synthetic */ h81(byte b, Object obj, boolean z) {
        this.j = b;
        this.a = obj;
        this.t = z;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        int i;
        byte b = this.j;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                jh0 jh0Var = (jh0) obj4;
                lb4 lb4Var = (lb4) obj;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                lb4Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= h02Var.x(lb4Var) ? 4 : 2;
                }
                if (h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int iOrdinal = jh0Var.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.classic_mode_setup_button_locked;
                    } else if (iOrdinal == 1) {
                        i = R.string.classic_mode_setup_button_unlocked;
                    } else {
                        if (iOrdinal != 2) {
                            up.y();
                            return null;
                        }
                        i = R.string.classic_mode_setup_button_restart;
                    }
                    g75.y(xs2.I(i, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262142);
                    gp4.r(lb4Var, this.t, null, null, null, null, a11.s, h02Var, (iIntValue & 14) | 1572864, 30);
                } else {
                    h02Var.Q();
                }
                return og5.g;
            default:
                us3 us3VarV = ((p33) obj2).v(((ws0) obj3).g);
                return ((v33) obj).k0(us3VarV.j, us3VarV.t, qi1.j, new qg4((byte) 1, (bw4) obj4, us3VarV, this.t));
        }
    }
}
