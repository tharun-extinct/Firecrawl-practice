package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e62 extends nu2 {
    public static boolean G;
    public final o05 A;
    public volatile boolean F;
    public rv a;
    public BluetoothDevice b;
    public x30 c;
    public boolean d;
    public boolean e;
    public PowerManager.WakeLock f;
    public final o05 h;
    public boolean k;
    public final o05 m;
    public final o05 o;
    public final o05 q;
    public final o05 w;
    public final a62 t = new a62(this);
    public final c62 i = new c62(this);
    public final ConcurrentHashMap s = new ConcurrentHashMap();
    public ex4 p = dx4.y;
    public de4 u = de4.j;
    public final jy2 z = new jy2();
    public int B = R.string.notification_title;
    public int C = R.string.notification_text;
    public jd2 D = jd2.j;
    public final Object E = new Object();

    public e62() {
        final byte b = 3;
        this.m = new o05(new my1(this) { // from class: z52
            public final /* synthetic */ e62 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b2 = b;
                e62 e62Var = this.t;
                switch (b2) {
                    case 0:
                        return e62Var.getSharedPreferences("paired_devices", 0);
                    case 1:
                        return e62Var.getSharedPreferences("device_names", 0);
                    case 2:
                        return (NotificationManager) e62Var.getSystemService(NotificationManager.class);
                    case 3:
                        Object systemService = e62Var.getSystemService((Class<Object>) BluetoothManager.class);
                        systemService.getClass();
                        return (BluetoothManager) systemService;
                    case 4:
                        return e62Var.b().getAdapter();
                    default:
                        Context applicationContext = e62Var.getApplicationContext();
                        applicationContext.getClass();
                        return pw5.N(a11.v(new zh(e62Var.i(), applicationContext, null, (byte) 2)), mq2.a(e62Var), new sv4(5000L, Long.MAX_VALUE), s30.j);
                }
            }
        });
        final byte b2 = 4;
        this.q = new o05(new my1(this) { // from class: z52
            public final /* synthetic */ e62 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                e62 e62Var = this.t;
                switch (b3) {
                    case 0:
                        return e62Var.getSharedPreferences("paired_devices", 0);
                    case 1:
                        return e62Var.getSharedPreferences("device_names", 0);
                    case 2:
                        return (NotificationManager) e62Var.getSystemService(NotificationManager.class);
                    case 3:
                        Object systemService = e62Var.getSystemService((Class<Object>) BluetoothManager.class);
                        systemService.getClass();
                        return (BluetoothManager) systemService;
                    case 4:
                        return e62Var.b().getAdapter();
                    default:
                        Context applicationContext = e62Var.getApplicationContext();
                        applicationContext.getClass();
                        return pw5.N(a11.v(new zh(e62Var.i(), applicationContext, null, (byte) 2)), mq2.a(e62Var), new sv4(5000L, Long.MAX_VALUE), s30.j);
                }
            }
        });
        final byte b3 = 5;
        this.w = new o05(new my1(this) { // from class: z52
            public final /* synthetic */ e62 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b4 = b3;
                e62 e62Var = this.t;
                switch (b4) {
                    case 0:
                        return e62Var.getSharedPreferences("paired_devices", 0);
                    case 1:
                        return e62Var.getSharedPreferences("device_names", 0);
                    case 2:
                        return (NotificationManager) e62Var.getSystemService(NotificationManager.class);
                    case 3:
                        Object systemService = e62Var.getSystemService((Class<Object>) BluetoothManager.class);
                        systemService.getClass();
                        return (BluetoothManager) systemService;
                    case 4:
                        return e62Var.b().getAdapter();
                    default:
                        Context applicationContext = e62Var.getApplicationContext();
                        applicationContext.getClass();
                        return pw5.N(a11.v(new zh(e62Var.i(), applicationContext, null, (byte) 2)), mq2.a(e62Var), new sv4(5000L, Long.MAX_VALUE), s30.j);
                }
            }
        });
        final byte b4 = 0;
        this.h = new o05(new my1(this) { // from class: z52
            public final /* synthetic */ e62 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b5 = b4;
                e62 e62Var = this.t;
                switch (b5) {
                    case 0:
                        return e62Var.getSharedPreferences("paired_devices", 0);
                    case 1:
                        return e62Var.getSharedPreferences("device_names", 0);
                    case 2:
                        return (NotificationManager) e62Var.getSystemService(NotificationManager.class);
                    case 3:
                        Object systemService = e62Var.getSystemService((Class<Object>) BluetoothManager.class);
                        systemService.getClass();
                        return (BluetoothManager) systemService;
                    case 4:
                        return e62Var.b().getAdapter();
                    default:
                        Context applicationContext = e62Var.getApplicationContext();
                        applicationContext.getClass();
                        return pw5.N(a11.v(new zh(e62Var.i(), applicationContext, null, (byte) 2)), mq2.a(e62Var), new sv4(5000L, Long.MAX_VALUE), s30.j);
                }
            }
        });
        final byte b5 = 1;
        this.o = new o05(new my1(this) { // from class: z52
            public final /* synthetic */ e62 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b6 = b5;
                e62 e62Var = this.t;
                switch (b6) {
                    case 0:
                        return e62Var.getSharedPreferences("paired_devices", 0);
                    case 1:
                        return e62Var.getSharedPreferences("device_names", 0);
                    case 2:
                        return (NotificationManager) e62Var.getSystemService(NotificationManager.class);
                    case 3:
                        Object systemService = e62Var.getSystemService((Class<Object>) BluetoothManager.class);
                        systemService.getClass();
                        return (BluetoothManager) systemService;
                    case 4:
                        return e62Var.b().getAdapter();
                    default:
                        Context applicationContext = e62Var.getApplicationContext();
                        applicationContext.getClass();
                        return pw5.N(a11.v(new zh(e62Var.i(), applicationContext, null, (byte) 2)), mq2.a(e62Var), new sv4(5000L, Long.MAX_VALUE), s30.j);
                }
            }
        });
        final byte b6 = 2;
        this.A = new o05(new my1(this) { // from class: z52
            public final /* synthetic */ e62 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b7 = b6;
                e62 e62Var = this.t;
                switch (b7) {
                    case 0:
                        return e62Var.getSharedPreferences("paired_devices", 0);
                    case 1:
                        return e62Var.getSharedPreferences("device_names", 0);
                    case 2:
                        return (NotificationManager) e62Var.getSystemService(NotificationManager.class);
                    case 3:
                        Object systemService = e62Var.getSystemService((Class<Object>) BluetoothManager.class);
                        systemService.getClass();
                        return (BluetoothManager) systemService;
                    case 4:
                        return e62Var.b().getAdapter();
                    default:
                        Context applicationContext = e62Var.getApplicationContext();
                        applicationContext.getClass();
                        return pw5.N(a11.v(new zh(e62Var.i(), applicationContext, null, (byte) 2)), mq2.a(e62Var), new sv4(5000L, Long.MAX_VALUE), s30.j);
                }
            }
        });
        new t30(this, b2);
    }

    public final void A(ok4 ok4Var) {
        cx4 cx4Var = new cx4(ok4Var);
        this.z.y(ok4Var.name() + "(" + ok4Var.ordinal() + ")", "error");
        this.p = cx4Var;
        rv rvVar = this.a;
        if (rvVar != null) {
            ((ew4) rvVar.m).m(null, cx4Var);
        }
    }

    public final void B(String str) {
        getSharedPreferences("server_settings", 0).edit().putString("last_used_device", str).apply();
    }

    public final void C(ex4 ex4Var) {
        if (yf2.p(this.p, ex4Var)) {
            return;
        }
        this.p = ex4Var;
        rv rvVar = this.a;
        if (rvVar != null) {
            ((ew4) rvVar.m).m(null, ex4Var);
        }
    }

    public final void D() {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            al0.t();
            NotificationChannel notificationChannelG = al0.g();
            notificationChannelG.setShowBadge(false);
            notificationChannelG.setLockscreenVisibility(1);
            notificationChannelG.setSound(null, null);
            NotificationManager notificationManager = (NotificationManager) this.A.getValue();
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelG);
            }
        }
        jy2 jy2Var = this.z;
        try {
            if (i >= 29) {
                startForeground(1000, l(), 16);
            } else {
                startForeground(1000, l());
            }
            if (!this.d) {
                jy2Var.y("foreground", "service");
            }
            z = true;
        } catch (Exception e) {
            jy2Var.y("foregroundDenied(" + e.getClass().getSimpleName() + ")", "service");
            z = false;
        }
        this.d = z;
        this.e = !z;
        G();
    }

    public final void E() {
        stopForeground(true);
        if (this.d) {
            this.z.y("notification dropped", "service");
        }
        this.d = false;
        this.e = false;
        G();
    }

    public final void F(BluetoothDevice bluetoothDevice, xy1 xy1Var) {
        rv rvVar;
        synchronized (this.E) {
            g61 g61Var = (g61) xy1Var.a(u(bluetoothDevice));
            String str = "acl:" + g61Var.q + ", connectionState:" + g61Var.w + ", profileState:" + g61Var.c + " " + g61Var.n();
            jy2 jy2Var = this.z;
            jy2Var.getClass();
            jy2Var.y(str, "<" + g61Var.t.substring(15) + ">");
            this.s.put(g61Var.t, g61Var);
            d();
            BluetoothDevice bluetoothDevice2 = this.b;
            if (yf2.p(bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null, g61Var.t) && (rvVar = this.a) != null) {
                ((ew4) rvVar.j).a(g61.r(g61Var, null, 0, 0, 0, 0, false, 0, 0, 0L, 0L, false, false, false, 131071));
            }
        }
    }

    public final void G() {
        boolean z = this.d;
        jy2 jy2Var = this.z;
        if (!z || !this.k) {
            PowerManager.WakeLock wakeLock = this.f;
            if (wakeLock == null || !wakeLock.isHeld()) {
                return;
            }
            jy2Var.y("release", "wakelock");
            PowerManager.WakeLock wakeLock2 = this.f;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
            this.f = null;
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = this.f;
        if (wakeLockNewWakeLock == null) {
            Object systemService = getSystemService((Class<Object>) PowerManager.class);
            systemService.getClass();
            wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "blehid::DeviceConnected");
            wakeLockNewWakeLock.setReferenceCounted(false);
            this.f = wakeLockNewWakeLock;
        }
        if (wakeLockNewWakeLock == null || wakeLockNewWakeLock.isHeld()) {
            return;
        }
        jy2Var.y("acquire", "wakelock");
        PowerManager.WakeLock wakeLock3 = this.f;
        if (wakeLock3 != null) {
            wakeLock3.acquire();
        }
    }

    public final BluetoothManager b() {
        return (BluetoothManager) this.m.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(e40 e40Var, Bundle bundle, ou0 ou0Var) {
        b62 b62Var;
        ArrayList parcelableArrayList;
        Iterator it;
        e40 e40Var2;
        if (ou0Var instanceof b62) {
            b62Var = (b62) ou0Var;
            int i = b62Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                b62Var.i = i - Integer.MIN_VALUE;
            } else {
                b62Var = new b62(this, ou0Var);
            }
        } else {
            b62Var = new b62(this, ou0Var);
        }
        Object obj = b62Var.w;
        int i2 = b62Var.i;
        og5 og5Var = og5.g;
        if (i2 == 0) {
            js2.o(obj);
            if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("functionCalls")) != null) {
                Iterator it2 = parcelableArrayList.iterator();
                it2.getClass();
                it = it2;
                e40Var2 = e40Var;
            }
            return og5Var;
        }
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        it = b62Var.q;
        e40 e40Var3 = b62Var.m;
        js2.o(obj);
        e40Var2 = e40Var3;
        while (it.hasNext()) {
            mz1 mz1Var = (mz1) it.next();
            Bundle bundleR = mz1Var.r();
            int iOrdinal = mz1Var.n().ordinal();
            px0 px0Var = px0.j;
            if (iOrdinal == 0) {
                int i3 = bundleR.getInt("modifierCode");
                int i4 = bundleR.getInt("keyCode");
                boolean z = bundleR.getBoolean("down");
                b62Var.m = e40Var2;
                b62Var.q = it;
                b62Var.i = 1;
                if (e40Var2.n(i3, i4, z, b62Var) == px0Var) {
                    return px0Var;
                }
            } else if (iOrdinal == 1) {
                int i5 = bundleR.getInt("mediaKey");
                boolean z2 = bundleR.getBoolean("down");
                b62Var.m = e40Var2;
                b62Var.q = it;
                b62Var.i = 2;
                Object objF0 = m50.f0(e40Var2.g, new d40(z2, e40Var2, i5, (mu0) null), b62Var);
                if (objF0 != px0Var) {
                    objF0 = og5Var;
                }
                if (objF0 == px0Var) {
                    return px0Var;
                }
            } else if (iOrdinal == 2) {
                List integerArrayList = bundleR.getIntegerArrayList("keystrokes");
                if (integerArrayList == null) {
                    integerArrayList = pi1.j;
                }
                b62Var.m = e40Var2;
                b62Var.q = it;
                b62Var.i = 3;
                Object objF1 = m50.f0(e40Var2.g, new c40(integerArrayList, e40Var2, null), b62Var);
                if (objF1 != px0Var) {
                    objF1 = og5Var;
                }
                if (objF1 == px0Var) {
                    return px0Var;
                }
            } else {
                if (iOrdinal != 3) {
                    uo1.g();
                    return null;
                }
                long j = bundleR.getLong("milliseconds");
                b62Var.m = e40Var2;
                b62Var.q = it;
                b62Var.i = 4;
                if (yf2.e(j, b62Var) == px0Var) {
                    return px0Var;
                }
            }
        }
        return og5Var;
    }

    public final void d() {
        ConcurrentHashMap concurrentHashMap = this.s;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((g61) ((Map.Entry) it.next()).getValue());
        }
        xt2 xt2VarA = mq2.a(this);
        x21 x21Var = na1.g;
        m50.T(xt2VarA, c21.a, new ko(this, arrayList, null, (byte) 9), 2);
    }

    public final void e(BluetoothDevice bluetoothDevice) {
        bluetoothDevice.getClass();
        this.z.g(bluetoothDevice, "setActive");
        this.b = bluetoothDevice;
        g61 g61VarU = u(bluetoothDevice);
        rv rvVar = this.a;
        if (rvVar != null) {
            ((ew4) rvVar.j).a(g61.r(g61VarU, null, 0, 0, 0, 0, false, 0, 0, 0L, 0L, false, false, false, 131071));
        }
    }

    public abstract void f(boolean z);

    public abstract void g(String str);

    public final BluetoothAdapter i() {
        return (BluetoothAdapter) this.q.getValue();
    }

    public abstract void j(String str);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r13 == r9) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ou0 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.d62
            if (r0 == 0) goto L13
            r0 = r13
            d62 r0 = (defpackage.d62) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            d62 r0 = new d62
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.m
            int r1 = r0.w
            r2 = 0
            o05 r3 = r12.w
            jy2 r4 = r12.z
            java.lang.String r5 = ")"
            java.lang.String r6 = "bt"
            r7 = 2
            r8 = 1
            px0 r9 = defpackage.px0.j
            if (r1 == 0) goto L3d
            if (r1 == r8) goto L39
            if (r1 != r7) goto L33
            defpackage.js2.o(r13)
            goto L99
        L33:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r12)
            return r2
        L39:
            defpackage.js2.o(r13)
            goto L5d
        L3d:
            defpackage.js2.o(r13)
            r12.t()
            java.lang.Object r13 = r3.getValue()
            cw4 r13 = (defpackage.cw4) r13
            r0.w = r8
            x21 r1 = defpackage.na1.g
            c21 r1 = defpackage.c21.a
            u30 r10 = new u30
            s30 r11 = defpackage.s30.t
            r10.<init>(r13, r11, r2, r8)
            java.lang.Object r13 = defpackage.m50.f0(r1, r10, r0)
            if (r13 != r9) goto L5d
            goto L98
        L5d:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r10 = "restartDisable("
            r1.<init>(r10)
            r1.append(r13)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r4.y(r1, r6)
            if (r13 != 0) goto L7c
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L7c:
            r12.q()
            java.lang.Object r12 = r3.getValue()
            cw4 r12 = (defpackage.cw4) r12
            r0.w = r7
            x21 r13 = defpackage.na1.g
            c21 r13 = defpackage.c21.a
            u30 r1 = new u30
            s30 r3 = defpackage.s30.m
            r1.<init>(r12, r3, r2, r8)
            java.lang.Object r13 = defpackage.m50.f0(r13, r1, r0)
            if (r13 != r9) goto L99
        L98:
            return r9
        L99:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r12 = r13.booleanValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "restartEnable("
            r0.<init>(r1)
            r0.append(r12)
            r0.append(r5)
            java.lang.String r12 = r0.toString()
            r4.y(r12, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e62.k(ou0):java.lang.Object");
    }

    public final Notification l() {
        String string;
        String address;
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra("from_notification", true);
            launchIntentForPackage.addFlags(335544320);
        } else {
            launchIntentForPackage = null;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        BluetoothDevice bluetoothDevice = this.b;
        if (bluetoothDevice == null || (address = bluetoothDevice.getAddress()) == null) {
            string = null;
        } else {
            Object value = this.o.getValue();
            value.getClass();
            string = ((SharedPreferences) value).getString(address, null);
        }
        xh3 xh3Var = new xh3(this, "connection");
        int i = this.B;
        BluetoothDevice bluetoothDevice2 = this.b;
        xh3Var.x(getString(i, bluetoothDevice2 != null ? gp4.E(bluetoothDevice2, string) : null));
        xh3Var.v(getString(this.C));
        xh3Var.l(this.D == jd2.t ? 2131231001 : 2131231002);
        xh3Var.n(activity);
        xh3Var.j(new zh3());
        String string2 = getString(R.string.action_disconnect);
        string2.getClass();
        Intent intent = new Intent(this, getClass());
        intent.setAction("io.appground.action.STOP");
        xh3Var.g(new vh3(R.drawable.ic_baseline_cancel_24, PendingIntent.getService(this, 0, intent, 67108864), string2));
        Notification notificationY = xh3Var.y();
        notificationY.getClass();
        return notificationY;
    }

    public abstract void m(String str);

    public abstract boolean n(byte b, byte[] bArr);

    @Override // defpackage.nu2, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        super.onBind(intent);
        this.B = intent.getIntExtra("notification_title", R.string.notification_title);
        this.C = intent.getIntExtra("notification_text", R.string.notification_text);
        this.D = (jd2) jd2.m.get(intent.getIntExtra("input_type", 0));
        if (this.c == null) {
            this.F = intent.getBooleanExtra("app_in_foreground", this.F);
            this.c = new x30(this.i, this.D);
            xt2 xt2VarA = mq2.a(this);
            x21 x21Var = na1.g;
            m50.T(xt2VarA, c21.a, new g01(this, null, (byte) 2), 2);
        }
        if (this.e) {
            D();
        }
        return this.t;
    }

    @Override // defpackage.nu2, android.app.Service
    public void onCreate() {
        super.onCreate();
        G = true;
    }

    @Override // defpackage.nu2, android.app.Service
    public void onDestroy() {
        PowerManager.WakeLock wakeLock = this.f;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.z.y("release", "wakelock");
            PowerManager.WakeLock wakeLock2 = this.f;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
            this.f = null;
        }
        super.onDestroy();
        G = false;
        rv rvVar = this.a;
        if (rvVar != null) {
            ((ew4) rvVar.j).a(null);
        }
        rv rvVar2 = this.a;
        if (rvVar2 != null) {
            ConcurrentHashMap concurrentHashMap = this.s;
            ArrayList arrayList = new ArrayList(concurrentHashMap.size());
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(g61.t((g61) ((Map.Entry) it.next()).getValue(), 0, 0, 1));
            }
            ((co4) rvVar2.t).p(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        e62 e62Var;
        BluetoothDevice bluetoothDevice;
        e40 e40Var;
        String address = null;
        Object[] objArr = 0;
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            e62Var = this;
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != -1553804308) {
                if (iHashCode != 313202433) {
                    if (iHashCode == 1691025670 && action.equals("io.appground.action.DISCONNECT")) {
                        String stringExtra = intent.getStringExtra("disconnect_address");
                        if (stringExtra == null) {
                            BluetoothDevice bluetoothDevice2 = this.b;
                            if (bluetoothDevice2 != null) {
                                address = bluetoothDevice2.getAddress();
                            }
                        } else {
                            address = stringExtra;
                        }
                        if (address != null) {
                            m(address);
                        }
                    }
                } else if (action.equals("io.appground.action.COMMAND")) {
                    BluetoothDevice bluetoothDevice3 = this.b;
                    if (this.c != null) {
                        Object obj = s().g.get(v54.g(e40.class));
                        if (!(obj instanceof e40)) {
                            obj = null;
                        }
                        e40Var = (e40) obj;
                    } else {
                        e40Var = null;
                    }
                    jy2 jy2Var = this.z;
                    if (bluetoothDevice3 == null) {
                        jy2Var.y("dropped: no active device", "command");
                    } else if (e40Var == null) {
                        jy2Var.y("dropped: input not ready", "command");
                    } else {
                        Bundle extras = intent.getExtras();
                        String address2 = bluetoothDevice3.getAddress();
                        address2.getClass();
                        jy2Var.y("for ".concat(tx4.o0(address2, 2)), "command");
                        e62Var = this;
                        m50.T(mq2.a(this), null, new c(e62Var, e40Var, extras, objArr == true ? 1 : 0, (byte) 25), 3);
                    }
                }
                e62Var = this;
            } else {
                e62Var = this;
                if (action.equals("io.appground.action.STOP") && (bluetoothDevice = e62Var.b) != null) {
                    String address3 = bluetoothDevice.getAddress();
                    address3.getClass();
                    e62Var.m(address3);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        ComponentName component = launchIntentForPackage != null ? launchIntentForPackage.getComponent() : null;
        ComponentName component2 = intent != null ? intent.getComponent() : null;
        String shortClassName = component2 != null ? component2.getShortClassName() : null;
        this.z.y("task removed: " + shortClassName + " ours=" + yf2.p(component2, component), "app");
        super.onTaskRemoved(intent);
        if (yf2.p(component2, component)) {
            stopSelf();
        }
    }

    public final SharedPreferences p() {
        Object value = this.h.getValue();
        value.getClass();
        return (SharedPreferences) value;
    }

    public final void q() {
        try {
            BluetoothAdapter bluetoothAdapterI = i();
            if (bluetoothAdapterI == null || !bluetoothAdapterI.enable()) {
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                intent.addFlags(268435456);
                startActivity(intent);
            }
        } catch (ActivityNotFoundException | SecurityException unused) {
        }
    }

    public final x30 s() {
        x30 x30Var = this.c;
        if (x30Var != null) {
            return x30Var;
        }
        yf2.Y("inputManager");
        throw null;
    }

    public final void t() {
        try {
            BluetoothAdapter bluetoothAdapterI = i();
            if (bluetoothAdapterI == null || !bluetoothAdapterI.disable()) {
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_DISABLE");
                intent.addFlags(268435456);
                startActivity(intent);
            }
        } catch (ActivityNotFoundException | SecurityException unused) {
        }
    }

    public final g61 u(BluetoothDevice bluetoothDevice) {
        String address = bluetoothDevice.getAddress();
        g61 g61VarU = (g61) this.s.get(address);
        if (g61VarU == null) {
            g61VarU = gp4.U(bluetoothDevice);
        }
        g61 g61Var = g61VarU;
        address.getClass();
        o05 o05Var = this.o;
        Object value = o05Var.getValue();
        value.getClass();
        String strE = gp4.E(bluetoothDevice, ((SharedPreferences) value).getString(address, null));
        if (!ay4.P(strE, "Unnamed device", false)) {
            Object value2 = o05Var.getValue();
            value2.getClass();
            ((SharedPreferences) value2).edit().putString(address, strE).apply();
        }
        return g61.r(g61Var, strE, bluetoothDevice.getBondState(), 0, 0, 0, false, 0, 0, 0L, 0L, false, false, false, 131062);
    }

    public final void v(String str, boolean z) {
        if (z || !p().contains(str)) {
            p().edit().putInt(str, s().y).apply();
        }
    }

    public void w() {
        m50.T(mq2.a(this), null, new a90(this, null, (byte) 1), 3);
    }

    public final byte x() {
        Float fValueOf = null;
        Intent intentRegisterReceiver = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            fValueOf = Float.valueOf((intentRegisterReceiver.getIntExtra("level", -1) * 100) / intentRegisterReceiver.getIntExtra("scale", -1));
        }
        if (fValueOf != null) {
            return (byte) fValueOf.floatValue();
        }
        return (byte) 100;
    }

    public abstract Object z(ou0 ou0Var);

    public void h() {
    }

    public void o() {
    }
}
