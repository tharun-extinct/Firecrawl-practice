package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public enum d45 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(af6.g, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(af6.y, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(af6.r, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(af6.n, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(af6.v, Build.VERSION.SDK_INT <= 26 ? io.appground.blek.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);

    public final int a;
    public final Object j;
    public final int t;

    d45(Object obj, int i, int i2) {
        this.j = obj;
        this.t = i;
        this.a = i2;
    }
}
