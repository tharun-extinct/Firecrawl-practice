package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sj {
    public static void a(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void b(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void c(Resources.Theme theme) {
        theme.rebase();
    }

    public static void g() {
        Trace.beginAsyncSection("GlanceAppWidget::update", 0);
    }

    public static void i(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static ViewStructure j(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static AutofillId l(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static void m(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static String n(Context context) {
        return context.getOpPackageName();
    }

    public static void p(em emVar, Rect rect) {
        emVar.setEpicenterBounds(rect);
    }

    public static void q(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static void r() {
        Trace.endAsyncSection("GlanceAppWidget::update", 0);
    }

    public static void s(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void t(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void u(em emVar) {
        emVar.setIsClippedToScreen(true);
    }

    public static int v(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static Insets w(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static boolean x() {
        return Trace.isEnabled();
    }

    public static void y(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }

    public static void z(PopupWindow popupWindow) {
        popupWindow.setTouchModal(false);
    }
}
