package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iy1 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Context t;

    public /* synthetic */ iy1(Context context, byte b) {
        this.j = b;
        this.t = context;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        Bundle bundle;
        byte b = this.j;
        Context context = this.t;
        switch (b) {
            case 0:
                ((wa1) obj).getClass();
                if (Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", 0) == 2) {
                    bi6.f(context, R.string.info_message_full_screen_exit_gesture, false);
                } else {
                    bi6.f(context, R.string.info_message_full_screen_exit_button, false);
                }
                return new ae((byte) 3);
            default:
                Bundle bundle2 = (Bundle) obj;
                jd3 jd3VarL = zq2.l(context);
                if (bundle2 != null) {
                    bundle2.setClassLoader(jd3VarL.g.getClassLoader());
                }
                vc3 vc3Var = jd3VarL.y;
                LinkedHashMap linkedHashMap = vc3Var.w;
                if (bundle2 != null) {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            gf6.n("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    vc3Var.n = bundle;
                    vc3Var.v = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) xs2.f("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            gf6.n("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            gf6.n("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            vc3Var.q.put(Integer.valueOf(intArray[i]), !yf2.p(stringArrayList.get(i2), "") ? stringArrayList.get(i2) : null);
                            i++;
                            i2 = i3;
                        }
                    }
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            gf6.n("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        int size = stringArrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            String str = stringArrayList2.get(i4);
                            i4++;
                            String str2 = str;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                ArrayList arrayListF = xs2.f("android-support-nav:controller:backStackStates:" + str2, bundle2);
                                dr drVar = new dr(arrayListF.size());
                                int size2 = arrayListF.size();
                                int i5 = 0;
                                while (i5 < size2) {
                                    Object obj2 = arrayListF.get(i5);
                                    i5++;
                                    drVar.addLast(new qc3((Bundle) obj2));
                                }
                                linkedHashMap.put(str2, drVar);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean boolValueOf = (z || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : null;
                    jd3VarL.v = boolValueOf != null ? boolValueOf.booleanValue() : false;
                }
                return jd3VarL;
        }
    }
}
