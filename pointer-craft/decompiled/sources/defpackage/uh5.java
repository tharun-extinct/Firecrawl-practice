package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class uh5 {
    public final Object g;
    public final Object j;
    public final Object l;
    public final Object n;
    public final Object r;
    public final Object t;
    public final Object v;
    public final Object x;
    public final Object y;

    public uh5(WorkDatabase_Impl workDatabase_Impl) {
        this.g = workDatabase_Impl;
        byte b = 3;
        this.y = new mw3(workDatabase_Impl, b);
        this.r = new a15(workDatabase_Impl, b);
        this.n = new a15(workDatabase_Impl, (byte) 4);
        this.v = new a15(workDatabase_Impl, (byte) 5);
        this.x = new a15(workDatabase_Impl, (byte) 6);
        this.l = new a15(workDatabase_Impl, (byte) 7);
        this.j = new a15(workDatabase_Impl, (byte) 8);
        this.t = new a15(workDatabase_Impl, (byte) 9);
        new a15(workDatabase_Impl, (byte) 10);
    }

    public sr5 a(String str) {
        ba4 ba4Var;
        sr5 sr5Var;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        ba4 ba4VarX = ba4.x("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            ba4VarX.g(1);
        } else {
            ba4VarX.G(str, 1);
        }
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
            int iH12 = gp4.H(cursorG, "input_merger_class_name");
            int iH13 = gp4.H(cursorG, "input");
            int iH14 = gp4.H(cursorG, "output");
            ba4Var = ba4VarX;
            try {
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
                if (cursorG.moveToFirst()) {
                    String string = cursorG.getString(iH9);
                    String string2 = cursorG.getString(iH11);
                    vs0 vs0Var = new vs0();
                    vs0Var.m(cc6.a(cursorG.getInt(iH)));
                    vs0Var.w(cursorG.getInt(iH2) != 0);
                    vs0Var.c(cursorG.getInt(iH3) != 0);
                    vs0Var.q(cursorG.getInt(iH4) != 0);
                    vs0Var.i(cursorG.getInt(iH5) != 0);
                    vs0Var.b(cursorG.getLong(iH6));
                    vs0Var.s(cursorG.getLong(iH7));
                    vs0Var.a(cc6.x(cursorG.getBlob(iH8)));
                    sr5Var = new sr5(string, string2);
                    sr5Var.y = cc6.q(cursorG.getInt(iH10));
                    sr5Var.n = cursorG.getString(iH12);
                    sr5Var.v = qz0.g(cursorG.getBlob(iH13));
                    sr5Var.x = qz0.g(cursorG.getBlob(iH14));
                    sr5Var.l = cursorG.getLong(iH15);
                    sr5Var.j = cursorG.getLong(iH16);
                    sr5Var.t = cursorG.getLong(iH17);
                    sr5Var.m = cursorG.getInt(iH18);
                    sr5Var.q = cc6.t(cursorG.getInt(iH19));
                    sr5Var.w = cursorG.getLong(iH20);
                    sr5Var.c = cursorG.getLong(iH21);
                    sr5Var.i = cursorG.getLong(iH22);
                    sr5Var.b = cursorG.getLong(iH23);
                    sr5Var.s = cursorG.getInt(iH24) != 0;
                    sr5Var.p = cc6.m(cursorG.getInt(iH25));
                    sr5Var.a = vs0Var;
                } else {
                    sr5Var = null;
                }
                cursorG.close();
                ba4Var.a();
                return sr5Var;
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

    public void b(hr5 hr5Var, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        workDatabase_Impl.y();
        StringBuilder sbU = sg6.u();
        sbU.append("UPDATE workspec SET state=");
        sbU.append("?");
        sbU.append(" WHERE id IN (");
        sg6.q(strArr.length, sbU);
        sbU.append(")");
        String string = sbU.toString();
        workDatabase_Impl.g();
        workDatabase_Impl.y();
        gy1 gy1VarT = workDatabase_Impl.t().K().t(string);
        gy1VarT.n(1, cc6.i(hr5Var));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                gy1VarT.g(i);
            } else {
                gy1VarT.G(str, i);
            }
            i++;
        }
        workDatabase_Impl.r();
        try {
            gy1VarT.y();
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.c();
        }
    }

    public void c(String str, qz0 qz0Var) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        workDatabase_Impl.y();
        a15 a15Var = (a15) this.n;
        gy1 gy1VarG = a15Var.g();
        byte[] bArrY = qz0.y(qz0Var);
        if (bArrY == null) {
            gy1VarG.g(1);
        } else {
            gy1VarG.l(1, bArrY);
        }
        if (str == null) {
            gy1VarG.g(2);
        } else {
            gy1VarG.G(str, 2);
        }
        workDatabase_Impl.r();
        try {
            gy1VarG.y();
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.c();
            a15Var.w(gy1VarG);
        }
    }

    public void g(mr mrVar) throws IOException {
        ArrayList arrayList;
        ir irVar = (ir) mrVar.keySet();
        if (irVar.isEmpty()) {
            return;
        }
        if (mrVar.a > 999) {
            mr mrVar2 = new mr(999);
            int i = mrVar.a;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                mrVar2.put((String) mrVar.x(i2), (ArrayList) mrVar.t(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    g(mrVar2);
                    mrVar2 = new mr(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                g(mrVar2);
                return;
            }
            return;
        }
        StringBuilder sbU = sg6.u();
        sbU.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = irVar.size();
        sg6.q(size, sbU);
        sbU.append(")");
        ba4 ba4VarX = ba4.x(sbU.toString(), size);
        Iterator it = irVar.iterator();
        int i4 = 1;
        while (true) {
            bb2 bb2Var = (bb2) it;
            if (!bb2Var.hasNext()) {
                break;
            }
            String str = (String) bb2Var.next();
            if (str == null) {
                ba4VarX.g(i4);
            } else {
                ba4VarX.G(str, i4);
            }
            i4++;
        }
        Cursor cursorG = pw5.G((WorkDatabase_Impl) this.g, ba4VarX, false);
        try {
            int iG = gp4.G(cursorG, "work_spec_id");
            if (iG == -1) {
                cursorG.close();
                return;
            }
            while (cursorG.moveToNext()) {
                if (!cursorG.isNull(iG) && (arrayList = (ArrayList) mrVar.get(cursorG.getString(iG))) != null) {
                    arrayList.add(qz0.g(cursorG.getBlob(0)));
                }
            }
            cursorG.close();
        } catch (Throwable th) {
            cursorG.close();
            throw th;
        }
    }

    public void i(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        workDatabase_Impl.y();
        a15 a15Var = (a15) this.v;
        gy1 gy1VarG = a15Var.g();
        gy1VarG.n(1, j);
        if (str == null) {
            gy1VarG.g(2);
        } else {
            gy1VarG.G(str, 2);
        }
        workDatabase_Impl.r();
        try {
            gy1VarG.y();
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.c();
            a15Var.w(gy1VarG);
        }
    }

    public hr5 j(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        ba4 ba4VarX = ba4.x("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            ba4VarX.g(1);
        } else {
            ba4VarX.G(str, 1);
        }
        workDatabase_Impl.y();
        Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
        try {
            return cursorG.moveToFirst() ? cc6.q(cursorG.getInt(0)) : null;
        } finally {
            cursorG.close();
            ba4VarX.a();
        }
    }

    public ArrayList l() {
        ba4 ba4Var;
        ba4 ba4VarX = ba4.x("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
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
            int iH12 = gp4.H(cursorG, "input_merger_class_name");
            int iH13 = gp4.H(cursorG, "input");
            int iH14 = gp4.H(cursorG, "output");
            ba4Var = ba4VarX;
            try {
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
                int i = iH14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iH9);
                    int i2 = iH9;
                    String string2 = cursorG.getString(iH11);
                    int i3 = iH11;
                    vs0 vs0Var = new vs0();
                    int i4 = iH;
                    vs0Var.m(cc6.a(cursorG.getInt(iH)));
                    vs0Var.w(cursorG.getInt(iH2) != 0);
                    vs0Var.c(cursorG.getInt(iH3) != 0);
                    vs0Var.q(cursorG.getInt(iH4) != 0);
                    vs0Var.i(cursorG.getInt(iH5) != 0);
                    int i5 = iH2;
                    int i6 = iH3;
                    vs0Var.b(cursorG.getLong(iH6));
                    vs0Var.s(cursorG.getLong(iH7));
                    vs0Var.a(cc6.x(cursorG.getBlob(iH8)));
                    sr5 sr5Var = new sr5(string, string2);
                    sr5Var.y = cc6.q(cursorG.getInt(iH10));
                    sr5Var.n = cursorG.getString(iH12);
                    sr5Var.v = qz0.g(cursorG.getBlob(iH13));
                    int i7 = i;
                    sr5Var.x = qz0.g(cursorG.getBlob(i7));
                    int i8 = iH15;
                    i = i7;
                    sr5Var.l = cursorG.getLong(i8);
                    int i9 = iH4;
                    int i10 = iH16;
                    sr5Var.j = cursorG.getLong(i10);
                    iH16 = i10;
                    int i11 = iH17;
                    sr5Var.t = cursorG.getLong(i11);
                    int i12 = iH18;
                    sr5Var.m = cursorG.getInt(i12);
                    int i13 = iH19;
                    iH18 = i12;
                    sr5Var.q = cc6.t(cursorG.getInt(i13));
                    iH17 = i11;
                    int i14 = iH20;
                    sr5Var.w = cursorG.getLong(i14);
                    iH20 = i14;
                    int i15 = iH21;
                    sr5Var.c = cursorG.getLong(i15);
                    iH21 = i15;
                    int i16 = iH22;
                    sr5Var.i = cursorG.getLong(i16);
                    iH22 = i16;
                    int i17 = iH23;
                    sr5Var.b = cursorG.getLong(i17);
                    int i18 = iH24;
                    sr5Var.s = cursorG.getInt(i18) != 0;
                    int i19 = iH25;
                    iH24 = i18;
                    sr5Var.p = cc6.m(cursorG.getInt(i19));
                    sr5Var.a = vs0Var;
                    arrayList.add(sr5Var);
                    iH19 = i13;
                    iH4 = i9;
                    iH2 = i5;
                    iH25 = i19;
                    iH23 = i17;
                    iH15 = i8;
                    iH9 = i2;
                    iH11 = i3;
                    iH = i4;
                    iH3 = i6;
                }
                cursorG.close();
                ba4Var.a();
                return arrayList;
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

    public ArrayList m(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        ba4 ba4VarX = ba4.x("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            ba4VarX.g(1);
        } else {
            ba4VarX.G(str, 1);
        }
        workDatabase_Impl.y();
        Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
        try {
            int iH = gp4.H(cursorG, "id");
            int iH2 = gp4.H(cursorG, "state");
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                qr5 qr5Var = new qr5();
                qr5Var.g = cursorG.getString(iH);
                qr5Var.y = cc6.q(cursorG.getInt(iH2));
                arrayList.add(qr5Var);
            }
            cursorG.close();
            ba4VarX.a();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            ba4VarX.a();
            throw th;
        }
    }

    public ArrayList n() throws Throwable {
        ba4 ba4Var;
        ba4 ba4VarX = ba4.x("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        ba4VarX.n(1, 200L);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
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
            int iH12 = gp4.H(cursorG, "input_merger_class_name");
            int iH13 = gp4.H(cursorG, "input");
            int iH14 = gp4.H(cursorG, "output");
            ba4Var = ba4VarX;
            try {
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
                int i = iH14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iH9);
                    int i2 = iH9;
                    String string2 = cursorG.getString(iH11);
                    int i3 = iH11;
                    vs0 vs0Var = new vs0();
                    int i4 = iH;
                    vs0Var.m(cc6.a(cursorG.getInt(iH)));
                    vs0Var.w(cursorG.getInt(iH2) != 0);
                    vs0Var.c(cursorG.getInt(iH3) != 0);
                    vs0Var.q(cursorG.getInt(iH4) != 0);
                    vs0Var.i(cursorG.getInt(iH5) != 0);
                    int i5 = iH2;
                    int i6 = iH3;
                    vs0Var.b(cursorG.getLong(iH6));
                    vs0Var.s(cursorG.getLong(iH7));
                    vs0Var.a(cc6.x(cursorG.getBlob(iH8)));
                    sr5 sr5Var = new sr5(string, string2);
                    sr5Var.y = cc6.q(cursorG.getInt(iH10));
                    sr5Var.n = cursorG.getString(iH12);
                    sr5Var.v = qz0.g(cursorG.getBlob(iH13));
                    int i7 = i;
                    sr5Var.x = qz0.g(cursorG.getBlob(i7));
                    int i8 = iH13;
                    int i9 = iH15;
                    sr5Var.l = cursorG.getLong(i9);
                    int i10 = iH4;
                    int i11 = iH16;
                    sr5Var.j = cursorG.getLong(i11);
                    int i12 = iH17;
                    sr5Var.t = cursorG.getLong(i12);
                    int i13 = iH18;
                    sr5Var.m = cursorG.getInt(i13);
                    int i14 = iH19;
                    sr5Var.q = cc6.t(cursorG.getInt(i14));
                    int i15 = iH20;
                    sr5Var.w = cursorG.getLong(i15);
                    int i16 = iH21;
                    sr5Var.c = cursorG.getLong(i16);
                    int i17 = iH22;
                    sr5Var.i = cursorG.getLong(i17);
                    int i18 = iH23;
                    sr5Var.b = cursorG.getLong(i18);
                    int i19 = iH24;
                    sr5Var.s = cursorG.getInt(i19) != 0;
                    int i20 = iH25;
                    sr5Var.p = cc6.m(cursorG.getInt(i20));
                    sr5Var.a = vs0Var;
                    arrayList.add(sr5Var);
                    iH22 = i17;
                    iH4 = i10;
                    iH17 = i12;
                    iH18 = i13;
                    iH19 = i14;
                    i = i7;
                    iH2 = i5;
                    iH15 = i9;
                    iH16 = i11;
                    iH20 = i15;
                    iH21 = i16;
                    iH24 = i19;
                    iH11 = i3;
                    iH = i4;
                    iH25 = i20;
                    iH23 = i18;
                    iH13 = i8;
                    iH9 = i2;
                    iH3 = i6;
                }
                cursorG.close();
                ba4Var.a();
                return arrayList;
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

    /* JADX WARN: Code duplicated, block: B:65:0x0355 A[Catch: IOException -> 0x035c, TryCatch #2 {IOException -> 0x035c, blocks: (B:63:0x0339, B:65:0x0355, B:75:0x036b, B:76:0x0370, B:77:0x0375), top: B:106:0x0339 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x035e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0375 A[Catch: IOException -> 0x035c, TRY_LEAVE, TryCatch #2 {IOException -> 0x035c, blocks: (B:63:0x0339, B:65:0x0355, B:75:0x036b, B:76:0x0370, B:77:0x0375), top: B:106:0x0339 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public void q(cv cvVar, int i) {
        byte[] bArr;
        long j;
        eu euVarX;
        hc0 hc0VarG;
        int i2;
        long j2;
        va5 va5Var;
        final uh5 uh5Var = this;
        final cv cvVar2 = cvVar;
        byte[] bArr2 = cvVar2.y;
        bc4 bc4Var = (bc4) uh5Var.n;
        dd5 dd5VarG = ((t53) uh5Var.y).g(cvVar2.g);
        eu.v(0L);
        long jMax = 0;
        while (true) {
            final byte b = 0;
            if (!((Boolean) bc4Var.i(new n05(uh5Var) { // from class: th5
                public final /* synthetic */ uh5 t;

                {
                    this.t = uh5Var;
                }

                @Override // defpackage.n05
                public final Object y() {
                    Boolean bool;
                    byte b2 = b;
                    cv cvVar3 = cvVar2;
                    uh5 uh5Var2 = this.t;
                    switch (b2) {
                        case 0:
                            bc4 bc4Var2 = (bc4) uh5Var2.r;
                            SQLiteDatabase sQLiteDatabaseY = bc4Var2.y();
                            sQLiteDatabaseY.beginTransaction();
                            try {
                                Long lX = bc4.x(sQLiteDatabaseY, cvVar3);
                                if (lX == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = bc4Var2.y().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lX.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseY.setTransactionSuccessful();
                                sQLiteDatabaseY.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseY.endTransaction();
                                throw th2;
                            }
                        default:
                            bc4 bc4Var3 = (bc4) uh5Var2.r;
                            bc4Var3.getClass();
                            return (Iterable) bc4Var3.t(new qm3(bc4Var3, cvVar3, (byte) 2));
                    }
                }
            })).booleanValue()) {
                bc4Var.i(new wb4(jMax, uh5Var, cvVar2));
                return;
            }
            final byte b2 = 1;
            Iterable iterable = (Iterable) bc4Var.i(new n05(uh5Var) { // from class: th5
                public final /* synthetic */ uh5 t;

                {
                    this.t = uh5Var;
                }

                @Override // defpackage.n05
                public final Object y() {
                    Boolean bool;
                    byte b3 = b2;
                    cv cvVar3 = cvVar2;
                    uh5 uh5Var2 = this.t;
                    switch (b3) {
                        case 0:
                            bc4 bc4Var2 = (bc4) uh5Var2.r;
                            SQLiteDatabase sQLiteDatabaseY = bc4Var2.y();
                            sQLiteDatabaseY.beginTransaction();
                            try {
                                Long lX = bc4.x(sQLiteDatabaseY, cvVar3);
                                if (lX == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = bc4Var2.y().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lX.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseY.setTransactionSuccessful();
                                sQLiteDatabaseY.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseY.endTransaction();
                                throw th2;
                            }
                        default:
                            bc4 bc4Var3 = (bc4) uh5Var2.r;
                            bc4Var3.getClass();
                            return (Iterable) bc4Var3.t(new qm3(bc4Var3, cvVar3, (byte) 2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (dd5VarG == null) {
                sp2.a("Uploader", "Unknown backend for %s, deleting event batch for it...", cvVar2);
                euVarX = eu.g();
                bArr = bArr2;
                j = jMax;
                b2 = 1;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((uu) it.next()).r);
                }
                if (bArr2 != null) {
                    bc4 bc4Var2 = (bc4) uh5Var.v;
                    Objects.requireNonNull(bc4Var2);
                    zh0 zh0Var = (zh0) bc4Var.i(new rh5(bc4Var2, b));
                    vl vlVar = new vl();
                    vlVar.x = new HashMap();
                    vlVar.n = Long.valueOf(((di0) uh5Var.j).n());
                    vlVar.v = Long.valueOf(((di0) uh5Var.t).n());
                    vlVar.g = "GDT_CLIENT_METRICS";
                    vlVar.r = new aj1(new dj1("proto"), zh0Var.g());
                    arrayList.add(((ic0) dd5VarG).g(vlVar.m()));
                }
                rk4 rk4VarG = du.g();
                rk4VarG.M(arrayList);
                rk4VarG.N(bArr2);
                du duVarC = rk4VarG.c();
                ic0 ic0Var = (ic0) dd5VarG;
                HashMap map = new HashMap();
                for (ju juVar : duVarC.y()) {
                    String str = juVar.g;
                    if (map.containsKey(str)) {
                        ((List) map.get(str)).add(juVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(juVar);
                        map.put(str, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    du duVar = duVarC;
                    ju juVar2 = (ju) ((List) entry.getValue()).get(0);
                    va5 va5Var2 = new va5();
                    c24 c24Var = c24.j;
                    va5Var2.p();
                    byte[] bArr3 = bArr2;
                    va5Var2.u(ic0Var.x.n());
                    va5Var2.z(ic0Var.v.n());
                    cd2 cd2Var = new cd2((byte) 4, false);
                    cd2Var.K();
                    bu buVar = new bu();
                    buVar.w(Integer.valueOf(juVar2.y("sdk-version")));
                    buVar.a(juVar2.g("model"));
                    buVar.x(juVar2.g("hardware"));
                    buVar.n(juVar2.g("device"));
                    buVar.q(juVar2.g("product"));
                    buVar.m(juVar2.g("os-uild"));
                    buVar.j(juVar2.g("manufacturer"));
                    buVar.v(juVar2.g("fingerprint"));
                    buVar.r(juVar2.g("country"));
                    buVar.l(juVar2.g("locale"));
                    buVar.t(juVar2.g("mcc_mnc"));
                    buVar.y(juVar2.g("application_build"));
                    cd2Var.J(buVar.g());
                    va5Var2.t(cd2Var.a());
                    try {
                        va5Var2.h(Integer.parseInt((String) entry.getKey()));
                    } catch (NumberFormatException unused) {
                        va5Var2.o((String) entry.getKey());
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        ju juVar3 = (ju) it2.next();
                        aj1 aj1Var = juVar3.r;
                        dj1 dj1Var = aj1Var.g;
                        byte[] bArr4 = aj1Var.y;
                        Iterator it3 = it2;
                        if (dj1Var.equals(new dj1("proto"))) {
                            va5Var = new va5();
                            va5Var.f(bArr4);
                            j2 = jMax;
                        } else {
                            j2 = jMax;
                            if (dj1Var.equals(new dj1("json"))) {
                                String str2 = new String(bArr4, Charset.forName("UTF-8"));
                                va5 va5Var3 = new va5();
                                va5Var3.k(str2);
                                va5Var = va5Var3;
                            } else {
                                String strP = sp2.p("CctTransportBackend");
                                if (Log.isLoggable(strP, 5)) {
                                    Log.w(strP, "Received event of unsupported encoding " + dj1Var + ". Skipping...");
                                }
                            }
                            it2 = it3;
                            jMax = j2;
                        }
                        va5Var.m(juVar3.n);
                        va5Var.q(juVar3.v);
                        String str3 = (String) juVar3.x.get("tz-offset");
                        va5Var.d(str3 == null ? 0L : Long.valueOf(str3).longValue());
                        rk4 rk4Var = new rk4((byte) 5, false);
                        rk4Var.Q(lg3.g(juVar3.y("net-type")));
                        rk4Var.O((kg3) kg3.j.get(juVar3.y("mobile-subtype")));
                        va5Var.s(rk4Var.i());
                        Integer num = juVar3.y;
                        if (num != null) {
                            va5Var.a(num);
                        }
                        arrayList4.add(va5Var.g());
                        it2 = it3;
                        jMax = j2;
                    }
                    va5Var2.b(arrayList4);
                    arrayList3.add(va5Var2.y());
                    duVarC = duVar;
                    bArr2 = bArr3;
                }
                du duVar2 = duVarC;
                bArr = bArr2;
                j = jMax;
                fu fuVar = new fu(arrayList3);
                URL urlY = ic0Var.n;
                String str4 = null;
                if (duVar2.r() != null) {
                    try {
                        ga0 ga0VarG = ga0.g(duVar2.r());
                        String str5 = ga0VarG.y;
                        str4 = str5 != null ? str5 : null;
                        urlY = ic0.y(ga0VarG.g);
                        try {
                            hc0VarG = we6.g(new q70(urlY, fuVar, str4, (byte) 2), new gc0((Object) ic0Var, (byte) 0), new up((byte) 4));
                            i2 = hc0VarG.g;
                            if (i2 == 200) {
                                euVarX = eu.v(hc0VarG.r);
                            } else if (i2 < 500 || i2 == 404) {
                                euVarX = eu.x();
                            } else {
                                euVarX = i2 == 400 ? eu.n() : eu.g();
                            }
                        } catch (IOException e) {
                            sp2.w("CctTransportBackend", "Could not make request to the backend", e);
                            euVarX = eu.x();
                        }
                    } catch (IllegalArgumentException unused2) {
                        euVarX = eu.g();
                    }
                } else {
                    hc0VarG = we6.g(new q70(urlY, fuVar, str4, (byte) 2), new gc0((Object) ic0Var, (byte) 0), new up((byte) 4));
                    i2 = hc0VarG.g;
                    if (i2 == 200) {
                        euVarX = eu.v(hc0VarG.r);
                    } else if (i2 < 500) {
                        euVarX = eu.x();
                    } else {
                        euVarX = eu.x();
                    }
                }
            }
            if (euVarX.r() == 2) {
                bc4Var.i(new r41(this, iterable, cvVar, j));
                ((ro) this.x).V(cvVar, i + 1, b2);
                return;
            }
            uh5Var = this;
            cvVar2 = cvVar;
            byte b3 = b2;
            jMax = j;
            bc4Var.i(new qm3(uh5Var, iterable, (byte) 4));
            if (euVarX.r() == b3) {
                jMax = Math.max(jMax, euVarX.y());
                if (bArr != null) {
                    bc4Var.i(new gc0((Object) uh5Var, (byte) 9));
                }
            } else if (euVarX.r() == 4) {
                HashMap map2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str6 = ((uu) it4.next()).r.g;
                    if (map2.containsKey(str6)) {
                        map2.put(str6, Integer.valueOf(((Integer) map2.get(str6)).intValue() + 1));
                    } else {
                        map2.put(str6, 1);
                    }
                }
                bc4Var.i(new qm3(uh5Var, map2, (byte) 5));
            }
            bArr2 = bArr;
        }
    }

    public void r(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        workDatabase_Impl.y();
        a15 a15Var = (a15) this.r;
        gy1 gy1VarG = a15Var.g();
        if (str == null) {
            gy1VarG.g(1);
        } else {
            gy1VarG.G(str, 1);
        }
        workDatabase_Impl.r();
        try {
            gy1VarG.y();
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.c();
            a15Var.w(gy1VarG);
        }
    }

    public ArrayList t(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        ba4 ba4VarX = ba4.x("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            ba4VarX.g(1);
        } else {
            ba4VarX.G(str, 1);
        }
        workDatabase_Impl.y();
        Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            ba4VarX.a();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            ba4VarX.a();
            throw th;
        }
    }

    public ArrayList v(int i) throws Throwable {
        ba4 ba4Var;
        ba4 ba4VarX = ba4.x("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        ba4VarX.n(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
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
            int iH12 = gp4.H(cursorG, "input_merger_class_name");
            int iH13 = gp4.H(cursorG, "input");
            int iH14 = gp4.H(cursorG, "output");
            ba4Var = ba4VarX;
            try {
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
                    vs0Var.m(cc6.a(cursorG.getInt(iH)));
                    vs0Var.w(cursorG.getInt(iH2) != 0);
                    vs0Var.c(cursorG.getInt(iH3) != 0);
                    vs0Var.q(cursorG.getInt(iH4) != 0);
                    vs0Var.i(cursorG.getInt(iH5) != 0);
                    int i6 = iH2;
                    int i7 = iH3;
                    vs0Var.b(cursorG.getLong(iH6));
                    vs0Var.s(cursorG.getLong(iH7));
                    vs0Var.a(cc6.x(cursorG.getBlob(iH8)));
                    sr5 sr5Var = new sr5(string, string2);
                    sr5Var.y = cc6.q(cursorG.getInt(iH10));
                    sr5Var.n = cursorG.getString(iH12);
                    sr5Var.v = qz0.g(cursorG.getBlob(iH13));
                    int i8 = i2;
                    sr5Var.x = qz0.g(cursorG.getBlob(i8));
                    int i9 = iH15;
                    int i10 = iH13;
                    sr5Var.l = cursorG.getLong(i9);
                    int i11 = iH4;
                    int i12 = iH16;
                    sr5Var.j = cursorG.getLong(i12);
                    int i13 = iH17;
                    sr5Var.t = cursorG.getLong(i13);
                    int i14 = iH18;
                    sr5Var.m = cursorG.getInt(i14);
                    int i15 = iH19;
                    sr5Var.q = cc6.t(cursorG.getInt(i15));
                    int i16 = iH20;
                    sr5Var.w = cursorG.getLong(i16);
                    int i17 = iH21;
                    sr5Var.c = cursorG.getLong(i17);
                    int i18 = iH22;
                    sr5Var.i = cursorG.getLong(i18);
                    int i19 = iH23;
                    sr5Var.b = cursorG.getLong(i19);
                    int i20 = iH24;
                    sr5Var.s = cursorG.getInt(i20) != 0;
                    int i21 = iH25;
                    sr5Var.p = cc6.m(cursorG.getInt(i21));
                    sr5Var.a = vs0Var;
                    arrayList.add(sr5Var);
                    iH22 = i18;
                    iH4 = i11;
                    iH17 = i13;
                    iH18 = i14;
                    iH19 = i15;
                    i2 = i8;
                    iH2 = i6;
                    iH24 = i20;
                    iH9 = i3;
                    iH11 = i4;
                    iH = i5;
                    iH25 = i21;
                    iH13 = i10;
                    iH15 = i9;
                    iH16 = i12;
                    iH20 = i16;
                    iH21 = i17;
                    iH23 = i19;
                    iH3 = i7;
                }
                cursorG.close();
                ba4Var.a();
                return arrayList;
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

    public void w(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        workDatabase_Impl.y();
        a15 a15Var = (a15) this.j;
        gy1 gy1VarG = a15Var.g();
        gy1VarG.n(1, j);
        if (str == null) {
            gy1VarG.g(2);
        } else {
            gy1VarG.G(str, 2);
        }
        workDatabase_Impl.r();
        try {
            gy1VarG.y();
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.c();
            a15Var.w(gy1VarG);
        }
    }

    public ArrayList x() throws Throwable {
        ba4 ba4Var;
        ba4 ba4VarX = ba4.x("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
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
            int iH12 = gp4.H(cursorG, "input_merger_class_name");
            int iH13 = gp4.H(cursorG, "input");
            int iH14 = gp4.H(cursorG, "output");
            ba4Var = ba4VarX;
            try {
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
                int i = iH14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iH9);
                    int i2 = iH9;
                    String string2 = cursorG.getString(iH11);
                    int i3 = iH11;
                    vs0 vs0Var = new vs0();
                    int i4 = iH;
                    vs0Var.m(cc6.a(cursorG.getInt(iH)));
                    vs0Var.w(cursorG.getInt(iH2) != 0);
                    vs0Var.c(cursorG.getInt(iH3) != 0);
                    vs0Var.q(cursorG.getInt(iH4) != 0);
                    vs0Var.i(cursorG.getInt(iH5) != 0);
                    int i5 = iH2;
                    int i6 = iH3;
                    vs0Var.b(cursorG.getLong(iH6));
                    vs0Var.s(cursorG.getLong(iH7));
                    vs0Var.a(cc6.x(cursorG.getBlob(iH8)));
                    sr5 sr5Var = new sr5(string, string2);
                    sr5Var.y = cc6.q(cursorG.getInt(iH10));
                    sr5Var.n = cursorG.getString(iH12);
                    sr5Var.v = qz0.g(cursorG.getBlob(iH13));
                    int i7 = i;
                    sr5Var.x = qz0.g(cursorG.getBlob(i7));
                    int i8 = iH15;
                    i = i7;
                    sr5Var.l = cursorG.getLong(i8);
                    int i9 = iH4;
                    int i10 = iH16;
                    sr5Var.j = cursorG.getLong(i10);
                    iH16 = i10;
                    int i11 = iH17;
                    sr5Var.t = cursorG.getLong(i11);
                    int i12 = iH18;
                    sr5Var.m = cursorG.getInt(i12);
                    int i13 = iH19;
                    iH18 = i12;
                    sr5Var.q = cc6.t(cursorG.getInt(i13));
                    iH17 = i11;
                    int i14 = iH20;
                    sr5Var.w = cursorG.getLong(i14);
                    iH20 = i14;
                    int i15 = iH21;
                    sr5Var.c = cursorG.getLong(i15);
                    iH21 = i15;
                    int i16 = iH22;
                    sr5Var.i = cursorG.getLong(i16);
                    iH22 = i16;
                    int i17 = iH23;
                    sr5Var.b = cursorG.getLong(i17);
                    int i18 = iH24;
                    sr5Var.s = cursorG.getInt(i18) != 0;
                    int i19 = iH25;
                    iH24 = i18;
                    sr5Var.p = cc6.m(cursorG.getInt(i19));
                    sr5Var.a = vs0Var;
                    arrayList.add(sr5Var);
                    iH19 = i13;
                    iH4 = i9;
                    iH2 = i5;
                    iH25 = i19;
                    iH23 = i17;
                    iH15 = i8;
                    iH9 = i2;
                    iH11 = i3;
                    iH = i4;
                    iH3 = i6;
                }
                cursorG.close();
                ba4Var.a();
                return arrayList;
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

    public void y(mr mrVar) throws IOException {
        ArrayList arrayList;
        ir irVar = (ir) mrVar.keySet();
        if (irVar.isEmpty()) {
            return;
        }
        if (mrVar.a > 999) {
            mr mrVar2 = new mr(999);
            int i = mrVar.a;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                mrVar2.put((String) mrVar.x(i2), (ArrayList) mrVar.t(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    y(mrVar2);
                    mrVar2 = new mr(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                y(mrVar2);
                return;
            }
            return;
        }
        StringBuilder sbU = sg6.u();
        sbU.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = irVar.size();
        sg6.q(size, sbU);
        sbU.append(")");
        ba4 ba4VarX = ba4.x(sbU.toString(), size);
        Iterator it = irVar.iterator();
        int i4 = 1;
        while (true) {
            bb2 bb2Var = (bb2) it;
            if (!bb2Var.hasNext()) {
                break;
            }
            String str = (String) bb2Var.next();
            if (str == null) {
                ba4VarX.g(i4);
            } else {
                ba4VarX.G(str, i4);
            }
            i4++;
        }
        Cursor cursorG = pw5.G((WorkDatabase_Impl) this.g, ba4VarX, false);
        try {
            int iG = gp4.G(cursorG, "work_spec_id");
            if (iG == -1) {
                cursorG.close();
                return;
            }
            while (cursorG.moveToNext()) {
                if (!cursorG.isNull(iG) && (arrayList = (ArrayList) mrVar.get(cursorG.getString(iG))) != null) {
                    arrayList.add(cursorG.getString(0));
                }
            }
            cursorG.close();
        } catch (Throwable th) {
            cursorG.close();
            throw th;
        }
    }

    public uh5(Context context, t53 t53Var, bc4 bc4Var, ro roVar, Executor executor, bc4 bc4Var2, di0 di0Var, di0 di0Var2, bc4 bc4Var3) {
        this.g = context;
        this.y = t53Var;
        this.r = bc4Var;
        this.x = roVar;
        this.l = executor;
        this.n = bc4Var2;
        this.j = di0Var;
        this.t = di0Var2;
        this.v = bc4Var3;
    }
}
