package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class z53 {
    public final byte g;
    public final byte y;

    /* JADX WARN: Multi-variable type inference failed */
    public z53(int i, int i2) {
        this.g = i;
        this.y = i2;
    }

    public void g(zx1 zx1Var) {
        zx1Var.getClass();
        throw new uh3("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void y(tb4 tb4Var) {
        tb4Var.getClass();
        if (!(tb4Var instanceof fz4)) {
            throw new uh3("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        g(((fz4) tb4Var).j);
    }
}
