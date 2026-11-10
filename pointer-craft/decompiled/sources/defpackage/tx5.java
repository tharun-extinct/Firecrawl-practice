package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tx5 {
    public static final void g(ad5 ad5Var, RemoteViews remoteViews, j3 j3Var, int i) {
        Integer num = ad5Var.w;
        if (num != null) {
            i = num.intValue();
        }
        try {
            if (ad5Var.x) {
                remoteViews.setOnClickFillInIntent(i, r(j3Var, ad5Var, i, new m9((byte) 10)));
            } else {
                remoteViews.setOnClickPendingIntent(i, v(j3Var, ad5Var, i, new m9((byte) 10)));
            }
        } catch (Throwable th) {
            Log.e("GlanceAppWidget", "Unrecognized Action: " + j3Var, th);
        }
    }

    public static final q75 l(h02 h02Var) {
        ku1 ku1Var = (ku1) h02Var.a(hp0.m);
        j51 j51Var = (j51) h02Var.a(hp0.j);
        fl2 fl2Var = (fl2) h02Var.a(hp0.c);
        boolean zX = h02Var.x(ku1Var) | h02Var.x(j51Var) | h02Var.n(fl2Var.ordinal()) | h02Var.n(8);
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            objK = new q75(ku1Var, j51Var, fl2Var);
            h02Var.i0(objK);
        }
        return (q75) objK;
    }

    public static final int n(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final Intent r(j3 j3Var, ad5 ad5Var, int i, m9 m9Var) {
        if (j3Var instanceof lv4) {
            lv4 lv4Var = (lv4) j3Var;
            Intent intentX = x(lv4Var, lv4Var.y);
            if (intentX.getData() == null) {
                intentX.setData(eg6.y(ad5Var, i, h4.t, String.valueOf(intentX.getFlags())));
            }
            return intentX;
        }
        if (!(j3Var instanceof lk2)) {
            l0.b(j3Var, "Cannot create fill-in Intent for action type: ");
            return null;
        }
        ComponentName componentName = ad5Var.c;
        if (componentName == null) {
            l0.u("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        String str = ((lk2) j3Var).g;
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", str).putExtra("EXTRA_APPWIDGET_ID", ad5Var.y);
        Intent intent = new Intent();
        intent.setComponent((ComponentName) ad5Var.i.t);
        intent.setData(eg6.y(ad5Var, i, h4.j, ""));
        intent.putExtra("ACTION_TYPE", "BROADCAST");
        intent.putExtra("ACTION_INTENT", intentPutExtra);
        return intent;
    }

    public static final PendingIntent v(j3 j3Var, ad5 ad5Var, int i, m9 m9Var) {
        Context context = ad5Var.g;
        boolean z = j3Var instanceof lv4;
        h4 h4Var = h4.t;
        if (z) {
            lv4 lv4Var = (lv4) j3Var;
            Intent intentX = x(lv4Var, lv4Var.y);
            if (intentX.getData() == null) {
                intentX.setData(eg6.y(ad5Var, i, h4Var, String.valueOf(intentX.getFlags())));
            }
            return PendingIntent.getActivity(context, 0, intentX, 201326592, null);
        }
        if (!(j3Var instanceof lk2)) {
            l0.b(j3Var, "Cannot create PendingIntent for action type: ");
            return null;
        }
        ComponentName componentName = ad5Var.c;
        if (componentName == null) {
            l0.u("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        String str = ((lk2) j3Var).g;
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", str).putExtra("EXTRA_APPWIDGET_ID", ad5Var.y);
        intentPutExtra.setData(eg6.y(ad5Var, i, h4Var, str));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    public static final Intent x(lv4 lv4Var, ba3 ba3Var) {
        if (!(lv4Var instanceof lv4)) {
            l0.b(lv4Var, "Action type not defined in app widget package: ");
            return null;
        }
        Intent intent = lv4Var.g;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(ba3Var.g);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            f4 f4Var = (f4) entry.getKey();
            arrayList.add(new fp3(f4Var.g, entry.getValue()));
        }
        fp3[] fp3VarArr = (fp3[]) arrayList.toArray(new fp3[0]);
        intent.putExtras(a11.n((fp3[]) Arrays.copyOf(fp3VarArr, fp3VarArr.length)));
        return intent;
    }

    public static final j73 y(j73 j73Var, l60 l60Var) {
        return j73Var.n(new j60(l60Var));
    }
}
