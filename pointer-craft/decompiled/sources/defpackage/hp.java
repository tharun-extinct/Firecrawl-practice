package defpackage;

import android.app.Application;
import android.content.Context;
import io.appground.blek.data.room.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class hp implements o14 {
    public final /* synthetic */ byte g;
    public final o14 r;
    public final o14 y;

    public /* synthetic */ hp(o14 o14Var, o14 o14Var2, byte b) {
        this.g = b;
        this.y = o14Var;
        this.r = o14Var2;
    }

    @Override // defpackage.p14
    public final Object get() {
        qb1 qb1Var;
        byte b = this.g;
        o14 o14Var = this.r;
        o14 o14Var2 = this.y;
        switch (b) {
            case 0:
                return new gp((v20) o14Var2.get(), (ta2) o14Var.get());
            case 1:
                return new v20((w10) o14Var2.get(), (ox0) o14Var.get());
            case 2:
                return new b30((Application) o14Var2.get(), (v20) o14Var.get());
            case 3:
                Application application = (Application) o14Var2.get();
                application.getClass();
                Context applicationContext = application.getApplicationContext();
                applicationContext.getClass();
                u94 u94VarM = sp2.m(applicationContext, AppDatabase.class, "app-database");
                u94VarM.n.add(new s01(application, o14Var));
                u94VarM.c = true;
                u94VarM.i = true;
                u94VarM.b = true;
                return (AppDatabase) u94VarM.y();
            case 4:
                Context context = (Context) o14Var2.get();
                if (o14Var instanceof qb1) {
                    qb1Var = (qb1) o14Var;
                } else {
                    o14Var.getClass();
                    qb1Var = new qb1(o14Var);
                }
                return new ji(context, qb1Var);
            case 5:
                return new sj2((yi2) o14Var2.get(), (Context) o14Var.get());
            case 6:
                return new wm4((Application) o14Var2.get(), (AppDatabase) o14Var.get());
            case 7:
                return new un5((AppDatabase) o14Var2.get(), new tg1((byte) 12), (Context) o14Var.get());
            default:
                return new wn5((Context) o14Var2.get(), (l62) o14Var.get());
        }
    }
}
