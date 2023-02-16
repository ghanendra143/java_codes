package JDBC;

public class Mobile {

private int mob_id;
private String mob_name;
private String mob_color;
private int mob_battery;
private int mob_price;

public int getMob_id() {
	return mob_id;
}
public void setMob_id(int mob_id) {
	this.mob_id = mob_id;
}
public String getMob_name() {
	return mob_name;
}
public void setMob_name(String mob_name) {
	this.mob_name = mob_name;
}
public String getMob_color() {
	return mob_color;
}
public void setMob_color(String mob_color) {
	this.mob_color = mob_color;
}
public int getMob_battery() {
	return mob_battery;
}
public void setMob_battery(int mob_battery) {
	this.mob_battery = mob_battery;
}
public int getMob_price() {
	return mob_price;
}
public void setMob_price(int mob_price) {
	this.mob_price = mob_price;
}

public Mobile(int mob_id, String mob_name, String mob_color, int mob_battery, int mob_price) {
	super();
	this.mob_id = mob_id;
	this.mob_name = mob_name;
	this.mob_color = mob_color;
	this.mob_battery = mob_battery;
	this.mob_price = mob_price;
}

public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Mobile [mob_id=" + mob_id + ", mob_name=" + mob_name + ", mob_color=" + mob_color + ", mob_battery="
			+ mob_battery + ", mob_price=" + mob_price + "]";
}

}
