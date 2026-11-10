package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jh6 {
    public static final void g(int i, h02 h02Var) {
        h02Var.Z(1257244356);
        if (i == 0 && h02Var.e()) {
            h02Var.Q();
        } else {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = y92.i;
                h02Var.i0(objK);
            }
            my1 my1Var = (my1) ((nz1) objK);
            h02Var.Y(-1115894518);
            h02Var.Y(1886828752);
            if (!(h02Var.g instanceof lq)) {
                pw5.f();
                throw null;
            }
            h02Var.V();
            if (h02Var.S) {
                h02Var.m(new x92(my1Var));
            } else {
                h02Var.l0();
            }
            h02Var.b(true);
            h02Var.b(false);
            h02Var.b(false);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vq0(i, (byte) 4);
        }
    }

    public static final boolean n(ah1 ah1Var) {
        if (ah1Var instanceof dh1) {
            return true;
        }
        if (ah1Var instanceof jh1) {
            ArrayList arrayList = ((jh1) ah1Var).y;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (n((ah1) obj)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    public static byte[] r(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoE = is5.g(context).E(str, 64);
        Signature[] signatureArr = packageInfoE.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i = 0; i < 2; i++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfoE.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoE.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static final v35 y(o41 o41Var) {
        g45 g45Var;
        t35 t35Var = new t35();
        sp2.k(o41Var, x35.g, new ll2(new ll2(t35Var, (byte) 22), new fd(1, t35Var, t35.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 4), (byte) 23));
        xa3 xa3Var = new xa3();
        xa3 xa3Var2 = t35Var.g;
        Object[] objArr = xa3Var2.g;
        int i = xa3Var2.y;
        int i2 = 0;
        boolean z = true;
        u35 u35Var = null;
        while (true) {
            g45Var = g45.y;
            if (i2 >= i) {
                break;
            }
            u35 u35Var2 = (u35) objArr[i2];
            if (!z || u35Var2 != g45Var) {
                if (u35Var2 == g45Var && u35Var == g45Var) {
                    z = false;
                } else {
                    if (u35Var2 != g45Var) {
                        xa3 xa3Var3 = t35Var.y;
                        Object[] objArr2 = xa3Var3.g;
                        int i3 = xa3Var3.y;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((xy1) objArr2[i4]).a(u35Var2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    xa3Var.g(u35Var2);
                    z = false;
                    u35Var = u35Var2;
                }
            }
            i2++;
        }
        if (((u35) (xa3Var.t() ? null : xa3Var.g[xa3Var.y - 1])) == g45Var) {
            xa3Var.q(xa3Var.y - 1);
        }
        va3 va3Var = xa3Var.r;
        if (va3Var == null) {
            va3Var = new va3(xa3Var);
            xa3Var.r = va3Var;
        }
        return new v35(va3Var);
    }
}
