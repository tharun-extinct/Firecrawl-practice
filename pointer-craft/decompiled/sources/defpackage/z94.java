package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class z94 {
    public final int g;
    public final String r;
    public final String y;

    public z94(int i, String str, String str2) {
        this.g = i;
        this.y = str;
        this.r = str2;
    }

    public void g(tb4 tb4Var) {
        tb4Var.getClass();
        zq2.m(tb4Var, "CREATE TABLE IF NOT EXISTS `Layout` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `starred` INTEGER NOT NULL DEFAULT false, `shareId` TEXT, `parentId` TEXT, `shareLink` TEXT, `uploadKey` TEXT, `data` BLOB)");
        zq2.m(tb4Var, "CREATE TABLE IF NOT EXISTS `DeviceConfig` (`macAddress` TEXT NOT NULL, `mousePointerSpeed` INTEGER NOT NULL, `airMouseSpeed` INTEGER NOT NULL, `scrollSpeed` INTEGER NOT NULL, `mouseJiggleMode` TEXT NOT NULL DEFAULT 'disabled', `layoutScreen` INTEGER NOT NULL, `layoutScreenLayoutId` INTEGER NOT NULL, `keyboardLanguageLayout` TEXT NOT NULL, `lastUsedDate` INTEGER NOT NULL, `addedDate` INTEGER NOT NULL, PRIMARY KEY(`macAddress`))");
        zq2.m(tb4Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        zq2.m(tb4Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c833e640c3eef679efe782c1dae68fd3')");
    }

    public b20 l(tb4 tb4Var) {
        tb4Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uid", new c25("uid", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("name", new c25("name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("starred", new c25("starred", "INTEGER", true, 0, "false", 1));
        linkedHashMap.put("shareId", new c25("shareId", "TEXT", false, 0, null, 1));
        linkedHashMap.put("parentId", new c25("parentId", "TEXT", false, 0, null, 1));
        linkedHashMap.put("shareLink", new c25("shareLink", "TEXT", false, 0, null, 1));
        linkedHashMap.put("uploadKey", new c25("uploadKey", "TEXT", false, 0, null, 1));
        linkedHashMap.put("data", new c25("data", "BLOB", false, 0, null, 1));
        f25 f25Var = new f25("Layout", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        f25 f25VarV = dh6.v(tb4Var, "Layout");
        if (!f25Var.equals(f25VarV)) {
            return new b20("Layout(io.appground.blek.data.Layout).\n Expected:\n" + f25Var + "\n Found:\n" + f25VarV, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("macAddress", new c25("macAddress", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("mousePointerSpeed", new c25("mousePointerSpeed", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("airMouseSpeed", new c25("airMouseSpeed", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("scrollSpeed", new c25("scrollSpeed", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("mouseJiggleMode", new c25("mouseJiggleMode", "TEXT", true, 0, "'disabled'", 1));
        linkedHashMap2.put("layoutScreen", new c25("layoutScreen", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("layoutScreenLayoutId", new c25("layoutScreenLayoutId", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("keyboardLanguageLayout", new c25("keyboardLanguageLayout", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("lastUsedDate", new c25("lastUsedDate", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("addedDate", new c25("addedDate", "INTEGER", true, 0, null, 1));
        f25 f25Var2 = new f25("DeviceConfig", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        f25 f25VarV2 = dh6.v(tb4Var, "DeviceConfig");
        if (f25Var2.equals(f25VarV2)) {
            return new b20((String) null, true);
        }
        return new b20("DeviceConfig(io.appground.blek.data.DeviceConfig).\n Expected:\n" + f25Var2 + "\n Found:\n" + f25VarV2, false);
    }

    public void n(tb4 tb4Var) {
        tb4Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void r(tb4 tb4Var) {
        tb4Var.getClass();
    }

    public void v(tb4 tb4Var) {
        tb4Var.getClass();
    }

    public void x(tb4 tb4Var) {
        tb4Var.getClass();
        ee6.g(tb4Var);
    }

    public void y(tb4 tb4Var) {
        tb4Var.getClass();
        zq2.m(tb4Var, "DROP TABLE IF EXISTS `Layout`");
        zq2.m(tb4Var, "DROP TABLE IF EXISTS `DeviceConfig`");
    }
}
