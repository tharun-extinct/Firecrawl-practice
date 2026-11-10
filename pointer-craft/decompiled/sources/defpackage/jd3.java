package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class jd3 {
    public final Context g;
    public final boolean l;
    public final Activity n;
    public final jq r;
    public boolean v;
    public final uv x;
    public final vc3 y;

    public jd3(Context context) {
        context.getClass();
        this.g = context;
        this.y = new vc3(this, new wn(this, (byte) 3));
        this.r = new jq(context, false);
        for (Object obj : dk4.L(context, new pc3((byte) 1))) {
            if (((Context) obj) instanceof Activity) {
                this.n = (Activity) obj;
                this.x = new uv(this, (byte) 2);
                this.l = true;
                tf3 tf3Var = this.y.u;
                tf3Var.g(new id3(tf3Var));
                this.y.u.g(new n4(this.g));
            }
        }
        obj = null;
        this.n = (Activity) obj;
        this.x = new uv(this, (byte) 2);
        this.l = true;
        tf3 tf3Var2 = this.y.u;
        tf3Var2.g(new id3(tf3Var2));
        this.y.u.g(new n4(this.g));
    }

    public static void v(jd3 jd3Var, String str) {
        jd3Var.getClass();
        str.getClass();
        jd3Var.y.c(str, null);
    }

    public final mc3 g(String str) {
        Object objPrevious;
        mc3 mc3Var;
        vc3 vc3Var = this.y;
        vc3Var.getClass();
        dr drVar = vc3Var.x;
        ListIterator listIterator = drVar.listIterator(drVar.g());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            mc3Var = (mc3) objPrevious;
        } while (!mc3Var.t.y(str, mc3Var.g()));
        mc3 mc3Var2 = (mc3) objPrevious;
        if (mc3Var2 != null) {
            return mc3Var2;
        }
        uo1.m("No destination with route ", str, " is on the NavController's back stack. The current destination is ", vc3Var.j());
        return null;
    }

    public final void n(String str, xy1 xy1Var) {
        str.getClass();
        vc3 vc3Var = this.y;
        vc3Var.getClass();
        vc3Var.c(str, gb6.y(xy1Var));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public final boolean r(Intent intent) {
        boolean z;
        int[] intArray;
        boolean z2;
        String strX;
        ad3 ad3VarG;
        dd3 dd3Var;
        Bundle bundle;
        ad3 ad3VarG2;
        dd3 dd3Var2;
        boolean zP;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            Context context = this.g;
            Activity activity = this.n;
            if (extras == null || !extras.containsKey("android-support-nav:controller:deepLinkIds")) {
                z = false;
            } else {
                if (activity == null) {
                    zP = true;
                } else if (intent.hasExtra("android.intent.extra.REFERRER") || intent.hasExtra("android.intent.extra.REFERRER_NAME")) {
                    zP = false;
                } else {
                    String callingPackage = activity.getCallingPackage();
                    if (callingPackage == null) {
                        Uri referrer = activity.getReferrer();
                        callingPackage = referrer != null ? referrer.getAuthority() : null;
                    }
                    zP = yf2.p(callingPackage, context.getPackageName());
                }
                if (zP) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = z ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
            Bundle bundle2 = z ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle2 != null) {
                bundleN.putAll(bundle2);
            }
            vc3 vc3Var = this.y;
            if (intArray == null || intArray.length == 0) {
                dd3 dd3VarM = vc3Var.m();
                z2 = true;
                zc3 zc3VarV = dd3VarM.v(new ro((Object) intent.getData(), (Object) intent.getAction(), (Object) intent.getType(), (byte) 19), dd3VarM);
                if (zc3VarV != null) {
                    ad3 ad3Var = zc3VarV.j;
                    dr drVar = new dr();
                    ad3 ad3Var2 = ad3Var;
                    while (true) {
                        al alVar = ad3Var2.t;
                        dd3 dd3Var3 = ad3Var2.a;
                        if (dd3Var3 == null || dd3Var3.w.r != alVar.g) {
                            drVar.addFirst(ad3Var2);
                        }
                        if (yf2.p(dd3Var3, null) || dd3Var3 == null) {
                            break;
                        }
                        ad3Var2 = dd3Var3;
                    }
                    List listF0 = cj0.F0(drVar);
                    ArrayList arrayList = new ArrayList(dj0.Y(listF0, 10));
                    Iterator it = listF0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((ad3) it.next()).t.g));
                    }
                    intArray = cj0.E0(arrayList);
                    Bundle bundleG = ad3Var.g(zc3VarV.t);
                    if (bundleG != null) {
                        bundleN.putAll(bundleG);
                    }
                    parcelableArrayList = null;
                }
            } else {
                z2 = true;
            }
            if (intArray != null && intArray.length != 0) {
                vc3Var.getClass();
                dd3 dd3Var4 = vc3Var.r;
                int length = intArray.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strX = null;
                        break;
                    }
                    int i2 = intArray[i];
                    if (i == 0) {
                        dd3 dd3Var5 = vc3Var.r;
                        dd3Var5.getClass();
                        ad3VarG2 = dd3Var5.t.g == i2 ? vc3Var.r : null;
                    } else {
                        dd3Var4.getClass();
                        ad3VarG2 = dd3Var4.w.g(i2);
                    }
                    if (ad3VarG2 == null) {
                        int i3 = ad3.q;
                        strX = mq2.x(vc3Var.g.r, i2);
                        break;
                    }
                    if (i != intArray.length - 1 && (ad3VarG2 instanceof dd3)) {
                        while (true) {
                            dd3Var2 = (dd3) ad3VarG2;
                            dd3Var2.getClass();
                            gd3 gd3Var = dd3Var2.w;
                            if (!(gd3Var.g(gd3Var.r) instanceof dd3)) {
                                break;
                            }
                            ad3VarG2 = gd3Var.g(gd3Var.r);
                        }
                        dd3Var4 = dd3Var2;
                    }
                    i++;
                }
                if (strX != null) {
                    oz5.y("Could not find destination " + strX + " in the navigation graph, ignoring the deep link from " + intent);
                    return false;
                }
                bundleN.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                int length2 = intArray.length;
                Bundle[] bundleArr = new Bundle[length2];
                for (int i4 = 0; i4 < length2; i4++) {
                    Bundle bundleN2 = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                    bundleN2.putAll(bundleN);
                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i4)) != null) {
                        bundleN2.putAll(bundle);
                    }
                    bundleArr[i4] = bundleN2;
                }
                int flags = intent.getFlags();
                int i5 = 268435456 & flags;
                if (i5 != 0 && (flags & 32768) == 0) {
                    intent.addFlags(32768);
                    c35 c35VarV = c35.v(context);
                    c35VarV.g(intent);
                    c35VarV.x();
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                    return z2;
                }
                boolean z3 = i5 != 0 ? z2 : false;
                jq jqVar = this.r;
                if (z3) {
                    if (!vc3Var.x.isEmpty()) {
                        dd3 dd3Var6 = vc3Var.r;
                        dd3Var6.getClass();
                        vc3Var.i(dd3Var6.t.g, z2, false);
                    }
                    int i6 = 0;
                    while (i6 < intArray.length) {
                        int i7 = intArray[i6];
                        int i8 = i6 + 1;
                        Bundle bundle3 = bundleArr[i6];
                        ad3 ad3VarN = vc3Var.n(i7, null);
                        if (ad3VarN == null) {
                            int i9 = ad3.q;
                            uo1.h("Deep Linking failed: destination ", mq2.x(jqVar, i7), " cannot be found from the current destination ", vc3Var.j());
                            return false;
                        }
                        vc3Var.w(ad3VarN, bundle3, gb6.y(new kn2(ad3VarN, this, (byte) 6)));
                        i6 = i8;
                    }
                    this.v = true;
                    return true;
                }
                dd3 dd3Var7 = vc3Var.r;
                int length3 = intArray.length;
                for (int i10 = 0; i10 < length3; i10++) {
                    int i11 = intArray[i10];
                    Bundle bundle4 = bundleArr[i10];
                    if (i10 == 0) {
                        ad3VarG = vc3Var.r;
                    } else {
                        dd3Var7.getClass();
                        ad3VarG = dd3Var7.w.g(i11);
                    }
                    if (ad3VarG == null) {
                        int i12 = ad3.q;
                        throw new IllegalStateException("Deep Linking failed: destination " + mq2.x(jqVar, i11) + " cannot be found in graph " + dd3Var7);
                    }
                    if (i10 == intArray.length - 1) {
                        vd3 vd3Var = new vd3();
                        dd3 dd3Var8 = vc3Var.r;
                        dd3Var8.getClass();
                        vd3.n(vd3Var, dd3Var8.t.g);
                        vd3Var.y();
                        vd3Var.r();
                        vc3Var.w(ad3VarG, bundle4, vd3Var.g());
                    } else if (ad3VarG instanceof dd3) {
                        while (true) {
                            dd3Var = (dd3) ad3VarG;
                            dd3Var.getClass();
                            gd3 gd3Var2 = dd3Var.w;
                            if (!(gd3Var2.g(gd3Var2.r) instanceof dd3)) {
                                break;
                            }
                            ad3VarG = gd3Var2.g(gd3Var2.r);
                        }
                        dd3Var7 = dd3Var;
                    }
                }
                this.v = true;
                return true;
            }
        }
        return false;
    }

    public final void x() {
        vc3 vc3Var = this.y;
        if (vc3Var.x.isEmpty()) {
            return;
        }
        ad3 ad3VarJ = vc3Var.j();
        ad3VarJ.getClass();
        if (vc3Var.i(ad3VarJ.t.g, true, false)) {
            vc3Var.y();
        }
    }

    public final mc3 y() {
        Object next;
        Iterator it = cj0.y0(this.y.x).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((zr0) dk4.K(it)).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((mc3) next).t instanceof dd3)) {
                return (mc3) next;
            }
        }
        next = null;
        return (mc3) next;
    }
}
