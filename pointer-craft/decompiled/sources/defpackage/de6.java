package defpackage;

import android.content.Context;
import android.content.Intent;
import io.appground.blek.widget.WidgetConfigurationActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class de6 {
    public static final sj0 g = sj0.s;
    public static final in4 y = in4.j;

    public static final void g(int i, int i2, h02 h02Var) {
        h02Var.Z(-1381412185);
        int i3 = (h02Var.n(i) ? 4 : 2) | i2;
        byte b = 0;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) h02Var.a(ep0.y);
            Intent intent = new Intent(context, (Class<?>) WidgetConfigurationActivity.class);
            intent.putExtra("appWidgetId", i);
            a11.y(gn5.g(h02Var), ue5.m0(-2106602608, new wy0(context, intent, b), h02Var), h02Var, 48);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new xy0(i, i2, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    public static final lz3 y(jz3 jz3Var) {
        String str;
        List listD;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        Object obj;
        String str6;
        boolean zP = yf2.p(jz3Var.n, "subs");
        String str7 = "";
        if (zP) {
            ArrayList arrayList = jz3Var.t;
            iz3 iz3Var = arrayList != null ? (iz3) cj0.l0(arrayList) : null;
            hz3 hz3Var = iz3Var != null ? (hz3) cj0.l0(iz3Var.y.g) : null;
            if (hz3Var == null || (str4 = hz3Var.g) == null) {
                str4 = "";
            }
            Long lValueOf = Long.valueOf(hz3Var != null ? hz3Var.y : 0L);
            if (hz3Var != null && (str6 = hz3Var.r) != null) {
                str7 = str6;
            }
            String str8 = hz3Var != null ? hz3Var.n : null;
            if (iz3Var != null) {
                ArrayList arrayList2 = iz3Var.y.g;
                int size = arrayList2.size();
                int i = 0;
                do {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i);
                    i++;
                } while (((hz3) obj).y != 0);
                hz3 hz3Var2 = (hz3) obj;
                if (hz3Var2 != null) {
                    str5 = hz3Var2.n;
                } else {
                    str5 = null;
                }
            } else {
                str5 = null;
            }
            listD = pw5.d(str4, lValueOf, str7, str8, str5);
        } else {
            gz3 gz3VarG = jz3Var.g();
            if (gz3VarG == null || (str = gz3VarG.g) == null) {
                str = "";
            }
            Long lValueOf2 = Long.valueOf(gz3VarG != null ? gz3VarG.y : 0L);
            if (gz3VarG != null && (str2 = gz3VarG.r) != null) {
                str7 = str2;
            }
            listD = pw5.d(str, lValueOf2, str7, null, null);
        }
        Object obj2 = listD.get(0);
        Object obj3 = listD.get(1);
        Object obj4 = listD.get(2);
        Object obj5 = listD.get(3);
        Object obj6 = listD.get(4);
        String str9 = jz3Var.r;
        str9.getClass();
        String str10 = jz3Var.v;
        str10.getClass();
        String str11 = jz3Var.x;
        str11.getClass();
        obj2.getClass();
        String str12 = (String) obj2;
        obj3.getClass();
        long jLongValue = ((Long) obj3).longValue();
        obj4.getClass();
        String str13 = (String) obj4;
        String str14 = obj5 instanceof String ? (String) obj5 : null;
        if (obj6 instanceof String) {
            j = jLongValue;
            str3 = (String) obj6;
        } else {
            str3 = null;
            j = jLongValue;
        }
        return new lz3(str9, str10, str11, str12, j, str13, zP, str14, str3);
    }
}
