package com.example.android.retrofit;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    //onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View mRecyclerView = findViewById(R.id.recyclerview);
        LinkedList<String> mWordList;
        WordListAdapter mAdapter = new WordListAdapter(this, mWordList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new
                LinearLayoutManager(this));

        loadWordData();
    }

    //Implement the recyclerview

    public class WordListAdapter
            extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

        public WordListAdapter(Context context,
                               LinkedList<String> wordList) {
            mInflater = LayoutInflater.from(context);
            this.mWordList = wordList;
        }

        @Override
        public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // Create view from layout
            View mItemView = mInflater.inflate(
                    R.layout.wordlist_item, parent, false);
            return new WordViewHolder(mItemView, this);
        }

        @Override
        public void onBindViewHolder(WordViewHolder holder, int position) {
            WordViewHolder holder, int position) {
                // Retrieve the data for that position
                String mCurrent = mWordList.get(position);
                // Add the data to the view
                holder.wordItemView.setText(mCurrent);
        }

        @Override
        public int getItemCount() {
            // Return the number of data items to display
            return mWordList.size();
        }

        class WordViewHolder extends RecyclerView.ViewHolder {

        }
    }

    public WordViewHolder(View itemView, WordListAdapter adapter) {
        super(itemView);
        // Get the layout
        wordItemView = itemView.findViewById(R.id.word);
        // Associate with this adapter
        this.mAdapter = adapter;
        // Add click listener, if desired
        itemView.setOnClickListener(this);
    }

//implement the retrofit to fetch data
    protected void loadWordsData(){
        protected void loadContactsData() {

            /**
             * Checking Internet Connection
             */
            if (InternetConnection.checkConnection(getApplicationContext())) {

                final ProgressDialog dialog;

                /**
                 * Progress Dialog for User Interaction
                 */
                dialog = new ProgressDialog(MainActivity.this);
                dialog.setTitle("Getting JSON data");
                dialog.setMessage("Please wait...");
                dialog.show();

                //Creating an object of our api interface
                ApiService api = RetroClient.getApiService();

                /**
                 * Calling JSON
                 */
                Call<WordList> call = api.getWords();
    }
            /**
             * Enqueue Callback will be call when get response...
             */
            call.enqueue(new Callback<WordList>() {
                @Override
                public void onResponse(Call<WordList> call, Response<WordList> response) {
                    //Dismiss Dialog
                    dialog.dismiss();

                    if(response.isSuccessful()) {

                        /**
                         * Got Successfully
                         */
                        // Log.d("LOGGG", "onResponse: " + response.body().getContacts());
                        contactList = response.body().getContacts();

                        /**
                         * Binding that List to Adapter
                         */
                        RecyclerView recyclerContacts = (RecyclerView) findViewById(R.id.recyclerWords);
                        wordAdapter adapter = new wordAdapter(wordList, MainActivity.this);
                        recyclerContacts.setAdapter(adapter);
                        recyclerContacts.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                        /**
                         * Add listener to every recycler view items
                         */
                        recyclerContacts.addOnItemTouchListener(new CustomRVItemTouchListener(MainActivity.this, recyclerContacts, new RecyclerViewItemClickListener() {
                            @Override
                            public void onClick(View view, int position) {
                                Snackbar.make(findViewById(R.id.layoutMain), "onClick at position : " + position, Snackbar.LENGTH_LONG).show();

                            }

                            @Override
                            public void onLongClick(View view, int position) {
                                Snackbar.make(findViewById(R.id.layoutMain), "onLongClick at position : " + position, Snackbar.LENGTH_LONG).show();
                            }
                        }));

                    } else {
                        Snackbar.make(findViewById(R.id.layoutMain), "Something going wrong!", Snackbar.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call<ContactList> call, Throwable t) {
                    dialog.dismiss();
                }
            });

        } else {
            Snackbar.make(findViewById(R.id.layoutMain), "Check your internet connection!", Snackbar.LENGTH_LONG).show();
        }
    }
    }
}