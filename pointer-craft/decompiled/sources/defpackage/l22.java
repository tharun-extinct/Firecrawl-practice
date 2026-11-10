package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l22 extends AppWidgetProvider {
    public final x21 g = na1.g;

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005a -> B:19:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(defpackage.ox0 r6, android.content.Context r7, int[] r8, defpackage.ou0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.i22
            if (r0 == 0) goto L13
            r0 = r9
            i22 r0 = (defpackage.i22) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            i22 r0 = new i22
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.i
            int r1 = r0.s
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            int r6 = r0.c
            int r7 = r0.w
            int[] r8 = r0.q
            android.content.Context r1 = r0.m
            defpackage.js2.o(r9)
            r9 = r8
            r8 = r1
            goto L5d
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r5)
            r5 = 0
            return r5
        L36:
            defpackage.js2.o(r9)
            r5.x(r6, r7)
            int r6 = r8.length
            r9 = 0
            r4 = r8
            r8 = r7
            r7 = r9
            r9 = r4
        L42:
            if (r7 >= r6) goto L5f
            r1 = r9[r7]
            w12 r3 = r5.v()
            r0.m = r8
            r0.q = r9
            r0.w = r7
            r0.c = r6
            r0.s = r2
            java.lang.Object r1 = r3.g(r8, r1, r0)
            px0 r3 = defpackage.px0.j
            if (r1 != r3) goto L5d
            return r3
        L5d:
            int r7 = r7 + r2
            goto L42
        L5f:
            og5 r5 = defpackage.og5.g
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l22.g(ox0, android.content.Context, int[], ou0):java.lang.Object");
    }

    public final Object n(ox0 ox0Var, Context context, int[] iArr, zz4 zz4Var) throws Throwable {
        x(ox0Var, context);
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            r10 r10Var = new r10(this, context, i, null);
            e h41Var = new h41(yf2.R(ox0Var, ni1.j));
            h41Var.t0(rx0.j, h41Var, r10Var);
            arrayList.add(h41Var);
        }
        Object objG = ry5.g(arrayList, zz4Var);
        return objG == px0.j ? objG : og5.g;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        if (fg6.n(context, new h22(this, i, bundle, (byte) 1))) {
            return;
        }
        wd6.y(this, this.g, new j22(this, context, i, bundle, null, (byte) 0));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        if (fg6.n(context, new g22(this, iArr, (byte) 0))) {
            return;
        }
        wd6.y(this, this.g, new k22(this, context, iArr, null, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c A[Catch: all -> 0x00b3, CancellationException -> 0x00bc, TryCatch #2 {CancellationException -> 0x00bc, all -> 0x00b3, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0054, B:24:0x005b, B:25:0x005c, B:26:0x0063, B:27:0x0064, B:43:0x00af, B:33:0x007a, B:35:0x008c, B:37:0x0097, B:39:0x00a3, B:38:0x009f, B:41:0x00a7, B:42:0x00ae, B:30:0x006f), top: B:49:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[Catch: all -> 0x00b3, CancellationException -> 0x00bc, TryCatch #2 {CancellationException -> 0x00bc, all -> 0x00b3, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0054, B:24:0x005b, B:25:0x005c, B:26:0x0063, B:27:0x0064, B:43:0x00af, B:33:0x007a, B:35:0x008c, B:37:0x0097, B:39:0x00a3, B:38:0x009f, B:41:0x00a7, B:42:0x00ae, B:30:0x006f), top: B:49:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009f A[Catch: all -> 0x00b3, CancellationException -> 0x00bc, TryCatch #2 {CancellationException -> 0x00bc, all -> 0x00b3, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0054, B:24:0x005b, B:25:0x005c, B:26:0x0063, B:27:0x0064, B:43:0x00af, B:33:0x007a, B:35:0x008c, B:37:0x0097, B:39:0x00a3, B:38:0x009f, B:41:0x00a7, B:42:0x00ae, B:30:0x006f), top: B:49:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: all -> 0x00b3, CancellationException -> 0x00bc, TryCatch #2 {CancellationException -> 0x00bc, all -> 0x00b3, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0054, B:24:0x005b, B:25:0x005c, B:26:0x0063, B:27:0x0064, B:43:0x00af, B:33:0x007a, B:35:0x008c, B:37:0x0097, B:39:0x00a3, B:38:0x009f, B:41:0x00a7, B:42:0x00ae, B:30:0x006f), top: B:49:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l22 l22Var;
        Context context2;
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            if (action == null) {
                l22Var = this;
                context2 = context;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -19011148) {
                    l22Var = this;
                    context2 = context;
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = l22Var.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        appWidgetIds.getClass();
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    l22Var.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 649033583) {
                    l22Var = this;
                    context2 = context;
                    if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = l22Var.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        appWidgetIds.getClass();
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    l22Var.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                    String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                    if (stringExtra == null) {
                        throw new IllegalStateException("Intent is missing ActionKey extra");
                    }
                    int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                    if (intExtra == -1) {
                        throw new IllegalStateException("Intent is missing AppWidgetId extra");
                    }
                    if (fg6.n(context, new h22(this, intExtra, stringExtra, (byte) 0))) {
                        return;
                    }
                    wd6.y(this, this.g, new j22(this, context, intExtra, stringExtra, null, (byte) 1));
                    return;
                }
                l22Var = this;
                context2 = context;
            }
            super.onReceive(context2, intent);
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (fg6.n(context, new g22(this, iArr, (byte) 1))) {
            return;
        }
        wd6.y(this, this.g, new k22(this, context, iArr, null, (byte) 1));
    }

    public final Object r(ox0 ox0Var, Context context, int i, Bundle bundle, zz4 zz4Var) {
        x(ox0Var, context);
        w12 w12VarV = v();
        w12VarV.getClass();
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        Object objY = w12VarV.y(context, new tp(i), bundle, new u12(bundle, null, (byte) 0), zz4Var);
        if (objY != px0Var) {
            objY = og5Var;
        }
        return objY == px0Var ? objY : og5Var;
    }

    public abstract w12 v();

    public final void x(ox0 ox0Var, Context context) {
        m50.T(ox0Var, null, new s12(context, this, null, (byte) 1), 3);
    }

    public final Object y(ox0 ox0Var, Context context, int i, String str, zz4 zz4Var) {
        x(ox0Var, context);
        w12 w12VarV = v();
        w12VarV.getClass();
        Object objY = w12VarV.y(context, new tp(i), null, new u12(str, null, (byte) 1), zz4Var);
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        if (objY != px0Var) {
            objY = og5Var;
        }
        return objY == px0Var ? objY : og5Var;
    }
}
