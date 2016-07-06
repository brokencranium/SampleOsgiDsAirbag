package com.brokencranium.toast.airbag;

public interface IAirbag {

	void addListener(IAirBagListener listener);

	void deploy();

	void removeListener(IAirBagListener listener);

}