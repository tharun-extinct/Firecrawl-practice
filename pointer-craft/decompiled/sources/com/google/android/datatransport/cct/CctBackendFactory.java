package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.dd5;
import defpackage.hu;
import defpackage.ic0;
import defpackage.vx0;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public dd5 create(vx0 vx0Var) {
        Context context = ((hu) vx0Var).g;
        hu huVar = (hu) vx0Var;
        return new ic0(context, huVar.y, huVar.r);
    }
}
