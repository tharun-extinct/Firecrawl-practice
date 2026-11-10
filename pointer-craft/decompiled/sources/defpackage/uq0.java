package defpackage;

import android.content.Context;
import io.appground.blek.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uq0 implements xy1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ qr0 t;

    public /* synthetic */ uq0(qr0 qr0Var, Context context, byte b) {
        this.j = b;
        this.t = qr0Var;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.String, rk4] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        fx4 fx4Var;
        fx4 fx4Var2;
        ?? r5;
        byte b = this.j;
        wv4 wv4Var = wv4.g;
        og5 og5Var = og5.g;
        Context context = this.a;
        qr0 qr0Var = this.t;
        switch (b) {
            case 0:
                rw4 rw4Var = (rw4) obj;
                rw4Var.getClass();
                rw4Var.g = wv4Var;
                fx4 fx4Var3 = new fx4(R.string.connection_help_connected, 0, 0);
                ew4 ew4Var = qr0Var.u;
                ew4Var.getClass();
                ew4Var.m(null, fx4Var3);
                sw4 sw4Var = new sw4(wv4.class);
                LinkedHashMap linkedHashMap = rw4Var.y;
                v92 v92Var = new v92((byte) 29);
                v92Var.L(new sw4(xk1.class), new bn0(v92Var, (byte) 25));
                linkedHashMap.put(sw4Var, (ow4) v92Var.t);
                sw4 sw4Var2 = new sw4(uv4.class);
                v92 v92Var2 = new v92((byte) 29);
                v92Var2.L(new sw4(wk1.class), new bn0(v92Var2, (byte) 28));
                v92Var2.L(new sw4(vk1.class), new bn0(v92Var2, (byte) 29));
                linkedHashMap.put(sw4Var2, (ow4) v92Var2.t);
                sw4 sw4Var3 = new sw4(yv4.class);
                v92 v92Var3 = new v92((byte) 29);
                v92Var3.L(new sw4(wk1.class), new bn0(v92Var3, (byte) 24));
                linkedHashMap.put(sw4Var3, (ow4) v92Var3.t);
                sw4 sw4Var4 = new sw4(vv4.class);
                v92 v92Var4 = new v92((byte) 29);
                v92Var4.L(new sw4(wk1.class), new vq0(v92Var4));
                v92Var4.L(new sw4(vk1.class), new bn0(v92Var4, (byte) 23));
                linkedHashMap.put(sw4Var4, (ow4) v92Var4.t);
                sw4 sw4Var5 = new sw4(xv4.class);
                v92 v92Var5 = new v92((byte) 29);
                v92Var5.L(new sw4(wk1.class), new bn0(v92Var5, (byte) 26));
                v92Var5.L(new sw4(vk1.class), new bn0(v92Var5, (byte) 27));
                linkedHashMap.put(sw4Var5, (ow4) v92Var5.t);
                linkedHashMap.put(new sw4(tv4.class), new ow4());
                rw4Var.r.add(new uq0(qr0Var, context, (byte) 1));
                return og5Var;
            default:
                vw4 vw4Var = (vw4) obj;
                vw4Var.getClass();
                uw4 uw4Var = vw4Var instanceof uw4 ? (uw4) vw4Var : null;
                if (uw4Var == null) {
                    return og5Var;
                }
                Object obj2 = uw4Var.r;
                Object obj3 = uw4Var.y;
                Object obj4 = uw4Var.g;
                aw4 aw4Var = (aw4) obj2;
                boolean zEquals = aw4Var.equals(wv4Var);
                tv4 tv4Var = tv4.g;
                xv4 xv4Var = xv4.g;
                uv4 uv4Var = uv4.g;
                vv4 vv4Var = vv4.g;
                if (zEquals) {
                    fx4Var = new fx4(R.string.connection_help_connected, 0, 0);
                } else {
                    if (aw4Var.equals(uv4Var)) {
                        fx4Var2 = new fx4(R.string.connection_help_use_touchpad, R.string.connection_help_use_touchpad_moving, R.string.connection_help_use_touchpad_not_moving);
                    } else if (aw4Var.equals(yv4.g)) {
                        fx4Var = new fx4(R.string.connection_help_bluetooth_restart, 0, 0);
                    } else if (aw4Var.equals(vv4Var)) {
                        fx4Var2 = new fx4(R.string.connection_help_use_touchpad, R.string.connection_help_use_touchpad_moving, R.string.connection_help_use_touchpad_not_moving);
                    } else if (aw4Var.equals(xv4Var)) {
                        fx4Var = new fx4(R.string.connection_help_not_moving, R.string.connection_help_not_moving_close, R.string.connection_help_fix_connection);
                    } else {
                        if (!aw4Var.equals(tv4Var)) {
                            up.y();
                            return null;
                        }
                        fx4Var = new fx4(0, 0, 0);
                    }
                    fx4Var = fx4Var2;
                }
                ew4 ew4Var2 = qr0Var.u;
                ew4Var2.getClass();
                ew4Var2.m(null, fx4Var);
                aw4 aw4Var2 = (aw4) obj4;
                boolean zEquals2 = aw4Var2.equals(uv4Var);
                vk1 vk1Var = vk1.g;
                if (zEquals2) {
                    if (((yk1) obj3).equals(vk1Var)) {
                        ji0 ji0VarD = v70.d(qr0Var);
                        x21 x21Var = na1.g;
                        m50.T(ji0VarD, c21.a, new q(context, qr0Var, null, (byte) 18), 2);
                    }
                } else if (aw4Var2.equals(vv4Var) && ((yk1) obj3).equals(vk1Var)) {
                    m50.T(v70.d(qr0Var), null, new fr0(qr0Var, null, (byte) 3), 3);
                }
                if (!((aw4) obj2).equals(tv4Var)) {
                    return og5Var;
                }
                if (obj4.equals(xv4Var) && obj3.equals(vk1Var)) {
                    qr0Var.p.setValue(qq0.g(qr0Var.a(), null, t32.a, 1));
                }
                if ((obj4.equals(uv4Var) || obj4.equals(vv4Var)) && obj3.equals(wk1.g)) {
                    r5 = 0;
                    m50.T(v70.d(qr0Var), null, new lr0(obj4.equals(vv4Var), (Object) qr0Var, (mu0) (0 == true ? 1 : 0), (byte) 0), 3);
                    context.getApplicationContext().getSharedPreferences("working_devices", 0).edit().putBoolean(qr0Var.h, true).apply();
                } else {
                    r5 = 0;
                }
                qr0Var.f = r5;
                qr0Var.h = r5;
                return og5Var;
        }
    }
}
