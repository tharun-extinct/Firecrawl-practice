package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dl2 extends m50 {
    public final /* synthetic */ byte C;

    public /* synthetic */ dl2(byte b) {
        this.C = b;
    }

    @Override // defpackage.m50
    public final void C(cc4 cc4Var, Object obj) {
        switch (this.C) {
            case 0:
                cc4Var.getClass();
                cc4Var.n(1, ((sk2) obj).g);
                break;
            default:
                sk2 sk2Var = (sk2) obj;
                cc4Var.getClass();
                long j = sk2Var.g;
                cc4Var.n(1, j);
                String str = sk2Var.y;
                if (str == null) {
                    cc4Var.g(2);
                } else {
                    cc4Var.m(str, 2);
                }
                cc4Var.n(3, sk2Var.r ? 1L : 0L);
                String str2 = sk2Var.n;
                if (str2 == null) {
                    cc4Var.g(4);
                } else {
                    cc4Var.m(str2, 4);
                }
                String str3 = sk2Var.v;
                if (str3 == null) {
                    cc4Var.g(5);
                } else {
                    cc4Var.m(str3, 5);
                }
                String str4 = sk2Var.x;
                if (str4 == null) {
                    cc4Var.g(6);
                } else {
                    cc4Var.m(str4, 6);
                }
                String str5 = sk2Var.l;
                if (str5 == null) {
                    cc4Var.g(7);
                } else {
                    cc4Var.m(str5, 7);
                }
                byte[] bArr = sk2Var.j;
                if (bArr == null) {
                    cc4Var.g(8);
                } else {
                    cc4Var.l(8, bArr);
                }
                cc4Var.n(9, j);
                break;
        }
    }

    @Override // defpackage.m50
    public final String G() {
        switch (this.C) {
            case 0:
                return "DELETE FROM `Layout` WHERE `uid` = ?";
            default:
                return "UPDATE OR ABORT `Layout` SET `uid` = ?,`name` = ?,`starred` = ?,`shareId` = ?,`parentId` = ?,`shareLink` = ?,`uploadKey` = ?,`data` = ? WHERE `uid` = ?";
        }
    }
}
