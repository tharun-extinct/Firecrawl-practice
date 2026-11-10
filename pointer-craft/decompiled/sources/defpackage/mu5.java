package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.g;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mu5 {
    public final /* synthetic */ byte g;
    public static final int[] y = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] r = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] n = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] v = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] x = {R.attr.drawable};
    public static final int[] l = {R.attr.name, R.attr.animation};

    public /* synthetic */ mu5(byte b) {
        this.g = b;
    }

    public static final cj a(k65 k65Var) {
        cj cjVar = k65Var.g;
        long j = k65Var.y;
        cjVar.getClass();
        return cjVar.subSequence(u75.x(j), u75.v(j));
    }

    public static int g(List list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            p33 p33Var = (p33) list.get(i3);
            float fH = kq2.H(kq2.E(p33Var));
            if (fH == 0.0f) {
                int iMin2 = Math.min(p33Var.Y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p33Var.x(iMin2));
            } else if (fH > 0.0f) {
                f += fH;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            p33 p33Var2 = (p33) list.get(i4);
            float fH2 = kq2.H(kq2.E(p33Var2));
            if (fH2 > 0.0f) {
                iMax = Math.max(iMax, p33Var2.x(iRound != Integer.MAX_VALUE ? Math.round(iRound * fH2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int j(List list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            p33 p33Var = (p33) list.get(i3);
            float fH = kq2.H(kq2.E(p33Var));
            if (fH == 0.0f) {
                int iMin2 = Math.min(p33Var.x(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p33Var.P(iMin2));
            } else if (fH > 0.0f) {
                f += fH;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            p33 p33Var2 = (p33) list.get(i4);
            float fH2 = kq2.H(kq2.E(p33Var2));
            if (fH2 > 0.0f) {
                iMax = Math.max(iMax, p33Var2.P(iRound != Integer.MAX_VALUE ? Math.round(iRound * fH2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int l(List list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            p33 p33Var = (p33) list.get(i4);
            float fH = kq2.H(kq2.E(p33Var));
            int iZ = p33Var.Z(i);
            if (fH == 0.0f) {
                i3 += iZ;
            } else if (fH > 0.0f) {
                f += fH;
                iMax = Math.max(iMax, Math.round(iZ / fH));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static final cj m(k65 k65Var, int i) {
        cj cjVar = k65Var.g;
        cj cjVar2 = k65Var.g;
        long j = k65Var.y;
        int iV = u75.v(j);
        int iV2 = u75.v(j);
        int length = iV2 + i;
        if (((i ^ length) & (iV2 ^ length)) < 0) {
            length = cjVar2.t.length();
        }
        return cjVar.subSequence(iV, Math.min(length, cjVar2.t.length()));
    }

    public static int n(List list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            p33 p33Var = (p33) list.get(i4);
            float fH = kq2.H(kq2.E(p33Var));
            int iP = p33Var.P(i);
            if (fH == 0.0f) {
                i3 += iP;
            } else if (fH > 0.0f) {
                f += fH;
                iMax = Math.max(iMax, Math.round(iP / fH));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static final cj q(k65 k65Var, int i) {
        cj cjVar = k65Var.g;
        long j = k65Var.y;
        int iX = u75.x(j);
        int i2 = iX - i;
        if (((iX ^ i2) & (i ^ iX)) < 0) {
            i2 = 0;
        }
        return cjVar.subSequence(Math.max(0, i2), u75.x(j));
    }

    public static int r(List list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            p33 p33Var = (p33) list.get(i3);
            float fH = kq2.H(kq2.E(p33Var));
            if (fH == 0.0f) {
                int iMin2 = Math.min(p33Var.Y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p33Var.Z(iMin2));
            } else if (fH > 0.0f) {
                f += fH;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            p33 p33Var2 = (p33) list.get(i4);
            float fH2 = kq2.H(kq2.E(p33Var2));
            if (fH2 > 0.0f) {
                iMax = Math.max(iMax, p33Var2.Z(iRound != Integer.MAX_VALUE ? Math.round(iRound * fH2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int v(List list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            p33 p33Var = (p33) list.get(i4);
            float fH = kq2.H(kq2.E(p33Var));
            int iX = p33Var.x(i);
            if (fH == 0.0f) {
                i3 += iX;
            } else if (fH > 0.0f) {
                f += fH;
                iMax = Math.max(iMax, Math.round(iX / fH));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static int x(List list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            p33 p33Var = (p33) list.get(i3);
            float fH = kq2.H(kq2.E(p33Var));
            if (fH == 0.0f) {
                int iMin2 = Math.min(p33Var.x(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p33Var.Y(iMin2));
            } else if (fH > 0.0f) {
                f += fH;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            p33 p33Var2 = (p33) list.get(i4);
            float fH2 = kq2.H(kq2.E(p33Var2));
            if (fH2 > 0.0f) {
                iMax = Math.max(iMax, p33Var2.Y(iRound != Integer.MAX_VALUE ? Math.round(iRound * fH2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int y(List list, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            p33 p33Var = (p33) list.get(i4);
            float fH = kq2.H(kq2.E(p33Var));
            int iY = p33Var.Y(i);
            if (fH == 0.0f) {
                i3 += iY;
            } else if (fH > 0.0f) {
                f += fH;
                iMax = Math.max(iMax, Math.round(iY / fH));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public g t(Context context, Looper looper, rr rrVar, Object obj, n32 n32Var, o32 o32Var) {
        byte b = this.g;
        switch (b) {
            case 0:
                Object obj2 = rrVar.x;
                Integer num = (Integer) rrVar.l;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new pp4(context, looper, rrVar, bundle, n32Var, o32Var);
            case 1:
                throw du4.a(obj);
            default:
                su5 su5Var = (su5) n32Var;
                su5 su5Var2 = (su5) o32Var;
                switch (b) {
                    case 2:
                        return new bw5(context, looper, 308, rrVar, su5Var, su5Var2);
                    case 3:
                        return new qu5(context, looper, 449, rrVar, su5Var, su5Var2);
                    case 4:
                        return new wv5(context, looper, rrVar, (f35) obj, su5Var, su5Var2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
