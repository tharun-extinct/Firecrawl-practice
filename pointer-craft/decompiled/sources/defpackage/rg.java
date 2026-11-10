package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ rg(rc3 rc3Var, mc3 mc3Var, boolean z) {
        this.j = (byte) 18;
        this.t = rc3Var;
        this.a = mc3Var;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0099 A[LOOP:0: B:16:0x0066->B:26:0x0099, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [i73] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [i73] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r7v11 */
    @Override // defpackage.my1
    public final Object g() {
        BluetoothDevice remoteDevice;
        byte b = 8;
        boolean z = false;
        switch (this.j) {
            case 0:
                ((yc0) this.t).z(this.a);
                return og5.g;
            case 1:
                wm4 wm4Var = (wm4) this.t;
                List list = (List) this.a;
                wm4Var.getClass();
                tp3 tp3Var = wm4Var.m;
                if (!((Boolean) tp3Var.getValue()).booleanValue()) {
                    wm4Var.a.setValue(list);
                }
                tp3Var.setValue(Boolean.valueOf(!((Boolean) tp3Var.getValue()).booleanValue()));
                wm4Var.q.setValue(null);
                return og5.g;
            case 2:
                wm4 wm4Var2 = (wm4) this.t;
                my1 my1Var = (my1) this.a;
                wm4Var2.l();
                my1Var.g();
                return og5.g;
            case 3:
                pw pwVar = (pw) this.t;
                wm2 wm2Var = (wm2) this.a;
                pwVar.B = pwVar.f.g(wm2Var.j.n(), wm2Var.getLayoutDirection(), wm2Var);
                return og5.g;
            case 4:
                ((Context) this.t).unregisterReceiver((t30) this.a);
                return og5.g;
            case 5:
                aa3 aa3Var = (aa3) this.t;
                Context context = (Context) this.a;
                if (aa3Var.l()) {
                    aa3Var.t();
                } else {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                    context.startActivity(intent);
                }
                return og5.g;
            case 6:
                ((ia0) this.t).k.a((ja0) this.a);
                return og5.g;
            case 7:
                q81 q81Var = (q81) this.t;
                g61 g61Var = ((t71) ((v71) this.a)).g;
                BluetoothManager bluetoothManager = (BluetoothManager) q81Var.n.getValue();
                BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                if (adapter != null && (remoteDevice = adapter.getRemoteDevice(g61Var.t)) != null) {
                    q81Var.v(remoteDevice);
                }
                return og5.g;
            case 8:
                ((n91) this.t).v((mc3) this.a, false);
                return og5.g;
            case 9:
                gx3 gx3Var = (gx3) this.t;
                my1 my1Var2 = (my1) this.a;
                gx3Var.r.g();
                my1Var2.g();
                return og5.g;
            case 10:
                Context context2 = (Context) this.t;
                my1 my1Var3 = (my1) this.a;
                Uri uri = Uri.parse(xi3.t("https://play.google.com/store/account/subscriptions?sku=premium_yearly&package=", context2.getPackageName()));
                uri.getClass();
                context2.startActivity(new Intent("android.intent.action.VIEW", uri));
                my1Var3.g();
                return og5.g;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((u54) this.t).j = v70.b((au1) this.a, ss3.g);
                return og5.g;
            case 12:
                um2 um2Var = (um2) this.t;
                u54 u54Var = (u54) this.a;
                ah3 ah3Var = um2Var.M;
                if ((ah3Var.x.m & 8) != 0) {
                    for (i73 i73Var = ah3Var.v; i73Var != null; i73Var = i73Var.q) {
                        if ((i73Var.a & 8) != 0) {
                            ?? Q = i73Var;
                            ?? rb3Var = 0;
                            while (Q != 0) {
                                if (Q instanceof ej4) {
                                    ej4 ej4Var = (ej4) Q;
                                    if (ej4Var.o0()) {
                                        aj4 aj4Var = new aj4();
                                        u54Var.j = aj4Var;
                                        aj4Var.m = true;
                                    }
                                    if (ej4Var.p0()) {
                                        ((aj4) u54Var.j).a = true;
                                    }
                                    ej4Var.l0((nj4) u54Var.j);
                                } else if ((Q.a & 8) != 0 && (Q instanceof p41)) {
                                    i73 i73Var2 = ((p41) Q).f;
                                    int i = 0;
                                    while (i73Var2 != null) {
                                        if ((i73Var2.a & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Q = Q;
                                                rb3Var = rb3Var;
                                                rb3Var = rb3Var;
                                                Q = i73Var2;
                                            } else {
                                                if (rb3Var == 0) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var.y(i73Var2);
                                            }
                                        } else {
                                            Q = Q;
                                            rb3Var = rb3Var;
                                        }
                                        i73Var2 = i73Var2.w;
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                    if (i == 1) {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    } else {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                }
                                Q = k33.Q(rb3Var);
                            }
                        }
                    }
                }
                return og5.g;
            case 13:
                z51 z51Var = (z51) this.t;
                u21 u21Var = (u21) this.a;
                io3 io3Var = (io3) z51Var.getValue();
                return new jo3(u21Var, io3Var, new bm((me2) ((er2) u21Var.n.x).getValue(), io3Var));
            case 14:
                return new vs2((uc4) this.t, qi1.j, (qc4) this.a);
            case kq2.x /* 15 */:
                gp gpVar = (gp) this.t;
                yl0 yl0VarF = gp4.F((Context) this.a);
                gpVar.getClass();
                m50.T(v70.d(gpVar), null, new q(gpVar, yl0VarF, z ? 1 : 0, (byte) 4), 3);
                return og5.g;
            case 16:
                ((xy1) this.t).a(((w14) ((ob3) this.a).getValue()).r);
                return og5.g;
            case 17:
                gp gpVar2 = (gp) this.t;
                b30 b30Var = (b30) this.a;
                gpVar2.x(ip.g(gpVar2.v(), null, false, false, 3));
                ew4 ew4Var = b30Var.v;
                w14 w14Var = new w14(null, null, 15);
                ew4Var.getClass();
                ew4Var.m(null, w14Var);
                return og5.g;
            case 18:
                rc3 rc3Var = (rc3) this.t;
                mc3 mc3Var = (mc3) this.a;
                mc3Var.getClass();
                synchronized (rc3Var.g) {
                    try {
                        ew4 ew4Var2 = rc3Var.y;
                        Iterable iterable = (Iterable) ew4Var2.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (yf2.p((mc3) obj, mc3Var)) {
                                ew4Var2.m(null, arrayList);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        ew4Var2.m(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return og5.g;
            case 19:
                kd3 kd3Var = (kd3) this.t;
                ob3 ob3Var = (ob3) this.a;
                kd3Var.x(((List) ob3Var.getValue()).size() > 1);
                nc3 nc3Var = new nc3((mc3) cj0.s0((List) ob3Var.getValue()));
                List listY0 = cj0.y0(cj0.h0((List) ob3Var.getValue()));
                ArrayList arrayList2 = new ArrayList(listY0.size());
                int size = listY0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(new nc3((mc3) listY0.get(i2)));
                }
                pi1 pi1Var = pi1.j;
                kd3Var.g = nc3Var;
                kd3Var.y = arrayList2;
                kd3Var.r = pi1Var;
                kb5 kb5Var = kd3Var.v;
                if (kb5Var != null) {
                    ((kf3) kb5Var.t).n(kd3Var);
                }
                return og5.g;
            case 20:
                we1 we1Var = (we1) this.t;
                float fD = ((pp3) this.a).d();
                return Float.valueOf(xs2.q((we1Var.y.v() - fD) / (0.0f - fD), 0.0f, 1.0f));
            case 21:
                ro roVar = (ro) this.t;
                v34 v34Var = (v34) this.a;
                if (((bs) roVar.t).get() == 0) {
                    v34Var.g();
                }
                return og5.g;
            case 22:
                ((ao0) this.t).n = (bz1) this.a;
                return og5.g;
            case 23:
                ib3 ib3Var = (ib3) this.t;
                yo0 yo0Var = (yo0) this.a;
                Object[] objArr = ib3Var.y;
                long[] jArr = ib3Var.g;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    yo0Var.e(objArr[(i3 << 3) + i5]);
                                }
                                j >>= 8;
                            }
                            if (i4 == 8) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                return og5.g;
            case 24:
                jd3 jd3Var = (jd3) this.t;
                String str = (String) this.a;
                jd3Var.n(str, new oz(str, b));
                return og5.g;
            case 25:
                xy1 xy1Var = (xy1) this.t;
                o04 o04VarZ = ((r04) this.a).z();
                o04VarZ.getClass();
                xy1Var.a(o04VarZ);
                return og5.g;
            default:
                rp3 rp3Var = (rp3) this.t;
                my1 my1Var4 = (my1) this.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - rp3Var.d() > 100) {
                    rp3Var.e(jCurrentTimeMillis);
                    my1Var4.g();
                }
                return og5.g;
        }
    }

    public /* synthetic */ rg(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }
}
