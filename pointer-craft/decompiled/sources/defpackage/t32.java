package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class t32 implements r50, k51, o50, hq5, xb5, vy4, aa3, aj3 {
    public static t32 t;
    public final /* synthetic */ byte j;
    public static final t32 a = new t32((byte) 1);
    public static final t32 m = new t32((byte) 2);
    public static final t32 q = new t32((byte) 3);
    public static final t32 w = new t32((byte) 4);
    public static final t32 c = new t32((byte) 5);
    public static final t32 i = new t32((byte) 6);
    public static final t32 b = new t32((byte) 7);
    public static final up s = new up(24);
    public static final t32 p = new t32((byte) 9);
    public static final /* synthetic */ t32 u = new t32((byte) 10);
    public static final t32 z = new t32((byte) 11);

    public t32(RecyclerView recyclerView, ql2 ql2Var) {
        this.j = (byte) 13;
        xs2.l(recyclerView != null);
        xs2.l(ql2Var != null);
    }

    public static t45 c(h02 h02Var) {
        rj0 rj0Var = (rj0) h02Var.a(tj0.g);
        t45 t45VarY = rj0Var.q0;
        if (t45VarY == null) {
            h02Var.X(390452338);
            h02Var.b(false);
            t45VarY = null;
        } else {
            h02Var.X(390452339);
            x75 x75Var = (x75) h02Var.a(y75.g);
            if (!yf2.p(t45VarY.m, x75Var)) {
                t45VarY = t45VarY.y(t45VarY.g, t45VarY.y, t45VarY.r, t45VarY.n, t45VarY.v, t45VarY.x, t45VarY.l, t45VarY.j, t45VarY.t, t45VarY.a, x75Var, t45VarY.q, t45VarY.w, t45VarY.c, t45VarY.i, t45VarY.b, t45VarY.s, t45VarY.p, t45VarY.u, t45VarY.z, t45VarY.h, t45VarY.o, t45VarY.f, t45VarY.k, t45VarY.d, t45VarY.e, t45VarY.A, t45VarY.B, t45VarY.C, t45VarY.D, t45VarY.E, t45VarY.F, t45VarY.G, t45VarY.H, t45VarY.I, t45VarY.J, t45VarY.K, t45VarY.L, t45VarY.M, t45VarY.N, t45VarY.O, t45VarY.P, t45VarY.Q);
                rj0Var.q0 = t45VarY;
            }
            h02Var.b(false);
        }
        if (t45VarY != null) {
            h02Var.X(-1788515437);
            h02Var.b(false);
            return t45VarY;
        }
        h02Var.X(-1788321191);
        long jN = tj0.n(rj0Var, yc6.b);
        long jN2 = tj0.n(rj0Var, yc6.o);
        sj0 sj0Var = yc6.r;
        long jY = jj0.y(0.38f, tj0.n(rj0Var, sj0Var));
        long jN3 = tj0.n(rj0Var, yc6.a);
        long j = jj0.l;
        long jN4 = tj0.n(rj0Var, yc6.g);
        long jN5 = tj0.n(rj0Var, yc6.t);
        x75 x75Var2 = (x75) h02Var.a(y75.g);
        long jN6 = tj0.n(rj0Var, yc6.u);
        long jN7 = tj0.n(rj0Var, yc6.B);
        long jY2 = jj0.y(0.12f, tj0.n(rj0Var, yc6.x));
        long jN8 = tj0.n(rj0Var, yc6.w);
        long jN9 = tj0.n(rj0Var, yc6.p);
        long jN10 = tj0.n(rj0Var, yc6.A);
        long jY3 = jj0.y(0.38f, tj0.n(rj0Var, yc6.v));
        long jN11 = tj0.n(rj0Var, yc6.q);
        long jN12 = tj0.n(rj0Var, yc6.h);
        long jN13 = tj0.n(rj0Var, yc6.D);
        long jY4 = jj0.y(0.38f, tj0.n(rj0Var, yc6.j));
        long jN14 = tj0.n(rj0Var, yc6.i);
        long jN15 = tj0.n(rj0Var, yc6.s);
        long jN16 = tj0.n(rj0Var, yc6.e);
        long jY5 = jj0.y(0.38f, tj0.n(rj0Var, yc6.n));
        long jN17 = tj0.n(rj0Var, yc6.m);
        sj0 sj0Var2 = yc6.f;
        long jN18 = tj0.n(rj0Var, sj0Var2);
        long jN19 = tj0.n(rj0Var, sj0Var2);
        long jY6 = jj0.y(0.38f, tj0.n(rj0Var, sj0Var));
        long jN20 = tj0.n(rj0Var, sj0Var2);
        long jN21 = tj0.n(rj0Var, yc6.z);
        long jN22 = tj0.n(rj0Var, yc6.C);
        long jY7 = jj0.y(0.38f, tj0.n(rj0Var, yc6.l));
        long jN23 = tj0.n(rj0Var, yc6.c);
        sj0 sj0Var3 = yc6.k;
        long jN24 = tj0.n(rj0Var, sj0Var3);
        long jN25 = tj0.n(rj0Var, sj0Var3);
        long jY8 = jj0.y(0.38f, tj0.n(rj0Var, sj0Var3));
        long jN26 = tj0.n(rj0Var, sj0Var3);
        sj0 sj0Var4 = yc6.d;
        t45 t45Var = new t45(jN, jN2, jY, jN3, j, j, j, j, jN4, jN5, x75Var2, jN6, jN7, jY2, jN8, jN9, jN10, jY3, jN11, jN12, jN13, jY4, jN14, jN15, jN16, jY5, jN17, jN18, jN19, jY6, jN20, jN21, jN22, jY7, jN23, jN24, jN25, jY8, jN26, tj0.n(rj0Var, sj0Var4), tj0.n(rj0Var, sj0Var4), jj0.y(0.38f, tj0.n(rj0Var, sj0Var4)), tj0.n(rj0Var, sj0Var4));
        rj0Var.q0 = t45Var;
        h02Var.b(false);
        return t45Var;
    }

    public static i14 i(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return i14.a;
        }
        if (str.equals("http/1.1")) {
            return i14.m;
        }
        if (str.equals("h2_prior_knowledge")) {
            return i14.c;
        }
        if (str.equals("h2")) {
            return i14.w;
        }
        if (str.equals("spdy/3.1")) {
            return i14.q;
        }
        if (str.equals("quic")) {
            return i14.i;
        }
        if (ay4.P(str, "h3", false)) {
            return i14.b;
        }
        uo1.t("Unexpected protocol: ".concat(str));
        return null;
    }

    public static final boolean p(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        dx5 dx5Var;
        int i2;
        if (packageInfo != null) {
            boolean z2 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                dx5 dx5Var2 = z2 ? zg6.r : zg6.y;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        qw5 qw5Var = zw5.t;
                        Object[] objArr = {byteArray};
                        ic6.v(1, objArr);
                        dx5Var = new dx5(1, objArr);
                    } else {
                        qw5 qw5Var2 = zw5.t;
                        dx5Var = dx5.q;
                    }
                } else {
                    if (i3 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        qw5 qw5Var3 = zw5.t;
                        dx5Var = dx5.q;
                    } else {
                        qw5 qw5Var4 = zw5.t;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i4].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i6 = i5 + 1;
                            if (i6 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i6 <= length2) {
                                i2 = length2;
                            } else {
                                i2 = (length2 >> 1) + length2 + 1;
                                if (i2 < i6) {
                                    int iHighestOneBit = Integer.highestOneBit(i5);
                                    i2 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i2 < 0) {
                                    i2 = Integer.MAX_VALUE;
                                }
                            }
                            if (i2 > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                            }
                            objArrCopyOf[i5] = byteArray2;
                            i4++;
                            i5 = i6;
                        }
                        dx5Var = i5 == 0 ? dx5.q : new dx5(i5, objArrCopyOf);
                    }
                }
                if (dx5Var.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                zw5 zw5VarX = dx5Var.x();
                int size = zw5VarX.size();
                int i7 = 0;
                while (i7 < size) {
                    byte[] bArr = (byte[]) zw5VarX.get(i7);
                    qw5 qw5VarJ = dx5Var2.listIterator(0);
                    do {
                        int i8 = i7 + 1;
                        if (!qw5VarJ.hasNext()) {
                            i7 = i8;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) qw5VarJ.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z2 ? u(packageInfo, zg6.g) : u(packageInfo, zg6.g[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static sb6 u(PackageInfo packageInfo, sb6... sb6VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            kd6 kd6Var = new kd6(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < sb6VarArr.length; i2++) {
                if (sb6VarArr[i2].equals(kd6Var)) {
                    return sb6VarArr[i2];
                }
            }
        }
        return null;
    }

    @Override // defpackage.vy4
    public nj6 a(Object obj) {
        Bundle bundle = (Bundle) obj;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? br2.s(bundle) : br2.s(null);
    }

    @Override // defpackage.xb5
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    public void b(Rect rect, View view) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // defpackage.hq5
    public dq5 g(ContextWrapper contextWrapper, k51 k51Var) {
        r50 r50Var;
        Context baseContext = contextWrapper;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = contextWrapper;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper2.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            r50.g.getClass();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                r50Var = s50.j;
            } else if (i2 >= 29) {
                r50Var = bi6.m;
            } else {
                r50Var = i2 >= 28 ? m : aj6.a;
            }
            return new dq5(new p50(r50Var.x(activity)), k51Var.r(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            l0.u("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new dq5(new Rect(0, 0, point.x, point.y), k51Var.r(contextWrapper));
    }

    @Override // defpackage.aa3
    public boolean l() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0126  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    /* JADX WARN: Code duplicated, block: B:90:0x0162  */
    /* JADX WARN: Code duplicated, block: B:92:0x016a  */
    /* JADX WARN: Code duplicated, block: B:93:0x016d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0179  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f1  */
    public void m(final boolean z2, final boolean z3, final ve2 ve2Var, j73 j73Var, final t45 t45Var, final cn4 cn4Var, float f, float f2, h02 h02Var, final int i2, final int i3) {
        j73 j73Var2;
        int i4;
        int i5;
        int i6;
        float f3;
        float f4;
        boolean z4;
        final j73 j73Var3;
        final float f5;
        final float f6;
        u34 u34VarP;
        j73 j73Var4;
        float f7;
        int i7;
        float f8;
        boolean zBooleanValue;
        long jN;
        f83 f83Var;
        zu4 zu4VarF;
        float f9;
        f83 f83Var2;
        boolean z5;
        bw4 bw4VarQ;
        zu4 zu4VarF2;
        bw4 bw4VarQ2;
        float f10;
        h02Var.Z(1035477640);
        int i8 = (h02Var.l(z2) ? 4 : 2) | i2 | (h02Var.l(z3) ? 32 : 16) | (h02Var.x(ve2Var) ? 256 : 128);
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                j73Var2 = j73Var;
                i8 |= h02Var.x(j73Var2) ? 2048 : 1024;
            }
            if (h02Var.x(t45Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            int i10 = i8 | i4;
            if (h02Var.x(cn4Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i6 = i10 | i5;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    f3 = f;
                    int i11 = h02Var.r(f3) ? 1048576 : 524288;
                    i6 |= i11;
                } else {
                    f3 = f;
                }
                i6 |= i11;
            } else {
                f3 = f;
            }
            if ((12582912 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    f4 = f2;
                    int i12 = h02Var.r(f4) ? 8388608 : 4194304;
                    i6 |= i12;
                } else {
                    f4 = f2;
                }
                i6 |= i12;
            } else {
                f4 = f2;
            }
            if ((38347923 & i6) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (h02Var.N(i6 & 1, z4)) {
                h02Var.S();
                if ((i2 & 1) != 0 || h02Var.k()) {
                    if (i9 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                        f7 = 2.0f;
                    } else {
                        f7 = f3;
                    }
                    if ((i3 & 128) != 0) {
                        j73 j73Var5 = j73Var4;
                        i7 = i6 & (-29360129);
                        j73Var3 = j73Var5;
                        f8 = f7;
                        f4 = 1.0f;
                    } else {
                        j73 j73Var6 = j73Var4;
                        i7 = i6;
                        j73Var3 = j73Var6;
                        f8 = f7;
                    }
                } else {
                    h02Var.Q();
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i6 &= -29360129;
                    }
                    i7 = i6;
                    j73Var3 = j73Var2;
                    f8 = f3;
                }
                h02Var.s();
                zBooleanValue = ((Boolean) xf6.g(ve2Var, h02Var, (i7 >> 6) & 14).getValue()).booleanValue();
                jN = t45Var.n(z2, z3, zBooleanValue);
                f83Var = f83.m;
                zu4VarF = jr2.F(f83Var, h02Var);
                if (z2) {
                    h02Var.X(-1674507999);
                    f83Var2 = f83Var;
                    z5 = zBooleanValue;
                    f9 = f4;
                    bw4VarQ = aq4.g(jN, zu4VarF, null, h02Var, 0, 12);
                    h02Var.b(false);
                } else {
                    f9 = f4;
                    f83Var2 = f83Var;
                    z5 = zBooleanValue;
                    h02Var.X(-1674427244);
                    bw4VarQ = kq2.Q(new jj0(jN), h02Var);
                    h02Var.b(false);
                }
                zu4VarF2 = jr2.F(f83.t, h02Var);
                if (z2) {
                    h02Var.X(-1674245832);
                    if (z5) {
                        f10 = f8;
                    } else {
                        f10 = f9;
                    }
                    bw4VarQ2 = ug.g(f10, zu4VarF2, h02Var, 12);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1674063769);
                    bw4VarQ2 = kq2.Q(new vb1(f9), h02Var);
                    h02Var.b(false);
                }
                ob3 ob3VarQ = kq2.Q(gp4.x(((vb1) bw4VarQ2.getValue()).j, ((jj0) bw4VarQ.getValue()).g), h02Var);
                bw4 bw4VarG = aq4.g(t45Var.g(z2, z3, z5), jr2.F(f83Var2, h02Var), null, h02Var, 0, 12);
                z40 z40Var = (z40) ob3VarQ.getValue();
                z50.g(a11.c(j73Var3.n(new y40(z40Var.g, z40Var.y, cn4Var)), new kn2(cn4Var, new zg4(new xx2(bw4VarG, bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1), (byte) 1), (byte) 19)), h02Var, 0);
                f6 = f9;
                f5 = f8;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                f5 = f3;
                f6 = f4;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: an3
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.j.m(z2, z3, ve2Var, j73Var3, t45Var, cn4Var, f5, f6, (h02) obj, aq2.J(i2 | 1), i3);
                        return og5.g;
                    }
                };
            }
        }
        i8 |= 3072;
        j73Var2 = j73Var;
        if (h02Var.x(t45Var)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i13 = i8 | i4;
        if (h02Var.x(cn4Var)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        i6 = i13 | i5;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f3 = f;
                if (h02Var.r(f3)) {
                }
                i6 |= i11;
            } else {
                f3 = f;
            }
            i6 |= i11;
        } else {
            f3 = f;
        }
        if ((12582912 & i2) == 0) {
            if ((i3 & 128) == 0) {
                f4 = f2;
                if (h02Var.r(f4)) {
                }
                i6 |= i12;
            } else {
                f4 = f2;
            }
            i6 |= i12;
        } else {
            f4 = f2;
        }
        if ((38347923 & i6) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (h02Var.N(i6 & 1, z4)) {
            h02Var.S();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i3 & 128) != 0) {
                    j73 j73Var7 = j73Var4;
                    i7 = i6 & (-29360129);
                    j73Var3 = j73Var7;
                    f8 = f7;
                    f4 = 1.0f;
                } else {
                    j73 j73Var8 = j73Var4;
                    i7 = i6;
                    j73Var3 = j73Var8;
                    f8 = f7;
                }
            } else {
                if (i9 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i3 & 128) != 0) {
                    j73 j73Var9 = j73Var4;
                    i7 = i6 & (-29360129);
                    j73Var3 = j73Var9;
                    f8 = f7;
                    f4 = 1.0f;
                } else {
                    j73 j73Var10 = j73Var4;
                    i7 = i6;
                    j73Var3 = j73Var10;
                    f8 = f7;
                }
            }
            h02Var.s();
            zBooleanValue = ((Boolean) xf6.g(ve2Var, h02Var, (i7 >> 6) & 14).getValue()).booleanValue();
            jN = t45Var.n(z2, z3, zBooleanValue);
            f83Var = f83.m;
            zu4VarF = jr2.F(f83Var, h02Var);
            if (z2) {
                h02Var.X(-1674507999);
                f83Var2 = f83Var;
                z5 = zBooleanValue;
                f9 = f4;
                bw4VarQ = aq4.g(jN, zu4VarF, null, h02Var, 0, 12);
                h02Var.b(false);
            } else {
                f9 = f4;
                f83Var2 = f83Var;
                z5 = zBooleanValue;
                h02Var.X(-1674427244);
                bw4VarQ = kq2.Q(new jj0(jN), h02Var);
                h02Var.b(false);
            }
            zu4VarF2 = jr2.F(f83.t, h02Var);
            if (z2) {
                h02Var.X(-1674245832);
                if (z5) {
                    f10 = f8;
                } else {
                    f10 = f9;
                }
                bw4VarQ2 = ug.g(f10, zu4VarF2, h02Var, 12);
                h02Var.b(false);
            } else {
                h02Var.X(-1674063769);
                bw4VarQ2 = kq2.Q(new vb1(f9), h02Var);
                h02Var.b(false);
            }
            ob3 ob3VarQ2 = kq2.Q(gp4.x(((vb1) bw4VarQ2.getValue()).j, ((jj0) bw4VarQ.getValue()).g), h02Var);
            bw4 bw4VarG2 = aq4.g(t45Var.g(z2, z3, z5), jr2.F(f83Var2, h02Var), null, h02Var, 0, 12);
            z40 z40Var2 = (z40) ob3VarQ2.getValue();
            z50.g(a11.c(j73Var3.n(new y40(z40Var2.g, z40Var2.y, cn4Var)), new kn2(cn4Var, new zg4(new xx2(bw4VarG2, bw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 1), (byte) 1), (byte) 19)), h02Var, 0);
            f6 = f9;
            f5 = f8;
        } else {
            h02Var.Q();
            j73Var3 = j73Var2;
            f5 = f3;
            f6 = f4;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: an3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.j.m(z2, z3, ve2Var, j73Var3, t45Var, cn4Var, f5, f6, (h02) obj, aq2.J(i2 | 1), i3);
                    return og5.g;
                }
            };
        }
    }

    public void q(final String str, final bz1 bz1Var, final boolean z2, final boolean z3, zm5 zm5Var, final ve2 ve2Var, final boolean z4, final bz1 bz1Var2, final t45 t45Var, zn3 zn3Var, final nm0 nm0Var, h02 h02Var, final int i2) {
        int i3;
        boolean z5;
        zm5 zm5Var2;
        final zn3 zn3Var2;
        zn3 bo3Var;
        int i4;
        nm0 nm0Var2;
        h02Var.Z(-1732281618);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.x(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.j(bz1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z2;
            i3 |= h02Var.l(z5) ? 256 : 128;
        } else {
            z5 = z2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= h02Var.l(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            zm5Var2 = zm5Var;
            i3 |= h02Var.x(zm5Var2) ? 16384 : 8192;
        } else {
            zm5Var2 = zm5Var;
        }
        if ((i2 & 196608) == 0) {
            i3 |= h02Var.x(ve2Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= h02Var.l(z4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= h02Var.j(bz1Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= h02Var.j(null) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= h02Var.j(null) ? 536870912 : 268435456;
        }
        int i5 = 14155776 | (h02Var.j(null) ? 4 : 2) | (h02Var.j(null) ? 32 : 16) | (h02Var.j(null) ? 256 : 128) | (h02Var.j(null) ? 2048 : 1024) | (h02Var.x(t45Var) ? 16384 : 8192) | 65536;
        if (h02Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (4793491 & i5) == 4793490) ? false : true)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                bo3Var = new bo3(16.0f, 16.0f, 16.0f, 16.0f);
                i4 = i5 & (-458753);
            } else {
                h02Var.Q();
                i4 = i5 & (-458753);
                bo3Var = zn3Var;
            }
            h02Var.s();
            boolean z6 = ((i3 & 57344) == 16384) | ((i3 & 14) == 4);
            Object objK = h02Var.K();
            if (z6 || objK == oo0.g) {
                cj cjVar = new cj(str);
                zm5Var2.getClass();
                objK = new wb5(cjVar, zi3.g);
                h02Var.i0(objK);
            }
            String str2 = ((wb5) objK).g.t;
            j55 j55Var = new j55();
            if (bz1Var2 == null) {
                h02Var.X(1927058812);
                h02Var.b(false);
                nm0Var2 = null;
            } else {
                h02Var.X(1927058813);
                nm0 nm0VarM0 = ue5.m0(-1459717586, new ye0(bz1Var2, (byte) 1), h02Var);
                h02Var.b(false);
                nm0Var2 = nm0VarM0;
            }
            int i6 = i3 >> 9;
            int i7 = i4 << 21;
            zn3 zn3Var3 = bo3Var;
            zi6.g(j65.t, str2, bz1Var, j55Var, nm0Var2, null, null, null, z3, z5, z4, ve2Var, zn3Var3, t45Var, nm0Var, h02Var, ((i3 << 3) & 896) | 6 | (i6 & 458752) | (i6 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i6 & 7168) | (i3 & 896) | ((i4 >> 9) & 14) | ((i3 >> 6) & 112) | ((i3 >> 3) & 57344) | ((i4 << 6) & 3670016) | 12582912);
            zn3Var2 = zn3Var3;
        } else {
            h02Var.Q();
            zn3Var2 = zn3Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final zm5 zm5Var3 = zm5Var2;
            u34VarP.n = new bz1() { // from class: bn3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i2 | 1);
                    this.j.q(str, bz1Var, z2, z3, zm5Var3, ve2Var, z4, bz1Var2, t45Var, zn3Var2, nm0Var, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    @Override // defpackage.k51
    public float r(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.aa3
    public boolean v() {
        return false;
    }

    public void w(Drawable drawable, h02 h02Var, int i2) {
        h02Var.Z(257732500);
        byte b2 = 2;
        int i3 = (h02Var.j(drawable) ? 4 : 2) | i2;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            j73 j73VarJ = mq4.j(g73.g, iu0.v);
            boolean zJ = h02Var.j(drawable);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new ll2(drawable, (byte) 21);
                h02Var.i0(objK);
            }
            z50.g(a11.w(j73VarJ, (xy1) objK), h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new jp4(b2, i2, this, drawable);
        }
    }

    @Override // defpackage.r50
    public Rect x(Activity activity) throws Exception {
        q50 q50Var = r50.g;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutN = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            q50Var.getClass();
            Log.w(q50.y, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (z1.u(obj2)) {
                    displayCutoutN = z1.n(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                q50Var.getClass();
                Log.w(q50.y, e2);
            }
            if (displayCutoutN != null) {
                if (rect.left == displayCutoutN.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutN.getSafeInsetRight()) {
                    rect.right = displayCutoutN.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutN.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutN.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutN.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // defpackage.o50
    public long y(int i2, si0 si0Var) {
        return ((j75) si0Var.v).a(i2);
    }

    public t32(qd qdVar) {
        this.j = (byte) 29;
    }

    public /* synthetic */ t32(byte b2) {
        this.j = b2;
    }

    @Override // defpackage.aa3
    public void t() {
    }

    @Override // defpackage.aj3
    public int j(int i2) {
        return i2;
    }

    @Override // defpackage.aj3
    public int n(int i2) {
        return i2;
    }

    public void s(sv3 sv3Var, int i2, int i3) {
    }
}
