package defpackage;

import android.animation.AnimatorSet;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tm {
    public static void a(AnimatorSet animatorSet) {
        animatorSet.getClass();
        animatorSet.reverse();
    }

    public static void b(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void c(AnimatorSet animatorSet, long j) {
        animatorSet.getClass();
        animatorSet.setCurrentPlayTime(j);
    }

    public static void d(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static void f(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static Notification.Builder g(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void h(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void i(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void j(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }

    public static void k(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static float l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void m(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static float n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void o(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void p(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void q(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static float r(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void s(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static Intent t(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static void u(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static float v(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void w(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static TextClassifier x(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public static Icon y(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void z(Notification.Builder builder) {
        builder.setShortcutId(null);
    }
}
