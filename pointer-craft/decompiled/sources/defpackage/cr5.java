package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class cr5 {
    public static final String g = iy2.v("WrkDbPathHelper");
    public static final String[] y = {"-journal", "-shm", "-wal"};

    public static void g(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            String str = g;
            iy2.r().g(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap map = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath, file);
            for (String str2 : y) {
                map.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : map.keySet()) {
                File file3 = (File) map.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        iy2.r().x(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    iy2.r().g(str, file2.renameTo(file3) ? String.format("Migrated %s to %s", file2, file3) : String.format("Renaming %s to %s failed", file2, file3), new Throwable[0]);
                }
            }
        }
    }
}
