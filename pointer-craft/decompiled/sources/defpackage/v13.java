package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.RemoteViews;
import io.appground.blek.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class v13 {
    public static final File A(Context context, String str) {
        context.getClass();
        str.getClass();
        return m50.H(context, str.concat(".preferences_pb"));
    }

    public static final void B(HashMap map, fp3[] fp3VarArr) {
        for (fp3 fp3Var : fp3VarArr) {
            map.put(fp3Var.j, fp3Var.t);
        }
    }

    public static void C(hi0 hi0Var) {
        ew4 ew4Var;
        fs3 fs3Var;
        fs3 fs3Var2;
        do {
            ew4Var = a44.B;
            fs3Var = (fs3) ew4Var.getValue();
            ur3 ur3VarG = fs3Var.a;
            qv2 qv2Var = (qv2) ur3VarG.get(hi0Var);
            if (qv2Var == null) {
                fs3Var2 = fs3Var;
            } else {
                Object obj = qv2Var.g;
                Object obj2 = qv2Var.y;
                od5 od5Var = ur3VarG.j;
                od5 od5VarO = od5Var.o(hi0Var != null ? hi0Var.hashCode() : 0, 0, hi0Var);
                if (od5Var != od5VarO) {
                    ur3VarG = od5VarO == null ? ur3.a : new ur3(od5VarO, ur3VarG.t - 1);
                }
                tg1 tg1Var = tg1.b;
                if (obj != tg1Var) {
                    Object obj3 = ur3VarG.get(obj);
                    obj3.getClass();
                    ur3VarG = ur3VarG.g(obj, new qv2(((qv2) obj3).g, obj2));
                }
                if (obj2 != tg1Var) {
                    Object obj4 = ur3VarG.get(obj2);
                    obj4.getClass();
                    ur3VarG = ur3VarG.g(obj2, new qv2(obj, ((qv2) obj4).y));
                }
                Object obj5 = obj != tg1Var ? fs3Var.j : obj2;
                if (obj2 != tg1Var) {
                    obj = fs3Var.t;
                }
                fs3Var2 = new fs3(obj5, obj, ur3VarG);
            }
            if (fs3Var == fs3Var2) {
                return;
            }
        } while (!ew4Var.t(fs3Var, fs3Var2));
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    public static final k85 D(k85 k85Var, fl2 fl2Var) {
        long j;
        o65 o65Var;
        int i;
        int i2;
        s75 s75Var;
        ju4 ju4Var = k85Var.g;
        m65 m65Var = ku4.n;
        m65 m65Var2 = ju4Var.g;
        if (m65Var2.equals(l65.g)) {
            m65Var2 = ku4.n;
        }
        m65 m65Var3 = m65Var2;
        long j2 = ju4Var.y;
        o85[] o85VarArr = n85.y;
        if ((j2 & 1095216660480L) == 0) {
            j2 = ku4.g;
        }
        long j3 = j2;
        qv1 qv1Var = ju4Var.r;
        if (qv1Var == null) {
            qv1Var = qv1.z;
        }
        qv1 qv1Var2 = qv1Var;
        lv1 lv1Var = ju4Var.n;
        lv1 lv1Var2 = new lv1(lv1Var != null ? lv1Var.g : 0);
        mv1 mv1Var = ju4Var.v;
        mv1 mv1Var2 = new mv1(mv1Var != null ? mv1Var.g : 65535);
        lu1 lu1Var = ju4Var.x;
        if (lu1Var == null) {
            lu1Var = lu1.j;
        }
        lu1 lu1Var2 = lu1Var;
        String str = ju4Var.l;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = ju4Var.j;
        if ((j4 & 1095216660480L) == 0) {
            j4 = ku4.y;
        }
        long j5 = j4;
        ry ryVar = ju4Var.t;
        float f = ryVar != null ? ryVar.g : 0.0f;
        ry ryVar2 = new ry(Float.isNaN(f) ? 0.0f : f);
        n65 n65Var = ju4Var.a;
        if (n65Var == null) {
            n65Var = n65.r;
        }
        n65 n65Var2 = n65Var;
        tx2 tx2VarU = ju4Var.m;
        if (tx2VarU == null) {
            tx2 tx2Var = tx2.a;
            tx2VarU = bt3.g.u();
        }
        tx2 tx2Var2 = tx2VarU;
        long j6 = ju4Var.q;
        if (j6 == 16) {
            j6 = ku4.r;
        }
        long j7 = j6;
        l45 l45Var = ju4Var.w;
        if (l45Var == null) {
            l45Var = l45.y;
        }
        l45 l45Var2 = l45Var;
        ym4 ym4Var = ju4Var.c;
        if (ym4Var == null) {
            ym4Var = ym4.n;
        }
        ym4 ym4Var2 = ym4Var;
        tt3 tt3Var = ju4Var.i;
        yd1 yd1Var = ju4Var.b;
        if (yd1Var == null) {
            yd1Var = go1.g;
        }
        ju4 ju4Var2 = new ju4(m65Var3, j3, qv1Var2, lv1Var2, mv1Var2, lu1Var2, str2, j5, ryVar2, n65Var2, tx2Var2, j7, l45Var2, ym4Var2, tt3Var, yd1Var);
        lp3 lp3Var = k85Var.y;
        int i3 = mp3.y;
        int i4 = lp3Var.g;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = lp3Var.y;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = fl2Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        uo1.g();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = lp3Var.r;
            if ((j & 1095216660480L) == 0) {
                j = mp3.g;
            }
            o65Var = lp3Var.n;
            if (o65Var == null) {
                o65Var = o65.r;
            }
            jt3 jt3Var = lp3Var.v;
            av2 av2Var = lp3Var.x;
            i = lp3Var.l;
            if (i == 0) {
                i = vu2.y;
            }
            i2 = lp3Var.j;
            if (i2 == 0) {
                i2 = 1;
            }
            s75Var = lp3Var.t;
            if (s75Var == null) {
                s75Var = s75.r;
            }
            return new k85(ju4Var2, new lp3(i4, i6, j, o65Var, jt3Var, av2Var, i, i2, s75Var), k85Var.r);
        }
        int iOrdinal2 = fl2Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            uo1.g();
            return null;
        }
        i6 = i5;
        j = lp3Var.r;
        if ((j & 1095216660480L) == 0) {
            j = mp3.g;
        }
        o65Var = lp3Var.n;
        if (o65Var == null) {
            o65Var = o65.r;
        }
        jt3 jt3Var2 = lp3Var.v;
        av2 av2Var2 = lp3Var.x;
        i = lp3Var.l;
        if (i == 0) {
            i = vu2.y;
        }
        i2 = lp3Var.j;
        if (i2 == 0) {
            i2 = 1;
        }
        s75Var = lp3Var.t;
        if (s75Var == null) {
            s75Var = s75.r;
        }
        return new k85(ju4Var2, new lp3(i4, i6, j, o65Var, jt3Var2, av2Var2, i, i2, s75Var), k85Var.r);
    }

    public static void E(XmlSerializer xmlSerializer, String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static void F(XmlSerializer xmlSerializer, hp4 hp4Var) throws IOException {
        xmlSerializer.startTag(null, "target");
        zo4 zo4Var = hp4Var.r;
        String str = hp4Var.y;
        String str2 = hp4Var.g;
        E(xmlSerializer, "id", zo4Var.v());
        E(xmlSerializer, "short_label", zo4Var.t().toString());
        E(xmlSerializer, "rank", Integer.toString(zo4Var.j()));
        if (!TextUtils.isEmpty(zo4Var.l())) {
            E(xmlSerializer, "long_label", zo4Var.l().toString());
        }
        if (!TextUtils.isEmpty(zo4Var.r())) {
            E(xmlSerializer, "disabled_message", zo4Var.r().toString());
        }
        if (zo4Var.g() != null) {
            E(xmlSerializer, "component", zo4Var.g().flattenToString());
        }
        if (!TextUtils.isEmpty(str2)) {
            E(xmlSerializer, "icon_resource_name", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            E(xmlSerializer, "icon_bitmap_path", str);
        }
        for (Intent intent : zo4Var.x()) {
            xmlSerializer.startTag(null, "intent");
            E(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                E(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                E(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : zo4Var.y()) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                E(xmlSerializer, "name", str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }

    public static final w00 G(my1 my1Var) {
        return new w00(new fh4(my1Var, null), (byte) 4);
    }

    public static final fp3 H(Object obj, Object obj2) {
        return new fp3(obj, obj2);
    }

    public static Map I(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return qi1.j;
        }
        int i = 0;
        if (size == 1) {
            fp3 fp3Var = (fp3) arrayList.get(0);
            fp3Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(fp3Var.j, fp3Var.t);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            fp3 fp3Var2 = (fp3) obj;
            linkedHashMap.put(fp3Var2.j, fp3Var2.t);
        }
        return linkedHashMap;
    }

    public static Map J(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return qi1.j;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static final void K(jh1 jh1Var, sh3 sh3Var) {
        ArrayList arrayList = jh1Var.y;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                pw5.R();
                throw null;
            }
            ah1 ah1Var = (ah1) sh3Var.a((ah1) obj);
            jh1Var.y.set(i, ah1Var);
            if (ah1Var instanceof jh1) {
                K((jh1) ah1Var, sh3Var);
            }
            i = i3;
        }
    }

    public static final LinkedHashMap L(jh1 jh1Var) {
        ArrayList arrayList = jh1Var.y;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                pw5.R();
                throw null;
            }
            ah1 ah1Var = (ah1) obj;
            o22 o22VarY = ah1Var.y();
            fp3 fp3Var = o22VarY.r(be.i) ? (fp3) o22VarY.g(pm0.u, new fp3(null, m22.g)) : new fp3(null, o22VarY);
            e4 e4Var = (e4) fp3Var.j;
            o22 o22Var = (o22) fp3Var.t;
            j3 j3Var = e4Var != null ? e4Var.g : null;
            fp3 fp3Var2 = j3Var instanceof lk2 ? new fp3(j3Var, o22Var) : new fp3(null, o22Var);
            lk2 lk2Var = (lk2) fp3Var2.j;
            o22 o22Var2 = (o22) fp3Var2.t;
            if (lk2Var != null && !(ah1Var instanceof gh1)) {
                String str = lk2Var.g + '+' + i;
                lk2 lk2Var2 = new lk2(str, lk2Var.y);
                Object arrayList2 = linkedHashMap.get(str);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(str, arrayList2);
                }
                ((List) arrayList2).add(lk2Var2);
                ah1Var.r(o22Var2.n(new e4(lk2Var2, 0)));
            }
            if (ah1Var instanceof jh1) {
                for (Map.Entry entry : L((jh1) ah1Var).entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList3 = linkedHashMap.get(str2);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(str2, arrayList3);
                    }
                    ((List) arrayList3).addAll(list);
                }
            }
            i = i3;
        }
        return linkedHashMap;
    }

    public static pi5 M(String str, int i) {
        return new pi5(new xd2(0, 0, 0, 0), str);
    }

    public static void N(int i, int i2) {
        String strR;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strR = bd6.r("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strR = bd6.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strR);
        }
    }

    public static void O(int i, int i2, int i3) {
        String strP;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strP = P(i, i3, "start index");
            } else {
                strP = (i2 < 0 || i2 > i3) ? P(i2, i3, "end index") : bd6.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strP);
        }
    }

    public static String P(int i, int i2, String str) {
        if (i < 0) {
            return bd6.r("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return bd6.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final ob3 a(ju2 ju2Var, h02 h02Var) {
        f34 f34VarJ = pw5.j(ju2Var.a);
        return l(f34VarJ, f34VarJ.getValue(), h02Var, 0, 0);
    }

    public static HashMap b(fp3... fp3VarArr) {
        HashMap map = new HashMap(h(fp3VarArr.length));
        B(map, fp3VarArr);
        return map;
    }

    public static yp5 c(View view) {
        yp5 yp5Var;
        WeakHashMap weakHashMap = yp5.k;
        synchronized (weakHashMap) {
            try {
                Object yp5Var2 = weakHashMap.get(view);
                if (yp5Var2 == null) {
                    yp5Var2 = new yp5(view);
                    weakHashMap.put(view, yp5Var2);
                }
                yp5Var = (yp5) yp5Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yp5Var;
    }

    public static final void d(jh1 jh1Var) {
        ArrayList arrayList = jh1Var.y;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ah1 ah1Var = (ah1) obj;
            if (ah1Var instanceof jh1) {
                d((jh1) ah1Var);
            }
        }
        k52 k52Var = (k52) jh1Var.y().g(cn0.A, null);
        x91 x91Var = w91.g;
        boolean z = (k52Var != null ? k52Var.g : x91Var) instanceof w91;
        u91 u91Var = u91.g;
        if (z && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                k52 k52Var2 = (k52) ((ah1) obj2).y().g(cn0.C, null);
                if ((k52Var2 != null ? k52Var2.g : null) instanceof u91) {
                    jh1Var.r(jh1Var.y().n(new k52(u91Var)));
                    break;
                }
            }
        }
        go5 go5Var = (go5) jh1Var.y().g(cn0.B, null);
        if (go5Var != null) {
            x91Var = go5Var.g;
        }
        if (!(x91Var instanceof w91) || arrayList.isEmpty()) {
            return;
        }
        int size3 = arrayList.size();
        while (i < size3) {
            Object obj3 = arrayList.get(i);
            i++;
            go5 go5Var2 = (go5) ((ah1) obj3).y().g(cn0.D, null);
            if ((go5Var2 != null ? go5Var2.g : null) instanceof u91) {
                jh1Var.r(jh1Var.y().n(new go5(u91Var)));
                return;
            }
        }
    }

    public static hp4 e(XmlPullParser xmlPullParser, Context context) throws XmlPullParserException, IOException {
        Intent intent;
        if (!xmlPullParser.getName().equals("target")) {
            return null;
        }
        String strQ = q(xmlPullParser, "id");
        String strQ2 = q(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(strQ) || TextUtils.isEmpty(strQ2)) {
            return null;
        }
        int i = Integer.parseInt(q(xmlPullParser, "rank"));
        String strQ3 = q(xmlPullParser, "long_label");
        String strQ4 = q(xmlPullParser, "disabled_message");
        String strQ5 = q(xmlPullParser, "component");
        ComponentName componentNameUnflattenFromString = TextUtils.isEmpty(strQ5) ? null : ComponentName.unflattenFromString(strQ5);
        String strQ6 = q(xmlPullParser, "icon_resource_name");
        String strQ7 = q(xmlPullParser, "icon_bitmap_path");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlPullParser.getName().equals("target")) {
                        break;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    if (name.equals("intent")) {
                        String strQ8 = q(xmlPullParser, "action");
                        String strQ9 = q(xmlPullParser, "targetPackage");
                        String strQ10 = q(xmlPullParser, "targetClass");
                        if (strQ8 == null) {
                            intent = null;
                        } else {
                            intent = new Intent(strQ8);
                            if (!TextUtils.isEmpty(strQ9) && !TextUtils.isEmpty(strQ10)) {
                                intent.setClassName(strQ9, strQ10);
                            }
                        }
                        if (intent != null) {
                            arrayList.add(intent);
                        }
                    } else if (name.equals("categories")) {
                        String strQ11 = q(xmlPullParser, "name");
                        if (!TextUtils.isEmpty(strQ11)) {
                            hashSet.add(strQ11);
                        }
                    }
                }
            } else {
                break;
            }
        }
        v92 v92Var = new v92(context, strQ);
        v92Var.c0(strQ2);
        v92Var.b0(i);
        if (!TextUtils.isEmpty(strQ3)) {
            v92Var.Z(strQ3);
        }
        if (!TextUtils.isEmpty(strQ4)) {
            v92Var.V(strQ4);
        }
        if (componentNameUnflattenFromString != null) {
            v92Var.T(componentNameUnflattenFromString);
        }
        if (!arrayList.isEmpty()) {
            v92Var.Y((Intent[]) arrayList.toArray(new Intent[0]));
        }
        if (!hashSet.isEmpty()) {
            v92Var.U(hashSet);
        }
        return new hp4(v92Var.A(), strQ6, strQ7);
    }

    public static final ArrayList f(Map map, xy1 xy1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            jc3 jc3Var = (jc3) entry.getValue();
            Boolean boolValueOf = jc3Var != null ? Boolean.valueOf(jc3Var.y) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !jc3Var.r) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) xy1Var.a((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void g(final j73 j73Var, final pb3 pb3Var, final ob3 ob3Var, final rf4 rf4Var, final cn4 cn4Var, final long j, final float f, final nm0 nm0Var, h02 h02Var, final int i) {
        h02Var.Z(848986741);
        int i2 = i | (h02Var.x(j73Var) ? 4 : 2) | (h02Var.x(pb3Var) ? 32 : 16) | (h02Var.x(rf4Var) ? 2048 : 1024) | (h02Var.x(cn4Var) ? 16384 : 8192) | (h02Var.v(j) ? 131072 : 65536) | (h02Var.r(0.0f) ? 1048576 : 524288) | (h02Var.r(f) ? 8388608 : 4194304) | (h02Var.x(null) ? 67108864 : 33554432) | (h02Var.j(nm0Var) ? 536870912 : 268435456);
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 306783379) != 306783378)) {
            nc5 nc5VarM = ra.M(pb3Var, "DropDownMenu", h02Var, (((i2 >> 3) & 14) | 48) & 126);
            zu4 zu4VarF = jr2.F(f83.t, h02Var);
            zu4 zu4VarF2 = jr2.F(f83.m, h02Var);
            v43 v43Var = new v43(zu4VarF, b);
            te5 te5Var = m50.w;
            g90 g90Var = nc5VarM.g;
            tp3 tp3Var = nc5VarM.n;
            boolean zBooleanValue = ((Boolean) g90Var.n()).booleanValue();
            h02Var.X(143964305);
            float f2 = zBooleanValue ? 1.0f : 0.8f;
            h02Var.b(false);
            Float fValueOf = Float.valueOf(f2);
            boolean zBooleanValue2 = ((Boolean) tp3Var.getValue()).booleanValue();
            h02Var.X(143964305);
            float f3 = zBooleanValue2 ? 1.0f : 0.8f;
            h02Var.b(false);
            final hc5 hc5VarP = ra.p(nc5VarM, fValueOf, Float.valueOf(f3), (no1) v43Var.x(nc5VarM.x(), h02Var, 0), te5Var, h02Var, 0);
            v43 v43Var2 = new v43(zu4VarF2, (byte) 0);
            boolean zBooleanValue3 = ((Boolean) nc5VarM.g.n()).booleanValue();
            h02Var.X(892761509);
            float f4 = zBooleanValue3 ? 1.0f : 0.0f;
            h02Var.b(false);
            Float fValueOf2 = Float.valueOf(f4);
            boolean zBooleanValue4 = ((Boolean) tp3Var.getValue()).booleanValue();
            h02Var.X(892761509);
            float f5 = zBooleanValue4 ? 1.0f : 0.0f;
            h02Var.b(false);
            final hc5 hc5VarP2 = ra.p(nc5VarM, fValueOf2, Float.valueOf(f5), (no1) v43Var2.x(nc5VarM.x(), h02Var, 0), te5Var, h02Var, 0);
            final boolean zBooleanValue5 = ((Boolean) h02Var.a(yd2.g)).booleanValue();
            boolean zL = h02Var.l(zBooleanValue5) | h02Var.x(hc5VarP) | ((i2 & 112) == 32) | h02Var.x(hc5VarP2);
            Object objK = h02Var.K();
            if (zL || objK == oo0.g) {
                Object obj = new xy1() { // from class: s43
                    @Override // defpackage.xy1
                    public final Object a(Object obj2) {
                        float fFloatValue;
                        tp3 tp3Var2 = pb3Var.r;
                        o84 o84Var = (o84) obj2;
                        boolean z = zBooleanValue5;
                        bw4 bw4Var = hc5VarP;
                        float fFloatValue2 = 0.8f;
                        float fFloatValue3 = 1.0f;
                        if (z) {
                            fFloatValue = ((Boolean) tp3Var2.getValue()).booleanValue() ? 1.0f : 0.8f;
                        } else {
                            fFloatValue = ((Number) bw4Var.getValue()).floatValue();
                        }
                        o84Var.j(fFloatValue);
                        if (!z) {
                            fFloatValue2 = ((Number) bw4Var.getValue()).floatValue();
                        } else if (((Boolean) tp3Var2.getValue()).booleanValue()) {
                            fFloatValue2 = 1.0f;
                        }
                        o84Var.t(fFloatValue2);
                        if (!z) {
                            fFloatValue3 = ((Number) hc5VarP2.getValue()).floatValue();
                        } else if (!((Boolean) tp3Var2.getValue()).booleanValue()) {
                            fFloatValue3 = 0.0f;
                        }
                        o84Var.r(fFloatValue3);
                        o84Var.c(((vb5) ob3Var.getValue()).g);
                        return og5.g;
                    }
                };
                h02Var.i0(obj);
                objK = obj;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            uz4.g(yf2.L(g73.g, (xy1) objK), cn4Var, j, 0L, 0.0f, f, null, ue5.m0(-1463404422, new u43((Object) j73Var, (Object) rf4Var, (bz1) nm0Var, (byte) 0), h02Var), h02Var, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(pb3Var, ob3Var, rf4Var, cn4Var, j, f, nm0Var, i) { // from class: t43
                public final /* synthetic */ ob3 a;
                public final /* synthetic */ float c;
                public final /* synthetic */ nm0 i;
                public final /* synthetic */ rf4 m;
                public final /* synthetic */ cn4 q;
                public final /* synthetic */ pb3 t;
                public final /* synthetic */ long w;

                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iJ = aq2.J(385);
                    v13.g(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, (h02) obj2, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static int h(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Object i(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final ob3 j(cw4 cw4Var, h02 h02Var) {
        return l(cw4Var, cw4Var.getValue(), h02Var, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    public static final void k(u64 u64Var, boolean z) {
        ArrayList arrayList = u64Var.y;
        if (!arrayList.isEmpty()) {
            int i = 0;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (!(((ah1) obj) instanceof gh1)) {
                            if (arrayList.size() != 1) {
                                bh1 bh1Var = new bh1();
                                hj0.a0(bh1Var.y, arrayList);
                                arrayList.clear();
                                arrayList.add(bh1Var);
                            }
                        }
                    }
                }
            }
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                ah1 ah1Var = (ah1) obj2;
                ah1Var.getClass();
                ArrayList arrayList2 = ((gh1) ah1Var).y;
                if (arrayList2.size() != 1) {
                    bh1 bh1Var2 = new bh1();
                    hj0.a0(bh1Var2.y, arrayList2);
                    arrayList2.clear();
                    arrayList2.add(bh1Var2);
                }
            }
        } else if (arrayList.size() != 1) {
            bh1 bh1Var3 = new bh1();
            hj0.a0(bh1Var3.y, arrayList);
            arrayList.clear();
            arrayList.add(bh1Var3);
        }
        d(u64Var);
        K(u64Var, new sh3(z));
    }

    public static final ob3 l(er1 er1Var, Object obj, h02 h02Var, int i, int i2) {
        ni1 ni1Var = ni1.j;
        boolean zJ = h02Var.j(ni1Var) | h02Var.j(er1Var);
        Object objK = h02Var.K();
        if (zJ || objK == oo0.g) {
            objK = new hh0(ni1Var, er1Var, (mu0) null);
            h02Var.i0(objK);
        }
        return aq2.A(obj, er1Var, ni1Var, (bz1) objK, h02Var, ((i >> 3) & 14) | (i & 896));
    }

    public static final id4 m(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            id4 id4Var = tag instanceof id4 ? (id4) tag : null;
            if (id4Var != null) {
                return id4Var;
            }
            Object objS = sp2.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static final void n(o22 o22Var, final bz1 bz1Var, qj0 qj0Var, final float f, final nm0 nm0Var, h02 h02Var, int i, int i2) {
        h02Var.Z(1526323303);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= h02Var.j(bz1Var) ? 32 : 16;
        }
        if (((i3 | (((i2 & 4) == 0 && h02Var.j(qj0Var)) ? 256 : 128)) & 9363) == 9362 && h02Var.e()) {
            h02Var.Q();
        } else {
            h02Var.S();
            int i4 = i & 1;
            o22 ax0Var = m22.g;
            if (i4 == 0 || h02Var.k()) {
                if ((i2 & 4) != 0) {
                    qj0Var = ((wf1) h02Var.a(ep0.v)).A;
                }
                o22Var = ax0Var;
            } else {
                h02Var.Q();
            }
            h02Var.s();
            o22 o22VarN = xq2.q(o22Var).n(new mw(qj0Var)).n(jp.g);
            if (Build.VERSION.SDK_INT >= 31) {
                ax0Var = new ax0(new v91(android.R.dimen.system_app_widget_background_radius));
            }
            og0.g(o22VarN.n(ax0Var), 0, 0, ue5.m0(-1375305123, new cz1() { // from class: rd4
                @Override // defpackage.cz1
                public final Object x(Object obj, Object obj2, Object obj3) {
                    fk0 fk0Var = (fk0) obj;
                    h02 h02Var2 = (h02) obj2;
                    ((Integer) obj3).getClass();
                    bz1 bz1Var2 = bz1Var;
                    if (bz1Var2 == null) {
                        h02Var2.X(-2021862660);
                    } else {
                        h02Var2.X(1181704613);
                        bz1Var2.l(h02Var2, 0);
                    }
                    h02Var2.b(false);
                    float f2 = f;
                    xn3 xn3Var = new xn3(lr2.I(f2), lr2.I(0.0f), lr2.I(f2), lr2.I(0.0f));
                    fk0Var.getClass();
                    ue5.n(xn3Var.n(new k52(t91.g)), null, nm0Var, h02Var2, 0, 2);
                    return og5.g;
                }
            }, h02Var), h02Var, 3072, 6);
        }
        o22 o22Var2 = o22Var;
        qj0 qj0Var2 = qj0Var;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ba2(o22Var2, bz1Var, qj0Var2, f, nm0Var, i, i2);
        }
    }

    public static Map o(fp3... fp3VarArr) {
        if (fp3VarArr.length <= 0) {
            return qi1.j;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h(fp3VarArr.length));
        B(linkedHashMap, fp3VarArr);
        return linkedHashMap;
    }

    public static final boolean p(ha4 ha4Var) {
        long j = ha4Var.v;
        return (j >>> 32) == (4294967295L & j) && j == ha4Var.x && j == ha4Var.l && j == ha4Var.j;
    }

    public static String q(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static final ha4 r(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new ha4(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final int s(RemoteViews remoteViews, ad5 ad5Var, int i, int i2, Integer num) {
        int iIntValue;
        if (i == -1) {
            l0.u("viewStubId must not be View.NO_ID");
            return 0;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int iIncrementAndGet = ad5Var.l.incrementAndGet();
            if (iIncrementAndGet >= u02.a) {
                l0.z("There are too many views");
                return 0;
            }
            iIntValue = iIncrementAndGet + u02.t;
        }
        if (iIntValue != -1) {
            remoteViews.setInt(i, "setInflatedId", iIntValue);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return iIntValue;
    }

    public static yp5 t(h02 h02Var) {
        View view = (View) h02Var.a(sa.x);
        yp5 yp5VarC = c(view);
        boolean zJ = h02Var.j(yp5VarC) | h02Var.j(view);
        Object objK = h02Var.K();
        if (zJ || objK == oo0.g) {
            objK = new pc5(yp5VarC, view, (byte) 4);
            h02Var.i0(objK);
        }
        k33.j(yp5VarC, (xy1) objK, h02Var);
        return yp5VarC;
    }

    public static wp2 u(bt2 bt2Var, my1 my1Var) {
        hi0 hi0Var = hi0.D;
        int iOrdinal = bt2Var.ordinal();
        if (iOrdinal == 0) {
            return new o05(my1Var);
        }
        if (iOrdinal == 1) {
            oc4 oc4Var = new oc4();
            oc4Var.j = my1Var;
            oc4Var.t = hi0Var;
            return oc4Var;
        }
        if (iOrdinal != 2) {
            uo1.g();
            return null;
        }
        bh5 bh5Var = new bh5();
        bh5Var.j = my1Var;
        bh5Var.t = hi0Var;
        return bh5Var;
    }

    public static yy4 v() {
        return new yy4(null);
    }

    public static final boolean w(k85 k85Var) {
        jt3 jt3Var;
        zt3 zt3Var = k85Var.r;
        di1 di1Var = (zt3Var == null || (jt3Var = zt3Var.y) == null) ? null : new di1(jt3Var.y);
        boolean z = false;
        if (di1Var != null && di1Var.g == 1) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0017  */
    public static final long x(ne2 ne2Var, ne2 ne2Var2) {
        float fMin;
        int i = ne2Var2.g;
        int i2 = ne2Var2.n;
        int i3 = ne2Var2.g;
        int i4 = ne2Var2.r;
        int i5 = ne2Var2.y;
        int i6 = ne2Var.r;
        int i7 = ne2Var.y;
        int i8 = ne2Var.n;
        int i9 = ne2Var.g;
        float fMin2 = 1.0f;
        if (i >= i6) {
            fMin = 0.0f;
        } else if (i4 <= i9) {
            fMin = 1.0f;
        } else if (ne2Var2.n() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(ne2Var.r, i4) + Math.max(i9, i3)) / 2) - i3) / ne2Var2.n();
        }
        if (i5 >= i8) {
            fMin2 = 0.0f;
        } else if (i2 > i7) {
            if (ne2Var2.y() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i8, i2) + Math.max(i7, i5)) / 2) - i5) / ne2Var2.y();
            }
        }
        return xs2.r(fMin, fMin2);
    }

    public static final void y(bz1 bz1Var, my1 my1Var, j73 j73Var, bz1 bz1Var2, bz1 bz1Var3, boolean z, l43 l43Var, zn3 zn3Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-1325192924);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(bz1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(my1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.x(j73Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(bz1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.j(bz1Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.x(l43Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= h02Var.x(zn3Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= h02Var.x(null) ? 67108864 : 33554432;
        }
        if (h02Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            j73 j73VarD0 = ue5.d0(mq4.m(mq4.r(ue5.H(j73Var, null, k94.g(0.0f, 6, 0L, true), z, null, my1Var, 24), 1.0f), 112.0f, 48.0f, 280.0f, 8), zn3Var);
            kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var, 48);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarD0);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, kb4VarG);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            g75.g(((mf5) h02Var.a(of5.g)).w, ue5.m0(865999929, new w43(bz1Var2, l43Var, z, bz1Var3, bz1Var), h02Var), h02Var, 48);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new i90(bz1Var, my1Var, j73Var, bz1Var2, bz1Var3, z, l43Var, zn3Var, i);
        }
    }

    public static mr z(File file, Context context) {
        hp4 hp4VarE;
        zo4 zo4Var;
        mr mrVar = new mr(0);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                if (file.exists()) {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStream, "UTF_8");
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2 && xmlPullParserNewPullParser.getName().equals("target") && (hp4VarE = e(xmlPullParserNewPullParser, context)) != null && (zo4Var = hp4VarE.r) != null) {
                            mrVar.put(zo4Var.v(), hp4VarE);
                        }
                        file.delete();
                        Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e);
                        return mrVar;
                    }
                }
                fileInputStream.close();
                return mrVar;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e);
            return mrVar;
        }
    }
}
