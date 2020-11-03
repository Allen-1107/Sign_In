package tech.hisui.sign_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TeacherActivity extends AppCompatActivity {

    private ImageButton ib_num;
    private ImageButton ib_add_class;
    private ImageButton ib_list;

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //绑定布局文件activity_main.xml文件
        setContentView(R.layout.activity_teacher);
        ib_num=(ImageButton) findViewById(R.id.num_sign_in);
        ib_add_class=(ImageButton) findViewById( R.id.add_class);
        ib_list=(ImageButton)findViewById(R.id.list_sign_in);
        ib_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //对于下面的两个参数，分别代表本页面和跳转页面的参数，不过要注意本页面的是用this，要跳转到的页面是class
                if(v==ib_num)
                {
                    Intent intent=new Intent(   TeacherActivity.this,ClassListActivity.class);
                    startActivity(intent);
                }

                if(v==ib_add_class)
                {
                    Intent intent=new Intent(   TeacherActivity.this,AddClassActivity.class);
                    startActivity(intent);
                }

                if(v==ib_list)
                {
                    Intent intent=new Intent(   TeacherActivity.this,LoginActivity.class);
                    startActivity(intent);
                }

            }
        });




    }

}
