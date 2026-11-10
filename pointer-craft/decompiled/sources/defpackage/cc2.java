package defpackage;

import android.content.Context;
import android.os.Bundle;
import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc2 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public /* synthetic */ cc2(ox0 ox0Var, Context context, x03 x03Var, xy1 xy1Var) {
        this.j = (byte) 4;
        this.q = ox0Var;
        this.t = context;
        this.a = x03Var;
        this.m = xy1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        byte b2 = 2;
        byte b3 = 3;
        og5 og5Var = og5.g;
        Object obj2 = this.m;
        Object obj3 = this.a;
        Object obj4 = this.t;
        Object obj5 = this.q;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        final byte b4 = 1;
        switch (b) {
            case 0:
                ec2 ec2Var = (ec2) obj3;
                r54 r54Var = (r54) obj2;
                ox0 ox0Var = (ox0) obj5;
                long jLongValue = ((Long) obj).longValue();
                bw4 bw4Var = (bw4) ((ob3) obj4).getValue();
                long jLongValue2 = bw4Var != null ? ((Number) bw4Var.getValue()).longValue() : jLongValue;
                long j = ec2Var.r;
                rb3 rb3Var = ec2Var.g;
                if (j == Long.MIN_VALUE || r54Var.j != kq2.C(ox0Var.w())) {
                    ec2Var.r = jLongValue;
                    Object[] objArr6 = rb3Var.j;
                    int i = rb3Var.a;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((bc2) objArr6[i2]).w = true;
                    }
                    r54Var.j = kq2.C(ox0Var.w());
                }
                float f = r54Var.j;
                if (f == 0.0f) {
                    Object[] objArr7 = rb3Var.j;
                    int i3 = rb3Var.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        bc2 bc2Var = (bc2) objArr7[i4];
                        bc2Var.a.setValue(bc2Var.m.r);
                        bc2Var.w = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - ec2Var.r) / f);
                    Object[] objArr8 = rb3Var.j;
                    int i5 = rb3Var.a;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        bc2 bc2Var2 = (bc2) objArr8[i6];
                        boolean zL = bc2Var2.q;
                        if (!zL) {
                            bc2Var2.i.y.setValue(Boolean.FALSE);
                            if (bc2Var2.w) {
                                bc2Var2.w = false;
                                bc2Var2.c = j2;
                            }
                            long j3 = j2 - bc2Var2.c;
                            bc2Var2.a.setValue(bc2Var2.m.y(j3));
                            zL = bc2Var2.m.l(j3);
                            bc2Var2.q = zL;
                        }
                        if (!zL) {
                            z = false;
                        }
                    }
                    ec2Var.n.setValue(Boolean.valueOf(!z));
                }
                return og5Var;
            case 1:
                pr2 pr2Var = (pr2) obj4;
                pr2Var.r = new ok2((wq2) obj3, (py4) obj2, (ex3) obj5);
                return new e5(pr2Var, b2);
            case 2:
                mc3 mc3Var = (mc3) obj;
                mc3Var.getClass();
                ((q54) obj4).j = true;
                ((vc3) obj3).g((ad3) obj2, (Bundle) obj5, mc3Var, pi1.j);
                return og5Var;
            case 3:
                final jd3 jd3Var = (jd3) obj4;
                final qr0 qr0Var = (qr0) obj3;
                final wm4 wm4Var = (wm4) obj2;
                String str = (String) obj5;
                ed3 ed3Var = (ed3) obj;
                ed3Var.getClass();
                List list = ri5.g;
                jd3Var.getClass();
                qr0Var.getClass();
                wm4Var.getClass();
                str.getClass();
                List list2 = db4.g;
                m50.Z(ed3Var, te4.l, null, pw5.k(new dk(y94.C(), new my1() { // from class: va4
                    @Override // defpackage.my1
                    public final Object g() {
                        byte b5 = b4;
                        og5 og5Var2 = og5.g;
                        wm4 wm4Var2 = wm4Var;
                        switch (b5) {
                            case 0:
                                wm4Var2.w.setValue(Boolean.TRUE);
                                break;
                            default:
                                wm4Var2.w.setValue(Boolean.TRUE);
                                break;
                        }
                        return og5Var2;
                    }
                })), jd3Var, new nm0(-1291362020, true, new bb4(qr0Var, jd3Var)), 6);
                List listD = pw5.d(aq2.o("fixDevice", new rn3((byte) 9)), aq2.o("fixDeviceName", new rn3((byte) 15)));
                ha2 ha2VarC = y94.C();
                final Object[] objArr9 = objArr5 == true ? 1 : 0;
                m50.Z(ed3Var, ue4.l, listD, pw5.k(new dk(ha2VarC, new my1() { // from class: va4
                    @Override // defpackage.my1
                    public final Object g() {
                        byte b5 = objArr9;
                        og5 og5Var2 = og5.g;
                        wm4 wm4Var2 = wm4Var;
                        switch (b5) {
                            case 0:
                                wm4Var2.w.setValue(Boolean.TRUE);
                                break;
                            default:
                                wm4Var2.w.setValue(Boolean.TRUE);
                                break;
                        }
                        return og5Var2;
                    }
                })), jd3Var, new nm0(-664581036, true, new qn(qr0Var, jd3Var, (Object) str, (byte) 5)), 4);
                m50.Z(ed3Var, we4.l, null, null, jd3Var, gp4.n, 14);
                m50.Z(ed3Var, xe4.l, null, null, jd3Var, gp4.v, 14);
                m50.Z(ed3Var, ye4.l, null, null, jd3Var, gp4.x, 14);
                m50.Z(ed3Var, af4.l, null, null, jd3Var, gp4.l, 14);
                m50.Z(ed3Var, se4.l, null, null, jd3Var, new nm0(-1593460853, true, new bb4(wm4Var, qr0Var, objArr4 == true ? 1 : 0)), 14);
                m50.Z(ed3Var, ze4.l, null, null, jd3Var, new nm0(390774182, true, new ab4(jd3Var, objArr3 == true ? 1 : 0)), 14);
                xq2.j(ed3Var, "custom?layoutId={layoutId}", pw5.k(aq2.o("layoutId", new rn3((byte) 11))), null, new rn3((byte) 12), new rn3((byte) 13), new nm0(728921248, true, new ua4((Object) wm4Var, (Object) jd3Var, (Object) qr0Var, (byte) (objArr2 == true ? 1 : 0))), 228);
                xq2.j(ed3Var, "shared?sharedLayoutId={sharedLayoutId}", pw5.k(aq2.o("sharedLayoutId", new rn3((byte) 16))), pw5.k(new yc3("https://appground.io/layout/{sharedLayoutId}")), null, null, new nm0(-84302366, true, new ua4(jd3Var, qr0Var, wm4Var, b2)), 248);
                xq2.j(ed3Var, "layoutedit?layoutId={layoutId}", pw5.k(aq2.o("layoutId", new rn3((byte) 17))), null, null, null, new nm0(-522804835, true, new ua4(jd3Var, qr0Var, wm4Var, b3)), 252);
                xq2.j(ed3Var, "buttonedit?index={index}", pw5.k(aq2.o("index", new rn3((byte) 14))), null, null, null, new nm0(-1389498731, true, new ua4(jd3Var, qr0Var, wm4Var, b4)), 252);
                ve4 ve4Var = ve4.l;
                nm0 nm0Var = new nm0(1677221223, true, new qn(qr0Var, jd3Var, (Object) wm4Var, (byte) 4));
                ve4Var.getClass();
                String str2 = ve4Var.g;
                nm0 nm0Var2 = new nm0(-2016623581, true, new g03(ve4Var, nm0Var, b4));
                pi1 pi1Var = pi1.j;
                xq2.j(ed3Var, str2, pi1Var, pi1Var, null, null, nm0Var2, 248);
                final Object[] objArr10 = objArr == true ? 1 : 0;
                xq2.j(ed3Var, "keyboard_layout", null, null, null, null, new nm0(-1895872171, true, new dz1() { // from class: ta4
                    @Override // defpackage.dz1
                    public final Object i(Object obj6, Object obj7, Object obj8, Object obj9) {
                        byte b5 = objArr10;
                        og5 og5Var2 = og5.g;
                        jd3 jd3Var2 = jd3Var;
                        switch (b5) {
                            case 0:
                                h02 h02Var = (h02) obj8;
                                ((Integer) obj9).getClass();
                                ((hh) obj6).getClass();
                                ((mc3) obj7).getClass();
                                nk nkVar = new nk(new w75(null, R.string.menu_keyboard_language), null, true, false, pi1.j);
                                Object objK = h02Var.K();
                                l76 l76Var = oo0.g;
                                if (objK == l76Var) {
                                    objK = kq2.M(Boolean.FALSE);
                                    h02Var.i0(objK);
                                }
                                ob3 ob3Var = (ob3) objK;
                                if (((Boolean) ob3Var.getValue()).booleanValue()) {
                                    h02Var.X(-1107533781);
                                    Object objK2 = h02Var.K();
                                    if (objK2 == l76Var) {
                                        objK2 = new ef(ob3Var, (byte) 28);
                                        h02Var.i0(objK2);
                                    }
                                    yd6.y((my1) objK2, ue5.m0(-2077734622, new hb(ob3Var, (byte) 6), h02Var), null, null, gp4.q, null, gp4.w, null, 0L, 0L, 0L, 0L, null, null, h02Var, 1597494, 32684);
                                    h02Var = h02Var;
                                    h02Var.b(false);
                                } else {
                                    h02Var.X(-1106947571);
                                    h02Var.b(false);
                                }
                                c93.n(nkVar, false, qr0Var, ue5.m0(1029109270, new ln5(ob3Var, (byte) 1), h02Var), ue5.m0(-1425284019, new tn(jd3Var2, (byte) 14), h02Var), h02Var, 28216);
                                break;
                            default:
                                mc3 mc3Var2 = (mc3) obj7;
                                h02 h02Var2 = (h02) obj8;
                                ((Integer) obj9).getClass();
                                ((hh) obj6).getClass();
                                mc3Var2.getClass();
                                Bundle bundleG = mc3Var2.g();
                                String string = bundleG != null ? bundleG.getString("code") : null;
                                nk nkVar2 = new nk(new w75(null, R.string.keyboard_auto_setup_title), null, true, false, pi1.j);
                                nm0 nm0Var3 = gp4.i;
                                qr0 qr0Var2 = qr0Var;
                                c93.n(nkVar2, false, qr0Var2, nm0Var3, ue5.m0(-60431740, new ya4((pl5) qr0Var2, (Object) string, jd3Var2, (byte) 8), h02Var2), h02Var2, 28216);
                                break;
                        }
                        return og5Var2;
                    }
                }), 254);
                xq2.j(ed3Var, "keyboard_auto_setup?code={code}", pw5.k(aq2.o("code", new rn3((byte) 10))), pw5.d(new yc3("https://appground.io/keyboard"), new yc3("https://appground.io/keyboard?c={code}")), null, null, new nm0(-1324079732, true, new dz1() { // from class: ta4
                    @Override // defpackage.dz1
                    public final Object i(Object obj6, Object obj7, Object obj8, Object obj9) {
                        byte b5 = b4;
                        og5 og5Var2 = og5.g;
                        jd3 jd3Var2 = jd3Var;
                        switch (b5) {
                            case 0:
                                h02 h02Var = (h02) obj8;
                                ((Integer) obj9).getClass();
                                ((hh) obj6).getClass();
                                ((mc3) obj7).getClass();
                                nk nkVar = new nk(new w75(null, R.string.menu_keyboard_language), null, true, false, pi1.j);
                                Object objK = h02Var.K();
                                l76 l76Var = oo0.g;
                                if (objK == l76Var) {
                                    objK = kq2.M(Boolean.FALSE);
                                    h02Var.i0(objK);
                                }
                                ob3 ob3Var = (ob3) objK;
                                if (((Boolean) ob3Var.getValue()).booleanValue()) {
                                    h02Var.X(-1107533781);
                                    Object objK2 = h02Var.K();
                                    if (objK2 == l76Var) {
                                        objK2 = new ef(ob3Var, (byte) 28);
                                        h02Var.i0(objK2);
                                    }
                                    yd6.y((my1) objK2, ue5.m0(-2077734622, new hb(ob3Var, (byte) 6), h02Var), null, null, gp4.q, null, gp4.w, null, 0L, 0L, 0L, 0L, null, null, h02Var, 1597494, 32684);
                                    h02Var = h02Var;
                                    h02Var.b(false);
                                } else {
                                    h02Var.X(-1106947571);
                                    h02Var.b(false);
                                }
                                c93.n(nkVar, false, qr0Var, ue5.m0(1029109270, new ln5(ob3Var, (byte) 1), h02Var), ue5.m0(-1425284019, new tn(jd3Var2, (byte) 14), h02Var), h02Var, 28216);
                                break;
                            default:
                                mc3 mc3Var2 = (mc3) obj7;
                                h02 h02Var2 = (h02) obj8;
                                ((Integer) obj9).getClass();
                                ((hh) obj6).getClass();
                                mc3Var2.getClass();
                                Bundle bundleG = mc3Var2.g();
                                String string = bundleG != null ? bundleG.getString("code") : null;
                                nk nkVar2 = new nk(new w75(null, R.string.keyboard_auto_setup_title), null, true, false, pi1.j);
                                nm0 nm0Var3 = gp4.i;
                                qr0 qr0Var2 = qr0Var;
                                c93.n(nkVar2, false, qr0Var2, nm0Var3, ue5.m0(-60431740, new ya4((pl5) qr0Var2, (Object) string, jd3Var2, (byte) 8), h02Var2), h02Var2, 28216);
                                break;
                        }
                        return og5Var2;
                    }
                }), 248);
                xq2.j(ed3Var, "fontlist", null, null, null, null, gp4.b, 254);
                return og5Var;
            default:
                m50.T((ox0) obj5, null, new s3((Context) obj4, (String) obj, (x03) obj3, (xy1) obj2, null, (byte) 21), 3);
                return og5Var;
        }
    }

    public /* synthetic */ cc2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
    }
}
