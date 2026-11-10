package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl0 implements yj3 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ yl0 y;

    public /* synthetic */ sl0(yl0 yl0Var, byte b) {
        this.g = b;
        this.y = yl0Var;
    }

    @Override // defpackage.yj3
    public final void g(yl0 yl0Var) {
        byte b = this.g;
        yl0 yl0Var2 = this.y;
        switch (b) {
            case 0:
                yl0Var.getClass();
                Bundle bundleA = ((ji) yl0Var2.m.a).a("android:support:activity-result");
                if (bundleA != null) {
                    wl0 wl0Var = yl0Var2.b;
                    LinkedHashMap linkedHashMap = wl0Var.y;
                    LinkedHashMap linkedHashMap2 = wl0Var.g;
                    Bundle bundle = wl0Var.l;
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            wl0Var.n.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    ue5.o(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            wl0Var.y.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                rw1 rw1Var = (rw1) ((yk) yl0Var2).C.t;
                rw1Var.e.y(rw1Var, rw1Var, null);
                break;
        }
    }
}
