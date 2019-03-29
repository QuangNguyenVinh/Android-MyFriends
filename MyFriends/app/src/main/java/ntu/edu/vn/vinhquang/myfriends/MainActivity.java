package ntu.edu.vn.vinhquang.myfriends;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import ntu.edu.vn.vinhquang.myfriends.models.Friend;
import ntu.edu.vn.vinhquang.myfriends.models.FriendsManager;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    ListView lv;
    ArrayAdapter<Friend> adapter;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addViews();
        addEvents();
    }

    private void addEvents()
    {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                processClick_LVItem(position);
            }
        });
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                processSecondScreen();
            }
        });
    }

    private void processSecondScreen() {
        Intent intent = new Intent(this, FriendDetailActivity.class);
        startActivity(intent);
    }

    private void processClick_LVItem(int position)
    {
        int size = FriendsManager.getInstance().getFriends().size();
        if(position >= 0 && position < size)
        {

            String str = FriendsManager.getInstance().getFriends().get(position).toString();
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        }

    }


    private void addViews()
    {
        fab = findViewById(R.id.fab);
        lv = findViewById(R.id.lvFriends);
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                FriendsManager.getInstance().getFriends());
        lv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
