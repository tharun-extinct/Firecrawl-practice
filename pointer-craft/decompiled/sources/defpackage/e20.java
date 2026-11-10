package defpackage;

import android.app.Application;
import android.content.Context;
import io.appground.blek.data.room.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class e20 implements o14 {
    public final /* synthetic */ byte g;
    public o14 y;

    public /* synthetic */ e20(o14 o14Var, byte b) {
        this.g = b;
        this.y = o14Var;
    }

    @Override // defpackage.p14
    public final Object get() {
        switch (this.g) {
            case 0:
                Application application = (Application) this.y.get();
                application.getClass();
                return new d20(application);
            case 1:
                return new b90((yi2) this.y.get());
            case 2:
                return new zk0((gp2) this.y.get());
            case 3:
                o14 o14Var = this.y;
                if (o14Var != null) {
                    return o14Var.get();
                }
                throw new IllegalStateException();
            case 4:
                return rf6.v((Application) this.y.get());
            case 5:
                return new ta2((Context) this.y.get());
            case 6:
                return new yi2((zi2) this.y.get());
            case 7:
                return new zi2((Context) this.y.get());
            case 8:
                return new gp2((zo1) this.y.get());
            default:
                return new wh4((AppDatabase) this.y.get(), new tg1((byte) 12));
        }
    }

    public /* synthetic */ e20() {
        this.g = (byte) 3;
    }
}
