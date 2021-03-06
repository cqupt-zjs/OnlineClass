package com.example.onlineclass.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.onlineclass.R;
import com.example.onlineclass.adapter.BestHeadFragmentAdapter;
import com.example.onlineclass.view.pagerindicator.TabPageIndicator;

/**
 * @author anumbrella
 * 
 * @date 2015-9-22 下午7:01:34
 * 
 *       游戏activity
 */
public class BestHeadActivity extends BaseActivity implements OnClickListener {

	private BestHeadFragmentAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sync_tech);
		initView();
		int resId = getIntent().getIntExtra("resId",
				R.drawable.best_head1_pressed);
		iv_title.setImageResource(resId);
		tv_title.setText(getResources().getString(R.string.best_head));
	}

	private void initView() {
		adapter = new BestHeadFragmentAdapter(getSupportFragmentManager(), this);
		ViewPager pager = (ViewPager) findViewById(R.id.pager);
		pager.setAdapter(adapter);
		TabPageIndicator indicator = (TabPageIndicator) findViewById(R.id.indicator);
		indicator.setViewPager(pager);
		iv_title = (ImageView) this.findViewById(R.id.iv_title);
		tv_title = (TextView) this.findViewById(R.id.tv_title);
		btn_back = (Button) this.findViewById(R.id.btn_back);
		btn_home = (Button) this.findViewById(R.id.btn_home);
		btn_search = (Button) this.findViewById(R.id.btn_search);
		btn_back.setOnClickListener(this);
		btn_home.setOnClickListener(this);
		btn_search.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_back:
		case R.id.btn_home:
			finish();
			break;
		case R.id.btn_search:
			break;
		}
	}

}
