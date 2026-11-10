package defpackage;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes2.dex */
public final class i45 extends u35 {
    public final Drawable n;
    public final int r;
    public final TextClassification y;

    public i45(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.y = textClassification;
        this.r = i;
        this.n = drawable;
    }

    public final String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.g + ", textClassification=" + this.y + ", index=" + this.r + ", icon=" + this.n + ")";
    }
}
