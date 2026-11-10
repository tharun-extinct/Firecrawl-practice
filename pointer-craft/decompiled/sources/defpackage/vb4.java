package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vb4 implements zb4 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ long t;

    public /* synthetic */ vb4(long j, cv cvVar) {
        this.t = j;
        this.a = cvVar;
    }

    @Override // defpackage.zb4
    public final Object apply(Object obj) {
        byte b = this.j;
        Object obj2 = this.a;
        long j = this.t;
        switch (b) {
            case 0:
                bc4 bc4Var = (bc4) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                bc4Var.getClass();
                String[] strArr = {String.valueOf(j)};
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        bc4Var.w(cursorRawQuery.getInt(0), dy2.a, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                cv cvVar = (cv) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                String str = cvVar.g;
                xx3 xx3Var = cvVar.r;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(zx3.g(xx3Var))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(zx3.g(xx3Var)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    public /* synthetic */ vb4(bc4 bc4Var, long j) {
        this.a = bc4Var;
        this.t = j;
    }
}
