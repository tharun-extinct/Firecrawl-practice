package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xx5 {
    public static final nm0 g = new nm0(210148896, false, new os(5));
    public static ha2 y;

    public static final ha2 g() {
        ha2 ha2Var = y;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.KeyboardCommandKey", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3VarJ = du4.j(17.5f, 3.0f);
        kq3VarJ.y(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f);
        kq3VarJ.q(8.0f);
        kq3VarJ.v(-4.0f);
        kq3VarJ.q(6.5f);
        kq3VarJ.y(10.0f, 4.57f, 8.43f, 3.0f, 6.5f, 3.0f);
        kq3VarJ.a(3.0f, 4.57f, 3.0f, 6.5f);
        kq3VarJ.a(4.57f, 10.0f, 6.5f, 10.0f);
        kq3VarJ.n(8.0f);
        kq3VarJ.w(4.0f);
        kq3VarJ.n(6.5f);
        kq3VarJ.y(4.57f, 14.0f, 3.0f, 15.57f, 3.0f, 17.5f);
        kq3VarJ.a(4.57f, 21.0f, 6.5f, 21.0f);
        kq3VarJ.m(3.5f, -1.57f, 3.5f, -3.5f);
        kq3VarJ.q(16.0f);
        kq3VarJ.v(4.0f);
        kq3VarJ.w(1.5f);
        kq3VarJ.r(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        kq3VarJ.m(3.5f, -1.57f, 3.5f, -3.5f);
        kq3VarJ.a(19.43f, 14.0f, 17.5f, 14.0f);
        kq3VarJ.n(16.0f);
        kq3VarJ.w(-4.0f);
        kq3VarJ.v(1.5f);
        kq3VarJ.r(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        kq3VarJ.a(19.43f, 3.0f, 17.5f, 3.0f);
        kq3VarJ.x(17.5f, 3.0f);
        kq3VarJ.g();
        kq3VarJ.j(16.0f, 8.0f);
        kq3VarJ.q(6.5f);
        kq3VarJ.y(16.0f, 5.67f, 16.67f, 5.0f, 17.5f, 5.0f);
        kq3VarJ.a(19.0f, 5.67f, 19.0f, 6.5f);
        kq3VarJ.a(18.33f, 8.0f, 17.5f, 8.0f);
        kq3VarJ.n(16.0f);
        kq3VarJ.x(16.0f, 8.0f);
        kq3VarJ.g();
        kq3VarJ.j(6.5f, 8.0f);
        kq3VarJ.y(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f);
        kq3VarJ.a(5.67f, 5.0f, 6.5f, 5.0f);
        kq3VarJ.a(8.0f, 5.67f, 8.0f, 6.5f);
        kq3VarJ.q(8.0f);
        kq3VarJ.n(6.5f);
        kq3VarJ.x(6.5f, 8.0f);
        kq3VarJ.g();
        kq3VarJ.j(10.0f, 14.0f);
        kq3VarJ.w(-4.0f);
        kq3VarJ.v(4.0f);
        kq3VarJ.w(4.0f);
        kq3VarJ.n(10.0f);
        kq3VarJ.x(10.0f, 14.0f);
        kq3VarJ.g();
        kq3VarJ.j(17.5f, 19.0f);
        kq3VarJ.r(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        kq3VarJ.q(16.0f);
        kq3VarJ.v(1.5f);
        kq3VarJ.r(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        kq3VarJ.a(18.33f, 19.0f, 17.5f, 19.0f);
        kq3VarJ.x(17.5f, 19.0f);
        kq3VarJ.g();
        kq3VarJ.j(6.5f, 19.0f);
        kq3VarJ.y(5.67f, 19.0f, 5.0f, 18.33f, 5.0f, 17.5f);
        kq3VarJ.a(5.67f, 16.0f, 6.5f, 16.0f);
        kq3VarJ.n(8.0f);
        kq3VarJ.w(1.5f);
        kq3VarJ.y(8.0f, 18.33f, 7.33f, 19.0f, 6.5f, 19.0f);
        kq3VarJ.x(6.5f, 19.0f);
        kq3VarJ.g();
        ga2.g(ga2Var, kq3VarJ.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        y = ha2VarY;
        return ha2VarY;
    }

    public static final void r(RemoteViews remoteViews, ad5 ad5Var, ih1 ih1Var) {
        kd2 kd2VarR = ip2.r(remoteViews, ad5Var, np2.m, ih1Var.n);
        int i = kd2VarR.g;
        CharSequence charSequence = ih1Var.g;
        j85 j85Var = ih1Var.y;
        int i2 = ih1Var.r;
        Context context = ad5Var.g;
        if (i2 != Integer.MAX_VALUE) {
            remoteViews.setInt(i, "setMaxLines", i2);
        }
        if (j85Var == null) {
            remoteViews.setTextViewText(i, charSequence);
        } else {
            SpannableString spannableString = new SpannableString(charSequence);
            int length = spannableString.length();
            n85 n85Var = j85Var.y;
            if (n85Var != null) {
                long j = n85Var.g;
                if ((1095216660480L & j) != 4294967296L) {
                    l0.u("Only Sp is currently supported for font sizes");
                    return;
                }
                remoteViews.setTextViewTextSize(i, 2, n85.r(j));
            }
            ArrayList arrayList = new ArrayList();
            if (j85Var.r != null) {
                arrayList.add(new TextAppearanceSpan(context, R.style.Glance_AppWidget_TextAppearance_Medium));
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                spannableString.setSpan((ParcelableSpan) obj, 0, length, 17);
            }
            remoteViews.setTextViewText(i, spannableString);
            qj0 qj0Var = j85Var.g;
            if (qj0Var instanceof np1) {
                remoteViews.setTextColor(i, ra.U(((np1) qj0Var).g));
            } else if (qj0Var instanceof o74) {
                if (Build.VERSION.SDK_INT >= 31) {
                    r64.l(remoteViews, i, "setTextColor", ((o74) qj0Var).g);
                } else {
                    remoteViews.setTextColor(i, ra.U(((o74) qj0Var).g(context)));
                }
            } else if (!(qj0Var instanceof w01)) {
                Log.w("GlanceAppWidget", "Unexpected text color: " + qj0Var);
            } else if (Build.VERSION.SDK_INT >= 31) {
                w01 w01Var = (w01) qj0Var;
                r64.x(remoteViews, i, "setTextColor", ra.U(w01Var.g), ra.U(w01Var.y));
            } else {
                remoteViews.setTextColor(i, ra.U(((w01) qj0Var).g(context)));
            }
        }
        m50.e(ad5Var, remoteViews, ih1Var.n, kd2VarR);
    }

    public static final er y(Object[] objArr) {
        objArr.getClass();
        return new er(objArr);
    }
}
