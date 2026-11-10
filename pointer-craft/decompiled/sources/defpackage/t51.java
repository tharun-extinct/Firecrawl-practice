package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class t51 {
    public boolean g;
    public Object j;
    public Object l;
    public Object n;
    public Object r;
    public Object v;
    public Object x;
    public boolean y;

    public static boolean b(um2 um2Var) {
        if (!um2Var.p()) {
            return false;
        }
        do {
            if (um2Var.u() == sm2.a && !um2Var.N.b.F.x()) {
                um2 um2VarO = um2Var.o();
                if ((um2VarO != null ? um2VarO.N.n : null) != qm2.j) {
                    return false;
                }
            }
            um2Var = um2Var.o();
            if (um2Var == null) {
                return false;
            }
        } while (!um2Var.K());
        return true;
    }

    public static boolean i(um2 um2Var) {
        fz2 fz2Var;
        a7 a7VarR;
        if (um2Var.N.v) {
            return (um2Var.z() == sm2.a && ((fz2Var = um2Var.N.s) == null || (a7VarR = fz2Var.r()) == null || !a7VarR.x())) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean j(um2 um2Var, ws0 ws0Var) {
        boolean zQ0;
        um2 um2Var2 = um2Var.i;
        ym2 ym2Var = um2Var.N;
        if (um2Var2 == null) {
            return false;
        }
        if (ws0Var == null) {
            fz2 fz2Var = ym2Var.s;
            ws0 ws0VarU0 = fz2Var != null ? fz2Var.u0() : null;
            if (ws0VarU0 == null || um2Var.i == null) {
                zQ0 = false;
            } else {
                fz2 fz2Var2 = ym2Var.s;
                fz2Var2.getClass();
                zQ0 = fz2Var2.Q0(ws0VarU0.g);
            }
        } else if (um2Var2 != null) {
            fz2 fz2Var3 = ym2Var.s;
            fz2Var3.getClass();
            zQ0 = fz2Var3.Q0(ws0Var.g);
        } else {
            zQ0 = false;
        }
        um2 um2VarO = um2Var.o();
        if (zQ0 && um2VarO != null) {
            if (um2VarO.i == null) {
                um2.X(um2VarO, false, 3);
                return zQ0;
            }
            if (um2Var.z() == sm2.j) {
                um2.V(um2VarO, false, 3);
                return zQ0;
            }
            if (um2Var.z() == sm2.t) {
                um2VarO.U(false);
            }
        }
        return zQ0;
    }

    public static boolean s(um2 um2Var) {
        fz2 fz2Var;
        a7 a7VarR;
        ym2 ym2Var = um2Var.N;
        return um2Var.K() || ym2Var.b.B || b(um2Var) || yf2.p(um2Var.L(), Boolean.TRUE) || i(um2Var) || ym2Var.b.F.x() || !((fz2Var = ym2Var.s) == null || (a7VarR = fz2Var.r()) == null || !a7VarR.x());
    }

    public static boolean t(um2 um2Var, ws0 ws0Var) {
        boolean zE0;
        sm2 sm2Var = sm2.a;
        if (ws0Var != null) {
            if (um2Var.J == sm2Var) {
                um2Var.r();
            }
            zE0 = um2Var.N.b.E0(ws0Var.g);
        } else {
            s33 s33Var = um2Var.N.b;
            ws0 ws0Var2 = s33Var.s ? new ws0(s33Var.m) : null;
            if (ws0Var2 != null) {
                if (um2Var.J == sm2Var) {
                    um2Var.r();
                }
                zE0 = um2Var.N.b.E0(ws0Var2.g);
            } else {
                um2Var.getClass();
                zE0 = false;
            }
        }
        um2 um2VarO = um2Var.o();
        if (zE0 && um2VarO != null) {
            if (um2Var.u() == sm2.j) {
                um2.X(um2VarO, false, 3);
                return zE0;
            }
            if (um2Var.u() == sm2.t) {
                um2VarO.W(false);
            }
        }
        return zE0;
    }

    public static void v(tb4 tb4Var) {
        cc4 cc4VarO = tb4Var.O("PRAGMA busy_timeout");
        try {
            cc4VarO.H();
            long j = cc4VarO.getLong(0);
            c93.h(cc4VarO, null);
            if (j < 3000) {
                zq2.m(tb4Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c93.h(cc4VarO, th);
                throw th2;
            }
        }
    }

    public boolean A(um2 um2Var, boolean z) {
        ws0 ws0Var;
        boolean zT = false;
        if (!um2Var.X && s(um2Var)) {
            if (um2Var == ((um2) this.r)) {
                ws0Var = (ws0) this.j;
                ws0Var.getClass();
            } else {
                ws0Var = null;
            }
            if (z) {
                if (um2Var.N.v) {
                    zT = j(um2Var, ws0Var);
                }
            } else if (um2Var.p()) {
                zT = t(um2Var, ws0Var);
            }
            a();
        }
        return zT;
    }

    public void B(um2 um2Var) {
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            um2 um2Var2 = (um2) objArr[i2];
            if (um2Var2.u() == sm2.j || um2Var2.N.b.F.x()) {
                if (y94.H(um2Var2)) {
                    C(um2Var2, true);
                } else {
                    B(um2Var2);
                }
            }
        }
    }

    public void C(um2 um2Var, boolean z) {
        ws0 ws0Var;
        if (um2Var.X) {
            return;
        }
        if (um2Var == ((um2) this.r)) {
            ws0Var = (ws0) this.j;
            ws0Var.getClass();
        } else {
            ws0Var = null;
        }
        if (z) {
            j(um2Var, ws0Var);
        } else {
            t(um2Var, ws0Var);
        }
    }

    public boolean D(um2 um2Var, boolean z) {
        int iOrdinal = um2Var.N.n.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                ((rb3) this.l).y(new q33(um2Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    uo1.g();
                    return false;
                }
                if (!um2Var.p() || z) {
                    um2Var.N.b.C = true;
                    if (!um2Var.X && (um2Var.K() || b(um2Var))) {
                        um2 um2VarO = um2Var.o();
                        if (um2VarO == null || !um2VarO.p()) {
                            ((ro) this.n).g(um2Var, lg2.a);
                        }
                        if (!this.y) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void E(long j) {
        um2 um2Var = (um2) this.r;
        ws0 ws0Var = (ws0) this.j;
        if (ws0Var == null ? false : ws0.r(ws0Var.g, j)) {
            return;
        }
        if (this.g) {
            mc2.g("updateRootConstraints called while measuring");
        }
        this.j = new ws0(j);
        boolean zJ = um2Var.J();
        ym2 ym2Var = um2Var.N;
        if (zJ) {
            um2 um2Var2 = um2Var.i;
            if (um2Var2 != null) {
                ym2Var.v = true;
            }
            ym2Var.b.C = true;
            ((ro) this.n).g(um2Var, um2Var2 != null ? lg2.j : lg2.a);
        }
    }

    public void a() {
        rb3 rb3Var = (rb3) this.l;
        int i = rb3Var.a;
        if (i != 0) {
            Object[] objArr = rb3Var.j;
            for (int i2 = 0; i2 < i; i2++) {
                q33 q33Var = (q33) objArr[i2];
                if (q33Var.g.J()) {
                    boolean z = q33Var.y;
                    um2 um2Var = q33Var.g;
                    boolean z2 = q33Var.r;
                    if (z) {
                        um2.V(um2Var, z2, 2);
                    } else {
                        um2.X(um2Var, z2, 2);
                    }
                }
            }
            rb3Var.j();
        }
    }

    public void c(um2 um2Var, boolean z) {
        fz2 fz2Var;
        a7 a7VarR;
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            um2 um2Var2 = (um2) objArr[i2];
            sm2 sm2Var = sm2.j;
            if ((!z && (um2Var2.u() == sm2Var || um2Var2.N.b.F.x())) || (z && (um2Var2.z() == sm2Var || ((fz2Var = um2Var2.N.s) != null && (a7VarR = fz2Var.r()) != null && a7VarR.x())))) {
                boolean zH = y94.H(um2Var2);
                ym2 ym2Var = um2Var2.N;
                if (zH && !z) {
                    if (ym2Var.v && ((ro) this.n).t(um2Var2)) {
                        A(um2Var2, true);
                    } else {
                        w(um2Var2, true);
                    }
                }
                if (z ? ym2Var.v : um2Var2.p()) {
                    A(um2Var2, z);
                }
                if (!(z ? ym2Var.v : um2Var2.p())) {
                    c(um2Var2, z);
                }
            }
        }
        if (z ? um2Var.N.v : um2Var.p()) {
            A(um2Var, z);
        }
    }

    public void d(tb4 tb4Var) throws Throwable {
        Object g84Var;
        tb4Var.getClass();
        z94 z94Var = (z94) this.n;
        cc4 cc4VarO = tb4Var.O("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = cc4VarO.H() && cc4VarO.getLong(0) != 0;
            c93.h(cc4VarO, null);
            if (z) {
                cc4 cc4VarO2 = tb4Var.O("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strQ = cc4VarO2.H() ? cc4VarO2.q(0) : null;
                    c93.h(cc4VarO2, null);
                    if (!z94Var.y.equals(strQ) && !z94Var.r.equals(strQ)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + z94Var.y + ", found: " + strQ).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c93.h(cc4VarO2, th);
                        throw th2;
                    }
                }
            } else {
                zq2.m(tb4Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    b20 b20VarL = z94Var.l(tb4Var);
                    if (!b20VarL.y) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) b20VarL.g)).toString());
                    }
                    z94Var.v(tb4Var);
                    zq2.m(tb4Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    zq2.m(tb4Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + z94Var.y + "')");
                    g84Var = og5.g;
                    if (!(g84Var instanceof g84)) {
                        zq2.m(tb4Var, "END TRANSACTION");
                    }
                    Throwable thG = h84.g(g84Var);
                    if (thG != null) {
                        zq2.m(tb4Var, "ROLLBACK TRANSACTION");
                        throw thG;
                    }
                } catch (Throwable th3) {
                    g84Var = new g84(th3);
                }
            }
            z94Var.n(tb4Var);
            for (v94 v94Var : (List) this.v) {
                v94Var.getClass();
                if (tb4Var instanceof fz4) {
                    v94Var.y(((fz4) tb4Var).j);
                }
            }
            this.g = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                c93.h(cc4VarO, th4);
                throw th5;
            }
        }
    }

    public boolean e(um2 um2Var, boolean z) {
        ws0 ws0Var;
        um2 um2VarO;
        um2 um2Var2 = (um2) this.r;
        boolean z2 = um2Var.X;
        ym2 ym2Var = um2Var.N;
        boolean zJ = false;
        if (!z2 && s(um2Var)) {
            if (um2Var == um2Var2) {
                ws0Var = (ws0) this.j;
                ws0Var.getClass();
            } else {
                ws0Var = null;
            }
            if (z) {
                zJ = ym2Var.v ? j(um2Var, ws0Var) : false;
                if ((zJ || ym2Var.x) && yf2.p(um2Var.L(), Boolean.TRUE)) {
                    um2Var.M();
                }
            } else {
                boolean zT = um2Var.p() ? t(um2Var, ws0Var) : false;
                if (um2Var.s() && (um2Var == um2Var2 || ((um2VarO = um2Var.o()) != null && um2VarO.K() && ym2Var.b.B))) {
                    if (um2Var == um2Var2) {
                        if (um2Var.J == sm2.a) {
                            um2Var.l();
                        }
                        um2 um2VarO2 = um2Var.o();
                        ts3.m(um2VarO2 != null ? um2VarO2.M.r.f : ((ba) xm2.g(um2Var)).getPlacementScope(), ym2Var.b, 0, 0);
                    } else {
                        um2Var.T();
                    }
                    ji jiVar = (ji) this.v;
                    if (um2Var.W > 0) {
                        ((rb3) jiVar.t).y(um2Var);
                        um2Var.V = true;
                    }
                }
                zJ = zT;
            }
            a();
        }
        return zJ;
    }

    public void f(tb4 tb4Var) {
        z94 z94Var = (z94) this.n;
        tb4Var.getClass();
        cc4 cc4VarO = tb4Var.O("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cc4VarO.H() && cc4VarO.getLong(0) == 0) {
                z = true;
            }
            c93.h(cc4VarO, null);
            z94Var.g(tb4Var);
            if (!z) {
                b20 b20VarL = z94Var.l(tb4Var);
                if (!b20VarL.y) {
                    uo1.d((String) b20VarL.g, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            zq2.m(tb4Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            zq2.m(tb4Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + z94Var.y + "')");
            z94Var.r(tb4Var);
            for (v94 v94Var : (List) this.v) {
                v94Var.getClass();
                if (tb4Var instanceof fz4) {
                    v94Var.g(((fz4) tb4Var).j);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c93.h(cc4VarO, th);
                throw th2;
            }
        }
    }

    public void g(u51 u51Var, int i, ArrayList arrayList, qb4 qb4Var) {
        eo5 eo5Var = u51Var.n;
        qb4 qb4Var2 = eo5Var.r;
        u51 u51Var2 = eo5Var.t;
        u51 u51Var3 = eo5Var.j;
        if (qb4Var2 == null) {
            us0 us0Var = (us0) this.r;
            if (eo5Var == us0Var.n || eo5Var == us0Var.v) {
                return;
            }
            if (qb4Var == null) {
                qb4Var = new qb4(eo5Var);
                arrayList.add(qb4Var);
            }
            eo5Var.r = qb4Var;
            qb4Var.g(eo5Var);
            ArrayList arrayList2 = u51Var3.m;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                q51 q51Var = (q51) obj;
                if (q51Var instanceof u51) {
                    g((u51) q51Var, i, arrayList, qb4Var);
                }
            }
            ArrayList arrayList3 = u51Var2.m;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                q51 q51Var2 = (q51) obj2;
                if (q51Var2 instanceof u51) {
                    g((u51) q51Var2, i, arrayList, qb4Var);
                }
            }
            if (i == 1 && (eo5Var instanceof hk5)) {
                ArrayList arrayList4 = ((hk5) eo5Var).m.m;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    q51 q51Var3 = (q51) obj3;
                    if (q51Var3 instanceof u51) {
                        g((u51) q51Var3, i, arrayList, qb4Var);
                    }
                }
            }
            ArrayList arrayList5 = u51Var3.q;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                g((u51) obj4, i, arrayList, qb4Var);
            }
            ArrayList arrayList6 = u51Var2.q;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                g((u51) obj5, i, arrayList, qb4Var);
            }
            if (i == 1 && (eo5Var instanceof hk5)) {
                ArrayList arrayList7 = ((hk5) eo5Var).m.q;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    g((u51) obj6, i, arrayList, qb4Var);
                }
            }
        }
    }

    public void h() {
        um2 um2Var = (um2) this.r;
        ro roVar = (ro) this.n;
        if (roVar.N()) {
            if (!um2Var.J()) {
                mc2.g("performMeasureAndLayout called with unattached root");
            }
            if (!um2Var.K()) {
                mc2.g("performMeasureAndLayout called with unplaced root");
            }
            if (this.g) {
                mc2.g("performMeasureAndLayout called during measure layout");
            }
            if (((ws0) this.j) != null) {
                this.g = true;
                this.y = false;
                try {
                    if ((((fu4) ((y22) roVar.m).t).isEmpty() || ((fu4) ((y22) roVar.t).t).isEmpty()) ? false : true) {
                        if (um2Var.i != null) {
                            C(um2Var, true);
                        } else {
                            B(um2Var);
                        }
                    }
                    C(um2Var, false);
                    this.g = false;
                    this.y = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.g = false;
                        this.y = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public void k(tb4 tb4Var, int i, int i2) {
        z94 z94Var = (z94) this.n;
        tb4Var.getClass();
        q01 q01Var = (q01) this.r;
        List listW = xq2.w(q01Var.n, i, i2);
        if (listW != null) {
            z94Var.x(tb4Var);
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                ((z53) it.next()).y(tb4Var);
            }
            b20 b20VarL = z94Var.l(tb4Var);
            if (!b20VarL.y) {
                uo1.d((String) b20VarL.g, "Migration didn't properly handle: ");
                return;
            }
            z94Var.v(tb4Var);
            zq2.m(tb4Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            zq2.m(tb4Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + z94Var.y + "')");
            return;
        }
        if (xq2.z(q01Var, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (q01Var.u) {
            cc4 cc4VarO = tb4Var.O("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                uv2 uv2VarC = pw5.c();
                while (cc4VarO.H()) {
                    String strQ = cc4VarO.q(0);
                    if (!ay4.P(strQ, "sqlite_", false) && !strQ.equals("android_metadata")) {
                        uv2VarC.add(new fp3(strQ, Boolean.valueOf(yf2.p(cc4VarO.q(1), "view"))));
                    }
                }
                uv2 uv2VarA = pw5.a(uv2VarC);
                c93.h(cc4VarO, null);
                ListIterator listIterator = uv2VarA.listIterator(0);
                while (true) {
                    tv2 tv2Var = (tv2) listIterator;
                    if (!tv2Var.hasNext()) {
                        break;
                    }
                    fp3 fp3Var = (fp3) tv2Var.next();
                    String str = (String) fp3Var.j;
                    if (((Boolean) fp3Var.t).booleanValue()) {
                        zq2.m(tb4Var, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        zq2.m(tb4Var, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c93.h(cc4VarO, th);
                    throw th2;
                }
            }
        } else {
            z94Var.y(tb4Var);
        }
        Iterator it2 = ((List) this.v).iterator();
        while (it2.hasNext()) {
            ((v94) it2.next()).getClass();
            if (tb4Var instanceof fz4) {
                ((fz4) tb4Var).j.getClass();
            }
        }
        z94Var.g(tb4Var);
    }

    public void l(boolean z) {
        ji jiVar = (ji) this.v;
        rb3 rb3Var = (rb3) jiVar.t;
        if (z) {
            um2 um2Var = (um2) this.r;
            if (um2Var.W > 0) {
                rb3Var.j();
                rb3Var.y(um2Var);
                um2Var.V = true;
            }
        }
        if (rb3Var.a != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                jiVar.q();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void m(um2 um2Var) {
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            um2 um2Var2 = (um2) objArr[i2];
            if (yf2.p(um2Var2.L(), Boolean.TRUE) && !um2Var2.X) {
                if (((ro) this.n).t(um2Var2)) {
                    um2Var2.M();
                }
                m(um2Var2);
            }
        }
    }

    public int n(us0 us0Var, int i) {
        ArrayList arrayList = (ArrayList) this.x;
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((qb4) arrayList.get(i2)).y(us0Var, i));
        }
        return (int) jMax;
    }

    public void o() {
        qy qyVar;
        t51 t51Var = this;
        ArrayList arrayList = ((us0) t51Var.r).q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ts0 ts0Var = (ts0) arrayList.get(i);
            if (!ts0Var.g) {
                int[] iArr = ts0Var.p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = ts0Var.p;
                int i6 = ts0Var.u;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                y91 y91Var = ts0Var.n.v;
                boolean z3 = y91Var.a;
                y91 y91Var2 = ts0Var.v.v;
                boolean z4 = y91Var2.a;
                boolean z5 = z;
                if (z3 && z4) {
                    t51Var.p(1, y91Var.l, 1, y91Var2.l, ts0Var);
                    ts0Var.g = true;
                } else if (z3 && z2) {
                    p(1, y91Var.l, 2, y91Var2.l, ts0Var);
                    hk5 hk5Var = ts0Var.v;
                    if (i4 == 3) {
                        hk5Var.v.w = ts0Var.m();
                    } else {
                        hk5Var.v.n(ts0Var.m());
                        ts0Var.g = true;
                    }
                } else if (z4 && z5) {
                    p(2, y91Var.l, 1, y91Var2.l, ts0Var);
                    l72 l72Var = ts0Var.n;
                    if (i3 == 3) {
                        l72Var.v.w = ts0Var.s();
                    } else {
                        l72Var.v.n(ts0Var.s());
                        ts0Var.g = true;
                    }
                }
                if (ts0Var.g && (qyVar = ts0Var.v.q) != null) {
                    qyVar.n(ts0Var.a0);
                }
                t51Var = this;
            }
            i = i2;
        }
    }

    public void p(int i, int i2, int i3, int i4, ts0 ts0Var) {
        vy vyVar = (vy) this.j;
        vyVar.g = i;
        vyVar.y = i3;
        vyVar.r = i2;
        vyVar.n = i4;
        ((gs0) this.l).y(ts0Var, vyVar);
        ts0Var.O(vyVar.v);
        ts0Var.L(vyVar.x);
        ts0Var.E = vyVar.j;
        ts0Var.I(vyVar.l);
    }

    public void q(eo5 eo5Var, int i, ArrayList arrayList) {
        u51 u51Var = eo5Var.j;
        u51 u51Var2 = eo5Var.t;
        ArrayList arrayList2 = u51Var.m;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            q51 q51Var = (q51) obj;
            if (q51Var instanceof u51) {
                g((u51) q51Var, i, arrayList, null);
            } else if (q51Var instanceof eo5) {
                g(((eo5) q51Var).j, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = u51Var2.m;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            q51 q51Var2 = (q51) obj2;
            if (q51Var2 instanceof u51) {
                g((u51) q51Var2, i, arrayList, null);
            } else if (q51Var2 instanceof eo5) {
                g(((eo5) q51Var2).t, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((hk5) eo5Var).m.m;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                q51 q51Var3 = (q51) obj3;
                if (q51Var3 instanceof u51) {
                    g((u51) q51Var3, i, arrayList, null);
                }
            }
        }
    }

    public void r() {
        us0 us0Var = (us0) this.r;
        ArrayList arrayList = (ArrayList) this.x;
        ArrayList arrayList2 = (ArrayList) this.v;
        arrayList2.clear();
        us0 us0Var2 = (us0) this.n;
        us0Var2.n.x();
        us0Var2.v.x();
        arrayList2.add(us0Var2.n);
        arrayList2.add(us0Var2.v);
        ArrayList arrayList3 = us0Var2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            ts0 ts0Var = (ts0) obj;
            if (ts0Var instanceof m42) {
                arrayList2.add(new n42((m42) ts0Var));
            } else {
                if (ts0Var.k()) {
                    if (ts0Var.y == null) {
                        ts0Var.y = new lc0(ts0Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ts0Var.y);
                } else {
                    arrayList2.add(ts0Var.n);
                }
                if (ts0Var.d()) {
                    if (ts0Var.r == null) {
                        ts0Var.r = new lc0(ts0Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ts0Var.r);
                } else {
                    arrayList2.add(ts0Var.v);
                }
                if (ts0Var instanceof n52) {
                    arrayList2.add(new m52(ts0Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((eo5) obj2).x();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            eo5 eo5Var = (eo5) obj3;
            if (eo5Var.y != us0Var2) {
                eo5Var.n();
            }
        }
        arrayList.clear();
        q(us0Var.n, 0, arrayList);
        q(us0Var.v, 1, arrayList);
        this.g = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [i73] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [i73] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [rb3] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [rb3] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public boolean u(my1 my1Var) {
        boolean z;
        ?? Q;
        boolean z2;
        um2 um2Var;
        boolean z3;
        boolean zA;
        ro roVar = (ro) this.n;
        y22 y22Var = (y22) roVar.t;
        um2 um2Var2 = (um2) this.r;
        if (!um2Var2.J()) {
            mc2.g("performMeasureAndLayout called with unattached root");
        }
        if (!um2Var2.K()) {
            mc2.g("performMeasureAndLayout called with unplaced root");
        }
        if (this.g) {
            mc2.g("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (((ws0) this.j) != null) {
            this.g = true;
            this.y = true;
            try {
                if (roVar.N()) {
                    z = false;
                    while (true) {
                        y22 y22Var2 = (y22) roVar.m;
                        fu4 fu4Var = (fu4) y22Var2.t;
                        y22 y22Var3 = (y22) roVar.a;
                        fu4 fu4Var2 = (fu4) y22Var3.t;
                        if (!((fu4) y22Var.t).isEmpty()) {
                            um2Var = (um2) ((fu4) y22Var.t).first();
                            y22Var.d(um2Var);
                            z3 = um2Var.i != null;
                            z2 = false;
                        } else if (!fu4Var2.isEmpty()) {
                            um2Var = (um2) fu4Var2.first();
                            y22Var3.d(um2Var);
                            z3 = um2Var.i != null;
                            z2 = true;
                        } else {
                            if (fu4Var.isEmpty()) {
                                break;
                            }
                            um2 um2Var3 = (um2) fu4Var.first();
                            y22Var2.d(um2Var3);
                            z2 = true;
                            um2Var = um2Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zA = e(um2Var, z3);
                        } else {
                            zA = A(um2Var, z3);
                            if (um2Var.N.x) {
                                roVar.g(um2Var, lg2.t);
                            }
                            if (um2Var.s()) {
                                roVar.g(um2Var, lg2.m);
                            }
                        }
                        if (um2Var == um2Var2 && zA) {
                            z = true;
                        }
                    }
                    if (my1Var != null) {
                        my1Var.g();
                    }
                } else {
                    z = false;
                }
                this.g = false;
                this.y = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.g = false;
                    this.y = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        rb3 rb3Var = (rb3) this.x;
        Object[] objArr = rb3Var.j;
        int i2 = rb3Var.a;
        int i3 = 0;
        while (i3 < i2) {
            ah3 ah3Var = ((um2) objArr[i3]).M;
            sc2 sc2Var = ah3Var.r;
            boolean zL = hh3.l(4194304);
            i73 i73Var = sc2Var.j0;
            if (zL || (i73Var = i73Var.q) != null) {
                pc3 pc3Var = gh3.c0;
                i73 i73VarB1 = sc2Var.b1(zL);
                while (i73VarB1 != null && (i73VarB1.m & 4194304) != 0) {
                    if ((i73VarB1.a & 4194304) != 0) {
                        ?? r12 = i73VarB1;
                        ?? rb3Var2 = 0;
                        while (r12 != 0) {
                            if (r12 instanceof xk2) {
                                ((xk2) r12).b(ah3Var.r);
                            } else {
                                if ((r12.a & 4194304) != 0 && (r12 instanceof p41)) {
                                    i73 i73Var2 = ((p41) r12).f;
                                    int i4 = i;
                                    while (i73Var2 != null) {
                                        if ((i73Var2.a & 4194304) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                Q = r12;
                                                rb3Var2 = rb3Var2;
                                                rb3Var2 = rb3Var2;
                                                Q = i73Var2;
                                            } else {
                                                if (rb3Var2 == 0) {
                                                    rb3Var2 = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var2.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var2.y(i73Var2);
                                            }
                                        } else {
                                            Q = r12;
                                            rb3Var2 = rb3Var2;
                                        }
                                        i73Var2 = i73Var2.w;
                                        Q = Q;
                                        rb3Var2 = rb3Var2;
                                    }
                                    if (i4 == 1) {
                                        Q = r12;
                                        rb3Var2 = rb3Var2;
                                    }
                                }
                                i = 0;
                                r12 = Q;
                                rb3Var2 = rb3Var2;
                            }
                            Q = r12;
                            rb3Var2 = rb3Var2;
                            Q = k33.Q(rb3Var2);
                            i = 0;
                            r12 = Q;
                            rb3Var2 = rb3Var2;
                        }
                    }
                    if (i73VarB1 == i73Var) {
                        break;
                    }
                    i73VarB1 = i73VarB1.w;
                    i = 0;
                }
            }
            i3++;
            i = 0;
        }
        rb3Var.j();
        return z;
    }

    public void w(um2 um2Var, boolean z) {
        if (!this.g) {
            mc2.y("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? um2Var.N.v : um2Var.p()) {
            mc2.g("node not yet measured");
        }
        c(um2Var, z);
    }

    public void x(tb4 tb4Var) throws Throwable {
        Object g84Var;
        z94 z94Var = (z94) this.n;
        v(tb4Var);
        q01 q01Var = (q01) this.r;
        w94 w94Var = q01Var.l;
        w94 w94Var2 = w94.t;
        if (w94Var == w94Var2) {
            zq2.m(tb4Var, "PRAGMA journal_mode = WAL");
        } else {
            zq2.m(tb4Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (q01Var.l == w94Var2) {
            zq2.m(tb4Var, "PRAGMA synchronous = NORMAL");
        } else {
            zq2.m(tb4Var, "PRAGMA synchronous = FULL");
        }
        cc4 cc4VarO = tb4Var.O("PRAGMA user_version");
        try {
            cc4VarO.H();
            int i = (int) cc4VarO.getLong(0);
            c93.h(cc4VarO, null);
            int i2 = z94Var.g;
            int i3 = z94Var.g;
            if (i != i2) {
                zq2.m(tb4Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        f(tb4Var);
                    } else {
                        k(tb4Var, i, i3);
                    }
                    zq2.m(tb4Var, "PRAGMA user_version = " + i3);
                    g84Var = og5.g;
                } catch (Throwable th) {
                    g84Var = new g84(th);
                }
                if (!(g84Var instanceof g84)) {
                    zq2.m(tb4Var, "END TRANSACTION");
                }
                Throwable thG = h84.g(g84Var);
                if (thG != null) {
                    zq2.m(tb4Var, "ROLLBACK TRANSACTION");
                    throw thG;
                }
            }
            d(tb4Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c93.h(cc4VarO, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:115:0x0203  */
    /* JADX WARN: Code duplicated, block: B:117:0x0208  */
    /* JADX WARN: Code duplicated, block: B:118:0x021c  */
    /* JADX WARN: Code duplicated, block: B:120:0x021f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0223  */
    /* JADX WARN: Code duplicated, block: B:127:0x0259  */
    /* JADX WARN: Code duplicated, block: B:129:0x0261  */
    /* JADX WARN: Code duplicated, block: B:132:0x028d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:150:0x0300  */
    /* JADX WARN: Code duplicated, block: B:151:0x030e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0316  */
    /* JADX WARN: Code duplicated, block: B:156:0x0329  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0 A[PHI: r0
  0x00d0: PHI (r0v20 int) = (r0v18 int), (r0v88 int) binds: [B:70:0x00ca, B:64:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0127  */
    /* JADX WARN: Code duplicated, block: B:86:0x012c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0140  */
    /* JADX WARN: Code duplicated, block: B:89:0x0145  */
    /* JADX WARN: Code duplicated, block: B:91:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182  */
    public void y(us0 us0Var) {
        int i;
        int i2;
        int iS;
        int iS2;
        int i3;
        int iM;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList = us0Var.q0;
        int[] iArr = us0Var.p0;
        int size = arrayList.size();
        char c = 0;
        int i17 = 0;
        while (i17 < size) {
            Object obj = arrayList.get(i17);
            i17++;
            ts0 ts0Var = (ts0) obj;
            int[] iArr2 = ts0Var.p0;
            as0[] as0VarArr = ts0Var.Q;
            as0 as0Var = ts0Var.L;
            as0 as0Var2 = ts0Var.J;
            as0 as0Var3 = ts0Var.K;
            as0 as0Var4 = ts0Var.I;
            int i18 = iArr2[c];
            int i19 = iArr2[1];
            c = c;
            if (ts0Var.g0 == 8) {
                ts0Var.g = true;
            } else {
                float f2 = ts0Var.f;
                if (f2 < 1.0f && i18 == 3) {
                    ts0Var.p = 2;
                }
                float f3 = ts0Var.e;
                if (f3 < 1.0f && i19 == 3) {
                    ts0Var.u = 2;
                }
                if (ts0Var.W > 0.0f) {
                    i = 3;
                    if (i18 == 3) {
                        if (i19 != 2) {
                            i16 = 1;
                            if (i19 == 1) {
                            }
                        }
                        ts0Var.p = 3;
                    } else {
                        i16 = 1;
                    }
                    if (i19 != 3) {
                        if (i18 == i && i19 == i) {
                            if (ts0Var.p == 0) {
                                ts0Var.p = i;
                            }
                            if (ts0Var.u == 0) {
                                ts0Var.u = i;
                            }
                        }
                    } else if (i18 == 2 || i18 == i16) {
                        i = 3;
                        ts0Var.u = 3;
                    } else {
                        i = 3;
                        if (i18 == i) {
                            if (ts0Var.p == 0) {
                                ts0Var.p = i;
                            }
                            if (ts0Var.u == 0) {
                                ts0Var.u = i;
                            }
                        }
                    }
                } else {
                    i = 3;
                }
                if (i18 == i && ts0Var.p == 1 && (as0Var4.x == null || as0Var3.x == null)) {
                    i18 = 2;
                }
                if (i19 == 3 && ts0Var.u == 1 && (as0Var2.x == null || as0Var.x == null)) {
                    i19 = 2;
                }
                l72 l72Var = ts0Var.n;
                l72Var.n = i18;
                int i20 = ts0Var.p;
                l72Var.g = i20;
                hk5 hk5Var = ts0Var.v;
                hk5Var.n = i19;
                ArrayList arrayList2 = arrayList;
                int i21 = ts0Var.u;
                hk5Var.g = i21;
                if (i18 == 4 || i18 == 1) {
                    if (i19 == 4) {
                        i2 = 1;
                    } else if (i19 != 1) {
                        i5 = 2;
                        if (i19 == 2) {
                            i2 = 1;
                        } else {
                            if (i18 != 3) {
                                i6 = i19;
                                i7 = 1;
                            } else if (i19 == i5 && i19 != 1) {
                                i6 = i19;
                                i8 = 3;
                                i7 = 1;
                                if (i6 != i8) {
                                    i9 = i6;
                                    i10 = i5;
                                } else if (i18 == i5 && i18 != i7) {
                                    i12 = i8;
                                    i9 = i6;
                                    i10 = i5;
                                    i11 = 1;
                                    if (i18 == i12 && i9 == i12) {
                                        if (i20 != i11 || i21 == i11) {
                                            p(i10, 0, i10, 0, ts0Var);
                                            ts0Var.n.v.w = ts0Var.s();
                                            ts0Var.v.v.w = ts0Var.m();
                                        } else if (i21 == 2 && i20 == 2 && iArr[c] == i7 && iArr[i11] == i7) {
                                            p(i7, (int) ((f2 * us0Var.s()) + 0.5f), i7, (int) ((f3 * us0Var.m()) + 0.5f), ts0Var);
                                            ts0Var.n.v.n(ts0Var.s());
                                            ts0Var.v.v.n(ts0Var.m());
                                            ts0Var.g = true;
                                        }
                                    }
                                } else if (i21 == i8) {
                                    if (i18 == i5) {
                                        p(i5, 0, i5, 0, ts0Var);
                                    }
                                    int iS3 = ts0Var.s();
                                    f = ts0Var.W;
                                    if (ts0Var.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    p(i7, iS3, i7, (int) ((iS3 * f) + 0.5f), ts0Var);
                                    ts0Var.n.v.n(ts0Var.s());
                                    ts0Var.v.v.n(ts0Var.m());
                                    ts0Var.g = true;
                                } else {
                                    i9 = i6;
                                    i10 = i5;
                                    if (i21 == 1) {
                                        p(i18, 0, i10, 0, ts0Var);
                                        ts0Var.v.v.w = ts0Var.m();
                                    } else if (i21 == 2) {
                                        i13 = iArr[1];
                                        if (i13 != i7 || i13 == 4) {
                                            p(i18, ts0Var.s(), i7, (int) ((f3 * us0Var.m()) + 0.5f), ts0Var);
                                            ts0Var.n.v.n(ts0Var.s());
                                            ts0Var.v.v.n(ts0Var.m());
                                            ts0Var.g = true;
                                        }
                                    } else if (as0VarArr[2].x != null || as0VarArr[3].x == null) {
                                        p(i10, 0, i9, 0, ts0Var);
                                        ts0Var.n.v.n(ts0Var.s());
                                        ts0Var.v.v.n(ts0Var.m());
                                        ts0Var.g = true;
                                    }
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i18 == i12) {
                                    if (i20 != i11) {
                                        p(i10, 0, i10, 0, ts0Var);
                                        ts0Var.n.v.w = ts0Var.s();
                                        ts0Var.v.v.w = ts0Var.m();
                                    } else {
                                        p(i10, 0, i10, 0, ts0Var);
                                        ts0Var.n.v.w = ts0Var.s();
                                        ts0Var.v.v.w = ts0Var.m();
                                    }
                                }
                            } else if (i20 == 3) {
                                if (i19 == i5) {
                                    p(i5, 0, i5, 0, ts0Var);
                                }
                                int iM2 = ts0Var.m();
                                p(1, (int) ((iM2 * ts0Var.W) + 0.5f), 1, iM2, ts0Var);
                                ts0Var.n.v.n(ts0Var.s());
                                ts0Var.v.v.n(ts0Var.m());
                                ts0Var.g = true;
                            } else {
                                i14 = i5;
                                i7 = 1;
                                if (i20 == 1) {
                                    p(i14, 0, i19, 0, ts0Var);
                                    ts0Var.n.v.w = ts0Var.s();
                                } else {
                                    i5 = i14;
                                    i6 = i19;
                                    if (i20 == 2) {
                                        i15 = iArr[c];
                                        if (i15 != 1 || i15 == 4) {
                                            p(1, (int) ((f2 * us0Var.s()) + 0.5f), i6, ts0Var.m(), ts0Var);
                                            ts0Var.n.v.n(ts0Var.s());
                                            ts0Var.v.v.n(ts0Var.m());
                                            ts0Var.g = true;
                                        }
                                    } else if (as0VarArr[c].x != null || as0VarArr[1].x == null) {
                                        p(i5, 0, i6, 0, ts0Var);
                                        ts0Var.n.v.n(ts0Var.s());
                                        ts0Var.v.v.n(ts0Var.m());
                                        ts0Var.g = true;
                                    }
                                }
                            }
                            i8 = 3;
                            if (i6 != i8) {
                                if (i18 == i5) {
                                }
                                if (i21 == i8) {
                                    if (i18 == i5) {
                                        p(i5, 0, i5, 0, ts0Var);
                                    }
                                    int iS4 = ts0Var.s();
                                    f = ts0Var.W;
                                    if (ts0Var.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    p(i7, iS4, i7, (int) ((iS4 * f) + 0.5f), ts0Var);
                                    ts0Var.n.v.n(ts0Var.s());
                                    ts0Var.v.v.n(ts0Var.m());
                                    ts0Var.g = true;
                                } else {
                                    i9 = i6;
                                    i10 = i5;
                                    if (i21 == 1) {
                                        p(i18, 0, i10, 0, ts0Var);
                                        ts0Var.v.v.w = ts0Var.m();
                                    } else if (i21 == 2) {
                                        i13 = iArr[1];
                                        if (i13 != i7) {
                                        }
                                        p(i18, ts0Var.s(), i7, (int) ((f3 * us0Var.m()) + 0.5f), ts0Var);
                                        ts0Var.n.v.n(ts0Var.s());
                                        ts0Var.v.v.n(ts0Var.m());
                                        ts0Var.g = true;
                                    } else {
                                        if (as0VarArr[2].x != null) {
                                        }
                                        p(i10, 0, i9, 0, ts0Var);
                                        ts0Var.n.v.n(ts0Var.s());
                                        ts0Var.v.v.n(ts0Var.m());
                                        ts0Var.g = true;
                                    }
                                }
                            } else {
                                i9 = i6;
                                i10 = i5;
                            }
                            i11 = 1;
                            i12 = 3;
                            if (i18 == i12) {
                                if (i20 != i11) {
                                    p(i10, 0, i10, 0, ts0Var);
                                    ts0Var.n.v.w = ts0Var.s();
                                    ts0Var.v.v.w = ts0Var.m();
                                } else {
                                    p(i10, 0, i10, 0, ts0Var);
                                    ts0Var.n.v.w = ts0Var.s();
                                    ts0Var.v.v.w = ts0Var.m();
                                }
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                    iS = ts0Var.s();
                    if (i18 == 4) {
                        iS2 = (us0Var.s() - as0Var4.l) - as0Var3.l;
                        i3 = i2;
                    } else {
                        iS2 = iS;
                        i3 = i18;
                    }
                    iM = ts0Var.m();
                    if (i19 == 4) {
                        iM = (us0Var.m() - as0Var2.l) - as0Var.l;
                        i4 = i2;
                    } else {
                        i4 = i19;
                    }
                    p(i3, iS2, i4, iM, ts0Var);
                    ts0Var.n.v.n(ts0Var.s());
                    ts0Var.v.v.n(ts0Var.m());
                    ts0Var.g = true;
                } else {
                    i5 = 2;
                    if (i18 == 2) {
                        if (i19 == 4) {
                            i2 = 1;
                        } else if (i19 != 1) {
                            i5 = 2;
                            if (i19 == 2) {
                                i2 = 1;
                            } else {
                                if (i18 != 3) {
                                    if (i19 == i5) {
                                    }
                                    if (i20 == 3) {
                                        if (i19 == i5) {
                                            p(i5, 0, i5, 0, ts0Var);
                                        }
                                        int iM3 = ts0Var.m();
                                        p(1, (int) ((iM3 * ts0Var.W) + 0.5f), 1, iM3, ts0Var);
                                        ts0Var.n.v.n(ts0Var.s());
                                        ts0Var.v.v.n(ts0Var.m());
                                        ts0Var.g = true;
                                    } else {
                                        i14 = i5;
                                        i7 = 1;
                                        if (i20 == 1) {
                                            p(i14, 0, i19, 0, ts0Var);
                                            ts0Var.n.v.w = ts0Var.s();
                                        } else {
                                            i5 = i14;
                                            i6 = i19;
                                            if (i20 == 2) {
                                                i15 = iArr[c];
                                                if (i15 != 1) {
                                                }
                                                p(1, (int) ((f2 * us0Var.s()) + 0.5f), i6, ts0Var.m(), ts0Var);
                                                ts0Var.n.v.n(ts0Var.s());
                                                ts0Var.v.v.n(ts0Var.m());
                                                ts0Var.g = true;
                                            } else {
                                                if (as0VarArr[c].x != null) {
                                                }
                                                p(i5, 0, i6, 0, ts0Var);
                                                ts0Var.n.v.n(ts0Var.s());
                                                ts0Var.v.v.n(ts0Var.m());
                                                ts0Var.g = true;
                                            }
                                        }
                                    }
                                } else {
                                    i6 = i19;
                                    i7 = 1;
                                }
                                i8 = 3;
                                if (i6 != i8) {
                                    if (i18 == i5) {
                                    }
                                    if (i21 == i8) {
                                        if (i18 == i5) {
                                            p(i5, 0, i5, 0, ts0Var);
                                        }
                                        int iS5 = ts0Var.s();
                                        f = ts0Var.W;
                                        if (ts0Var.X == -1) {
                                            f = 1.0f / f;
                                        }
                                        p(i7, iS5, i7, (int) ((iS5 * f) + 0.5f), ts0Var);
                                        ts0Var.n.v.n(ts0Var.s());
                                        ts0Var.v.v.n(ts0Var.m());
                                        ts0Var.g = true;
                                    } else {
                                        i9 = i6;
                                        i10 = i5;
                                        if (i21 == 1) {
                                            p(i18, 0, i10, 0, ts0Var);
                                            ts0Var.v.v.w = ts0Var.m();
                                        } else if (i21 == 2) {
                                            i13 = iArr[1];
                                            if (i13 != i7) {
                                            }
                                            p(i18, ts0Var.s(), i7, (int) ((f3 * us0Var.m()) + 0.5f), ts0Var);
                                            ts0Var.n.v.n(ts0Var.s());
                                            ts0Var.v.v.n(ts0Var.m());
                                            ts0Var.g = true;
                                        } else {
                                            if (as0VarArr[2].x != null) {
                                            }
                                            p(i10, 0, i9, 0, ts0Var);
                                            ts0Var.n.v.n(ts0Var.s());
                                            ts0Var.v.v.n(ts0Var.m());
                                            ts0Var.g = true;
                                        }
                                    }
                                } else {
                                    i9 = i6;
                                    i10 = i5;
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i18 == i12) {
                                    if (i20 != i11) {
                                        p(i10, 0, i10, 0, ts0Var);
                                        ts0Var.n.v.w = ts0Var.s();
                                        ts0Var.v.v.w = ts0Var.m();
                                    } else {
                                        p(i10, 0, i10, 0, ts0Var);
                                        ts0Var.n.v.w = ts0Var.s();
                                        ts0Var.v.v.w = ts0Var.m();
                                    }
                                }
                            }
                        } else {
                            i2 = 1;
                        }
                        iS = ts0Var.s();
                        if (i18 == 4) {
                            iS2 = (us0Var.s() - as0Var4.l) - as0Var3.l;
                            i3 = i2;
                        } else {
                            iS2 = iS;
                            i3 = i18;
                        }
                        iM = ts0Var.m();
                        if (i19 == 4) {
                            iM = (us0Var.m() - as0Var2.l) - as0Var.l;
                            i4 = i2;
                        } else {
                            i4 = i19;
                        }
                        p(i3, iS2, i4, iM, ts0Var);
                        ts0Var.n.v.n(ts0Var.s());
                        ts0Var.v.v.n(ts0Var.m());
                        ts0Var.g = true;
                    } else {
                        if (i18 != 3) {
                            if (i19 == i5) {
                            }
                            if (i20 == 3) {
                                if (i19 == i5) {
                                    p(i5, 0, i5, 0, ts0Var);
                                }
                                int iM4 = ts0Var.m();
                                p(1, (int) ((iM4 * ts0Var.W) + 0.5f), 1, iM4, ts0Var);
                                ts0Var.n.v.n(ts0Var.s());
                                ts0Var.v.v.n(ts0Var.m());
                                ts0Var.g = true;
                            } else {
                                i14 = i5;
                                i7 = 1;
                                if (i20 == 1) {
                                    p(i14, 0, i19, 0, ts0Var);
                                    ts0Var.n.v.w = ts0Var.s();
                                } else {
                                    i5 = i14;
                                    i6 = i19;
                                    if (i20 == 2) {
                                        i15 = iArr[c];
                                        if (i15 != 1) {
                                        }
                                        p(1, (int) ((f2 * us0Var.s()) + 0.5f), i6, ts0Var.m(), ts0Var);
                                        ts0Var.n.v.n(ts0Var.s());
                                        ts0Var.v.v.n(ts0Var.m());
                                        ts0Var.g = true;
                                    } else {
                                        if (as0VarArr[c].x != null) {
                                        }
                                        p(i5, 0, i6, 0, ts0Var);
                                        ts0Var.n.v.n(ts0Var.s());
                                        ts0Var.v.v.n(ts0Var.m());
                                        ts0Var.g = true;
                                    }
                                }
                            }
                        } else {
                            i6 = i19;
                            i7 = 1;
                        }
                        i8 = 3;
                        if (i6 != i8) {
                            if (i18 == i5) {
                            }
                            if (i21 == i8) {
                                if (i18 == i5) {
                                    p(i5, 0, i5, 0, ts0Var);
                                }
                                int iS6 = ts0Var.s();
                                f = ts0Var.W;
                                if (ts0Var.X == -1) {
                                    f = 1.0f / f;
                                }
                                p(i7, iS6, i7, (int) ((iS6 * f) + 0.5f), ts0Var);
                                ts0Var.n.v.n(ts0Var.s());
                                ts0Var.v.v.n(ts0Var.m());
                                ts0Var.g = true;
                            } else {
                                i9 = i6;
                                i10 = i5;
                                if (i21 == 1) {
                                    p(i18, 0, i10, 0, ts0Var);
                                    ts0Var.v.v.w = ts0Var.m();
                                } else if (i21 == 2) {
                                    i13 = iArr[1];
                                    if (i13 != i7) {
                                    }
                                    p(i18, ts0Var.s(), i7, (int) ((f3 * us0Var.m()) + 0.5f), ts0Var);
                                    ts0Var.n.v.n(ts0Var.s());
                                    ts0Var.v.v.n(ts0Var.m());
                                    ts0Var.g = true;
                                } else {
                                    if (as0VarArr[2].x != null) {
                                    }
                                    p(i10, 0, i9, 0, ts0Var);
                                    ts0Var.n.v.n(ts0Var.s());
                                    ts0Var.v.v.n(ts0Var.m());
                                    ts0Var.g = true;
                                }
                            }
                        } else {
                            i9 = i6;
                            i10 = i5;
                        }
                        i11 = 1;
                        i12 = 3;
                        if (i18 == i12) {
                            if (i20 != i11) {
                                p(i10, 0, i10, 0, ts0Var);
                                ts0Var.n.v.w = ts0Var.s();
                                ts0Var.v.v.w = ts0Var.m();
                            } else {
                                p(i10, 0, i10, 0, ts0Var);
                                ts0Var.n.v.w = ts0Var.s();
                                ts0Var.v.v.w = ts0Var.m();
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [i73] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [i73] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public void z(um2 um2Var, long j) {
        um2 um2Var2 = (um2) this.r;
        boolean z = um2Var.X;
        ym2 ym2Var = um2Var.N;
        if (z) {
            return;
        }
        if (um2Var == um2Var2) {
            mc2.g("measureAndLayout called on root");
        }
        if (!um2Var2.J()) {
            mc2.g("performMeasureAndLayout called with unattached root");
        }
        if (!um2Var2.K()) {
            mc2.g("performMeasureAndLayout called with unplaced root");
        }
        if (this.g) {
            mc2.g("performMeasureAndLayout called during measure layout");
        }
        if (((ws0) this.j) != null) {
            this.g = true;
            this.y = false;
            try {
                ro roVar = (ro) this.n;
                ((y22) roVar.t).d(um2Var);
                ((y22) roVar.a).d(um2Var);
                ((y22) roVar.m).d(um2Var);
                if (j(um2Var, new ws0(j)) || ym2Var.x) {
                    if (yf2.p(um2Var.L(), Boolean.TRUE)) {
                        um2Var.M();
                    }
                }
                m(um2Var);
                if (um2Var.J == sm2.a) {
                    um2Var.r();
                }
                boolean zE0 = ym2Var.b.E0(j);
                um2 um2VarO = um2Var.o();
                if (zE0 && um2VarO != null) {
                    if (um2Var.u() == sm2.j) {
                        um2.X(um2VarO, false, 3);
                    } else if (um2Var.u() == sm2.t) {
                        um2VarO.W(false);
                    }
                }
                if (um2Var.s() && um2Var.K()) {
                    um2Var.T();
                    ji jiVar = (ji) this.v;
                    if (um2Var.W > 0) {
                        ((rb3) jiVar.t).y(um2Var);
                        um2Var.V = true;
                    }
                }
                a();
                this.g = false;
                this.y = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.g = false;
                    this.y = false;
                    throw th2;
                }
            }
        }
        rb3 rb3Var = (rb3) this.x;
        Object[] objArr = rb3Var.j;
        int i = rb3Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            ah3 ah3Var = ((um2) objArr[i2]).M;
            sc2 sc2Var = ah3Var.r;
            boolean zL = hh3.l(4194304);
            i73 i73Var = sc2Var.j0;
            if (zL || (i73Var = i73Var.q) != null) {
                pc3 pc3Var = gh3.c0;
                for (i73 i73VarB1 = sc2Var.b1(zL); i73VarB1 != null && (i73VarB1.m & 4194304) != 0; i73VarB1 = i73VarB1.w) {
                    if ((i73VarB1.a & 4194304) != 0) {
                        ?? Q = i73VarB1;
                        ?? rb3Var2 = 0;
                        while (Q != 0) {
                            if (Q instanceof xk2) {
                                ((xk2) Q).b(ah3Var.r);
                            } else if ((Q.a & 4194304) != 0 && (Q instanceof p41)) {
                                i73 i73Var2 = ((p41) Q).f;
                                int i3 = 0;
                                while (i73Var2 != null) {
                                    if ((i73Var2.a & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            Q = Q;
                                            rb3Var2 = rb3Var2;
                                            rb3Var2 = rb3Var2;
                                            Q = i73Var2;
                                        } else {
                                            if (rb3Var2 == 0) {
                                                rb3Var2 = new rb3(new i73[16]);
                                            }
                                            if (Q != 0) {
                                                rb3Var2.y(Q);
                                                Q = 0;
                                            }
                                            rb3Var2.y(i73Var2);
                                        }
                                    } else {
                                        Q = Q;
                                        rb3Var2 = rb3Var2;
                                    }
                                    i73Var2 = i73Var2.w;
                                    Q = Q;
                                    rb3Var2 = rb3Var2;
                                }
                                if (i3 == 1) {
                                    Q = Q;
                                    rb3Var2 = rb3Var2;
                                } else {
                                    Q = Q;
                                    rb3Var2 = rb3Var2;
                                }
                            }
                            Q = k33.Q(rb3Var2);
                        }
                    }
                    if (i73VarB1 == i73Var) {
                        break;
                    }
                }
            }
        }
        rb3Var.j();
    }
}
