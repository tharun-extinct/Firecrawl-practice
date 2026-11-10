package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.cm0;
import defpackage.d52;
import defpackage.e24;
import defpackage.e52;
import defpackage.gp1;
import defpackage.hp1;
import defpackage.ik4;
import defpackage.iw;
import defpackage.jl0;
import defpackage.kl0;
import defpackage.ll0;
import defpackage.p30;
import defpackage.p51;
import defpackage.ro1;
import defpackage.sp2;
import defpackage.uo1;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static hp1 lambda$getComponents$0(cm0 cm0Var) {
        return new gp1((ro1) cm0Var.g(ro1.class), cm0Var.v(e52.class), (ExecutorService) cm0Var.j(new e24(iw.class, ExecutorService.class)), new ik4((Executor) cm0Var.j(new e24(p30.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ll0> getComponents() {
        kl0 kl0VarG = ll0.g(hp1.class);
        kl0VarG.g = LIBRARY_NAME;
        kl0VarG.g(p51.g(ro1.class));
        byte b = 0;
        kl0VarG.g(new p51(0, 1, e52.class));
        kl0VarG.g(new p51(new e24(iw.class, ExecutorService.class), 1, 0));
        kl0VarG.g(new p51(new e24(p30.class, Executor.class), 1, 0));
        kl0VarG.x = new uo1((byte) 2);
        ll0 ll0VarY = kl0VarG.y();
        d52 d52Var = new d52(b);
        kl0 kl0VarG2 = ll0.g(d52.class);
        kl0VarG2.v = true;
        kl0VarG2.x = new jl0(d52Var, b);
        return Arrays.asList(ll0VarY, kl0VarG2.y(), sp2.t(LIBRARY_NAME, "19.1.2"));
    }
}
