package defpackage;

import io.appground.blehid.BleHidService;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h6 implements my1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ h6(byte b) {
        this.j = b;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                bo3 bo3Var = p6.g;
                return h11.g;
            case 1:
                return UUID.randomUUID();
            case 2:
                return UUID.randomUUID();
            case 3:
            case 4:
                return og5Var;
            case 5:
                return new cu4(ra.n(1308617531));
            case 6:
                UUID uuid = BleHidService.W;
                return UUID.fromString("00002908-0000-1000-8000-00805f9b34fb");
            case 7:
                UUID uuid2 = BleHidService.W;
                return UUID.fromString("00002A25-0000-1000-8000-00805f9b34fb");
            case 8:
                UUID uuid3 = BleHidService.W;
                return UUID.fromString("0000180F-0000-1000-8000-00805f9b34fb");
            case 9:
                UUID uuid4 = BleHidService.W;
                return UUID.fromString("00002A19-0000-1000-8000-00805f9b34fb");
            case 10:
                UUID uuid5 = BleHidService.W;
                return UUID.fromString("00001812-0000-1000-8000-00805f9b34fb");
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                UUID uuid6 = BleHidService.W;
                return UUID.fromString("00002A4E-0000-1000-8000-00805f9b34fb");
            case 12:
                UUID uuid7 = BleHidService.W;
                return UUID.fromString("00002A4D-0000-1000-8000-00805f9b34fb");
            case 13:
                UUID uuid8 = BleHidService.W;
                return UUID.fromString("00002A4B-0000-1000-8000-00805f9b34fb");
            case 14:
                UUID uuid9 = BleHidService.W;
                return UUID.fromString("00002A4A-0000-1000-8000-00805f9b34fb");
            case kq2.x /* 15 */:
                UUID uuid10 = BleHidService.W;
                return UUID.fromString("00002A4C-0000-1000-8000-00805f9b34fb");
            case 16:
                UUID uuid11 = BleHidService.W;
                return UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
            case 17:
                UUID uuid12 = BleHidService.W;
                return UUID.fromString("0000180A-0000-1000-8000-00805f9b34fb");
            case 18:
                UUID uuid13 = BleHidService.W;
                return UUID.fromString("00002A29-0000-1000-8000-00805f9b34fb");
            case 19:
                UUID uuid14 = BleHidService.W;
                return UUID.fromString("00002A24-0000-1000-8000-00805f9b34fb");
            case 20:
                return kq2.M(Boolean.FALSE);
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return og5Var;
        }
    }
}
