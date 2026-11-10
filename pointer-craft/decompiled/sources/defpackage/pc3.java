package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc3 implements xy1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ pc3(byte b) {
        this.j = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) throws Throwable {
        byte b = this.j;
        boolean z = true;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return new ew(k33.F((zx0) obj));
            case 1:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 2:
                ad3 ad3Var = (ad3) obj;
                ad3Var.getClass();
                dd3 dd3Var = ad3Var.a;
                if (dd3Var == null || dd3Var.w.r != ad3Var.t.g) {
                    return null;
                }
                return dd3Var;
            case 3:
                ad3 ad3Var2 = (ad3) obj;
                ad3Var2.getClass();
                dd3 dd3Var2 = ad3Var2.a;
                if (dd3Var2 == null || dd3Var2.w.r != ad3Var2.t.g) {
                    return null;
                }
                return dd3Var2;
            case 4:
                ad3 ad3Var3 = (ad3) obj;
                ad3Var3.getClass();
                return ad3Var3.a;
            case 5:
                ad3 ad3Var4 = ((mc3) ((ih) obj).r()).t;
                ad3Var4.getClass();
                int i = ad3.q;
                for (ad3 ad3Var5 : mq2.l((tn0) ad3Var4)) {
                }
                return null;
            case 6:
                return ((mc3) obj).w;
            case 7:
                lj4.t((nj4) obj, 4);
                return og5Var;
            case 8:
                return Boolean.TRUE;
            case 9:
                ((ih) obj).getClass();
                qe5 qe5VarE0 = m50.e0(400, 100, null, 4);
                pc3 pc3Var = new pc3((byte) 12);
                te5 te5Var = yj1.g;
                return new ek1(new mc5((hn1) null, new vq4(new wj1(pc3Var, (byte) 0), qe5VarE0), (wc0) null, (ae4) null, (LinkedHashMap) null, 125)).g(yj1.v(m50.e0(300, 200, null, 4), 2));
            case 10:
                ((ih) obj).getClass();
                return yj1.v(m50.e0(300, 0, null, 6), 2);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((ih) obj).getClass();
                return yj1.x(m50.e0(300, 0, null, 6), 2);
            case 12:
                return Integer.valueOf(((Integer) obj).intValue() / 8);
            case 13:
                ((ih) obj).getClass();
                qe5 qe5VarE1 = m50.e0(500, 0, null, 6);
                pc3 pc3Var2 = new pc3((byte) 16);
                te5 te5Var2 = yj1.g;
                return new dm1(new mc5((hn1) null, new vq4(new wj1(pc3Var2, (byte) 2), qe5VarE1), (wc0) null, (ae4) null, (LinkedHashMap) null, 125)).g(yj1.x(m50.e0(350, 0, null, 4), 2));
            case 14:
                ((ih) obj).getClass();
                qe5 qe5VarE2 = m50.e0(250, 100, null, 4);
                m92 m92Var = new m92((byte) 22);
                te5 te5Var3 = yj1.g;
                return new ek1(new mc5((hn1) null, new vq4(new wj1(m92Var, (byte) 0), qe5VarE2), (wc0) null, (ae4) null, (LinkedHashMap) null, 125)).g(yj1.v(m50.e0(150, 100, null, 4), 2));
            case kq2.x /* 15 */:
                ((ih) obj).getClass();
                qe5 qe5VarE3 = m50.e0(250, 0, null, 6);
                m92 m92Var2 = new m92((byte) 23);
                te5 te5Var4 = yj1.g;
                return new dm1(new mc5((hn1) null, new vq4(new wj1(m92Var2, (byte) 2), qe5VarE3), (wc0) null, (ae4) null, (LinkedHashMap) null, 125)).g(yj1.x(m50.e0(150, 0, null, 4), 2));
            case 16:
                return Integer.valueOf((-((Integer) obj).intValue()) / 8);
            case 17:
                fc3 fc3Var = (fc3) obj;
                fc3Var.getClass();
                String str = fc3Var.g;
                return str + "={" + str + "}";
            case 18:
                gh3 gh3Var = (gh3) obj;
                um2 um2Var = gh3Var.B;
                try {
                    if (gh3Var.A()) {
                        gh3Var.z1(true);
                        break;
                    }
                    return og5Var;
                } catch (Throwable th) {
                    um2Var.a0(th);
                    throw null;
                }
            case 19:
                on3 on3Var = ((gh3) obj).a0;
                if (on3Var != null) {
                    ((a42) on3Var).r();
                }
                return og5Var;
            case 20:
                return Boolean.valueOf(((n22) obj) instanceof e4);
            case 21:
                n22 n22Var = (n22) obj;
                if (!(n22Var instanceof nw) && !(n22Var instanceof e4)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                n22 n22Var2 = (n22) obj;
                if (!(n22Var2 instanceof go5) && !(n22Var2 instanceof k52) && !(n22Var2 instanceof ax0) && !(n22Var2 instanceof jp)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                ui3 ui3Var = (ui3) obj;
                if (ui3Var.A()) {
                    ui3Var.j.N();
                }
                return og5Var;
            case 24:
                tr3 tr3Var = (tr3) obj;
                int i2 = bd.g;
                vf1 vf1Var = sa.y;
                tr3Var.getClass();
                Context context2 = (Context) a11.e(tr3Var, vf1Var);
                j51 j51Var = (j51) a11.e(tr3Var, hp0.j);
                jn3 jn3Var = (jn3) a11.e(tr3Var, kn3.g);
                if (jn3Var == null) {
                    return null;
                }
                return new ub(context2, j51Var, jn3Var.g, jn3Var.y);
            case 25:
                um2 um2Var2 = (um2) obj;
                if (um2Var2.J()) {
                    um2.V(um2Var2, false, 7);
                }
                return og5Var;
            case 26:
                um2 um2Var3 = (um2) obj;
                if (um2Var3.J()) {
                    um2.X(um2Var3, false, 7);
                }
                return og5Var;
            case 27:
                um2 um2Var4 = (um2) obj;
                if (um2Var4.J()) {
                    um2Var4.H();
                }
                return og5Var;
            case 28:
                um2 um2Var5 = (um2) obj;
                if (um2Var5.J()) {
                    um2Var5.W(false);
                }
                return og5Var;
            default:
                um2 um2Var6 = (um2) obj;
                if (um2Var6.J()) {
                    um2Var6.W(false);
                }
                return og5Var;
        }
    }
}
