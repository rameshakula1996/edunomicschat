package com.example.edunomicschat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import java.util.ArrayList;




public class ConversationListActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation_list);
        // Gets the ListView from the View list of the parent activity

        SearchView  searchView= (SearchView) findViewById(R.id.searchView);
        final ArrayList<String> names = new ArrayList<String>();
        names.add("rahul");
        names.add("rakesh");
        names.add("ravali ");
        names.add("ramesh");
        names.add("kranthi");
        names.add("KUmar");
        names.add("Raghava");
        names.add("shubam");
        names.add("nagender");
        names.add("chanakya");

        final ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(names.contains(query)){
                    itemsAdapter.getFilter().filter(query);
                }else{
                    Toast.makeText(ConversationListActivity.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //    adapter.getFilter().filter(newText);
                return false;
            }




        });

    }
}