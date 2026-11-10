package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class on0 implements bz1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ on0(byte b) {
        this.j = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [i73] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [i73] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [rb3] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [rb3] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        nk0 nk0Var;
        LinkedHashMap linkedHashMap;
        byte b = this.j;
        Bundle bundleN = null;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ue5.n(new k52(new s91(4.0f)), null, pw5.r, h02Var, 384, 2);
                } else {
                    h02Var.Q();
                }
                return og5Var;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                }
                return og5Var;
            case 2:
                ((um2) ((jo0) obj)).f0((j73) obj2);
                return og5Var;
            case 3:
                bp0 bp0Var = (bp0) obj2;
                um2 um2Var = (um2) ((jo0) obj);
                um2Var.I = bp0Var;
                ah3 ah3Var = um2Var.M;
                vf1 vf1Var = hp0.j;
                tr3 tr3Var = (tr3) bp0Var;
                tr3Var.getClass();
                um2Var.b0((j51) a11.e(tr3Var, vf1Var));
                tr3 tr3Var2 = (tr3) bp0Var;
                fl2 fl2Var = (fl2) a11.e(tr3Var2, hp0.c);
                if (um2Var.G != fl2Var) {
                    um2Var.G = fl2Var;
                    um2Var.G();
                    um2 um2VarO = um2Var.o();
                    if (um2VarO != null) {
                        um2VarO.E();
                    } else {
                        pn3 pn3Var = um2Var.h;
                        if (pn3Var != null) {
                            ((ba) pn3Var).invalidate();
                        }
                    }
                    um2Var.F();
                    for (i73 i73Var = ah3Var.x; i73Var != null; i73Var = i73Var.w) {
                        i73Var.A0();
                    }
                }
                um2Var.g0((bl5) a11.e(tr3Var2, hp0.z));
                i73 i73Var2 = ah3Var.x;
                if ((i73Var2.m & 32768) != 0) {
                    while (i73Var2 != null) {
                        if ((i73Var2.a & 32768) != 0) {
                            ?? Q = i73Var2;
                            ?? rb3Var = 0;
                            while (Q != 0) {
                                if (Q instanceof zo0) {
                                    i73 i73Var3 = ((i73) ((zo0) Q)).j;
                                    if (i73Var3.h) {
                                        hh3.r(i73Var3);
                                    } else {
                                        i73Var3.s = true;
                                    }
                                } else if ((Q.a & 32768) != 0 && (Q instanceof p41)) {
                                    i73 i73Var4 = ((p41) Q).f;
                                    int i = 0;
                                    while (i73Var4 != null) {
                                        if ((i73Var4.a & 32768) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Q = Q;
                                                rb3Var = rb3Var;
                                                rb3Var = rb3Var;
                                                Q = i73Var4;
                                            } else {
                                                if (rb3Var == 0) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var.y(i73Var4);
                                            }
                                        } else {
                                            Q = Q;
                                            rb3Var = rb3Var;
                                        }
                                        i73Var4 = i73Var4.w;
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
                        if ((i73Var2.m & 32768) != 0) {
                            i73Var2 = i73Var2.w;
                        }
                    }
                }
                return og5Var;
            case 4:
                ((um2) ((jo0) obj)).e0((t33) obj2);
                return og5Var;
            case 5:
                ((Integer) obj2).getClass();
                ((um2) ((jo0) obj)).getClass();
                return og5Var;
            case 6:
                fx0 fx0Var = (fx0) obj;
                dx0 dx0Var = (dx0) obj2;
                fx0Var.getClass();
                dx0Var.getClass();
                fx0 fx0VarE = fx0Var.E(dx0Var.getKey());
                ni1 ni1Var = ni1.j;
                if (fx0VarE == ni1Var) {
                    return dx0Var;
                }
                f73 f73Var = f73.t;
                hx0 hx0Var = (hx0) fx0VarE.h(f73Var);
                if (hx0Var == null) {
                    nk0Var = new nk0(dx0Var, fx0VarE);
                } else {
                    fx0 fx0VarE2 = fx0VarE.E(f73Var);
                    if (fx0VarE2 == ni1Var) {
                        return new nk0(hx0Var, dx0Var);
                    }
                    nk0Var = new nk0(hx0Var, new nk0(dx0Var, fx0VarE2));
                }
                return nk0Var;
            case 7:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 8:
                return ((fx0) obj).b((dx0) obj2);
            case 9:
                return ((fx0) obj).b((dx0) obj2);
            case 10:
                ((Integer) obj2).getClass();
                return yj1.v(m50.b0(1.0f, 1600.0f, null, 4), 2);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                te5 te5Var = yj1.g;
                return new dm1(new mc5((hn1) null, (vq4) null, (wc0) null, new ae4(0.7f, vb5.y, m50.b0(0.0f, 400.0f, null, 5)), (LinkedHashMap) null, 119));
            case 12:
                u21 u21Var = (u21) obj2;
                return pw5.d(Integer.valueOf(u21Var.m()), Float.valueOf(xs2.q(((pp3) u21Var.n.n).d(), -0.5f, 0.5f)), Integer.valueOf(u21Var.w()));
            case 13:
                return (xe1) ((we1) obj2).y.j.getValue();
            case 14:
                return Boolean.valueOf(yf2.p(obj, obj2));
            case kq2.x /* 15 */:
                return ((qx1) obj2).g;
            case 16:
                ((eh1) obj).y = (he) obj2;
                return og5Var;
            case 17:
                ((eh1) obj).g = (o22) obj2;
                return og5Var;
            case 18:
                ((xt0) obj2).getClass();
                ((eh1) obj).v = (byte) 1;
                return og5Var;
            case 19:
                mj0 mj0Var = (mj0) obj2;
                ((eh1) obj).r = mj0Var != null ? mj0Var.g : null;
                return og5Var;
            case 20:
                ((eh1) obj).n = (Float) obj2;
                return og5Var;
            case 21:
                ss2 ss2Var = (ss2) obj2;
                return pw5.d(Integer.valueOf(ss2Var.j()), Integer.valueOf(ss2Var.t()));
            case 22:
                Map mapV = ((vs2) obj2).v();
                if (mapV.isEmpty()) {
                    return null;
                }
                return mapV;
            case 23:
                jd3 jd3Var = (jd3) obj2;
                vc3 vc3Var = jd3Var.y;
                LinkedHashMap linkedHashMap2 = vc3Var.w;
                dr<mc3> drVar = vc3Var.x;
                LinkedHashMap linkedHashMap3 = vc3Var.q;
                ArrayList arrayList = new ArrayList();
                Bundle bundleN2 = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                Bundle bundle = vc3Var.n;
                if (bundle != null && bundle.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        gf6.n("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size = stringArrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        String str = stringArrayList.get(i2);
                        i2++;
                        String str2 = str;
                        str2.getClass();
                        if (bundle.containsKey(str2)) {
                            Bundle bundle2 = bundle.getBundle(str2);
                            if (bundle2 == null) {
                                gf6.n(str2);
                                throw null;
                            }
                            arrayList.add(str2);
                            bundleN2.putBundle(str2, bundle2);
                        }
                    }
                }
                for (Map.Entry entry : v13.J(vc3Var.u.g).entrySet()) {
                    ((sf3) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                    aq2.B(bundleN2, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundleN.putBundle("android-support-nav:controller:navigatorState", bundleN2);
                }
                if (drVar.isEmpty()) {
                    linkedHashMap = linkedHashMap2;
                    if (vc3Var.v != null) {
                        if (bundleN == null) {
                            bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                        }
                        Bundle[] bundleArr = vc3Var.v;
                        bundleArr.getClass();
                        List listJ0 = pr.j0(bundleArr);
                        bundleN.putParcelableArrayList("android-support-nav:controller:backStack", listJ0 instanceof ArrayList ? (ArrayList) listJ0 : new ArrayList<>(listJ0));
                    }
                } else {
                    if (bundleN == null) {
                        bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (mc3 mc3Var : drVar) {
                        mc3Var.getClass();
                        int i3 = mc3Var.t.t.g;
                        String str3 = mc3Var.w;
                        Bundle bundleG = mc3Var.g();
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        Bundle bundleN3 = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                        mc3Var.i.R(bundleN3);
                        Bundle bundleN4 = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                        bundleN4.putString("nav-entry-state:id", str3);
                        bundleN4.putInt("nav-entry-state:destination-id", i3);
                        if (bundleG == null) {
                            bundleG = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                        }
                        bundleN4.putBundle("nav-entry-state:args", bundleG);
                        bundleN4.putBundle("nav-entry-state:saved-state", bundleN3);
                        arrayList2.add(bundleN4);
                        linkedHashMap2 = linkedHashMap4;
                    }
                    linkedHashMap = linkedHashMap2;
                    bundleN.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap3.isEmpty()) {
                    if (bundleN == null) {
                        bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap3.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = 0;
                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                        int iIntValue3 = ((Number) entry2.getKey()).intValue();
                        String str4 = (String) entry2.getValue();
                        int i5 = i4 + 1;
                        iArr[i4] = iIntValue3;
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList3.add(str4);
                        i4 = i5;
                    }
                    bundleN.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    aq2.B(bundleN, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundleN == null) {
                        bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str5 = (String) entry3.getKey();
                        dr drVar2 = (dr) entry3.getValue();
                        arrayList4.add(str5);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it = drVar2.iterator();
                        while (it.hasNext()) {
                            cd cdVar = ((qc3) it.next()).g;
                            Bundle bundleN5 = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                            bundleN5.putString("nav-entry-state:id", (String) cdVar.y);
                            bundleN5.putInt("nav-entry-state:destination-id", cdVar.g);
                            Bundle bundleN6 = (Bundle) cdVar.r;
                            if (bundleN6 == null) {
                                bundleN6 = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                            }
                            bundleN5.putBundle("nav-entry-state:args", bundleN6);
                            bundleN5.putBundle("nav-entry-state:saved-state", (Bundle) cdVar.n);
                            arrayList5.add(bundleN5);
                        }
                        bundleN.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str5, arrayList5);
                    }
                    aq2.B(bundleN, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (jd3Var.v) {
                    if (bundleN == null) {
                        bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                    }
                    bundleN.putBoolean("android-support-nav:controller:deepLinkHandled", jd3Var.v);
                }
                return bundleN;
            case 24:
                int iIntValue4 = ((Integer) obj).intValue();
                if (((n22) obj2) instanceof e4) {
                    iIntValue4++;
                }
                return Integer.valueOf(iIntValue4);
            case 25:
                cn1 cn1Var = (cn1) obj;
                n22 n22Var = (n22) obj2;
                if ((n22Var instanceof go5) || (n22Var instanceof k52) || (n22Var instanceof ax0) || (n22Var instanceof jp)) {
                    return new cn1(cn1Var.g.n(n22Var), cn1Var.y);
                }
                return new cn1(cn1Var.g, cn1Var.y.n(n22Var));
            case 26:
                ((fh1) obj).r = (o22) obj2;
                return og5Var;
            case 27:
                ((fh1) obj).v = ((s6) obj2).g;
                return og5Var;
            case 28:
                ((fh1) obj).n = ((q6) obj2).g;
                return og5Var;
            default:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
        }
    }
}
