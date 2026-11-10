package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class cp1 {
    public Object g;
    public Object n;
    public Object r;
    public Object v;
    public Object y;

    public cp1(Layout layout) {
        this.g = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iV = tx4.V(((Layout) this.g).getText(), '\n', length, 4);
            length = iV < 0 ? ((Layout) this.g).getText().length() : iV + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.g).getText().length());
        this.y = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.r = arrayList2;
        this.n = new boolean[((ArrayList) this.y).size()];
        ((ArrayList) this.y).size();
    }

    public String a(URL url, byte[] bArr, m84 m84Var, boolean z) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        boolean z2 = true;
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            e52 e52Var = (e52) ((n14) this.v).get();
            String str = null;
            if (e52Var != null) {
                try {
                    z11 z11Var = (z11) e52Var;
                    str = (String) br2.n(!((UserManager) z11Var.y.getSystemService(UserManager.class)).isUserUnlocked() ? br2.s("") : br2.x(z11Var.v, new y11(z11Var)));
                } catch (Exception unused) {
                    Log.w("cp1", "Unable to get heartbeats!");
                }
            }
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Firebase-Client", str);
            }
            httpURLConnection.setRequestProperty("X-Android-Package", ((Context) this.g).getPackageName());
            httpURLConnection.setRequestProperty("X-Android-Cert", r());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
                bufferedReader.close();
                String string = sb.toString();
                if (responseCode < 200 || responseCode >= 300) {
                    z2 = false;
                }
                if (z2) {
                    if (z) {
                        m84Var.g = 0L;
                        m84Var.y = -1L;
                    }
                    httpURLConnection.disconnect();
                    return string;
                }
                m84Var.g++;
                if (responseCode == 400 || responseCode == 404) {
                    m84Var.y = System.currentTimeMillis() + 86400000;
                } else {
                    m84Var.y = Math.min((long) (Math.pow(2.0d, m84Var.g * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L) + System.currentTimeMillis();
                }
                JSONObject jSONObject = new JSONObject(new JSONObject(string).optString("error"));
                throw new yo1("Error returned from API. code: " + jSONObject.optInt("code") + " body: " + jSONObject.optString("message"));
            } catch (Throwable th3) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            httpURLConnection.disconnect();
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi g(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.g;
        ArrayList arrayList = (ArrayList) this.y;
        ArrayList arrayList2 = (ArrayList) this.r;
        boolean[] zArr = (boolean[]) this.n;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.v;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(l(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.v;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.v = cArr2;
        return bidi;
    }

    public void j(String str, String str2) {
        str2.getClass();
        fa4 fa4Var = (fa4) this.r;
        fa4Var.getClass();
        ec6.t(str);
        ec6.a(str2, str);
        fa4Var.J(str);
        ec6.r(fa4Var, str, str2);
    }

    public int l(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.y).get(i - 1)).intValue();
    }

    public void m(String str, d74 d74Var) {
        str.getClass();
        if (str.length() <= 0) {
            l0.u("method.isEmpty() == true");
            return;
        }
        if (d74Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                l0.t(du4.i("method ", str, " must have a request body."));
                return;
            }
        } else if (!fh6.r(str)) {
            l0.t(du4.i("method ", str, " must not have a request body."));
            return;
        }
        this.y = str;
        this.n = d74Var;
    }

    public float n(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.g;
        if (!z2) {
            return y(i, z);
        }
        int iR = wy5.r(layout, i, z2);
        int lineStart = layout.getLineStart(iR);
        int lineEnd = layout.getLineEnd(iR);
        if (i != lineStart && i != lineEnd) {
            return y(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return y(i, z);
        }
        int iX = x(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(l(iX))) == -1;
        int iT = t(lineEnd, lineStart);
        int iL = l(iX);
        int i4 = lineStart - iL;
        int i5 = iT - iL;
        Bidi bidiG = g(iX);
        Bidi bidiCreateLineBidi = bidiG != null ? bidiG.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iR) : layout.getLineRight(iR);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        am2[] am2VarArr = new am2[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            am2VarArr[i6] = new am2(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, am2VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (am2VarArr[i8].g == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == am2VarArr[i3].r) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iR);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(am2VarArr[i3 - 1].g) : layout.getPrimaryHorizontal(am2VarArr[i3 + 1].g);
            }
            return layout.getLineRight(iR);
        }
        int iT2 = i > iT ? t(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (am2VarArr[i9].y == iT2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == am2VarArr[i2].r) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iR);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(am2VarArr[i2 - 1].y) : layout.getPrimaryHorizontal(am2VarArr[i2 + 1].y);
        }
        return layout.getLineRight(iR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nj6 q() {
        int i;
        String str;
        String strEncodeToString;
        boolean zV;
        int i2;
        Object[] objArr;
        PackageInfo packageInfoR;
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.g;
        String str2 = (String) this.y;
        String str3 = (String) this.r;
        String str4 = (String) this.n;
        lz2 lz2Var = (lz2) this.v;
        vl vlVar = firebaseInstanceId.n;
        vlVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("scope", str4);
        bundle.putString("sender", str3);
        bundle.putString("subtype", str3);
        bundle.putString("appid", str2);
        ro1 ro1Var = (ro1) vlVar.g;
        ro1Var.g();
        bundle.putString("gmp_app_id", ro1Var.r.y);
        s53 s53Var = (s53) vlVar.y;
        synchronized (s53Var) {
            try {
                if (s53Var.n == 0 && (packageInfoR = s53Var.r("com.google.android.gms")) != null) {
                    s53Var.n = packageInfoR.versionCode;
                }
                i = s53Var.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((s53) vlVar.y).g());
        s53 s53Var2 = (s53) vlVar.y;
        synchronized (s53Var2) {
            try {
                if (s53Var2.r == null) {
                    s53Var2.n();
                }
                str = s53Var2.r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str);
        ro1 ro1Var2 = (ro1) vlVar.g;
        ro1Var2.g();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(ro1Var2.y.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str5 = ((ou) br2.n(((gp1) ((hp1) vlVar.x)).n())).g;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        f52 f52Var = (f52) ((n14) vlVar.v).get();
        b41 b41Var = (b41) ((n14) vlVar.n).get();
        byte b = 0;
        Object[] objArr2 = 0;
        if (f52Var != null && b41Var != null) {
            z11 z11Var = (z11) f52Var;
            synchronized (z11Var) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                g52 g52Var = (g52) z11Var.g.get();
                synchronized (g52Var) {
                    zV = g52Var.v(g52.y, jCurrentTimeMillis);
                }
                i2 = 1;
                if (zV) {
                    synchronized (g52Var) {
                        g52Var.g.g(new oz(g52Var, g52.y(System.currentTimeMillis())));
                    }
                    objArr = 3;
                } else {
                    objArr = 1;
                }
            }
            if (objArr != 1) {
                if (objArr == 1) {
                    i2 = 0;
                } else if (objArr != 2) {
                    if (objArr != 3) {
                        throw null;
                    }
                    i2 = 2;
                }
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(i2));
                bundle.putString("Firebase-Client", b41Var.g());
            }
        }
        nj6 nj6VarG = ((ob4) vlVar.r).g(bundle);
        dp1 dp1Var = dp1.t;
        v92 v92Var = new v92((Object) vlVar, (byte) 17);
        nj6 nj6Var = new nj6();
        nj6VarG.y.g(new r26(dp1Var, v92Var, nj6Var, b));
        nj6VarG.i();
        nj6 nj6VarA = nj6Var.a(firebaseInstanceId.g, new jp1(firebaseInstanceId, str3, str4, str2));
        nj6VarA.n(aa1.m, new cd2((byte) 12, firebaseInstanceId, lz2Var, objArr2 == true ? 1 : 0));
        return nj6VarA;
    }

    public String r() {
        Context context = (Context) this.g;
        try {
            byte[] bArrR = jh6.r(context, context.getPackageName());
            if (bArrR != null) {
                return bc6.r(bArrR);
            }
            Log.e("cp1", "Could not get fingerprint hash for package: " + context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("cp1", "No such package: " + context.getPackageName(), e);
            return null;
        }
    }

    public int t(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.g).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((yf2.f(cCharAt, 8192) < 0 || yf2.f(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public int v(int i) {
        Layout layout = (Layout) this.g;
        return t(layout.getLineEnd(i), layout.getLineStart(i));
    }

    public void w() {
        String strConcat = "https://appground.appspot.com/report";
        if (ay4.P("https://appground.appspot.com/report", "ws:", true)) {
            strConcat = "http:".concat("ps://appground.appspot.com/report");
        } else if (ay4.P("https://appground.appspot.com/report", "wss:", true)) {
            strConcat = "https:".concat("s://appground.appspot.com/report");
        }
        z82 z82Var = new z82();
        z82Var.c(null, strConcat);
        this.g = z82Var.a();
    }

    public int x(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.y;
        int iT = pw5.t(arrayList, Integer.valueOf(i));
        int i2 = iT < 0 ? -(iT + 1) : iT + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public float y(int i, boolean z) {
        Layout layout = (Layout) this.g;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public cp1(ro1 ro1Var) {
        ro1Var.g();
        Context context = ro1Var.g;
        ro1Var.g();
        lp1 lp1Var = ro1Var.r;
        n14 n14Var = ((r11) ro1Var.y(r11.class)).y;
        jr2.m(context);
        jr2.m(lp1Var);
        jr2.m(n14Var);
        this.g = context;
        this.y = lp1Var.g;
        this.r = lp1Var.y;
        String str = lp1Var.j;
        this.n = str;
        if (str != null) {
            this.v = n14Var;
        } else {
            l0.u("FirebaseOptions#getProjectId cannot be null.");
            throw null;
        }
    }

    public cp1() {
        this.v = bi6.w;
        this.y = "GET";
        this.r = new fa4((byte) 15);
    }
}
