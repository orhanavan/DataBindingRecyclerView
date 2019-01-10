package com.peanutbutterapps.databindingrecyclerview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.peanutbutterapps.databindingrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static List<User> localUserList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setHasFixedSize(true);

        prepareList();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, localUserList);
        binding.recyclerView.setAdapter(adapter);
    }

    private void prepareList() {
        localUserList.add(
                new User("Melis Can",
                        "melis_can250@example.com",
                        "http://res.cloudinary.com/brk/image/upload/kadin/161.jpg"));
        localUserList.add(
                new User("Adem Aktaş",
                        "adem_aktas@example.com",
                        "http://res.cloudinary.com/brk/image/upload/erkek/131.jpg"));
        localUserList.add(
                new User("Sezen Kılıç",
                        "kilicsezen@example.com",
                        "http://res.cloudinary.com/brk/image/upload/kadin/126.jpg"));
        localUserList.add(
                new User("Buket Ünal",
                        "unalbuket264@example.com",
                        "http://res.cloudinary.com/brk/image/upload/kadin/154.jpg"));
        localUserList.add(
                new User("Mustafa Yıldırım",
                        "yildirimmustafa507@example.com",
                        "http://res.cloudinary.com/brk/image/upload/erkek/128.jpg"));
        localUserList.add(
                new User("Cansu Ateş",
                        "cansu_ates811@example.com",
                        "http://res.cloudinary.com/brk/image/upload/kadin/173.jpg"));
        localUserList.add(
                new User("Nurbanu Kılıç",
                        "kilicnurbanu697@example.com",
                        "http://res.cloudinary.com/brk/image/upload/kadin/91.jpg"));
        localUserList.add(
                new User("Halil Korkmaz",
                        "korkmazhalil@example.com",
                        "http://res.cloudinary.com/brk/image/upload/erkek/26.jpg"));
        localUserList.add(
                new User("Nil Erdoğan",
                        "erdogannil593@example.com",
                        "http://res.cloudinary.com/brk/image/upload/kadin/78.jpg"));

    }
}
