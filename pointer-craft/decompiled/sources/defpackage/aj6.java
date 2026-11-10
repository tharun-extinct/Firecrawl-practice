package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import io.appground.blehid.BleHidService;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class aj6 implements r50, o50, xb5, nu0, xq, ex0, bu3, kf4 {
    public static aj6 t;
    public final /* synthetic */ byte j;
    public static final aj6 a = new aj6(1);
    public static final up m = new up((byte) 3);
    public static final aj6 q = new aj6(3);
    public static final aj6 w = new aj6(4);
    public static final aj6 c = new aj6(5);
    public static final aj6 i = new aj6(6);
    public static final up b = new up((byte) 22);
    public static final up s = new up((byte) 23);
    public static final zm5 p = new zm5();
    public static final /* synthetic */ aj6 u = new aj6(9);
    public static final aj6 z = new aj6(10);

    public /* synthetic */ aj6(byte b2) {
        this.j = b2;
    }

    public static final UUID a() {
        UUID uuid = BleHidService.W;
        return (UUID) BleHidService.k0.getValue();
    }

    public static Typeface b(String str, qv1 qv1Var, int i2) {
        if (i2 == 0 && yf2.p(qv1Var, qv1.z) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iV = ah6.v(qv1Var, i2);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iV) : Typeface.create(str, iV);
    }

    public static final UUID c() {
        UUID uuid = BleHidService.W;
        return (UUID) BleHidService.Y.getValue();
    }

    public static fa0 f(byte[] bArr) {
        fa0 fa0Var = fa0.m;
        int length = bArr.length;
        ui4.g(bArr.length, 0L, length);
        return new fa0(pr.R(bArr, 0, length));
    }

    public static jf0 h(String str) {
        jf0 jf0Var = new jf0(str);
        jf0.n.put(str, jf0Var);
        return jf0Var;
    }

    public static final UUID i() {
        UUID uuid = BleHidService.W;
        return (UUID) BleHidService.g0.getValue();
    }

    public static final UUID l() {
        return (UUID) BleHidService.f0.getValue();
    }

    public static final UUID m() {
        return (UUID) BleHidService.i0.getValue();
    }

    public static fa0 p(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(od0.g);
        bytes.getClass();
        fa0 fa0Var = new fa0(bytes);
        fa0Var.a = str;
        return fa0Var;
    }

    public static final UUID q() {
        return (UUID) BleHidService.j0.getValue();
    }

    public static fa0 s(String str) {
        if (str.length() % 2 != 0) {
            l0.t("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (pf6.g(str.charAt(i3 + 1)) + (pf6.g(str.charAt(i3)) << 4));
        }
        return new fa0(bArr);
    }

    public static final UUID t() {
        UUID uuid = BleHidService.W;
        return (UUID) BleHidService.l0.getValue();
    }

    public static final UUID w() {
        return (UUID) BleHidService.Z.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static x95 z(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return x95.q;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return x95.m;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return x95.a;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return x95.w;
            }
        } else if (str.equals("SSLv3")) {
            return x95.c;
        }
        l0.u("Unexpected TLS version: ".concat(str));
        return null;
    }

    @Override // defpackage.xb5
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.xq
    public void j(j51 j51Var, int i2, int[] iArr, fl2 fl2Var, int[] iArr2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int length = iArr.length;
        int i6 = i2 - i4;
        int i7 = 0;
        while (i3 < length) {
            int i8 = iArr[i3];
            iArr2[i7] = i6;
            i6 += i8;
            i3++;
            i7++;
        }
    }

    @Override // defpackage.bu3
    public Typeface n(g12 g12Var, qv1 qv1Var, int i2) {
        String strConcat = g12Var.w;
        int i3 = qv1Var.j / 100;
        if (i3 >= 0 && i3 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i3 && i3 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i3 != 4) {
            if (i3 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i3 || i3 >= 8) && 8 <= i3 && i3 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceB = b(strConcat, qv1Var, i2);
            if (!yf2.p(typefaceB, Typeface.create(Typeface.DEFAULT, ah6.v(qv1Var, i2))) && !yf2.p(typefaceB, b(null, qv1Var, i2))) {
                typeface = typefaceB;
            }
        }
        return typeface == null ? b(g12Var.w, qv1Var, i2) : typeface;
    }

    @Override // defpackage.nu0
    public Object o(nj6 nj6Var) throws IOException {
        if (nj6Var.t()) {
            return (Bundle) nj6Var.l();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(nj6Var.x());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", nj6Var.x());
    }

    @Override // defpackage.bu3
    public Typeface r(qv1 qv1Var, int i2) {
        return b(null, qv1Var, i2);
    }

    public String toString() {
        switch (this.j) {
            case 12:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }

    public synchronized jf0 u(String str) {
        jf0 jf0Var;
        String strConcat;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = jf0.n;
            jf0Var = (jf0) linkedHashMap.get(str);
            if (jf0Var == null) {
                if (ay4.P(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = ay4.P(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                jf0Var = (jf0) linkedHashMap.get(strConcat);
                if (jf0Var == null) {
                    jf0Var = new jf0(str);
                }
                linkedHashMap.put(str, jf0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jf0Var;
    }

    public void v(final j73 j73Var, float f, long j, h02 h02Var, final int i2) {
        final float f2;
        final long j2;
        float f3;
        long jV;
        h02Var.Z(-1498258020);
        int i3 = (h02Var.x(j73Var) ? 4 : 2) | i2 | 176;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                f3 = qx3.y;
                jV = tj0.v(qx3.g, h02Var);
            } else {
                h02Var.Q();
                f3 = f;
                jV = j;
            }
            h02Var.s();
            z50.g(og0.a(mq4.n(mq4.r(j73Var, 1.0f), f3), jV, yf2.b), h02Var, 0);
            j2 = jV;
            f2 = f3;
        } else {
            h02Var.Q();
            f2 = f;
            j2 = j;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(j73Var, f2, j2, i2) { // from class: r15
                public final /* synthetic */ float a;
                public final /* synthetic */ long m;
                public final /* synthetic */ j73 t;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(3073);
                    this.j.v(this.t, this.a, this.m, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    @Override // defpackage.r50
    public Rect x(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
                return rect;
            }
            int i3 = rect.right + dimensionPixelSize;
            if (i3 == point.x) {
                rect.right = i3;
            }
        }
        return rect;
    }

    @Override // defpackage.o50
    public long y(int i2, si0 si0Var) {
        String str = ((j75) si0Var.v).g.g.t;
        return sp2.y(qg6.r(str, i2), qg6.y(str, i2));
    }

    @Override // defpackage.kf4
    public void onScrollLimit(int i2, int i3, int i4, boolean z2) {
    }

    @Override // defpackage.kf4
    public void onScrollProgress(int i2, int i3, int i4, int i5) {
    }
}
