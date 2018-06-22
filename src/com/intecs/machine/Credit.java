package com.intecs.machine;

public class Credit {
	
	float value;
	
	public Credit(float _value) {
		
		this.value = _value; 
		
	}

	public float getValue() {
		
		return value;
	
	}

	public void setValue(float value) {
	
		this.value = value;
	
	}

	@Override
	public String toString() {
	
		return "Credit [value=" + value + "]";
	
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		
		if (!(obj instanceof Credit)) return false;
		
		Credit c = (Credit) obj;
		boolean result = Float.compare(this.value, c.value) == 0;
		
		return result;
		
	}
	
}
