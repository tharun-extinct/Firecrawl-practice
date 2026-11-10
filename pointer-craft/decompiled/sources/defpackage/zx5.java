package defpackage;

import android.content.res.Configuration;
import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zx5 {
    public static final nm0 g = new nm0(-1131826196, false, new os(6));

    public static final void g(final nm0 nm0Var, j73 j73Var, bz1 bz1Var, bz1 bz1Var2, aw2 aw2Var, h02 h02Var, final int i, final int i2) {
        int i3;
        final j73 j73Var2;
        final bz1 bz1Var3;
        final bz1 bz1Var4;
        final aw2 aw2Var2;
        aw2 aw2VarC;
        int i4;
        bz1 bz1Var5;
        bz1 bz1Var6;
        j73 j73Var3;
        h02Var.Z(-290163389);
        if ((i & 6) == 0) {
            i3 = (h02Var.j(nm0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= h02Var.x(j73Var) ? 32 : 16;
        }
        int i6 = i3 | 3456;
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 = i3 | 28032;
        } else if ((i & 24576) == 0) {
            i6 |= h02Var.j(bz1Var) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        int i9 = 196608;
        if (i8 != 0) {
            i6 |= i9;
        } else if ((196608 & i) == 0) {
            i9 = h02Var.j(bz1Var2) ? 131072 : 65536;
            i6 |= i9;
        }
        if ((1572864 & i) == 0) {
            i6 |= 524288;
        }
        if (h02Var.N(i6 & 1, (599187 & i6) != 599186)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                if (i5 != 0) {
                    j73Var = g73.g;
                }
                if (i7 != 0) {
                    bz1Var = null;
                }
                if (i8 != 0) {
                    bz1Var2 = null;
                }
                aw2VarC = jr2.c(((rj0) h02Var.a(tj0.g)).F, h02Var);
                i4 = i6 & (-3670017);
                bz1Var5 = bz1Var;
                bz1Var6 = bz1Var2;
                j73Var3 = j73Var;
            } else {
                h02Var.Q();
                i4 = i6 & (-3670017);
                aw2VarC = aw2Var;
                j73Var3 = j73Var;
                bz1Var5 = bz1Var;
                bz1Var6 = bz1Var2;
            }
            h02Var.s();
            lr2.r(nm0Var, j73Var3, null, null, bz1Var5, bz1Var6, aw2VarC, 0.0f, h02Var, i4 & 4194302, 384);
            j73Var2 = j73Var3;
            bz1Var3 = bz1Var5;
            bz1Var4 = bz1Var6;
            aw2Var2 = aw2VarC;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            bz1Var3 = bz1Var;
            bz1Var4 = bz1Var2;
            aw2Var2 = aw2Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: cj2
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zx5.g(nm0Var, j73Var2, bz1Var3, bz1Var4, aw2Var2, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    public static final void n(String str, String str2, boolean z, my1 my1Var, xy1 xy1Var, h02 h02Var, int i) {
        h02 h02Var2 = h02Var;
        h02Var2.Z(-1274464736);
        byte b = 2;
        int i2 = i | (h02Var2.x(str) ? 4 : 2) | (h02Var2.x(str2) ? 32 : 16) | (h02Var2.l(z) ? 256 : 128) | (h02Var2.j(my1Var) ? 2048 : 1024) | (h02Var2.j(xy1Var) ? 16384 : 8192);
        if (h02Var2.N(i2 & 1, (i2 & 9363) != 9362)) {
            bw4 bw4VarR = ug.r((z ? qv1.o : qv1.u).j, h02Var2);
            ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var2, 0);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            g73 g73Var = g73.g;
            j73 j73VarW = m50.W(h02Var2, g73Var);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            g(ue5.m0(-947106365, new ta(str2, bw4VarR, (byte) 18), h02Var2), ue5.I(g73Var, false, null, null, my1Var, 15), ue5.m0(1906022087, new q80(b, z), h02Var2), null, null, h02Var2, 24582, 108);
            gp4.y(gk0.g, z, null, null, null, null, ue5.m0(1824057106, new ev0(str, xy1Var, (byte) 11), h02Var2), h02Var2, 1572870 | ((i2 >> 3) & 112), 30);
            h02Var2 = h02Var2;
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ej2(str, str2, z, my1Var, xy1Var, i);
        }
    }

    public static final void r(sj2 sj2Var, ss2 ss2Var, my1 my1Var, my1 my1Var2, h02 h02Var, int i) {
        sj2 sj2Var2;
        ss2 ss2Var2;
        int i2;
        final sj2 sj2Var3;
        final ss2 ss2VarG;
        List list;
        List list2;
        ux2 ux2Var;
        Object next;
        Object obj;
        mk2 mk2Var;
        my1Var.getClass();
        my1Var2.getClass();
        h02Var.Z(-978345649);
        int i3 = i | 18 | (h02Var.j(my1Var) ? 256 : 128) | (h02Var.j(my1Var2) ? 2048 : 1024);
        if (h02Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                wl5 wl5VarG = rx2.g(h02Var);
                if (wl5VarG == null) {
                    l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-127);
                    sj2Var3 = (sj2) js2.A(v54.g(sj2.class), wl5VarG, gp4.N(xs2.d(wl5VarG), h02Var), xs2.k(wl5VarG), h02Var);
                    ss2VarG = us2.g(h02Var);
                }
            } else {
                h02Var.Q();
                i2 = i3 & (-127);
                sj2Var3 = sj2Var;
                ss2VarG = ss2Var;
            }
            h02Var.s();
            final ob3 ob3VarS = og0.s(sj2Var3.n, h02Var);
            og0.s(sj2Var3.v, h02Var);
            final ob3 ob3VarS2 = og0.s(sj2Var3.x, h02Var);
            Object objK = h02Var.K();
            Object obj2 = oo0.g;
            if (objK == obj2) {
                objK = kq2.M("");
                h02Var.i0(objK);
            }
            final ob3 ob3Var = (ob3) objK;
            Object objK2 = h02Var.K();
            if (objK2 == obj2) {
                hm2[] hm2VarArr = (hm2[]) vp2.g.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (hm2 hm2Var : hm2VarArr) {
                    String str = hm2Var.g;
                    Object obj3 = linkedHashMap.get(str);
                    if (obj3 == null) {
                        ArrayList arrayList = new ArrayList();
                        linkedHashMap.put(str, arrayList);
                        obj3 = arrayList;
                    }
                    ((List) obj3).add(hm2Var);
                }
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : setKeySet) {
                    String displayLanguage = new Locale(str2).getDisplayLanguage();
                    if (yf2.p(displayLanguage, str2)) {
                        mk2Var = null;
                    } else {
                        displayLanguage.getClass();
                        mk2Var = new mk2(str2, displayLanguage);
                    }
                    if (mk2Var != null) {
                        arrayList2.add(mk2Var);
                    }
                }
                objK2 = cj0.B0(arrayList2, new fu1((byte) 9));
                h02Var.i0(objK2);
            }
            List list3 = (List) objK2;
            list3.getClass();
            Configuration configuration = (Configuration) h02Var.a(sa.g);
            boolean zX = h02Var.x(configuration) | h02Var.x(list3);
            Object objK3 = h02Var.K();
            if (zX || objK3 == obj2) {
                ux2 ux2VarN = ux2.n(configuration.getLocales());
                ArrayList arrayList3 = new ArrayList();
                int iR = ux2VarN.r();
                int i4 = 0;
                while (i4 < iR) {
                    Locale localeY = ux2VarN.y(i4);
                    localeY.getClass();
                    Iterator it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            list2 = list3;
                            ux2Var = ux2VarN;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            list2 = list3;
                            ux2Var = ux2VarN;
                            if (yf2.p(localeY.getLanguage(), ((mk2) next).g)) {
                                break;
                            }
                            list3 = list2;
                            ux2VarN = ux2Var;
                        }
                    }
                    mk2 mk2Var2 = (mk2) next;
                    if (mk2Var2 != null) {
                        arrayList3.add(mk2Var2);
                    }
                    i4++;
                    list3 = list2;
                    ux2VarN = ux2Var;
                }
                list = list3;
                h02Var.i0(arrayList3);
                obj = arrayList3;
            } else {
                list = list3;
                obj = objK3;
            }
            final List list4 = (List) obj;
            boolean zJ = h02Var.j(sj2Var3) | ((i2 & 7168) == 2048);
            Object objK4 = h02Var.K();
            if (zJ || objK4 == obj2) {
                objK4 = new m(sj2Var3, my1Var2, (byte) 26);
                h02Var.i0(objK4);
            }
            final xy1 xy1Var = (xy1) objK4;
            Object objK5 = h02Var.K();
            if (objK5 == obj2) {
                objK5 = pt4.y(new p61(ss2VarG, (byte) 1));
                h02Var.i0(objK5);
            }
            final List list5 = list;
            kq2.v(null, null, null, null, ue5.m0(2037866664, new fj2((bw4) objK5, my1Var), h02Var), 0, 0L, 0L, null, ue5.m0(1360042720, new cz1() { // from class: gj2
                @Override // defpackage.cz1
                public final Object x(Object obj4, Object obj5, Object obj6) {
                    zn3 zn3Var = (zn3) obj4;
                    h02 h02Var2 = (h02) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    zn3Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= h02Var2.x(zn3Var) ? 4 : 2;
                    }
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        j73 j73VarD0 = ue5.d0(g73.g, zn3Var);
                        bw4 bw4Var = ob3VarS2;
                        boolean zX2 = h02Var2.x(bw4Var);
                        bw4 bw4Var2 = ob3VarS;
                        boolean zX3 = zX2 | h02Var2.x(bw4Var2);
                        xy1 xy1Var2 = xy1Var;
                        boolean zX4 = zX3 | h02Var2.x(xy1Var2);
                        sj2 sj2Var4 = sj2Var3;
                        boolean zJ2 = zX4 | h02Var2.j(sj2Var4);
                        List list6 = list4;
                        boolean zJ3 = zJ2 | h02Var2.j(list6);
                        List list7 = list5;
                        boolean zJ4 = zJ3 | h02Var2.j(list7);
                        Object objK6 = h02Var2.K();
                        if (zJ4 || objK6 == oo0.g) {
                            h80 h80Var = new h80(list6, list7, bw4Var, xy1Var2, sj2Var4, bw4Var2, ob3Var, (byte) 1);
                            h02Var2.i0(h80Var);
                            objK6 = h80Var;
                        }
                        aq2.g(j73VarD0, ss2VarG, null, null, null, null, false, null, (xy1) objK6, h02Var2, 0, 508);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, 805330944, 495);
            sj2Var2 = sj2Var3;
            ss2Var2 = ss2VarG;
        } else {
            h02Var.Q();
            sj2Var2 = sj2Var;
            ss2Var2 = ss2Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zy(sj2Var2, ss2Var2, my1Var, my1Var2, i, (byte) 4);
        }
    }

    public static int v(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static Object[] x(int i, Object[] objArr) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public static final void y(final boolean z, final my1 my1Var, j73 j73Var, my1 my1Var2, final nm0 nm0Var, h02 h02Var, final int i, final int i2) {
        int i3;
        j73 j73Var2;
        int i4;
        my1 my1Var3;
        int i5;
        final j73 j73Var3;
        final my1 my1Var4;
        h02Var.Z(-225733826);
        if ((i & 6) == 0) {
            i3 = i | (h02Var.l(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (h02Var.j(my1Var) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            j73Var2 = j73Var;
        } else {
            j73Var2 = j73Var;
            i4 = i6 | (h02Var.x(j73Var2) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i5 = i4 | 3072;
            my1Var3 = my1Var2;
        } else {
            my1Var3 = my1Var2;
            i5 = i4 | (h02Var.j(my1Var3) ? 2048 : 1024);
        }
        byte b = 1;
        if (h02Var.N(i5 & 1, (i5 & 9363) != 9362)) {
            j73 j73Var4 = i7 != 0 ? g73.g : j73Var2;
            nm0 nm0VarM0 = null;
            my1 my1Var5 = i8 != 0 ? null : my1Var3;
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(Boolean.TRUE);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            boolean zBooleanValue = ((Boolean) ob3Var.getValue()).booleanValue();
            boolean z2 = (i5 & 112) == 32;
            Object objK2 = h02Var.K();
            if (z2 || objK2 == l76Var) {
                objK2 = new bm0(my1Var, ob3Var, (byte) 2);
                h02Var.i0(objK2);
            }
            j73 j73VarI = ue5.I(j73Var4, zBooleanValue, null, null, (my1) objK2, 14);
            nm0 nm0VarM1 = ue5.m0(-1051761919, new q80(b, z), h02Var);
            if (my1Var5 != null) {
                h02Var.X(1083043873);
                nm0VarM0 = ue5.m0(228377829, new ys(my1Var5, (byte) 7), h02Var);
                h02Var.b(false);
            } else {
                h02Var.X(1083268095);
                h02Var.b(false);
            }
            g(nm0Var, j73VarI, nm0VarM1, nm0VarM0, null, h02Var, 24582, 76);
            my1Var4 = my1Var5;
            j73Var3 = j73Var4;
        } else {
            h02Var.Q();
            j73Var3 = j73Var2;
            my1Var4 = my1Var3;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: dj2
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zx5.y(z, my1Var, j73Var3, my1Var4, nm0Var, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }
}
