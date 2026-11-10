package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.cl;
import defpackage.d33;
import defpackage.el;
import defpackage.en;
import defpackage.f23;
import defpackage.fm;
import defpackage.gp4;
import defpackage.i33;
import defpackage.kn;
import defpackage.mq2;
import defpackage.p24;
import defpackage.z23;
import defpackage.zk;
import defpackage.zq2;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends kn {
    @Override // defpackage.kn
    public final zk g(Context context, AttributeSet attributeSet) {
        return new f23(context, attributeSet);
    }

    @Override // defpackage.kn
    public final fm n(Context context, AttributeSet attributeSet) {
        return new d33(context, attributeSet);
    }

    @Override // defpackage.kn
    public final el r(Context context, AttributeSet attributeSet) {
        return new z23(context, attributeSet);
    }

    @Override // defpackage.kn
    public final en v(Context context, AttributeSet attributeSet) {
        i33 i33Var = new i33(gp4.X(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = i33Var.getContext();
        if (mq2.z(context2.getTheme(), io.appground.blek.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = p24.A;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iS = -1;
            for (int i = 0; i < 2 && iS < 0; i++) {
                iS = zq2.s(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iS == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, p24.e);
                    Context context3 = i33Var.getContext();
                    int[] iArr3 = {2, 4};
                    int iS2 = -1;
                    for (int i2 = 0; i2 < 2 && iS2 < 0; i2++) {
                        iS2 = zq2.s(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iS2 >= 0) {
                        i33Var.setLineHeight(iS2);
                    }
                }
            }
        }
        return i33Var;
    }

    @Override // defpackage.kn
    public final cl y(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }
}
