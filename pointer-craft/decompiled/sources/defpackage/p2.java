package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import io.appground.blehid.ClassicHidService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p2 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ p2(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [st4] */
    /* JADX WARN: Type inference failed for: r6v0, types: [mu0] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.my1
    public final Object g() {
        ax2 ax2Var;
        gj4 gj4Var;
        um2 um2Var;
        k44 k44Var;
        boolean z;
        f34 f34Var;
        yf0 yf0Var;
        List listW0;
        boolean z2;
        boolean z3;
        BluetoothDevice remoteDevice;
        long jG;
        ?? r6 = 0;
        w82VarArr = null;
        w82[] w82VarArr = null;
        oi3 oi3Var = null;
        ?? r7 = 0;
        switch (this.j) {
            case 0:
                cx2 cx2Var = (cx2) this.t;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.a;
                cx2Var.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(cx2Var);
                bx2 bx2Var = cx2Var.m;
                if (bx2Var != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(bx2Var);
                }
                if (Build.VERSION.SDK_INT >= 33 && (ax2Var = cx2Var.q) != null) {
                    h2.q(accessibilityManager, e2.n(ax2Var));
                }
                return og5.g;
            case 1:
                return Boolean.valueOf(ba.m((ba) this.t, (KeyEvent) this.a));
            case 2:
                return Boolean.valueOf(ba.c((ba) this.t, (MotionEvent) this.a));
            case 3:
                of4 of4Var = (of4) this.t;
                ia iaVar = (ia) this.a;
                cf4 cf4Var = of4Var.q;
                cf4 cf4Var2 = of4Var.w;
                Float f = of4Var.a;
                Float f2 = of4Var.m;
                float fFloatValue = (cf4Var == null || f == null) ? 0.0f : ((Number) cf4Var.g.g()).floatValue() - f.floatValue();
                float fFloatValue2 = (cf4Var2 == null || f2 == null) ? 0.0f : ((Number) cf4Var2.g.g()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = iaVar.A(of4Var.j);
                    ij4 ij4Var = (ij4) iaVar.u().y(iaVar.p);
                    if (ij4Var != null) {
                        try {
                            m2 m2Var = iaVar.z;
                            if (m2Var != null) {
                                m2Var.o(iaVar.m(ij4Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    ij4 ij4Var2 = (ij4) iaVar.u().y(iaVar.u);
                    if (ij4Var2 != null) {
                        try {
                            m2 m2Var2 = iaVar.h;
                            if (m2Var2 != null) {
                                m2Var2.o(iaVar.m(ij4Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    iaVar.m.invalidate();
                    ij4 ij4Var3 = (ij4) iaVar.u().y(iA);
                    if (ij4Var3 != null && (gj4Var = ij4Var3.g) != null && (um2Var = gj4Var.r) != null) {
                        if (cf4Var != null) {
                            iaVar.f.t(iA, cf4Var);
                        }
                        if (cf4Var2 != null) {
                            iaVar.k.t(iA, cf4Var2);
                        }
                        iaVar.f(um2Var);
                    }
                }
                if (cf4Var != null) {
                    of4Var.a = (Float) cf4Var.g.g();
                }
                if (cf4Var2 != null) {
                    of4Var.m = (Float) cf4Var2.g.g();
                }
                return og5.g;
            case 4:
                ((u54) this.t).j = ((my1) this.a).g();
                return og5.g;
            case 5:
                wm4 wm4Var = (wm4) this.t;
                ((ob3) this.a).setValue(null);
                wm4Var.m.setValue(Boolean.TRUE);
                return og5.g;
            case 6:
                wm4 wm4Var2 = (wm4) this.t;
                jd3 jd3Var = (jd3) this.a;
                wm4Var2.l();
                jd3.v(jd3Var, "keyboard_layout");
                return og5.g;
            case 7:
                ((jd3) this.t).n(xi3.j("layoutedit?layoutId=", ((fk) this.a).g), new m9((byte) 9));
                return og5.g;
            case 8:
                rt rtVar = (rt) this.t;
                ss ssVar = new ss((my1) this.a, (byte) 0);
                to2 to2Var = (to2) rtVar.j.getValue();
                if (to2Var != null) {
                    to2Var.a = (String) rtVar.t.getValue();
                    m50.T(rtVar.y, null, new c(rtVar, to2Var, ssVar, null, (byte) 7), 3);
                }
                return og5.g;
            case 9:
                ((pn0) this.t).r = (my1) this.a;
                return og5.g;
            case 10:
                k65 k65Var = (k65) this.t;
                ob3 ob3Var = (ob3) this.a;
                if (!u75.y(k65Var.y, ((k65) ob3Var.getValue()).y) || !yf2.p(k65Var.r, ((k65) ob3Var.getValue()).r)) {
                    ob3Var.setValue(k65Var);
                }
                return og5.g;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                o75 o75Var = (o75) this.t;
                cj cjVar = (cj) this.a;
                if (o75Var == null) {
                    return cjVar;
                }
                ?? r1 = o75Var.r;
                boolean zIsEmpty = r1.isEmpty();
                cj cjVar2 = o75Var.y;
                if (!zIsEmpty) {
                    n35 n35Var = new n35(cjVar2);
                    int size = r1.size();
                    while (r7 < size) {
                        ((xy1) r1.get(r7)).a(n35Var);
                        r7++;
                    }
                    cjVar2 = n35Var.y;
                }
                o75Var.y = cjVar2;
                return cjVar2 == null ? cjVar : cjVar2;
            case 12:
                m50.T((ox0) this.t, null, new pz((ya5) this.a, r6, r7), 3);
                return Boolean.TRUE;
            case 13:
                my1 my1Var = (my1) this.t;
                gh3 gh3Var = (gh3) this.a;
                if (my1Var != null && (k44Var = (k44) my1Var.g()) != null) {
                    return k44Var;
                }
                if (!gh3Var.Y0().h) {
                    gh3Var = null;
                }
                if (gh3Var != null) {
                    return kq2.r(0L, y94.N(gh3Var.a));
                }
                return null;
            case 14:
                ((xy1) this.t).a(Integer.valueOf(((bg5) this.a).y.size()));
                return og5.g;
            case kq2.x /* 15 */:
                ((Context) this.t).unregisterReceiver((ql) this.a);
                return og5.g;
            case 16:
                ClassicHidService classicHidService = (ClassicHidService) this.t;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) this.a;
                cm1 cm1Var = ClassicHidService.T;
                ng0 ng0Var = classicHidService.H;
                if (ng0Var != null && (f34Var = ng0Var.p) != null && (yf0Var = (yf0) f34Var.j.getValue()) != null && yf0Var.r == 2) {
                    BluetoothDevice bluetoothDevice2 = yf0Var.y;
                    z = yf2.p(bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : 0, bluetoothDevice.getAddress());
                }
                return Boolean.valueOf(z);
            case 17:
                ((xy1) this.t).a(((il2) this.a).g);
                return og5.g;
            case 18:
                wo0 wo0Var = (wo0) this.t;
                Object obj = this.a;
                h02 h02Var = wo0Var.j;
                mr4 mr4Var = h02Var.r;
                lr4 lr4VarN = mr4Var.n();
                int i = 0;
                while (true) {
                    try {
                        if (i < mr4Var.t) {
                            if (lr4VarN.q(i)) {
                                Object objC = lr4VarN.c(i);
                                if (objC != obj) {
                                    l02 l02Var = objC instanceof l02 ? (l02) objC : null;
                                    z3 = (l02Var != null ? l02Var.g : null) == obj;
                                }
                                if (z3) {
                                    oi3 oi3Var2 = new oi3(i, null);
                                    lr4VarN.r();
                                    oi3Var = oi3Var2;
                                }
                            }
                            int[] iArr = lr4VarN.y;
                            int i2 = i + 1;
                            int iN = (i2 < lr4VarN.r ? iArr[(i2 * 5) + 4] : lr4VarN.v) - or4.n(iArr, i);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= iN) {
                                    i = i2;
                                } else {
                                    Object objJ = lr4VarN.j(i, i3);
                                    if (objJ != obj) {
                                        l02 l02Var2 = objJ instanceof l02 ? (l02) objJ : null;
                                        z2 = (l02Var2 != null ? l02Var2.g : null) == obj;
                                    }
                                    if (z2) {
                                        oi3Var = new oi3(i, Integer.valueOf(i3));
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        lr4VarN.r();
                    } catch (Throwable th) {
                        lr4VarN.r();
                        throw th;
                    }
                }
                if (oi3Var != null) {
                    int i4 = oi3Var.g;
                    Integer num = oi3Var.y;
                    lr4 lr4VarN2 = mr4Var.n();
                    try {
                        ArrayList arrayListJ = xc6.j(lr4VarN2, i4, num);
                        lr4VarN2.r();
                        listW0 = cj0.w0(arrayListJ, h02Var.D());
                    } catch (Throwable th2) {
                        lr4VarN2.r();
                        throw th2;
                    }
                } else {
                    listW0 = pi1.j;
                }
                return new go0(listW0, h02Var.C);
            case 19:
                ((Context) this.t).unregisterReceiver((ql) this.a);
                return og5.g;
            case 20:
                return new je2(k33.Y(((w35) this.t).j((bl2) ((my1) this.a).g())));
            case 21:
                ((c45) this.t).n.a((xy) this.a);
                return og5.g;
            case 22:
                ob3 ob3Var2 = (ob3) this.t;
                ob3 ob3Var3 = (ob3) this.a;
                ob3Var2.setValue("disabled");
                ob3Var3.setValue(Boolean.FALSE);
                return og5.g;
            case 23:
                ((xy1) this.t).a((jh0) this.a);
                return og5.g;
            case 24:
                String str = (String) this.t;
                xy1 xy1Var = (xy1) this.a;
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null && (remoteDevice = defaultAdapter.getRemoteDevice(str)) != null) {
                    xy1Var.a(remoteDevice);
                }
                return og5.g;
            case 25:
                ((u54) this.t).j = ((cu1) this.a).S0();
                return og5.g;
            case 26:
                ((u54) this.t).j = v70.b((hu1) this.a, ss3.g);
                return og5.g;
            case 27:
                ((z62) this.t).n((i73) this.a);
                return og5.g;
            case 28:
                p82 p82Var = (p82) this.t;
                w82 w82Var = (w82) this.a;
                try {
                    p82Var.j.r(w82Var);
                    break;
                } catch (IOException e) {
                    ys3 ys3Var = ys3.g;
                    ys3.g.a("Http2Connection.Listener failure for " + p82Var.a, 4, e);
                    try {
                        w82Var.n(kk1.m, e);
                        break;
                    } catch (IOException unused3) {
                    }
                }
                return og5.g;
            default:
                b71 b71Var = (b71) this.t;
                pl4 pl4Var = (pl4) this.a;
                u54 u54Var = new u54();
                p82 p82Var2 = (p82) b71Var.a;
                synchronized (p82Var2.E) {
                    synchronized (p82Var2) {
                        try {
                            pl4 pl4Var2 = p82Var2.e;
                            pl4 pl4Var3 = new pl4();
                            pl4Var2.getClass();
                            for (int i5 = 0; i5 < 10; i5++) {
                                if (((1 << i5) & pl4Var2.g) != 0) {
                                    pl4Var3.y(i5, pl4Var2.y[i5]);
                                }
                            }
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (((1 << i6) & pl4Var.g) != 0) {
                                    pl4Var3.y(i6, pl4Var.y[i6]);
                                }
                            }
                            u54Var.j = pl4Var3;
                            jG = ((long) pl4Var3.g()) - ((long) pl4Var2.g());
                            if (jG != 0 && !p82Var2.t.isEmpty()) {
                                w82VarArr = (w82[]) p82Var2.t.values().toArray(new w82[0]);
                            }
                            pl4 pl4Var4 = (pl4) u54Var.j;
                            pl4Var4.getClass();
                            p82Var2.e = pl4Var4;
                            a35.y(p82Var2.s, p82Var2.a + " onSettings", new o82(p82Var2, u54Var, (byte) r7));
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    try {
                        p82Var2.E.y((pl4) u54Var.j);
                    } catch (IOException e2) {
                        kk1 kk1Var = kk1.m;
                        p82Var2.y(kk1Var, kk1Var, e2);
                    }
                    break;
                }
                if (w82VarArr != null) {
                    for (w82 w82Var2 : w82VarArr) {
                        synchronized (w82Var2) {
                            w82Var2.q += jG;
                            if (jG > 0) {
                                w82Var2.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return og5.g;
        }
    }
}
