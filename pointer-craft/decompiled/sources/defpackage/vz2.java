package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vz2 implements cz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ long t;

    public /* synthetic */ vz2(long j, byte b) {
        this.j = b;
        this.t = j;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        g73 g73Var = g73.g;
        long j = this.t;
        lb4 lb4Var = (lb4) obj;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                lb4Var.getClass();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h02Var.Q();
                } else {
                    ha2 ha2VarY = bd6.y;
                    if (ha2VarY == null) {
                        ga2 ga2Var = new ga2("Outlined.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = fj5.g;
                        cu4 cu4Var = new cu4(jj0.y);
                        kq3 kq3Var = new kq3();
                        kq3Var.j(10.0f, 8.64f);
                        kq3Var.x(15.27f, 12.0f);
                        kq3Var.x(10.0f, 15.36f);
                        kq3Var.q(8.64f);
                        kq3Var.j(8.0f, 5.0f);
                        kq3Var.w(14.0f);
                        kq3Var.l(11.0f, -7.0f);
                        kq3Var.x(8.0f, 5.0f);
                        kq3Var.g();
                        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
                        ha2VarY = ga2Var.y();
                        bd6.y = ha2VarY;
                    }
                    t92.g(ha2VarY, "", null, 0L, h02Var, 48, 12);
                    mq2.y(h02Var, mq4.q(g73Var, 4.0f));
                    g75.y(du4.i("Play (", String.format(Locale.getDefault(), "%.1f s", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000.0d)}, 1)), ")"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262142);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                lb4Var.getClass();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    h02Var2.Q();
                } else {
                    t92.g(ng6.y(), "", null, 0L, h02Var2, 48, 12);
                    mq2.y(h02Var2, mq4.q(g73Var, 4.0f));
                    if (j != 0) {
                        h02Var2.X(-271587668);
                        g75.y(du4.i("Stop Recording (", String.format(Locale.getDefault(), "%.1f s", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000.0d)}, 1)), ")"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                        h02Var2.b(false);
                    } else {
                        h02Var2.X(-271652954);
                        g75.y("Use mouse/keyboard to begin", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 6, 0, 262142);
                        h02Var2.b(false);
                    }
                }
                break;
        }
        return og5Var;
    }
}
