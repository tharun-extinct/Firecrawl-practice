package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: loaded from: classes2.dex */
public final class xl {
    public final /* synthetic */ yl g;

    public xl(yl ylVar) {
        this.g = ylVar;
    }

    public final TextClassifier g() {
        return super/*android.widget.EditText*/.getTextClassifier();
    }

    public final void y(TextClassifier textClassifier) {
        super/*android.widget.EditText*/.setTextClassifier(textClassifier);
    }
}
