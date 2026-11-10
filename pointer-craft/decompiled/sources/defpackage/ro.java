package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import io.appground.blek.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public final class ro implements ys4, n83, tc4 {
    public static volatile ro q;
    public static final Object w = new Object();
    public Object a;
    public final /* synthetic */ byte j;
    public Object m;
    public Object t;

    public ro(byte b) {
        this.j = b;
        byte b2 = 16;
        switch (b) {
            case 3:
                this.t = new kz2(16);
                long[] jArr = ee4.g;
                this.a = new hb3();
                this.m = new l76(b2);
                break;
            case 12:
                this.t = new y22((byte) 15);
                this.a = new y22((byte) 15);
                this.m = new y22((byte) 15);
                break;
            case 14:
                this.t = new hb3();
                break;
            case 22:
                long[] jArr2 = ee4.g;
                this.t = new hb3();
                break;
            case 25:
                this.t = new AtomicReference(k33.D);
                this.a = new Object();
                break;
            case 29:
                this.t = new WeakHashMap();
                this.a = new WeakHashMap();
                this.m = new WeakHashMap();
                break;
            default:
                this.m = new l76(b2);
                break;
        }
    }

    public static ro A(Context context) {
        if (q == null) {
            synchronized (w) {
                try {
                    if (q == null) {
                        q = new ro(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return q;
    }

    public static boolean K(wh1 wh1Var, Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    iMax = gf6.g(editable, selectionStart, Math.max(i, 0));
                    iMin = gf6.y(editable, selectionEnd, Math.max(i2, 0));
                    if (iMax != -1 && iMin != -1) {
                    }
                } else {
                    iMax = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                gf5[] gf5VarArr = (gf5[]) editable.getSpans(iMax, iMin, gf5.class);
                if (gf5VarArr != null && gf5VarArr.length > 0) {
                    for (gf5 gf5Var : gf5VarArr) {
                        int spanStart = editable.getSpanStart(gf5Var);
                        int spanEnd = editable.getSpanEnd(gf5Var);
                        iMax = Math.min(spanStart, iMax);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax2 = Math.max(iMax, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    wh1Var.beginBatchEdit();
                    editable.delete(iMax2, iMin2);
                    wh1Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static ro P(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new ro(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static void U(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static boolean m(Editable editable, KeyEvent keyEvent, boolean z) {
        gf5[] gf5VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (gf5VarArr = (gf5[]) editable.getSpans(selectionStart, selectionEnd, gf5.class)) != null && gf5VarArr.length > 0) {
                for (gf5 gf5Var : gf5VarArr) {
                    int spanStart = editable.getSpanStart(gf5Var);
                    int spanEnd = editable.getSpanEnd(gf5Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int B() {
        if (D().g.isEmpty()) {
            return -1;
        }
        long j = ((long) ((w33) cj0.r0(D().g)).g) + ((long) D().j);
        long jI = ((long) I()) - 1;
        if (j > jI) {
            j = jI;
        }
        return (int) j;
    }

    public fl2 C() {
        return ((pb0) this.m).j.y;
    }

    public mo3 D() {
        mo3 mo3Var = (mo3) this.a;
        if (mo3Var != null) {
            return mo3Var;
        }
        yf2.Y("layoutInfo");
        throw null;
    }

    public int E() {
        if (D().g.isEmpty()) {
            return 0;
        }
        return Math.abs(((((w33) cj0.r0(D().g)).a + D().y) + D().r) - D().l);
    }

    public int F() {
        if (D().g.isEmpty()) {
            return 0;
        }
        int i = ((w33) cj0.j0(D().g)).a + (-D().x);
        return Math.abs(i <= 0 ? i : 0);
    }

    public long G() {
        return ((pb0) this.m).j.n;
    }

    public z05 H(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.t;
        ba4 ba4VarX = ba4.x("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            ba4VarX.g(1);
        } else {
            ba4VarX.G(str, 1);
        }
        workDatabase_Impl.y();
        Cursor cursorG = pw5.G(workDatabase_Impl, ba4VarX, false);
        try {
            return cursorG.moveToFirst() ? new z05(cursorG.getString(gp4.H(cursorG, "work_spec_id")), cursorG.getInt(gp4.H(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            ba4VarX.a();
        }
    }

    public int I() {
        return ((Number) ((to3) this.t).g()).intValue();
    }

    public ed5 J(String str, dj1 dj1Var, xb5 xb5Var) {
        Set set = (Set) this.t;
        if (set.contains(dj1Var)) {
            return new ed5((cv) this.a, str, dj1Var, xb5Var, (fd5) this.m);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", dj1Var, set));
    }

    public boolean L(CharSequence charSequence, int i, int i2, ff5 ff5Var) {
        if ((ff5Var.r & 3) == 0) {
            v11 v11Var = (v11) this.m;
            v53 v53VarY = ff5Var.y();
            int iG = v53VarY.g(8);
            if (iG != 0) {
                ((ByteBuffer) v53VarY.m).getShort(iG + v53VarY.j);
            }
            v11Var.getClass();
            ThreadLocal threadLocal = v11.y;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zY = ic6.y(v11Var.g, sb.toString());
            int i3 = ff5Var.r & 4;
            ff5Var.r = zY ? i3 | 2 : i3 | 1;
        }
        return (ff5Var.r & 3) == 2;
    }

    public void M(z05 z05Var) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.t;
        workDatabase_Impl.y();
        workDatabase_Impl.r();
        try {
            ((mw3) this.a).b(z05Var);
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.c();
        }
    }

    public boolean N() {
        return !(((fu4) ((y22) this.t).t).isEmpty() && ((fu4) ((y22) this.m).t).isEmpty() && ((fu4) ((y22) this.a).t).isEmpty());
    }

    public boolean O(int i, gs0 gs0Var, ts0 ts0Var) {
        vy vyVar = (vy) this.a;
        int[] iArr = ts0Var.p0;
        int[] iArr2 = ts0Var.z;
        vyVar.g = iArr[0];
        vyVar.y = iArr[1];
        vyVar.r = ts0Var.s();
        vyVar.n = ts0Var.m();
        vyVar.t = false;
        vyVar.a = i;
        boolean z = vyVar.g == 3;
        boolean z2 = vyVar.y == 3;
        boolean z3 = z && ts0Var.W > 0.0f;
        boolean z4 = z2 && ts0Var.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            vyVar.g = 1;
        }
        if (z4 && iArr2[1] == 4) {
            vyVar.y = 1;
        }
        gs0Var.y(ts0Var, vyVar);
        ts0Var.O(vyVar.v);
        ts0Var.L(vyVar.x);
        ts0Var.E = vyVar.j;
        ts0Var.I(vyVar.l);
        vyVar.a = 0;
        return vyVar.t;
    }

    public void Q(vt2 vt2Var) {
        pk4 pk4Var = (pk4) this.m;
        if (pk4Var != null) {
            pk4Var.run();
        }
        pk4 pk4Var2 = new pk4((ju2) this.t, vt2Var);
        this.m = pk4Var2;
        ((Handler) this.a).postAtFrontOfQueue(pk4Var2);
    }

    public Object R(CharSequence charSequence, int i, int i2, int i3, boolean z, ai1 ai1Var) {
        int i4;
        char c;
        ci1 ci1Var = new ci1((x53) ((kb5) this.a).a);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zV = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zV) {
                    x53 x53Var = (x53) ci1Var.r.g.get(iCodePointAt);
                    if (ci1Var.g == 2) {
                        if (x53Var != null) {
                            ci1Var.r = x53Var;
                            ci1Var.x++;
                        } else {
                            if (iCodePointAt == 65038) {
                                ci1Var.g();
                            } else if (iCodePointAt != 65039) {
                                x53 x53Var2 = ci1Var.r;
                                if (x53Var2.y != null) {
                                    if (ci1Var.x != 1) {
                                        ci1Var.n = x53Var2;
                                        ci1Var.g();
                                    } else if (ci1Var.y()) {
                                        ci1Var.n = ci1Var.r;
                                        ci1Var.g();
                                    } else {
                                        ci1Var.g();
                                    }
                                    c = 3;
                                } else {
                                    ci1Var.g();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (x53Var == null) {
                        ci1Var.g();
                        c = 1;
                    } else {
                        ci1Var.g = (byte) 2;
                        ci1Var.r = x53Var;
                        ci1Var.x = 1;
                        c = 2;
                    }
                    ci1Var.v = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && L(charSequence, i4, iCharCount, ci1Var.n.y)) {
                            break;
                        }
                        zV = ai1Var.v(charSequence, i4, iCharCount, ci1Var.n.y);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (ci1Var.g == 2 && ci1Var.r.y != null && ((ci1Var.x > 1 || ci1Var.y()) && i5 < i3 && zV && (z || !L(charSequence, i4, iCharCount, ci1Var.r.y)))) {
            ai1Var.v(charSequence, i4, iCharCount, ci1Var.r.y);
        }
        return ai1Var.g();
    }

    public void S() {
        ((TypedArray) this.t).recycle();
    }

    public void T(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.t;
        workDatabase_Impl.y();
        a15 a15Var = (a15) this.m;
        gy1 gy1VarG = a15Var.g();
        if (str == null) {
            gy1VarG.g(1);
        } else {
            gy1VarG.G(str, 1);
        }
        workDatabase_Impl.r();
        try {
            gy1VarG.y();
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.c();
            a15Var.w(gy1VarG);
        }
    }

    public void V(cv cvVar, int i, boolean z) {
        xu xuVar = (xu) this.a;
        Context context = (Context) this.m;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(cvVar.g.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(zx3.g(cvVar.r)).array());
        byte[] bArr = cvVar.y;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    sp2.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", cvVar);
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseY = ((bc4) this.t).y();
        String str = cvVar.g;
        xx3 xx3Var = cvVar.r;
        Cursor cursorRawQuery = sQLiteDatabaseY.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(zx3.g(xx3Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(xuVar.g(xx3Var, jLongValue, i));
            Set set = ((yu) xuVar.y.get(xx3Var)).r;
            if (set.contains(ie4.j)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(ie4.a)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(ie4.t)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", zx3.g(xx3Var));
            byte[] bArr2 = cvVar.y;
            if (bArr2 != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {cvVar, Integer.valueOf(value), Long.valueOf(xuVar.g(xx3Var, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strP = sp2.p("JobInfoScheduler");
            if (Log.isLoggable(strP, 3)) {
                Log.d(strP, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void W(Object obj) {
        long j = zq2.j();
        if (j == c95.g) {
            this.m = obj;
            return;
        }
        synchronized (this.a) {
            y85 y85Var = (y85) ((AtomicReference) this.t).get();
            int iG = y85Var.g(j);
            if (iG < 0) {
                ((AtomicReference) this.t).set(y85Var.y(j, obj));
            } else {
                y85Var.r[iG] = obj;
            }
        }
    }

    public void X(String str) {
        if (str != null) {
            this.t = str;
        } else {
            l0.q("Null backendName");
        }
    }

    public void Y(nb0 nb0Var) {
        ((pb0) this.m).j.r = nb0Var;
    }

    public void Z(j51 j51Var) {
        ((pb0) this.m).j.g = j51Var;
    }

    @Override // defpackage.n83
    public iv4 a(byte b, boolean z) {
        av0 av0Var = (av0) this.t;
        av0Var.Z(av0Var.O());
        return m50.T(mq2.a(av0Var), null, new yu0(av0Var, b, z, null, (byte) 1), 3);
    }

    public void a0(fl2 fl2Var) {
        ((pb0) this.m).j.y = fl2Var;
    }

    public nb0 b() {
        return ((pb0) this.m).j.r;
    }

    public void b0(long j) {
        ((pb0) this.m).j.n = j;
    }

    @Override // defpackage.n83
    public void c(int i, int i2) {
        av0 av0Var = (av0) this.t;
        m50.T(mq2.a(av0Var), null, new zu0(av0Var, (v04) this.a, i, i2, null), 3);
    }

    public void c0(us0 us0Var, int i, int i2, int i3) {
        us0Var.getClass();
        int i4 = us0Var.b0;
        int i5 = us0Var.c0;
        us0Var.b0 = 0;
        us0Var.c0 = 0;
        us0Var.O(i2);
        us0Var.L(i3);
        if (i4 < 0) {
            us0Var.b0 = 0;
        } else {
            us0Var.b0 = i4;
        }
        if (i5 < 0) {
            us0Var.c0 = 0;
        } else {
            us0Var.c0 = i5;
        }
        us0 us0Var2 = (us0) this.m;
        us0Var2.t0 = i;
        us0Var2.U();
    }

    public Typeface d(int i, int i2, um umVar) {
        int resourceId = ((TypedArray) this.t).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.a;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.a = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.m;
        ThreadLocal threadLocal = x74.g;
        if (context.isRestricted()) {
            return null;
        }
        return x74.y(context, resourceId, typedValue2, i2, umVar, true, false);
    }

    public FileOutputStream d0() throws IOException {
        File file = (File) this.a;
        File file2 = (File) this.m;
        if (file2.exists()) {
            U(file2, (File) this.t);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + file, e);
            }
        }
    }

    public boolean e() {
        return !D().g.isEmpty();
    }

    public void e0() {
        synchronized (this) {
            ((AtomicInteger) this.t).decrementAndGet();
            if (((AtomicInteger) this.t).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public int f() {
        if (D().g.isEmpty()) {
            return -1;
        }
        long j = ((long) ((w33) cj0.j0(D().g)).g) - ((long) D().j);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public void f0() {
        hb3 hb3Var = (hb3) this.t;
        String str = (String) this.a;
        List list = (List) hb3Var.q(str);
        if (list != null) {
            list.remove((my1) this.m);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        hb3Var.c(str, list);
    }

    public void g(um2 um2Var, lg2 lg2Var) {
        y22 y22Var = (y22) this.t;
        y22 y22Var2 = (y22) this.a;
        y22 y22Var3 = (y22) this.m;
        int iOrdinal = lg2Var.ordinal();
        if (iOrdinal == 0) {
            y22Var.g(um2Var);
            y22Var3.g(um2Var);
            return;
        }
        if (iOrdinal == 1) {
            y22Var2.g(um2Var);
            y22Var3.g(um2Var);
            return;
        }
        if (iOrdinal == 2) {
            if (um2Var.i != null) {
                y22Var3.g(um2Var);
                return;
            } else {
                y22Var.g(um2Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            uo1.g();
        } else if (um2Var.i != null) {
            y22Var3.g(um2Var);
        } else {
            y22Var2.g(um2Var);
        }
    }

    public void g0(us0 us0Var) {
        ArrayList arrayList = (ArrayList) this.t;
        arrayList.clear();
        int size = us0Var.q0.size();
        for (int i = 0; i < size; i++) {
            ts0 ts0Var = (ts0) us0Var.q0.get(i);
            int[] iArr = ts0Var.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(ts0Var);
            }
        }
        us0Var.s0.g = true;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.t;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : k33.J((Context) this.m, resourceId);
    }

    public Object i() {
        long j = zq2.j();
        if (j == c95.g) {
            return this.m;
        }
        y85 y85Var = (y85) ((AtomicReference) this.t).get();
        int iG = y85Var.g(j);
        if (iG >= 0) {
            return y85Var.r[iG];
        }
        return null;
    }

    public cv j() {
        String strConcat = ((String) this.t) == null ? " backendName" : "";
        if (((xx3) this.m) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new cv((String) this.t, (byte[]) this.a, (xx3) this.m);
        }
        l0.z("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.n83
    public void k(byte b, boolean z) {
        av0 av0Var = (av0) this.t;
        m50.T(mq2.a(av0Var), null, new yu0(av0Var, b, z, null, (byte) 0), 3);
    }

    @Override // defpackage.ys4
    public float l(float f) {
        q8 q8Var = (q8) this.t;
        float fV = q8Var.v();
        Object objP = og0.p(q8Var.y(), fV, f, (xy1) this.a, (j7) this.m);
        if (!((Boolean) q8Var.g.a(objP)).booleanValue()) {
            objP = q8Var.j.getValue();
        }
        return q8Var.y().r(objP) - fV;
    }

    @Override // defpackage.ys4
    public float n(float f, float f2) {
        return 0.0f;
    }

    public Drawable o(int i) {
        int resourceId;
        Drawable drawableN;
        if (!((TypedArray) this.t).hasValue(i) || (resourceId = ((TypedArray) this.t).getResourceId(i, 0)) == 0) {
            return null;
        }
        wl wlVarG = wl.g();
        Context context = (Context) this.m;
        synchronized (wlVarG) {
            drawableN = wlVarG.g.n(context, resourceId, true);
        }
        return drawableN;
    }

    @Override // defpackage.n83
    public void p(int i, int i2) {
        av0 av0Var = (av0) this.t;
        m50.T(mq2.a(av0Var), null, new j40(av0Var, i, i2, null, (byte) 1), 3);
    }

    public void q(Bundle bundle) {
        HashSet hashSet = (HashSet) this.a;
        String string = ((Context) this.m).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (ic2.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    w((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new il0(e);
            }
        }
    }

    @Override // defpackage.n83
    public void r() {
        System.currentTimeMillis();
    }

    public ColorStateList s(int i) {
        int resourceId;
        ColorStateList colorStateListR;
        TypedArray typedArray = (TypedArray) this.t;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListR = ue5.R((Context) this.m, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListR;
    }

    public boolean t(um2 um2Var) {
        return !(um2Var.i == null) && (((fu4) ((y22) this.t).t).contains(um2Var) || ((fu4) ((y22) this.a).t).contains(um2Var));
    }

    public String toString() {
        switch (this.j) {
            case 19:
                String str = (String) this.m;
                String str2 = (String) this.a;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.t;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public tx2 u() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((l76) this.m)) {
            try {
                tx2 tx2Var = (tx2) this.a;
                if (tx2Var != null && localeList == ((LocaleList) this.t)) {
                    return tx2Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new sx2(localeList.get(i)));
                }
                tx2 tx2Var2 = new tx2(arrayList);
                this.t = localeList;
                this.a = tx2Var2;
                return tx2Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n83
    public void v(boolean z) {
        ((av0) this.t).o0 = z;
    }

    public Object w(Class cls, HashSet hashSet) {
        Object objY;
        HashMap map = (HashMap) this.t;
        if (lr2.f()) {
            try {
                lr2.w(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objY = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                ic2 ic2Var = (ic2) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listG = ic2Var.g();
                if (!listG.isEmpty()) {
                    for (Class cls2 : listG) {
                        if (!map.containsKey(cls2)) {
                            w(cls2, hashSet);
                        }
                    }
                }
                objY = ic2Var.y((Context) this.m);
                hashSet.remove(cls);
                map.put(cls, objY);
            } catch (Throwable th2) {
                throw new il0(th2);
            }
        }
        Trace.endSection();
        return objY;
    }

    @Override // defpackage.n83
    public void x() {
        av0 av0Var = (av0) this.t;
        if (Build.VERSION.SDK_INT >= 26) {
            if (av0Var.X()) {
                ((bv0) this.m).j.requestPointerCapture();
            } else {
                av0Var.S().l(Integer.valueOf(R.string.premium_message_external_mouse_support), "external_mouse_click");
            }
        }
    }

    public boolean y() {
        synchronized (this) {
            if (((AtomicBoolean) this.a).get()) {
                return false;
            }
            ((AtomicInteger) this.t).incrementAndGet();
            return true;
        }
    }

    public j51 z() {
        return ((pb0) this.m).j.g;
    }

    public /* synthetic */ ro(Context context, Object obj, Object obj2, byte b) {
        this.j = b;
        this.m = context;
        this.t = obj;
        this.a = obj2;
    }

    public /* synthetic */ ro(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }

    public ro(v34 v34Var) {
        this.j = (byte) 20;
        this.t = new bs(0);
        this.a = new rv((byte) 0);
        this.m = new rg((Object) this, (Object) v34Var, (byte) 21);
    }

    public ro(WorkDatabase_Impl workDatabase_Impl) {
        this.j = (byte) 26;
        this.t = workDatabase_Impl;
        this.a = new mw3(workDatabase_Impl, (byte) 1);
        this.m = new a15(workDatabase_Impl, (byte) 0);
    }

    public ro(nu2 nu2Var) {
        this.j = (byte) 24;
        this.t = new ju2(nu2Var, true);
        this.a = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ ro(byte b, boolean z) {
        this.j = b;
    }

    public ro(w9 w9Var) {
        this.j = (byte) 9;
        this.t = new AtomicInteger(0);
        this.a = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
    }

    public ro(View view) {
        this.j = (byte) 15;
        this.t = view;
        this.a = v13.u(bt2.t, new gf((Object) this, (byte) 13));
        this.m = new jy3(view);
    }

    public ro(File file) {
        this.j = (byte) 4;
        this.t = file;
        this.a = new File(file.getPath() + ".new");
        this.m = new File(file.getPath() + ".bak");
    }

    public ro(to3 to3Var) {
        this.j = (byte) 21;
        this.t = to3Var;
    }

    public ro(Context context, TypedArray typedArray) {
        this.j = (byte) 27;
        this.m = context;
        this.t = typedArray;
    }

    public ro(pb0 pb0Var) {
        this.j = (byte) 8;
        this.m = pb0Var;
        this.t = new y22((Object) this, (byte) 10);
    }

    public ro(Runnable runnable) {
        this.j = (byte) 18;
        this.m = new CopyOnWriteArrayList();
        this.t = new HashMap();
        this.a = runnable;
    }

    public ro(Context context) {
        this.j = (byte) 0;
        this.m = context.getApplicationContext();
        this.a = new HashSet();
        this.t = new HashMap();
    }

    public ro(us0 us0Var) {
        this.j = (byte) 6;
        this.t = new ArrayList();
        this.a = new vy();
        this.m = us0Var;
    }

    public ro(kb5 kb5Var, hi0 hi0Var, v11 v11Var, Set set) {
        this.j = (byte) 13;
        this.t = hi0Var;
        this.a = kb5Var;
        this.m = v11Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            R(str, 0, str.length(), 1, true, new at0(str, (byte) 1));
        }
    }
}
