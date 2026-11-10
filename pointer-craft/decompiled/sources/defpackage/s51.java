package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s51 extends fk1 {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s51(x94 x94Var, byte b) {
        super(x94Var);
        this.m = b;
    }

    @Override // defpackage.fk1
    public final void c(gy1 gy1Var, Object obj) {
        switch (this.m) {
            case 0:
                o51 o51Var = (o51) obj;
                String str = o51Var.g;
                if (str == null) {
                    gy1Var.g(1);
                } else {
                    gy1Var.G(str, 1);
                }
                String str2 = o51Var.y;
                if (str2 != null) {
                    gy1Var.G(str2, 2);
                } else {
                    gy1Var.g(2);
                }
                break;
            case 1:
                nr5 nr5Var = (nr5) obj;
                String str3 = nr5Var.g;
                if (str3 == null) {
                    gy1Var.g(1);
                } else {
                    gy1Var.G(str3, 1);
                }
                String str4 = nr5Var.y;
                if (str4 != null) {
                    gy1Var.G(str4, 2);
                } else {
                    gy1Var.g(2);
                }
                break;
            default:
                tr5 tr5Var = (tr5) obj;
                String str5 = tr5Var.g;
                if (str5 == null) {
                    gy1Var.g(1);
                } else {
                    gy1Var.G(str5, 1);
                }
                String str6 = tr5Var.y;
                if (str6 != null) {
                    gy1Var.G(str6, 2);
                } else {
                    gy1Var.g(2);
                }
                break;
        }
    }

    @Override // defpackage.t
    public final String m() {
        switch (this.m) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
