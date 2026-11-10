package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class yv1 {
    public final int g;
    public final Notification r;
    public final int y;

    public yv1(int i, Notification notification, int i2) {
        this.g = i;
        this.r = notification;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yv1.class != obj.getClass()) {
            return false;
        }
        yv1 yv1Var = (yv1) obj;
        if (this.g == yv1Var.g && this.y == yv1Var.y) {
            return this.r.equals(yv1Var.r);
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode() + (((this.g * 31) + this.y) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.g + ", mForegroundServiceType=" + this.y + ", mNotification=" + this.r + '}';
    }
}
