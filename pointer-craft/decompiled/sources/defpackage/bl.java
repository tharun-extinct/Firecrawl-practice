package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bl implements et0 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ TextView y;

    public /* synthetic */ bl(TextView textView, byte b) {
        this.g = b;
        this.y = textView;
    }

    @Override // defpackage.et0
    public final void accept(Object obj) {
        byte b = this.g;
        TextView textView = this.y;
        switch (b) {
            case 0:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 1:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            default:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
        }
    }
}
