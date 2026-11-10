package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ef5 extends df5 {
    @Override // defpackage.df5
    public final Font M(tv1 tv1Var) {
        Font fontN;
        Uri uri = tv1Var.g;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = tv1Var.v;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontN = xe5.n(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontN;
                }
                try {
                    return new Font.Builder(fontN).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
