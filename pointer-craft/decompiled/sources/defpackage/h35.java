package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class h35 {
    public static final Layout.Alignment g;
    public static final Layout.Alignment y;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (yf2.p(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (yf2.p(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        g = alignment;
        y = alignment2;
    }
}
