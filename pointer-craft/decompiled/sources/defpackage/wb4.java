package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wb4 implements zb4, n05 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ long j;
    public final /* synthetic */ Object t;

    public /* synthetic */ wb4(long j, Object obj, Object obj2) {
        this.t = obj;
        this.a = obj2;
        this.j = j;
    }

    @Override // defpackage.zb4
    public Object apply(Object obj) {
        String str = (String) this.t;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((dy2) this.a).j;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.j;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(b));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.n05
    public Object y() {
        uh5 uh5Var = (uh5) this.t;
        cv cvVar = (cv) this.a;
        bc4 bc4Var = (bc4) uh5Var.r;
        long jN = ((di0) uh5Var.j).n() + this.j;
        bc4Var.getClass();
        bc4Var.t(new vb4(jN, cvVar));
        return null;
    }
}
