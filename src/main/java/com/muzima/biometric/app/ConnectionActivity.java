package com.muzima.biometric.app;

import android.os.Bundle;
import com.muzima.biometric.R;
import com.muzima.biometric.net.ConnectivityHelper;
import com.muzima.biometric.widget.CustomItemAdapter;
import com.muzima.biometric.widget.HeaderItem;
import com.muzima.biometric.widget.ListItem;

import java.util.ArrayList;
import java.util.List;

public final class ConnectionActivity extends BaseListActivity {

	// ===========================================================
	// Protected methods
	// ===========================================================

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		List<ListItem> items = new ArrayList<ListItem>();
		items.add(new HeaderItem(getString(R.string.msg_internet_connection)));
		items.add(new ListItem(getString(R.string.msg_internet_connection_status), ConnectivityHelper.getStatus(this)));
		if (ConnectivityHelper.isConnected(this)) {
			items.add(new ListItem(getString(R.string.msg_internet_connection_type), ConnectivityHelper.getType(this)));
		}
		setListAdapter(new CustomItemAdapter(this, items));
	}
}