package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.util.LongSparseArray;
import android.util.SizeF;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import android.widget.RemoteViews;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wa {
    public static EdgeEffect g(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static StrictMode.VmPolicy.Builder j(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static void l(ya yaVar, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (yf2.p(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            r(yaVar, longSparseArray);
        } else {
            yaVar.j.post(new va(yaVar, longSparseArray, (byte) 0));
        }
    }

    public static float n(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static void r(ya yaVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        ij4 ij4Var;
        gj4 gj4Var;
        xy1 xy1Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseC = na.c(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseC != null && (value = viewTranslationResponseC.getValue("android:text")) != null && (text = value.getText()) != null && (ij4Var = (ij4) yaVar.n().y((int) jKeyAt)) != null && (gj4Var = ij4Var.g) != null) {
                Object objL = gj4Var.n.j.l(yi4.q);
                if (objL == null) {
                    objL = null;
                }
                p1 p1Var = (p1) objL;
                if (p1Var != null && (xy1Var = (xy1) p1Var.y) != null) {
                }
            }
        }
    }

    public static void t(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void v(ya yaVar, long[] jArr, Consumer consumer) {
        gj4 gj4Var;
        for (long j : jArr) {
            ij4 ij4Var = (ij4) yaVar.n().y((int) j);
            if (ij4Var != null && (gj4Var = ij4Var.g) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(yaVar.j.getAutofillId(), gj4Var.x);
                Object objL = gj4Var.n.j.l(kj4.C);
                if (objL == null) {
                    objL = null;
                }
                List list = (List) objL;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new cj(tw2.g(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float x(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static RemoteViews y(Map map) {
        return new RemoteViews((Map<SizeF, RemoteViews>) map);
    }
}
