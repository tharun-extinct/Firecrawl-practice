package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class lp1 {
    public final String g;
    public final String j;
    public final String l;
    public final String n;
    public final String r;
    public final String v;
    public final String x;
    public final String y;

    public lp1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i = sx4.g;
        jr2.w("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.y = str;
        this.g = str2;
        this.r = str3;
        this.n = str4;
        this.v = str5;
        this.x = str6;
        this.l = str7;
        this.j = str8;
    }

    public static lp1 g(Context context) {
        wh4 wh4Var = new wh4(context, (byte) 3);
        String strX = wh4Var.x("google_app_id");
        if (TextUtils.isEmpty(strX)) {
            return null;
        }
        return new lp1(strX, wh4Var.x("google_api_key"), wh4Var.x("firebase_database_url"), wh4Var.x("ga_trackingId"), wh4Var.x("gcm_defaultSenderId"), wh4Var.x("google_storage_bucket"), wh4Var.x("recaptcha_site_key"), wh4Var.x("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lp1)) {
            return false;
        }
        lp1 lp1Var = (lp1) obj;
        return Objects.equals(this.y, lp1Var.y) && Objects.equals(this.g, lp1Var.g) && Objects.equals(this.r, lp1Var.r) && Objects.equals(this.n, lp1Var.n) && Objects.equals(this.v, lp1Var.v) && Objects.equals(this.x, lp1Var.x) && Objects.equals(this.l, lp1Var.l) && Objects.equals(this.j, lp1Var.j);
    }

    public final int hashCode() {
        return Objects.hash(this.y, this.g, this.r, this.n, this.v, this.x, this.l, this.j);
    }

    public final String toString() {
        rk4 rk4VarN = lb6.n(this);
        rk4VarN.q(this.y, "applicationId");
        rk4VarN.q(this.g, "apiKey");
        rk4VarN.q(this.r, "databaseUrl");
        rk4VarN.q(this.v, "gcmSenderId");
        rk4VarN.q(this.x, "storageBucket");
        rk4VarN.q(this.l, "recaptchaSiteKey");
        rk4VarN.q(this.j, "projectId");
        return rk4VarN.toString();
    }
}
