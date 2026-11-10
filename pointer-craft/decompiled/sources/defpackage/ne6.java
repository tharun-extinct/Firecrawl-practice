package defpackage;

import android.view.inputmethod.ExtractedText;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ne6 {
    public static ha2 l;
    public static final sj0 g = sj0.B;
    public static final in4 y = in4.t;
    public static final sj0 r = sj0.b;
    public static final float n = 4.0f;
    public static final float v = 32.0f;
    public static final float x = 1.0f;

    public static final ExtractedText g(k65 k65Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = k65Var.g.t;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = k65Var.y;
        extractedText.selectionStart = u75.x(j);
        extractedText.selectionEnd = u75.v(j);
        extractedText.flags = !tx4.R(k65Var.g.t, '\n') ? 1 : 0;
        return extractedText;
    }
}
