package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import io.appground.blek.MainActivity;
import io.appground.blek.R;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class og0 {
    public static final int[] b;
    public static final /* synthetic */ int d = 0;
    public static final hi0 f;
    public static final f73 h;
    public static final /* synthetic */ int k = 0;
    public static final long[] o;
    public static final Object[] p;
    public static final long[] s;
    public static final m51 u;
    public static final lc3 z;
    public static final l1 g = new l1(6);
    public static final c11 y = new c11(new hi0(8));
    public static final nm0 r = new nm0(-728603513, false, new gg((byte) 25));
    public static final nm0 n = new nm0(-1162567194, false, new xm0(1));
    public static final nm0 v = new nm0(-1370304535, false, new hn0(17));
    public static final nm0 x = new nm0(-2029942609, false, new hn0(18));
    public static final nm0 l = new nm0(-1806091076, false, new gg((byte) 26));
    public static final nm0 j = new nm0(-1021628684, false, new rm0(1));
    public static final nm0 t = new nm0(-1937440426, false, new rm0(2));
    public static final nm0 a = new nm0(-2067216900, false, new hn0(13));
    public static final nm0 m = new nm0(1231477605, false, new rm0(3));
    public static final nm0 q = new nm0(1189162171, false, new gg((byte) 27));
    public static final nm0 w = new nm0(-100627746, false, new hn0(14));
    public static final nm0 c = new nm0(222593416, false, new hn0(15));
    public static final nm0 i = new nm0(-986551165, false, new hn0(16));

    static {
        new nm0(1732256415, false, new gg((byte) 28));
        new nm0(-1089117726, false, new gg((byte) 29));
        new nm0(349051085, false, new xm0((byte) 0));
        b = new int[0];
        s = new long[0];
        p = new Object[0];
        u = new m51(1.0f, 1.0f);
        z = new lc3((byte) 2);
        h = new f73((byte) 14);
        o = new long[0];
        f = new hi0((byte) 18);
    }

    public static Object A(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return x70.y(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (r4.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final int B(or orVar, Object obj, int i2) {
        int i3 = orVar.a;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iM = m(i3, i2, orVar.j);
            if (iM < 0 || yf2.p(obj, orVar.t[iM])) {
                return iM;
            }
            int i4 = iM + 1;
            while (i4 < i3 && orVar.j[i4] == i2) {
                if (yf2.p(obj, orVar.t[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iM - 1; i5 >= 0 && orVar.j[i5] == i2; i5--) {
                if (yf2.p(obj, orVar.t[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final boolean C(cu1 cu1Var) {
        um2 um2Var;
        gh3 gh3Var;
        um2 um2Var2;
        gh3 gh3Var2 = cu1Var.i;
        return (gh3Var2 == null || (um2Var = gh3Var2.B) == null || !um2Var.K() || (gh3Var = cu1Var.i) == null || (um2Var2 = gh3Var.B) == null || !um2Var2.J()) ? false : true;
    }

    public static final j73 D(j73 j73Var, uq2 uq2Var) {
        return j73Var.n(new sa1(uq2Var));
    }

    public static void E(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void F(nm0 nm0Var, ou0 ou0Var) {
        x12 x12Var;
        if (ou0Var instanceof x12) {
            x12Var = (x12) ou0Var;
            int i2 = x12Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x12Var.q = i2 - Integer.MIN_VALUE;
            } else {
                x12Var = new x12(ou0Var);
            }
        } else {
            x12Var = new x12(ou0Var);
        }
        Object obj = x12Var.m;
        int i3 = x12Var.q;
        if (i3 != 0) {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                js2.o(obj);
                l0.x();
                return;
            }
        }
        js2.o(obj);
        fx0 fx0Var = x12Var.t;
        fx0Var.getClass();
        vt0 vt0Var = (vt0) fx0Var.h(d52.t);
        if (vt0Var == null) {
            l0.z("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
        } else {
            x12Var.q = 1;
            vt0Var.C(nm0Var, x12Var);
        }
    }

    public static final ec2 G(int i2, h02 h02Var) {
        Object objK = h02Var.K();
        if (objK == oo0.g) {
            objK = new ec2();
            h02Var.i0(objK);
        }
        ec2 ec2Var = (ec2) objK;
        ec2Var.g(0, h02Var);
        return ec2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object H(my1 my1Var, bz1 bz1Var, ou0 ou0Var) {
        r7 r7Var;
        if (ou0Var instanceof r7) {
            r7Var = (r7) ou0Var;
            int i2 = r7Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r7Var.q = i2 - Integer.MIN_VALUE;
            } else {
                r7Var = new r7(ou0Var);
            }
        } else {
            r7Var = new r7(ou0Var);
        }
        Object obj = r7Var.m;
        int i3 = r7Var.q;
        mu0 mu0Var = null;
        byte b2 = 1;
        try {
            if (i3 == 0) {
                js2.o(obj);
                w7 w7Var = new w7(my1Var, bz1Var, mu0Var, b2);
                r7Var.q = 1;
                Object objB = k33.B(w7Var, r7Var);
                px0 px0Var = px0.j;
                if (objB == px0Var) {
                    return px0Var;
                }
            } else {
                if (i3 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
            }
        } catch (g7 unused) {
        }
        return og5.g;
    }

    public static final BlendMode I(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        return i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode J(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x0060->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r7 == r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(defpackage.w12 r5, android.content.Context r6, defpackage.ou0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.y12
            if (r0 == 0) goto L13
            r0 = r7
            y12 r0 = (defpackage.y12) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            y12 r0 = new y12
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.i
            r2 = 2
            r3 = 1
            px0 r4 = defpackage.px0.j
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            java.util.Iterator r5 = r0.w
            android.content.Context r6 = r0.q
            w12 r1 = r0.m
            defpackage.js2.o(r7)
            goto L60
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r5)
            r5 = 0
            return r5
        L37:
            android.content.Context r6 = r0.q
            w12 r5 = r0.m
            defpackage.js2.o(r7)
            goto L58
        L3f:
            defpackage.js2.o(r7)
            f22 r7 = new f22
            r7.<init>(r6)
            java.lang.Class r1 = r5.getClass()
            r0.m = r5
            r0.q = r6
            r0.i = r3
            java.io.Serializable r7 = r7.y(r1, r0)
            if (r7 != r4) goto L58
            goto L7a
        L58:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r1 = r5
            r5 = r7
        L60:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7b
            java.lang.Object r7 = r5.next()
            tp r7 = (defpackage.tp) r7
            r0.m = r1
            r0.q = r6
            r0.w = r5
            r0.i = r2
            java.lang.Object r7 = r1.v(r6, r7, r0)
            if (r7 != r4) goto L60
        L7a:
            return r4
        L7b:
            og5 r5 = defpackage.og5.g
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og0.K(w12, android.content.Context, ou0):java.lang.Object");
    }

    public static void L(Context context, Executor executor, mz3 mz3Var, boolean z2) {
        boolean zX;
        boolean z3;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z4 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z3 = j2 == packageInfo.lastUpdateTime;
                            if (z3) {
                                mz3Var.q(2, null);
                            }
                        } catch (Throwable th) {
                            try {
                                dataInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (IOException unused) {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    qz3.r(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            i71 i71Var = new i71(assets, executor, mz3Var, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (i71Var.g()) {
                i71 i71VarR = i71Var.r();
                i71VarR.v();
                zX = i71VarR.x();
                if (zX) {
                    E(packageInfo, filesDir);
                }
            } else {
                zX = false;
            }
            if (zX && z2) {
                z4 = true;
            }
            qz3.r(context, z4);
        } catch (PackageManager.NameNotFoundException e) {
            mz3Var.q(7, e);
            qz3.r(context, false);
        }
    }

    public static final j73 a(j73 j73Var, long j2, cn4 cn4Var) {
        return j73Var.n(new lw(j2, cn4Var));
    }

    public static final ob3 b(er1 er1Var, Object obj, ju2 ju2Var, wt2 wt2Var, fx0 fx0Var, h02 h02Var, int i2) {
        Object[] objArr = {er1Var, ju2Var, wt2Var, fx0Var};
        boolean zJ = ((((i2 & 7168) ^ 3072) > 2048 && h02Var.n(wt2Var.ordinal())) || (i2 & 3072) == 2048) | h02Var.j(ju2Var) | h02Var.j(fx0Var) | h02Var.j(er1Var);
        Object objK = h02Var.K();
        Object obj2 = oo0.g;
        if (zJ || objK == obj2) {
            Object xu0Var = new xu0(ju2Var, wt2Var, fx0Var, er1Var, null);
            h02Var.i0(xu0Var);
            objK = xu0Var;
        }
        bz1 bz1Var = (bz1) objK;
        Object objK2 = h02Var.K();
        if (objK2 == obj2) {
            objK2 = kq2.M(obj);
            h02Var.i0(objK2);
        }
        ob3 ob3Var = (ob3) objK2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zJ2 = h02Var.j(bz1Var);
        Object objK3 = h02Var.K();
        if (zJ2 || objK3 == obj2) {
            objK3 = new qt4(bz1Var, ob3Var, null, (byte) 2);
            h02Var.i0(objK3);
        }
        bz1 bz1Var2 = (bz1) objK3;
        fx0 fx0Var2 = h02Var.R;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
        boolean zN = h02Var.n(objArrCopyOf2.length);
        for (Object obj3 : objArrCopyOf2) {
            zN |= h02Var.x(obj3);
        }
        Object objK4 = h02Var.K();
        if (!zN && objK4 != obj2) {
            return ob3Var;
        }
        h02Var.i0(new pk2(fx0Var2, bz1Var2));
        return ob3Var;
    }

    public static final void c(yc0 yc0Var, Throwable th) {
        CancellationException cancellationExceptionV = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionV == null) {
            cancellationExceptionV = k33.v("Channel was consumed, consumer had failed", th);
        }
        yc0Var.x(cancellationExceptionV);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class e(tf0 tf0Var) {
        Class cls = tf0Var.g;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static final Object f(Context context, Class cls) {
        context.getClass();
        return a11.u(cls, ue5.Q(context.getApplicationContext()));
    }

    public static final void g(final o22 o22Var, int i2, int i3, final nm0 nm0Var, h02 h02Var, final int i4, final int i5) {
        int i6;
        h02Var.Z(-474572032);
        if ((i4 & 6) == 0) {
            i6 = (h02Var.x(o22Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= h02Var.n(i2) ? 32 : 16;
        }
        int i8 = i5 & 4;
        if (i8 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= h02Var.n(i3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= h02Var.j(nm0Var) ? 2048 : 1024;
        }
        if ((i6 & 1171) == 1170 && h02Var.e()) {
            h02Var.Q();
        } else {
            if (i7 != 0) {
                i2 = 0;
            }
            if (i8 != 0) {
                i3 = 0;
            }
            h02Var.Y(1849434622);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = bk0.i;
                h02Var.i0(objK);
            }
            h02Var.b(false);
            my1 my1Var = (my1) ((nz1) objK);
            h02Var.Y(-683746039);
            h02Var.Y(-548224868);
            if (!(h02Var.g instanceof lq)) {
                pw5.f();
                throw null;
            }
            h02Var.V();
            if (h02Var.S) {
                h02Var.m(my1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(new gg((byte) 13), h02Var, o22Var);
            xs2.E(new gg((byte) 14), h02Var, new q6(i3));
            xs2.E(new gg((byte) 15), h02Var, new s6(i2));
            nm0Var.x(fk0.g, h02Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            h02Var.b(true);
            h02Var.b(false);
            h02Var.b(false);
        }
        final int i9 = i2;
        final int i10 = i3;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: ak0
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i4 | 1);
                    o22 o22Var2 = o22Var;
                    boolean z2 = i9;
                    boolean z3 = i10;
                    nm0 nm0Var2 = nm0Var;
                    og0.g(o22Var2, z2 ? 1 : 0, z3 ? 1 : 0, nm0Var2, (h02) obj, iJ, i5);
                    return og5.g;
                }
            };
        }
    }

    public static final cu1 h(cu1 cu1Var) {
        cu1 cu1VarX = ((nt1) ((ba) k33.W(cu1Var)).getFocusOwner()).x();
        if (cu1VarX == null || !cu1VarX.h) {
            return null;
        }
        return cu1VarX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [g91] */
    public static final void i(final MainActivity mainActivity) {
        if (System.currentTimeMillis() <= 1799695835178L || yf2.p(mainActivity.getPackageManager().getInstallerPackageName(mainActivity.getPackageName()), "com.android.vending")) {
            return;
        }
        d23 d23Var = new d23(mainActivity);
        d23Var.p();
        d23Var.i();
        d23Var.s(mainActivity.getString(R.string.button_ok), new DialogInterface.OnClickListener() { // from class: g91
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                MainActivity mainActivity2 = mainActivity;
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=io.appground.blek");
                uri.getClass();
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                try {
                    mainActivity2.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                }
            }
        });
        d23Var.b();
        d23Var.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(q8 q8Var, Object obj, float f2, oi oiVar, c11 c11Var, ou0 ou0Var) {
        o7 o7Var;
        float f3;
        r54 r54Var;
        if (ou0Var instanceof o7) {
            o7Var = (o7) ou0Var;
            int i2 = o7Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o7Var.c = i2 - Integer.MIN_VALUE;
            } else {
                o7Var = new o7(ou0Var);
            }
        } else {
            o7Var = new o7(ou0Var);
        }
        Object obj2 = o7Var.w;
        int i3 = o7Var.c;
        if (i3 == 0) {
            js2.o(obj2);
            r54 r54Var2 = new r54();
            r54Var2.j = f2;
            dz1 p7Var = new p7(q8Var, f2, oiVar, r54Var2, c11Var, null);
            o7Var.q = r54Var2;
            o7Var.m = f2;
            o7Var.c = 1;
            Object objG = q8Var.g(obj, ub3.j, p7Var, o7Var);
            Object obj3 = px0.j;
            if (objG == obj3) {
                return obj3;
            }
            f3 = f2;
            r54Var = r54Var2;
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f3 = o7Var.m;
            r54Var = o7Var.q;
            js2.o(obj2);
        }
        return new Float(f3 - r54Var.j);
    }

    public static final cu1 k(cu1 cu1Var) {
        boolean z2 = cu1Var.j.h;
        if (z2) {
            if (!z2) {
                mc2.y("visitChildren called on an unattached node");
            }
            rb3 rb3Var = new rb3(new i73[16]);
            i73 i73Var = cu1Var.j;
            i73 i73Var2 = i73Var.w;
            if (i73Var2 == null) {
                k33.o(rb3Var, i73Var);
            } else {
                rb3Var.y(i73Var2);
            }
            while (true) {
                int i2 = rb3Var.a;
                if (i2 == 0) {
                    break;
                }
                i73 i73VarQ = (i73) rb3Var.w(i2 - 1);
                if ((i73VarQ.m & 1024) == 0) {
                    k33.o(rb3Var, i73VarQ);
                } else {
                    while (i73VarQ != null) {
                        if ((i73VarQ.a & 1024) != 0) {
                            rb3 rb3Var2 = null;
                            while (i73VarQ != null) {
                                if (i73VarQ instanceof cu1) {
                                    cu1 cu1Var2 = (cu1) i73VarQ;
                                    if (cu1Var2.j.h) {
                                        int iOrdinal = cu1Var2.V0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return cu1Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            uo1.g();
                                            return null;
                                        }
                                    }
                                } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                    int i3 = 0;
                                    for (i73 i73Var3 = ((p41) i73VarQ).f; i73Var3 != null; i73Var3 = i73Var3.w) {
                                        if ((i73Var3.a & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                i73VarQ = i73Var3;
                                            } else {
                                                if (rb3Var2 == null) {
                                                    rb3Var2 = new rb3(new i73[16]);
                                                }
                                                if (i73VarQ != null) {
                                                    rb3Var2.y(i73VarQ);
                                                    i73VarQ = null;
                                                }
                                                rb3Var2.y(i73Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                i73VarQ = k33.Q(rb3Var2);
                            }
                            break;
                        }
                        i73VarQ = i73VarQ.w;
                    }
                }
            }
        }
        return null;
    }

    public static final Object l(q8 q8Var, float f2, m8 m8Var, l11 l11Var, Object obj, oi oiVar, zz4 zz4Var) {
        Object objT;
        float fR = l11Var.r(obj);
        r54 r54Var = new r54();
        r54Var.j = Float.isNaN(q8Var.a.d()) ? 0.0f : q8Var.a.d();
        if (!Float.isNaN(fR)) {
            float f3 = r54Var.j;
            if (f3 != fR && (objT = kq2.t(f3, fR, f2, oiVar, new k7(m8Var, r54Var, (byte) 0), zz4Var)) == px0.j) {
                return objT;
            }
        }
        return og5.g;
    }

    public static final int m(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static j73 n(q8 q8Var) {
        return new i7(q8Var, um3.j, true, null);
    }

    public static final k44 o(cu1 cu1Var) {
        gh3 gh3Var;
        if (cu1Var.h && (gh3Var = cu1Var.i) != null) {
            bl2 bl2VarK = m50.K(gh3Var);
            if (!bl2VarK.W()) {
                bl2VarK = null;
            }
            if (bl2VarK != null) {
                return cu1Var.T0(bl2VarK);
            }
        }
        return k44.v;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[RETURN] */
    public static final Object p(l11 l11Var, float f2, float f3, xy1 xy1Var, my1 my1Var) {
        if (Float.isNaN(f2)) {
            l0.u("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z2 = Math.abs(f3) > 0.0f;
        boolean z3 = z2 && f3 > 0.0f;
        if (!z2) {
            Object objG = l11Var.g(f2);
            objG.getClass();
            return objG;
        }
        if (Math.abs(f3) >= Math.abs(((Number) my1Var.g()).floatValue())) {
            Object objY = l11Var.y(f2, z3);
            objY.getClass();
            return objY;
        }
        Object objY2 = l11Var.y(f2, false);
        objY2.getClass();
        float fR = l11Var.r(objY2);
        Object objY3 = l11Var.y(f2, true);
        objY3.getClass();
        float fR2 = l11Var.r(objY3);
        float fAbs = Math.abs(((Number) xy1Var.a(Float.valueOf(Math.abs(fR - fR2)))).floatValue());
        if (!z3) {
            fR = fR2;
        }
        boolean z4 = Math.abs(fR - f2) >= fAbs;
        if (z4) {
            if (z3) {
                return objY3;
            }
            return objY2;
        }
        if (z4) {
            uo1.g();
            return null;
        }
        if (z3) {
            return objY2;
        }
        return objY3;
    }

    public static final int q(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void r(m14[] m14VarArr, bz1 bz1Var, h02 h02Var, int i2) {
        tr3 tr3VarH0;
        boolean z2;
        u34 u34VarP;
        h02Var.Z(415205898);
        re2 re2Var = h02Var.k;
        tr3 tr3VarQ = h02Var.q();
        h02Var.T(201, qo0.y);
        if (h02Var.S) {
            tr3VarH0 = h02Var.h0(tr3VarQ, a11.H(m14VarArr, tr3VarQ, tr3.m));
            h02Var.J = true;
        } else {
            lr4 lr4Var = h02Var.G;
            Object objJ = lr4Var.j(lr4Var.l, 0);
            objJ.getClass();
            tr3 tr3Var = (tr3) objJ;
            lr4 lr4Var2 = h02Var.G;
            Object objJ2 = lr4Var2.j(lr4Var2.l, 1);
            objJ2.getClass();
            tr3 tr3Var2 = (tr3) objJ2;
            tr3 tr3VarH = a11.H(m14VarArr, tr3VarQ, tr3Var2);
            if (!h02Var.e() || h02Var.d || !tr3Var2.equals(tr3VarH)) {
                tr3VarH0 = h02Var.h0(tr3VarQ, tr3VarH);
                if (h02Var.d || !yf2.p(tr3VarH0, tr3Var)) {
                    z2 = true;
                }
                if (z2 && !h02Var.S) {
                    h02Var.I(tr3VarH0);
                }
                re2Var.r(h02Var.f ? 1 : 0);
                h02Var.f = z2;
                h02Var.K = tr3VarH0;
                h02Var.R(202, 0, qo0.r, tr3VarH0);
                bz1Var.l(h02Var, Integer.valueOf((i2 >> 3) & 14));
                h02Var.b(false);
                h02Var.b(false);
                h02Var.f = re2Var.y() != 0;
                h02Var.K = null;
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new tk((byte) 5, i2, m14VarArr, bz1Var);
                }
            }
            h02Var.q = h02Var.G.u() + h02Var.q;
            tr3VarH0 = tr3Var;
        }
        z2 = false;
        if (z2) {
            h02Var.I(tr3VarH0);
        }
        re2Var.r(h02Var.f ? 1 : 0);
        h02Var.f = z2;
        h02Var.K = tr3VarH0;
        h02Var.R(202, 0, qo0.r, tr3VarH0);
        bz1Var.l(h02Var, Integer.valueOf((i2 >> 3) & 14));
        h02Var.b(false);
        h02Var.b(false);
        h02Var.f = re2Var.y() != 0;
        h02Var.K = null;
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tk((byte) 5, i2, m14VarArr, bz1Var);
        }
    }

    public static final ob3 s(cw4 cw4Var, h02 h02Var) {
        return b(cw4Var, cw4Var.getValue(), ((gu2) h02Var.a(ix2.g)).a(), wt2.m, ni1.j, h02Var, 0);
    }

    public static Object t(q8 q8Var, Object obj, float f2, y7 y7Var) {
        oi oiVar;
        c11 c11Var;
        if (q8Var.r()) {
            oiVar = q8Var.n;
            if (oiVar == null) {
                yf2.Y("snapAnimationSpec");
                throw null;
            }
        } else {
            oiVar = h7.g;
        }
        oi oiVar2 = oiVar;
        if (q8Var.r()) {
            c11Var = q8Var.v;
            if (c11Var == null) {
                yf2.Y("decayAnimationSpec");
                throw null;
            }
        } else {
            c11Var = h7.r;
        }
        return j(q8Var, obj, f2, oiVar2, c11Var, y7Var);
    }

    public static final vi u(vi viVar) {
        vi viVarR = viVar.r();
        int iY = viVarR.y();
        for (int i2 = 0; i2 < iY; i2++) {
            viVarR.v(i2, viVar.g(i2));
        }
        return viVarR;
    }

    public static j73 v(j73 j73Var, q8 q8Var, boolean z2, boolean z3) {
        return j73Var.n(new i7(q8Var, um3.t, z3, Boolean.valueOf(z2)));
    }

    public static final float w(c11 c11Var, float f2, float f3) {
        return ((ri) new nj5(c11Var.g).g(new ri(f2), new ri(f3))).g;
    }

    public static final bc2 x(ec2 ec2Var, float f2, float f3, ac2 ac2Var, h02 h02Var, int i2, int i3) {
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        Object objK = h02Var.K();
        l76 l76Var = oo0.g;
        if (objK == l76Var) {
            objK = new bc2(ec2Var, fValueOf, fValueOf2, ac2Var);
            h02Var.i0(objK);
        }
        bc2 bc2Var = (bc2) objK;
        boolean zJ = h02Var.j(ac2Var);
        Object objK2 = h02Var.K();
        if (zJ || objK2 == l76Var) {
            re1 re1Var = new re1((Object) fValueOf, (Object) bc2Var, (Object) fValueOf2, (Object) ac2Var, (byte) 1);
            h02Var.i0(re1Var);
            objK2 = re1Var;
        }
        k33.z((my1) objK2, h02Var);
        boolean zJ2 = h02Var.j(ec2Var);
        Object objK3 = h02Var.K();
        if (zJ2 || objK3 == l76Var) {
            objK3 = new xf(ec2Var, bc2Var, (byte) 7);
            h02Var.i0(objK3);
        }
        k33.j(bc2Var, (xy1) objK3, h02Var);
        return bc2Var;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void y(m14 m14Var, bz1 bz1Var, h02 h02Var, int i2) {
        oi5 oi5Var;
        boolean z2;
        u34 u34VarP;
        h02Var.Z(-149765515);
        re2 re2Var = h02Var.k;
        tr3 tr3VarQ = h02Var.q();
        h02Var.T(201, qo0.y);
        Object objK = h02Var.K();
        if (yf2.p(objK, oo0.g)) {
            oi5Var = null;
        } else {
            objK.getClass();
            oi5Var = (oi5) objK;
        }
        j14 j14Var = m14Var.g;
        oi5 oi5VarN = j14Var.n(m14Var, oi5Var);
        boolean zEquals = oi5VarN.equals(oi5Var);
        if (!zEquals) {
            h02Var.i0(oi5VarN);
        }
        if (!h02Var.S) {
            lr4 lr4Var = h02Var.G;
            Object objY = lr4Var.y(lr4Var.y, lr4Var.l);
            objY.getClass();
            tr3 tr3Var = (tr3) objY;
            if (!(h02Var.e() && zEquals) && (m14Var.l || !tr3VarQ.containsKey(j14Var))) {
                tr3VarQ = tr3VarQ.y(j14Var, oi5VarN);
            } else if ((zEquals && !h02Var.f) || !h02Var.f) {
                tr3VarQ = tr3Var;
            }
            if (h02Var.d || tr3Var != tr3VarQ) {
                z2 = true;
            }
            if (z2 && !h02Var.S) {
                h02Var.I(tr3VarQ);
            }
            re2Var.r(h02Var.f ? 1 : 0);
            h02Var.f = z2;
            h02Var.K = tr3VarQ;
            h02Var.R(202, 0, qo0.r, tr3VarQ);
            bz1Var.l(h02Var, Integer.valueOf((i2 >> 3) & 14));
            h02Var.b(false);
            h02Var.b(false);
            h02Var.f = re2Var.y() != 0;
            h02Var.K = null;
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new tk((byte) 4, i2, m14Var, bz1Var);
            }
        }
        if (m14Var.l || !tr3VarQ.containsKey(j14Var)) {
            tr3VarQ = tr3VarQ.y(j14Var, oi5VarN);
        }
        h02Var.J = true;
        z2 = false;
        if (z2) {
            h02Var.I(tr3VarQ);
        }
        re2Var.r(h02Var.f ? 1 : 0);
        h02Var.f = z2;
        h02Var.K = tr3VarQ;
        h02Var.R(202, 0, qo0.r, tr3VarQ);
        bz1Var.l(h02Var, Integer.valueOf((i2 >> 3) & 14));
        h02Var.b(false);
        h02Var.b(false);
        h02Var.f = re2Var.y() != 0;
        h02Var.K = null;
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tk((byte) 4, i2, m14Var, bz1Var);
        }
    }

    public static final er1 z(er1 er1Var) {
        return ((er1Var instanceof cw4) || (er1Var instanceof eb1)) ? er1Var : new eb1(er1Var);
    }

    public void d(qn4 qn4Var, float f2, float f3) {
        float f4 = f3 * f2;
        qn4Var.n(f4, 180.0f, 90.0f);
        double d2 = f4;
        qn4Var.r((float) (Math.sin(Math.toRadians(90.0d)) * d2), (float) (Math.sin(Math.toRadians(0.0d)) * d2));
    }
}
