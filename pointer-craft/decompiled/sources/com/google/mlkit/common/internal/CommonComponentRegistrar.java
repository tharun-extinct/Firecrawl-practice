package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.br2;
import defpackage.cm1;
import defpackage.cy5;
import defpackage.d52;
import defpackage.d93;
import defpackage.f63;
import defpackage.f73;
import defpackage.h63;
import defpackage.hi0;
import defpackage.io4;
import defpackage.jx5;
import defpackage.kl0;
import defpackage.l76;
import defpackage.lh0;
import defpackage.ll0;
import defpackage.p51;
import defpackage.p64;
import defpackage.q64;
import defpackage.qx5;
import defpackage.tg1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ll0 ll0Var = io4.y;
        kl0 kl0VarG = ll0.g(f73.class);
        kl0VarG.g(p51.g(f63.class));
        kl0VarG.x = d52.c;
        ll0 ll0VarY = kl0VarG.y();
        kl0 kl0VarG2 = ll0.g(h63.class);
        kl0VarG2.x = f73.c;
        ll0 ll0VarY2 = kl0VarG2.y();
        kl0 kl0VarG3 = ll0.g(q64.class);
        kl0VarG3.g(new p51(2, 0, p64.class));
        kl0VarG3.x = d93.c;
        ll0 ll0VarY3 = kl0VarG3.y();
        kl0 kl0VarG4 = ll0.g(cm1.class);
        kl0VarG4.g(new p51(1, 1, h63.class));
        kl0VarG4.x = l76.c;
        ll0 ll0VarY4 = kl0VarG4.y();
        kl0 kl0VarG5 = ll0.g(lh0.class);
        kl0VarG5.x = hi0.E;
        ll0 ll0VarY5 = kl0VarG5.y();
        kl0 kl0VarG6 = ll0.g(hi0.class);
        kl0VarG6.g(p51.g(lh0.class));
        kl0VarG6.x = tg1.h;
        ll0 ll0VarY6 = kl0VarG6.y();
        kl0 kl0VarG7 = ll0.g(l76.class);
        kl0VarG7.g(p51.g(f63.class));
        kl0VarG7.x = f73.i;
        ll0 ll0VarY7 = kl0VarG7.y();
        kl0 kl0VarG8 = ll0.g(p64.class);
        kl0VarG8.v = true;
        kl0VarG8.g(new p51(1, 1, l76.class));
        kl0VarG8.x = d93.i;
        ll0 ll0VarY8 = kl0VarG8.y();
        jx5 jx5Var = qx5.m;
        Object[] objArr = {ll0Var, ll0VarY, ll0VarY2, ll0VarY3, ll0VarY4, ll0VarY5, ll0VarY6, ll0VarY7, ll0VarY8};
        br2.G(9, objArr);
        return new cy5(9, objArr);
    }
}
