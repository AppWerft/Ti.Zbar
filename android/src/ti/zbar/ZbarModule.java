package ti.zbar;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;

@Kroll.module(name = "Zbar", id = "ti.zbar")
public class ZbarModule extends KrollModule {

	private static final String moduleId = "ti.zbar";

	static {
		System.loadLibrary("iconv");
	}

	// Standard Debugging variables
	private static final String LCAT = "AcktiemobileandroidqrModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public ZbarModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
		Log.d(LCAT, "inside onAppCreate");
		// put module init code that needs to run when the application is
		// created
	}

	public static String getModuleid() {
		return moduleId;
	}
}