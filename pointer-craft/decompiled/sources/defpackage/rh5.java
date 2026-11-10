package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rh5 implements n05 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ bc4 t;

    public /* synthetic */ rh5(bc4 bc4Var, byte b) {
        this.j = b;
        this.t = bc4Var;
    }

    @Override // defpackage.n05
    public final Object y() {
        byte b = this.j;
        bc4 bc4Var = this.t;
        switch (b) {
            case 0:
                bc4Var.getClass();
                int i = zh0.v;
                ty tyVar = new ty((byte) 2, false);
                tyVar.t = null;
                tyVar.a = new ArrayList();
                tyVar.m = null;
                tyVar.q = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseY = bc4Var.y();
                sQLiteDatabaseY.beginTransaction();
                try {
                    zh0 zh0Var = (zh0) bc4.u(sQLiteDatabaseY.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new w21((Object) bc4Var, (Object) map, (Object) tyVar, (byte) 4));
                    sQLiteDatabaseY.setTransactionSuccessful();
                    return zh0Var;
                } finally {
                    sQLiteDatabaseY.endTransaction();
                }
            default:
                Integer num = (Integer) bc4Var.t(new vb4(bc4Var, bc4Var.t.n() - bc4Var.m.n));
                num.getClass();
                return num;
        }
    }
}
