package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.ViewConfiguration;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ym {
    public static int a(Object obj) {
        return ((Icon) obj).getType();
    }

    public static boolean c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static Typeface g(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static int j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static String l(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static Uri m(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static String[] n(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static void q(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static TextClassifier r(Context context, fi4 fi4Var) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = fi4Var.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                up.y();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static PrecomputedText.Params t(en enVar) {
        return enVar.getTextMetricsParams();
    }

    public static long v(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void w(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static int x(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static Handler y(Looper looper) {
        return Handler.createAsync(looper);
    }
}
