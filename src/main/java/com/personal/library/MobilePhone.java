package com.personal.library;

public abstract class MobilePhone {
	protected long serial_id;
	protected long MEMORY_SPACE;
	protected String model;
	public MobilePhone(long serial_id, long mEMORY_SPACE, String model) {
		super();
		this.serial_id = serial_id;
		MEMORY_SPACE = mEMORY_SPACE;
		this.model = model;
	}
	public long getSerial_id() {
		return serial_id;
	}
	public void setSerial_id(long serial_id) {
		this.serial_id = serial_id;
	}
	public long getMEMORY_SPACE() {
		return MEMORY_SPACE;
	}
	public void setMEMORY_SPACE(long mEMORY_SPACE) {
		MEMORY_SPACE = mEMORY_SPACE;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
