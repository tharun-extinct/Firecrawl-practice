package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.c93;
import defpackage.cm1;
import defpackage.d93;
import defpackage.hj6;
import defpackage.kl0;
import defpackage.ll0;
import defpackage.p51;
import defpackage.ri6;
import defpackage.xg6;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        kl0 kl0VarG = ll0.g(d93.class);
        kl0VarG.g(new p51(2, 0, c93.class));
        kl0VarG.x = cm1.s;
        ll0 ll0VarY = kl0VarG.y();
        xg6 xg6Var = ri6.m;
        Object[] objArr = {ll0VarY};
        for (int i = 0; i <= 0; i++) {
            if (objArr[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return new hj6(1, objArr);
    }
}
