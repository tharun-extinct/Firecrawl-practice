package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yy5 {
    public static final nm0 g = new nm0(127448943, false, new tm0(0));
    public static ha2 y;

    /* JADX WARN: Code duplicated, block: B:102:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[Catch: rg2 -> 0x0189, TryCatch #4 {rg2 -> 0x0189, blocks: (B:32:0x00b1, B:33:0x00b3, B:34:0x00b6, B:51:0x00fe, B:35:0x00bf), top: B:102:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf A[Catch: rg2 -> 0x0189, TRY_LEAVE, TryCatch #4 {rg2 -> 0x0189, blocks: (B:32:0x00b1, B:33:0x00b3, B:34:0x00b6, B:51:0x00fe, B:35:0x00bf), top: B:102:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb A[Catch: rg2 -> 0x0186, TRY_ENTER, TRY_LEAVE, TryCatch #5 {rg2 -> 0x0186, blocks: (B:30:0x00ad, B:37:0x00cb, B:50:0x00ef, B:52:0x0103, B:56:0x0118, B:60:0x0120), top: B:104:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0163 -> B:18:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(defpackage.ns2 r26, int r27, defpackage.j51 r28, defpackage.ou0 r29) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy5.g(ns2, int, j51, ou0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public static Map n(String str) {
        Map mapX;
        jr2.t(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            Log.e("FirebaseAppCheck", "Invalid token (too few subsections):\n".concat(str), null);
            return Collections.EMPTY_MAP;
        }
        try {
            String str2 = new String(Base64.decode(strArrSplit[1], 11), "UTF-8");
            if (TextUtils.isEmpty(str2)) {
                mapX = null;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject != JSONObject.NULL) {
                        mapX = x(jSONObject);
                    } else {
                        mapX = null;
                    }
                } catch (Exception e) {
                    String str3 = "Failed to parse JSONObject into Map:\n" + e;
                    if (Log.isLoggable("FirebaseAppCheck", 3)) {
                        Log.d("FirebaseAppCheck", str3, null);
                    }
                    mapX = Collections.EMPTY_MAP;
                }
            }
            return mapX == null ? Collections.EMPTY_MAP : mapX;
        } catch (UnsupportedEncodingException e2) {
            Log.e("FirebaseAppCheck", "Unable to decode token (charset unknown):\n" + e2, null);
            return Collections.EMPTY_MAP;
        }
    }

    public static final boolean r(ns2 ns2Var) {
        return ns2Var.v() >= 0 && ns2Var.r() <= 0;
    }

    public static ArrayList v(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objX = jSONArray.get(i);
            if (objX instanceof JSONArray) {
                objX = v((JSONArray) objX);
            } else if (objX instanceof JSONObject) {
                objX = x((JSONObject) objX);
            }
            arrayList.add(objX);
        }
        return arrayList;
    }

    public static mr x(JSONObject jSONObject) throws JSONException {
        mr mrVar = new mr(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objX = jSONObject.get(next);
            if (objX instanceof JSONArray) {
                objX = v((JSONArray) objX);
            } else if (objX instanceof JSONObject) {
                objX = x((JSONObject) objX);
            } else if (objX.equals(JSONObject.NULL)) {
                objX = null;
            }
            mrVar.put(next, objX);
        }
        return mrVar;
    }

    public static final boolean y(boolean z, ns2 ns2Var) {
        if (z) {
            if (ns2Var.r() > 0) {
                return true;
            }
            return ns2Var.r() == 0 && ns2Var.n() > 0;
        }
        if (ns2Var.r() < 0) {
            return true;
        }
        return ns2Var.r() == 0 && ns2Var.n() < 0;
    }
}
