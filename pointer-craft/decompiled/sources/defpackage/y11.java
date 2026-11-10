package defpackage;

import android.text.TextUtils;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y11 implements Callable {
    public final /* synthetic */ byte g = 1;
    public final /* synthetic */ Object y;

    public /* synthetic */ y11(z11 z11Var) {
        this.y = z11Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws yo1, UnsupportedEncodingException {
        String string;
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                z11 z11Var = (z11) obj;
                synchronized (z11Var) {
                    try {
                        g52 g52Var = (g52) z11Var.g.get();
                        ArrayList arrayListG = g52Var.g();
                        synchronized (g52Var) {
                            g52Var.g.g(new wm0(g52Var, (byte) 26));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListG.size(); i++) {
                            lu luVar = (lu) arrayListG.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", luVar.g);
                            jSONObject.put("dates", new JSONArray((Collection) luVar.y));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                eu3 eu3Var = (eu3) obj;
                cp1 cp1Var = eu3Var.r;
                byte[] bytes = new JSONObject().toString().getBytes("UTF-8");
                m84 m84Var = eu3Var.x;
                if (m84Var.y > System.currentTimeMillis()) {
                    throw new yo1("Too many attempts.");
                }
                String str = (String) cp1Var.n;
                String str2 = (String) cp1Var.r;
                String str3 = (String) cp1Var.y;
                StringBuilder sbZ = du4.z("https://firebaseappcheck.googleapis.com/v1/projects/", str, "/apps/", str2, ":generatePlayIntegrityChallenge?key=");
                sbZ.append(str3);
                JSONObject jSONObject3 = new JSONObject(cp1Var.a(new URL(sbZ.toString()), bytes, m84Var, false));
                String strOptString = jSONObject3.optString("challenge");
                int i2 = sx4.g;
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = null;
                }
                String strOptString2 = jSONObject3.optString("ttl");
                String str4 = TextUtils.isEmpty(strOptString2) ? null : strOptString2;
                if (strOptString == null || str4 == null) {
                    throw new yo1("Unexpected server response.");
                }
                o02 o02Var = new o02();
                o02Var.g = strOptString;
                return o02Var;
        }
    }

    public /* synthetic */ y11(eu3 eu3Var, t32 t32Var) {
        this.y = eu3Var;
    }
}
