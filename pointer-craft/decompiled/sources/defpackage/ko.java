package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import io.appground.blehid.ClassicHidService;
import io.appground.blek.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ko extends zz4 implements bz1 {
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(wm4 wm4Var, u54 u54Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 15;
        this.c = wm4Var;
        this.w = u54Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new ko((we1) this.w, (wm4) obj2, mu0Var, (byte) 0);
            case 1:
                return new ko((ob3) this.w, (ob3) obj2, mu0Var, (byte) 1);
            case 2:
                return new ko((ob3) this.w, (aa3) obj2, mu0Var, (byte) 2);
            case 3:
                ko koVar = new ko(obj2, mu0Var, (byte) 3);
                koVar.w = obj;
                return koVar;
            case 4:
                return new ko((Context) this.w, (List) obj2, mu0Var, (byte) 4);
            case 5:
                ko koVar2 = new ko(obj2, mu0Var, (byte) 5);
                koVar2.w = obj;
                return koVar2;
            case 6:
                ko koVar3 = new ko(obj2, mu0Var, (byte) 6);
                koVar3.w = obj;
                return koVar3;
            case 7:
                return new ko((File) this.w, (String) obj2, mu0Var, (byte) 7);
            case 8:
                ko koVar4 = new ko(obj2, mu0Var, (byte) 8);
                koVar4.w = obj;
                return koVar4;
            case 9:
                return new ko((e62) this.w, (ArrayList) obj2, mu0Var, (byte) 9);
            case 10:
                ko koVar5 = new ko(obj2, mu0Var, (byte) 10);
                koVar5.w = obj;
                return koVar5;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new ko((qr0) this.w, (ql4) obj2, mu0Var, (byte) 11);
            case 12:
                return new ko((we1) this.w, (te1) obj2, mu0Var, (byte) 12);
            case 13:
                return new ko((String) this.w, (wm4) obj2, mu0Var, (byte) 13);
            case 14:
                ko koVar6 = new ko(obj2, mu0Var, (byte) 14);
                koVar6.w = obj;
                return koVar6;
            case kq2.x /* 15 */:
                return new ko((wm4) obj2, (u54) this.w, mu0Var);
            case 16:
                ko koVar7 = new ko(obj2, mu0Var, (byte) 16);
                koVar7.w = obj;
                return koVar7;
            default:
                ko koVar8 = new ko(obj2, mu0Var, (byte) 17);
                koVar8.w = obj;
                return koVar8;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 1:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 2:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 3:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 4:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 5:
                ((ko) b((mu0) obj2, (yf0) obj)).u(og5Var);
                return og5Var;
            case 6:
                return ((ko) b((mu0) obj2, (zv4) obj)).u(og5Var);
            case 7:
                return ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 8:
                return ((ko) b((mu0) obj2, (db3) obj)).u(og5Var);
            case 9:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 10:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 12:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 13:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 14:
                return ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case kq2.x /* 15 */:
                ((ko) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 16:
                return ((ko) b((mu0) obj2, (db3) obj)).u(og5Var);
            default:
                ((ko) b((mu0) obj2, (db3) obj)).u(og5Var);
                return og5Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:242:0x053a  */
    /* JADX WARN: Code duplicated, block: B:244:0x054c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0573  */
    /* JADX WARN: Code duplicated, block: B:266:0x05be  */
    /* JADX WARN: Code duplicated, block: B:267:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:271:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:332:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        Object obj2;
        Iterator it;
        ArrayList arrayList;
        Iterator<ResolveInfo> it2;
        ActivityInfo activityInfo;
        Bundle bundle;
        String string;
        yf0 yf0Var;
        c44 c44Var;
        zj3 zj3Var;
        e62 e62Var;
        xn5 xn5Var;
        boolean z = false;
        z = false;
        boolean z2 = false;
        int i = 0;
        z = false;
        mu0 mu0Var = null;
        switch (this.q) {
            case 0:
                js2.o(obj);
                if (((xe1) ((we1) this.w).y.t.getValue()) == xe1.t) {
                    ((wm4) this.c).l();
                }
                return og5.g;
            case 1:
                js2.o(obj);
                nm3 nm3Var = (nm3) ((ob3) this.w).getValue();
                if (nm3Var != null) {
                    ((ob3) this.c).setValue(nm3Var);
                }
                return og5.g;
            case 2:
                js2.o(obj);
                ((ob3) this.w).setValue(Boolean.valueOf(((aa3) this.c).v()));
                return og5.g;
            case 3:
                js2.o(obj);
                my1 my1Var = (my1) this.c;
                if (my1Var != null) {
                    try {
                        my1Var.g();
                        break;
                    } catch (Throwable unused) {
                    }
                }
                return og5.g;
            case 4:
                js2.o(obj);
                Context context = (Context) this.w;
                List list = (List) this.c;
                context.getClass();
                list.getClass();
                Set setH = js2.h("io.appground.blek.category.TEXT_SHARE_TARGET");
                List<g61> listC0 = cj0.C0(list, Build.VERSION.SDK_INT >= 25 ? fp4.y(context.getSystemService(fp4.r())).getMaxShortcutCountPerActivity() : 5);
                ArrayList arrayList2 = new ArrayList(dj0.Y(listC0, 10));
                for (g61 g61Var : listC0) {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    launchIntentForPackage.getClass();
                    launchIntentForPackage.putExtra("io.appground.MAC_ADDRESS", g61Var.t);
                    String str = g61Var.j;
                    if (str == null) {
                        str = "Device";
                    }
                    int i2 = g61Var.a;
                    int i3 = i2 != 256 ? i2 != 512 ? R.mipmap.ic_share_launcher : R.mipmap.ic_share_phone_launcher : R.mipmap.ic_share_laptop_launcher;
                    v92 v92Var = new v92(context, xi3.t("BtDevice_", g61Var.t));
                    v92Var.c0(str);
                    v92Var.Z(str);
                    v92Var.W(IconCompat.r(context, i3));
                    v92Var.X(launchIntentForPackage);
                    v92Var.a0();
                    v92Var.U(setH);
                    arrayList2.add(v92Var.A());
                }
                if (Build.VERSION.SDK_INT <= 32) {
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj3 = arrayList2.get(i4);
                        i4++;
                        ((zo4) obj3).getClass();
                    }
                    arrayList2 = arrayList3;
                }
                if (Build.VERSION.SDK_INT >= 25) {
                    ArrayList arrayList4 = new ArrayList(arrayList2.size());
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj4 = arrayList2.get(i5);
                        i5++;
                        arrayList4.add(((zo4) obj4).a());
                    }
                    if (fp4.y(context.getSystemService(fp4.r())).setDynamicShortcuts(arrayList4)) {
                        gp4.J(context).y();
                        gp4.J(context).g(arrayList2);
                        if (gp4.y == null) {
                            arrayList = new ArrayList();
                            PackageManager packageManager = context.getPackageManager();
                            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
                            intent.setPackage(context.getPackageName());
                            it2 = packageManager.queryIntentActivities(intent, 128).iterator();
                            while (it2.hasNext()) {
                                activityInfo = it2.next().activityInfo;
                                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                                    try {
                                        try {
                                            if (Class.forName(string, false, gp4.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) == null) {
                                                throw new ClassCastException();
                                            }
                                            arrayList.add(null);
                                        } catch (Exception unused2) {
                                            continue;
                                        }
                                    } catch (Exception unused3) {
                                    }
                                }
                            }
                            obj2 = null;
                            if (gp4.y == null) {
                                gp4.y = arrayList;
                            }
                        } else {
                            obj2 = null;
                        }
                        it = gp4.y.iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            uo1.B();
                            return obj2;
                        }
                    }
                } else {
                    gp4.J(context).y();
                    gp4.J(context).g(arrayList2);
                    if (gp4.y == null) {
                        arrayList = new ArrayList();
                        PackageManager packageManager2 = context.getPackageManager();
                        Intent intent2 = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
                        intent2.setPackage(context.getPackageName());
                        it2 = packageManager2.queryIntentActivities(intent2, 128).iterator();
                        while (it2.hasNext()) {
                            activityInfo = it2.next().activityInfo;
                            if (activityInfo != null) {
                                if (Class.forName(string, false, gp4.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) == null) {
                                    throw new ClassCastException();
                                }
                                arrayList.add(null);
                            }
                        }
                        obj2 = null;
                        if (gp4.y == null) {
                            gp4.y = arrayList;
                        }
                    } else {
                        obj2 = null;
                    }
                    it = gp4.y.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        uo1.B();
                        return obj2;
                    }
                }
                return og5.g;
            case 5:
                c44 c44Var2 = c44.t;
                c44 c44Var3 = c44.m;
                yf0 yf0Var2 = (yf0) this.w;
                js2.o(obj);
                BluetoothDevice bluetoothDevice = yf0Var2.y;
                if (bluetoothDevice != null) {
                    ClassicHidService classicHidService = (ClassicHidService) this.c;
                    int i6 = yf0Var2.r;
                    cm1 cm1Var = ClassicHidService.T;
                    String address = bluetoothDevice.getAddress();
                    address.getClass();
                    String str2 = classicHidService.O;
                    BluetoothAdapter bluetoothAdapterI = classicHidService.i();
                    boolean z3 = i6 == 0 && (yf2.p(str2, address) || !(bluetoothAdapterI != null && bluetoothAdapterI.isEnabled()) == true);
                    String address2 = bluetoothDevice.getAddress();
                    address2.getClass();
                    String str3 = classicHidService.O;
                    if (i6 == 0 && yf2.p(str3, address2)) {
                        str3 = null;
                    }
                    classicHidService.O = str3;
                    m50.T(mq2.a(classicHidService), null, new dh0(classicHidService, bluetoothDevice, i6, z3, null), 3);
                    if (i6 != 0) {
                        if (i6 == 2) {
                            iv4 iv4Var = classicHidService.M;
                            if (iv4Var != null) {
                                iv4Var.x(null);
                            }
                            classicHidService.L.r = System.currentTimeMillis();
                            classicHidService.D();
                            classicHidService.v(bluetoothDevice.getAddress(), false);
                            classicHidService.e(bluetoothDevice);
                        }
                        yf0Var = yf0Var2;
                    } else {
                        d44 d44Var = classicHidService.L;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        yf0Var = yf0Var2;
                        long j = d44Var.r;
                        d44Var.r = 0L;
                        if (j == 0) {
                            c44Var = c44.j;
                        } else {
                            long j2 = jCurrentTimeMillis - j;
                            c44Var = j2 >= 5000 ? c44Var3 : j2 < 1000 ? c44Var2 : c44.a;
                        }
                        if (c44Var == c44Var3) {
                            d44Var.y = 0;
                        }
                        if (c44Var == c44Var2 && !z3) {
                            classicHidService.z.y("host dropped it at once, keeping the backoff", "reconnect");
                        }
                        String address3 = bluetoothDevice.getAddress();
                        BluetoothDevice bluetoothDevice2 = classicHidService.b;
                        boolean zP = yf2.p(address3, bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null);
                        Object[] objArr = classicHidService.b != null;
                        boolean z4 = classicHidService.F;
                        if (zP && z4) {
                            zj3Var = zj3.a;
                        } else if (zP) {
                            zj3Var = zj3.m;
                        } else {
                            zj3Var = objArr == false ? zj3.t : zj3.j;
                        }
                        int iOrdinal = zj3Var.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                try {
                                    if (iOrdinal == 2) {
                                        classicHidService.L(false);
                                    } else {
                                        if (iOrdinal != 3) {
                                            uo1.g();
                                            return null;
                                        }
                                        classicHidService.K();
                                    }
                                    break;
                                } catch (SecurityException unused4) {
                                }
                            } else {
                                classicHidService.E();
                            }
                        }
                    }
                } else {
                    yf0Var = yf0Var2;
                }
                if (yf0Var.g) {
                    ((ClassicHidService) this.c).C(dx4.g);
                }
                cm1 cm1Var2 = ClassicHidService.T;
                boolean z5 = yf0Var.g;
                int i7 = yf0Var.r;
                iv4 iv4Var2 = ((ClassicHidService) this.c).M;
                boolean z6 = iv4Var2 != null && iv4Var2.y();
                if (z5 && i7 != 2 && !z6) {
                    try {
                        ((ClassicHidService) this.c).L(false);
                        break;
                    } catch (SecurityException unused5) {
                    }
                }
                return og5.g;
            case 6:
                js2.o(obj);
                zv4 zv4Var = (zv4) this.w;
                if ((zv4Var instanceof rz0) && zv4Var.g <= ((zv4) this.c).g) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                js2.o(obj);
                File file = new File((File) this.w, (String) this.c);
                if (!file.exists()) {
                    return null;
                }
                byte[] bArrJ0 = ue5.j0(file);
                if ((bArrJ0.length == 0 ? 1 : 0) == 0) {
                    return bArrJ0;
                }
                return null;
            case 8:
                js2.o(obj);
                db3 db3VarL = ((db3) this.w).l();
                ArrayList arrayList5 = (ArrayList) this.c;
                rw3 rw3Var = f22.l;
                ArrayList arrayList6 = new ArrayList(dj0.Y(arrayList5, 10));
                int size3 = arrayList5.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj5 = arrayList5.get(i8);
                    i8++;
                    arrayList6.add(((l22) obj5).getClass().getName());
                }
                db3VarL.v(rw3Var, cj0.J0(arrayList6));
                int size4 = arrayList5.size();
                while (i < size4) {
                    Object obj6 = arrayList5.get(i);
                    i++;
                    l22 l22Var = (l22) obj6;
                    a22 a22Var = f22.n;
                    ci2[] ci2VarArr = a22.g;
                    a22Var.getClass();
                    String canonicalName = l22Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        l0.u("no receiver name");
                        return null;
                    }
                    rw3 rw3VarG = a22.g(canonicalName);
                    String canonicalName2 = l22Var.v().getClass().getCanonicalName();
                    if (canonicalName2 == null) {
                        l0.u("no provider name");
                        return null;
                    }
                    db3VarL.x(rw3VarG, canonicalName2);
                }
                return db3VarL.j();
            case 9:
                js2.o(obj);
                rv rvVar = ((e62) this.w).a;
                if (rvVar != null) {
                    ((co4) rvVar.t).p((ArrayList) this.c);
                }
                return og5.g;
            case 10:
                js2.o(obj);
                ox0 ox0Var = (ox0) this.w;
                xt2 xt2Var = (xt2) this.c;
                ju2 ju2Var = xt2Var.j;
                if (ju2Var.t.compareTo(wt2.t) >= 0) {
                    ju2Var.g(xt2Var);
                } else {
                    v70.a(ox0Var.w(), null);
                }
                return og5.g;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                js2.o(obj);
                qr0 qr0Var = (qr0) this.w;
                String str4 = ((ql4) this.c).p;
                qr0Var.getClass();
                h62 h62Var = qr0Var.j;
                boolean zEquals = str4.equals("screen_off");
                if (h62Var.n && (e62Var = h62Var.r) != null) {
                    e62Var.k = zEquals;
                    e62Var.G();
                }
                k40 k40VarT = qr0Var.t();
                if (k40VarT != null) {
                    boolean zEquals2 = str4.equals("disabled");
                    iv4 iv4Var3 = k40VarT.v;
                    if (zEquals2) {
                        if (iv4Var3 != null) {
                            iv4Var3.x(null);
                        }
                        k40VarT.v = null;
                    } else if (iv4Var3 == null || !iv4Var3.y()) {
                        k40VarT.n = System.currentTimeMillis();
                        k40VarT.v = m50.T(k40VarT.x, null, new b8(k40VarT, mu0Var, (byte) 4), 3);
                    }
                }
                return og5.g;
            case 12:
                js2.o(obj);
                if (((xe1) ((we1) this.w).y.j.getValue()) == xe1.j) {
                    te1 te1Var = (te1) this.c;
                    te1Var.g.setValue(Boolean.TRUE);
                    te1Var.y.e(0.0f);
                    te1Var.r.e(0.0f);
                }
                return og5.g;
            case 13:
                js2.o(obj);
                int iIndexOf = ri5.y.indexOf((String) this.w);
                if (iIndexOf != -1) {
                    if (iIndexOf >= 0) {
                        SharedPreferences sharedPreferences = d52.b;
                        sharedPreferences.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.getClass();
                        editorEdit.putInt("start_screen", iIndexOf);
                        editorEdit.putInt("start_custom_control", -1);
                        editorEdit.apply();
                    }
                    ((wm4) this.c).a(iIndexOf, -1);
                }
                return og5.g;
            case 14:
                js2.o(obj);
                dx0 dx0VarH = ((ox0) this.w).w().h(f73.t);
                dx0VarH.getClass();
                hx0 hx0Var = (hx0) dx0VarH;
                el0 el0VarV = y94.v();
                m50.S(c32.j, hx0Var, rx0.m, new zh(el0VarV, (bz1) this.c, mu0Var, (byte) 14));
                while (!el0VarV.d0()) {
                    try {
                        return v70.N(hx0Var, new dy((Object) el0VarV, mu0Var, (byte) 27));
                    } catch (InterruptedException unused6) {
                    }
                }
                return el0VarV.T();
            case kq2.x /* 15 */:
                js2.o(obj);
                wm4 wm4Var = (wm4) this.c;
                ew4 ew4Var = wm4Var.x;
                u54 u54Var = (u54) this.w;
                ew4Var.a(u54Var.j);
                wm4Var.s.x = kq2.D(100 - ((ql4) u54Var.j).a, 5.0f) / 1000.0f;
                wm4Var.x().registerOnSharedPreferenceChangeListener(wm4Var.h);
                return og5.g;
            case 16:
                js2.o(obj);
                Set setKeySet = ((db3) this.w).g().keySet();
                ArrayList arrayList7 = new ArrayList(dj0.Y(setKeySet, 10));
                Iterator it3 = setKeySet.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((rw3) it3.next()).g);
                }
                Set set = (Set) this.c;
                if (set == mo4.g) {
                    z2 = true;
                } else {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it4 = set2.iterator();
                        while (it4.hasNext()) {
                            if (!arrayList7.contains((String) it4.next())) {
                                z2 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            default:
                db3 db3Var = (db3) this.w;
                js2.o(obj);
                for (Map.Entry entry : ((Map) this.c).entrySet()) {
                    String str5 = (String) entry.getKey();
                    oq0 oq0Var = (oq0) entry.getValue();
                    rw3 rw3VarI = jr2.i(str5);
                    oq0Var.getClass();
                    int iOrdinal2 = oq0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        xn5Var = xn5.j;
                    } else if (iOrdinal2 == 1) {
                        xn5Var = xn5.t;
                    } else {
                        if (iOrdinal2 != 2) {
                            uo1.g();
                            return null;
                        }
                        xn5Var = xn5.a;
                    }
                    String strName = xn5Var.name();
                    db3Var.getClass();
                    db3Var.x(rw3VarI, strName);
                }
                return og5.g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = obj;
        this.c = obj2;
    }
}
