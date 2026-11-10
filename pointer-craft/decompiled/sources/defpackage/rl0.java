package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl0 implements fd4 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ rl0(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.fd4
    public final Bundle g() {
        fp3[] fp3VarArr;
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                wl0 wl0Var = ((yl0) obj).b;
                wl0Var.getClass();
                LinkedHashMap linkedHashMap = wl0Var.y;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(wl0Var.n));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(wl0Var.l));
                return bundle;
            case 1:
                Map mapV = ((vc4) obj).v();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapV.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                yk ykVar = (yk) obj;
                while (yk.s(((rw1) ykVar.C.t).e)) {
                }
                ykVar.D.n(vt2.ON_STOP);
                return new Bundle();
            case 3:
                return ((kx1) obj).c0();
            default:
                rv rvVar = (rv) obj;
                for (Map.Entry entry2 : v13.J((LinkedHashMap) rvVar.m).entrySet()) {
                    rvVar.o(((ew4) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : v13.J((LinkedHashMap) rvVar.t).entrySet()) {
                    rvVar.o(((fd4) entry3.getValue()).g(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) rvVar.j;
                if (linkedHashMap2.isEmpty()) {
                    fp3VarArr = new fp3[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new fp3((String) entry4.getKey(), entry4.getValue()));
                    }
                    fp3VarArr = (fp3[]) arrayList.toArray(new fp3[0]);
                }
                return a11.n((fp3[]) Arrays.copyOf(fp3VarArr, fp3VarArr.length));
        }
    }
}
