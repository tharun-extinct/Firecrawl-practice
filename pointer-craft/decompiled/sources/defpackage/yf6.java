package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yf6 {
    /* JADX WARN: Code duplicated, block: B:42:0x0111 A[PHI: r6
  0x0111: PHI (r6v2 java.lang.Object) = (r6v1 java.lang.Object), (r6v3 java.lang.Object) binds: [B:46:0x0126, B:40:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void a(lm3 lm3Var, h02 h02Var, int i) {
        Set<String> set;
        Object stringSet;
        Object objValueOf;
        String str;
        ob3 ob3Var;
        h02Var.Z(-1645341386);
        byte b = 4;
        int i2 = ((i & 8) == 0 ? h02Var.x(lm3Var) : h02Var.j(lm3Var) ? 4 : 2) | i;
        byte b2 = 1;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            gx3 gx3Var = (gx3) h02Var.a(gp0.y);
            String str2 = lm3Var.y;
            boolean z = lm3Var.r;
            Object objValueOf2 = Boolean.valueOf(z);
            h02Var.X(-805633028);
            boolean zBooleanValue = ((Boolean) h02Var.a(yd2.g)).booleanValue();
            Object obj = oo0.g;
            if (zBooleanValue) {
                h02Var.X(-336165237);
                Object objK = h02Var.K();
                if (objK == obj) {
                    objK = kq2.M(objValueOf2);
                    h02Var.i0(objK);
                }
                ob3Var = (ob3) objK;
                h02Var.b(false);
                h02Var.b(false);
            } else {
                h02Var.X(-336108538);
                h02Var.b(false);
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                boolean zX = h02Var.x(str2);
                Object objK2 = h02Var.K();
                if (zX || objK2 == obj) {
                    tf0 tf0VarG = v54.g(Boolean.class);
                    if (tf0VarG.equals(v54.g(Float.TYPE))) {
                        objValueOf = Float.valueOf(sharedPreferences.getFloat(str2, ((Float) objValueOf2).floatValue()));
                    } else if (tf0VarG.equals(v54.g(Integer.TYPE))) {
                        objValueOf = Integer.valueOf(sharedPreferences.getInt(str2, ((Integer) objValueOf2).intValue()));
                    } else if (tf0VarG.equals(v54.g(Long.TYPE))) {
                        objValueOf = Long.valueOf(sharedPreferences.getLong(str2, ((Long) objValueOf2).longValue()));
                    } else if (tf0VarG.equals(v54.g(Boolean.TYPE))) {
                        objValueOf = Boolean.valueOf(sharedPreferences.getBoolean(str2, z));
                    } else if (tf0VarG.equals(v54.g(String.class))) {
                        str = (String) objValueOf2;
                        stringSet = sharedPreferences.getString(str2, str);
                        if (stringSet != null) {
                            objValueOf = set;
                            objValueOf = str;
                            objValueOf = stringSet;
                        }
                    } else {
                        if (!tf0VarG.equals(v54.g(Set.class))) {
                            l0.u("Unsupported type for SharedPreferences");
                            return;
                        }
                        set = (Set) objValueOf2;
                        stringSet = sharedPreferences.getStringSet(str2, set);
                        if (stringSet != null) {
                            objValueOf = set;
                            objValueOf = str;
                            objValueOf = stringSet;
                        }
                    }
                    objValueOf = set;
                    objValueOf = str;
                    objK2 = (Boolean) objValueOf;
                    h02Var.i0(objK2);
                }
                boolean zX2 = h02Var.x(str2);
                Object objK3 = h02Var.K();
                if (zX2 || objK3 == obj) {
                    objK3 = kq2.M(objK2);
                    h02Var.i0(objK3);
                }
                ob3 ob3Var2 = (ob3) objK3;
                boolean zX3 = h02Var.x(ob3Var2) | h02Var.j(sharedPreferences) | h02Var.x(str2);
                Object objK4 = h02Var.K();
                if (zX3 || objK4 == obj) {
                    Object dm4Var = new dm4(ob3Var2, sharedPreferences, str2, null, (byte) 4);
                    h02Var.i0(dm4Var);
                    objK4 = dm4Var;
                }
                k33.b((bz1) objK4, h02Var, str2);
                h02Var.b(false);
                ob3Var = ob3Var2;
            }
            lr2.r(ue5.m0(1880301080, new zl4(lm3Var, b2), h02Var), null, null, null, null, ue5.m0(-1825386573, new r2((Object) gx3Var, (Object) lm3Var, (Object) ob3Var, (byte) 27), h02Var), jr2.c(jj0.l, h02Var), 0.0f, h02Var, 196614, 414);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nv0(lm3Var, i, b);
        }
    }

    public static final void g(final fm3 fm3Var, my1 my1Var, h02 h02Var, int i) {
        h02Var.Z(-1534303478);
        byte b = 4;
        int i2 = ((i & 8) == 0 ? h02Var.x(fm3Var) : h02Var.j(fm3Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= h02Var.j(my1Var) ? 32 : 16;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            nm0 nm0VarM0 = ue5.m0(-2071448212, new bz1() { // from class: bm4
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    byte b4 = b2;
                    og5 og5Var = og5.g;
                    fm3 fm3Var2 = fm3Var;
                    switch (b4) {
                        case 0:
                            h02 h02Var2 = (h02) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!h02Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                h02Var2.Q();
                            } else {
                                yf6.v(fm3Var2, h02Var2, 0);
                            }
                            break;
                        default:
                            h02 h02Var3 = (h02) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!h02Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                h02Var3.Q();
                            } else {
                                g75.y(fm3Var2.y, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                            }
                            break;
                    }
                    return og5Var;
                }
            }, h02Var);
            b2 = (i2 & 112) == 32 ? (byte) 1 : (byte) 0;
            Object objK = h02Var.K();
            if (b2 != 0 || objK == oo0.g) {
                objK = new ss(my1Var, (byte) 10);
                h02Var.i0(objK);
            }
            lr2.r(nm0VarM0, ue5.I(g73.g, false, null, null, (my1) objK, 15), null, ue5.m0(-1638219127, new bz1() { // from class: bm4
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    byte b4 = b3;
                    og5 og5Var = og5.g;
                    fm3 fm3Var2 = fm3Var;
                    switch (b4) {
                        case 0:
                            h02 h02Var2 = (h02) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!h02Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                h02Var2.Q();
                            } else {
                                yf6.v(fm3Var2, h02Var2, 0);
                            }
                            break;
                        default:
                            h02 h02Var3 = (h02) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!h02Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                h02Var3.Q();
                            } else {
                                g75.y(fm3Var2.y, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262142);
                            }
                            break;
                    }
                    return og5Var;
                }
            }, h02Var), null, null, jr2.c(jj0.l, h02Var), 0.0f, h02Var, 3078, 436);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zn(fm3Var, my1Var, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010a A[PHI: r2
  0x010a: PHI (r2v15 java.lang.Object) = (r2v14 java.lang.Object), (r2v16 java.lang.Object) binds: [B:46:0x011a, B:40:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(jm3 jm3Var, h02 h02Var, int i) {
        Object stringSet;
        Object objValueOf;
        String str;
        ob3 ob3Var;
        h02Var.Z(1383901074);
        byte b = 2;
        int i2 = ((i & 8) == 0 ? h02Var.x(jm3Var) : h02Var.j(jm3Var) ? 4 : 2) | i;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            String str2 = jm3Var.y;
            Set set = jm3Var.v;
            h02Var.X(-805633028);
            boolean zBooleanValue = ((Boolean) h02Var.a(yd2.g)).booleanValue();
            Object obj = oo0.g;
            if (zBooleanValue) {
                h02Var.X(-336165237);
                Object objK = h02Var.K();
                if (objK == obj) {
                    objK = kq2.M(set);
                    h02Var.i0(objK);
                }
                h02Var.b(false);
                h02Var.b(false);
                ob3Var = (ob3) objK;
            } else {
                h02Var.X(-336108538);
                h02Var.b(false);
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                boolean zX = h02Var.x(str2);
                Object objK2 = h02Var.K();
                if (zX || objK2 == obj) {
                    tf0 tf0VarG = v54.g(Set.class);
                    if (tf0VarG.equals(v54.g(Float.TYPE))) {
                        objValueOf = Float.valueOf(sharedPreferences.getFloat(str2, ((Float) set).floatValue()));
                    } else if (tf0VarG.equals(v54.g(Integer.TYPE))) {
                        objValueOf = Integer.valueOf(sharedPreferences.getInt(str2, ((Integer) set).intValue()));
                    } else if (tf0VarG.equals(v54.g(Long.TYPE))) {
                        objValueOf = Long.valueOf(sharedPreferences.getLong(str2, ((Long) set).longValue()));
                    } else if (tf0VarG.equals(v54.g(Boolean.TYPE))) {
                        objValueOf = Boolean.valueOf(sharedPreferences.getBoolean(str2, ((Boolean) set).booleanValue()));
                    } else if (tf0VarG.equals(v54.g(String.class))) {
                        str = (String) set;
                        stringSet = sharedPreferences.getString(str2, str);
                        if (stringSet != null) {
                            objValueOf = set;
                            objValueOf = str;
                            objValueOf = stringSet;
                        }
                    } else {
                        if (!tf0VarG.equals(v54.g(Set.class))) {
                            l0.u("Unsupported type for SharedPreferences");
                            return;
                        }
                        stringSet = sharedPreferences.getStringSet(str2, set);
                        if (stringSet != null) {
                            objValueOf = set;
                            objValueOf = str;
                            objValueOf = stringSet;
                        }
                    }
                    objValueOf = set;
                    objValueOf = str;
                    objK2 = (Set) objValueOf;
                    h02Var.i0(objK2);
                }
                boolean zX2 = h02Var.x(str2);
                Object objK3 = h02Var.K();
                if (zX2 || objK3 == obj) {
                    objK3 = kq2.M(objK2);
                    h02Var.i0(objK3);
                }
                ob3 ob3Var2 = (ob3) objK3;
                boolean zX3 = h02Var.x(ob3Var2) | h02Var.j(sharedPreferences) | h02Var.x(str2);
                Object objK4 = h02Var.K();
                if (zX3 || objK4 == obj) {
                    Object dm4Var = new dm4(ob3Var2, sharedPreferences, str2, null, (byte) 2);
                    h02Var.i0(dm4Var);
                    objK4 = dm4Var;
                }
                k33.b((bz1) objK4, h02Var, str2);
                h02Var.b(false);
                ob3Var = ob3Var2;
            }
            lr2.r(ue5.m0(435945204, new zl4(jm3Var, b), h02Var), null, null, ue5.m0(1142979729, new vb0(xs2.H(jm3Var.r, h02Var), xs2.H(jm3Var.n, h02Var), (gx3) h02Var.a(gp0.y), jm3Var, ob3Var, (byte) 6), h02Var), null, null, jr2.c(jj0.l, h02Var), 0.0f, h02Var, 3078, 438);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nv0(jm3Var, i, (byte) 7);
        }
    }

    public static final void l(nm3 nm3Var, h02 h02Var, int i) {
        h02Var.Z(-1890916630);
        int i2 = i | ((i & 8) == 0 ? h02Var.x(nm3Var) : h02Var.j(nm3Var) ? 4 : 2);
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            g75.y(a11.C(nm3Var.y(), h02Var), ue5.i0(g73.g, 24.0f, 8.0f, 0.0f, 8.0f, 4), ((rj0) h02Var.a(tj0.g)).g, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).w, h02Var, 48, 0, 131064);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nv0(nm3Var, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0125 A[PHI: r8
  0x0125: PHI (r8v2 java.lang.Object) = (r8v1 java.lang.Object), (r8v3 java.lang.Object) binds: [B:52:0x013a, B:46:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void m(mm3 mm3Var, my1 my1Var, h02 h02Var, int i) {
        Set<String> set;
        Object stringSet;
        Object objValueOf;
        String str;
        ob3 ob3Var;
        h02Var.Z(-1123007957);
        int i2 = ((i & 8) == 0 ? h02Var.x(mm3Var) : h02Var.j(mm3Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= h02Var.j(my1Var) ? 32 : 16;
        }
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            h02Var.X(-2029633640);
            String str2 = mm3Var.y.y;
            h02Var.X(-805633028);
            boolean zBooleanValue = ((Boolean) h02Var.a(yd2.g)).booleanValue();
            Object obj = oo0.g;
            if (zBooleanValue) {
                h02Var.X(-336165237);
                Object objK = h02Var.K();
                if (objK == obj) {
                    objK = kq2.M(50);
                    h02Var.i0(objK);
                }
                ob3Var = (ob3) objK;
                h02Var.b(false);
                h02Var.b(false);
            } else {
                h02Var.X(-336108538);
                h02Var.b(false);
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                boolean zX = h02Var.x(str2);
                Object objK2 = h02Var.K();
                if (zX || objK2 == obj) {
                    tf0 tf0VarG = v54.g(Integer.class);
                    if (tf0VarG.equals(v54.g(Float.TYPE))) {
                        objValueOf = Float.valueOf(sharedPreferences.getFloat(str2, ((Float) 50).floatValue()));
                    } else if (tf0VarG.equals(v54.g(Integer.TYPE))) {
                        objValueOf = Integer.valueOf(sharedPreferences.getInt(str2, 50));
                    } else if (tf0VarG.equals(v54.g(Long.TYPE))) {
                        objValueOf = Long.valueOf(sharedPreferences.getLong(str2, ((Long) 50).longValue()));
                    } else if (tf0VarG.equals(v54.g(Boolean.TYPE))) {
                        objValueOf = Boolean.valueOf(sharedPreferences.getBoolean(str2, ((Boolean) 50).booleanValue()));
                    } else if (tf0VarG.equals(v54.g(String.class))) {
                        str = (String) 50;
                        stringSet = sharedPreferences.getString(str2, str);
                        if (stringSet != null) {
                            objValueOf = set;
                            objValueOf = str;
                            objValueOf = stringSet;
                        }
                    } else {
                        if (!tf0VarG.equals(v54.g(Set.class))) {
                            l0.u("Unsupported type for SharedPreferences");
                            return;
                        }
                        set = (Set) 50;
                        stringSet = sharedPreferences.getStringSet(str2, set);
                        if (stringSet != null) {
                            objValueOf = set;
                            objValueOf = str;
                            objValueOf = stringSet;
                        }
                    }
                    objValueOf = set;
                    objValueOf = str;
                    objK2 = (Integer) objValueOf;
                    h02Var.i0(objK2);
                }
                boolean zX2 = h02Var.x(str2);
                Object objK3 = h02Var.K();
                if (zX2 || objK3 == obj) {
                    objK3 = kq2.M(objK2);
                    h02Var.i0(objK3);
                }
                ob3 ob3Var2 = (ob3) objK3;
                boolean zX3 = h02Var.x(ob3Var2) | h02Var.j(sharedPreferences) | h02Var.x(str2);
                Object objK4 = h02Var.K();
                if (zX3 || objK4 == obj) {
                    Object dm4Var = new dm4(ob3Var2, sharedPreferences, str2, null, (byte) 5);
                    h02Var.i0(dm4Var);
                    objK4 = dm4Var;
                }
                k33.b((bz1) objK4, h02Var, str2);
                h02Var.b(false);
                ob3Var = ob3Var2;
            }
            float fIntValue = ((Number) ob3Var.getValue()).intValue() / 100.0f;
            h02Var.b(false);
            Float fValueOf = Float.valueOf(fIntValue);
            nm0 nm0VarM0 = ue5.m0(325949069, new zl4(mm3Var, (byte) 6), h02Var);
            boolean z = (i2 & 112) == 32;
            Object objK5 = h02Var.K();
            if (z || objK5 == obj) {
                objK5 = new ss(my1Var, (byte) 11);
                h02Var.i0(objK5);
            }
            j73 j73VarI = ue5.I(g73.g, false, null, null, (my1) objK5, 15);
            h02Var.X(-2029253456);
            nm0 nm0VarM1 = ue5.m0(-1138292433, new ed(fValueOf, (byte) 28), h02Var);
            h02Var.b(false);
            lr2.r(nm0VarM0, j73VarI, null, nm0VarM1, null, sz5.r, jr2.c(jj0.l, h02Var), 0.0f, h02Var, 196614, 404);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zn((nm3) mm3Var, my1Var, i, (byte) 3);
        }
    }

    public static final void n(nm3 nm3Var, my1 my1Var, h02 h02Var, int i) {
        nm3Var.getClass();
        my1Var.getClass();
        h02Var.Z(-689738315);
        byte b = 2;
        int i2 = ((i & 8) == 0 ? h02Var.x(nm3Var) : h02Var.j(nm3Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= h02Var.j(my1Var) ? 32 : 16;
        }
        if (!h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            h02Var.Q();
        } else if (nm3Var instanceof im3) {
            h02Var.X(-1413553490);
            l(nm3Var, h02Var, i2 & 14);
            h02Var.b(false);
        } else if (nm3Var instanceof lm3) {
            h02Var.X(-1413551763);
            a((lm3) nm3Var, h02Var, i2 & 14);
            h02Var.b(false);
        } else if (nm3Var instanceof km3) {
            h02Var.X(-1413550067);
            t((km3) nm3Var, h02Var, i2 & 14);
            h02Var.b(false);
        } else if (nm3Var instanceof jm3) {
            h02Var.X(-1413548272);
            j((jm3) nm3Var, h02Var, i2 & 14);
            h02Var.b(false);
        } else if (nm3Var instanceof hm3) {
            h02Var.X(-1413546549);
            r((hm3) nm3Var, h02Var, i2 & 14);
            h02Var.b(false);
        } else if (nm3Var instanceof fm3) {
            h02Var.X(-1413544642);
            g((fm3) nm3Var, my1Var, h02Var, i2 & 126);
            h02Var.b(false);
        } else if (nm3Var instanceof mm3) {
            h02Var.X(-1413542185);
            m((mm3) nm3Var, my1Var, h02Var, i2 & 126);
            h02Var.b(false);
        } else if (!(nm3Var instanceof gm3)) {
            h02Var.X(-1413554458);
            h02Var.b(false);
            up.y();
            return;
        } else {
            h02Var.X(-1413539987);
            y((gm3) nm3Var, h02Var, i2 & 14);
            h02Var.b(false);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zn(nm3Var, my1Var, i, b);
        }
    }

    public static x1 q() {
        x1 x1Var = x1.r;
        if (x1Var != null) {
            return x1Var;
        }
        x1 x1Var2 = new x1();
        x1.r = x1Var2;
        return x1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0302 A[PHI: r6
  0x0302: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v6 java.lang.Object) binds: [B:117:0x0317, B:111:0x02ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0165 A[PHI: r2
  0x0165: PHI (r2v29 java.lang.Object) = (r2v28 java.lang.Object), (r2v30 java.lang.Object) binds: [B:54:0x0175, B:48:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(hm3 hm3Var, h02 h02Var, int i) {
        hm3 hm3Var2;
        Set<String> set;
        Object stringSet;
        Object objValueOf;
        Object dm4Var;
        Object obj;
        ob3 ob3Var;
        ob3 ob3Var2;
        ob3 ob3Var3;
        xy1 xy1Var;
        ob3 ob3Var4;
        String[] strArr;
        String[] strArr2;
        st4 st4Var;
        Object stringSet2;
        Object objValueOf2;
        String str;
        ob3 ob3Var5;
        String str2;
        h02Var.Z(801130102);
        int i2 = ((i & 8) == 0 ? h02Var.x(hm3Var) : h02Var.j(hm3Var) ? 4 : 2) | i;
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            int i3 = hm3Var.r;
            String str3 = hm3Var.y;
            String str4 = hm3Var.v;
            String[] strArrH = xs2.H(i3, h02Var);
            String[] strArrH2 = xs2.H(hm3Var.n, h02Var);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                st4 st4Var2 = new st4();
                st4Var2.addAll(pr.j0(new String[]{str4}));
                h02Var.i0(st4Var2);
                objK = st4Var2;
            }
            st4 st4Var3 = (st4) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK2);
            }
            ob3 ob3Var6 = (ob3) objK2;
            gx3 gx3Var = (gx3) h02Var.a(gp0.y);
            boolean z = hm3Var.x;
            Class cls = Boolean.TYPE;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            Class cls4 = Float.TYPE;
            mu0 mu0Var = null;
            if (z) {
                h02Var.X(-665973867);
                Set setH = js2.h(str4);
                h02Var.X(-805633028);
                if (((Boolean) h02Var.a(yd2.g)).booleanValue()) {
                    h02Var.X(-336165237);
                    Object objK3 = h02Var.K();
                    if (objK3 == l76Var) {
                        objK3 = kq2.M(setH);
                        h02Var.i0(objK3);
                    }
                    h02Var.b(false);
                    h02Var.b(false);
                    gx3Var = gx3Var;
                    mu0Var = null;
                    ob3Var5 = (ob3) objK3;
                    l76Var = l76Var;
                } else {
                    h02Var.X(-336108538);
                    h02Var.b(false);
                    SharedPreferences sharedPreferences = d52.b;
                    sharedPreferences.getClass();
                    boolean zX = h02Var.x(str3);
                    Object objK4 = h02Var.K();
                    if (zX || objK4 == l76Var) {
                        tf0 tf0VarG = v54.g(Set.class);
                        if (tf0VarG.equals(v54.g(cls4))) {
                            objValueOf2 = Float.valueOf(sharedPreferences.getFloat(str3, ((Float) setH).floatValue()));
                        } else if (tf0VarG.equals(v54.g(cls3))) {
                            objValueOf2 = Integer.valueOf(sharedPreferences.getInt(str3, ((Integer) setH).intValue()));
                        } else if (tf0VarG.equals(v54.g(cls2))) {
                            objValueOf2 = Long.valueOf(sharedPreferences.getLong(str3, ((Long) setH).longValue()));
                        } else if (tf0VarG.equals(v54.g(cls))) {
                            objValueOf2 = Boolean.valueOf(sharedPreferences.getBoolean(str3, ((Boolean) setH).booleanValue()));
                        } else if (tf0VarG.equals(v54.g(String.class))) {
                            str = (String) setH;
                            stringSet2 = sharedPreferences.getString(str3, str);
                            if (stringSet2 != null) {
                                objValueOf2 = setH;
                                objValueOf2 = str;
                                objValueOf2 = stringSet2;
                            }
                        } else {
                            if (!tf0VarG.equals(v54.g(Set.class))) {
                                l0.u("Unsupported type for SharedPreferences");
                                return;
                            }
                            stringSet2 = sharedPreferences.getStringSet(str3, setH);
                            if (stringSet2 != null) {
                                objValueOf2 = setH;
                                objValueOf2 = str;
                                objValueOf2 = stringSet2;
                            }
                        }
                        objValueOf2 = setH;
                        objValueOf2 = str;
                        objK4 = (Set) objValueOf2;
                        h02Var.i0(objK4);
                    }
                    boolean zX2 = h02Var.x(str3);
                    Object objK5 = h02Var.K();
                    if (zX2 || objK5 == l76Var) {
                        objK5 = kq2.M(objK4);
                        h02Var.i0(objK5);
                    }
                    ob3 ob3Var7 = (ob3) objK5;
                    boolean zX3 = h02Var.x(ob3Var7) | h02Var.j(sharedPreferences) | h02Var.x(str3);
                    Object objK6 = h02Var.K();
                    if (zX3 || objK6 == l76Var) {
                        ob3Var5 = ob3Var7;
                        Object dm4Var2 = new dm4(ob3Var5, sharedPreferences, str3, mu0Var, (byte) 0);
                        str2 = str3;
                        h02Var.i0(dm4Var2);
                        objK6 = dm4Var2;
                    } else {
                        str2 = str3;
                        ob3Var5 = ob3Var7;
                    }
                    k33.b((bz1) objK6, h02Var, str2);
                    h02Var.b(false);
                }
                boolean zJ = h02Var.j(gx3Var) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && h02Var.j(hm3Var))) | h02Var.x(ob3Var5);
                Object objK7 = h02Var.K();
                if (zJ || objK7 == l76Var) {
                    objK7 = new q2((Object) gx3Var, (Object) hm3Var, (Object) ob3Var5, (byte) 23);
                    h02Var.i0(objK7);
                }
                xy1Var = (xy1) objK7;
                Set set2 = (Set) ob3Var5.getValue();
                boolean zX4 = h02Var.x(ob3Var5);
                Object objK8 = h02Var.K();
                if (zX4 || objK8 == l76Var) {
                    objK8 = new em4(st4Var3, ob3Var5, mu0Var, b);
                    h02Var.i0(objK8);
                }
                k33.b((bz1) objK8, h02Var, set2);
                h02Var.b(false);
                obj = l76Var;
                st4Var3 = st4Var3;
                ob3Var3 = ob3Var6;
            } else {
                String str5 = str3;
                h02Var.X(-665255876);
                h02Var.X(-805633028);
                if (((Boolean) h02Var.a(yd2.g)).booleanValue()) {
                    h02Var.X(-336165237);
                    Object objK9 = h02Var.K();
                    if (objK9 == l76Var) {
                        objK9 = kq2.M(str4);
                        h02Var.i0(objK9);
                    }
                    ob3Var = (ob3) objK9;
                    h02Var.b(false);
                    h02Var.b(false);
                    obj = l76Var;
                    mu0Var = null;
                } else {
                    h02Var.X(-336108538);
                    h02Var.b(false);
                    SharedPreferences sharedPreferences2 = d52.b;
                    sharedPreferences2.getClass();
                    boolean zX5 = h02Var.x(str5);
                    Object objK10 = h02Var.K();
                    if (zX5 || objK10 == l76Var) {
                        tf0 tf0VarG2 = v54.g(String.class);
                        if (tf0VarG2.equals(v54.g(cls4))) {
                            str4.getClass();
                            objValueOf = Float.valueOf(sharedPreferences2.getFloat(str5, ((Float) str4).floatValue()));
                        } else if (tf0VarG2.equals(v54.g(cls3))) {
                            str4.getClass();
                            objValueOf = Integer.valueOf(sharedPreferences2.getInt(str5, ((Integer) str4).intValue()));
                        } else if (tf0VarG2.equals(v54.g(cls2))) {
                            str4.getClass();
                            objValueOf = Long.valueOf(sharedPreferences2.getLong(str5, ((Long) str4).longValue()));
                        } else if (tf0VarG2.equals(v54.g(cls))) {
                            str4.getClass();
                            objValueOf = Boolean.valueOf(sharedPreferences2.getBoolean(str5, ((Boolean) str4).booleanValue()));
                        } else if (tf0VarG2.equals(v54.g(String.class))) {
                            str4.getClass();
                            stringSet = sharedPreferences2.getString(str5, str4);
                            if (stringSet != null) {
                                objValueOf = set;
                                objValueOf = str4;
                                objValueOf = stringSet;
                            }
                        } else {
                            if (!tf0VarG2.equals(v54.g(Set.class))) {
                                l0.u("Unsupported type for SharedPreferences");
                                return;
                            }
                            str4.getClass();
                            set = (Set) str4;
                            stringSet = sharedPreferences2.getStringSet(str5, set);
                            if (stringSet != null) {
                                objValueOf = set;
                                objValueOf = str4;
                                objValueOf = stringSet;
                            }
                        }
                        objValueOf = set;
                        objValueOf = str4;
                        objK10 = (String) objValueOf;
                        h02Var.i0(objK10);
                    }
                    boolean zX6 = h02Var.x(str5);
                    Object objK11 = h02Var.K();
                    if (zX6 || objK11 == l76Var) {
                        objK11 = kq2.M(objK10);
                        h02Var.i0(objK11);
                    }
                    ob3 ob3Var8 = (ob3) objK11;
                    boolean zX7 = h02Var.x(ob3Var8) | h02Var.j(sharedPreferences2) | h02Var.x(str5);
                    Object objK12 = h02Var.K();
                    if (zX7 || objK12 == l76Var) {
                        obj = l76Var;
                        dm4Var = new dm4(ob3Var8, sharedPreferences2, str5, mu0Var, (byte) 1);
                        str5 = str5;
                        h02Var.i0(dm4Var);
                    } else {
                        obj = l76Var;
                        dm4Var = objK12;
                    }
                    k33.b((bz1) dm4Var, h02Var, str5);
                    h02Var.b(false);
                    ob3Var = ob3Var8;
                }
                boolean zJ2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && h02Var.j(hm3Var))) | h02Var.j(gx3Var) | h02Var.x(ob3Var);
                Object objK13 = h02Var.K();
                if (zJ2 || objK13 == obj) {
                    ob3Var2 = ob3Var;
                    ob3Var3 = ob3Var6;
                    Object mgVar = new mg(gx3Var, hm3Var, ob3Var2, ob3Var3, (byte) 4);
                    h02Var.i0(mgVar);
                    objK13 = mgVar;
                } else {
                    ob3Var3 = ob3Var6;
                    ob3Var2 = ob3Var;
                }
                xy1 xy1Var2 = (xy1) objK13;
                String str6 = (String) ob3Var2.getValue();
                boolean zX8 = h02Var.x(ob3Var2);
                Object objK14 = h02Var.K();
                if (zX8 || objK14 == obj) {
                    objK14 = new em4(st4Var3, ob3Var2, mu0Var, (byte) 1);
                    h02Var.i0(objK14);
                }
                k33.b((bz1) objK14, h02Var, str6);
                h02Var.b(false);
                xy1Var = xy1Var2;
            }
            if (((Boolean) ob3Var3.getValue()).booleanValue()) {
                h02Var.X(-664743756);
                Object objK15 = h02Var.K();
                if (objK15 == obj) {
                    objK15 = new za4(ob3Var3, (byte) 6);
                    h02Var.i0(objK15);
                }
                my1 my1Var = (my1) objK15;
                xy1 xy1Var3 = xy1Var;
                ob3 ob3Var9 = ob3Var3;
                st4 st4Var4 = st4Var3;
                am4 am4Var = new am4(hm3Var, strArrH2, strArrH, xy1Var3, st4Var4, ob3Var9, (byte) 0);
                hm3Var2 = hm3Var;
                strArr2 = strArrH2;
                st4Var = st4Var4;
                ob3Var4 = ob3Var9;
                strArr = strArrH;
                yd6.r(my1Var, null, null, ue5.m0(454505094, am4Var, h02Var), h02Var, 3078);
                h02Var.b(false);
            } else {
                ob3Var4 = ob3Var3;
                strArr = strArrH;
                strArr2 = strArrH2;
                st4Var = st4Var3;
                hm3Var2 = hm3Var;
                h02Var.X(-662414292);
                h02Var.b(false);
            }
            nm0 nm0VarM0 = ue5.m0(-2063527848, new zl4(hm3Var2, (byte) 3), h02Var);
            Object objK16 = h02Var.K();
            if (objK16 == obj) {
                objK16 = new za4(ob3Var4, (byte) 7);
                h02Var.i0(objK16);
            }
            lr2.r(nm0VarM0, ue5.I(g73.g, false, null, null, (my1) objK16, 15), null, ue5.m0(-568623563, new r2((Object) st4Var, (Object) strArr2, (Object) strArr, (byte) 28), h02Var), null, null, jr2.c(jj0.l, h02Var), 0.0f, h02Var, 3078, 436);
        } else {
            hm3Var2 = hm3Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nv0(hm3Var2, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0112 A[PHI: r3
  0x0112: PHI (r3v3 java.lang.Object) = (r3v2 java.lang.Object), (r3v4 java.lang.Object) binds: [B:46:0x0127, B:40:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void t(km3 km3Var, h02 h02Var, int i) {
        Set<String> set;
        Object stringSet;
        Object objValueOf;
        String str;
        ob3 ob3Var;
        h02Var.Z(-429132394);
        int i2 = ((i & 8) == 0 ? h02Var.x(km3Var) : h02Var.j(km3Var) ? 4 : 2) | i;
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            gx3 gx3Var = (gx3) h02Var.a(gp0.y);
            String str2 = km3Var.y;
            h02Var.X(-805633028);
            boolean zBooleanValue = ((Boolean) h02Var.a(yd2.g)).booleanValue();
            Object obj = oo0.g;
            if (zBooleanValue) {
                h02Var.X(-336165237);
                Object objK = h02Var.K();
                if (objK == obj) {
                    objK = kq2.M(50);
                    h02Var.i0(objK);
                }
                h02Var.b(false);
                h02Var.b(false);
                ob3Var = (ob3) objK;
            } else {
                h02Var.X(-336108538);
                h02Var.b(false);
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                boolean zX = h02Var.x(str2);
                Object objK2 = h02Var.K();
                if (zX || objK2 == obj) {
                    tf0 tf0VarG = v54.g(Integer.class);
                    if (tf0VarG.equals(v54.g(Float.TYPE))) {
                        objValueOf = Float.valueOf(sharedPreferences.getFloat(str2, ((Float) 50).floatValue()));
                    } else if (tf0VarG.equals(v54.g(Integer.TYPE))) {
                        objValueOf = Integer.valueOf(sharedPreferences.getInt(str2, 50));
                    } else if (tf0VarG.equals(v54.g(Long.TYPE))) {
                        objValueOf = Long.valueOf(sharedPreferences.getLong(str2, ((Long) 50).longValue()));
                    } else if (tf0VarG.equals(v54.g(Boolean.TYPE))) {
                        objValueOf = Boolean.valueOf(sharedPreferences.getBoolean(str2, ((Boolean) 50).booleanValue()));
                    } else if (tf0VarG.equals(v54.g(String.class))) {
                        str = (String) 50;
                        stringSet = sharedPreferences.getString(str2, str);
                        if (stringSet != null) {
                            objValueOf = set;
                            objValueOf = str;
                            objValueOf = stringSet;
                        }
                    } else {
                        if (!tf0VarG.equals(v54.g(Set.class))) {
                            l0.u("Unsupported type for SharedPreferences");
                            return;
                        }
                        set = (Set) 50;
                        stringSet = sharedPreferences.getStringSet(str2, set);
                        if (stringSet != null) {
                            objValueOf = set;
                            objValueOf = str;
                            objValueOf = stringSet;
                        }
                    }
                    objValueOf = set;
                    objValueOf = str;
                    objK2 = (Integer) objValueOf;
                    h02Var.i0(objK2);
                }
                boolean zX2 = h02Var.x(str2);
                Object objK3 = h02Var.K();
                if (zX2 || objK3 == obj) {
                    objK3 = kq2.M(objK2);
                    h02Var.i0(objK3);
                }
                ob3 ob3Var2 = (ob3) objK3;
                boolean zX3 = h02Var.x(ob3Var2) | h02Var.j(sharedPreferences) | h02Var.x(str2);
                Object objK4 = h02Var.K();
                if (zX3 || objK4 == obj) {
                    Object dm4Var = new dm4(ob3Var2, sharedPreferences, str2, null, (byte) 3);
                    h02Var.i0(dm4Var);
                    objK4 = dm4Var;
                }
                k33.b((bz1) objK4, h02Var, str2);
                h02Var.b(false);
                ob3Var = ob3Var2;
            }
            Object objK5 = h02Var.K();
            if (objK5 == obj) {
                objK5 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK5);
            }
            ob3 ob3Var3 = (ob3) objK5;
            Object objK6 = h02Var.K();
            if (objK6 == obj) {
                objK6 = du4.n(h02Var);
            }
            lr2.r(ue5.m0(-1198457224, new zl4(km3Var, b), h02Var), null, null, ue5.m0(14104021, new vb0(gx3Var, km3Var, ob3Var, ob3Var3, (ja3) objK6, (byte) 5), h02Var), null, null, jr2.c(jj0.l, h02Var), 0.0f, h02Var, 3078, 438);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nv0(km3Var, i, (byte) 3);
        }
    }

    public static final void v(nm3 nm3Var, h02 h02Var, int i) {
        h02 h02Var2;
        h02Var.Z(-1173163808);
        byte b = 4;
        int i2 = (h02Var.x(nm3Var) ? 4 : 2) | i;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            h02Var2 = h02Var;
            x(a11.C(nm3Var.y(), h02Var), nm3Var.g(), ((mf5) h02Var.a(of5.g)).j, h02Var2, 0, 0);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new zl4(nm3Var, i, b);
        }
    }

    public static final boolean w(int i) {
        return i == 1 || i == 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x013c  */
    /* JADX WARN: Code duplicated, block: B:46:0x014d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void x(String str, boolean z, k85 k85Var, h02 h02Var, int i, int i2) {
        k85 k85Var2;
        int i3;
        boolean z2;
        h02 h02Var2;
        u34 u34VarP;
        boolean z3;
        h02Var.Z(-1498909241);
        int i4 = i | (h02Var.x(str) ? 4 : 2) | (h02Var.l(z) ? 32 : 16);
        if ((i2 & 4) == 0) {
            k85Var2 = k85Var;
            int i5 = h02Var.x(k85Var2) ? 256 : 128;
            i3 = i4 | i5;
            if ((i3 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h02Var.N(i3 & 1, z2)) {
                h02Var.S();
                if ((i & 1) == 0 && !h02Var.k()) {
                    h02Var.Q();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                } else if ((i2 & 4) != 0) {
                    k85Var2 = (k85) h02Var.a(g75.g);
                    i3 &= -897;
                }
                k85 k85Var3 = k85Var2;
                h02Var.s();
                gx3 gx3Var = (gx3) h02Var.a(gp0.y);
                g73 g73Var = g73.g;
                j73 j73VarI0 = ue5.i0(g73Var, 0.0f, 8.0f, 0.0f, 4.0f, 5);
                kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var, 48);
                int iHashCode = Long.hashCode(h02Var.T);
                tr3 tr3VarQ = h02Var.q();
                j73 j73VarW = m50.W(h02Var, j73VarI0);
                jo0.n.getClass();
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(um2.Z);
                } else {
                    h02Var.l0();
                }
                xs2.E(tg1.w, h02Var, kb4VarG);
                xs2.E(tg1.q, h02Var, tr3VarQ);
                xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                xs2.D(h02Var);
                xs2.E(tg1.m, h02Var, j73VarW);
                g75.y(str, new tp2(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, k85Var3, h02Var, i3 & 14, (i3 << 15) & 29360128, 131068);
                h02Var2 = h02Var;
                if (z || gx3Var.g) {
                    z3 = true;
                    h02Var2.X(431720087);
                    h02Var2.b(false);
                } else {
                    h02Var2.X(431637441);
                    mq2.y(h02Var2, mq4.q(g73Var, 8.0f));
                    z3 = true;
                    xs2.y(null, h02Var2, 0, 1);
                    h02Var2.b(false);
                }
                h02Var2.b(z3);
                k85Var2 = k85Var3;
            } else {
                h02Var2 = h02Var;
                h02Var2.Q();
            }
            u34VarP = h02Var2.p();
            if (u34VarP != null) {
                u34VarP.n = new qe(str, z, k85Var2, i, i2);
            }
        }
        k85Var2 = k85Var;
        i3 = i4 | i5;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h02Var.N(i3 & 1, z2)) {
            h02Var.S();
            if ((i & 1) == 0) {
                if ((i2 & 4) != 0) {
                    k85Var2 = (k85) h02Var.a(g75.g);
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                k85Var2 = (k85) h02Var.a(g75.g);
                i3 &= -897;
            }
            k85 k85Var4 = k85Var2;
            h02Var.s();
            gx3 gx3Var2 = (gx3) h02Var.a(gp0.y);
            g73 g73Var2 = g73.g;
            j73 j73VarI1 = ue5.i0(g73Var2, 0.0f, 8.0f, 0.0f, 4.0f, 5);
            kb4 kb4VarG2 = jb4.g(v70.y, hi0.u, h02Var, 48);
            int iHashCode2 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarI1);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, kb4VarG2);
            xs2.E(tg1.q, h02Var, tr3VarQ2);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode2));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW2);
            g75.y(str, new tp2(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, k85Var4, h02Var, i3 & 14, (i3 << 15) & 29360128, 131068);
            h02Var2 = h02Var;
            if (z) {
                z3 = true;
                h02Var2.X(431720087);
                h02Var2.b(false);
            } else {
                z3 = true;
                h02Var2.X(431720087);
                h02Var2.b(false);
            }
            h02Var2.b(z3);
            k85Var2 = k85Var4;
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new qe(str, z, k85Var2, i, i2);
        }
    }

    public static final void y(gm3 gm3Var, h02 h02Var, int i) {
        h02Var.Z(-1331283775);
        byte b = 2;
        int i2 = ((i & 8) == 0 ? h02Var.x(gm3Var) : h02Var.j(gm3Var) ? 4 : 2) | i;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            gx3 gx3Var = (gx3) h02Var.a(gp0.y);
            rw3 rw3Var = new rw3(gm3Var.y);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = new vy3((byte) 12);
                h02Var.i0(objK);
            }
            xy1 xy1Var = (xy1) objK;
            xy1Var.getClass();
            Context context = (Context) h02Var.a(sa.y);
            ob3 ob3VarB = og0.b(new km4(((ow3) q03.g(context)).g.y(), rw3Var, xy1Var, context), null, ((gu2) h02Var.a(ix2.g)).a(), wt2.m, ni1.j, h02Var, 48);
            boolean zX = h02Var.x(ob3VarB.getValue());
            Object objK2 = h02Var.K();
            if (zX || objK2 == obj) {
                objK2 = kq2.M(ob3VarB.getValue());
                h02Var.i0(objK2);
            }
            ob3 ob3Var = (ob3) objK2;
            Object value = ob3Var.getValue();
            if (value == null) {
                h02Var.X(-1635026792);
                h02Var.b(false);
                ob3Var = ob3Var;
            } else {
                h02Var.X(-1635026791);
                if (yf2.p(ob3VarB.getValue(), value)) {
                    ob3Var = ob3Var;
                    h02Var.X(-1786162499);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1786329713);
                    boolean zJ = h02Var.j(context) | h02Var.j(rw3Var) | h02Var.j(value);
                    Object objK3 = h02Var.K();
                    if (zJ || objK3 == obj) {
                        objK3 = new u03(context, rw3Var, value, (mu0) null, (byte) 7);
                        h02Var.i0(objK3);
                    }
                    k33.b((bz1) objK3, h02Var, value);
                    h02Var.b(false);
                }
                h02Var.b(false);
            }
            lr2.r(ue5.m0(2015727651, new ed(gm3Var, (byte) 29), h02Var), null, null, null, null, ue5.m0(-1100848770, new r2((Object) gx3Var, (Object) gm3Var, (Object) ob3Var, (byte) 26), h02Var), jr2.c(jj0.l, h02Var), 0.0f, h02Var, 196614, 414);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nv0(gm3Var, i, b);
        }
    }
}
