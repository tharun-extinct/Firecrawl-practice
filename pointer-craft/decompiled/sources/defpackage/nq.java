package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.DisplayCutout;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes.dex */
public abstract class nq {
    public static void g(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        remoteViews.addStableView(i, remoteViews2, i2);
    }

    public static RemoteViews n(int i, int i2, String str) {
        return new RemoteViews(str, i, i2);
    }

    public static Path r(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static void v(RemoteViews remoteViews, int i, x91 x91Var) {
        if (x91Var instanceof w91) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (x91Var instanceof t91) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
            return;
        }
        if (x91Var instanceof s91) {
            remoteViews.setViewLayoutHeight(i, ((s91) x91Var).g, 1);
            return;
        }
        if (x91Var instanceof v91) {
            remoteViews.setViewLayoutHeightDimen(i, ((v91) x91Var).g);
        } else if (x91Var.equals(u91.g)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            uo1.g();
        }
    }

    public static void x(RemoteViews remoteViews, int i, x91 x91Var) {
        if (x91Var instanceof w91) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (x91Var instanceof t91) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
            return;
        }
        if (x91Var instanceof s91) {
            remoteViews.setViewLayoutWidth(i, ((s91) x91Var).g, 1);
            return;
        }
        if (x91Var instanceof v91) {
            remoteViews.setViewLayoutWidthDimen(i, ((v91) x91Var).g);
        } else if (x91Var.equals(u91.g)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            uo1.g();
        }
    }

    public static void y(RemoteViews remoteViews, int i, x91 x91Var) {
        if (Build.VERSION.SDK_INT < 31) {
            l0.t("setClipToOutline is only available on SDK 31 and higher");
            return;
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (x91Var instanceof s91) {
            remoteViews.setViewOutlinePreferredRadius(i, ((s91) x91Var).g, 1);
        } else if (x91Var instanceof v91) {
            remoteViews.setViewOutlinePreferredRadiusDimen(i, ((v91) x91Var).g);
        } else {
            uo1.d(x91Var.getClass().getCanonicalName(), "Rounded corners should not be ");
        }
    }
}
