package kr.co.tjeit.lecturemanager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

import org.json.JSONObject;

import de.hdodenhof.circleimageview.CircleImageView;
import kr.co.tjeit.lecturemanager.util.ContextUtil;

public class MyProfileActivity extends BaseActivity {

    private de.hdodenhof.circleimageview.CircleImageView profileImg;
    private android.widget.TextView nameTxt;
    private android.widget.Button linkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

//        페이스북의 Graph API 이용해서, 더 많은 정보를 불러오기.

        GraphRequest request = GraphRequest.newMeRequest(
                AccessToken.getCurrentAccessToken(),
                new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject object, GraphResponse response) {

                        Log.d("사용자정보", object.toString());

//                      페이스북 페이지 방문 버튼을 누르면
                        linkBtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

//                       이 사람의 페이지로 방문할 수 있도록 설정.
//                                Intent 기능 활용
                            }
                        });

                    }
                }
        );
        Bundle params = new Bundle();
        params.putString("fields", "id,name,link,email");
        request.setParameters(params);
        request.executeAsync();


        nameTxt.setText(ContextUtil.getLoginUser(mContext).getName());

        Glide.with(mContext).load(ContextUtil.getLoginUser(mContext).getProfileURL()).into(profileImg);
    }

    @Override
    public void bindViews() {
        this.linkBtn = (Button) findViewById(R.id.linkBtn);
        this.nameTxt = (TextView) findViewById(R.id.nameTxt);
        this.profileImg = (CircleImageView) findViewById(R.id.profileImg);
    }
}
