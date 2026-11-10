package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.b41;
import defpackage.b64;
import defpackage.cm0;
import defpackage.f52;
import defpackage.hi0;
import defpackage.hp1;
import defpackage.kl0;
import defpackage.kp1;
import defpackage.l0;
import defpackage.ll0;
import defpackage.p51;
import defpackage.ro1;
import defpackage.sp2;
import defpackage.tg1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Registrar implements ComponentRegistrar {
    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(cm0 cm0Var) {
        return new FirebaseInstanceId((ro1) cm0Var.g(ro1.class), cm0Var.v(b41.class), cm0Var.v(f52.class), (hp1) cm0Var.g(hp1.class));
    }

    public static final /* synthetic */ kp1 lambda$getComponents$1$Registrar(cm0 cm0Var) {
        return new b64((FirebaseInstanceId) cm0Var.g(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ll0> getComponents() {
        kl0 kl0VarG = ll0.g(FirebaseInstanceId.class);
        kl0VarG.g(p51.g(ro1.class));
        kl0VarG.g(new p51(0, 1, b41.class));
        kl0VarG.g(new p51(0, 1, f52.class));
        kl0VarG.g(p51.g(hp1.class));
        kl0VarG.x = hi0.C;
        if (kl0VarG.n) {
            l0.z("Instantiation type has already been set.");
            return null;
        }
        kl0VarG.n = true;
        ll0 ll0VarY = kl0VarG.y();
        kl0 kl0VarG2 = ll0.g(kp1.class);
        kl0VarG2.g(p51.g(FirebaseInstanceId.class));
        kl0VarG2.x = tg1.u;
        return Arrays.asList(ll0VarY, kl0VarG2.y(), sp2.t("fire-iid", "21.1.0"));
    }
}
