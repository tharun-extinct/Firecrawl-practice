package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Handler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class ks0 implements Runnable {
    public Object a;
    public final /* synthetic */ byte j;
    public Object m;
    public Object t;

    public ks0(kr5 kr5Var, String str) {
        this.j = (byte) 6;
        this.a = kr5Var;
        this.m = str;
        this.t = new ol4();
    }

    public List g() {
        uh5 uh5VarK = ((kr5) this.a).r.k();
        String str = (String) this.m;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) uh5VarK.g;
        ba4 ba4VarX = ba4.x("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            ba4VarX.g(1);
        } else {
            ba4VarX.G(str, 1);
        }
        workDatabase_Impl.y();
        workDatabase_Impl.r();
        try {
            Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, true);
            try {
                int iH = gp4.H(cursorG, "id");
                int iH2 = gp4.H(cursorG, "state");
                int iH3 = gp4.H(cursorG, "output");
                int iH4 = gp4.H(cursorG, "run_attempt_count");
                mr mrVar = new mr(0);
                mr mrVar2 = new mr(0);
                while (cursorG.moveToNext()) {
                    if (!cursorG.isNull(iH)) {
                        String string = cursorG.getString(iH);
                        if (((ArrayList) mrVar.get(string)) == null) {
                            mrVar.put(string, new ArrayList());
                        }
                    }
                    if (!cursorG.isNull(iH)) {
                        String string2 = cursorG.getString(iH);
                        if (((ArrayList) mrVar2.get(string2)) == null) {
                            mrVar2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorG.moveToPosition(-1);
                uh5VarK.y(mrVar);
                uh5VarK.g(mrVar2);
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (true) {
                    if (!cursorG.moveToNext()) {
                        break;
                    }
                    ArrayList arrayList2 = !cursorG.isNull(iH) ? (ArrayList) mrVar.get(cursorG.getString(iH)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = cursorG.isNull(iH) ? null : (ArrayList) mrVar2.get(cursorG.getString(iH));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    rr5 rr5Var = new rr5();
                    rr5Var.g = cursorG.getString(iH);
                    rr5Var.y = cc6.q(cursorG.getInt(iH2));
                    rr5Var.r = qz0.g(cursorG.getBlob(iH3));
                    rr5Var.n = cursorG.getInt(iH4);
                    rr5Var.v = arrayList2;
                    rr5Var.x = arrayList3;
                    arrayList.add(rr5Var);
                }
                workDatabase_Impl.s();
                cursorG.close();
                ba4VarX.a();
                workDatabase_Impl.c();
                sr5.u.getClass();
                ArrayList<rr5> arrayList4 = arrayList;
                ArrayList arrayList5 = new ArrayList(arrayList4.size());
                for (rr5 rr5Var2 : arrayList4) {
                    ArrayList arrayList6 = rr5Var2.x;
                    qz0 qz0Var = (arrayList6 == null || arrayList6.isEmpty()) ? qz0.r : (qz0) rr5Var2.x.get(0);
                    UUID uuidFromString = UUID.fromString(rr5Var2.g);
                    hr5 hr5Var = rr5Var2.y;
                    qz0 qz0Var2 = rr5Var2.r;
                    ArrayList arrayList7 = rr5Var2.v;
                    int i = rr5Var2.n;
                    ir5 ir5Var = new ir5();
                    ir5Var.g = uuidFromString;
                    ir5Var.y = hr5Var;
                    ir5Var.r = qz0Var2;
                    ir5Var.n = new HashSet(arrayList7);
                    ir5Var.v = qz0Var;
                    ir5Var.x = i;
                    arrayList5.add(ir5Var);
                }
                return arrayList5;
            } catch (Throwable th) {
                cursorG.close();
                ba4VarX.a();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.c();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        String str;
        gj6 gj6Var;
        byte b = 10;
        boolean zBooleanValue = true;
        int i = 0;
        switch (this.j) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.m;
                Context context = (Context) this.a;
                Intent intent = (Intent) this.t;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    iy2.r().g(ConstraintProxyUpdateReceiver.g, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    tn3.g(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    tn3.g(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    tn3.g(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    tn3.g(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                try {
                    zBooleanValue = ((Boolean) ((vw2) this.m).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                ((az3) this.t).g((String) this.a, zBooleanValue);
                return;
            case 2:
                try {
                    objCall = ((av1) this.t).call();
                    break;
                } catch (Exception unused2) {
                    objCall = null;
                }
                ((Handler) this.m).post(new i26((bv1) this.a, objCall, b));
                return;
            case 3:
                ib0 ib0Var = (ib0) this.t;
                try {
                    v70.N(ib0Var.q.E(f73.t), new s3(this.a, (Object) ib0Var, this.m, (mu0) null, (byte) 17));
                    return;
                } catch (Throwable th) {
                    ib0Var.s(th);
                    return;
                }
            case 4:
                ep4 ep4Var = (ep4) this.m;
                ep4Var.a.r.remove((String) this.t);
                m74 m74Var = (m74) this.a;
                if (m74Var.j instanceof b1) {
                    return;
                }
                try {
                    m74Var.get();
                    return;
                } catch (Exception e) {
                    ep4Var.t.m(e);
                    return;
                }
            case 5:
                ((kr5) this.t).x.l((String) this.a, (ob5) this.m);
                return;
            case 6:
                ol4 ol4Var = (ol4) this.t;
                try {
                    ol4Var.a(g());
                    return;
                } catch (Throwable th2) {
                    ol4Var.m(th2);
                    return;
                }
            case 7:
                sr5 sr5VarA = ((WorkDatabase) this.t).k().a((String) this.a);
                if (sr5VarA == null || !sr5VarA.y()) {
                    return;
                }
                synchronized (((x05) this.m).a) {
                    ((x05) this.m).w.put((String) this.a, sr5VarA);
                    ((x05) this.m).c.add(sr5VarA);
                    x05 x05Var = (x05) this.m;
                    x05Var.i.y(x05Var.c);
                    break;
                }
                return;
            case 8:
                ol4 ol4Var2 = (ol4) this.a;
                yr5 yr5Var = (yr5) this.m;
                try {
                    ((ol4) this.t).get();
                    iy2.r().g(yr5.e, "Starting work for " + yr5Var.m.r, new Throwable[0]);
                    ol4 ol4VarL = yr5Var.q.l();
                    yr5Var.k = ol4VarL;
                    ol4Var2.q(ol4VarL);
                    return;
                } catch (Throwable th3) {
                    ol4Var2.m(th3);
                    return;
                }
            case 9:
                String str2 = (String) this.a;
                yr5 yr5Var2 = (yr5) this.m;
                try {
                    try {
                        zw2 zw2Var = (zw2) ((ol4) this.t).get();
                        if (zw2Var == null) {
                            iy2.r().y(yr5.e, yr5Var2.m.r + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            iy2.r().g(yr5.e, String.format("%s returned a %s result.", yr5Var2.m.r, zw2Var), new Throwable[0]);
                            yr5Var2.c = zw2Var;
                        }
                        break;
                    } catch (InterruptedException e2) {
                        e = e2;
                        Throwable th4 = e;
                        iy2.r().y(yr5.e, str2 + " failed because it threw an exception/error", th4);
                    } catch (CancellationException e3) {
                        iy2.r().n(yr5.e, str2 + " was cancelled", e3);
                    } catch (ExecutionException e4) {
                        e = e4;
                        Throwable th5 = e;
                        iy2.r().y(yr5.e, str2 + " failed because it threw an exception/error", th5);
                    }
                    yr5Var2.v();
                    return;
                } catch (Throwable th6) {
                    yr5Var2.v();
                    throw th6;
                }
            case 10:
                o00 o00Var = (o00) this.t;
                fa4 fa4Var = (fa4) this.a;
                h3 h3Var = (h3) this.m;
                x20 x20Var = b36.m;
                o00Var.G(24, 4, x20Var);
                fa4Var.I(x20Var, h3Var.g);
                return;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                super/*o00*/.n((jy3) this.a, (q64) this.m);
                return;
            case 12:
                super/*o00*/.y((h3) this.a, (fa4) this.m);
                return;
            case 13:
                super/*o00*/.g((h3) this.a, (v92) this.m);
                return;
            default:
                qh6 qh6Var = (qh6) this.t;
                ia6 ia6Var = (ia6) this.a;
                md6 md6Var = md6.z2;
                String str3 = (String) this.m;
                qh6Var.getClass();
                q70 q70Var = (q70) ia6Var.g;
                q70Var.a = md6Var;
                mg6 mg6Var = (mg6) q70Var.t;
                if (mg6Var != null) {
                    str = mg6Var.n;
                    int i2 = k46.g;
                    if (str == null || str.isEmpty()) {
                        str = "NA";
                    }
                } else {
                    str = "NA";
                }
                lg6 lg6Var = new lg6();
                lg6Var.g = qh6Var.g;
                lg6Var.y = qh6Var.y;
                synchronized (qh6.class) {
                    try {
                        gj6Var = qh6.t;
                        if (gj6Var == null) {
                            ux2 ux2VarN = ux2.n(Resources.getSystem().getConfiguration().getLocales());
                            Object[] objArrCopyOf = new Object[4];
                            int i3 = 0;
                            while (i < ux2VarN.r()) {
                                Locale localeY = ux2VarN.y(i);
                                g3 g3Var = uk0.g;
                                String languageTag = localeY.toLanguageTag();
                                languageTag.getClass();
                                int i4 = i3 + 1;
                                int length = objArrCopyOf.length;
                                if (length < i4) {
                                    int i5 = length + (length >> 1) + 1;
                                    if (i5 < i4) {
                                        int iHighestOneBit = Integer.highestOneBit(i3);
                                        i5 = iHighestOneBit + iHighestOneBit;
                                    }
                                    if (i5 < 0) {
                                        i5 = Integer.MAX_VALUE;
                                    }
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
                                }
                                objArrCopyOf[i3] = languageTag;
                                i++;
                                i3 = i4;
                            }
                            wg6 wg6Var = qi6.t;
                            gj6Var = i3 == 0 ? gj6.q : new gj6(i3, objArrCopyOf);
                            qh6.t = gj6Var;
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                lg6Var.v = gj6Var;
                lg6Var.j = Boolean.TRUE;
                lg6Var.n = str;
                lg6Var.r = str3;
                lg6Var.x = qh6Var.x.t() ? (String) qh6Var.x.l() : qh6Var.n.g();
                lg6Var.a = 10;
                lg6Var.m = Integer.valueOf(qh6Var.j);
                ia6Var.y = lg6Var;
                qh6Var.r.g(ia6Var);
                return;
        }
    }

    public /* synthetic */ ks0(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }

    public /* synthetic */ ks0(Object obj, Object obj2, Object obj3, byte b, boolean z) {
        this.j = b;
        this.m = obj;
        this.t = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ks0(qh6 qh6Var, ia6 ia6Var, String str) {
        this.j = (byte) 14;
        md6 md6Var = md6.t;
        this.t = qh6Var;
        this.a = ia6Var;
        this.m = str;
    }

    public /* synthetic */ ks0() {
        this.j = (byte) 2;
    }
}
