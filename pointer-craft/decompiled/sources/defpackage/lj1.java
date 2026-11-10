package defpackage;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class lj1 implements Runnable {
    public static final String a = iy2.v("EnqueueRunnable");
    public final zq5 j;
    public final rk4 t = new rk4((byte) 1);

    public lj1(zq5 zq5Var) {
        this.j = zq5Var;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:122:0x0235  */
    /* JADX WARN: Code duplicated, block: B:125:0x023b  */
    /* JADX WARN: Code duplicated, block: B:126:0x023d  */
    /* JADX WARN: Code duplicated, block: B:131:0x025b  */
    /* JADX WARN: Code duplicated, block: B:133:0x025f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0299  */
    /* JADX WARN: Code duplicated, block: B:149:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01a8  */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x025b, please report this as an issue */
    public static boolean g(zq5 zq5Var) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        boolean z6;
        boolean z7;
        WorkDatabase_Impl workDatabase_Impl;
        WorkDatabase_Impl workDatabase_Impl2;
        WorkDatabase_Impl workDatabase_Impl3;
        int i;
        WorkDatabase_Impl workDatabase_Impl4;
        String str;
        boolean z8;
        List list;
        HashSet hashSetY = zq5.y(zq5Var);
        kr5 kr5Var = zq5Var.g;
        List list2 = zq5Var.n;
        String[] strArr = (String[]) hashSetY.toArray(new String[0]);
        String str2 = zq5Var.y;
        int i2 = zq5Var.r;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = kr5Var.r;
        boolean z9 = strArr != null && strArr.length > 0;
        hr5 hr5Var = hr5.a;
        hr5 hr5Var2 = hr5.w;
        hr5 hr5Var3 = hr5.m;
        if (z9) {
            int length = strArr.length;
            int i3 = 0;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i3 < length) {
                    String str3 = strArr[i3];
                    List list3 = list2;
                    sr5 sr5VarA = workDatabase2.k().a(str3);
                    if (sr5VarA == null) {
                        iy2.r().y(a, du4.i("Prerequisite ", str3, " doesn't exist; not enqueuing"), new Throwable[0]);
                    } else {
                        hr5 hr5Var4 = sr5VarA.y;
                        z &= hr5Var4 == hr5Var;
                        if (hr5Var4 == hr5Var3) {
                            z3 = true;
                        } else if (hr5Var4 == hr5Var2) {
                            z2 = true;
                        }
                        i3++;
                        list2 = list3;
                    }
                }
                z7 = false;
                zq5Var.l = true;
                return z7;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        List list4 = list2;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        hr5 hr5Var5 = hr5.j;
        if (zIsEmpty || z9) {
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            z5 = false;
            z6 = z5;
        } else {
            ArrayList arrayListM = workDatabase2.k().m(str2);
            if (arrayListM.isEmpty()) {
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
                z5 = false;
            } else {
                z4 = zIsEmpty;
                if (i2 == 3 || i2 == 4) {
                    rk4 rk4VarU = workDatabase2.u();
                    ArrayList arrayList = new ArrayList();
                    int size = arrayListM.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayListM.get(i4);
                        int i5 = i4 + 1;
                        qr5 qr5Var = (qr5) obj;
                        WorkDatabase workDatabase3 = workDatabase2;
                        String str4 = qr5Var.g;
                        ArrayList arrayList2 = arrayListM;
                        WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) rk4VarU.t;
                        rk4 rk4Var = rk4VarU;
                        int i6 = size;
                        ba4 ba4VarX = ba4.x("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
                        if (str4 == null) {
                            ba4VarX.g(1);
                        } else {
                            ba4VarX.G(str4, 1);
                        }
                        workDatabase_Impl5.y();
                        Cursor cursorG = pw5.G(workDatabase_Impl5, ba4VarX, false);
                        try {
                            boolean z10 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                            cursorG.close();
                            ba4VarX.a();
                            if (!z10) {
                                hr5 hr5Var6 = qr5Var.y;
                                boolean z11 = z & (hr5Var6 == hr5Var);
                                if (hr5Var6 == hr5Var3) {
                                    z3 = true;
                                } else if (hr5Var6 == hr5Var2) {
                                    z2 = true;
                                }
                                arrayList.add(qr5Var.g);
                                z = z11;
                            }
                            workDatabase2 = workDatabase3;
                            i4 = i5;
                            arrayListM = arrayList2;
                            rk4VarU = rk4Var;
                            size = i6;
                        } catch (Throwable th) {
                            cursorG.close();
                            ba4VarX.a();
                            throw th;
                        }
                    }
                    workDatabase = workDatabase2;
                    z5 = false;
                    if (i2 == 4 && (z2 || z3)) {
                        uh5 uh5VarK = workDatabase.k();
                        ArrayList arrayListM2 = uh5VarK.m(str2);
                        int size2 = arrayListM2.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            Object obj2 = arrayListM2.get(i7);
                            i7++;
                            uh5VarK.r(((qr5) obj2).g);
                        }
                        z8 = false;
                        z2 = false;
                        list = Collections.EMPTY_LIST;
                    } else {
                        z8 = z3;
                        list = arrayList;
                    }
                    strArr = (String[]) list.toArray(strArr);
                    z9 = strArr.length > 0;
                    z3 = z8;
                } else {
                    if (i2 == 2) {
                        int size3 = arrayListM.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 < size3) {
                                Object obj3 = arrayListM.get(i8);
                                i8++;
                                hr5 hr5Var7 = ((qr5) obj3).y;
                                if (hr5Var7 == hr5Var5 || hr5Var7 == hr5.t) {
                                    z7 = false;
                                    zq5Var.l = true;
                                    return z7;
                                }
                            }
                        }
                    }
                    new fb0(kr5Var, str2, (byte) 1).run();
                    uh5 uh5VarK2 = workDatabase2.k();
                    int size4 = arrayListM.size();
                    int i9 = 0;
                    while (i9 < size4) {
                        Object obj4 = arrayListM.get(i9);
                        i9++;
                        uh5VarK2.r(((qr5) obj4).g);
                    }
                    workDatabase = workDatabase2;
                    z6 = true;
                }
            }
            z6 = z5;
        }
        boolean z12 = z6;
        for (Iterator it = list4.iterator(); it.hasNext(); it = it) {
            qk3 qk3Var = (qk3) it.next();
            sr5 sr5Var = qk3Var.y;
            UUID uuid = qk3Var.g;
            try {
                if (!z9 || z) {
                    if (sr5Var.r()) {
                        sr5Var.c = 0L;
                    } else {
                        sr5Var.c = jCurrentTimeMillis;
                    }
                    if (Build.VERSION.SDK_INT <= 25) {
                        vs0 vs0Var = sr5Var.a;
                        str = sr5Var.r;
                        if (str.equals(ConstraintTrackingWorker.class.getName()) && (vs0Var.n || vs0Var.v)) {
                            v92 v92Var = new v92((byte) 11);
                            v92Var.P(sr5Var.v.g);
                            ((HashMap) v92Var.t).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                            sr5Var.r = ConstraintTrackingWorker.class.getName();
                            qz0 qz0Var = new qz0((HashMap) v92Var.t);
                            qz0.y(qz0Var);
                            sr5Var.v = qz0Var;
                        }
                    }
                    if (sr5Var.y == hr5Var5) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    uh5 uh5VarK3 = workDatabase.k();
                    workDatabase_Impl = (WorkDatabase_Impl) uh5VarK3.g;
                    workDatabase_Impl.y();
                    workDatabase_Impl.r();
                    ((mw3) uh5VarK3.y).b(sr5Var);
                    workDatabase_Impl.s();
                    workDatabase_Impl.c();
                    if (z9) {
                        for (String str5 : strArr) {
                            o51 o51Var = new o51(uuid.toString(), str5);
                            rk4 rk4VarU2 = workDatabase.u();
                            workDatabase_Impl4 = (WorkDatabase_Impl) rk4VarU2.t;
                            workDatabase_Impl4.y();
                            workDatabase_Impl4.r();
                            try {
                                ((s51) rk4VarU2.a).b(o51Var);
                                workDatabase_Impl4.s();
                                workDatabase_Impl4.c();
                            } catch (Throwable th2) {
                                workDatabase_Impl4.c();
                                throw th2;
                            }
                        }
                    }
                    for (String str6 : qk3Var.r) {
                        rk4 rk4VarD = workDatabase.d();
                        tr5 tr5Var = new tr5(str6, uuid.toString());
                        workDatabase_Impl3 = (WorkDatabase_Impl) rk4VarD.t;
                        workDatabase_Impl3.y();
                        workDatabase_Impl3.r();
                        try {
                            ((s51) rk4VarD.a).b(tr5Var);
                            workDatabase_Impl3.s();
                            workDatabase_Impl3.c();
                        } catch (Throwable th3) {
                            workDatabase_Impl3.c();
                            throw th3;
                        }
                    }
                    if (!z4) {
                        cd2 cd2VarO = workDatabase.o();
                        nr5 nr5Var = new nr5(str2, uuid.toString());
                        workDatabase_Impl2 = (WorkDatabase_Impl) cd2VarO.t;
                        workDatabase_Impl2.y();
                        workDatabase_Impl2.r();
                        try {
                            ((s51) cd2VarO.a).b(nr5Var);
                            workDatabase_Impl2.s();
                            workDatabase_Impl2.c();
                        } catch (Throwable th4) {
                            workDatabase_Impl2.c();
                            throw th4;
                        }
                    }
                    jCurrentTimeMillis = jCurrentTimeMillis;
                } else if (z3) {
                    sr5Var.y = hr5Var3;
                } else if (z2) {
                    sr5Var.y = hr5Var2;
                } else {
                    sr5Var.y = hr5.q;
                }
                ((mw3) uh5VarK3.y).b(sr5Var);
                workDatabase_Impl.s();
                workDatabase_Impl.c();
                if (z9) {
                    while (i < r2) {
                        o51 o51Var2 = new o51(uuid.toString(), str5);
                        rk4 rk4VarU3 = workDatabase.u();
                        workDatabase_Impl4 = (WorkDatabase_Impl) rk4VarU3.t;
                        workDatabase_Impl4.y();
                        workDatabase_Impl4.r();
                        ((s51) rk4VarU3.a).b(o51Var2);
                        workDatabase_Impl4.s();
                        workDatabase_Impl4.c();
                    }
                }
                while (r2.hasNext()) {
                    rk4 rk4VarD2 = workDatabase.d();
                    tr5 tr5Var2 = new tr5(str6, uuid.toString());
                    workDatabase_Impl3 = (WorkDatabase_Impl) rk4VarD2.t;
                    workDatabase_Impl3.y();
                    workDatabase_Impl3.r();
                    ((s51) rk4VarD2.a).b(tr5Var2);
                    workDatabase_Impl3.s();
                    workDatabase_Impl3.c();
                }
                if (!z4) {
                    cd2 cd2VarO2 = workDatabase.o();
                    nr5 nr5Var2 = new nr5(str2, uuid.toString());
                    workDatabase_Impl2 = (WorkDatabase_Impl) cd2VarO2.t;
                    workDatabase_Impl2.y();
                    workDatabase_Impl2.r();
                    ((s51) cd2VarO2.a).b(nr5Var2);
                    workDatabase_Impl2.s();
                    workDatabase_Impl2.c();
                }
                jCurrentTimeMillis = jCurrentTimeMillis;
            } catch (Throwable th5) {
                workDatabase_Impl.c();
                throw th5;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                vs0 vs0Var2 = sr5Var.a;
                str = sr5Var.r;
                if (str.equals(ConstraintTrackingWorker.class.getName())) {
                }
            }
            if (sr5Var.y == hr5Var5) {
                z12 = true;
            } else {
                z12 = z12;
            }
            uh5 uh5VarK4 = workDatabase.k();
            workDatabase_Impl = (WorkDatabase_Impl) uh5VarK4.g;
            workDatabase_Impl.y();
            workDatabase_Impl.r();
        }
        z7 = z12;
        zq5Var.l = true;
        return z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        rk4 rk4Var = this.t;
        zq5 zq5Var = this.j;
        kr5 kr5Var = zq5Var.g;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(zq5Var.v);
            HashSet hashSetY = zq5.y(zq5Var);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(zq5Var.v);
                    z = false;
                    break;
                } else if (hashSetY.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + zq5Var + ")");
            }
            WorkDatabase workDatabase = kr5Var.r;
            workDatabase.r();
            try {
                boolean zG = g(zq5Var);
                workDatabase.s();
                workDatabase.c();
                if (zG) {
                    tn3.g(kr5Var.g, RescheduleReceiver.class, true);
                    je4.g(kr5Var.y, kr5Var.r, kr5Var.v);
                }
                rk4Var.T(rk4.q);
            } catch (Throwable th) {
                workDatabase.c();
                throw th;
            }
        } catch (Throwable th2) {
            rk4Var.T(new tl3(th2));
        }
    }
}
