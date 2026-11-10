package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class um4 extends zz4 implements bz1 {
    public final /* synthetic */ wm4 c;
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um4(wm4 wm4Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = wm4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                um4 um4Var = new um4(this.c, mu0Var, (byte) 0);
                um4Var.w = obj;
                return um4Var;
            case 1:
                um4 um4Var2 = new um4(this.c, mu0Var, (byte) 1);
                um4Var2.w = obj;
                return um4Var2;
            default:
                um4 um4Var3 = new um4(this.c, mu0Var, (byte) 2);
                um4Var3.w = obj;
                return um4Var3;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        db3 db3Var = (db3) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                ((um4) b(mu0Var, db3Var)).u(og5Var);
                break;
            case 1:
                ((um4) b(mu0Var, db3Var)).u(og5Var);
                break;
            default:
                ((um4) b(mu0Var, db3Var)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        wm4 wm4Var = this.c;
        db3 db3Var = (db3) this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                rw3 rw3Var = new rw3("layout_section_activated_mousekeyboard:100");
                Boolean boolValueOf = Boolean.valueOf(wm4Var.x().getBoolean("show_media_buttons", false));
                db3Var.getClass();
                db3Var.x(rw3Var, boolValueOf);
                break;
            case 1:
                js2.o(obj);
                rw3 rw3Var2 = new rw3("layout_section_activated_mousekeyboard:101");
                Boolean boolValueOf2 = Boolean.valueOf(wm4Var.x().getBoolean("show_shortcut_buttons", false));
                db3Var.getClass();
                db3Var.x(rw3Var2, boolValueOf2);
                break;
            default:
                js2.o(obj);
                rw3 rw3Var3 = new rw3("layout_section_activated_mousekeyboard:102");
                Boolean boolValueOf3 = Boolean.valueOf(wm4Var.x().getBoolean("show_navigation_buttons", false));
                db3Var.getClass();
                db3Var.x(rw3Var3, boolValueOf3);
                break;
        }
        return og5Var;
    }
}
