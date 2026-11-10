package defpackage;

import com.google.firebase.functions.FunctionsRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class so1 implements gm0 {
    public final /* synthetic */ e24 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ e24 t;

    public /* synthetic */ so1(e24 e24Var, e24 e24Var2, byte b) {
        this.j = b;
        this.t = e24Var;
        this.a = e24Var2;
    }

    @Override // defpackage.gm0
    public final Object c(vl vlVar) {
        byte b = this.j;
        e24 e24Var = this.a;
        e24 e24Var2 = this.t;
        switch (b) {
            case 0:
                return new eu3((ro1) vlVar.g(ro1.class), (Executor) vlVar.j(e24Var2), (Executor) vlVar.j(e24Var));
            default:
                return FunctionsRegistrar.getComponents$lambda$0(e24Var2, e24Var, vlVar);
        }
    }
}
