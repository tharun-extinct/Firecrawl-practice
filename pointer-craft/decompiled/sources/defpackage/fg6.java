package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.glance.appwidget.AsyncRequestWorker;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fg6 {
    public static final void g(final nm0 nm0Var, bz1 bz1Var, bz1 bz1Var2, k85 k85Var, final long j, long j2, h02 h02Var, final int i) {
        bz1 bz1Var3;
        bz1 bz1Var4;
        k85 k85Var2;
        long j3;
        boolean z;
        int i2;
        boolean z2;
        h02Var.Z(-931325388);
        int i3 = i | (h02Var.j(nm0Var) ? 4 : 2) | (h02Var.j(bz1Var) ? 32 : 16) | (h02Var.j(bz1Var2) ? 256 : 128) | (h02Var.x(k85Var) ? 2048 : 1024) | (h02Var.v(j) ? 16384 : 8192) | (h02Var.v(j2) ? 131072 : 65536);
        if (h02Var.N(i3 & 1, (74899 & i3) != 74898)) {
            float f = bz1Var2 == null ? 8.0f : 0.0f;
            g73 g73Var = g73.g;
            j73 j73VarI0 = ue5.i0(g73Var, 16.0f, 0.0f, f, 0.0f, 10);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new mb((byte) 5);
                h02Var.i0(objK);
            }
            t33 t33Var = (t33) objK;
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarI0);
            jo0.n.getClass();
            h02Var.b0();
            boolean z3 = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z3) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, t33Var);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            on0 on0Var3 = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var3);
            }
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var, j73VarW);
            j73 j73VarG0 = ue5.g0(ue5.X(g73Var, "text"), 0.0f, 6.0f, 1);
            k00 k00Var = hi0.t;
            t33 t33VarR = z50.r(k00Var, false);
            int iS2 = pw5.s(h02Var);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarG0);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR);
            xs2.E(on0Var2, h02Var, tr3VarQ2);
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                du4.f(iS2, h02Var, iS2, on0Var3);
            }
            xs2.E(on0Var4, h02Var, j73VarW2);
            du4.h(i3 & 14, nm0Var, h02Var, true);
            if (bz1Var != null) {
                h02Var.X(-1014168049);
                j73 j73VarX = ue5.X(g73Var, "action");
                t33 t33VarR2 = z50.r(k00Var, false);
                int iS3 = pw5.s(h02Var);
                tr3 tr3VarQ3 = h02Var.q();
                j73 j73VarW3 = m50.W(h02Var, j73VarX);
                h02Var.b0();
                i2 = 8;
                if (h02Var.S) {
                    h02Var.m(sx1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, t33VarR2);
                xs2.E(on0Var2, h02Var, tr3VarQ3);
                if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS3))) {
                    du4.f(iS3, h02Var, iS3, on0Var3);
                }
                xs2.E(on0Var4, h02Var, j73VarW3);
                k85Var2 = k85Var;
                bz1Var3 = bz1Var;
                og0.r(new m14[]{du4.t(j, mt0.g), g75.g.g(k85Var2)}, bz1Var3, h02Var, 8 | (i3 & 112));
                h02Var.b(true);
                z = false;
                h02Var.b(false);
            } else {
                bz1Var3 = bz1Var;
                k85Var2 = k85Var;
                z = false;
                i2 = 8;
                h02Var.X(-1013852841);
                h02Var.b(false);
            }
            if (bz1Var2 != null) {
                h02Var.X(-1013804481);
                j73 j73VarX2 = ue5.X(g73Var, "dismissAction");
                t33 t33VarR3 = z50.r(k00Var, z);
                int iS4 = pw5.s(h02Var);
                tr3 tr3VarQ4 = h02Var.q();
                j73 j73VarW4 = m50.W(h02Var, j73VarX2);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(sx1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, t33VarR3);
                xs2.E(on0Var2, h02Var, tr3VarQ4);
                if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS4))) {
                    du4.f(iS4, h02Var, iS4, on0Var3);
                }
                xs2.E(on0Var4, h02Var, j73VarW4);
                j3 = j2;
                int i4 = i2 | ((i3 >> 3) & 112);
                bz1Var4 = bz1Var2;
                og0.y(du4.t(j3, mt0.g), bz1Var4, h02Var, i4);
                z2 = true;
                h02Var.b(true);
                h02Var.b(false);
            } else {
                bz1Var4 = bz1Var2;
                j3 = j2;
                z2 = true;
                h02Var.X(-1013535401);
                h02Var.b(z);
            }
            h02Var.b(z2);
        } else {
            bz1Var3 = bz1Var;
            bz1Var4 = bz1Var2;
            k85Var2 = k85Var;
            j3 = j2;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final long j4 = j3;
            final k85 k85Var3 = k85Var2;
            final bz1 bz1Var5 = bz1Var4;
            final bz1 bz1Var6 = bz1Var3;
            u34VarP.n = new bz1(bz1Var6, bz1Var5, k85Var3, j, j4, i) { // from class: hs4
                public final /* synthetic */ bz1 a;
                public final /* synthetic */ k85 m;
                public final /* synthetic */ long q;
                public final /* synthetic */ bz1 t;
                public final /* synthetic */ long w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1);
                    fg6.g(this.j, this.t, this.a, this.m, this.q, this.w, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final boolean n(Context context, xy1 xy1Var) throws Throwable {
        if (!wv1.g.get() && (!yf2.p(Build.MANUFACTURER, "vivo") || Build.VERSION.SDK_INT >= 35)) {
            return false;
        }
        co2 co2VarK = po2.k();
        xy1Var.a(co2VarK);
        po2 po2Var = (po2) co2VarK.y();
        kr5 kr5VarG = kr5.g(context);
        q70 q70Var = new q70(AsyncRequestWorker.class);
        HashMap map = new HashMap();
        try {
            int iG = po2Var.g(null);
            byte[] bArr = new byte[iG];
            Logger logger = yi0.y;
            vi0 vi0Var = new vi0(iG, bArr);
            po2Var.q(vi0Var);
            if (vi0Var.V() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            Byte[] bArr2 = new Byte[iG];
            for (int i = 0; i < iG; i++) {
                bArr2[i] = Byte.valueOf(bArr[i]);
            }
            map.put("request", bArr2);
            qz0 qz0Var = new qz0(map);
            qz0.y(qz0Var);
            ((sr5) q70Var.a).v = qz0Var;
            List listSingletonList = Collections.singletonList(q70Var.z());
            if (listSingletonList.isEmpty()) {
                l0.u("enqueue needs at least one WorkRequest.");
                return false;
            }
            new zq5(kr5VarG, listSingletonList).g();
            q70 q70Var2 = new q70(AsyncRequestWorker.class);
            q70Var2.A();
            du0 du0Var = new du0();
            vs0 vs0Var = new vs0();
            vs0Var.g = 1;
            vs0Var.x = -1L;
            vs0Var.l = -1L;
            new HashSet();
            vs0Var.y = true;
            vs0Var.r = false;
            vs0Var.g = 1;
            vs0Var.n = false;
            vs0Var.v = false;
            vs0Var.j = du0Var;
            vs0Var.x = -1L;
            vs0Var.l = -1L;
            ((sr5) q70Var2.a).a = vs0Var;
            new zq5(kr5VarG, "updateRequestWorkerKeepEnabled", 2, Collections.singletonList(q70Var2.z())).g();
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + po2.class.getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final void r(final wr4 wr4Var, j73 j73Var, cn4 cn4Var, long j, long j2, long j3, long j4, long j5, h02 h02Var, final int i) {
        int i2;
        final j73 j73Var2;
        final cn4 cn4Var2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long jV;
        long jV2;
        long jV3;
        long jV4;
        cn4 cn4Var3;
        j73 j73Var3;
        int i3;
        long j11;
        nm0 nm0VarM0;
        h02Var.Z(274621471);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(wr4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if (h02Var.N(i4 & 1, (38347923 & i4) != 38347922)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                cn4 cn4VarY = vn4.y(pe6.v, h02Var);
                jV = tj0.v(pe6.r, h02Var);
                jV2 = tj0.v(pe6.l, h02Var);
                sj0 sj0Var = pe6.g;
                long jV5 = tj0.v(sj0Var, h02Var);
                jV3 = tj0.v(sj0Var, h02Var);
                jV4 = tj0.v(pe6.x, h02Var);
                int i5 = i4 & (-268434433);
                cn4Var3 = cn4VarY;
                j73Var3 = g73.g;
                i3 = i5;
                j11 = jV5;
            } else {
                h02Var.Q();
                int i6 = i4 & (-268434433);
                cn4Var3 = cn4Var;
                jV = j;
                jV2 = j2;
                j11 = j3;
                jV3 = j4;
                jV4 = j5;
                i3 = i6;
                j73Var3 = j73Var;
            }
            h02Var.s();
            String str = ((bs4) wr4Var).g.y;
            int i7 = i3;
            if (str != null) {
                h02Var.X(-663815981);
                nm0VarM0 = ue5.m0(-1378313599, new ls4(j11, wr4Var, str), h02Var);
                h02Var.b(false);
            } else {
                h02Var.X(-663517017);
                h02Var.b(false);
                nm0VarM0 = null;
            }
            ((bs4) wr4Var).g.getClass();
            h02Var.X(-662974393);
            h02Var.b(false);
            int i8 = ((i7 << 3) & 7168) | 805306368;
            long j12 = j11;
            j9 = jV3;
            j10 = jV4;
            cn4 cn4Var4 = cn4Var3;
            y(ue5.e0(j73Var3, 12.0f), nm0VarM0, null, cn4Var4, jV, jV2, j9, j10, ue5.m0(-1266389126, new g11(wr4Var, (byte) 5), h02Var), h02Var, i8, 0);
            j73Var2 = j73Var3;
            cn4Var2 = cn4Var4;
            j6 = jV;
            j7 = jV2;
            j8 = j12;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            cn4Var2 = cn4Var;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: fs4
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i | 1);
                    fg6.r(wr4Var, j73Var2, cn4Var2, j6, j7, j8, j9, j10, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static boolean v(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0107  */
    /* JADX WARN: Code duplicated, block: B:104:0x0117  */
    /* JADX WARN: Code duplicated, block: B:105:0x0119  */
    /* JADX WARN: Code duplicated, block: B:108:0x0122  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:130:0x016a  */
    /* JADX WARN: Code duplicated, block: B:132:0x016d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0171  */
    /* JADX WARN: Code duplicated, block: B:138:0x0176  */
    /* JADX WARN: Code duplicated, block: B:139:0x0181  */
    /* JADX WARN: Code duplicated, block: B:142:0x0186  */
    /* JADX WARN: Code duplicated, block: B:143:0x018f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0195  */
    /* JADX WARN: Code duplicated, block: B:149:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:156:0x0209  */
    /* JADX WARN: Code duplicated, block: B:159:0x021a  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x0104  */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x016a, please report this as an issue */
    public static final void y(final j73 j73Var, bz1 bz1Var, bz1 bz1Var2, cn4 cn4Var, long j, long j2, long j3, long j4, final nm0 nm0Var, h02 h02Var, final int i, final int i2) {
        int i3;
        bz1 bz1Var3;
        int i4;
        bz1 bz1Var4;
        int i5;
        int i6;
        cn4 cn4Var2;
        long jV;
        long j5;
        long jV2;
        int i7;
        boolean z;
        final bz1 bz1Var5;
        final bz1 bz1Var6;
        final cn4 cn4Var3;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        u34 u34VarP;
        bz1 bz1Var7;
        cn4 cn4VarY;
        long jV3;
        long jV4;
        cn4 cn4Var4;
        int i8;
        int i9;
        int i10;
        h02Var.Z(-1218779924);
        if ((i & 6) == 0) {
            i3 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                bz1Var3 = bz1Var;
                i3 |= h02Var.j(bz1Var3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    bz1Var4 = bz1Var2;
                    if (h02Var.j(bz1Var4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    if (h02Var.l(false)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        cn4Var2 = cn4Var;
                        int i12 = h02Var.x(cn4Var2) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        cn4Var2 = cn4Var;
                    }
                    i3 |= i12;
                } else {
                    cn4Var2 = cn4Var;
                }
                if ((196608 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !h02Var.v(j)) ? 65536 : 131072;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jV = j2;
                        int i13 = h02Var.v(jV) ? 1048576 : 524288;
                        i3 |= i13;
                    } else {
                        jV = j2;
                    }
                    i3 |= i13;
                } else {
                    jV = j2;
                }
                if ((12582912 & i) == 0) {
                    j5 = j3;
                    if ((i2 & 128) == 0 || !h02Var.v(j5)) {
                        i10 = 4194304;
                    } else {
                        i10 = 8388608;
                    }
                    i3 |= i10;
                } else {
                    j5 = j3;
                }
                if ((100663296 & i) == 0) {
                    jV2 = j4;
                    if ((i2 & 256) == 0 || !h02Var.v(jV2)) {
                        i9 = 33554432;
                    } else {
                        i9 = 67108864;
                    }
                    i3 |= i9;
                } else {
                    jV2 = j4;
                }
                if ((i & 805306368) == 0) {
                    if (h02Var.j(nm0Var)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i3 |= i8;
                }
                i7 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i7 & 1, z)) {
                    h02Var.S();
                    if ((i & 1) != 0 || h02Var.k()) {
                        if (i11 != 0) {
                            bz1Var3 = null;
                        }
                        bz1Var7 = i4 == 0 ? bz1Var4 : null;
                        if ((i2 & 16) != 0) {
                            cn4VarY = vn4.y(pe6.v, h02Var);
                            i7 &= -57345;
                        } else {
                            cn4VarY = cn4Var2;
                        }
                        if ((i2 & 32) != 0) {
                            jV3 = tj0.v(pe6.r, h02Var);
                            i7 &= -458753;
                        } else {
                            jV3 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jV = tj0.v(pe6.l, h02Var);
                            i7 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jV4 = tj0.v(pe6.g, h02Var);
                            i7 &= -29360129;
                        } else {
                            jV4 = j5;
                        }
                        if ((i2 & 256) != 0) {
                            jV2 = tj0.v(pe6.x, h02Var);
                            i7 &= -234881025;
                        }
                        cn4Var4 = cn4VarY;
                    } else {
                        h02Var.Q();
                        int i14 = (i2 & 16) != 0 ? i7 & (-57345) : i7;
                        if ((i2 & 32) != 0) {
                            i14 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i14 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i14 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            i14 &= -234881025;
                        }
                        i7 = i14;
                        bz1Var7 = bz1Var4;
                        cn4Var4 = cn4Var2;
                        jV4 = j5;
                        jV3 = j;
                    }
                    h02Var.s();
                    bz1 bz1Var8 = bz1Var7;
                    bz1 bz1Var9 = bz1Var3;
                    long j10 = jV4;
                    long j11 = jV2;
                    int i15 = i7 >> 9;
                    int i16 = (i7 & 14) | 12779520 | (i15 & 112) | (i15 & 896) | (i15 & 7168);
                    long j12 = jV3;
                    long j13 = jV;
                    uz4.g(j73Var, cn4Var4, j12, j13, 0.0f, pe6.n, null, ue5.m0(-1343524879, new ks4(bz1Var9, nm0Var, bz1Var8, j10, j11), h02Var), h02Var, i16, 80);
                    j7 = j13;
                    j6 = j10;
                    j8 = j11;
                    cn4Var3 = cn4Var4;
                    j9 = j12;
                    bz1Var5 = bz1Var9;
                    bz1Var6 = bz1Var8;
                } else {
                    h02Var.Q();
                    bz1Var5 = bz1Var3;
                    bz1Var6 = bz1Var4;
                    cn4Var3 = cn4Var2;
                    j6 = j5;
                    j7 = jV;
                    j8 = jV2;
                    j9 = j;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: gs4
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iJ = aq2.J(i | 1);
                            fg6.y(j73Var, bz1Var5, bz1Var6, cn4Var3, j9, j7, j6, j8, nm0Var, (h02) obj, iJ, i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 384;
            bz1Var4 = bz1Var2;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (h02Var.l(false)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    cn4Var2 = cn4Var;
                    if (h02Var.x(cn4Var2)) {
                    }
                    i3 |= i12;
                } else {
                    cn4Var2 = cn4Var;
                }
                i3 |= i12;
            } else {
                cn4Var2 = cn4Var;
            }
            if ((196608 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !h02Var.v(j)) ? 65536 : 131072;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jV = j2;
                    if (h02Var.v(jV)) {
                    }
                    i3 |= i13;
                } else {
                    jV = j2;
                }
                i3 |= i13;
            } else {
                jV = j2;
            }
            if ((12582912 & i) == 0) {
                j5 = j3;
                if ((i2 & 128) == 0) {
                    i10 = 4194304;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            } else {
                j5 = j3;
            }
            if ((100663296 & i) == 0) {
                jV2 = j4;
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            } else {
                jV2 = j4;
            }
            if ((i & 805306368) == 0) {
                if (h02Var.j(nm0Var)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i3 |= i8;
            }
            i7 = i3;
            if ((i3 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i7 & 1, z)) {
                h02Var.S();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        bz1Var3 = null;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        cn4VarY = vn4.y(pe6.v, h02Var);
                        i7 &= -57345;
                    } else {
                        cn4VarY = cn4Var2;
                    }
                    if ((i2 & 32) != 0) {
                        jV3 = tj0.v(pe6.r, h02Var);
                        i7 &= -458753;
                    } else {
                        jV3 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jV = tj0.v(pe6.l, h02Var);
                        i7 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jV4 = tj0.v(pe6.g, h02Var);
                        i7 &= -29360129;
                    } else {
                        jV4 = j5;
                    }
                    if ((i2 & 256) != 0) {
                        jV2 = tj0.v(pe6.x, h02Var);
                        i7 &= -234881025;
                    }
                    cn4Var4 = cn4VarY;
                } else {
                    if (i11 != 0) {
                        bz1Var3 = null;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        cn4VarY = vn4.y(pe6.v, h02Var);
                        i7 &= -57345;
                    } else {
                        cn4VarY = cn4Var2;
                    }
                    if ((i2 & 32) != 0) {
                        jV3 = tj0.v(pe6.r, h02Var);
                        i7 &= -458753;
                    } else {
                        jV3 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jV = tj0.v(pe6.l, h02Var);
                        i7 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jV4 = tj0.v(pe6.g, h02Var);
                        i7 &= -29360129;
                    } else {
                        jV4 = j5;
                    }
                    if ((i2 & 256) != 0) {
                        jV2 = tj0.v(pe6.x, h02Var);
                        i7 &= -234881025;
                    }
                    cn4Var4 = cn4VarY;
                }
                h02Var.s();
                bz1 bz1Var10 = bz1Var7;
                bz1 bz1Var11 = bz1Var3;
                long j14 = jV4;
                long j15 = jV2;
                int i17 = i7 >> 9;
                int i18 = (i7 & 14) | 12779520 | (i17 & 112) | (i17 & 896) | (i17 & 7168);
                long j16 = jV3;
                long j17 = jV;
                uz4.g(j73Var, cn4Var4, j16, j17, 0.0f, pe6.n, null, ue5.m0(-1343524879, new ks4(bz1Var11, nm0Var, bz1Var10, j14, j15), h02Var), h02Var, i18, 80);
                j7 = j17;
                j6 = j14;
                j8 = j15;
                cn4Var3 = cn4Var4;
                j9 = j16;
                bz1Var5 = bz1Var11;
                bz1Var6 = bz1Var10;
            } else {
                h02Var.Q();
                bz1Var5 = bz1Var3;
                bz1Var6 = bz1Var4;
                cn4Var3 = cn4Var2;
                j6 = j5;
                j7 = jV;
                j8 = jV2;
                j9 = j;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: gs4
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(i | 1);
                        fg6.y(j73Var, bz1Var5, bz1Var6, cn4Var3, j9, j7, j6, j8, nm0Var, (h02) obj, iJ, i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 48;
        bz1Var3 = bz1Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                bz1Var4 = bz1Var2;
                if (h02Var.j(bz1Var4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (h02Var.l(false)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    cn4Var2 = cn4Var;
                    if (h02Var.x(cn4Var2)) {
                    }
                    i3 |= i12;
                } else {
                    cn4Var2 = cn4Var;
                }
                i3 |= i12;
            } else {
                cn4Var2 = cn4Var;
            }
            if ((196608 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !h02Var.v(j)) ? 65536 : 131072;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jV = j2;
                    if (h02Var.v(jV)) {
                    }
                    i3 |= i13;
                } else {
                    jV = j2;
                }
                i3 |= i13;
            } else {
                jV = j2;
            }
            if ((12582912 & i) == 0) {
                j5 = j3;
                if ((i2 & 128) == 0) {
                    i10 = 4194304;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            } else {
                j5 = j3;
            }
            if ((100663296 & i) == 0) {
                jV2 = j4;
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            } else {
                jV2 = j4;
            }
            if ((i & 805306368) == 0) {
                if (h02Var.j(nm0Var)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i3 |= i8;
            }
            i7 = i3;
            if ((i3 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i7 & 1, z)) {
                h02Var.S();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        bz1Var3 = null;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        cn4VarY = vn4.y(pe6.v, h02Var);
                        i7 &= -57345;
                    } else {
                        cn4VarY = cn4Var2;
                    }
                    if ((i2 & 32) != 0) {
                        jV3 = tj0.v(pe6.r, h02Var);
                        i7 &= -458753;
                    } else {
                        jV3 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jV = tj0.v(pe6.l, h02Var);
                        i7 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jV4 = tj0.v(pe6.g, h02Var);
                        i7 &= -29360129;
                    } else {
                        jV4 = j5;
                    }
                    if ((i2 & 256) != 0) {
                        jV2 = tj0.v(pe6.x, h02Var);
                        i7 &= -234881025;
                    }
                    cn4Var4 = cn4VarY;
                } else {
                    if (i11 != 0) {
                        bz1Var3 = null;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        cn4VarY = vn4.y(pe6.v, h02Var);
                        i7 &= -57345;
                    } else {
                        cn4VarY = cn4Var2;
                    }
                    if ((i2 & 32) != 0) {
                        jV3 = tj0.v(pe6.r, h02Var);
                        i7 &= -458753;
                    } else {
                        jV3 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jV = tj0.v(pe6.l, h02Var);
                        i7 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jV4 = tj0.v(pe6.g, h02Var);
                        i7 &= -29360129;
                    } else {
                        jV4 = j5;
                    }
                    if ((i2 & 256) != 0) {
                        jV2 = tj0.v(pe6.x, h02Var);
                        i7 &= -234881025;
                    }
                    cn4Var4 = cn4VarY;
                }
                h02Var.s();
                bz1 bz1Var12 = bz1Var7;
                bz1 bz1Var13 = bz1Var3;
                long j18 = jV4;
                long j19 = jV2;
                int i19 = i7 >> 9;
                int i110 = (i7 & 14) | 12779520 | (i19 & 112) | (i19 & 896) | (i19 & 7168);
                long j110 = jV3;
                long j111 = jV;
                uz4.g(j73Var, cn4Var4, j110, j111, 0.0f, pe6.n, null, ue5.m0(-1343524879, new ks4(bz1Var13, nm0Var, bz1Var12, j18, j19), h02Var), h02Var, i110, 80);
                j7 = j111;
                j6 = j18;
                j8 = j19;
                cn4Var3 = cn4Var4;
                j9 = j110;
                bz1Var5 = bz1Var13;
                bz1Var6 = bz1Var12;
            } else {
                h02Var.Q();
                bz1Var5 = bz1Var3;
                bz1Var6 = bz1Var4;
                cn4Var3 = cn4Var2;
                j6 = j5;
                j7 = jV;
                j8 = jV2;
                j9 = j;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: gs4
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(i | 1);
                        fg6.y(j73Var, bz1Var5, bz1Var6, cn4Var3, j9, j7, j6, j8, nm0Var, (h02) obj, iJ, i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 384;
        bz1Var4 = bz1Var2;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (h02Var.l(false)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                cn4Var2 = cn4Var;
                if (h02Var.x(cn4Var2)) {
                }
                i3 |= i12;
            } else {
                cn4Var2 = cn4Var;
            }
            i3 |= i12;
        } else {
            cn4Var2 = cn4Var;
        }
        if ((196608 & i) != 0) {
            i3 |= ((i2 & 32) == 0 || !h02Var.v(j)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                jV = j2;
                if (h02Var.v(jV)) {
                }
                i3 |= i13;
            } else {
                jV = j2;
            }
            i3 |= i13;
        } else {
            jV = j2;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            if ((i2 & 128) == 0) {
                i10 = 4194304;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            jV2 = j4;
            if ((i2 & 256) == 0) {
                i9 = 33554432;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        } else {
            jV2 = j4;
        }
        if ((i & 805306368) == 0) {
            if (h02Var.j(nm0Var)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i3 |= i8;
        }
        i7 = i3;
        if ((i3 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i7 & 1, z)) {
            h02Var.S();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    bz1Var3 = null;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    cn4VarY = vn4.y(pe6.v, h02Var);
                    i7 &= -57345;
                } else {
                    cn4VarY = cn4Var2;
                }
                if ((i2 & 32) != 0) {
                    jV3 = tj0.v(pe6.r, h02Var);
                    i7 &= -458753;
                } else {
                    jV3 = j;
                }
                if ((i2 & 64) != 0) {
                    jV = tj0.v(pe6.l, h02Var);
                    i7 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    jV4 = tj0.v(pe6.g, h02Var);
                    i7 &= -29360129;
                } else {
                    jV4 = j5;
                }
                if ((i2 & 256) != 0) {
                    jV2 = tj0.v(pe6.x, h02Var);
                    i7 &= -234881025;
                }
                cn4Var4 = cn4VarY;
            } else {
                if (i11 != 0) {
                    bz1Var3 = null;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    cn4VarY = vn4.y(pe6.v, h02Var);
                    i7 &= -57345;
                } else {
                    cn4VarY = cn4Var2;
                }
                if ((i2 & 32) != 0) {
                    jV3 = tj0.v(pe6.r, h02Var);
                    i7 &= -458753;
                } else {
                    jV3 = j;
                }
                if ((i2 & 64) != 0) {
                    jV = tj0.v(pe6.l, h02Var);
                    i7 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    jV4 = tj0.v(pe6.g, h02Var);
                    i7 &= -29360129;
                } else {
                    jV4 = j5;
                }
                if ((i2 & 256) != 0) {
                    jV2 = tj0.v(pe6.x, h02Var);
                    i7 &= -234881025;
                }
                cn4Var4 = cn4VarY;
            }
            h02Var.s();
            bz1 bz1Var14 = bz1Var7;
            bz1 bz1Var15 = bz1Var3;
            long j112 = jV4;
            long j113 = jV2;
            int i111 = i7 >> 9;
            int i112 = (i7 & 14) | 12779520 | (i111 & 112) | (i111 & 896) | (i111 & 7168);
            long j114 = jV3;
            long j115 = jV;
            uz4.g(j73Var, cn4Var4, j114, j115, 0.0f, pe6.n, null, ue5.m0(-1343524879, new ks4(bz1Var15, nm0Var, bz1Var14, j112, j113), h02Var), h02Var, i112, 80);
            j7 = j115;
            j6 = j112;
            j8 = j113;
            cn4Var3 = cn4Var4;
            j9 = j114;
            bz1Var5 = bz1Var15;
            bz1Var6 = bz1Var14;
        } else {
            h02Var.Q();
            bz1Var5 = bz1Var3;
            bz1Var6 = bz1Var4;
            cn4Var3 = cn4Var2;
            j6 = j5;
            j7 = jV;
            j8 = jV2;
            j9 = j;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: gs4
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i | 1);
                    fg6.y(j73Var, bz1Var5, bz1Var6, cn4Var3, j9, j7, j6, j8, nm0Var, (h02) obj, iJ, i2);
                    return og5.g;
                }
            };
        }
    }
}
