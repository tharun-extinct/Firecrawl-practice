package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ce5 extends me5 {
    public final /* synthetic */ byte g;
    public static final ce5 y = new ce5(0);
    public static final ce5 r = new ce5(1);
    public static final ce5 n = new ce5(2);
    public static final ce5 v = new ce5(3);
    public static final ce5 x = new ce5(4);
    public static final ce5 l = new ce5(5);
    public static final ce5 j = new ce5(6);
    public static final ce5 t = new ce5(7);
    public static final ce5 a = new ce5(8);

    public /* synthetic */ ce5(byte b) {
        this.g = b;
    }

    public final int g() {
        switch (this.g) {
            case 0:
                return R.string.outcome_connection_error;
            case 1:
                return R.string.outcome_device_not_visible;
            case 2:
                return R.string.outcome_enable_bluetooth;
            case 3:
                return R.string.outcome_ensure_screen_unlocked;
            case 4:
                return R.string.outcome_find_bluetooth_setting;
            case 5:
                return R.string.outcome_restart_devices;
            case 6:
                return R.string.outcome_restart_devices_if_unlocked;
            case 7:
                return R.string.outcome_unexpected_issue;
            default:
                return R.string.outcome_unlock_screen;
        }
    }
}
