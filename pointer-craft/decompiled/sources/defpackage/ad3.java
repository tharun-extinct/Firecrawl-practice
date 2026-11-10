package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ad3 {
    public static final /* synthetic */ int q = 0;
    public dd3 a;
    public final String j;
    public final nu4 m;
    public final al t;

    static {
        new LinkedHashMap();
    }

    public ad3(sf3 sf3Var) {
        LinkedHashMap linkedHashMap = tf3.y;
        this.j = xs2.o(sf3Var.getClass());
        al alVar = new al();
        alVar.y = this;
        alVar.r = new ArrayList();
        alVar.n = new LinkedHashMap();
        this.t = alVar;
        this.m = new nu4(0);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof ad3)) {
                al alVar = this.t;
                ArrayList arrayList = (ArrayList) alVar.r;
                ad3 ad3Var = (ad3) obj;
                nu4 nu4Var = ad3Var.m;
                al alVar2 = ad3Var.t;
                boolean zEquals = arrayList.equals((ArrayList) alVar2.r);
                nu4 nu4Var2 = this.m;
                if (nu4Var2.v() != nu4Var.v()) {
                    z = false;
                    break;
                }
                Iterator it = ((zr0) dk4.K(new ou4(nu4Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!yf2.p(c93.o(nu4Var2, iIntValue), c93.o(nu4Var, iIntValue))) {
                        z = false;
                        break;
                    }
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) alVar.n;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) alVar2.n;
                if (linkedHashMap.size() != linkedHashMap2.size()) {
                    z2 = false;
                    break;
                }
                Set setEntrySet = linkedHashMap.entrySet();
                setEntrySet.getClass();
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!linkedHashMap2.containsKey(entry.getKey()) || !yf2.p(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (alVar.g != alVar2.g || !yf2.p((String) alVar.v, (String) alVar2.v) || !zEquals || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public final Bundle g(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.t.n;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            jc3 jc3Var = (jc3) entry.getValue();
            jc3Var.getClass();
            str.getClass();
            if (jc3Var.r && (obj = jc3Var.n) != null) {
                jc3Var.g.v(bundleN, str, obj);
            }
        }
        if (bundle != null) {
            bundleN.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                jc3 jc3Var2 = (jc3) entry2.getValue();
                jc3Var2.getClass();
                de3 de3Var = jc3Var2.g;
                str2.getClass();
                if (jc3Var2.y || !bundleN.containsKey(str2) || !xs2.B(str2, bundleN)) {
                    try {
                        de3Var.g(str2, bundleN);
                    } catch (IllegalStateException unused) {
                    }
                }
                l0.t(xi3.a("Wrong argument type for '", str2, "' in argument savedState. ", de3Var.y(), " expected."));
                return null;
            }
        }
        return bundleN;
    }

    public int hashCode() {
        al alVar = this.t;
        int i = alVar.g * 31;
        String str = (String) alVar.v;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) alVar.r;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = iHashCode * 31;
            String str2 = ((yc3) obj).g;
            iHashCode = (i3 + (str2 != null ? str2.hashCode() : 0)) * 961;
        }
        nu4 nu4Var = this.m;
        nu4Var.getClass();
        if (nu4Var.v() > 0) {
            nu4Var.x(0).getClass();
            uo1.B();
            return 0;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) alVar.n;
        for (String str3 : linkedHashMap.keySet()) {
            int iX = xi3.x(iHashCode * 31, 31, str3);
            Object obj2 = linkedHashMap.get(str3);
            iHashCode = iX + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public zc3 n(ro roVar) {
        boolean zN;
        y54 y54Var;
        c23 c23VarR;
        al alVar = this.t;
        LinkedHashMap linkedHashMap = (LinkedHashMap) alVar.n;
        String str = (String) roVar.a;
        Uri uri = (Uri) roVar.t;
        ArrayList arrayList = (ArrayList) alVar.r;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        zc3 zc3Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            yc3 yc3Var = (yc3) obj;
            yc3Var.getClass();
            o05 o05Var = yc3Var.n;
            if (((y54) o05Var.getValue()) == null) {
                zN = true;
            } else if (uri == null) {
                zN = false;
            } else {
                y54 y54Var2 = (y54) o05Var.getValue();
                y54Var2.getClass();
                zN = y54Var2.n(uri.toString());
            }
            if (zN) {
                Bundle bundleN = uri != null ? yc3Var.n(uri, linkedHashMap) : null;
                int iY = yc3Var.y(uri);
                boolean z = str != null && str.equals(null);
                if (bundleN == null) {
                    if (z) {
                        Bundle bundleN2 = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                        if (uri != null && (y54Var = (y54) o05Var.getValue()) != null && (c23VarR = y54Var.r(uri.toString())) != null) {
                            yc3Var.v(c23VarR, bundleN2, linkedHashMap);
                            if (((Boolean) yc3Var.v.getValue()).booleanValue()) {
                                yc3Var.x(uri, bundleN2, linkedHashMap);
                            }
                        }
                        if (v13.f(linkedHashMap, new ll2(bundleN2, (byte) 5)).isEmpty()) {
                        }
                    }
                }
                zc3 zc3Var2 = new zc3((ad3) alVar.y, bundleN, yc3Var.q, iY, z, -1);
                if (zc3Var == null || zc3Var2.compareTo(zc3Var) > 0) {
                    zc3Var = zc3Var2;
                }
            }
        }
        return zc3Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(0x");
        al alVar = this.t;
        alVar.getClass();
        sb.append(Integer.toHexString(alVar.g));
        sb.append(")");
        String str = (String) alVar.v;
        if (str != null && !tx4.Y(str)) {
            sb.append(" route=");
            sb.append((String) alVar.v);
        }
        return sb.toString();
    }

    public final boolean y(String str, Bundle bundle) {
        al alVar = this.t;
        alVar.getClass();
        if (yf2.p((String) alVar.v, str)) {
            return true;
        }
        zc3 zc3VarV = alVar.v(str);
        if (!((ad3) alVar.y).equals(zc3VarV != null ? zc3VarV.j : null)) {
            return false;
        }
        Bundle bundle2 = zc3VarV.t;
        if (bundle == null || bundle2 == null) {
            return false;
        }
        Set<String> setKeySet = bundle2.keySet();
        setKeySet.getClass();
        for (String str2 : setKeySet) {
            str2.getClass();
            if (!bundle.containsKey(str2)) {
                return false;
            }
            jc3 jc3Var = (jc3) v13.J((LinkedHashMap) zc3VarV.j.t.n).get(str2);
            de3 de3Var = jc3Var != null ? jc3Var.g : null;
            Object objG = de3Var != null ? de3Var.g(str2, bundle2) : null;
            Object objG2 = de3Var != null ? de3Var.g(str2, bundle) : null;
            if (de3Var != null && !de3Var.x(objG, objG2)) {
                return false;
            }
        }
        return true;
    }
}
