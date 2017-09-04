package kr.co.tjeit.lecturemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends BaseActivity {

    private Button signUpBtn;
    private android.widget.EditText idEdt;
    private Button checkDuplBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

        checkDuplBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                중복 여부? => 서버에다가 물어보면 돌아오는 응답으로 체크.
                boolean isIdDupl = true;

                if (isIdDupl) {
//                    아이디가 중복된 상황.
//                    아이디가 중복되었다면,
//                    중복 확인 (제목), 이미 사용중인 아이디입니다. (메세지)
//                    확인 버튼만 있는 경고창 띄워주기.
                }
                else {
//                    아이디가 중복되지 않는 상황.

//                    아이디가 중복되지 않으면,
//                    사용해도 좋은 아이디 입니다. Toast

                }

            }
        });


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SignUpActivity.this, StudentListActivity.class);
                startActivity(myIntent);
                finish();
                LoginActivity.myActivity.finish();
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.signUpBtn = (Button) findViewById(R.id.signUpBtn);
        this.checkDuplBtn = (Button) findViewById(R.id.checkDuplBtn);
        this.idEdt = (EditText) findViewById(R.id.idEdt);
    }
}


