package defpackage;

import android.app.Notification;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.work.OverwritingInputMerger;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class q70 implements vt4, yc2, mq, xj3 {
    public static q70 q;
    public Object a;
    public final /* synthetic */ byte j;
    public Object m;
    public Object t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context, android.content.res.Resources] */
    public q70(xh3 xh3Var) {
        Notification.Builder builderG;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        this.j = (byte) 6;
        this.m = new Bundle();
        this.a = xh3Var;
        Context context = xh3Var.g;
        ArrayList arrayList3 = xh3Var.b;
        ArrayList arrayList4 = xh3Var.r;
        ArrayList arrayList5 = xh3Var.n;
        if (Build.VERSION.SDK_INT >= 26) {
            builderG = tm.g(context, xh3Var.w);
            this.t = builderG;
        } else {
            Notification.Builder builder = new Notification.Builder(context);
            this.t = builder;
            builderG = builder;
        }
        Notification notification = xh3Var.i;
        ?? r10 = 0;
        builderG.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(xh3Var.v).setContentText(xh3Var.x).setContentInfo(null).setContentIntent(xh3Var.l).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        builderG.setLargeIcon((Icon) null);
        builderG.setSubText(null).setUsesChronometer(false).setPriority(xh3Var.j);
        ArrayList arrayList6 = xh3Var.y;
        int size = arrayList6.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList6.get(i3);
            i3++;
            vh3 vh3Var = (vh3) obj;
            IconCompat iconCompatN = vh3Var.y;
            if (iconCompatN == null && (i2 = vh3Var.n) != 0) {
                iconCompatN = IconCompat.n(r10, "", i2);
                vh3Var.y = iconCompatN;
            }
            Bundle bundle = vh3Var.g;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompatN != null ? gh6.v(iconCompatN, r10) : r10, vh3Var.v, vh3Var.x);
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("android.support.allowGeneratedReplies", true);
            builder2.setAllowGeneratedReplies(true);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                ym.w(builder2);
            }
            if (i4 >= 29) {
                sj.s(builder2);
            }
            if (i4 >= 31) {
                wa.t(builder2);
            }
            if (i4 >= 37) {
                da.g(builder2);
                da.r(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", vh3Var.r);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.t).addAction(builder2.build());
            r10 = 0;
        }
        Bundle bundle3 = xh3Var.q;
        if (bundle3 != null) {
            ((Bundle) this.m).putAll(bundle3);
        }
        ((Notification.Builder) this.t).setShowWhen(xh3Var.t);
        ((Notification.Builder) this.t).setLocalOnly(xh3Var.m);
        ((Notification.Builder) this.t).setGroup(null);
        ((Notification.Builder) this.t).setSortKey(null);
        ((Notification.Builder) this.t).setGroupSummary(false);
        ((Notification.Builder) this.t).setCategory(null);
        ((Notification.Builder) this.t).setColor(0);
        ((Notification.Builder) this.t).setVisibility(0);
        ((Notification.Builder) this.t).setPublicVersion(null);
        ((Notification.Builder) this.t).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    uo1.B();
                    throw null;
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    or orVar = new or(arrayList3.size() + arrayList2.size());
                    orVar.addAll(arrayList2);
                    orVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(orVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList3.get(i5);
                i5++;
                ((Notification.Builder) this.t).addPerson((String) obj2);
            }
        }
        if (arrayList5.size() > 0) {
            Bundle bundle4 = xh3Var.q;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                xh3Var.q = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList5.size()) {
                String string = Integer.toString(i6);
                vh3 vh3Var2 = (vh3) arrayList5.get(i6);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompatN2 = vh3Var2.y;
                if (iconCompatN2 == null && (i = vh3Var2.n) != 0) {
                    iconCompatN2 = IconCompat.n(null, "", i);
                    vh3Var2.y = iconCompatN2;
                }
                Bundle bundle9 = vh3Var2.g;
                bundle8.putInt("icon", iconCompatN2 != null ? iconCompatN2.x() : 0);
                bundle8.putCharSequence("title", vh3Var2.v);
                bundle8.putParcelable("actionIntent", vh3Var2.x);
                Bundle bundle10 = new Bundle(bundle9);
                bundle10.putBoolean("android.support.allowGeneratedReplies", true);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", vh3Var2.r);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i6++;
                arrayList4 = arrayList4;
            }
            arrayList = arrayList4;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle11 = xh3Var.q;
            if (bundle11 == null) {
                bundle11 = new Bundle();
                xh3Var.q = bundle11;
            }
            bundle11.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.m).putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            arrayList = arrayList4;
        }
        ((Notification.Builder) this.t).setExtras(xh3Var.q);
        ((Notification.Builder) this.t).setRemoteInputHistory(null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            tm.q((Notification.Builder) this.t);
            tm.u((Notification.Builder) this.t);
            tm.z((Notification.Builder) this.t);
            tm.h((Notification.Builder) this.t);
            tm.i((Notification.Builder) this.t);
            if (!TextUtils.isEmpty(xh3Var.w)) {
                ((Notification.Builder) this.t).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                uo1.B();
                throw null;
            }
        }
        if (i7 >= 29) {
            sj.i((Notification.Builder) this.t, xh3Var.c);
            sj.b((Notification.Builder) this.t);
        }
        if (i7 >= 36) {
            i2.v((Notification.Builder) this.t);
        }
    }

    public static q70 o(Context context) {
        q70 q70Var = q;
        if (q70Var != null) {
            return q70Var;
        }
        Context applicationContext = context.getApplicationContext();
        q70 q70Var2 = new q70(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        q = q70Var2;
        return q70Var2;
    }

    public void A() {
        ((sr5) this.a).l = 315360000000L;
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((sr5) this.a).l) {
            return;
        }
        l0.u("The given initial delay is too large and will cause an overflow!");
    }

    @Override // defpackage.mq
    public void a(int i, int i2) {
        ga3 ga3Var = (ga3) this.t;
        ga3Var.g(2);
        ga3Var.g(i);
        ga3Var.g(i2);
    }

    @Override // defpackage.vt4
    public bq4 b() {
        return (g34) this.m;
    }

    @Override // defpackage.yc2
    public Uri c() {
        return (Uri) this.m;
    }

    public void d() {
        ((ga3) this.t).g(9);
    }

    public void e(t tVar, i64 i64Var) {
        Exception exc;
        Exception exc2;
        int i;
        ga3 ga3Var = (ga3) this.t;
        int i2 = ga3Var.y;
        xa3 xa3Var = (xa3) this.a;
        xa3 xa3Var2 = new xa3();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (ga3Var.r(i3)) {
                        case 0:
                            tVar.p();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            tVar.r(xa3Var.l(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            tVar.a(ga3Var.r(i5), ga3Var.r(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    tVar.j(ga3Var.r(i5), ga3Var.r(i8), ga3Var.r(i9));
                                } catch (Exception e) {
                                    exc = e;
                                    i3 = i9;
                                    throw new yn0(xa3Var, xa3Var2, ga3Var, i3 - 1, exc);
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            tVar.v();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            tVar.y(ga3Var.r(i5), xa3Var.l(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                tVar.x(ga3Var.r(i5), xa3Var.l(i4));
                                i4 = i;
                            } catch (Exception e3) {
                                exc2 = e3;
                                exc = exc2;
                                throw new yn0(xa3Var, xa3Var2, ga3Var, i3 - 1, exc);
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objL = xa3Var.l(i4);
                            objL.getClass();
                            ue5.f(2, objL);
                            i4 += 2;
                            tVar.i((bz1) objL, xa3Var.l(i10));
                            i3 = i5;
                            break;
                        case 8:
                            Object obj = tVar.t;
                            if (obj instanceof wn0) {
                                wn0 wn0Var = (wn0) obj;
                                if (((rb3) i64Var.v).q(wn0Var)) {
                                    wn0Var.x();
                                }
                            }
                            xa3Var2.g(obj);
                            tVar.n();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Exception e4) {
                    exc2 = e4;
                    i3 = i5;
                    exc = exc2;
                    throw new yn0(xa3Var, xa3Var2, ga3Var, i3 - 1, exc);
                }
            } catch (Throwable th) {
                tVar.l();
                throw th;
            }
        }
        if (i4 != xa3Var.y) {
            qo0.g("Applier operation size mismatch");
        }
        xa3Var.n();
        ga3Var.y = 0;
        tVar.l();
    }

    public Typeface f() {
        Object obj = this.m;
        obj.getClass();
        return (Typeface) obj;
    }

    @Override // defpackage.vt4
    public hu4 g() {
        return (h34) this.a;
    }

    public void h() {
        ArrayList arrayList = (ArrayList) this.t;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j74 j74Var = (j74) obj;
            if (j74Var.r()) {
                j74Var.reset();
            }
        }
    }

    @Override // defpackage.mq
    public void i(bz1 bz1Var, Object obj) {
        ((ga3) this.t).g(7);
        xa3 xa3Var = (xa3) this.a;
        xa3Var.g(bz1Var);
        xa3Var.g(obj);
    }

    @Override // defpackage.mq
    public void j(int i, int i2, int i3) {
        ga3 ga3Var = (ga3) this.t;
        ga3Var.g(3);
        ga3Var.g(i);
        ga3Var.g(i2);
        ga3Var.g(i3);
    }

    public boolean k() {
        if (((bw4) this.t).getValue() != this.m) {
            return true;
        }
        q70 q70Var = (q70) this.a;
        return q70Var != null && q70Var.k();
    }

    @Override // defpackage.yc2
    public Object m() {
        return null;
    }

    @Override // defpackage.mq
    public void n() {
        ((ga3) this.t).g(8);
    }

    @Override // defpackage.mq
    public void p() {
        ((ga3) this.t).g(0);
    }

    @Override // defpackage.yc2
    public Uri q() {
        return (Uri) this.t;
    }

    @Override // defpackage.mq
    public void r(Object obj) {
        ((ga3) this.t).g(1);
        ((xa3) this.a).g(obj);
    }

    @Override // defpackage.xj3
    public void s(nj6 nj6Var) {
        ob4 ob4Var = (ob4) this.t;
        String str = (String) this.a;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.m;
        synchronized (ob4Var.g) {
            ob4Var.g.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.mq
    public Object t() {
        return this.m;
    }

    public String toString() {
        switch (this.j) {
            case 13:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.t);
                sb.append('{');
                cd2 cd2Var = (cd2) ((cd2) this.a).a;
                String str = "";
                while (cd2Var != null) {
                    Object obj = cd2Var.t;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    cd2Var = (cd2) cd2Var.a;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(j74 j74Var) {
        ((ArrayList) this.t).add(j74Var);
    }

    @Override // defpackage.yc2
    public ClipDescription v() {
        return (ClipDescription) this.a;
    }

    @Override // defpackage.mq
    public void x(int i, Object obj) {
        ga3 ga3Var = (ga3) this.t;
        ga3Var.g(6);
        ga3Var.g(i);
        ((xa3) this.a).g(obj);
    }

    @Override // defpackage.mq
    public void y(int i, Object obj) {
        ga3 ga3Var = (ga3) this.t;
        ga3Var.g(5);
        ga3Var.g(i);
        ((xa3) this.a).g(obj);
    }

    public qk3 z() {
        UUID uuid = (UUID) this.t;
        sr5 sr5Var = (sr5) this.a;
        HashSet hashSet = (HashSet) this.m;
        qk3 qk3Var = new qk3();
        qk3Var.g = uuid;
        qk3Var.y = sr5Var;
        qk3Var.r = hashSet;
        vs0 vs0Var = sr5Var.a;
        boolean z = vs0Var.v() || vs0Var.n || vs0Var.y || vs0Var.r;
        sr5 sr5Var2 = (sr5) this.a;
        if (sr5Var2.s) {
            if (z) {
                l0.u("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (sr5Var2.l > 0) {
                l0.u("Expedited jobs cannot be delayed");
                return null;
            }
        }
        this.t = UUID.randomUUID();
        sr5 sr5Var3 = (sr5) this.a;
        sr5 sr5Var4 = new sr5();
        sr5Var4.y = hr5.j;
        qz0 qz0Var = qz0.r;
        sr5Var4.v = qz0Var;
        sr5Var4.x = qz0Var;
        sr5Var4.a = vs0.t;
        sr5Var4.q = 1;
        sr5Var4.w = 30000L;
        sr5Var4.b = -1L;
        sr5Var4.p = 1;
        sr5Var4.g = sr5Var3.g;
        sr5Var4.r = sr5Var3.r;
        sr5Var4.y = sr5Var3.y;
        sr5Var4.n = sr5Var3.n;
        sr5Var4.v = new qz0(sr5Var3.v);
        sr5Var4.x = new qz0(sr5Var3.x);
        sr5Var4.l = sr5Var3.l;
        sr5Var4.j = sr5Var3.j;
        sr5Var4.t = sr5Var3.t;
        vs0 vs0Var2 = sr5Var3.a;
        vs0 vs0Var3 = new vs0();
        vs0Var3.g = 1;
        vs0Var3.x = -1L;
        vs0Var3.l = -1L;
        vs0Var3.j = new du0();
        vs0Var3.y = vs0Var2.y;
        vs0Var3.r = vs0Var2.r;
        vs0Var3.g = vs0Var2.g;
        vs0Var3.n = vs0Var2.n;
        vs0Var3.v = vs0Var2.v;
        vs0Var3.j = vs0Var2.j;
        sr5Var4.a = vs0Var3;
        sr5Var4.m = sr5Var3.m;
        sr5Var4.q = sr5Var3.q;
        sr5Var4.w = sr5Var3.w;
        sr5Var4.c = sr5Var3.c;
        sr5Var4.i = sr5Var3.i;
        sr5Var4.b = sr5Var3.b;
        sr5Var4.s = sr5Var3.s;
        sr5Var4.p = sr5Var3.p;
        this.a = sr5Var4;
        sr5Var4.g = ((UUID) this.t).toString();
        return qk3Var;
    }

    @Override // defpackage.yc2
    public void w() {
    }

    public /* synthetic */ q70(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }

    public q70(String str) {
        this.j = (byte) 13;
        cd2 cd2Var = new cd2((byte) 29, false);
        this.a = cd2Var;
        this.m = cd2Var;
        this.t = str;
    }

    public q70(ty tyVar) {
        this.j = (byte) 0;
        this.t = tyVar;
        j31 j31Var = (j31) tyVar.m;
        j31Var.getClass();
        this.a = new h34(j31Var);
        i31 i31Var = (i31) tyVar.q;
        i31Var.getClass();
        this.m = new g34(i31Var);
    }

    public q70(byte b) {
        this.j = b;
        switch (b) {
            case 10:
                this.t = new kz2(8);
                break;
            default:
                this.t = new ArrayList();
                byte b2 = 1;
                this.a = new sg2(this, b2);
                this.m = new rl2(this, b2);
                break;
        }
    }

    public /* synthetic */ q70(byte b, boolean z) {
        this.j = b;
    }

    public q70(Context context, LocationManager locationManager) {
        this.j = (byte) 11;
        this.m = new se5();
        this.t = context;
        this.a = locationManager;
    }

    public q70(Context context) {
        this.j = (byte) 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(mq2.o(R.attr.materialCalendarStyle, context, u23.class.getCanonicalName()).data, p24.p);
        this.t = fa4.p(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        fa4.p(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        fa4.p(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        fa4.p(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListB = zq2.b(context, typedArrayObtainStyledAttributes, 7);
        this.a = fa4.p(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        fa4.p(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.m = fa4.p(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListB.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public q70(Class cls) {
        this.j = (byte) 7;
        HashSet hashSet = new HashSet();
        this.m = hashSet;
        this.t = UUID.randomUUID();
        this.a = new sr5(((UUID) this.t).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((sr5) this.a).n = OverwritingInputMerger.class.getName();
    }

    public q70(kf5 kf5Var, q70 q70Var) {
        this.j = (byte) 12;
        this.t = kf5Var;
        this.a = q70Var;
        this.m = kf5Var.getValue();
    }

    public q70(Object obj) {
        this.j = (byte) 8;
        this.t = new ga3();
        this.a = new xa3();
        this.m = obj;
    }
}
