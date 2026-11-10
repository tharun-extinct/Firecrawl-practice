package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import io.appground.blek.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hv5 {
    public static final sp4 g = new sp4(0);
    public static Locale y;

    public static String g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return v(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return v(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case kq2.x /* 15 */:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return v(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return v(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String n(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strV = v(context, str);
        if (strV == null) {
            strV = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strV, str2);
    }

    public static String r(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) is5.g(context).t;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String v(Context context, String str) {
        Resources resourcesForApplication;
        sp4 sp4Var = g;
        synchronized (sp4Var) {
            try {
                Locale localeY = ux2.n(context.getResources().getConfiguration().getLocales()).y(0);
                if (!localeY.equals(y)) {
                    sp4Var.clear();
                    y = localeY;
                }
                String str2 = (String) sp4Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = s32.r;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(str.length() + 18);
                        sb.append("Missing resource: ");
                        sb.append(str);
                        Log.w("GoogleApiAvailability", sb.toString());
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            sp4Var.put(str, string);
                            return string;
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 20);
                        sb2.append("Got empty resource: ");
                        sb2.append(str);
                        Log.w("GoogleApiAvailability", sb2.toString());
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String y(Context context, int i) {
        Resources resources = context.getResources();
        String strR = r(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strR);
        }
        if (i == 2) {
            return oe6.g(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strR);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strR);
        }
        if (i == 5) {
            return n(context, "common_google_play_services_invalid_account_text", strR);
        }
        if (i == 7) {
            return n(context, "common_google_play_services_network_error_text", strR);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strR);
        }
        if (i == 20) {
            return n(context, "common_google_play_services_restricted_profile_text", strR);
        }
        switch (i) {
            case 16:
                return n(context, "common_google_play_services_api_unavailable_text", strR);
            case 17:
                return n(context, "common_google_play_services_sign_in_failed_text", strR);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strR);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strR);
        }
    }
}
