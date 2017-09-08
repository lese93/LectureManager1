package kr.co.tjeit.lecturemanager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kr.co.tjeit.lecturemanager.data.User;

public class SendMessageActivity extends BaseActivity {

    User mUser;
    private android.widget.TextView receiveUserNameTxt;
    private android.widget.EditText contentEdt;
    private android.widget.Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        mUser = (User) getIntent().getSerializableExtra("student");
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        receiveUserNameTxt.setText(mUser.getName());
    }

    @Override
    public void bindViews() {
        this.sendBtn = (Button) findViewById(R.id.sendBtn);
        this.contentEdt = (EditText) findViewById(R.id.contentEdt);
        this.receiveUserNameTxt = (TextView) findViewById(R.id.receiveUserNameTxt);

    }
}
