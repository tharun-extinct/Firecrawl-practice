package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kq0 extends i1 {
    public final PendingIntent a;
    public final int j;
    public final String m;
    public final Integer q;
    public final int t;
    public static final kq0 w = new kq0(0, null, null);
    public static final Parcelable.Creator<kq0> CREATOR = new yv5(2);

    public kq0(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.j = i;
        this.t = i2;
        this.a = pendingIntent;
        this.m = str;
        this.q = num;
    }

    public static String r(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case kq2.x /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kq0)) {
            return false;
        }
        kq0 kq0Var = (kq0) obj;
        return this.t == kq0Var.t && lb6.g(this.a, kq0Var.a) && lb6.g(this.m, kq0Var.m) && lb6.g(this.q, kq0Var.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.t), this.a, this.m, this.q});
    }

    public final String toString() {
        rk4 rk4Var = new rk4(this);
        rk4Var.q(r(this.t), "statusCode");
        rk4Var.q(this.a, "resolution");
        rk4Var.q(this.m, "message");
        rk4Var.q(this.q, "clientMethodKey");
        return rk4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.x(parcel, 1, 4);
        parcel.writeInt(this.j);
        ef6.x(parcel, 2, 4);
        parcel.writeInt(this.t);
        ef6.y(parcel, 3, this.a, i);
        ef6.r(parcel, 4, this.m);
        Integer num = this.q;
        if (num != null) {
            ef6.x(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        ef6.j(parcel, iL);
    }

    public kq0(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
