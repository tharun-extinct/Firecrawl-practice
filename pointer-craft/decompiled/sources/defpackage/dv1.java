package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dv1 {
    public static final kz2 g = new kz2(16);
    public static final sp4 n;
    public static final Object r;
    public static final ThreadPoolExecutor y;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new e74());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        y = threadPoolExecutor;
        r = new Object();
        n = new sp4(0);
    }

    public static String g(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((xu1) list.get(i2)).l);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static Typeface n(Context context, xu1 xu1Var, rk4 rk4Var, int i, int i2) {
        ha5 ha5Var = (ha5) rk4Var.t;
        f74 f74Var = (f74) rk4Var.a;
        ArrayList arrayList = new ArrayList(1);
        byte b = 0;
        Object obj = new Object[]{xu1Var}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        String strG = g(i, Collections.unmodifiableList(arrayList));
        Typeface typeface = (Typeface) g.r(strG);
        if (typeface != null) {
            f74Var.execute(new i26((Object) ha5Var, (Object) typeface, (byte) 5));
            return typeface;
        }
        if (i2 == -1) {
            ArrayList arrayList2 = new ArrayList(1);
            Object obj2 = new Object[]{xu1Var}[0];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
            cv1 cv1VarY = y(strG, context, Collections.unmodifiableList(arrayList2), i);
            rk4Var.J(cv1VarY);
            return cv1VarY.g;
        }
        try {
            try {
                try {
                    cv1 cv1Var = (cv1) y.submit(new av1(strG, context, xu1Var, i, (byte) 0)).get(i2, TimeUnit.MILLISECONDS);
                    rk4Var.J(cv1Var);
                    return cv1Var.g;
                } catch (InterruptedException e) {
                    throw e;
                }
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            f74Var.execute(new xa0(ha5Var, -3, b));
            return null;
        }
    }

    public static Typeface r(Context context, ArrayList arrayList, int i, rk4 rk4Var) {
        String strG = g(i, arrayList);
        Typeface typeface = (Typeface) g.r(strG);
        if (typeface != null) {
            ((f74) rk4Var.a).execute(new i26(rk4Var.t, (Object) typeface, (byte) 5));
            return typeface;
        }
        bv1 bv1Var = new bv1(rk4Var, (byte) 0);
        synchronized (r) {
            try {
                sp4 sp4Var = n;
                ArrayList arrayList2 = (ArrayList) sp4Var.get(strG);
                if (arrayList2 != null) {
                    arrayList2.add(bv1Var);
                    return null;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(bv1Var);
                sp4Var.put(strG, arrayList3);
                av1 av1Var = new av1(strG, context, arrayList, i, (byte) 1);
                ThreadPoolExecutor threadPoolExecutor = y;
                bv1 bv1Var2 = new bv1(strG, (byte) 1);
                Handler handler = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                ks0 ks0Var = new ks0();
                ks0Var.t = av1Var;
                ks0Var.a = bv1Var2;
                ks0Var.m = handler;
                threadPoolExecutor.execute(ks0Var);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static cv1 y(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceR;
        kz2 kz2Var = g;
        lr2.w("getFontSync");
        try {
            Typeface typeface = (Typeface) kz2Var.r(str);
            if (typeface != null) {
                cv1 cv1Var = new cv1(typeface);
                Trace.endSection();
                return cv1Var;
            }
            try {
                sv1 sv1VarG = wu1.g(context, list);
                List list2 = (List) sv1VarG.y;
                boolean z = sv1VarG.g;
                if (!z) {
                    tv1[] tv1VarArr = (tv1[]) list2.get(0);
                    if (tv1VarArr == null || tv1VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = tv1VarArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i4 = tv1VarArr[i3].x;
                            if (i4 != 0) {
                                if (i4 >= 0) {
                                    i2 = i4;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    if (!z) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    cv1 cv1Var2 = new cv1(i2);
                    Trace.endSection();
                    return cv1Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    tv1[] tv1VarArr2 = (tv1[]) list2.get(0);
                    zq2 zq2Var = xe5.g;
                    lr2.w("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceR = xe5.g.r(context, tv1VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    zq2 zq2Var2 = xe5.g;
                    lr2.w("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceR = xe5.g.n(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceR == null) {
                    cv1 cv1Var3 = new cv1(-3);
                    Trace.endSection();
                    return cv1Var3;
                }
                kz2Var.n(str, typefaceR);
                cv1 cv1Var4 = new cv1(typefaceR);
                Trace.endSection();
                return cv1Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                cv1 cv1Var5 = new cv1(-1);
                Trace.endSection();
                return cv1Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
