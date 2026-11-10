package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class je4 {
    public static final String g = iy2.v("Schedulers");

    public static void g(pp0 pp0Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        uh5 uh5VarK = workDatabase.k();
        workDatabase.r();
        try {
            ArrayList arrayListV = uh5VarK.v(pp0Var.j);
            ArrayList arrayListN = uh5VarK.n();
            if (arrayListV.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = arrayListV.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListV.get(i);
                    i++;
                    uh5VarK.w(((sr5) obj).g, jCurrentTimeMillis);
                }
            }
            workDatabase.s();
            workDatabase.c();
            if (arrayListV.size() > 0) {
                sr5[] sr5VarArr = (sr5[]) arrayListV.toArray(new sr5[arrayListV.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    he4 he4Var = (he4) it.next();
                    if (he4Var.x()) {
                        he4Var.n(sr5VarArr);
                    }
                }
            }
            if (arrayListN.size() > 0) {
                sr5[] sr5VarArr2 = (sr5[]) arrayListN.toArray(new sr5[arrayListN.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    he4 he4Var2 = (he4) it2.next();
                    if (!he4Var2.x()) {
                        he4Var2.n(sr5VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.c();
            throw th;
        }
    }
}
