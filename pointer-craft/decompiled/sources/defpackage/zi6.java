package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zi6 {
    public static zh6 g;

    public static synchronized void a() {
        ti6 ti6Var = new ti6();
        synchronized (zi6.class) {
            try {
                zh6 zh6Var = g;
                if (zh6Var == null) {
                    zh6Var = new zh6((byte) 1);
                    g = zh6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:190:0x029c  */
    /* JADX WARN: Code duplicated, block: B:192:0x029f  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:196:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:198:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:200:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:203:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:205:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:209:0x0302  */
    /* JADX WARN: Code duplicated, block: B:211:0x0306 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x0309  */
    /* JADX WARN: Code duplicated, block: B:216:0x0327  */
    /* JADX WARN: Code duplicated, block: B:218:0x032a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0331  */
    /* JADX WARN: Code duplicated, block: B:224:0x0335 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x0338  */
    /* JADX WARN: Code duplicated, block: B:229:0x0354  */
    /* JADX WARN: Code duplicated, block: B:238:0x0383  */
    /* JADX WARN: Code duplicated, block: B:240:0x0386  */
    /* JADX WARN: Code duplicated, block: B:242:0x0389  */
    /* JADX WARN: Code duplicated, block: B:244:0x038d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0391 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:247:0x0393  */
    /* JADX WARN: Code duplicated, block: B:250:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:252:0x03af  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:258:0x03ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:264:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:268:0x040e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0435  */
    /* JADX WARN: Code duplicated, block: B:273:0x043a  */
    /* JADX WARN: Code duplicated, block: B:276:0x045b  */
    /* JADX WARN: Code duplicated, block: B:278:0x045f  */
    /* JADX WARN: Code duplicated, block: B:282:0x049f  */
    /* JADX WARN: Code duplicated, block: B:285:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:288:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:289:0x0507  */
    /* JADX WARN: Code duplicated, block: B:291:0x052f  */
    /* JADX WARN: Code duplicated, block: B:292:0x0532 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x0534  */
    /* JADX WARN: Code duplicated, block: B:294:0x0537 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:295:0x0539  */
    /* JADX WARN: Code duplicated, block: B:296:0x053c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0544  */
    /* JADX WARN: Code duplicated, block: B:307:0x0589  */
    /* JADX WARN: Code duplicated, block: B:310:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:313:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:314:0x05c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:315:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:316:0x05cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:318:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:320:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:321:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:323:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:324:0x05ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:325:0x0601  */
    /* JADX WARN: Code duplicated, block: B:326:0x0604 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:327:0x0606  */
    /* JADX WARN: Code duplicated, block: B:328:0x0609  */
    /* JADX WARN: Code duplicated, block: B:330:0x060d  */
    /* JADX WARN: Code duplicated, block: B:331:0x061a  */
    /* JADX WARN: Code duplicated, block: B:334:0x0648  */
    /* JADX WARN: Code duplicated, block: B:336:0x064b  */
    /* JADX WARN: Code duplicated, block: B:338:0x0657  */
    /* JADX WARN: Code duplicated, block: B:341:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:342:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:346:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:348:0x0700  */
    /* JADX WARN: Code duplicated, block: B:350:0x070e  */
    public static final void g(final j65 j65Var, final CharSequence charSequence, final bz1 bz1Var, final j55 j55Var, final cz1 cz1Var, final bz1 bz1Var2, final bz1 bz1Var3, final bz1 bz1Var4, final boolean z, final boolean z2, final boolean z3, final ve2 ve2Var, final zn3 zn3Var, final t45 t45Var, final bz1 bz1Var5, h02 h02Var, final int i, final int i2) {
        int i3;
        int i4;
        hd2 hd2Var;
        long j;
        k85 k85Var;
        float f;
        int iOrdinal;
        float f2;
        hc5 hc5VarP;
        zu4 zu4VarF;
        zu4 zu4VarF2;
        int iOrdinal2;
        float f3;
        int iOrdinal3;
        float f4;
        fc5 fc5VarX;
        zu4 zu4Var;
        hc5 hc5VarP2;
        int iOrdinal4;
        float f5;
        int iOrdinal5;
        hc5 hc5VarP3;
        hd2 hd2Var2;
        int[] iArr;
        long j2;
        uj0 uj0VarV;
        boolean zX;
        Object objK;
        byte b;
        l76 l76Var;
        hd2 hd2Var3;
        long j3;
        hd2 hd2Var4;
        long j4;
        byte b2;
        hc5 hc5VarP4;
        uj0 uj0VarV2;
        boolean zX2;
        Object objK2;
        hc5 hc5VarP5;
        Object objK3;
        a55 a55Var;
        nm0 nm0Var;
        long j5;
        Object objK4;
        h02 h02Var2;
        nm0 nm0Var2;
        Object objK5;
        long j6;
        nm0 nm0Var3;
        long j7;
        boolean z4;
        nm0 nm0Var4;
        int iOrdinal6;
        Object objK6;
        ob3 ob3Var;
        boolean z5;
        boolean z6;
        boolean zX3;
        Object objK7;
        h02 h02Var3 = h02Var;
        h02Var3.Z(546805032);
        if ((i & 6) == 0) {
            i3 = (h02Var3.n(j65Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= h02Var3.j(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= h02Var3.j(bz1Var) ? 256 : 128;
        }
        int i5 = i3;
        if ((i & 3072) == 0) {
            i5 |= h02Var3.x(j55Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= h02Var3.j(cz1Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i5 |= h02Var3.j(bz1Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= h02Var3.j(bz1Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= h02Var3.j(bz1Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= h02Var3.j(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= h02Var3.j(null) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if ((i2 & 6) == 0) {
            i4 = i2 | (h02Var3.j(null) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var3.l(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= h02Var3.l(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= h02Var3.l(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= h02Var3.x(ve2Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= h02Var3.x(zn3Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= h02Var3.x(t45Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= h02Var3.j(bz1Var5) ? 8388608 : 4194304;
        }
        int i7 = i4;
        if (h02Var3.N(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) xf6.g(ve2Var, h02Var3, (i7 >> 12) & 14).getValue()).booleanValue();
            hd2 hd2Var5 = hd2.a;
            hd2 hd2Var6 = hd2.t;
            hd2 hd2Var7 = hd2.j;
            if (zBooleanValue) {
                hd2Var = hd2Var7;
            } else {
                hd2Var = charSequence.length() == 0 ? hd2Var6 : hd2Var5;
            }
            if (!z2) {
                j = t45Var.e;
            } else if (z3) {
                j = t45Var.A;
            } else {
                j = zBooleanValue ? t45Var.k : t45Var.d;
            }
            mf5 mf5Var = (mf5) h02Var3.a(of5.g);
            k85 k85Var2 = mf5Var.a;
            k85 k85Var3 = mf5Var.q;
            k85 k85Var4 = k85Var2;
            long jY = k85Var4.y();
            long j8 = jj0.j;
            boolean z7 = (tf5.g(jY, j8) && !tf5.g(k85Var3.y(), j8)) || (!tf5.g(k85Var4.y(), j8) && tf5.g(k85Var3.y(), j8));
            long jY2 = k85Var3.y();
            long j9 = (z7 && jY2 == 16) ? j : jY2;
            long jY3 = k85Var4.y();
            long j10 = (z7 && jY3 == 16) ? j : jY3;
            boolean z8 = cz1Var != null;
            nc5 nc5VarV = ra.V(hd2Var, "TextFieldInputState", h02Var3, 48, 0);
            g90 g90Var = nc5VarV.g;
            tp3 tp3Var = nc5VarV.n;
            zu4 zu4VarF3 = jr2.F(f83.t, h02Var3);
            te5 te5Var = m50.w;
            hd2 hd2Var8 = (hd2) g90Var.n();
            h02Var3.X(-1436405362);
            int iOrdinal7 = hd2Var8.ordinal();
            float f6 = 0.0f;
            if (iOrdinal7 != 0) {
                k85Var = k85Var3;
                if (iOrdinal7 == 1) {
                    if (z8) {
                        f = 0.0f;
                    }
                    h02Var3.b(false);
                    Float fValueOf = Float.valueOf(f);
                    hd2 hd2Var9 = (hd2) tp3Var.getValue();
                    h02Var3.X(-1436405362);
                    iOrdinal = hd2Var9.ordinal();
                    if (iOrdinal == 0) {
                        f2 = 1.0f;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                up.y();
                                return;
                            }
                        } else if (z8) {
                            f2 = 0.0f;
                        }
                        f2 = 1.0f;
                    }
                    h02Var3.b(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    nc5VarV.x();
                    h02Var3.X(-709912974);
                    h02Var3.b(false);
                    hc5VarP = ra.p(nc5VarV, fValueOf, fValueOf2, zu4VarF3, te5Var, h02Var3, 196608);
                    f83 f83Var = f83.m;
                    zu4VarF = jr2.F(f83Var, h02Var3);
                    zu4VarF2 = jr2.F(f83.q, h02Var3);
                    hd2 hd2Var10 = (hd2) g90Var.n();
                    h02Var3.X(-1093194547);
                    iOrdinal2 = hd2Var10.ordinal();
                    if (iOrdinal2 == 0) {
                        f3 = 1.0f;
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                up.y();
                                return;
                            }
                        } else if (z8) {
                            f3 = 1.0f;
                        }
                        f3 = 0.0f;
                    }
                    h02Var3.b(false);
                    Float fValueOf3 = Float.valueOf(f3);
                    hd2 hd2Var11 = (hd2) tp3Var.getValue();
                    h02Var3.X(-1093194547);
                    iOrdinal3 = hd2Var11.ordinal();
                    if (iOrdinal3 == 0) {
                        f4 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                up.y();
                                return;
                            }
                        } else if (z8) {
                            f4 = 1.0f;
                        }
                        f4 = 0.0f;
                    }
                    h02Var3.b(false);
                    Float fValueOf4 = Float.valueOf(f4);
                    fc5VarX = nc5VarV.x();
                    h02Var3.X(-984009111);
                    if (fc5VarX.y(hd2Var7, hd2Var6) && (fc5VarX.y(hd2Var6, hd2Var7) || fc5VarX.y(hd2Var5, hd2Var6))) {
                        zu4Var = zu4VarF2;
                    } else {
                        zu4Var = zu4VarF;
                    }
                    h02Var3.b(false);
                    hc5VarP2 = ra.p(nc5VarV, fValueOf3, fValueOf4, zu4Var, te5Var, h02Var3, 196608);
                    hd2 hd2Var12 = (hd2) g90Var.n();
                    h02Var3.X(-1258455321);
                    iOrdinal4 = hd2Var12.ordinal();
                    if (iOrdinal4 == 0) {
                        f5 = 1.0f;
                    } else {
                        if (iOrdinal4 != 1) {
                            if (iOrdinal4 != 2) {
                                up.y();
                                return;
                            }
                        } else if (z8) {
                            f5 = 0.0f;
                        }
                        f5 = 1.0f;
                    }
                    h02Var3.b(false);
                    Float fValueOf5 = Float.valueOf(f5);
                    hd2 hd2Var13 = (hd2) tp3Var.getValue();
                    h02Var3.X(-1258455321);
                    iOrdinal5 = hd2Var13.ordinal();
                    if (iOrdinal5 == 0) {
                        f6 = 1.0f;
                    } else {
                        if (iOrdinal5 != 1) {
                            if (iOrdinal5 != 2) {
                                up.y();
                                return;
                            }
                        } else if (!z8) {
                        }
                        f6 = 1.0f;
                    }
                    h02Var3.b(false);
                    Float fValueOf6 = Float.valueOf(f6);
                    nc5VarV.x();
                    h02Var3.X(2126293195);
                    h02Var3.b(false);
                    hc5VarP3 = ra.p(nc5VarV, fValueOf5, fValueOf6, zu4VarF, te5Var, h02Var3, 196608);
                    zu4 zu4VarF4 = jr2.F(f83Var, h02Var3);
                    hd2Var2 = (hd2) tp3Var.getValue();
                    h02Var3.X(-12973394);
                    iArr = b55.g;
                    if (iArr[hd2Var2.ordinal()] == 1) {
                        j2 = j9;
                    } else {
                        j2 = j10;
                    }
                    h02Var3.b(false);
                    uj0VarV = jj0.v(j2);
                    zX = h02Var3.x(uj0VarV);
                    objK = h02Var3.K();
                    b = 3;
                    l76Var = oo0.g;
                    if (zX || objK == l76Var) {
                        te5 te5Var2 = new te5(vg.b, new zg(uj0VarV, b));
                        h02Var3.i0(te5Var2);
                        objK = te5Var2;
                    }
                    te5 te5Var3 = (te5) objK;
                    hd2Var3 = (hd2) g90Var.n();
                    h02Var3.X(-12973394);
                    if (iArr[hd2Var3.ordinal()] == 1) {
                        j3 = j9;
                    } else {
                        j3 = j10;
                    }
                    h02Var3.b(false);
                    jj0 jj0Var = new jj0(j3);
                    hd2Var4 = (hd2) tp3Var.getValue();
                    h02Var3.X(-12973394);
                    if (iArr[hd2Var4.ordinal()] == 1) {
                        j4 = j9;
                    } else {
                        j4 = j10;
                    }
                    h02Var3.b(false);
                    jj0 jj0Var2 = new jj0(j4);
                    nc5VarV.x();
                    h02Var3.X(1954111929);
                    h02Var3.b(false);
                    b2 = 3;
                    hc5VarP4 = ra.p(nc5VarV, jj0Var, jj0Var2, zu4VarF4, te5Var3, h02Var3, 196608);
                    h02Var3.X(-464752477);
                    h02Var3.b(false);
                    uj0VarV2 = jj0.v(j);
                    zX2 = h02Var3.x(uj0VarV2);
                    objK2 = h02Var3.K();
                    if (zX2 || objK2 == l76Var) {
                        te5 te5Var4 = new te5(vg.b, new zg(uj0VarV2, b2));
                        h02Var3.i0(te5Var4);
                        objK2 = te5Var4;
                    }
                    h02Var3.X(-464752477);
                    h02Var3.b(false);
                    jj0 jj0Var3 = new jj0(j);
                    h02Var3.X(-464752477);
                    h02Var3.b(false);
                    jj0 jj0Var4 = new jj0(j);
                    nc5VarV.x();
                    h02Var3.X(1190923886);
                    h02Var3.b(false);
                    hc5VarP5 = ra.p(nc5VarV, jj0Var3, jj0Var4, zu4VarF4, (te5) objK2, h02Var3, 196608);
                    objK3 = h02Var3.K();
                    if (objK3 == l76Var) {
                        objK3 = new a55();
                        h02Var3.i0(objK3);
                    }
                    a55Var = (a55) objK3;
                    if (cz1Var == null) {
                        h02Var3.X(-1891724857);
                        h02Var3.b(false);
                        nm0Var = null;
                    } else {
                        h02Var3.X(-1891724856);
                        nm0 nm0VarM0 = ue5.m0(-1076580032, new z63(k85Var4, k85Var, hc5VarP, hc5VarP5, z7, hc5VarP4, cz1Var, a55Var), h02Var3);
                        h02Var3.b(false);
                        nm0Var = nm0VarM0;
                    }
                    if (!z2) {
                        k85Var4 = k85Var4;
                        j5 = t45Var.D;
                    } else if (z3) {
                        j5 = t45Var.E;
                    } else if (zBooleanValue) {
                        j5 = t45Var.B;
                    } else {
                        j5 = t45Var.C;
                    }
                    objK4 = h02Var3.K();
                    if (objK4 == l76Var) {
                        objK4 = pt4.r(new zs(hc5VarP2, (byte) 5));
                        h02Var3.i0(objK4);
                    }
                    bw4 bw4Var = (bw4) objK4;
                    if (bz1Var2 == null && charSequence.length() == 0 && ((Boolean) bw4Var.getValue()).booleanValue()) {
                        h02Var3.X(-1890614312);
                        h02Var2 = h02Var;
                        nm0 nm0VarM1 = ue5.m0(1405547205, new z45(hc5VarP2, j5, k85Var4, bz1Var2), h02Var2);
                        h02Var2.b(false);
                        nm0Var2 = nm0VarM1;
                    } else {
                        h02Var2 = h02Var3;
                        h02Var2.X(-1890217110);
                        h02Var2.b(false);
                        nm0Var2 = null;
                    }
                    objK5 = h02Var2.K();
                    if (objK5 == l76Var) {
                        objK5 = pt4.r(new zs(hc5VarP3, (byte) 6));
                        h02Var2.i0(objK5);
                    }
                    h02Var2.X(-1889500886);
                    h02Var2.b(false);
                    h02Var2.X(-1888924534);
                    h02Var2.b(false);
                    if (!z2) {
                        j6 = t45Var.p;
                    } else if (z3) {
                        j6 = r4.u;
                    } else if (zBooleanValue) {
                        j6 = r4.b;
                    } else {
                        j6 = r4.s;
                    }
                    if (bz1Var3 == null) {
                        h02Var2.X(-1888749663);
                        h02Var2.b(false);
                        nm0Var3 = null;
                    } else {
                        h02Var2.X(-1888749662);
                        nm0 nm0VarM2 = ue5.m0(-1736293487, new ef0(j6, bz1Var3, (byte) 1), h02Var2);
                        h02Var2.b(false);
                        nm0Var3 = nm0VarM2;
                    }
                    if (!z2) {
                        j7 = r4.o;
                    } else if (z3) {
                        j7 = r4.f;
                    } else if (zBooleanValue) {
                        j7 = r4.z;
                    } else {
                        j7 = r4.h;
                    }
                    if (bz1Var4 == 0) {
                        h02Var2.X(-1888469888);
                        z4 = false;
                        h02Var2.b(false);
                        nm0Var4 = null;
                    } else {
                        z4 = false;
                        h02Var2.X(-1888469887);
                        nm0 nm0VarM3 = ue5.m0(1334518521, new ef0(j7, bz1Var4, (byte) 2), h02Var2);
                        h02Var2.b(false);
                        nm0Var4 = nm0VarM3;
                    }
                    h02Var2.X(-1888176380);
                    h02Var2.b(z4);
                    iOrdinal6 = j65Var.ordinal();
                    if (iOrdinal6 != 0) {
                        h02Var2.X(-1887830698);
                        oy0.r(bz1Var, nm0Var, nm0Var2, nm0Var3, nm0Var4, null, null, z, j55Var, new c55(new xx2(hc5VarP, bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 4)), ue5.m0(-1729858187, new j6(bz1Var5, (byte) 7), h02Var2), null, zn3Var, h02Var, ((i6 >> 3) & 112) | 6 | ((i7 << 21) & 234881024) | ((i6 << 18) & 1879048192), ((i7 >> 6) & 7168) | 48);
                        h02Var3 = h02Var;
                        h02Var3.b(false);
                    } else {
                        if (iOrdinal6 == 1) {
                            h02Var2.X(493292232);
                            h02Var2.b(z4);
                            up.y();
                            return;
                        }
                        h02Var2.X(-1886778186);
                        objK6 = h02Var2.K();
                        if (objK6 == l76Var) {
                            objK6 = kq2.M(new cq4(0L));
                            h02Var2.i0(objK6);
                        }
                        ob3Var = (ob3) objK6;
                        z5 = z4;
                        nm0 nm0VarM4 = ue5.m0(528115858, new hm4(ob3Var, j55Var, zn3Var, bz1Var5, (byte) 1), h02Var2);
                        nm0 nm0Var5 = nm0Var;
                        c55 c55Var = new c55(new xx2(hc5VarP, bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 5));
                        if ((i6 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        zX3 = z6 | h02Var2.x(hc5VarP);
                        objK7 = h02Var2.K();
                        if (zX3 || objK7 == l76Var) {
                            objK7 = new kn2(j55Var, hc5VarP, ob3Var, (byte) 18);
                            h02Var2.i0(objK7);
                        }
                        h02 h02Var4 = h02Var2;
                        ec6.y(bz1Var, nm0Var2, nm0Var5, nm0Var3, nm0Var4, null, null, z, j55Var, c55Var, (xy1) objK7, nm0VarM4, null, zn3Var, h02Var4, ((i6 >> 3) & 112) | 6 | ((i7 << 21) & 234881024) | ((i6 << 18) & 1879048192), (57344 & (i7 >> 3)) | 384);
                        h02Var3 = h02Var4;
                        h02Var3.b(false);
                    }
                } else if (iOrdinal7 != 2) {
                    up.y();
                    return;
                }
            } else {
                k85Var = k85Var3;
            }
            f = 1.0f;
            h02Var3.b(false);
            Float fValueOf7 = Float.valueOf(f);
            hd2 hd2Var14 = (hd2) tp3Var.getValue();
            h02Var3.X(-1436405362);
            iOrdinal = hd2Var14.ordinal();
            if (iOrdinal == 0) {
                f2 = 1.0f;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        up.y();
                        return;
                    }
                } else if (z8) {
                    f2 = 0.0f;
                }
                f2 = 1.0f;
            }
            h02Var3.b(false);
            Float fValueOf8 = Float.valueOf(f2);
            nc5VarV.x();
            h02Var3.X(-709912974);
            h02Var3.b(false);
            hc5VarP = ra.p(nc5VarV, fValueOf7, fValueOf8, zu4VarF3, te5Var, h02Var3, 196608);
            f83 f83Var2 = f83.m;
            zu4VarF = jr2.F(f83Var2, h02Var3);
            zu4VarF2 = jr2.F(f83.q, h02Var3);
            hd2 hd2Var15 = (hd2) g90Var.n();
            h02Var3.X(-1093194547);
            iOrdinal2 = hd2Var15.ordinal();
            if (iOrdinal2 == 0) {
                f3 = 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        up.y();
                        return;
                    }
                } else if (z8) {
                    f3 = 1.0f;
                }
                f3 = 0.0f;
            }
            h02Var3.b(false);
            Float fValueOf9 = Float.valueOf(f3);
            hd2 hd2Var16 = (hd2) tp3Var.getValue();
            h02Var3.X(-1093194547);
            iOrdinal3 = hd2Var16.ordinal();
            if (iOrdinal3 == 0) {
                f4 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        up.y();
                        return;
                    }
                } else if (z8) {
                    f4 = 1.0f;
                }
                f4 = 0.0f;
            }
            h02Var3.b(false);
            Float fValueOf10 = Float.valueOf(f4);
            fc5VarX = nc5VarV.x();
            h02Var3.X(-984009111);
            if (fc5VarX.y(hd2Var7, hd2Var6)) {
                zu4Var = zu4VarF;
            } else {
                zu4Var = zu4VarF2;
            }
            h02Var3.b(false);
            hc5VarP2 = ra.p(nc5VarV, fValueOf9, fValueOf10, zu4Var, te5Var, h02Var3, 196608);
            hd2 hd2Var17 = (hd2) g90Var.n();
            h02Var3.X(-1258455321);
            iOrdinal4 = hd2Var17.ordinal();
            if (iOrdinal4 == 0) {
                f5 = 1.0f;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        up.y();
                        return;
                    }
                } else if (z8) {
                    f5 = 0.0f;
                }
                f5 = 1.0f;
            }
            h02Var3.b(false);
            Float fValueOf11 = Float.valueOf(f5);
            hd2 hd2Var18 = (hd2) tp3Var.getValue();
            h02Var3.X(-1258455321);
            iOrdinal5 = hd2Var18.ordinal();
            if (iOrdinal5 == 0) {
                f6 = 1.0f;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        up.y();
                        return;
                    }
                } else if (!z8) {
                }
                f6 = 1.0f;
            }
            h02Var3.b(false);
            Float fValueOf12 = Float.valueOf(f6);
            nc5VarV.x();
            h02Var3.X(2126293195);
            h02Var3.b(false);
            hc5VarP3 = ra.p(nc5VarV, fValueOf11, fValueOf12, zu4VarF, te5Var, h02Var3, 196608);
            zu4 zu4VarF5 = jr2.F(f83Var2, h02Var3);
            hd2Var2 = (hd2) tp3Var.getValue();
            h02Var3.X(-12973394);
            iArr = b55.g;
            if (iArr[hd2Var2.ordinal()] == 1) {
                j2 = j9;
            } else {
                j2 = j10;
            }
            h02Var3.b(false);
            uj0VarV = jj0.v(j2);
            zX = h02Var3.x(uj0VarV);
            objK = h02Var3.K();
            b = 3;
            l76Var = oo0.g;
            if (zX) {
                te5 te5Var5 = new te5(vg.b, new zg(uj0VarV, b));
                h02Var3.i0(te5Var5);
                objK = te5Var5;
            } else {
                te5 te5Var6 = new te5(vg.b, new zg(uj0VarV, b));
                h02Var3.i0(te5Var6);
                objK = te5Var6;
            }
            te5 te5Var7 = (te5) objK;
            hd2Var3 = (hd2) g90Var.n();
            h02Var3.X(-12973394);
            if (iArr[hd2Var3.ordinal()] == 1) {
                j3 = j9;
            } else {
                j3 = j10;
            }
            h02Var3.b(false);
            jj0 jj0Var5 = new jj0(j3);
            hd2Var4 = (hd2) tp3Var.getValue();
            h02Var3.X(-12973394);
            if (iArr[hd2Var4.ordinal()] == 1) {
                j4 = j9;
            } else {
                j4 = j10;
            }
            h02Var3.b(false);
            jj0 jj0Var6 = new jj0(j4);
            nc5VarV.x();
            h02Var3.X(1954111929);
            h02Var3.b(false);
            b2 = 3;
            hc5VarP4 = ra.p(nc5VarV, jj0Var5, jj0Var6, zu4VarF5, te5Var7, h02Var3, 196608);
            h02Var3.X(-464752477);
            h02Var3.b(false);
            uj0VarV2 = jj0.v(j);
            zX2 = h02Var3.x(uj0VarV2);
            objK2 = h02Var3.K();
            if (zX2) {
                te5 te5Var8 = new te5(vg.b, new zg(uj0VarV2, b2));
                h02Var3.i0(te5Var8);
                objK2 = te5Var8;
            } else {
                te5 te5Var9 = new te5(vg.b, new zg(uj0VarV2, b2));
                h02Var3.i0(te5Var9);
                objK2 = te5Var9;
            }
            h02Var3.X(-464752477);
            h02Var3.b(false);
            jj0 jj0Var7 = new jj0(j);
            h02Var3.X(-464752477);
            h02Var3.b(false);
            jj0 jj0Var8 = new jj0(j);
            nc5VarV.x();
            h02Var3.X(1190923886);
            h02Var3.b(false);
            hc5VarP5 = ra.p(nc5VarV, jj0Var7, jj0Var8, zu4VarF5, (te5) objK2, h02Var3, 196608);
            objK3 = h02Var3.K();
            if (objK3 == l76Var) {
                objK3 = new a55();
                h02Var3.i0(objK3);
            }
            a55Var = (a55) objK3;
            if (cz1Var == null) {
                h02Var3.X(-1891724857);
                h02Var3.b(false);
                nm0Var = null;
            } else {
                h02Var3.X(-1891724856);
                nm0 nm0VarM5 = ue5.m0(-1076580032, new z63(k85Var4, k85Var, hc5VarP, hc5VarP5, z7, hc5VarP4, cz1Var, a55Var), h02Var3);
                h02Var3.b(false);
                nm0Var = nm0VarM5;
            }
            if (!z2) {
                k85Var4 = k85Var4;
                j5 = t45Var.D;
            } else if (z3) {
                j5 = t45Var.E;
            } else if (zBooleanValue) {
                j5 = t45Var.B;
            } else {
                j5 = t45Var.C;
            }
            objK4 = h02Var3.K();
            if (objK4 == l76Var) {
                objK4 = pt4.r(new zs(hc5VarP2, (byte) 5));
                h02Var3.i0(objK4);
            }
            bw4 bw4Var2 = (bw4) objK4;
            if (bz1Var2 == null) {
                h02Var2 = h02Var3;
                h02Var2.X(-1890217110);
                h02Var2.b(false);
                nm0Var2 = null;
            } else {
                h02Var2 = h02Var3;
                h02Var2.X(-1890217110);
                h02Var2.b(false);
                nm0Var2 = null;
            }
            objK5 = h02Var2.K();
            if (objK5 == l76Var) {
                objK5 = pt4.r(new zs(hc5VarP3, (byte) 6));
                h02Var2.i0(objK5);
            }
            h02Var2.X(-1889500886);
            h02Var2.b(false);
            h02Var2.X(-1888924534);
            h02Var2.b(false);
            if (!z2) {
                j6 = t45Var.p;
            } else if (z3) {
                j6 = r4.u;
            } else if (zBooleanValue) {
                j6 = r4.b;
            } else {
                j6 = r4.s;
            }
            if (bz1Var3 == null) {
                h02Var2.X(-1888749663);
                h02Var2.b(false);
                nm0Var3 = null;
            } else {
                h02Var2.X(-1888749662);
                nm0 nm0VarM6 = ue5.m0(-1736293487, new ef0(j6, bz1Var3, (byte) 1), h02Var2);
                h02Var2.b(false);
                nm0Var3 = nm0VarM6;
            }
            if (!z2) {
                j7 = r4.o;
            } else if (z3) {
                j7 = r4.f;
            } else if (zBooleanValue) {
                j7 = r4.z;
            } else {
                j7 = r4.h;
            }
            if (bz1Var4 == 0) {
                h02Var2.X(-1888469888);
                z4 = false;
                h02Var2.b(false);
                nm0Var4 = null;
            } else {
                z4 = false;
                h02Var2.X(-1888469887);
                nm0 nm0VarM7 = ue5.m0(1334518521, new ef0(j7, bz1Var4, (byte) 2), h02Var2);
                h02Var2.b(false);
                nm0Var4 = nm0VarM7;
            }
            h02Var2.X(-1888176380);
            h02Var2.b(z4);
            iOrdinal6 = j65Var.ordinal();
            if (iOrdinal6 != 0) {
                h02Var2.X(-1887830698);
                oy0.r(bz1Var, nm0Var, nm0Var2, nm0Var3, nm0Var4, null, null, z, j55Var, new c55(new xx2(hc5VarP, bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 4)), ue5.m0(-1729858187, new j6(bz1Var5, (byte) 7), h02Var2), null, zn3Var, h02Var, ((i6 >> 3) & 112) | 6 | ((i7 << 21) & 234881024) | ((i6 << 18) & 1879048192), ((i7 >> 6) & 7168) | 48);
                h02Var3 = h02Var;
                h02Var3.b(false);
            } else {
                if (iOrdinal6 == 1) {
                    h02Var2.X(493292232);
                    h02Var2.b(z4);
                    up.y();
                    return;
                }
                h02Var2.X(-1886778186);
                objK6 = h02Var2.K();
                if (objK6 == l76Var) {
                    objK6 = kq2.M(new cq4(0L));
                    h02Var2.i0(objK6);
                }
                ob3Var = (ob3) objK6;
                z5 = z4;
                nm0 nm0VarM8 = ue5.m0(528115858, new hm4(ob3Var, j55Var, zn3Var, bz1Var5, (byte) 1), h02Var2);
                nm0 nm0Var6 = nm0Var;
                c55 c55Var2 = new c55(new xx2(hc5VarP, bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 5));
                if ((i6 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                zX3 = z6 | h02Var2.x(hc5VarP);
                objK7 = h02Var2.K();
                if (zX3) {
                    objK7 = new kn2(j55Var, hc5VarP, ob3Var, (byte) 18);
                    h02Var2.i0(objK7);
                } else {
                    objK7 = new kn2(j55Var, hc5VarP, ob3Var, (byte) 18);
                    h02Var2.i0(objK7);
                }
                h02 h02Var5 = h02Var2;
                ec6.y(bz1Var, nm0Var2, nm0Var6, nm0Var3, nm0Var4, null, null, z, j55Var, c55Var2, (xy1) objK7, nm0VarM8, null, zn3Var, h02Var5, ((i6 >> 3) & 112) | 6 | ((i7 << 21) & 234881024) | ((i6 << 18) & 1879048192), (57344 & (i7 >> 3)) | 384);
                h02Var3 = h02Var5;
                h02Var3.b(false);
            }
        } else {
            h02Var3.Q();
        }
        u34 u34VarP = h02Var3.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: w45
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i | 1);
                    int iJ2 = aq2.J(i2);
                    zi6.g(j65Var, charSequence, bz1Var, j55Var, cz1Var, bz1Var2, bz1Var3, bz1Var4, z, z2, z3, ve2Var, zn3Var, t45Var, bz1Var5, (h02) obj, iJ, iJ2);
                    return og5.g;
                }
            };
        }
    }

    public static final float j(h02 h02Var) {
        long j = ((mf5) h02Var.a(of5.g)).q.y.r;
        long j2 = ve5.q;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((j51) h02Var.a(hp0.j)).M(j) / 2.0f;
    }

    public static final r6 l(j55 j55Var) {
        if (j55Var instanceof j55) {
            return hi0.h;
        }
        l0.m(j55Var, "Unknown position: ");
        return null;
    }

    public static final t25 n(oi oiVar, te5 te5Var, Object obj, Object obj2, Object obj3) {
        return new t25(oiVar, te5Var, obj, obj2, (vi) te5Var.g.a(obj3));
    }

    public static final void r(long j, bz1 bz1Var, h02 h02Var, int i) {
        h02Var.Z(590397809);
        int i2 = (h02Var.v(j) ? 4 : 2) | i | (h02Var.j(bz1Var) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            og0.y(du4.t(j, mt0.g), bz1Var, h02Var, (i2 & 112) | 8);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bb(j, bz1Var, i);
        }
    }

    public static final float t(h02 h02Var) {
        float f = ((vb1) h02Var.a(ye2.r)).j;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - a11.C) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[PHI: r3
  0x001c: PHI (r3v9 java.lang.String[]) = (r3v4 java.lang.String[]), (r3v10 java.lang.String[]) binds: [B:17:0x0033, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public static InputConnection v(yl ylVar, InputConnection inputConnection, EditorInfo editorInfo) {
        String[] stringArray;
        gc0 gc0Var = new gc0((Object) ylVar, (byte) 5);
        int i = Build.VERSION.SDK_INT;
        if (i >= 25) {
            return new vc2(inputConnection, gc0Var);
        }
        String[] strArr = za6.g;
        if (i >= 25) {
            stringArray = editorInfo.contentMimeTypes;
            if (stringArray != null) {
                strArr = stringArray;
            }
        } else {
            Bundle bundle = editorInfo.extras;
            if (bundle != null) {
                stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                if (stringArray == null) {
                    stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                }
                if (stringArray != null) {
                    strArr = stringArray;
                }
            }
        }
        return strArr.length == 0 ? inputConnection : new wc2(inputConnection, gc0Var);
    }

    public static final long x(t25 t25Var) {
        return t25Var.r() / 1000000;
    }

    public static final void y(long j, k85 k85Var, bz1 bz1Var, h02 h02Var, final int i) {
        h02 h02Var2;
        final bz1 bz1Var2;
        final k85 k85Var2;
        final long j2;
        h02Var.Z(396611577);
        int i2 = (h02Var.v(j) ? 4 : 2) | i | (h02Var.x(k85Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= h02Var.j(bz1Var) ? 256 : 128;
        }
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            h02Var2 = h02Var;
            jr2.r(j, k85Var, bz1Var, h02Var2, i2 & 1022);
            j2 = j;
            k85Var2 = k85Var;
            bz1Var2 = bz1Var;
        } else {
            h02Var2 = h02Var;
            bz1Var2 = bz1Var;
            k85Var2 = k85Var;
            j2 = j;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: x45
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zi6.y(j2, k85Var2, bz1Var2, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }
}
