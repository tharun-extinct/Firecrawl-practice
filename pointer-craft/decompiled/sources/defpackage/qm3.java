package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qm3 implements f41, lp4, zb4, n05 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ qm3(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    @Override // defpackage.zb4
    public Object apply(Object obj) {
        bc4 bc4Var = (bc4) this.t;
        cv cvVar = (cv) this.a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ku kuVar = bc4Var.m;
        ArrayList arrayListA = bc4Var.a(sQLiteDatabase, cvVar, kuVar.y);
        for (xx3 xx3Var : xx3.values()) {
            if (xx3Var != cvVar.r) {
                int size = kuVar.y - arrayListA.size();
                if (size <= 0) {
                    break;
                }
                ro roVarG = cv.g();
                roVarG.X(cvVar.g);
                if (xx3Var == null) {
                    l0.q("Null priority");
                    return null;
                }
                roVarG.m = xx3Var;
                roVarG.a = cvVar.y;
                arrayListA.addAll(bc4Var.a(sQLiteDatabase, roVarG.j(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListA.size(); i++) {
            sb.append(((uu) arrayListA.get(i)).g);
            if (i < arrayListA.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new ac4(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListA.listIterator();
        while (listIterator.hasNext()) {
            uu uuVar = (uu) listIterator.next();
            long j2 = uuVar.g;
            if (map.containsKey(Long.valueOf(j2))) {
                vl vlVarR = uuVar.r.r();
                for (ac4 ac4Var : (Set) map.get(Long.valueOf(j2))) {
                    vlVarR.t(ac4Var.g, ac4Var.y);
                }
                listIterator.set(new uu(j2, uuVar.y, vlVarR.m()));
            }
        }
        return arrayListA;
    }

    @Override // defpackage.lp4
    public boolean g() {
        dx3 dx3Var = (dx3) this.t;
        jv jvVar = (jv) this.a;
        boolean z = dx3Var.s;
        if (z) {
            return z;
        }
        dx3Var.j();
        long jG = jv.g(dx3Var.i, jvVar.g);
        jvVar.g = jG;
        boolean z2 = !dx3Var.l(dx3Var.c, jG + jvVar.y);
        dx3Var.s = z2;
        return z2;
    }

    public hs0 n(bi6 bi6Var) {
        o75 o75Var = (o75) this.t;
        bj bjVar = (bj) this.a;
        j75 j75Var = (j75) o75Var.g.getValue();
        if (j75Var == null) {
            return new hs0(0, 0, new yj2((byte) 15));
        }
        bj bjVarR = o75.r(bjVar, j75Var);
        if (bjVarR == null) {
            return new hs0(0, 0, new yj2((byte) 14));
        }
        ne2 ne2VarE = c93.E(j75Var.t(bjVarR.y, bjVarR.r).n());
        return new hs0(ne2VarE.n(), ne2VarE.y(), new m63(ne2VarE, (byte) 8));
    }

    @Override // defpackage.f41
    public void r(n14 n14Var) {
        f41 f41Var = (f41) this.t;
        gc0 gc0Var = (gc0) this.a;
        f41Var.r(n14Var);
        gc0Var.r(n14Var);
    }

    @Override // defpackage.n05
    public Object y() {
        byte b = this.j;
        Object obj = this.a;
        uh5 uh5Var = (uh5) this.t;
        switch (b) {
            case 4:
                Iterable iterable = (Iterable) obj;
                bc4 bc4Var = (bc4) uh5Var.r;
                bc4Var.getClass();
                if (iterable.iterator().hasNext()) {
                    bc4Var.y().compileStatement("DELETE FROM events WHERE _id in ".concat(bc4.b(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((bc4) uh5Var.v).w(((Integer) entry.getValue()).intValue(), dy2.c, (String) entry.getKey());
                }
                break;
        }
        return null;
    }
}
