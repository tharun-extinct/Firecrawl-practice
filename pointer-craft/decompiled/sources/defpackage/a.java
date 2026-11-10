package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ z t;

    public /* synthetic */ a(z zVar, byte b) {
        this.j = b;
        this.t = zVar;
    }

    @Override // defpackage.my1
    public final Object g() {
        o41 o41Var;
        byte b = this.j;
        z zVar = this.t;
        switch (b) {
            case 0:
                hb2 hb2Var = (hb2) v70.b(zVar, db2.g);
                if (hb2Var == null) {
                    pc2.g("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + hb2Var);
                }
                hb2 hb2Var2 = zVar.F;
                zVar.F = hb2Var;
                if (hb2Var2 != null && !yf2.p(hb2Var, hb2Var2) && ((o41Var = zVar.I) != null || !zVar.P)) {
                    if (o41Var != null) {
                        zVar.R0(o41Var);
                    }
                    zVar.I = null;
                    zVar.a1();
                }
                return og5.g;
            default:
                zVar.e1();
                return Boolean.TRUE;
        }
    }
}
