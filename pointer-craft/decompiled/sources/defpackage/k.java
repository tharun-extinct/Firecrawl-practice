package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ k(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:101:0x0152  */
    /* JADX WARN: Code duplicated, block: B:103:0x0161  */
    /* JADX WARN: Code duplicated, block: B:105:0x0167  */
    /* JADX WARN: Code duplicated, block: B:108:0x0174  */
    /* JADX WARN: Code duplicated, block: B:110:0x0178  */
    /* JADX WARN: Code duplicated, block: B:112:0x018e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0198  */
    /* JADX WARN: Code duplicated, block: B:115:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:121:0x0220  */
    /* JADX WARN: Code duplicated, block: B:124:0x0238  */
    /* JADX WARN: Code duplicated, block: B:126:0x024e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0263  */
    /* JADX WARN: Code duplicated, block: B:132:0x0269  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:187:0x038f  */
    /* JADX WARN: Code duplicated, block: B:193:0x039f A[Catch: all -> 0x03cd, LOOP:4: B:178:0x033f->B:193:0x039f, LOOP_END, TryCatch #9 {all -> 0x03cd, blocks: (B:175:0x0331, B:178:0x033f, B:180:0x034f, B:182:0x035c, B:184:0x0365, B:186:0x0374, B:188:0x0391, B:193:0x039f, B:194:0x03a2, B:196:0x03b4, B:200:0x03c9, B:201:0x03cc, B:195:0x03a7), top: B:234:0x0331, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0127  */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        boolean z;
        float f2;
        xu4 xu4Var;
        float f3;
        float f4;
        float f5;
        float f6;
        xu4 xu4Var2;
        ArrayList arrayList2;
        ki kiVarY;
        ArrayList arrayList3;
        int iIndexOf;
        int i;
        long j5;
        int size;
        long j6;
        ly lyVar;
        byte b = this.j;
        boolean z2 = false;
        boolean z3 = true;
        Object obj = this.t;
        switch (b) {
            case 0:
                ((d) obj).y();
                return;
            case 1:
                ia iaVar = (ia) obj;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    iaVar.m.d(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        iaVar.c();
                        Trace.endSection();
                        iaVar.P = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                ya yaVar = (ya) obj;
                boolean zV = yaVar.v();
                ba baVar = yaVar.j;
                if (zV) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        baVar.d(true);
                        ha3 ha3Var = yaVar.s;
                        int[] iArr = ha3Var.y;
                        long[] jArr = ha3Var.g;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j7 = jArr[i2];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    long j8 = j7;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((255 & j8) < 128) {
                                            int i5 = iArr[(i2 << 3) + i4];
                                            if (!yaVar.n().g(i5)) {
                                                yaVar.m.add(new it0(i5, yaVar.b, jt0.t, null));
                                                yaVar.c.z(og5.g);
                                            }
                                        }
                                        j8 >>= 8;
                                        i4++;
                                        length = length;
                                    }
                                    int i6 = length;
                                    if (i3 == 8) {
                                        length = i6;
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                } else if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            yaVar.j(baVar.getSemanticsOwner().g(), yaVar.p);
                            Trace.endSection();
                            yaVar.r(yaVar.n());
                            yaVar.c();
                            yaVar.u = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                return;
            case 3:
                ki kiVar = (ki) ((ki) obj).r.t;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList4 = kiVar.y;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i7 = 0;
                while (i7 < arrayList4.size()) {
                    wu4 wu4Var = (wu4) arrayList4.get(i7);
                    if (wu4Var == null) {
                        arrayList4 = arrayList4;
                        j5 = jUptimeMillis2;
                    } else {
                        sp4 sp4Var = kiVar.g;
                        Long l = (Long) sp4Var.get(wu4Var);
                        if (l != null) {
                            if (l.longValue() < jUptimeMillis2) {
                                sp4Var.remove(wu4Var);
                                j = wu4Var.t;
                                if (j == 0) {
                                    wu4Var.t = jUptimeMillis;
                                    wu4Var.r(wu4Var.y);
                                    arrayList4 = arrayList4;
                                } else {
                                    j2 = jUptimeMillis - j;
                                    wu4Var.t = jUptimeMillis;
                                    f = wu4.y().l;
                                    if (f == 0.0f) {
                                        j3 = 2147483647L;
                                    } else {
                                        j3 = (long) (j2 / f);
                                    }
                                    j4 = j3;
                                    z = wu4Var.i;
                                    f2 = wu4Var.c;
                                    if (z) {
                                        if (f2 != Float.MAX_VALUE) {
                                            wu4Var.w.t = f2;
                                            wu4Var.c = Float.MAX_VALUE;
                                        }
                                        wu4Var.y = (float) wu4Var.w.t;
                                        wu4Var.g = 0.0f;
                                        wu4Var.i = z2;
                                        arrayList4 = arrayList4;
                                    } else {
                                        xu4Var = wu4Var.w;
                                        f3 = wu4Var.y;
                                        f4 = wu4Var.g;
                                        if (f2 != Float.MAX_VALUE) {
                                            long j9 = j4 / 2;
                                            j jVarR = xu4Var.r(f3, f4, j9);
                                            xu4 xu4Var3 = wu4Var.w;
                                            xu4Var3.t = wu4Var.c;
                                            wu4Var.c = Float.MAX_VALUE;
                                            j jVarR2 = xu4Var3.r(jVarR.j, jVarR.t, j9);
                                            f5 = jVarR2.j;
                                            wu4Var.y = f5;
                                            wu4Var.g = jVarR2.t;
                                        } else {
                                            j jVarR3 = xu4Var.r(f3, f4, j4);
                                            f5 = jVarR3.j;
                                            wu4Var.y = f5;
                                            wu4Var.g = jVarR3.t;
                                        }
                                        float fMax = Math.max(f5, wu4Var.j);
                                        wu4Var.y = fMax;
                                        float fMin = Math.min(fMax, wu4Var.l);
                                        wu4Var.y = fMin;
                                        f6 = wu4Var.g;
                                        xu4Var2 = wu4Var.w;
                                        xu4Var2.getClass();
                                        if (Math.abs(f6) < xu4Var2.v || Math.abs(fMin - ((float) xu4Var2.t)) >= xu4Var2.n) {
                                            z3 = false;
                                        } else {
                                            wu4Var.y = (float) wu4Var.w.t;
                                            wu4Var.g = 0.0f;
                                            z3 = true;
                                        }
                                    }
                                    float fMin2 = Math.min(wu4Var.y, wu4Var.l);
                                    wu4Var.y = fMin2;
                                    float fMax2 = Math.max(fMin2, wu4Var.j);
                                    wu4Var.y = fMax2;
                                    wu4Var.r(fMax2);
                                    if (z3) {
                                        arrayList2 = wu4Var.m;
                                        wu4Var.x = false;
                                        kiVarY = wu4.y();
                                        kiVarY.g.remove(wu4Var);
                                        arrayList3 = kiVarY.y;
                                        iIndexOf = arrayList3.indexOf(wu4Var);
                                        if (iIndexOf >= 0) {
                                            arrayList3.set(iIndexOf, null);
                                            kiVarY.x = true;
                                        }
                                        wu4Var.t = 0L;
                                        wu4Var.r = false;
                                        i = 0;
                                        while (i < arrayList2.size()) {
                                            if (arrayList2.get(i) != null) {
                                                iy iyVar = (iy) arrayList2.get(i);
                                                float f7 = wu4Var.y;
                                                lyVar = iyVar.g;
                                                if (lyVar.getProgressDrawable() == null && lyVar.getProgressDrawable().getLevel() == 10000) {
                                                    jy jyVar = lyVar.u;
                                                    if (lyVar.getVisibility() != 0) {
                                                        lyVar.removeCallbacks(lyVar.p);
                                                        j6 = jUptimeMillis2;
                                                    } else {
                                                        lyVar.removeCallbacks(jyVar);
                                                        j6 = jUptimeMillis2;
                                                        long jUptimeMillis3 = SystemClock.uptimeMillis() - lyVar.q;
                                                        long j10 = lyVar.m;
                                                        if (jUptimeMillis3 >= j10) {
                                                            jyVar.run();
                                                        } else {
                                                            lyVar.postDelayed(jyVar, j10 - jUptimeMillis3);
                                                        }
                                                    }
                                                } else {
                                                    j6 = jUptimeMillis2;
                                                }
                                            } else {
                                                j6 = jUptimeMillis2;
                                            }
                                            i++;
                                            jUptimeMillis2 = j6;
                                        }
                                        j5 = jUptimeMillis2;
                                        for (size = arrayList2.size() - 1; size >= 0; size--) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                    }
                                }
                            } else {
                                arrayList4 = arrayList4;
                            }
                            j5 = jUptimeMillis2;
                        } else {
                            j = wu4Var.t;
                            if (j == 0) {
                                wu4Var.t = jUptimeMillis;
                                wu4Var.r(wu4Var.y);
                                arrayList4 = arrayList4;
                                j5 = jUptimeMillis2;
                            } else {
                                j2 = jUptimeMillis - j;
                                wu4Var.t = jUptimeMillis;
                                f = wu4.y().l;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = wu4Var.i;
                                f2 = wu4Var.c;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        wu4Var.w.t = f2;
                                        wu4Var.c = Float.MAX_VALUE;
                                    }
                                    wu4Var.y = (float) wu4Var.w.t;
                                    wu4Var.g = 0.0f;
                                    wu4Var.i = z2;
                                    arrayList4 = arrayList4;
                                } else {
                                    xu4Var = wu4Var.w;
                                    f3 = wu4Var.y;
                                    f4 = wu4Var.g;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j11 = j4 / 2;
                                        j jVarR4 = xu4Var.r(f3, f4, j11);
                                        xu4 xu4Var4 = wu4Var.w;
                                        xu4Var4.t = wu4Var.c;
                                        wu4Var.c = Float.MAX_VALUE;
                                        j jVarR5 = xu4Var4.r(jVarR4.j, jVarR4.t, j11);
                                        f5 = jVarR5.j;
                                        wu4Var.y = f5;
                                        wu4Var.g = jVarR5.t;
                                    } else {
                                        j jVarR6 = xu4Var.r(f3, f4, j4);
                                        f5 = jVarR6.j;
                                        wu4Var.y = f5;
                                        wu4Var.g = jVarR6.t;
                                    }
                                    float fMax3 = Math.max(f5, wu4Var.j);
                                    wu4Var.y = fMax3;
                                    float fMin3 = Math.min(fMax3, wu4Var.l);
                                    wu4Var.y = fMin3;
                                    f6 = wu4Var.g;
                                    xu4Var2 = wu4Var.w;
                                    xu4Var2.getClass();
                                    if (Math.abs(f6) < xu4Var2.v) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                float fMin4 = Math.min(wu4Var.y, wu4Var.l);
                                wu4Var.y = fMin4;
                                float fMax4 = Math.max(fMin4, wu4Var.j);
                                wu4Var.y = fMax4;
                                wu4Var.r(fMax4);
                                if (z3) {
                                    arrayList2 = wu4Var.m;
                                    wu4Var.x = false;
                                    kiVarY = wu4.y();
                                    kiVarY.g.remove(wu4Var);
                                    arrayList3 = kiVarY.y;
                                    iIndexOf = arrayList3.indexOf(wu4Var);
                                    if (iIndexOf >= 0) {
                                        arrayList3.set(iIndexOf, null);
                                        kiVarY.x = true;
                                    }
                                    wu4Var.t = 0L;
                                    wu4Var.r = false;
                                    i = 0;
                                    while (i < arrayList2.size()) {
                                        if (arrayList2.get(i) != null) {
                                            iy iyVar2 = (iy) arrayList2.get(i);
                                            float f8 = wu4Var.y;
                                            lyVar = iyVar2.g;
                                            if (lyVar.getProgressDrawable() == null) {
                                                j6 = jUptimeMillis2;
                                            } else {
                                                j6 = jUptimeMillis2;
                                            }
                                        } else {
                                            j6 = jUptimeMillis2;
                                        }
                                        i++;
                                        jUptimeMillis2 = j6;
                                    }
                                    j5 = jUptimeMillis2;
                                    while (size >= 0) {
                                        if (arrayList2.get(size) == null) {
                                            arrayList2.remove(size);
                                        }
                                    }
                                } else {
                                    j5 = jUptimeMillis2;
                                }
                            }
                        }
                    }
                    i7++;
                    jUptimeMillis2 = j5;
                    z2 = false;
                    z3 = true;
                    arrayList4 = arrayList4;
                }
                ArrayList arrayList5 = arrayList4;
                if (kiVar.x) {
                    int size2 = arrayList5.size() - 1;
                    while (size2 >= 0) {
                        ArrayList arrayList6 = arrayList5;
                        if (arrayList6.get(size2) == null) {
                            arrayList6.remove(size2);
                        }
                        size2--;
                        arrayList5 = arrayList6;
                    }
                    arrayList = arrayList5;
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        kiVar.j.O();
                    }
                    kiVar.x = false;
                } else {
                    arrayList = arrayList5;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) kiVar.v.t).postFrameCallback(new ii(kiVar.n));
                    return;
                }
                return;
            case 4:
                yu1 yu1Var = (yu1) obj;
                synchronized (yu1Var.a) {
                    try {
                        if (yu1Var.c == null) {
                            return;
                        }
                        try {
                            tv1 tv1VarR = yu1Var.r();
                            int i8 = tv1VarR.x;
                            if (i8 == 2) {
                                synchronized (yu1Var.a) {
                                }
                            }
                            if (i8 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i8 + ")");
                            }
                            try {
                                Method method = ib5.y;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = yu1Var.j;
                                tv1[] tv1VarArr = {tv1VarR};
                                zq2 zq2Var = xe5.g;
                                lr2.w("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceR = xe5.g.r(context, tv1VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferE = br2.e(yu1Var.j, tv1VarR.g);
                                    if (mappedByteBufferE == null || typefaceR == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        kb5 kb5Var = new kb5(typefaceR, mq2.p(mappedByteBufferE));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (yu1Var.a) {
                                            try {
                                                ue5 ue5Var = yu1Var.c;
                                                if (ue5Var != null) {
                                                    ue5Var.c0(kb5Var);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                            break;
                                        }
                                        yu1Var.y();
                                        return;
                                    } catch (Throwable th5) {
                                        Method method2 = ib5.y;
                                        Trace.endSection();
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    Trace.endSection();
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Method method3 = ib5.y;
                                Trace.endSection();
                                throw th7;
                            }
                            break;
                        } catch (Throwable th8) {
                            synchronized (yu1Var.a) {
                                try {
                                    ue5 ue5Var2 = yu1Var.c;
                                    if (ue5Var2 != null) {
                                        ue5Var2.Z(th8);
                                    }
                                    yu1Var.y();
                                    return;
                                } catch (Throwable th9) {
                                    throw th9;
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
            case 5:
                int[] iArr2 = MaterialButton.V;
                ((MaterialButton) obj).p();
                return;
            case 6:
                ky3 ky3Var = (ky3) obj;
                ju2 ju2Var = ky3Var.w;
                if (ky3Var.t == 0) {
                    ky3Var.a = true;
                    ju2Var.n(vt2.ON_PAUSE);
                }
                if (ky3Var.j == 0 && ky3Var.a) {
                    ju2Var.n(vt2.ON_STOP);
                    ky3Var.m = true;
                    return;
                }
                return;
            default:
                kb5 kb5Var2 = (kb5) obj;
                ((bc4) kb5Var2.m).i(new gc0((Object) kb5Var2, (byte) 10));
                return;
        }
    }
}
