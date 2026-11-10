package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oo extends z53 {
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo(int i, int i2, byte b) {
        super(i, i2);
        this.r = b;
    }

    @Override // defpackage.z53
    public void g(zx1 zx1Var) {
        switch (this.r) {
            case 4:
                zx1Var.w("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                zx1Var.w("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
                zx1Var.w("DROP TABLE IF EXISTS alarmInfo");
                zx1Var.w("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
                break;
            case 5:
                zx1Var.w("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
                break;
            case 6:
                zx1Var.w("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                zx1Var.w("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case 7:
                zx1Var.w("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                break;
            case 8:
                zx1Var.w("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
                break;
            case 9:
                zx1Var.w("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            case 10:
                zx1Var.w("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                super.g(zx1Var);
                break;
        }
    }

    @Override // defpackage.z53
    public void y(tb4 tb4Var) {
        switch (this.r) {
            case 0:
                tb4Var.getClass();
                zq2.m(tb4Var, "ALTER TABLE `Layout` ADD COLUMN `shareId` TEXT DEFAULT NULL");
                zq2.m(tb4Var, "ALTER TABLE `Layout` ADD COLUMN `shareLink` TEXT DEFAULT NULL");
                zq2.m(tb4Var, "ALTER TABLE `Layout` ADD COLUMN `uploadKey` TEXT DEFAULT NULL");
                break;
            case 1:
                tb4Var.getClass();
                zq2.m(tb4Var, "ALTER TABLE `Layout` ADD COLUMN `parentId` TEXT DEFAULT NULL");
                break;
            case 2:
                tb4Var.getClass();
                zq2.m(tb4Var, "CREATE TABLE IF NOT EXISTS `DeviceConfig` (`macAddress` TEXT NOT NULL, `mousePointerSpeed` INTEGER NOT NULL, `airMouseSpeed` INTEGER NOT NULL, `scrollSpeed` INTEGER NOT NULL, `layoutScreen` INTEGER NOT NULL, `layoutScreenLayoutId` INTEGER NOT NULL, `keyboardLanguageLayout` TEXT NOT NULL, `lastUsedDate` INTEGER NOT NULL, `addedDate` INTEGER NOT NULL, PRIMARY KEY(`macAddress`))");
                break;
            case 3:
                tb4Var.getClass();
                zq2.m(tb4Var, "ALTER TABLE `DeviceConfig` ADD COLUMN `mouseJiggleMode` TEXT NOT NULL DEFAULT 'disabled'");
                break;
            default:
                super.y(tb4Var);
                break;
        }
    }
}
