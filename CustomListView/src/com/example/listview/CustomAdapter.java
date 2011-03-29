package com.example.listview;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Custom Adapter for creating a ListView with rows created with a specific
 * layout and linked to an {@link Item} object.
 * 
 * @author Manuel Zapata
 * 
 */
public class CustomAdapter extends ArrayAdapter<Item> {
	private Context _context;
	private ArrayList<Item> _items;
	private int _viewResourceId;

	/**
	 * The constructor takes an ArrayList with the items that will be
	 * represented by list rows.
	 * 
	 * @param context
	 * @param textViewResourceId
	 * @param items
	 */
	public CustomAdapter(Context context, int textViewResourceId,
			ArrayList<Item> items) {
		super(context, textViewResourceId, items);
		this._items = items;
		this._context = context;
		this._viewResourceId = textViewResourceId;
	}

	/**
	 * This function is called for each Item when the list is being populated.
	 * It generates the View for each row based on the layout file passed.
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) _context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(_viewResourceId, null);
		}
		Item i = _items.get(position);
		if (i != null) {
			ImageView image1 = (ImageView) v.findViewById(R.id.image1);
			ImageView image2 = (ImageView) v.findViewById(R.id.image2);
			TextView itemtext = (TextView) v.findViewById(R.id.itemtext);
			if (image1 != null) {
				image1.setImageResource(R.drawable.icon);
			}
			if (image2 != null) {
				image2.setImageResource(R.drawable.icon);
			}
			if (itemtext != null) {
				itemtext.setText(i.get_name());
			}
		}
		return v;
	}
}
