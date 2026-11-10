package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class l32 extends m32 {
    public static final Object n = new Object();
    public static final l32 v = new l32();
    public vv5 r;

    public static void l(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof yk) {
                kx1 kx1Var = ((rw1) ((yk) activity).C.t).e;
                az4 az4Var = new az4();
                jr2.q(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                az4Var.x0 = alertDialog;
                if (onCancelListener != null) {
                    az4Var.y0 = onCancelListener;
                }
                az4Var.u0 = false;
                az4Var.v0 = true;
                fw fwVar = new fw(kx1Var);
                fwVar.i = true;
                fwVar.x(0, az4Var, str, 1);
                fwVar.v(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        lk1 lk1Var = new lk1();
        jr2.q(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        lk1Var.j = alertDialog;
        if (onCancelListener != null) {
            lk1Var.t = onCancelListener;
        }
        lk1Var.show(fragmentManager, str);
    }

    public static AlertDialog n(Activity activity, int i, qv5 qv5Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(hv5.y(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(io.appground.blek.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(io.appground.blek.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(io.appground.blek.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, qv5Var);
        }
        String strG = hv5.g(activity, i);
        if (strG != null) {
            builder.setTitle(strG);
        }
        Log.w("GoogleApiAvailability", xi3.j("Creating dialog for Google Play services availability issue. ConnectionResult=", i), new IllegalArgumentException());
        return builder.create();
    }

    @Override // defpackage.m32
    public final Intent g(int i, Context context, String str) {
        return super.g(i, context, str);
    }

    public final void r(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogN = n(googleApiActivity, i, new iv5(super.g(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogN == null) {
            return;
        }
        l(googleApiActivity, alertDialogN, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void v(Activity activity, eu2 eu2Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogN = n(activity, i, new nv5(super.g(i, activity, "d"), eu2Var), onCancelListener);
        if (alertDialogN == null) {
            return;
        }
        l(activity, alertDialogN, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void x(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", du4.w(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new ev5(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strV = i == 6 ? hv5.v(context, "common_google_play_services_resolution_required_title") : hv5.g(context, i);
        if (strV == null) {
            strV = context.getResources().getString(io.appground.blek.R.string.common_google_play_services_notification_ticker);
        }
        String strN = (i == 6 || i == 19) ? hv5.n(context, "common_google_play_services_resolution_required_text", hv5.r(context)) : hv5.y(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        jr2.m(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        xh3 xh3Var = new xh3(context, null);
        xh3Var.m = true;
        xh3Var.i.flags |= 16;
        xh3Var.v = xh3.r(strV);
        wh3 wh3Var = new wh3();
        wh3Var.y = xh3.r(strN);
        xh3Var.j(wh3Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = oe6.i;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            oe6.i = boolValueOf;
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            xh3Var.i.icon = i3;
            xh3Var.j = (byte) 2;
            if (oe6.g(context)) {
                xh3Var.y.add(new vh3(2131230851, pendingIntent, resources.getString(io.appground.blek.R.string.common_open_on_phone)));
            } else {
                xh3Var.l = pendingIntent;
            }
        } else {
            xh3Var.i.icon = R.drawable.stat_sys_warning;
            xh3Var.i.tickerText = xh3.r(resources.getString(io.appground.blek.R.string.common_google_play_services_notification_ticker));
            xh3Var.i.when = System.currentTimeMillis();
            xh3Var.l = pendingIntent;
            xh3Var.v(strN);
        }
        if (zc6.y()) {
            if (!zc6.y()) {
                throw new IllegalStateException();
            }
            synchronized (n) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(io.appground.blek.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            xh3Var.w = "com.google.android.gms.availability";
        }
        Notification notificationY = xh3Var.y();
        if (i == 1 || i == 2 || i == 3) {
            s32.g.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationY);
    }
}
