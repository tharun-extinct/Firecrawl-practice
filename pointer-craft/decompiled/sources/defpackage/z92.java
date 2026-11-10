package defpackage;

import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class z92 {
    public final ah2 g;
    public final String y;
    public static final rw3 r = new rw3("|S||P|");
    public static final rw3 n = new rw3("|S|id");
    public static final String[] v = {"*", "FCM", "GCM", ""};

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public z92(ro1 ro1Var) {
        ro1Var.g();
        this.g = new ah2(ro1Var.g, "com.google.android.gms.appid");
        ro1Var.g();
        lp1 lp1Var = ro1Var.r;
        String str = lp1Var.v;
        if (str == null) {
            ro1Var.g();
            str = lp1Var.y;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.y = str;
    }

    public final String g() {
        PublicKey publicKeyGeneratePublic;
        ah2 ah2Var = this.g;
        String str = (String) ah2Var.y(n, null);
        if (str != null) {
            return str;
        }
        String str2 = (String) ah2Var.y(r, null);
        if (str2 == null) {
            return null;
        }
        try {
            publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            publicKeyGeneratePublic = null;
        }
        if (publicKeyGeneratePublic == null) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String y() {
        for (String str : v) {
            String str2 = (String) this.g.y(new rw3("|T|" + this.y + "|" + str), null);
            if (str2 != null && !str2.isEmpty()) {
                if (!str2.startsWith("{")) {
                    return str2;
                }
                try {
                    return new JSONObject(str2).getString("token");
                } catch (JSONException unused) {
                    break;
                }
            }
        }
        return null;
    }
}
