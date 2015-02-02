package com.muzima.biometric.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import com.muzima.biometric.R;
import com.muzima.biometric.licensing.app.ActivationInfoActivity;

public final class InfoActivity extends BaseTabActivity {

	// ===========================================================
	// Private static fields
	// ===========================================================

	private static final String TAB_ABOUT = "About";
	private static final String TAB_ACTIVATION = "Activation";
	private static final String TAB_CONNECTION = "Connection";

	// ===========================================================
	// Protected methods
	// ===========================================================

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_view);

		TabHost mTabHost = getTabHost();
		mTabHost.addTab(mTabHost.newTabSpec(TAB_ABOUT).setIndicator(getString(R.string.msg_about)).setContent(new Intent(this, AboutActivity.class)));
		mTabHost.addTab(mTabHost.newTabSpec(TAB_ACTIVATION).setIndicator(getString(R.string.msg_activation)).setContent(new Intent(this, ActivationInfoActivity.class)));
		mTabHost.addTab(mTabHost.newTabSpec(TAB_CONNECTION).setIndicator(getString(R.string.msg_connection)).setContent(new Intent(this, ConnectionActivity.class)));
		mTabHost.setCurrentTab(0);
	}
}
