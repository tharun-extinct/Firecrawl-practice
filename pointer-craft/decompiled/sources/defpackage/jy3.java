package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class jy3 implements mz3, ub4, wi, mj5, s86 {
    public final Object j;

    public jy3(long[] jArr) {
        la3 la3Var;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            la3Var = new la3(jArrCopyOf.length);
            int i = la3Var.y;
            if (i < 0) {
                cf6.t("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArrCopyOf2 = la3Var.g;
                if (jArrCopyOf2.length < length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length, (jArrCopyOf2.length * 3) / 2));
                    la3Var.g = jArrCopyOf2;
                }
                int i2 = la3Var.y;
                if (i != i2) {
                    pr.N(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i, i, i2);
                }
                pr.N(jArrCopyOf, jArrCopyOf2, i, 0, jArrCopyOf.length);
                la3Var.y += jArrCopyOf.length;
            }
        } else {
            la3Var = new la3();
        }
        this.j = la3Var;
    }

    public static b20 b(zx1 zx1Var) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new c25("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new c25("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new d25("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new d25("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new e25("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new e25("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        f25 f25Var = new f25("Dependency", map, hashSet, hashSet2);
        f25 f25VarG = f25.g(zx1Var, "Dependency");
        if (!f25Var.equals(f25VarG)) {
            return new b20("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + f25Var + "\n Found:\n" + f25VarG, false);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new c25("id", "TEXT", true, 1, null, 1));
        map2.put("state", new c25("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new c25("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new c25("input_merger_class_name", "TEXT", false, 0, null, 1));
        map2.put("input", new c25("input", "BLOB", true, 0, null, 1));
        map2.put("output", new c25("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new c25("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new c25("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new c25("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new c25("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new c25("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new c25("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("period_start_time", new c25("period_start_time", "INTEGER", true, 0, null, 1));
        map2.put("minimum_retention_duration", new c25("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new c25("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new c25("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new c25("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("required_network_type", new c25("required_network_type", "INTEGER", false, 0, null, 1));
        map2.put("requires_charging", new c25("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new c25("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new c25("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new c25("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new c25("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new c25("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new c25("content_uri_triggers", "BLOB", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new e25("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new e25("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        f25 f25Var2 = new f25("WorkSpec", map2, hashSet3, hashSet4);
        f25 f25VarG2 = f25.g(zx1Var, "WorkSpec");
        if (!f25Var2.equals(f25VarG2)) {
            return new b20("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + f25Var2 + "\n Found:\n" + f25VarG2, false);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new c25("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new c25("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new d25("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new e25("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        f25 f25Var3 = new f25("WorkTag", map3, hashSet5, hashSet6);
        f25 f25VarG3 = f25.g(zx1Var, "WorkTag");
        if (!f25Var3.equals(f25VarG3)) {
            return new b20("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + f25Var3 + "\n Found:\n" + f25VarG3, false);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new c25("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("system_id", new c25("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new d25("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        f25 f25Var4 = new f25("SystemIdInfo", map4, hashSet7, new HashSet(0));
        f25 f25VarG4 = f25.g(zx1Var, "SystemIdInfo");
        if (!f25Var4.equals(f25VarG4)) {
            return new b20("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + f25Var4 + "\n Found:\n" + f25VarG4, false);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new c25("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new c25("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new d25("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new e25("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        f25 f25Var5 = new f25("WorkName", map5, hashSet8, hashSet9);
        f25 f25VarG5 = f25.g(zx1Var, "WorkName");
        if (!f25Var5.equals(f25VarG5)) {
            return new b20("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + f25Var5 + "\n Found:\n" + f25VarG5, false);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new c25("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new c25("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new d25("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        f25 f25Var6 = new f25("WorkProgress", map6, hashSet10, new HashSet(0));
        f25 f25VarG6 = f25.g(zx1Var, "WorkProgress");
        if (!f25Var6.equals(f25VarG6)) {
            return new b20("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + f25Var6 + "\n Found:\n" + f25VarG6, false);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new c25("key", "TEXT", true, 1, null, 1));
        map7.put("long_value", new c25("long_value", "INTEGER", false, 0, null, 1));
        f25 f25Var7 = new f25("Preference", map7, new HashSet(0), new HashSet(0));
        f25 f25VarG7 = f25.g(zx1Var, "Preference");
        if (f25Var7.equals(f25VarG7)) {
            return new b20((String) null, true);
        }
        return new b20("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + f25Var7 + "\n Found:\n" + f25VarG7, false);
    }

    public static void i(zx1 zx1Var) {
        SQLiteDatabase sQLiteDatabase = zx1Var.j;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    @Override // defpackage.mz3
    public void a() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void c(z53 z53Var) {
        z53Var.getClass();
        byte b = z53Var.g;
        byte b2 = z53Var.y;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.j;
        Integer numValueOf = Integer.valueOf(b);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(b2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(b2)) + " with " + z53Var);
        }
        treeMap2.put(Integer.valueOf(b2), z53Var);
    }

    @Override // defpackage.mj5, defpackage.jj5
    public boolean g() {
        return false;
    }

    @Override // defpackage.wi
    public gq1 get(int i) {
        return (lq1) this.j;
    }

    @Override // defpackage.jj5
    public vi j(vi viVar, vi viVar2, vi viVar3) {
        return ((kb5) this.j).j(viVar, viVar2, viVar3);
    }

    @Override // defpackage.jj5
    public vi l(long j, vi viVar, vi viVar2, vi viVar3) {
        return ((kb5) this.j).l(j, viVar, viVar2, viVar3);
    }

    @Override // defpackage.ub4
    public boolean m() {
        return true;
    }

    @Override // defpackage.mz3
    public void q(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.j).setResultCode(i);
    }

    @Override // defpackage.ub4
    public tb4 r(String str) {
        str.getClass();
        iz4 iz4Var = (iz4) this.j;
        String databaseName = iz4Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                l0.t(du4.i("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str)) {
            int iZ = tx4.Z(databaseName, '/', 0, 6);
            if (iZ != -1) {
                databaseName = databaseName.substring(iZ + 1, databaseName.length());
            }
            int iZ2 = tx4.Z(str, '/', 0, 6);
            if (!databaseName.equals(iZ2 == -1 ? str : str.substring(iZ2 + 1, str.length()))) {
                uo1.o("This driver is configured to open a database named '", iz4Var.getDatabaseName(), "' but '", str, "' was requested.");
                return null;
            }
        }
        return new fz4(iz4Var.K());
    }

    @Override // defpackage.s86
    public p96 t(Class cls) {
        for (int i = 0; i < 2; i++) {
            s86 s86Var = ((s86[]) this.j)[i];
            if (s86Var.w(cls)) {
                return s86Var.t(cls);
            }
        }
        uo1.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.jj5
    public vi v(long j, vi viVar, vi viVar2, vi viVar3) {
        return ((kb5) this.j).v(j, viVar, viVar2, viVar3);
    }

    @Override // defpackage.s86
    public boolean w(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((s86[]) this.j)[i].w(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jj5
    public long y(vi viVar, vi viVar2, vi viVar3) {
        return ((kb5) this.j).y(viVar, viVar2, viVar3);
    }

    public /* synthetic */ jy3(Object obj) {
        this.j = obj;
    }

    public jy3(float f, float f2, vi viVar) {
        wi jy3Var;
        int[] iArr = kj5.g;
        if (viVar == null && f == 1.0f && f2 == 1500.0f) {
            jy3Var = s31.j;
        } else if (viVar != null) {
            jy3Var = new et4(f, f2, viVar);
        } else {
            jy3Var = new jy3(f, f2);
        }
        this.j = new kb5(jy3Var);
    }

    public jy3(qc4 qc4Var) {
        this.j = new WeakReference(qc4Var);
    }

    public jy3(iz4 iz4Var) {
        iz4Var.getClass();
        this.j = iz4Var;
    }

    public jy3(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            bu4 bu4Var = new bu4(view, (byte) 1);
            bu4Var.a = view;
            this.j = bu4Var;
            return;
        }
        this.j = new et4(view, (byte) 1);
    }

    public /* synthetic */ jy3(y22 y22Var) {
        this.j = (a06) y22Var.t;
    }

    public jy3(float f, float f2) {
        this.j = new lq1(f, f2);
    }

    public jy3() {
        this.j = new LinkedHashMap();
    }
}
