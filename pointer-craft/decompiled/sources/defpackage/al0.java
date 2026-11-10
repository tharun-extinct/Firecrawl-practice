package defpackage;

import android.app.NotificationChannel;
import android.companion.CompanionDeviceManager;
import android.view.autofill.AutofillManager;
import android.view.textclassifier.TextClassifier;
import java.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class al0 {
    public static /* bridge */ /* synthetic */ Class A() {
        return AutofillManager.class;
    }

    public static /* synthetic */ NotificationChannel g() {
        return new NotificationChannel("connection", "Device connection", 3);
    }

    public static /* bridge */ /* synthetic */ AutofillManager n(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return Duration.class;
    }

    public static /* synthetic */ void t() {
    }

    public static /* bridge */ /* synthetic */ TextClassifier v(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return CompanionDeviceManager.class;
    }

    public static /* bridge */ /* synthetic */ void z(Object obj) {
    }
}
