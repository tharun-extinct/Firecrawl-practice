package com.google.firebase.appcheck;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.cg5;
import defpackage.d52;
import defpackage.e24;
import defpackage.e52;
import defpackage.gm0;
import defpackage.iw;
import defpackage.jl0;
import defpackage.kl0;
import defpackage.l0;
import defpackage.ll0;
import defpackage.nf2;
import defpackage.p30;
import defpackage.p51;
import defpackage.r11;
import defpackage.ro1;
import defpackage.ru2;
import defpackage.sp2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        final e24 e24Var = new e24(cg5.class, Executor.class);
        final e24 e24Var2 = new e24(ru2.class, Executor.class);
        final e24 e24Var3 = new e24(iw.class, Executor.class);
        final e24 e24Var4 = new e24(p30.class, ScheduledExecutorService.class);
        kl0 kl0Var = new kl0(r11.class, nf2.class);
        kl0Var.g = "fire-app-check";
        kl0Var.g(p51.g(ro1.class));
        kl0Var.g(new p51(e24Var, 1, 0));
        kl0Var.g(new p51(e24Var2, 1, 0));
        kl0Var.g(new p51(e24Var3, 1, 0));
        kl0Var.g(new p51(e24Var4, 1, 0));
        kl0Var.g(new p51(0, 1, e52.class));
        kl0Var.x = new gm0() { // from class: to1
            @Override // defpackage.gm0
            public final Object c(vl vlVar) {
                return new r11((ro1) vlVar.g(ro1.class), vlVar.v(e52.class), (Executor) vlVar.j(e24Var), (Executor) vlVar.j(e24Var2), (Executor) vlVar.j(e24Var3), (ScheduledExecutorService) vlVar.j(e24Var4));
            }
        };
        if (kl0Var.n) {
            l0.z("Instantiation type has already been set.");
            return null;
        }
        kl0Var.n = true;
        ll0 ll0VarY = kl0Var.y();
        d52 d52Var = new d52((byte) 0);
        kl0 kl0VarG = ll0.g(d52.class);
        kl0VarG.v = true;
        kl0VarG.x = new jl0(d52Var, (byte) 0);
        return Arrays.asList(ll0VarY, kl0VarG.y(), sp2.t("fire-app-check", "19.4.1"));
    }
}
