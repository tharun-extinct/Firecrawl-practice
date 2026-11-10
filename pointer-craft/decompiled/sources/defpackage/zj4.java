package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes2.dex */
public final class zj4 implements SensorEventListener {
    public final /* synthetic */ q54 g;
    public final /* synthetic */ ez3 r;
    public final /* synthetic */ ak4 y;

    public zj4(q54 q54Var, ak4 ak4Var, ez3 ez3Var) {
        this.g = q54Var;
        this.y = ak4Var;
        this.r = ez3Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        ak4 ak4Var = this.y;
        float[] fArr = ak4Var.n;
        float[] fArr2 = ak4Var.y;
        float[] fArr3 = ak4Var.r;
        float[] fArr4 = ak4Var.v;
        sensorEvent.getClass();
        q54 q54Var = this.g;
        if (!q54Var.j) {
            q54Var.j = true;
            System.arraycopy(sensorEvent.values, 0, fArr4, 0, fArr4.length);
            SensorManager.getRotationMatrixFromVector(fArr3, sensorEvent.values);
            return;
        }
        int length = fArr4.length;
        for (int i = 0; i < length; i++) {
            fArr4[i] = (0.3f * fArr4[i]) + (0.7f * sensorEvent.values[i]);
        }
        SensorManager.getRotationMatrixFromVector(fArr2, fArr4);
        SensorManager.getAngleChange(fArr, fArr2, fArr3);
        int iRound = Math.round(fArr[0] / ak4Var.x);
        int iRound2 = Math.round(fArr[1] / ak4Var.x);
        if (iRound != 0 || iRound2 != 0) {
            this.r.z(new x83(iRound, iRound2));
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
