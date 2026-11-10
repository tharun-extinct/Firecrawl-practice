package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class zm {
    public final TextView g;
    public Typeface n;
    public Typeface r;
    public String v;
    public final et0 y;

    public zm(TextView textView, et0 et0Var) {
        this.g = textView;
        this.y = et0Var;
    }

    public final boolean g(String str) {
        int i;
        Typeface typeface = this.r;
        TextView textView = this.g;
        TextPaint paint = textView.getPaint();
        if (this.n != paint.getTypeface()) {
            Log.w("FontVarSettings", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = paint.getTypeface();
        }
        if (Build.VERSION.SDK_INT < 31 || (i = textView.getContext().getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            i = 0;
        }
        if (i == Integer.MAX_VALUE) {
            i = 0;
        }
        Typeface typefaceG = xm.g(typeface, str, i);
        if (typefaceG == null) {
            return false;
        }
        this.n = typefaceG;
        this.y.accept(typefaceG);
        this.v = str;
        return true;
    }
}
