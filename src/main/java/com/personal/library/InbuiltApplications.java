package com.personal.library;

import java.util.List;

public interface InbuiltApplications {
	//default Integer nofapps;
	void addDefaultApps(List<String>str);
	void disableDefaultApps(String app);
	void addDefaultApps(String str);
}
