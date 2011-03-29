package com.example.listview;

/**
 * Example Item class. The adapter loads this class and shows one list entry per
 * item.
 * 
 * @author Manuel Zapata
 * 
 */
public class Item {
	private int _id;
	private String _name;

	public Item(int id, String name) {
		this._id = id;
		this._name = name;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int id) {
		_id = id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		_name = name;
	}

}
