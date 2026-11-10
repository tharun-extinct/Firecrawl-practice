package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w5 {
    public static final String g = iy2.v("Alarms");

    public static void g(int i, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, qk0.y(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        iy2.r().g(g, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void y(Context context, kr5 kr5Var, String str, long j) {
        int iIntValue;
        WorkDatabase workDatabase = kr5Var.r;
        ro roVarH = workDatabase.h();
        z05 z05VarH = roVarH.H(str);
        if (z05VarH != null) {
            g(z05VarH.y, context, str);
            int i = z05VarH.y;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, qk0.y(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (v92.class) {
            workDatabase.r();
            try {
                Long lE = workDatabase.z().E("next_alarm_manager_id");
                iIntValue = lE != null ? lE.intValue() : 0;
                workDatabase.z().J(new lw3("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.s();
                workDatabase.c();
            } catch (Throwable th) {
                workDatabase.c();
                throw th;
            }
        }
        roVarH.M(new z05(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, qk0.y(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
