package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class em2 {
    public final CharSequence g;
    public CharSequence j;
    public boolean l;
    public final int r;
    public BoringLayout.Metrics x;
    public final TextPaint y;
    public float n = Float.NaN;
    public float v = Float.NaN;

    public em2(CharSequence charSequence, TextPaint textPaint, int i) {
        this.g = charSequence;
        this.y = textPaint;
        this.r = i;
    }

    public final BoringLayout.Metrics g() {
        if (!this.l) {
            TextDirectionHeuristic textDirectionHeuristicY = l75.y(this.r);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.g;
            TextPaint textPaint = this.y;
            this.x = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicY, true, null) : gz5.r(charSequence, textPaint, textDirectionHeuristicY);
            this.l = true;
        }
        return this.x;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public final float r() {
        if (!Float.isNaN(this.n)) {
            return this.n;
        }
        BoringLayout.Metrics metricsG = g();
        float fCeil = metricsG != null ? metricsG.width : -1;
        TextPaint textPaint = this.y;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(y(), 0, y().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.g;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (zq2.z(spanned, qt2.class) || zq2.z(spanned, pt2.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.n = fCeil;
        return fCeil;
    }

    public final CharSequence y() {
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.g;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (zq2.z(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.j = charSequence2;
        return charSequence2;
    }
}
