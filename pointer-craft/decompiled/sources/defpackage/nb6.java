package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nb6 implements d76 {
    public final /* synthetic */ byte g;
    public static final nb6 y = new nb6(0);
    public static final nb6 r = new nb6(1);
    public static final nb6 n = new nb6(2);

    public /* synthetic */ nb6(byte b) {
        this.g = b;
    }

    @Override // defpackage.d76
    public final boolean g(int i) {
        mc6 mc6Var;
        switch (this.g) {
            case 0:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    case 12:
                    case 13:
                    case 14:
                    case kq2.x /* 15 */:
                        break;
                    default:
                        switch (i) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                                break;
                            default:
                                return false;
                        }
                        break;
                }
                return true;
            case 1:
                return xi3.g(i) != 0;
            default:
                if (i == 0) {
                    mc6Var = mc6.t;
                } else if (i == 1) {
                    mc6Var = mc6.a;
                } else if (i != 2) {
                    mc6Var = i != 3 ? null : mc6.q;
                } else {
                    mc6Var = mc6.m;
                }
                return mc6Var != null;
        }
    }
}
