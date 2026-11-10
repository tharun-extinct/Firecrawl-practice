package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.SystemClock;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class w10 implements n21, p00 {
    public static final /* synthetic */ int F = 0;
    public final co4 A;
    public final co4 B;
    public final co4 C;
    public final ew4 D;
    public final ew4 E;
    public final o00 a;
    public int b;
    public iv4 c;
    public final Set d;
    public final Set e;
    public final HashSet f;
    public final HashMap h;
    public final m70 i;
    public final Application j;
    public final HashSet k;
    public final List m;
    public final HashMap o;
    public int p;
    public final List q;
    public volatile f24 s;
    public final ox0 t;
    public long u;
    public final HashSet w;
    public String z;

    public w10(Application application, ox0 ox0Var, d20 d20Var, String[] strArr, String[] strArr2, String[] strArr3) {
        o00 j26Var;
        byte b;
        this.j = application;
        this.t = ox0Var;
        Application application2 = d20Var.g;
        n00 n00Var = new n00(application2);
        n00Var.r = this;
        n00Var.g = new hi0((byte) 14);
        n00Var.n = true;
        if (n00Var.r == null) {
            l0.u("Please provide a valid listener for purchases updates.");
            throw null;
        }
        if (n00Var.g == null) {
            l0.u("Pending purchases for one-time products must be supported.");
            throw null;
        }
        n00Var.g.getClass();
        w10 w10Var = n00Var.r;
        hi0 hi0Var = n00Var.g;
        if (w10Var != null) {
            w10 w10Var2 = n00Var.r;
            j26Var = n00Var.g() ? new j26(hi0Var, application2, w10Var2, n00Var) : new o00(hi0Var, application2, w10Var2, n00Var);
        } else {
            j26Var = n00Var.g() ? new j26(hi0Var, application2, n00Var) : new o00(hi0Var, application2, n00Var);
        }
        this.a = j26Var;
        this.i = v70.y(-1, 6, null);
        this.u = -14400000L;
        this.h = new HashMap();
        this.o = new HashMap();
        this.f = new HashSet();
        this.k = new HashSet();
        Set setSynchronizedSet = Collections.synchronizedSet(new HashSet());
        setSynchronizedSet.getClass();
        this.d = setSynchronizedSet;
        Set setSynchronizedSet2 = Collections.synchronizedSet(new HashSet());
        setSynchronizedSet2.getClass();
        this.e = setSynchronizedSet2;
        this.A = v70.x(1, 5, null);
        this.B = v70.x(0, 7, null);
        this.C = v70.x(1, 5, null);
        this.D = y94.w(Boolean.FALSE);
        this.E = y94.w(fz3.j);
        List arrayList = strArr == null ? new ArrayList() : pw5.d(Arrays.copyOf(strArr, strArr.length));
        this.m = arrayList;
        List arrayList2 = strArr2 == null ? new ArrayList() : pw5.d(Arrays.copyOf(strArr2, strArr2.length));
        this.q = arrayList2;
        HashSet hashSet = new HashSet();
        this.w = hashSet;
        if (strArr3 != null) {
            hashSet.addAll(pw5.d(Arrays.copyOf(strArr3, strArr3.length)));
        }
        n(arrayList);
        n(arrayList2);
        synchronized (j26Var.g) {
            b = j26Var.y;
        }
        if (b == 1 || b == 2) {
            return;
        }
        if (b == 3) {
            d(-1001, "bind", null);
            return;
        }
        try {
            j26Var.v(this);
        } catch (RuntimeException e) {
            d(-1000, "bind", e.toString());
            m();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:133:0x01da  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean F(o00 o00Var, String str) {
        x20 x20Var;
        if (o00Var.A()) {
            x20 x20Var2 = b36.g;
            switch (str.hashCode()) {
                case -422092961:
                    if (!str.equals("subscriptionsUpdate")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.q ? b36.t : b36.w;
                        o00Var.F(10, 3, x20Var);
                    }
                    break;
                case 96321:
                    if (!str.equals("aaa")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.u ? b36.t : b36.i;
                        o00Var.F(31, 6, x20Var);
                    }
                    break;
                case 97314:
                    if (!str.equals("bbb")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.s ? b36.t : b36.u;
                        o00Var.F(30, 5, x20Var);
                    }
                    break;
                case 98307:
                    if (!str.equals("ccc")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.z ? b36.t : b36.b;
                        o00Var.F(19, 8, x20Var);
                    }
                    break;
                case 99300:
                    if (!str.equals("ddd")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.p ? b36.t : b36.s;
                        o00Var.F(21, 7, x20Var);
                    }
                    break;
                case 100293:
                    if (!str.equals("eee")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.z ? b36.t : b36.b;
                        o00Var.F(61, 9, x20Var);
                    }
                    break;
                case 101286:
                    if (!str.equals("fff")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.h ? b36.t : b36.p;
                        o00Var.F(20, 10, x20Var);
                    }
                    break;
                case 102279:
                    if (!str.equals("ggg")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.o ? b36.t : b36.d;
                        o00Var.F(32, 11, x20Var);
                    }
                    break;
                case 103272:
                    if (!str.equals("hhh")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.o ? b36.t : b36.e;
                        o00Var.F(33, 12, x20Var);
                    }
                    break;
                case 104265:
                    if (!str.equals("iii")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.k ? b36.t : b36.B;
                        o00Var.F(60, 13, x20Var);
                    }
                    break;
                case 105258:
                    if (!str.equals("jjj")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.d ? b36.t : b36.C;
                        o00Var.F(66, 14, x20Var);
                    }
                    break;
                case 106251:
                    if (!str.equals("kkk")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.A ? b36.t : b36.z;
                        o00Var.F(83, 18, x20Var);
                    }
                    break;
                case 107244:
                    if (!str.equals("lll")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.e ? b36.t : b36.h;
                        o00Var.F(104, 19, x20Var);
                    }
                    break;
                case 108237:
                    if (!str.equals("mmm")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.A ? b36.t : b36.o;
                        o00Var.F(119, 20, x20Var);
                    }
                    break;
                case 109230:
                    if (!str.equals("nnn")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.B ? b36.t : b36.f;
                        o00Var.F(138, 21, x20Var);
                    }
                    break;
                case 207616302:
                    if (!str.equals("priceChangeConfirmation")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.i ? b36.t : b36.c;
                        o00Var.F(35, 4, x20Var);
                    }
                    break;
                case 1987365622:
                    if (!str.equals("subscriptions")) {
                        i06.j("BillingClient", "Unsupported feature: ".concat(str));
                        x20Var = b36.k;
                        o00Var.F(34, 1, x20Var);
                    } else {
                        x20Var = o00Var.m ? b36.t : b36.q;
                        o00Var.F(9, 2, x20Var);
                    }
                    break;
                default:
                    i06.j("BillingClient", "Unsupported feature: ".concat(str));
                    x20Var = b36.k;
                    o00Var.F(34, 1, x20Var);
                    break;
            }
        } else {
            x20Var = b36.a;
            if (x20Var.g != 0) {
                o00Var.G(2, 5, x20Var);
            } else {
                try {
                    int i = m26.g;
                    o00Var.o(m26.r(5, mc6.t));
                } catch (Throwable th) {
                    i06.t("BillingClient", "Unable to log.", th);
                }
            }
        }
        return x20Var.g == 0;
    }

    public static void h(SharedPreferences.Editor editor, String str, s00 s00Var) {
        editor.putInt(xi3.t("SKU_", str), s00Var.ordinal());
        s00 s00Var2 = s00.m;
        if (s00Var == s00Var2 && l(str) == null) {
            editor.putLong(xi3.t("SKU_CONFIRMED_", str), System.currentTimeMillis());
        }
        if (s00Var == s00.a || s00Var == s00Var2) {
            editor.remove("SKU_EMPTY_SINCE_" + str);
        }
    }

    public static Long l(String str) {
        SharedPreferences sharedPreferences = d52.b;
        sharedPreferences.getClass();
        long j = sharedPreferences.getLong("SKU_CONFIRMED_" + str, 0L);
        Long lValueOf = Long.valueOf(j);
        if (j > 0) {
            return lValueOf;
        }
        return null;
    }

    public static s00 w(String str) {
        SharedPreferences sharedPreferences = d52.b;
        sharedPreferences.getClass();
        return s00.values()[sharedPreferences.getInt("SKU_" + str, 0)];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object A(ou0 ou0Var) throws Throwable {
        t10 t10Var;
        Integer num;
        boolean z;
        int i;
        final o00 o00Var;
        final q00 q00Var;
        fz3 fz3Var = fz3.a;
        fz3 fz3Var2 = fz3.m;
        if (ou0Var instanceof t10) {
            t10Var = (t10) ou0Var;
            int i2 = t10Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t10Var.c = i2 - Integer.MIN_VALUE;
            } else {
                t10Var = new t10(this, ou0Var);
            }
        } else {
            t10Var = new t10(this, ou0Var);
        }
        Object objF = t10Var.q;
        Object obj = px0.j;
        int i3 = t10Var.c;
        if (i3 == 0) {
            js2.o(objF);
            this.s = null;
            t10Var.c = 1;
            objF = f(t10Var);
            if (objF != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            js2.o(objF);
        } else {
            if (i3 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num = t10Var.m;
            js2.o(objF);
        }
        Integer num2 = (Integer) objF;
        z = false;
        if (num == null) {
            o00Var = this.a;
            q00Var = new q00(this);
            o00Var.getClass();
            if (o00.l(new Callable() { // from class: ox5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    kx5 kx5Var;
                    o00 o00Var2 = o00Var;
                    q00 q00Var2 = q00Var;
                    o00Var2.getClass();
                    try {
                        if (!o00Var2.B()) {
                            i06.j("BillingClient", "Service disconnected.");
                            x20 x20Var = b36.a;
                            o00Var2.G(2, 13, x20Var);
                            q00Var2.g(x20Var);
                            return null;
                        }
                        if (!o00Var2.o) {
                            i06.j("BillingClient", "Current client doesn't support get billing config.");
                            x20 x20Var2 = b36.d;
                            o00Var2.G(32, 13, x20Var2);
                            q00Var2.g(x20Var2);
                            return null;
                        }
                        synchronized (o00Var2.g) {
                            kx5Var = o00Var2.t;
                        }
                        if (kx5Var == null) {
                            o00Var2.q(q00Var2, b36.a, 107, null);
                            return null;
                        }
                        String packageName = o00Var2.l.getPackageName();
                        String str = o00Var2.r;
                        String str2 = o00Var2.n;
                        long jLongValue = o00Var2.H.longValue();
                        int i4 = i06.g;
                        Bundle bundle = new Bundle();
                        i06.y(bundle, str, str2, jLongValue);
                        ((gx5) kx5Var).w(packageName, bundle, new o06(q00Var2, o00Var2.j, o00Var2.w));
                        return null;
                    } catch (DeadObjectException e) {
                        o00Var2.q(q00Var2, b36.a, 62, e);
                        return null;
                    } catch (Exception e2) {
                        o00Var2.q(q00Var2, b36.j, 62, e2);
                        return null;
                    }
                }
            }, 30000L, new tu2((byte) 8, o00Var, q00Var, z), o00Var.i(), o00Var.x()) == null) {
                x20 x20VarP = o00Var.p();
                o00Var.G(25, 13, x20VarP);
                q00Var.g(x20VarP);
            }
        }
        if (num == null) {
            i = 0;
        } else {
            i = this.b + 1;
        }
        this.b = i;
        ew4 ew4Var = this.E;
        if (num == null) {
            fz3Var = fz3.t;
        } else if (num.intValue() != 4 || num.intValue() == -2 || (num.intValue() == 3 && this.b >= 3)) {
            fz3Var = fz3Var2;
        }
        ew4Var.getClass();
        ew4Var.m(null, fz3Var);
        return Boolean.valueOf(num != null && num2 == null);
        Integer num3 = (Integer) objF;
        t10Var.m = num3;
        t10Var.c = 2;
        Object objK = k(t10Var);
        if (objK != obj) {
            num = num3;
            objF = objK;
            Integer num4 = (Integer) objF;
            z = false;
            if (num == null) {
                o00Var = this.a;
                q00Var = new q00(this);
                o00Var.getClass();
                if (o00.l(new Callable() { // from class: ox5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        kx5 kx5Var;
                        o00 o00Var2 = o00Var;
                        q00 q00Var2 = q00Var;
                        o00Var2.getClass();
                        try {
                            if (!o00Var2.B()) {
                                i06.j("BillingClient", "Service disconnected.");
                                x20 x20Var = b36.a;
                                o00Var2.G(2, 13, x20Var);
                                q00Var2.g(x20Var);
                                return null;
                            }
                            if (!o00Var2.o) {
                                i06.j("BillingClient", "Current client doesn't support get billing config.");
                                x20 x20Var2 = b36.d;
                                o00Var2.G(32, 13, x20Var2);
                                q00Var2.g(x20Var2);
                                return null;
                            }
                            synchronized (o00Var2.g) {
                                kx5Var = o00Var2.t;
                            }
                            if (kx5Var == null) {
                                o00Var2.q(q00Var2, b36.a, 107, null);
                                return null;
                            }
                            String packageName = o00Var2.l.getPackageName();
                            String str = o00Var2.r;
                            String str2 = o00Var2.n;
                            long jLongValue = o00Var2.H.longValue();
                            int i4 = i06.g;
                            Bundle bundle = new Bundle();
                            i06.y(bundle, str, str2, jLongValue);
                            ((gx5) kx5Var).w(packageName, bundle, new o06(q00Var2, o00Var2.j, o00Var2.w));
                            return null;
                        } catch (DeadObjectException e) {
                            o00Var2.q(q00Var2, b36.a, 62, e);
                            return null;
                        } catch (Exception e2) {
                            o00Var2.q(q00Var2, b36.j, 62, e2);
                            return null;
                        }
                    }
                }, 30000L, new tu2((byte) 8, o00Var, q00Var, z), o00Var.i(), o00Var.x()) == null) {
                    x20 x20VarP2 = o00Var.p();
                    o00Var.G(25, 13, x20VarP2);
                    q00Var.g(x20VarP2);
                }
            }
            if (num == null) {
                i = 0;
            } else {
                i = this.b + 1;
            }
            this.b = i;
            ew4 ew4Var2 = this.E;
            if (num == null) {
                fz3Var = fz3.t;
            } else if (num.intValue() != 4) {
                fz3Var = fz3Var2;
            } else {
                fz3Var = fz3Var2;
            }
            ew4Var2.getClass();
            ew4Var2.m(null, fz3Var);
            return Boolean.valueOf(num != null && num4 == null);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [mu0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final Object B(Purchase purchase, int i, ou0 ou0Var) {
        u10 u10Var;
        String strB;
        Purchase purchase2;
        jz3 jz3Var;
        fp3 fp3Var;
        String str;
        String str2;
        iz3 iz3Var;
        UUID uuidFromString;
        String strY;
        String strG;
        if (ou0Var instanceof u10) {
            u10Var = (u10) ou0Var;
            int i2 = u10Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u10Var.i = i2 - Integer.MIN_VALUE;
            } else {
                u10Var = new u10(this, ou0Var);
            }
        } else {
            u10Var = new u10(this, ou0Var);
        }
        Object obj = u10Var.w;
        int i3 = u10Var.i;
        UUID uuidFromString2 = 0;
        uuidFromString2 = 0;
        uuidFromString2 = 0;
        if (i3 == 0) {
            js2.o(obj);
            ew4 ew4Var = (ew4) this.o.get(cj0.j0(purchase.y()));
            jz3 jz3Var2 = ew4Var != null ? (jz3) ew4Var.getValue() : null;
            if (jz3Var2 != null) {
                if (yf2.p(jz3Var2.n, "subs")) {
                    ArrayList arrayList = jz3Var2.t;
                    hz3 hz3Var = (arrayList == null || (iz3Var = (iz3) cj0.l0(arrayList)) == null) ? null : (hz3) cj0.l0(iz3Var.y.g);
                    Long lValueOf = Long.valueOf(hz3Var != null ? hz3Var.y : 0L);
                    if (hz3Var == null || (str2 = hz3Var.r) == null) {
                        str2 = "";
                    }
                    fp3Var = new fp3(lValueOf, str2);
                } else {
                    gz3 gz3VarG = jz3Var2.g();
                    Long lValueOf2 = Long.valueOf(gz3VarG != null ? gz3VarG.y : 0L);
                    if (gz3VarG == null || (str = gz3VarG.r) == null) {
                        str = "";
                    }
                    fp3Var = new fp3(lValueOf2, str);
                }
                long jLongValue = ((Number) fp3Var.j).longValue();
                String strEncode = Uri.encode((String) fp3Var.t);
                String str3 = jz3Var2.r;
                StringBuilder sb = new StringBuilder("&pcc=");
                sb.append(strEncode);
                sb.append("&pam=");
                sb.append(jLongValue);
                strB = du4.b(sb, "&sku=", str3);
            } else {
                strB = null;
            }
            String str4 = strB != null ? strB : "";
            String str5 = "https://anleitung-backend.appspot.com/api/report?ack=" + i + "&b=0&t=" + purchase.n() + str4;
            u10Var.m = purchase;
            u10Var.q = jz3Var2;
            u10Var.i = 1;
            x21 x21Var = na1.g;
            Object objF0 = m50.f0(c21.a, new o40(str5, uuidFromString2, (byte) 3), u10Var);
            px0 px0Var = px0.j;
            if (objF0 == px0Var) {
                return px0Var;
            }
            purchase2 = purchase;
            jz3Var = jz3Var2;
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jz3Var = u10Var.q;
            purchase2 = u10Var.m;
            js2.o(obj);
        }
        og5 og5Var = og5.g;
        if (jz3Var == null) {
            return og5Var;
        }
        try {
            g3 g3VarG = purchase2.g();
            uuidFromString = (g3VarG == null || (strG = g3VarG.g()) == null) ? null : UUID.fromString(strG);
        } catch (IllegalArgumentException unused) {
        }
        try {
            g3 g3VarG2 = purchase2.g();
            if (g3VarG2 != null && (strY = g3VarG2.y()) != null) {
                uuidFromString2 = UUID.fromString(strY);
            }
        } catch (IllegalArgumentException unused2) {
        }
        v92 v92Var = new v92(this.j);
        String strN = purchase2.n();
        strN.getClass();
        v92Var.G(uuidFromString, uuidFromString2, jz3Var, strN);
        return og5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(String str, ou0 ou0Var) {
        v10 v10Var;
        if (ou0Var instanceof v10) {
            v10Var = (v10) ou0Var;
            int i = v10Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                v10Var.w = i - Integer.MIN_VALUE;
            } else {
                v10Var = new v10(this, ou0Var);
            }
        } else {
            v10Var = new v10(this, ou0Var);
        }
        Object obj = v10Var.m;
        int i2 = v10Var.w;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(obj);
            String str2 = "https://anleitung-backend.appspot.com/api/report?resub=" + str;
            v10Var.w = 1;
            x21 x21Var = na1.g;
            Object objF0 = m50.f0(c21.a, new o40(str2, mu0Var, (byte) 3), v10Var);
            px0 px0Var = px0.j;
            if (objF0 == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        return og5.g;
    }

    public final void D(String str, s00 s00Var) {
        SharedPreferences sharedPreferences = d52.b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        h(editorEdit, str, s00Var);
        editorEdit.apply();
        ew4 ew4Var = (ew4) this.h.get(str);
        if (ew4Var != null) {
            ew4Var.m(null, s00Var);
        }
    }

    public final void E(Purchase purchase) {
        s00 s00Var;
        SharedPreferences sharedPreferences = d52.b;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        ArrayList arrayListY = purchase.y();
        int size = arrayListY.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            String str = (String) obj;
            ew4 ew4Var = (ew4) this.h.get(str);
            if (ew4Var != null) {
                int iR = purchase.r();
                if (iR == 0) {
                    s00Var = s00.j;
                } else if (iR != 1) {
                    s00Var = iR != 2 ? null : s00.t;
                } else {
                    s00Var = purchase.v() ? s00.m : s00.a;
                }
                if (s00Var != null) {
                    editorEdit.getClass();
                    str.getClass();
                    h(editorEdit, str, s00Var);
                    ew4Var.m(null, s00Var);
                }
            }
        }
        editorEdit.apply();
    }

    @Override // defpackage.n21
    public final void a(gu2 gu2Var) {
        if (((Boolean) this.D.getValue()).booleanValue()) {
            return;
        }
        m50.T(this.t, null, new np(this, null, (byte) 1), 3);
    }

    public final boolean c(String str) {
        str.getClass();
        ew4 ew4Var = (ew4) this.h.get(str);
        return (ew4Var != null ? (s00) ew4Var.getValue() : null) == s00.m;
    }

    public final void d(int i, String str, String str2) {
        if (this.e.add(str + ":" + i)) {
            m50.T(this.t, null, new r10(str2, i, str, null, (byte) 0), 3);
        }
    }

    public final synchronized void e() {
        try {
            iv4 iv4Var = this.c;
            if (iv4Var == null || !iv4Var.y()) {
                m();
            } else {
                this.i.z(og5.g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0125  */
    /* JADX WARN: Code duplicated, block: B:53:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r1 == r13) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ou0 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w10.f(ou0):java.lang.Object");
    }

    @Override // defpackage.p00
    public final void g(x20 x20Var) {
        x20Var.getClass();
        int i = x20Var.g;
        String str = x20Var.r;
        str.getClass();
        if (i != -3 && i != 12 && i != -1) {
            if (i == 0) {
                m();
                return;
            }
            if (i != 2 && i != 3) {
                if (i == 5) {
                    m();
                    return;
                } else if (i != 6) {
                    d(i, "setup", str);
                    m();
                    return;
                }
            }
        }
        m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Purchase purchase, ou0 ou0Var) throws Throwable {
        z00 z00Var;
        if (ou0Var instanceof z00) {
            z00Var = (z00) ou0Var;
            int i = z00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z00Var.c = i - Integer.MIN_VALUE;
            } else {
                z00Var = new z00(this, ou0Var);
            }
        } else {
            z00Var = new z00(this, ou0Var);
        }
        Object objR0 = z00Var.q;
        int i2 = z00Var.c;
        mu0 mu0Var = null;
        HashSet hashSet = this.f;
        if (i2 == 0) {
            js2.o(objR0);
            if (!hashSet.contains(purchase)) {
                hashSet.add(purchase);
                at0 at0VarY = h3.y();
                at0VarY.r(purchase.n());
                h3 h3VarY = at0VarY.y();
                z00Var.m = purchase;
                z00Var.c = 1;
                el0 el0VarV = y94.v();
                this.a.y(h3VarY, new fa4((Object) el0VarV, (byte) 5));
                objR0 = el0VarV.r0(z00Var);
                px0 px0Var = px0.j;
                if (objR0 == px0Var) {
                    return px0Var;
                }
            }
            return og5.g;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        purchase = z00Var.m;
        js2.o(objR0);
        hashSet.remove(purchase);
        if (((bt0) objR0).g().g == 0) {
            m50.T(this.t, null, new q(this, purchase, mu0Var, (byte) 6), 3);
            ArrayList arrayListY = purchase.y();
            int size = arrayListY.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListY.get(i3);
                i3++;
                String str = (String) obj;
                str.getClass();
                D(str, s00.j);
            }
        }
        return og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(ou0 ou0Var) throws Throwable {
        q10 q10Var;
        f24 f24Var;
        Iterator it;
        Object next;
        f24 f24Var2;
        int i;
        if (ou0Var instanceof q10) {
            q10Var = (q10) ou0Var;
            int i2 = q10Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q10Var.c = i2 - Integer.MIN_VALUE;
            } else {
                q10Var = new q10(this, ou0Var);
            }
        } else {
            q10Var = new q10(this, ou0Var);
        }
        Object objO = q10Var.q;
        int i3 = q10Var.c;
        Serializable serializable = px0.j;
        if (i3 == 0) {
            js2.o(objO);
            q10Var.c = 1;
            objO = o("inapp", this.m, true, q10Var);
            if (objO != serializable) {
            }
            return serializable;
        }
        if (i3 == 1) {
            js2.o(objO);
        } else {
            if (i3 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f24Var = q10Var.m;
            js2.o(objO);
        }
        it = pw5.d(f24Var, (f24) ((fp3) objO).j).iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f24) next).g());
        f24Var2 = (f24) next;
        if (f24Var2 == null) {
            this.p = 0;
        } else if (y10.n(f24Var2)) {
            i = this.p + 1;
            this.p = i;
            if (i >= 6) {
                d(f24Var2.g, "purchases-stuck", f24Var2.y);
            }
        }
        if (f24Var2 != null) {
            return new Integer(f24Var2.g);
        }
        return null;
        f24 f24Var3 = (f24) ((fp3) objO).j;
        q10Var.m = f24Var3;
        q10Var.c = 2;
        Serializable serializableO = o("subs", this.q, true, q10Var);
        if (serializableO != serializable) {
            f24Var = f24Var3;
            objO = serializableO;
            it = pw5.d(f24Var, (f24) ((fp3) objO).j).iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((f24) next).g());
            f24Var2 = (f24) next;
            if (f24Var2 == null) {
                this.p = 0;
            } else if (y10.n(f24Var2)) {
                i = this.p + 1;
                this.p = i;
                if (i >= 6) {
                    d(f24Var2.g, "purchases-stuck", f24Var2.y);
                }
            }
            if (f24Var2 != null) {
                return new Integer(f24Var2.g);
            }
            return null;
        }
        return serializable;
    }

    public final synchronized void m() {
        iv4 iv4Var = this.c;
        if (iv4Var == null || !iv4Var.y()) {
            if (this.E.getValue() != fz3.t) {
                ew4 ew4Var = this.E;
                fz3 fz3Var = fz3.j;
                ew4Var.getClass();
                ew4Var.m(null, fz3Var);
            }
            this.i.p();
            this.c = m50.T(this.t, null, new b10(this, null), 3);
        }
    }

    public final void n(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ew4 ew4VarW = y94.w(w(str));
            ew4 ew4VarW2 = y94.w(null);
            m50.T(this.t, null, new np(new vr1(og0.z(new w00(ew4VarW2.j(), (byte) 0)), new x00(this, null), (byte) 3), null, (byte) 7), 3);
            this.h.put(str, ew4VarW);
            this.o.put(str, ew4VarW2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable o(String str, List list, boolean z, ou0 ou0Var) throws Throwable {
        o10 o10Var;
        List list2;
        Object obj;
        boolean z2;
        if (ou0Var instanceof o10) {
            o10Var = (o10) ou0Var;
            int i = o10Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                o10Var.i = i - Integer.MIN_VALUE;
            } else {
                o10Var = new o10(this, ou0Var);
            }
        } else {
            o10Var = new o10(this, ou0Var);
        }
        Object obj2 = o10Var.w;
        int i2 = o10Var.i;
        byte b = 1;
        if (i2 == 0) {
            js2.o(obj2);
            if (str == null) {
                l0.u("Product type must be set");
                return null;
            }
            list2 = list;
            o10Var.m = list2;
            o10Var.q = z;
            o10Var.i = 1;
            el0 el0VarV = y94.v();
            y22 y22Var = new y22((byte) 9, (char) 0);
            y22Var.t = el0VarV;
            o00 o00Var = this.a;
            o00Var.getClass();
            if (o00.l(new bz5(o00Var, y22Var, str, b), 30000L, new tu2((byte) 11, o00Var, y22Var, 0 == true ? 1 : 0), o00Var.i(), o00Var.x()) == null) {
                x20 x20VarP = o00Var.p();
                o00Var.G(25, 9, x20VarP);
                vz5 vz5Var = a06.t;
                y22Var.o(x20VarP, r06.q);
            }
            Object objR0 = el0VarV.r0(o10Var);
            px0 px0Var = px0.j;
            if (objR0 == px0Var) {
                return px0Var;
            }
            obj = objR0;
            z2 = z;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = o10Var.q;
            List list3 = o10Var.m;
            js2.o(obj2);
            obj = obj2;
            list2 = list3;
        }
        a24 a24Var = (a24) obj;
        x20 x20Var = a24Var.g;
        int i3 = x20Var.g;
        f24 f24Var = new f24(x20Var.r, i3);
        if (f24Var.g()) {
            List list4 = a24Var.y;
            z(list4, z2 ? list2 : null);
            return new fp3(f24Var, list4);
        }
        if (!y10.n(f24Var)) {
            d(i3, "purchases", x20Var.r);
        }
        return new fp3(f24Var, pi1.j);
    }

    public final Integer p(x20 x20Var, List list) {
        int i = x20Var.g;
        String str = x20Var.r;
        str.getClass();
        if (i != 0 && this.s == null) {
            this.s = new f24(str, i);
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6) {
                    if (y10.n(new f24(str, i))) {
                        d(i, "transient", str);
                    } else {
                        Log.wtf("w10", "onProductDetailsResponse: " + i + " " + str);
                        d(i, "products", str);
                    }
                }
            } else if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jz3 jz3Var = (jz3) it.next();
                    String str2 = jz3Var.r;
                    str2.getClass();
                    ew4 ew4Var = (ew4) this.o.get(str2);
                    if (ew4Var != null) {
                        ew4Var.m(null, jz3Var);
                    }
                }
            }
        }
        boolean z = i == 0;
        this.u = z ? SystemClock.elapsedRealtime() : -14400000L;
        if (z) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable q(String[] strArr, String str, ou0 ou0Var) throws Throwable {
        g10 g10Var;
        if (ou0Var instanceof g10) {
            g10Var = (g10) ou0Var;
            int i = g10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g10Var.c = i - Integer.MIN_VALUE;
            } else {
                g10Var = new g10(this, ou0Var);
            }
        } else {
            g10Var = new g10(this, ou0Var);
        }
        Object objR0 = g10Var.q;
        int i2 = g10Var.c;
        char c = 0;
        Object[] objArr = 0;
        byte b = 1;
        if (i2 == 0) {
            js2.o(objR0);
            if (str == null) {
                l0.u("Product type must be set");
                return null;
            }
            g10Var.m = strArr;
            g10Var.c = 1;
            el0 el0VarV = y94.v();
            y22 y22Var = new y22((byte) 9, c);
            y22Var.t = el0VarV;
            o00 o00Var = this.a;
            o00Var.getClass();
            if (o00.l(new bz5(o00Var, y22Var, str, b), 30000L, new tu2((byte) 11, o00Var, y22Var, objArr == true ? 1 : 0), o00Var.i(), o00Var.x()) == null) {
                x20 x20VarP = o00Var.p();
                o00Var.G(25, 9, x20VarP);
                vz5 vz5Var = a06.t;
                y22Var.o(x20VarP, r06.q);
            }
            objR0 = el0VarV.r0(g10Var);
            px0 px0Var = px0.j;
            if (objR0 == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strArr = g10Var.m;
            js2.o(objR0);
        }
        a24 a24Var = (a24) objR0;
        x20 x20Var = a24Var.g;
        LinkedList linkedList = new LinkedList();
        if (x20Var.g == 0) {
            for (Purchase purchase : a24Var.y) {
                for (String str2 : strArr) {
                    ArrayList arrayListY = purchase.y();
                    int size = arrayListY.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayListY.get(i3);
                        i3++;
                        if (yf2.p((String) obj, str2)) {
                            linkedList.add(purchase);
                        }
                    }
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object s(Activity activity, String str, UUID uuid, String str2, String str3, String[] strArr, ou0 ou0Var) throws Throwable {
        m10 m10Var;
        jz3 jz3Var;
        String str4;
        Object obj;
        UUID uuid2;
        Activity activity2;
        UUID uuid3;
        ty tyVar;
        String str5;
        iz3 iz3Var;
        UUID uuid4;
        jz3 jz3Var2;
        String str6;
        UUID uuid5;
        String str7;
        if (ou0Var instanceof m10) {
            m10Var = (m10) ou0Var;
            int i = m10Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                m10Var.z = i - Integer.MIN_VALUE;
            } else {
                m10Var = new m10(this, ou0Var);
            }
        } else {
            m10Var = new m10(this, ou0Var);
        }
        Object obj2 = m10Var.p;
        int i2 = m10Var.z;
        Serializable serializable = px0.j;
        if (i2 != 0) {
            if (i2 == 1) {
                tyVar = m10Var.s;
                uuid2 = m10Var.b;
                jz3 jz3Var3 = m10Var.i;
                String str8 = m10Var.c;
                str5 = m10Var.w;
                uuid3 = m10Var.q;
                Activity activity3 = m10Var.m;
                js2.o(obj2);
                obj = obj2;
                jz3Var = jz3Var3;
                str4 = str8;
                activity2 = activity3;
            } else {
                if (i2 != 2) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uuid4 = m10Var.b;
                jz3Var2 = m10Var.i;
                str7 = m10Var.c;
                str6 = m10Var.w;
                uuid5 = m10Var.q;
                js2.o(obj2);
            }
            if (uuid5 == null) {
                v92 v92Var = new v92(this.j);
                uuid4.getClass();
                v92Var.H(uuid4, this.z, str6, str7, jz3Var2);
            }
            return Boolean.TRUE;
        }
        js2.o(obj2);
        ew4 ew4Var = (ew4) this.o.get(str);
        jz3Var = ew4Var != null ? (jz3) ew4Var.getValue() : null;
        if (jz3Var == null) {
            return Boolean.FALSE;
        }
        UUID uuidRandomUUID = uuid == null ? UUID.randomUUID() : uuid;
        rk4 rk4VarG = z10.g();
        rk4VarG.S(jz3Var);
        if (yf2.p(jz3Var.n, "subs")) {
            ArrayList arrayList = jz3Var.t;
            String str9 = (arrayList == null || (iz3Var = (iz3) cj0.l0(arrayList)) == null) ? null : iz3Var.g;
            if (str9 == null) {
                return Boolean.FALSE;
            }
            rk4VarG.R(str9);
        }
        List listK = pw5.k(rk4VarG.p());
        ty tyVarG = c20.g();
        tyVarG.u(listK);
        SharedPreferences sharedPreferences = d52.b;
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("instance_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        }
        tyVarG.i(string);
        tyVarG.s(uuidRandomUUID.toString());
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        m10Var.m = activity;
        m10Var.q = uuid;
        m10Var.w = str2;
        str4 = str3;
        m10Var.c = str4;
        m10Var.i = jz3Var;
        m10Var.b = uuidRandomUUID;
        m10Var.s = tyVarG;
        m10Var.z = 1;
        Serializable serializableQ = q(strArr2, "subs", m10Var);
        if (serializableQ != serializable) {
            UUID uuid6 = uuidRandomUUID;
            obj = serializableQ;
            uuid2 = uuid6;
            activity2 = activity;
            uuid3 = uuid;
            tyVar = tyVarG;
            str5 = str2;
        }
        return serializable;
        List list = (List) obj;
        if (list.size() == 1) {
            Purchase purchase = (Purchase) list.get(0);
            a20 a20VarG = b20.g();
            a20VarG.y(purchase.n());
            a20VarG.r();
            tyVar.z(a20VarG.g());
        }
        activity2.getClass();
        x20 x20VarR = this.a.r(activity2, tyVar.y());
        x20VarR.getClass();
        if (x20VarR.g != 0) {
            return Boolean.FALSE;
        }
        Boolean bool = Boolean.TRUE;
        m10Var.m = null;
        m10Var.q = uuid3;
        m10Var.w = str5;
        m10Var.c = str4;
        m10Var.i = jz3Var;
        m10Var.b = uuid2;
        m10Var.s = null;
        m10Var.z = 2;
        this.D.c(bool, m10Var);
        if (og5.g != serializable) {
            uuid4 = uuid2;
            jz3Var2 = jz3Var;
            str6 = str5;
            uuid5 = uuid3;
            str7 = str4;
            if (uuid5 == null) {
                v92 v92Var2 = new v92(this.j);
                uuid4.getClass();
                v92Var2.H(uuid4, this.z, str6, str7, jz3Var2);
            }
            return Boolean.TRUE;
        }
        return serializable;
    }

    public final void u(x20 x20Var, List list) {
        x20Var.getClass();
        int i = x20Var.g;
        byte b = 1;
        byte b2 = 3;
        ox0 ox0Var = this.t;
        mu0 mu0Var = null;
        if (i != 0) {
            if (i != 1) {
                x14 x14Var = x14.j;
                co4 co4Var = this.C;
                if (i == 5) {
                    d(i, "purchase", x20Var.r + " sub=" + x20Var.y);
                    co4Var.p(x14Var);
                } else if (i != 7) {
                    co4Var.p(x14Var);
                } else {
                    m50.T(ox0Var, null, new a10(this, mu0Var, (byte) 2), 3);
                }
            }
        } else if (list != null) {
            z(list, null);
            m50.T(ox0Var, null, new a10(this, mu0Var, b), 3);
            return;
        }
        m50.T(ox0Var, null, new a10(this, mu0Var, b2), 3);
    }

    /* JADX WARN: Failed to calculate best type for var: r32v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r32v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r32v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r32v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r32v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r32v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r32v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r32v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r32v0 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final java.lang.Object v(defpackage.ou0 r36) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w10.v(ou0):java.lang.Object");
    }

    public final void z(List list, List list2) {
        HashSet hashSet = new HashSet();
        mu0 mu0Var = null;
        byte b = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                ArrayList arrayListY = purchase.y();
                int size = arrayListY.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListY.get(i);
                    i++;
                    String str = (String) obj;
                    if (((ew4) this.h.get(str)) != null) {
                        hashSet.add(str);
                    }
                }
                if (purchase.r() == 1) {
                    this.E(purchase);
                    w10 w10Var = this;
                    iv4 iv4VarT = m50.T(w10Var.t, null, new n10(purchase, w10Var, new q54(), mu0Var, (byte) 0), 3);
                    w10Var.d.add(iv4VarT);
                    iv4VarT.A(new xf(w10Var, iv4VarT, b));
                    this = w10Var;
                } else {
                    this.E(purchase);
                }
            }
        }
        w10 w10Var2 = this;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!hashSet.contains(str2)) {
                    boolean z = l(str2) != null && w(str2) == s00.m;
                    if (z) {
                        SharedPreferences sharedPreferences = d52.b;
                        sharedPreferences.getClass();
                        long j = sharedPreferences.getLong("SKU_EMPTY_SINCE_" + str2, 0L);
                        Long lValueOf = Long.valueOf(j);
                        if (j <= 0) {
                            lValueOf = null;
                        }
                        if (lValueOf == null) {
                            SharedPreferences sharedPreferences2 = d52.b;
                            sharedPreferences2.getClass();
                            sharedPreferences2.edit().putLong(xi3.t("SKU_EMPTY_SINCE_", str2), System.currentTimeMillis()).apply();
                            w10Var2.d(-1002, "empty-suspect", str2);
                        } else if (System.currentTimeMillis() - lValueOf.longValue() < 259200000) {
                        }
                    }
                    if (z) {
                        w10Var2.d(-1002, "revoked", str2);
                    }
                    w10Var2.D(str2, s00.j);
                }
            }
        }
    }

    @Override // defpackage.p00
    public final void r() {
    }
}
