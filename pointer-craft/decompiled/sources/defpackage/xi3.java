package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class xi3 {
    public static String a(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static int g(int i) {
        if (i == 90) {
            return 81;
        }
        if (i == 91) {
            return 82;
        }
        if (i == 93) {
            return 84;
        }
        if (i == 94) {
            return 85;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case kq2.x /* 15 */:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case kq2.l /* 48 */:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 87;
                    case 97:
                        return 88;
                    case 98:
                        return 89;
                    case 99:
                        return 90;
                    case 100:
                        return 91;
                    case 101:
                        return 92;
                    case 102:
                        return 83;
                    case 103:
                        return 86;
                    case 104:
                        return 93;
                    case 105:
                        return 94;
                    case 106:
                        return 95;
                    case 107:
                        return 96;
                    case 108:
                        return 97;
                    case 109:
                        return 98;
                    case 110:
                        return 99;
                    case 111:
                        return 100;
                    case 112:
                        return 101;
                    case 113:
                        return 102;
                    case 114:
                        return 103;
                    case 115:
                        return 104;
                    case 116:
                        return 105;
                    case 117:
                        return 106;
                    case 118:
                        return 107;
                    case 119:
                        return 108;
                    case 120:
                        return 109;
                    case 121:
                        return 110;
                    case 122:
                        return 111;
                    case 123:
                        return 112;
                    case 124:
                        return 113;
                    case 125:
                        return 114;
                    case 126:
                        return 117;
                    case 127:
                        return 119;
                    case 128:
                        return 120;
                    case 129:
                        return 121;
                    case 130:
                        return 122;
                    case 131:
                        return 123;
                    case 132:
                        return 124;
                    case 133:
                        return 125;
                    case 134:
                        return 126;
                    case 135:
                        return 127;
                    case 136:
                        return 128;
                    case 137:
                        return 129;
                    case 138:
                        return 130;
                    case 139:
                        return 131;
                    case 140:
                        return 132;
                    case 141:
                        return 133;
                    case 142:
                        return 134;
                    case 143:
                        return 135;
                    case 144:
                        return 136;
                    case 145:
                        return 115;
                    case 146:
                        return 116;
                    case 147:
                        return 118;
                    case 148:
                        return 137;
                    case 149:
                        return 138;
                    case 150:
                        return 139;
                    case 151:
                        return 140;
                    case 152:
                        return 141;
                    default:
                        return 0;
                }
        }
    }

    public static String j(String str, int i) {
        return str + i;
    }

    public static int l(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static String m(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static int n(int i, int i2, int i3, int i4) {
        return u56.c(i) + i2 + i3 + i4;
    }

    public static /* synthetic */ void q(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                t94.g();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static int r(int i, int i2, int i3) {
        return u56.c(i) + i2 + i3;
    }

    public static String t(String str, String str2) {
        return str + str2;
    }

    public static int v(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int x(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static /* synthetic */ short y(int i) {
        switch (i) {
            case 1:
                return (short) 0;
            case 2:
                return (short) 1;
            case 3:
                return (short) 2;
            case 4:
                return (short) 3;
            case 5:
                return (short) 4;
            case 6:
                return (short) 5;
            case 7:
                return (short) 6;
            case 8:
                return (short) 7;
            case 9:
                return (short) 8;
            case 10:
                return (short) 9;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return (short) 10;
            case 12:
                return (short) 11;
            case 13:
                return (short) 12;
            case 14:
                return (short) 13;
            case kq2.x /* 15 */:
                return (short) 14;
            case 16:
                return (short) 15;
            case 17:
                return (short) 16;
            case 18:
                return (short) 17;
            case 19:
                return (short) 18;
            case 20:
                return (short) 19;
            case 21:
                return (short) 20;
            case 22:
                return (short) 21;
            case 23:
                return (short) 22;
            case 24:
                return (short) 23;
            case 25:
                return (short) 24;
            case 26:
                return (short) 25;
            case 27:
                return (short) 26;
            case 28:
                return (short) 27;
            case 29:
                return (short) 28;
            case 30:
                return (short) 29;
            case 31:
                return (short) 30;
            case 32:
                return (short) 31;
            case 33:
                return (short) 32;
            case 34:
                return (short) 33;
            case 35:
                return (short) 34;
            case 36:
                return (short) 35;
            case 37:
                return (short) 36;
            case 38:
                return (short) 37;
            case 39:
                return (short) 38;
            case 40:
                return (short) 39;
            case 41:
                return (short) 40;
            case 42:
                return (short) 41;
            case 43:
                return (short) 42;
            case 44:
                return (short) 43;
            case 45:
                return (short) 44;
            case 46:
                return (short) 45;
            case 47:
                return (short) 46;
            case kq2.l /* 48 */:
                return (short) 47;
            case 49:
                return (short) 48;
            case 50:
                return (short) 49;
            case 51:
                return (short) 50;
            case 52:
                return (short) 51;
            case 53:
                return (short) 52;
            case 54:
                return (short) 53;
            case 55:
                return (short) 54;
            case 56:
                return (short) 55;
            case 57:
                return (short) 56;
            case 58:
                return (short) 57;
            case 59:
                return (short) 58;
            case 60:
                return (short) 59;
            case 61:
                return (short) 60;
            case 62:
                return (short) 61;
            case 63:
                return (short) 62;
            case 64:
                return (short) 63;
            case 65:
                return (short) 64;
            case 66:
                return (short) 65;
            case 67:
                return (short) 66;
            case 68:
                return (short) 67;
            case 69:
                return (short) 68;
            case 70:
                return (short) 69;
            case 71:
                return (short) 70;
            case 72:
                return (short) 71;
            case 73:
                return (short) 72;
            case 74:
                return (short) 73;
            case 75:
                return (short) 74;
            case 76:
                return (short) 75;
            case 77:
                return (short) 76;
            case 78:
                return (short) 77;
            case 79:
                return (short) 78;
            case 80:
                return (short) 79;
            case 81:
                return (short) 90;
            case 82:
                return (short) 91;
            case 83:
                return (short) 102;
            case 84:
                return (short) 93;
            case 85:
                return (short) 94;
            case 86:
                return (short) 103;
            case 87:
                return (short) 96;
            case 88:
                return (short) 97;
            case 89:
                return (short) 98;
            case 90:
                return (short) 99;
            case 91:
                return (short) 100;
            case 92:
                return (short) 101;
            case 93:
                return (short) 104;
            case 94:
                return (short) 105;
            case 95:
                return (short) 106;
            case 96:
                return (short) 107;
            case 97:
                return (short) 108;
            case 98:
                return (short) 109;
            case 99:
                return (short) 110;
            case 100:
                return (short) 111;
            case 101:
                return (short) 112;
            case 102:
                return (short) 113;
            case 103:
                return (short) 114;
            case 104:
                return (short) 115;
            case 105:
                return (short) 116;
            case 106:
                return (short) 117;
            case 107:
                return (short) 118;
            case 108:
                return (short) 119;
            case 109:
                return (short) 120;
            case 110:
                return (short) 121;
            case 111:
                return (short) 122;
            case 112:
                return (short) 123;
            case 113:
                return (short) 124;
            case 114:
                return (short) 125;
            case 115:
                return (short) 145;
            case 116:
                return (short) 146;
            case 117:
                return (short) 126;
            case 118:
                return (short) 147;
            case 119:
                return (short) 127;
            case 120:
                return (short) 128;
            case 121:
                return (short) 129;
            case 122:
                return (short) 130;
            case 123:
                return (short) 131;
            case 124:
                return (short) 132;
            case 125:
                return (short) 133;
            case 126:
                return (short) 134;
            case 127:
                return (short) 135;
            case 128:
                return (short) 136;
            case 129:
                return (short) 137;
            case 130:
                return (short) 138;
            case 131:
                return (short) 139;
            case 132:
                return (short) 140;
            case 133:
                return (short) 141;
            case 134:
                return (short) 142;
            case 135:
                return (short) 143;
            case 136:
                return (short) 144;
            case 137:
                return (short) 148;
            case 138:
                return (short) 149;
            case 139:
                return (short) 150;
            case 140:
                return (short) 151;
            case 141:
                return (short) 152;
            default:
                throw null;
        }
    }
}
