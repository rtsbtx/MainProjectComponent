package a.a.mainprojectcomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/main/mainactivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go1(View view){
        ARouter.getInstance().build("/c1/c1activity").navigation();
    }

    public void go2(View view){
        ARouter.getInstance().build("/c2/c2activity").navigation();
    }

}
