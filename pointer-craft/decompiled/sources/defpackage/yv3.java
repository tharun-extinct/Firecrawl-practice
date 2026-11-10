package defpackage;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class yv3 {
    public final TextPaint g;
    public final int n;
    public final int r;
    public final TextDirectionHeuristic y;

    public yv3(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.g = textPaint;
        this.y = textDirectionHeuristic;
        this.r = i;
        this.n = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yv3)) {
            return false;
        }
        yv3 yv3Var = (yv3) obj;
        int i = yv3Var.r;
        TextPaint textPaint = yv3Var.g;
        if (this.r != i || this.n != yv3Var.n) {
            return false;
        }
        TextPaint textPaint2 = this.g;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.y == yv3Var.y;
    }

    public final int g() {
        return this.r;
    }

    public final int hashCode() {
        TextPaint textPaint = this.g;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.y, Integer.valueOf(this.r), Integer.valueOf(this.n));
    }

    public final TextPaint n() {
        return this.g;
    }

    public final TextDirectionHeuristic r() {
        return this.y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.g;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (Build.VERSION.SDK_INT >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.y);
        sb.append(", breakStrategy=" + this.r);
        sb.append(", hyphenationFrequency=" + this.n);
        sb.append("}");
        return sb.toString();
    }

    public final int y() {
        return this.n;
    }

    public yv3(PrecomputedText.Params params) {
        this.g = params.getTextPaint();
        this.y = params.getTextDirection();
        this.r = params.getBreakStrategy();
        this.n = params.getHyphenationFrequency();
    }
}
