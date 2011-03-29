package com.example.listview;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;

/**
 * Custom List Activity that implements a custom adapter for changing the list
 * rows to a custom layout. This class currently fills the list with a dummy
 * method.
 * 
 * @author Manuel Zapata
 * 
 */
public class CustomListView extends ListActivity {
	private CustomAdapter _adapter;
	private ArrayList<Item> _items;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		_items = new ArrayList<Item>();

		// Fill the ArrayList with some items. You should define your own
		// methods to fill the ArrayList
		addItems();

		// Set the custom adapter as the adapter for the list view
		this._adapter = new CustomAdapter(this, R.layout.row, _items);
		setListAdapter(this._adapter);

	}

	/**
	 * Dummy method for adding items to the list
	 */
	private void addItems() {
		for (int i = 0; i < 10; i++) {
			_items.add(new Item(i, "item " + i));
		}
	}
}
