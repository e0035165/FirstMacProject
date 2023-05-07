package com.personal.library;

import java.util.List;
import java.util.stream.Collectors;

public class IosPhone extends MobilePhone implements InbuiltApplications {
	Integer version;
	List<String>inbuiltApps;
	Sim sim = null;
	
	public IosPhone(long serial_id, long mEMORY_SPACE, String model, Integer version) {
		super(serial_id, mEMORY_SPACE, model);
		this.version = version;
	}
	public List<String> getInbuiltApps() {
		return inbuiltApps;
	}
	public void setInbuiltApps(List<String> inbuiltApps) {
		this.inbuiltApps = inbuiltApps;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public IosPhone(long serial_id, long mEMORY_SPACE, String model) {
		super(serial_id, mEMORY_SPACE, model);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addDefaultApps(List<String> str) {
		
		this.inbuiltApps.addAll(str);
	}
	@Override
	public void disableDefaultApps(String app) {
		this.inbuiltApps = this.inbuiltApps.stream().filter(x->!x.equalsIgnoreCase(app)).collect(Collectors.toList());
	}
	@Override
	public String toString() {
		return "IosPhone [version=" + version + ", inbuiltApps=" + inbuiltApps + ", sim=" + sim + "]";
	}
	@Override
	public void addDefaultApps(String str) {
		this.inbuiltApps.add(str);
		
	}
	
	
	

}
