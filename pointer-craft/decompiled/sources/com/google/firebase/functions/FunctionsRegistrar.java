package com.google.firebase.functions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.cg5;
import defpackage.cm0;
import defpackage.e24;
import defpackage.fe6;
import defpackage.hf2;
import defpackage.kl0;
import defpackage.kp1;
import defpackage.ll0;
import defpackage.lp1;
import defpackage.n14;
import defpackage.nf2;
import defpackage.p51;
import defpackage.pw5;
import defpackage.qz1;
import defpackage.rm3;
import defpackage.ru2;
import defpackage.so1;
import defpackage.sp2;
import defpackage.sz1;
import defpackage.va5;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class FunctionsRegistrar implements ComponentRegistrar {
    private static final sz1 Companion = new sz1();
    private static final String LIBRARY_NAME = "fire-fn";

    /* JADX INFO: Access modifiers changed from: private */
    public static final qz1 getComponents$lambda$0(e24 e24Var, e24 e24Var2, cm0 cm0Var) {
        cm0Var.getClass();
        va5 va5VarY = fe6.y();
        Object objG = cm0Var.g(Context.class);
        objG.getClass();
        va5VarY.l((Context) objG);
        Object objG2 = cm0Var.g(lp1.class);
        objG2.getClass();
        va5VarY.w((lp1) objG2);
        Object objJ = cm0Var.j(e24Var);
        objJ.getClass();
        va5VarY.i((Executor) objJ);
        Object objJ2 = cm0Var.j(e24Var2);
        objJ2.getClass();
        va5VarY.e((Executor) objJ2);
        n14 n14VarV = cm0Var.v(hf2.class);
        n14VarV.getClass();
        va5VarY.j(n14VarV);
        n14 n14VarV2 = cm0Var.v(kp1.class);
        n14VarV2.getClass();
        va5VarY.c(n14VarV2);
        rm3 rm3VarY = cm0Var.y();
        rm3VarY.getClass();
        va5VarY.x(rm3VarY);
        return va5VarY.r().g();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ll0> getComponents() {
        e24 e24Var = new e24(ru2.class, Executor.class);
        e24 e24Var2 = new e24(cg5.class, Executor.class);
        kl0 kl0VarG = ll0.g(qz1.class);
        kl0VarG.g = LIBRARY_NAME;
        kl0VarG.g(p51.g(Context.class));
        kl0VarG.g(p51.g(lp1.class));
        kl0VarG.g(new p51(0, 1, hf2.class));
        kl0VarG.g(new p51(1, 1, kp1.class));
        kl0VarG.g(new p51(0, 2, nf2.class));
        kl0VarG.g(new p51(e24Var, 1, 0));
        kl0VarG.g(new p51(e24Var2, 1, 0));
        kl0VarG.x = new so1(e24Var, e24Var2, (byte) 1);
        return pw5.d(kl0VarG.y(), sp2.t(LIBRARY_NAME, "22.1.1"));
    }
}
