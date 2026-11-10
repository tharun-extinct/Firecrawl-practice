package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vk5 {
    public static String[] g(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static ut0 y(View view, ut0 ut0Var) {
        ContentInfo contentInfoB = ut0Var.g.b();
        Objects.requireNonNull(contentInfoB);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoB);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoB ? ut0Var : new ut0(new v92(contentInfoPerformReceiveContent));
    }
}
