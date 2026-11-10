package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.StaticLayout;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gc0 implements ak3, f41, nu0, u52, vy4, jj3, n05 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ gc0(zo1 zo1Var, aj6 aj6Var) {
        this.j = (byte) 3;
        this.t = zo1Var;
    }

    @Override // defpackage.vy4
    public nj6 a(Object obj) {
        int i;
        eu3 eu3Var = (eu3) this.t;
        ft5 ft5Var = eu3Var.y;
        wt5 wt5Var = new wt5(((o02) obj).g, Long.valueOf(Long.parseLong(eu3Var.g)));
        jt5 jt5Var = ft5Var.g;
        bt5 bt5Var = jt5Var.v;
        if (bt5Var == null) {
            return br2.b(new se2(-2, null));
        }
        Context context = jt5Var.r;
        fu5 fu5Var = et5.g;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            i = (applicationInfo != null && applicationInfo.enabled && et5.g(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (i < 82380000) {
            return br2.b(new se2(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(wt5Var.g, 10);
            jt5Var.g.g("requestIntegrityToken(%s)", wt5Var);
            x25 x25Var = new x25();
            bt5Var.g().post(new ku5(bt5Var, x25Var, x25Var, new ht5(jt5Var, x25Var, bArrDecode, wt5Var.y, x25Var, wt5Var)));
            return x25Var.g;
        } catch (IllegalArgumentException e) {
            return br2.b(new se2(-13, e));
        }
    }

    public void g(StaticLayout.Builder builder) {
        TextInputLayout textInputLayout = (TextInputLayout) this.t;
        int[][] iArr = TextInputLayout.K0;
        builder.setBreakStrategy(textInputLayout.B.getBreakStrategy());
    }

    @Override // defpackage.ak3
    public void m(Exception exc) {
        long j;
        a41 a41Var = (a41) this.t;
        a41Var.g();
        if (a41Var.v == -1) {
            j = 30;
        } else {
            j = a41Var.v * 2 < 960 ? a41Var.v * 2 : 960L;
        }
        a41Var.v = j;
        a41Var.n = a41Var.r.schedule(new z31(a41Var, (byte) 1), a41Var.v, TimeUnit.SECONDS);
    }

    public boolean n(fa4 fa4Var, int i, Bundle bundle) {
        rt0 fa4Var2;
        yl ylVar = (yl) this.t;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((yc2) fa4Var.t).w();
                Parcelable parcelable = (Parcelable) ((yc2) fa4Var.t).m();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        yc2 yc2Var = (yc2) fa4Var.t;
        ClipData clipData = new ClipData(yc2Var.v(), new ClipData.Item(yc2Var.q()));
        if (i2 >= 31) {
            fa4Var2 = new fa4(clipData, 2);
        } else {
            st0 st0Var = new st0();
            st0Var.t = clipData;
            st0Var.a = (byte) 2;
            fa4Var2 = st0Var;
        }
        fa4Var2.a(yc2Var.c());
        fa4Var2.setExtras(bundle);
        return xk5.j(ylVar, fa4Var2.build()) == null;
    }

    @Override // defpackage.nu0
    public Object o(nj6 nj6Var) {
        nj6 nj6VarA;
        nj6 nj6VarS;
        zo1 zo1Var = (zo1) this.t;
        nj6Var.getClass();
        wo1 wo1Var = zo1Var.n;
        Executor executor = wo1Var.r;
        if (wo1Var.g.get() != null) {
            uo1.B();
            return null;
        }
        nj6 nj6VarS2 = br2.s(null);
        nf2 nf2Var = (nf2) wo1Var.n.get();
        if (nf2Var == null) {
            nj6VarA = br2.s(null);
        } else {
            r11 r11Var = (r11) nf2Var;
            nj6VarA = r11Var.a.v(r11Var.j, new q11(r11Var)).a(executor, new up(wo1Var, (byte) 9));
        }
        List<nj6> listAsList = Arrays.asList(nj6VarS2, nj6VarA);
        if (listAsList == null || listAsList.isEmpty()) {
            nj6VarS = br2.s(null);
        } else {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                if (((nj6) it.next()) == null) {
                    l0.q("null tasks are not accepted");
                    return null;
                }
            }
            nj6VarS = new nj6();
            rw5 rw5Var = new rw5(listAsList.size(), nj6VarS);
            for (nj6 nj6Var2 : listAsList) {
                dp1 dp1Var = y25.y;
                nj6Var2.n(dp1Var, rw5Var);
                nj6Var2.r(dp1Var, rw5Var);
                nj6Var2.y.g(new w86((Executor) dp1Var, (wj3) rw5Var));
                nj6Var2.i();
            }
        }
        return nj6VarS.a(executor, new w21((Object) nj6VarS2, (Object) wo1Var, (Object) nj6VarA, (byte) 1));
    }

    @Override // defpackage.f41
    public void r(n14 n14Var) {
        wo1 wo1Var = (wo1) this.t;
        n14Var.getClass();
        nf2 nf2Var = (nf2) n14Var.get();
        wo1Var.n.set(nf2Var);
        vo1 vo1Var = new vo1();
        r11 r11Var = (r11) nf2Var;
        r11Var.getClass();
        r11Var.r.add(vo1Var);
        ea5 ea5Var = r11Var.x;
        int size = r11Var.n.size() + r11Var.r.size();
        if (ea5Var.n == 0 && size > 0) {
            ea5Var.n = size;
            if (ea5Var.g()) {
                a41 a41Var = ea5Var.g;
                long j = ea5Var.v;
                ea5Var.y.getClass();
                a41Var.y(j - System.currentTimeMillis());
            }
        } else if (ea5Var.n > 0 && size == 0) {
            ea5Var.g.g();
        }
        ea5Var.n = size;
        e11 e11Var = r11Var.w;
        if (e11Var != null) {
            long jR = e11Var.r();
            r11Var.m.getClass();
            if (jR - System.currentTimeMillis() > 300000) {
                f11.g(r11Var.w);
            }
        }
    }

    @Override // defpackage.jj3
    public tp5 t(View view, tp5 tp5Var) {
        u05 u05Var = (u05) this.t;
        ArrayList arrayList = u05Var.y;
        pp5 pp5Var = tp5Var.g;
        nd2 nd2VarY = nd2.y(pp5Var.t(519), pp5Var.t(64));
        nd2 nd2VarY2 = nd2.y(pp5Var.a(519), pp5Var.a(64));
        if (!nd2VarY.equals(u05Var.r) || !nd2VarY2.equals(u05Var.n)) {
            u05Var.r = nd2VarY;
            u05Var.n = nd2VarY2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j04 j04Var = (j04) arrayList.get(size);
                j04Var.r = nd2VarY;
                j04Var.n = nd2VarY2;
                j04Var.r();
            }
        }
        return tp5Var;
    }

    @Override // defpackage.n05
    public Object y() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 9:
                bc4 bc4Var = (bc4) ((uh5) obj).v;
                SQLiteDatabase sQLiteDatabaseY = bc4Var.y();
                sQLiteDatabaseY.beginTransaction();
                try {
                    sQLiteDatabaseY.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseY.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + bc4Var.t.n()).execute();
                    sQLiteDatabaseY.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseY.endTransaction();
                }
            default:
                kb5 kb5Var = (kb5) obj;
                SQLiteDatabase sQLiteDatabaseY2 = ((bc4) kb5Var.t).y();
                sQLiteDatabaseY2.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseY2.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (cursorRawQuery.moveToNext()) {
                            ro roVarG = cv.g();
                            roVarG.X(cursorRawQuery.getString(1));
                            roVarG.m = zx3.y(cursorRawQuery.getInt(2));
                            String string = cursorRawQuery.getString(3);
                            roVarG.a = string == null ? null : Base64.decode(string, 0);
                            arrayList.add(roVarG.j());
                            break;
                        }
                        cursorRawQuery.close();
                        sQLiteDatabaseY2.setTransactionSuccessful();
                        sQLiteDatabaseY2.endTransaction();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            ((ro) kb5Var.a).V((cv) obj2, 1, false);
                        }
                        return null;
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    sQLiteDatabaseY2.endTransaction();
                    throw th2;
                }
        }
    }

    public /* synthetic */ gc0(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }
}
