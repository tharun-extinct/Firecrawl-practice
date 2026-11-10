package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class na {
    public static /* bridge */ /* synthetic */ ScrollCaptureSession a(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse c(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ ContentInfo l(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ ContentInfo.Builder v(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }
}
