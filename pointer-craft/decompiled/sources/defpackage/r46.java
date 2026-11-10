package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r46 implements d76 {
    public final /* synthetic */ byte g;
    public static final r46 y = new r46(0);
    public static final r46 r = new r46(1);
    public static final r46 n = new r46(2);
    public static final r46 v = new r46(3);
    public static final r46 x = new r46(4);

    public /* synthetic */ r46(byte b) {
        this.g = b;
    }

    @Override // defpackage.d76
    public final boolean g(int i) {
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
                        return true;
                    default:
                        return false;
                }
            case 1:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case 2:
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
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case kq2.x /* 15 */:
                    case 16:
                    default:
                        return false;
                }
            case 3:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return i == 0 || i == 1;
        }
    }
}
