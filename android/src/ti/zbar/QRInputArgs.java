package ti.zbar;

import org.appcelerator.kroll.KrollFunction;

import com.acktie.mobile.android.InputArgs;
import com.acktie.mobile.android.camera.CameraManager;

public class QRInputArgs implements InputArgs {

	public static final String SUCCESS_CALLBACK = "success";
	private KrollFunction successCallback = null;

	public static final String CANCEL_CALLBACK = "cancel";
	private KrollFunction cancelCallback = null;

	public static final String USE_FRONT_CAMERA = "useFrontCamera";
	private int cameraDevice = CameraManager.AUTO_DETACT_CAMERA_FACING;

	private boolean isContinuous = false;
	private boolean isScanFromImageCapture = false;

	public KrollFunction getSuccessCallback() {
		return successCallback;
	}

	public void setSuccessCallback(KrollFunction successCallback) {
		this.successCallback = successCallback;
	}

	public KrollFunction getCancelCallback() {
		return cancelCallback;
	}

	public void setCancelCallback(KrollFunction cancelCallback) {
		this.cancelCallback = cancelCallback;
	}

	public int getCameraDevice() {
		return cameraDevice;
	}

	public void setCameraDevice(int cameraDevice) {
		this.cameraDevice = cameraDevice;
	}

	@Override
	public boolean isContinuous() {
		return isContinuous;
	}

	@Override
	public boolean isScanFromImageCapture() {
		return isScanFromImageCapture;
	}

	@Override
	public void setContinuous(boolean arg0) {
		isContinuous = arg0;
	}

	@Override
	public void setScanFromImageCapture(boolean arg0) {
		isScanFromImageCapture = arg0;
	}

	@Override
	public float getAlpha() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KrollFunction getErrorCallback() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLayout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUseJISEncoding() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAlpha(float arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setColor(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setErrorCallback(KrollFunction arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setImageName(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLayout(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setUseJISEncoding(boolean arg0) {
		// TODO Auto-generated method stub

	}
}