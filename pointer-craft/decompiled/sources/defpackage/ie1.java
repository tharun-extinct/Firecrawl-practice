package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ie1 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ we1 t;

    public /* synthetic */ ie1(we1 we1Var, byte b) {
        this.j = b;
        this.t = we1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        we1 we1Var = this.t;
        switch (b) {
            case 0:
                return Boolean.valueOf(((xe1) we1Var.y.t.getValue()) == xe1.t && !we1Var.r());
            default:
                j51 j51Var = (j51) we1Var.r.getValue();
                if (j51Var != null) {
                    qe5 qe5Var = ef3.g;
                    return Float.valueOf(j51Var.e(400.0f));
                }
                uo1.C(we1Var, ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?", "The density on DrawerState (");
                return null;
        }
    }
}
