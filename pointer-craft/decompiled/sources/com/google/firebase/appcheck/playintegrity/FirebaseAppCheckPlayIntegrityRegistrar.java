package com.google.firebase.appcheck.playintegrity;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.e24;
import defpackage.eu3;
import defpackage.kl0;
import defpackage.ll0;
import defpackage.p30;
import defpackage.p51;
import defpackage.ro1;
import defpackage.ru2;
import defpackage.so1;
import defpackage.sp2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        e24 e24Var = new e24(ru2.class, Executor.class);
        e24 e24Var2 = new e24(p30.class, Executor.class);
        kl0 kl0VarG = ll0.g(eu3.class);
        kl0VarG.g = "fire-app-check-play-integrity";
        kl0VarG.g(p51.g(ro1.class));
        kl0VarG.g(new p51(e24Var, 1, 0));
        kl0VarG.g(new p51(e24Var2, 1, 0));
        kl0VarG.x = new so1(e24Var, e24Var2, (byte) 0);
        return Arrays.asList(kl0VarG.y(), sp2.t("fire-app-check-play-integrity", "19.4.1"));
    }
}
