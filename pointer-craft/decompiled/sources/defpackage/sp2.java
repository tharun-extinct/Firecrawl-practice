package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import io.appground.blek.R;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sp2 {
    public static final /* synthetic */ int g = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [hd5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [xy1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [i73] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void A(hd5 hd5Var, xy1 xy1Var) {
        i73 i73Var = (i73) hd5Var;
        if (!i73Var.j.h) {
            mc2.y("visitSubtreeIf called on an unattached node");
        }
        rb3 rb3Var = new rb3(new i73[16]);
        i73 i73Var2 = i73Var.j;
        i73 i73Var3 = i73Var2.w;
        if (i73Var3 == null) {
            k33.o(rb3Var, i73Var2);
        } else {
            rb3Var.y(i73Var3);
        }
        while (true) {
            int i = rb3Var.a;
            if (i == 0) {
                return;
            }
            i73 i73Var4 = (i73) rb3Var.w(i - 1);
            if ((i73Var4.m & 262144) != 0) {
                i73 i73Var5 = i73Var4;
                while (true) {
                    if (i73Var5 != null && i73Var5.h) {
                        if ((i73Var5.a & 262144) != 0) {
                            ?? Q = i73Var5;
                            ?? rb3Var2 = 0;
                            while (Q != 0) {
                                if (Q instanceof hd5) {
                                    hd5 hd5Var2 = (hd5) Q;
                                    gd5 gd5Var = (yf2.p(hd5Var.s(), hd5Var2.s()) && hd5Var.getClass() == hd5Var2.getClass()) ? (gd5) xy1Var.a(hd5Var2) : gd5.j;
                                    if (gd5Var != gd5.a) {
                                        if (gd5Var == gd5.t) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((Q.a & 262144) != 0 && (Q instanceof p41)) {
                                    i73 i73Var6 = ((p41) Q).f;
                                    int i2 = 0;
                                    Q = Q;
                                    rb3Var2 = rb3Var2;
                                    while (i73Var6 != null) {
                                        if ((i73Var6.a & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                rb3Var2 = rb3Var2;
                                                Q = i73Var6;
                                            } else {
                                                if (rb3Var2 == 0) {
                                                    rb3Var2 = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var2.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var2.y(i73Var6);
                                            }
                                        }
                                        i73Var6 = i73Var6.w;
                                        Q = Q;
                                        rb3Var2 = rb3Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                Q = k33.Q(rb3Var2);
                            }
                        }
                        i73Var5 = i73Var5.w;
                    }
                }
            }
            k33.o(rb3Var, i73Var4);
        }
    }

    public static void a(String str, String str2, Object obj) {
        String strP = p(str);
        if (Log.isLoggable(strP, 3)) {
            Log.d(strP, String.format(str2, obj));
        }
    }

    public static String b(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line);
            }
            bufferedInputStream.close();
            return sb.toString();
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static final long c(float f, int i, long j, boolean z) {
        int iT = ((z || i == 2 || i == 4 || i == 5) && ws0.v(j)) ? ws0.t(j) : Integer.MAX_VALUE;
        if (ws0.m(j) != iT) {
            iT = xs2.w(js2.n(f), ws0.m(j), iT);
        }
        return y94.A(0, iT, 0, ws0.j(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [hd5, java.lang.Object, o41] */
    /* JADX WARN: Type inference failed for: r11v0, types: [xy1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [i73] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [i73] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void d(hd5 hd5Var, xy1 xy1Var) {
        ah3 ah3Var;
        i73 i73Var = (i73) hd5Var;
        if (!i73Var.j.h) {
            mc2.y("visitAncestors called on an unattached node");
        }
        i73 i73Var2 = i73Var.j.q;
        um2 um2VarV = k33.V(hd5Var);
        while (um2VarV != null) {
            if ((um2VarV.M.x.m & 262144) != 0) {
                while (i73Var2 != null) {
                    if ((i73Var2.a & 262144) != 0) {
                        ?? Q = i73Var2;
                        ?? rb3Var = 0;
                        while (Q != 0) {
                            boolean zBooleanValue = true;
                            if (Q instanceof hd5) {
                                hd5 hd5Var2 = (hd5) Q;
                                if (yf2.p(hd5Var.s(), hd5Var2.s()) && hd5Var.getClass() == hd5Var2.getClass()) {
                                    zBooleanValue = ((Boolean) xy1Var.a(hd5Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((Q.a & 262144) != 0 && (Q instanceof p41)) {
                                i73 i73Var3 = ((p41) Q).f;
                                int i = 0;
                                while (i73Var3 != null) {
                                    if ((i73Var3.a & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            Q = Q;
                                            rb3Var = rb3Var;
                                            rb3Var = rb3Var;
                                            Q = i73Var3;
                                        } else {
                                            if (rb3Var == 0) {
                                                rb3Var = new rb3(new i73[16]);
                                            }
                                            if (Q != 0) {
                                                rb3Var.y(Q);
                                                Q = 0;
                                            }
                                            rb3Var.y(i73Var3);
                                        }
                                    } else {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                    i73Var3 = i73Var3.w;
                                    Q = Q;
                                    rb3Var = rb3Var;
                                }
                                if (i == 1) {
                                    Q = Q;
                                    rb3Var = rb3Var;
                                } else {
                                    Q = Q;
                                    rb3Var = rb3Var;
                                }
                            }
                            Q = k33.Q(rb3Var);
                        }
                    }
                    i73Var2 = i73Var2.q;
                }
            }
            um2VarV = um2VarV.o();
            i73Var2 = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [xy1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [i73] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void e(i73 i73Var, String str, xy1 xy1Var) {
        if (!i73Var.j.h) {
            mc2.y("visitSubtreeIf called on an unattached node");
        }
        rb3 rb3Var = new rb3(new i73[16]);
        i73 i73Var2 = i73Var.j;
        i73 i73Var3 = i73Var2.w;
        if (i73Var3 == null) {
            k33.o(rb3Var, i73Var2);
        } else {
            rb3Var.y(i73Var3);
        }
        while (true) {
            int i = rb3Var.a;
            if (i == 0) {
                return;
            }
            i73 i73Var4 = (i73) rb3Var.w(i - 1);
            if ((i73Var4.m & 262144) != 0) {
                i73 i73Var5 = i73Var4;
                while (true) {
                    if (i73Var5 != null && i73Var5.h) {
                        if ((i73Var5.a & 262144) != 0) {
                            ?? Q = i73Var5;
                            ?? rb3Var2 = 0;
                            while (Q != 0) {
                                if (Q instanceof hd5) {
                                    hd5 hd5Var = (hd5) Q;
                                    gd5 gd5Var = str.equals(hd5Var.s()) ? (gd5) xy1Var.a(hd5Var) : gd5.j;
                                    if (gd5Var != gd5.a) {
                                        if (gd5Var == gd5.t) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((Q.a & 262144) != 0 && (Q instanceof p41)) {
                                    i73 i73Var6 = ((p41) Q).f;
                                    int i2 = 0;
                                    Q = Q;
                                    rb3Var2 = rb3Var2;
                                    while (i73Var6 != null) {
                                        if ((i73Var6.a & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                rb3Var2 = rb3Var2;
                                                Q = i73Var6;
                                            } else {
                                                if (rb3Var2 == 0) {
                                                    rb3Var2 = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var2.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var2.y(i73Var6);
                                            }
                                        }
                                        i73Var6 = i73Var6.w;
                                        Q = Q;
                                        rb3Var2 = rb3Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                Q = k33.Q(rb3Var2);
                            }
                        }
                        i73Var5 = i73Var5.w;
                    }
                }
            }
            k33.o(rb3Var, i73Var4);
        }
    }

    public static final aa3 f(List list, h02 h02Var, int i) {
        aa3 bi6Var;
        h02Var.X(-57132327);
        h02Var.X(1644423904);
        Object objK = h02Var.K();
        Object obj = oo0.g;
        if (objK == obj) {
            objK = new q21((byte) 29);
            h02Var.i0(objK);
        }
        Object obj2 = (xy1) objK;
        byte b = 0;
        h02Var.b(false);
        h02Var.X(-2117184311);
        if (!((Boolean) h02Var.a(yd2.g)).booleanValue()) {
            h02Var.X(-2044770427);
            h02Var.X(992349447);
            Context context = (Context) h02Var.a(sa.y);
            context.getClass();
            for (Context baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                if (baseContext instanceof Activity) {
                    Activity activity = (Activity) baseContext;
                    h02Var.X(2043410185);
                    boolean zX = h02Var.x(list);
                    Object objK2 = h02Var.K();
                    Object obj3 = objK2;
                    if (zX || objK2 == obj) {
                        ArrayList arrayList = new ArrayList(dj0.Y(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new cb3((String) it.next(), context, activity));
                        }
                        h02Var.i0(arrayList);
                        obj3 = arrayList;
                    }
                    List<cb3> list2 = (List) obj3;
                    h02Var.b(false);
                    for (cb3 cb3Var : list2) {
                        h02Var.U(2043417954, cb3Var.g);
                        u4 u4Var = new u4((byte) 1);
                        h02Var.X(2043425179);
                        boolean zX2 = h02Var.x(cb3Var);
                        Object objK3 = h02Var.K();
                        if (zX2 || objK3 == obj) {
                            objK3 = new ra3(cb3Var);
                            h02Var.i0(objK3);
                        }
                        h02Var.b(false);
                        x03 x03VarL = ra.L(u4Var, (xy1) objK3, h02Var, 0);
                        h02Var.X(2043428887);
                        boolean zX3 = h02Var.x(cb3Var) | h02Var.j(x03VarL);
                        Object objK4 = h02Var.K();
                        if (zX3 || objK4 == obj) {
                            objK4 = new ra3(cb3Var, x03VarL);
                            h02Var.i0(objK4);
                        }
                        h02Var.b(false);
                        k33.j(x03VarL, (xy1) objK4, h02Var);
                        h02Var.b(false);
                    }
                    h02Var.b(false);
                    mq2.g(list2, null, h02Var, 0);
                    h02Var.X(-1913570181);
                    boolean zX4 = h02Var.x(list);
                    Object objK5 = h02Var.K();
                    if (zX4 || objK5 == obj) {
                        objK5 = new qa3(list2);
                        h02Var.i0(objK5);
                    }
                    qa3 qa3Var = (qa3) objK5;
                    h02Var.b(false);
                    u4 u4Var2 = new u4(b);
                    h02Var.X(-1913560327);
                    boolean zX5 = h02Var.x(qa3Var) | h02Var.x(obj2);
                    Object objK6 = h02Var.K();
                    if (zX5 || objK6 == obj) {
                        objK6 = new xf(qa3Var, obj2, (byte) 12);
                        h02Var.i0(objK6);
                    }
                    h02Var.b(false);
                    Object objL = ra.L(u4Var2, (xy1) objK6, h02Var, 0);
                    h02Var.X(-1913553647);
                    boolean zX6 = h02Var.x(qa3Var) | h02Var.j(objL);
                    Object objK7 = h02Var.K();
                    if (zX6 || objK7 == obj) {
                        objK7 = new xf(qa3Var, objL, (byte) 13);
                        h02Var.i0(objK7);
                    }
                    h02Var.b(false);
                    k33.t(qa3Var, objL, (xy1) objK7, h02Var);
                    h02Var.b(false);
                    bi6Var = qa3Var;
                }
            }
            l0.z("Permissions should be called in the context of an Activity");
            return null;
        }
        bi6Var = new bi6(list, qi1.j);
        h02Var.b(false);
        h02Var.b(false);
        return bi6Var;
    }

    public static final void g(final int i, final bz1 bz1Var, h02 h02Var, final boolean z) {
        int i2;
        h02Var.Z(-642000585);
        if ((i & 6) == 0) {
            i2 = (h02Var.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(bz1Var) ? 32 : 16;
        }
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objG = (gf3) h02Var.a(jx2.g);
            if (objG == null) {
                h02Var.X(1512740606);
                objG = ox2.g(h02Var);
            } else {
                h02Var.X(1512737723);
            }
            h02Var.b(false);
            if (objG == null) {
                l0.z("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zX = h02Var.x(objG);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zX || objK == l76Var) {
                gf3 gf3Var = objG instanceof gf3 ? (gf3) objG : null;
                kb5 kb5VarG = gf3Var != null ? gf3Var.g() : null;
                vj3 vj3Var = objG instanceof vj3 ? (vj3) objG : null;
                objK = new wv(kb5VarG, vj3Var != null ? vj3Var.y() : null);
                h02Var.i0(objK);
            }
            wv wvVar = (wv) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = k33.E(h02Var);
                h02Var.i0(objK2);
            }
            ox0 ox0Var = (ox0) objK2;
            long j = h02Var.T;
            boolean zX2 = h02Var.x(wvVar) | h02Var.v(j);
            Object objK3 = h02Var.K();
            if (zX2 || objK3 == l76Var) {
                objK3 = new ao0(ox0Var, new hw3(j, objG));
                h02Var.i0(objK3);
            }
            ao0 ao0Var = (ao0) objK3;
            h02Var.X(-348514256);
            boolean zJ = h02Var.j(ao0Var) | h02Var.j(bz1Var);
            Object objK4 = h02Var.K();
            byte b2 = 22;
            if (zJ || objK4 == l76Var) {
                objK4 = new rg(ao0Var, bz1Var, b2);
                h02Var.i0(objK4);
            }
            k33.z((my1) objK4, h02Var);
            int i3 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean zJ2 = (i4 == 4) | h02Var.j(ao0Var);
            Object objK5 = h02Var.K();
            if (zJ2 || objK5 == l76Var) {
                objK5 = new ld3(b, ao0Var, z);
                h02Var.i0(objK5);
            }
            aq2.n(boolValueOf, ao0Var, null, (xy1) objK5, h02Var, i4);
            boolean zJ3 = h02Var.j(wvVar) | h02Var.j(ao0Var);
            Object objK6 = h02Var.K();
            if (zJ3 || objK6 == l76Var) {
                objK6 = new xf(wvVar, ao0Var, b2);
                h02Var.i0(objK6);
            }
            k33.t(wvVar, ao0Var, (xy1) objK6, h02Var);
            h02Var.b(false);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: iw3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sp2.g(aq2.J(i | 1), bz1Var, (h02) obj, z);
                    return og5.g;
                }
            };
        }
    }

    public static boolean h(byte b) {
        return b > -65;
    }

    public static ll0 i(String str, st2 st2Var) {
        kl0 kl0VarG = ll0.g(pu.class);
        kl0VarG.v = true;
        kl0VarG.g(p51.g(Context.class));
        kl0VarG.x = new hm0(str, st2Var, (byte) 1);
        return kl0VarG.y();
    }

    public static final int j(Bundle bundle) {
        int iHashCode;
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                iHashCode = j((Bundle) obj);
            } else if (obj instanceof Object[]) {
                iHashCode = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) obj);
            } else {
                iHashCode = obj != null ? obj.hashCode() : 0;
            }
            i = (i * 31) + iHashCode;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [xy1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [i73] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [i73] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void k(o41 o41Var, Object obj, xy1 xy1Var) {
        ah3 ah3Var;
        if (!((i73) o41Var).j.h) {
            mc2.y("visitAncestors called on an unattached node");
        }
        i73 i73Var = ((i73) o41Var).j.q;
        um2 um2VarV = k33.V(o41Var);
        while (um2VarV != null) {
            if ((um2VarV.M.x.m & 262144) != 0) {
                while (i73Var != null) {
                    if ((i73Var.a & 262144) != 0) {
                        ?? Q = i73Var;
                        ?? rb3Var = 0;
                        while (Q != 0) {
                            if (Q instanceof hd5) {
                                hd5 hd5Var = (hd5) Q;
                                if (!(obj.equals(hd5Var.s()) ? ((Boolean) xy1Var.a(hd5Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((Q.a & 262144) != 0 && (Q instanceof p41)) {
                                i73 i73Var2 = ((p41) Q).f;
                                int i = 0;
                                while (i73Var2 != null) {
                                    if ((i73Var2.a & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            Q = Q;
                                            rb3Var = rb3Var;
                                            rb3Var = rb3Var;
                                            Q = i73Var2;
                                        } else {
                                            if (rb3Var == 0) {
                                                rb3Var = new rb3(new i73[16]);
                                            }
                                            if (Q != 0) {
                                                rb3Var.y(Q);
                                                Q = 0;
                                            }
                                            rb3Var.y(i73Var2);
                                        }
                                    } else {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                    i73Var2 = i73Var2.w;
                                    Q = Q;
                                    rb3Var = rb3Var;
                                }
                                if (i == 1) {
                                    Q = Q;
                                    rb3Var = rb3Var;
                                } else {
                                    Q = Q;
                                    rb3Var = rb3Var;
                                }
                            }
                            Q = k33.Q(rb3Var);
                        }
                    }
                    i73Var = i73Var.q;
                }
            }
            um2VarV = um2VarV.o();
            i73Var = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
        }
    }

    public static final boolean l(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !yf2.p(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!l((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!pr.K((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final u94 m(Context context, Class cls, String str) {
        context.getClass();
        if (tx4.Y(str)) {
            l0.u("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new u94(context, cls, str);
        }
        l0.u("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static void n(StringBuilder sb, Object obj, xy1 xy1Var) {
        if (xy1Var != null) {
            sb.append((CharSequence) xy1Var.a(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final boolean o(u21 u21Var, float f) {
        u21Var.q().getClass();
        return !(((u21Var.s() ? -f : q(u21Var)) > 0.0f ? 1 : ((u21Var.s() ? -f : q(u21Var)) == 0.0f ? 0 : -1)) > 0);
    }

    public static String p(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final float q(u21 u21Var) {
        return u21Var.q().v == um3.t ? Float.intBitsToFloat((int) (u21Var.b() >> 32)) : Float.intBitsToFloat((int) (u21Var.b() & 4294967295L));
    }

    public static void r(pr4 pr4Var, List list, yo0 yo0Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iR = pr4Var.r((c02) list.get(i));
            int iM = pr4Var.M(pr4Var.y, pr4Var.s(iR));
            Object obj = iM < pr4Var.x(pr4Var.y, pr4Var.s(iR + 1)) ? pr4Var.r[pr4Var.l(iM)] : oo0.g;
            u34 u34Var = obj instanceof u34 ? (u34) obj : null;
            if (u34Var != null) {
                u34Var.g = yo0Var;
            }
        }
    }

    public static final ViewParent s(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static ll0 t(String str, String str2) {
        pu puVar = new pu(str, str2);
        kl0 kl0VarG = ll0.g(pu.class);
        kl0VarG.v = true;
        kl0VarG.x = new jl0(puVar, (byte) 0);
        return kl0VarG.y();
    }

    public static int u(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        l0.u(xi3.j("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static final int v(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static void w(String str, String str2, Exception exc) {
        String strP = p(str);
        if (Log.isLoggable(strP, 6)) {
            Log.e(strP, str2, exc);
        }
    }

    public static final long x(int i, long j) {
        int i2 = u75.r;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : y(i4, i);
    }

    public static final long y(int i, int i2) {
        if (i < 0 || i2 < 0) {
            nc2.g("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = u75.r;
        return j;
    }

    public static final boolean z(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public void B(vf6 vf6Var, vf6 vf6Var2) {
        vf6Var.y = vf6Var2;
    }

    public void C(vf6 vf6Var, Thread thread) {
        vf6Var.g = thread;
    }

    public boolean D(wh6 wh6Var, v86 v86Var, v86 v86Var2) {
        synchronized (wh6Var) {
            try {
                if (wh6Var.t != v86Var) {
                    return false;
                }
                wh6Var.t = v86Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean E(wh6 wh6Var, Object obj, Object obj2) {
        synchronized (wh6Var) {
            try {
                if (wh6Var.j != obj) {
                    return false;
                }
                wh6Var.j = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean F(wh6 wh6Var, vf6 vf6Var, vf6 vf6Var2) {
        synchronized (wh6Var) {
            try {
                if (wh6Var.a != vf6Var) {
                    return false;
                }
                wh6Var.a = vf6Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
