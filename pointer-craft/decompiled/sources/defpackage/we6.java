package defpackage;

import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class we6 {
    public static final sj0 A;
    public static final sj0 B;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final sj0 d;
    public static final float e;
    public static final float f;
    public static final float h;
    public static final sj0 i;
    public static final float j;
    public static final sj0 k;
    public static final sj0 l;
    public static final sj0 m;
    public static final float n;
    public static final in4 o;
    public static final sj0 p;
    public static final sj0 q;
    public static final sj0 r;
    public static final sj0 s;
    public static final sj0 t;
    public static final float u;
    public static final sj0 v;
    public static final in4 w;
    public static final float x;
    public static final float z;
    public static final sj0 g = sj0.k;
    public static final float y = 1.0f;

    static {
        sj0 sj0Var = sj0.i;
        r = sj0Var;
        n = 0.38f;
        v = sj0Var;
        x = 0.12f;
        l = sj0Var;
        j = 0.38f;
        sj0 sj0Var2 = sj0.A;
        t = sj0Var2;
        a = 0.38f;
        m = sj0Var2;
        q = sj0Var;
        in4 in4Var = in4.q;
        w = in4Var;
        c = 28.0f;
        i = sj0.q;
        b = 24.0f;
        s = sj0.w;
        p = sj0.u;
        u = 40.0f;
        z = 32.0f;
        h = 2.0f;
        o = in4Var;
        f = 52.0f;
        sj0 sj0Var3 = sj0.s;
        k = sj0Var3;
        d = sj0Var3;
        e = 16.0f;
        A = sj0Var2;
        B = sj0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01d4 A[EDGE_INSN: B:115:0x01d4->B:94:0x01d4 BREAK  A[LOOP:0: B:3:0x0006->B:117:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    public static hc0 g(q70 q70Var, gc0 gc0Var, up upVar) {
        q70 q70Var2;
        hc0 hc0Var;
        hc0 hc0Var2;
        URL url;
        q70 q70Var3 = q70Var;
        int i2 = 5;
        do {
            ic0 ic0Var = (ic0) gc0Var.t;
            URL url2 = (URL) q70Var3.t;
            String strP = sp2.p("CctTransportBackend");
            if (Log.isLoggable(strP, 4)) {
                Log.i(strP, String.format("Making request to: %s", url2));
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(130000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            String str = (String) q70Var3.m;
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
            }
            try {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
                        q64 q64Var = ic0Var.g;
                        fu fuVar = (fu) q70Var3.a;
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                        sh2 sh2Var = (sh2) q64Var.t;
                        th2 th2Var = new th2(bufferedWriter, sh2Var.g, sh2Var.y, sh2Var.r, sh2Var.n);
                        th2Var.v(fuVar);
                        th2Var.l();
                        th2Var.y.flush();
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Integer numValueOf = Integer.valueOf(responseCode);
                        String strP2 = sp2.p("CctTransportBackend");
                        if (Log.isLoggable(strP2, 4)) {
                            Log.i(strP2, String.format("Status Code: %d", numValueOf));
                        }
                        sp2.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                        sp2.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                        if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                            if (responseCode != 200) {
                                q70Var2 = null;
                                hc0Var2 = new hc0(responseCode, null, 0L);
                            } else {
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        hc0 hc0Var3 = new hc0(responseCode, null, su.g(new BufferedReader(new InputStreamReader(gZIPInputStream))).g);
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        hc0Var2 = hc0Var3;
                                    } catch (Throwable th) {
                                        if (gZIPInputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            gZIPInputStream.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    if (inputStream == null) {
                                        throw th3;
                                    }
                                    try {
                                        inputStream.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            }
                            url = hc0Var2.y;
                            if (url != null) {
                                sp2.a("CctTransportBackend", "Following redirect to: %s", url);
                                q70Var3 = new q70(url, (fu) q70Var3.a, (String) q70Var3.m, (byte) 2);
                            } else {
                                q70Var3 = q70Var2;
                            }
                            if (q70Var3 != null) {
                                break;
                            }
                            i2--;
                        } else {
                            hc0Var2 = new hc0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                        }
                        q70Var2 = null;
                    } catch (Throwable th5) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                    }
                    throw th7;
                }
            } catch (ej1 e2) {
                e = e2;
                sp2.w("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                q70Var2 = null;
                hc0Var = new hc0(400, null, 0L);
                hc0Var2 = hc0Var;
            } catch (ConnectException e3) {
                e = e3;
                q70Var2 = null;
                sp2.w("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                hc0Var = new hc0(500, null, 0L);
                hc0Var2 = hc0Var;
            } catch (UnknownHostException e4) {
                e = e4;
                q70Var2 = null;
                sp2.w("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                hc0Var = new hc0(500, null, 0L);
                hc0Var2 = hc0Var;
            } catch (IOException e5) {
                e = e5;
                sp2.w("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                q70Var2 = null;
                hc0Var = new hc0(400, null, 0L);
                hc0Var2 = hc0Var;
            }
            url = hc0Var2.y;
            if (url != null) {
                sp2.a("CctTransportBackend", "Following redirect to: %s", url);
                q70Var3 = new q70(url, (fu) q70Var3.a, (String) q70Var3.m, (byte) 2);
            } else {
                q70Var3 = q70Var2;
            }
            if (q70Var3 != null) {
                break;
                break;
            }
            i2--;
        } while (i2 >= 1);
        return hc0Var2;
    }
}
