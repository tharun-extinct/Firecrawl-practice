package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class i33 extends en {
    @Override // defpackage.en, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (mq2.z(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, p24.e);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int iS = -1;
            for (int i2 = 0; i2 < 2 && iS < 0; i2++) {
                iS = zq2.s(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iS >= 0) {
                setLineHeight(iS);
            }
        }
    }
}
