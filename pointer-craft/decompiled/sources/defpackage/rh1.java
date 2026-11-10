package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class rh1 extends ue5 {
    public final /* synthetic */ ue5 f;
    public final /* synthetic */ ThreadPoolExecutor k;

    public rh1(ue5 ue5Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f = ue5Var;
        this.k = threadPoolExecutor;
    }

    @Override // defpackage.ue5
    public final void Z(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.k;
        try {
            this.f.Z(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.ue5
    public final void c0(kb5 kb5Var) {
        ThreadPoolExecutor threadPoolExecutor = this.k;
        try {
            this.f.c0(kb5Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
