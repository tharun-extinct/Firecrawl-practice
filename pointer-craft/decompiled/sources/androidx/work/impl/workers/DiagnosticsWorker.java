package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.ba4;
import defpackage.cc6;
import defpackage.cd2;
import defpackage.du4;
import defpackage.gp4;
import defpackage.iy2;
import defpackage.kr5;
import defpackage.pw5;
import defpackage.qz0;
import defpackage.rk4;
import defpackage.ro;
import defpackage.sr5;
import defpackage.uh5;
import defpackage.vs0;
import defpackage.yw2;
import defpackage.z05;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DiagnosticsWorker extends Worker {
    public static final String c = iy2.v("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(cd2 cd2Var, rk4 rk4Var, ro roVar, ArrayList arrayList) throws IOException {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sr5 sr5Var = (sr5) obj;
            z05 z05VarH = roVar.H(sr5Var.g);
            Integer numValueOf = z05VarH != null ? Integer.valueOf(z05VarH.y) : null;
            String str = sr5Var.g;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cd2Var.t;
            ba4 ba4VarX = ba4.x("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                ba4VarX.g(1);
            } else {
                ba4VarX.G(str, 1);
            }
            workDatabase_Impl.y();
            Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                ba4VarX.a();
                ArrayList arrayListD = rk4Var.d(sr5Var.g);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListD);
                String str2 = sr5Var.g;
                String str3 = sr5Var.r;
                String strName = sr5Var.y.name();
                StringBuilder sbZ = du4.z("\n", str2, "\t ", str3, "\t ");
                sbZ.append(numValueOf);
                sbZ.append("\t ");
                sbZ.append(strName);
                sbZ.append("\t ");
                sbZ.append(strJoin);
                sbZ.append("\t ");
                sbZ.append(strJoin2);
                sbZ.append("\t");
                sb.append(sbZ.toString());
            } catch (Throwable th) {
                cursorG.close();
                ba4VarX.a();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final yw2 t() throws Throwable {
        ba4 ba4Var;
        ro roVar;
        cd2 cd2Var;
        rk4 rk4Var;
        int i;
        WorkDatabase workDatabase = kr5.g(this.j).r;
        uh5 uh5VarK = workDatabase.k();
        cd2 cd2VarO = workDatabase.o();
        rk4 rk4VarD = workDatabase.d();
        ro roVarH = workDatabase.h();
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        uh5VarK.getClass();
        ba4 ba4VarX = ba4.x("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        ba4VarX.n(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) uh5VarK.g;
        workDatabase_Impl.y();
        Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
        try {
            int iH = gp4.H(cursorG, "required_network_type");
            int iH2 = gp4.H(cursorG, "requires_charging");
            int iH3 = gp4.H(cursorG, "requires_device_idle");
            int iH4 = gp4.H(cursorG, "requires_battery_not_low");
            int iH5 = gp4.H(cursorG, "requires_storage_not_low");
            int iH6 = gp4.H(cursorG, "trigger_content_update_delay");
            int iH7 = gp4.H(cursorG, "trigger_max_content_delay");
            int iH8 = gp4.H(cursorG, "content_uri_triggers");
            int iH9 = gp4.H(cursorG, "id");
            int iH10 = gp4.H(cursorG, "state");
            int iH11 = gp4.H(cursorG, "worker_class_name");
            ba4Var = ba4VarX;
            try {
                int iH12 = gp4.H(cursorG, "input_merger_class_name");
                int iH13 = gp4.H(cursorG, "input");
                int iH14 = gp4.H(cursorG, "output");
                int iH15 = gp4.H(cursorG, "initial_delay");
                int iH16 = gp4.H(cursorG, "interval_duration");
                int iH17 = gp4.H(cursorG, "flex_duration");
                int iH18 = gp4.H(cursorG, "run_attempt_count");
                int iH19 = gp4.H(cursorG, "backoff_policy");
                int iH20 = gp4.H(cursorG, "backoff_delay_duration");
                int iH21 = gp4.H(cursorG, "period_start_time");
                int iH22 = gp4.H(cursorG, "minimum_retention_duration");
                int iH23 = gp4.H(cursorG, "schedule_requested_at");
                int iH24 = gp4.H(cursorG, "run_in_foreground");
                int iH25 = gp4.H(cursorG, "out_of_quota_policy");
                int i2 = iH14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iH9);
                    int i3 = iH9;
                    String string2 = cursorG.getString(iH11);
                    int i4 = iH11;
                    vs0 vs0Var = new vs0();
                    int i5 = iH;
                    vs0Var.g = cc6.a(cursorG.getInt(iH));
                    vs0Var.y = cursorG.getInt(iH2) != 0;
                    vs0Var.r = cursorG.getInt(iH3) != 0;
                    vs0Var.n = cursorG.getInt(iH4) != 0;
                    vs0Var.v = cursorG.getInt(iH5) != 0;
                    int i6 = iH2;
                    vs0Var.x = cursorG.getLong(iH6);
                    vs0Var.l = cursorG.getLong(iH7);
                    vs0Var.j = cc6.x(cursorG.getBlob(iH8));
                    sr5 sr5Var = new sr5(string, string2);
                    sr5Var.y = cc6.q(cursorG.getInt(iH10));
                    sr5Var.n = cursorG.getString(iH12);
                    sr5Var.v = qz0.g(cursorG.getBlob(iH13));
                    int i7 = i2;
                    sr5Var.x = qz0.g(cursorG.getBlob(i7));
                    int i8 = iH10;
                    int i9 = iH15;
                    int i10 = iH12;
                    sr5Var.l = cursorG.getLong(i9);
                    int i11 = iH16;
                    sr5Var.j = cursorG.getLong(i11);
                    int i12 = iH3;
                    int i13 = iH17;
                    sr5Var.t = cursorG.getLong(i13);
                    int i14 = iH18;
                    sr5Var.m = cursorG.getInt(i14);
                    int i15 = iH19;
                    int i16 = iH13;
                    sr5Var.q = cc6.t(cursorG.getInt(i15));
                    int i17 = iH20;
                    sr5Var.w = cursorG.getLong(i17);
                    int i18 = iH21;
                    sr5Var.c = cursorG.getLong(i18);
                    int i19 = iH22;
                    sr5Var.i = cursorG.getLong(i19);
                    int i20 = iH23;
                    sr5Var.b = cursorG.getLong(i20);
                    int i21 = iH24;
                    sr5Var.s = cursorG.getInt(i21) != 0;
                    int i22 = iH25;
                    sr5Var.p = cc6.m(cursorG.getInt(i22));
                    sr5Var.a = vs0Var;
                    arrayList.add(sr5Var);
                    iH21 = i18;
                    iH3 = i12;
                    i2 = i7;
                    iH24 = i21;
                    iH10 = i8;
                    iH13 = i16;
                    iH17 = i13;
                    iH19 = i15;
                    iH22 = i19;
                    iH20 = i17;
                    iH11 = i4;
                    iH = i5;
                    iH25 = i22;
                    iH23 = i20;
                    iH12 = i10;
                    iH15 = i9;
                    iH16 = i11;
                    iH2 = i6;
                    iH18 = i14;
                    iH9 = i3;
                }
                cursorG.close();
                ba4Var.a();
                ArrayList arrayListX = uh5VarK.x();
                ArrayList arrayListN = uh5VarK.n();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = c;
                if (zIsEmpty) {
                    roVar = roVarH;
                    cd2Var = cd2VarO;
                    rk4Var = rk4VarD;
                    i = 0;
                } else {
                    i = 0;
                    iy2.r().n(str, "Recently completed work:\n\n", new Throwable[0]);
                    roVar = roVarH;
                    cd2Var = cd2VarO;
                    rk4Var = rk4VarD;
                    iy2.r().n(str, a(cd2Var, rk4Var, roVar, arrayList), new Throwable[0]);
                }
                if (!arrayListX.isEmpty()) {
                    iy2.r().n(str, "Running work:\n\n", new Throwable[i]);
                    iy2.r().n(str, a(cd2Var, rk4Var, roVar, arrayListX), new Throwable[i]);
                }
                if (!arrayListN.isEmpty()) {
                    iy2.r().n(str, "Enqueued work:\n\n", new Throwable[i]);
                    iy2.r().n(str, a(cd2Var, rk4Var, roVar, arrayListN), new Throwable[i]);
                }
                return new yw2(qz0.r);
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                ba4Var.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ba4Var = ba4VarX;
        }
    }
}
